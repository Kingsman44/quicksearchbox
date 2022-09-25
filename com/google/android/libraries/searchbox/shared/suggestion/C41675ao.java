package com.google.android.libraries.searchbox.shared.suggestion;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.ao */
/* compiled from: PG */
public class C41675ao {

    /* renamed from: a */
    private static final String[] f108994a = {"www.", "www1.", "www2.", "m."};

    /* renamed from: I */
    public static String m73089I(Suggestion suggestion) {
        C41691q qVar = suggestion.f108907B.f109012f;
        if (qVar == null) {
            qVar = C41691q.f109047e;
        }
        if ((qVar.f109049a & 2) != 0) {
            return C41670aj.m73082o(suggestion);
        }
        return null;
    }

    /* renamed from: J */
    public static String m73090J(Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        if ((eVar.f109007a & 2) == 0) {
            return null;
        }
        C41663ac acVar = eVar.f109008b;
        if (acVar == null) {
            acVar = C41663ac.f108934g;
        }
        if (acVar.f108937b == 3) {
            return C41670aj.m73072e(suggestion);
        }
        return null;
    }

    /* renamed from: K */
    public static String m73091K(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        if ((sVar.f109055a & 1) != 0) {
            return C41670aj.m73073f(suggestion);
        }
        return null;
    }

    /* renamed from: L */
    public static String m73092L(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        if ((sVar.f109055a & 2) != 0) {
            return C41670aj.m73074g(suggestion);
        }
        return null;
    }

    /* renamed from: M */
    public static String m73093M(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        if ((sVar.f109055a & 4) != 0) {
            return C41670aj.m73075h(suggestion);
        }
        return null;
    }

    /* renamed from: N */
    public static String m73094N(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        if ((sVar.f109055a & 32) != 0) {
            return C41670aj.m73077j(suggestion);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d A[EDGE_INSN: B:34:0x005d->B:24:0x005d ?: BREAK  , SYNTHETIC] */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m73095O(java.lang.String r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0007
            return r11
        L_0x0007:
            java.lang.String r0 = "://"
            int r1 = r11.indexOf(r0)
            java.lang.String r2 = "https"
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r1 != r3) goto L_0x0023
            java.lang.String r1 = "http://"
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r1.concat(r11)
            r1 = 7
            r3 = 0
        L_0x0021:
            r7 = 4
            goto L_0x0034
        L_0x0023:
            int r3 = r1 + 3
            r7 = 5
            if (r1 != r7) goto L_0x0031
            boolean r1 = r11.startsWith(r2)
            if (r1 == 0) goto L_0x0032
            r1 = r3
            r3 = 1
            goto L_0x0021
        L_0x0031:
            r7 = r1
        L_0x0032:
            r1 = r3
            r3 = 0
        L_0x0034:
            java.lang.String r8 = "http"
            boolean r8 = r11.startsWith(r8)
            if (r8 != 0) goto L_0x0042
            boolean r2 = r11.startsWith(r2)
            if (r2 == 0) goto L_0x005d
        L_0x0042:
            java.lang.String[] r2 = f108994a
            r8 = 0
        L_0x0045:
            if (r8 >= r4) goto L_0x005d
            r9 = r2[r8]
            int r10 = r9.length()
            boolean r10 = r11.regionMatches(r1, r9, r6, r10)
            if (r10 == 0) goto L_0x005a
            int r2 = r9.length()
            int r1 = r1 + r2
            r3 = 1
            goto L_0x005d
        L_0x005a:
            int r8 = r8 + 1
            goto L_0x0045
        L_0x005d:
            int r2 = r11.length()
            int r4 = r2 + -1
            char r8 = r11.charAt(r4)
            r9 = 47
            if (r8 != r9) goto L_0x006f
            if (r1 >= r4) goto L_0x006f
            r2 = r4
            goto L_0x0070
        L_0x006f:
            r5 = r3
        L_0x0070:
            if (r5 != 0) goto L_0x0073
            return r11
        L_0x0073:
            java.lang.String r3 = r11.substring(r6, r7)
            java.lang.String r11 = r11.substring(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.searchbox.shared.suggestion.C41675ao.m73095O(java.lang.String):java.lang.String");
    }
}
