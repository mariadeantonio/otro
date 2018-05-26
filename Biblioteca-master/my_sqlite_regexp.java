static void my_sqlite_regexp(sqlite3_context *context, int argc, sqlite3_value **argv) {
	NSUInteger numberOfMatches = 0;
	if (argc == 2) {
		NSString *pattern = [NSString stringWithUTF8String:(const char *)sqlite3_value_text(argv[0])];
		NSString *value   = [NSString stringWithUTF8String:(const char *)sqlite3_value_text(argv[1])];
 
		if (pattern != nil && value != nil) {
			NSError *error = nil;
			// assumes that it is case sensitive. If you need case insensitivity, then prefix your regex with (?i)
			NSRegularExpression *regex = [NSRegularExpression regularExpressionWithPattern:pattern options:kNilOptions error:&error];
			if (regex != nil)
				numberOfMatches = [regex numberOfMatchesInString:value options:0 range:NSMakeRange(0, [value length])];
		}
	}
	sqlite3_result_int(context, (int)numberOfMatches);
}
