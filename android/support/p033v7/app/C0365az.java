package android.support.p033v7.app;

/* renamed from: android.support.v7.app.az */
/* compiled from: PG */
final class C0365az {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r3 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        if (r3 == null) goto L_0x0052;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m1142a(android.content.Context r8) {
        /*
            java.lang.String r0 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r8.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x0070 }
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x004a }
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch:{ IOException | XmlPullParserException -> 0x004a }
            int r5 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004a }
        L_0x0017:
            int r6 = r4.next()     // Catch:{ IOException | XmlPullParserException -> 0x004a }
            r7 = 1
            if (r6 == r7) goto L_0x0040
            r7 = 3
            if (r6 != r7) goto L_0x0028
            int r6 = r4.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004a }
            if (r6 <= r5) goto L_0x0040
            r6 = 3
        L_0x0028:
            if (r6 == r7) goto L_0x0017
            r7 = 4
            if (r6 == r7) goto L_0x0017
            java.lang.String r6 = r4.getName()     // Catch:{ IOException | XmlPullParserException -> 0x004a }
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x004a }
            if (r6 == 0) goto L_0x0017
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch:{ IOException | XmlPullParserException -> 0x004a }
        L_0x0040:
            if (r3 == 0) goto L_0x0052
        L_0x0042:
            r3.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0052
        L_0x0046:
            goto L_0x0052
        L_0x0048:
            r8 = move-exception
            goto L_0x006a
        L_0x004a:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0052
            goto L_0x0042
        L_0x0052:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0066
            java.lang.String r8 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r8 = r8.concat(r0)
            android.util.Log.d(r1, r8)
            goto L_0x0069
        L_0x0066:
            r8.deleteFile(r0)
        L_0x0069:
            return r2
        L_0x006a:
            if (r3 == 0) goto L_0x006f
            r3.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            throw r8
        L_0x0070:
            java.lang.String r8 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0365az.m1142a(android.content.Context):java.lang.String");
    }
}
