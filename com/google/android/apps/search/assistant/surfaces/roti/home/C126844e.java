package com.google.android.apps.search.assistant.surfaces.roti.home;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.e */
/* compiled from: PG */
public final class C126844e {
    /* JADX WARNING: Can't wrap try/catch for region: R(3:42|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
        throw new com.google.android.apps.search.assistant.surfaces.roti.home.C126849j("Invalid URI Syntax in Open Provider Args.", com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0080 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m207519a(com.google.assistant.p3897e.p3921j.C51809dy r4) {
        /*
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "open_provider_args"
            com.google.assistant.e.j.ada r1 = com.google.assistant.p3897e.p3921j.ada.f134865f     // Catch:{ ct -> 0x00a8 }
            com.google.protobuf.eb r1 = r1.getParserForType()     // Catch:{ ct -> 0x00a8 }
            j$.util.Optional r4 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64585c(r4, r0, r1)     // Catch:{ ct -> 0x00a8 }
            boolean r0 = r4.isEmpty()     // Catch:{ ct -> 0x00a8 }
            if (r0 != 0) goto L_0x009e
            java.lang.Object r4 = r4.get()     // Catch:{ ct -> 0x00a8 }
            com.google.assistant.e.j.ada r4 = (com.google.assistant.p3897e.p3921j.ada) r4     // Catch:{ ct -> 0x00a8 }
            com.google.assistant.e.c.c.gh r0 = r4.f134868b     // Catch:{ ct -> 0x00a8 }
            if (r0 != 0) goto L_0x0020
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ ct -> 0x00a8 }
        L_0x0020:
            int r1 = r0.f133012b     // Catch:{ ct -> 0x00a8 }
            r2 = 1
            if (r1 != r2) goto L_0x002a
            java.lang.Object r0 = r0.f133013c     // Catch:{ ct -> 0x00a8 }
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0     // Catch:{ ct -> 0x00a8 }
            goto L_0x002c
        L_0x002a:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ ct -> 0x00a8 }
        L_0x002c:
            int r0 = r0.f132943a     // Catch:{ ct -> 0x00a8 }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0094
            com.google.assistant.e.c.c.gh r0 = r4.f134868b     // Catch:{ ct -> 0x00a8 }
            if (r0 != 0) goto L_0x0038
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ ct -> 0x00a8 }
        L_0x0038:
            int r1 = r0.f133012b     // Catch:{ ct -> 0x00a8 }
            if (r1 != r2) goto L_0x0041
            java.lang.Object r0 = r0.f133013c     // Catch:{ ct -> 0x00a8 }
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0     // Catch:{ ct -> 0x00a8 }
            goto L_0x0043
        L_0x0041:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ ct -> 0x00a8 }
        L_0x0043:
            java.lang.String r0 = r0.f132949g     // Catch:{ ct -> 0x00a8 }
            boolean r1 = r0.isEmpty()     // Catch:{ ct -> 0x00a8 }
            if (r1 != 0) goto L_0x008a
            r1 = 0
            android.content.Intent r0 = android.content.Intent.parseUri(r0, r1)     // Catch:{ URISyntaxException -> 0x0080 }
            com.google.assistant.e.c.c.gh r1 = r4.f134868b     // Catch:{ URISyntaxException -> 0x0080 }
            if (r1 != 0) goto L_0x0056
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ URISyntaxException -> 0x0080 }
        L_0x0056:
            int r3 = r1.f133012b     // Catch:{ URISyntaxException -> 0x0080 }
            if (r3 != r2) goto L_0x005f
            java.lang.Object r1 = r1.f133013c     // Catch:{ URISyntaxException -> 0x0080 }
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1     // Catch:{ URISyntaxException -> 0x0080 }
            goto L_0x0061
        L_0x005f:
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ URISyntaxException -> 0x0080 }
        L_0x0061:
            java.lang.String r1 = r1.f132944b     // Catch:{ URISyntaxException -> 0x0080 }
            boolean r1 = r1.isEmpty()     // Catch:{ URISyntaxException -> 0x0080 }
            if (r1 != 0) goto L_0x007f
            com.google.assistant.e.c.c.gh r4 = r4.f134868b     // Catch:{ URISyntaxException -> 0x0080 }
            if (r4 != 0) goto L_0x006f
            com.google.assistant.e.c.c.gh r4 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e     // Catch:{ URISyntaxException -> 0x0080 }
        L_0x006f:
            int r1 = r4.f133012b     // Catch:{ URISyntaxException -> 0x0080 }
            if (r1 != r2) goto L_0x0078
            java.lang.Object r4 = r4.f133013c     // Catch:{ URISyntaxException -> 0x0080 }
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4     // Catch:{ URISyntaxException -> 0x0080 }
            goto L_0x007a
        L_0x0078:
            com.google.assistant.e.c.c.ev r4 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o     // Catch:{ URISyntaxException -> 0x0080 }
        L_0x007a:
            java.lang.String r4 = r4.f132944b     // Catch:{ URISyntaxException -> 0x0080 }
            r0.setPackage(r4)     // Catch:{ URISyntaxException -> 0x0080 }
        L_0x007f:
            return r0
        L_0x0080:
            com.google.android.apps.search.assistant.surfaces.roti.home.j r4 = new com.google.android.apps.search.assistant.surfaces.roti.home.j     // Catch:{ ct -> 0x00a8 }
            java.lang.String r0 = "Invalid URI Syntax in Open Provider Args."
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ ct -> 0x00a8 }
            r4.<init>(r0, r1)     // Catch:{ ct -> 0x00a8 }
            throw r4     // Catch:{ ct -> 0x00a8 }
        L_0x008a:
            com.google.android.apps.search.assistant.surfaces.roti.home.j r4 = new com.google.android.apps.search.assistant.surfaces.roti.home.j     // Catch:{ ct -> 0x00a8 }
            java.lang.String r0 = "Intent URI is empty in Open Provider Args."
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ ct -> 0x00a8 }
            r4.<init>(r0, r1)     // Catch:{ ct -> 0x00a8 }
            throw r4     // Catch:{ ct -> 0x00a8 }
        L_0x0094:
            com.google.android.apps.search.assistant.surfaces.roti.home.j r4 = new com.google.android.apps.search.assistant.surfaces.roti.home.j     // Catch:{ ct -> 0x00a8 }
            java.lang.String r0 = "Android Intent is not present in Open Provider Args."
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ ct -> 0x00a8 }
            r4.<init>(r0, r1)     // Catch:{ ct -> 0x00a8 }
            throw r4     // Catch:{ ct -> 0x00a8 }
        L_0x009e:
            com.google.android.apps.search.assistant.surfaces.roti.home.j r4 = new com.google.android.apps.search.assistant.surfaces.roti.home.j     // Catch:{ ct -> 0x00a8 }
            java.lang.String r0 = "Open Provider Args are not present or invalid."
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT     // Catch:{ ct -> 0x00a8 }
            r4.<init>(r0, r1)     // Catch:{ ct -> 0x00a8 }
            throw r4     // Catch:{ ct -> 0x00a8 }
        L_0x00a8:
            r4 = move-exception
            com.google.android.apps.search.assistant.surfaces.roti.home.j r0 = new com.google.android.apps.search.assistant.surfaces.roti.home.j
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = m207520b(r4)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            r0.<init>(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.roti.home.C126844e.m207519a(com.google.assistant.e.j.dy):android.content.Intent");
    }

    /* renamed from: b */
    public static String m207520b(String str) {
        return str != null ? str : "Invalid Proto Buffer";
    }
}
