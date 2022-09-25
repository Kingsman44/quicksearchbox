package com.google.android.libraries.assistant.auto.tng.p984g.p985a.p986a.p987a;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.g.a.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C13564c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13564c f41550a = new C13564c();

    private /* synthetic */ C13564c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.libraries.assistant.auto.tng.g.a.a.b r8 = (com.google.android.libraries.assistant.auto.tng.p984g.p985a.p986a.C13568b) r8
            int r0 = r8.f41561a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x000c
            java.lang.String r8 = r8.f41562b
            goto L_0x00da
        L_0x000c:
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            int r3 = r2.length()
            r4 = 0
            if (r3 <= 0) goto L_0x0032
            char r3 = r2.charAt(r4)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 == 0) goto L_0x002c
            r0.append(r2)
            goto L_0x0037
        L_0x002c:
            java.lang.String r2 = "10.0"
            r0.append(r2)
            goto L_0x0037
        L_0x0032:
            java.lang.String r2 = "1.0"
            r0.append(r2)
        L_0x0037:
            java.lang.String r2 = "; "
            r0.append(r2)
            java.lang.String r2 = r8.getLanguage()
            if (r2 == 0) goto L_0x009a
            int r3 = r2.hashCode()
            r5 = 3365(0xd25, float:4.715E-42)
            r6 = 2
            if (r3 == r5) goto L_0x0068
            r5 = 3374(0xd2e, float:4.728E-42)
            if (r3 == r5) goto L_0x005e
            r5 = 3391(0xd3f, float:4.752E-42)
            if (r3 == r5) goto L_0x0054
            goto L_0x0072
        L_0x0054:
            java.lang.String r3 = "ji"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0072
            r3 = 2
            goto L_0x0073
        L_0x005e:
            java.lang.String r3 = "iw"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0073
        L_0x0068:
            java.lang.String r3 = "in"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0072
            r3 = 1
            goto L_0x0073
        L_0x0072:
            r3 = -1
        L_0x0073:
            if (r3 == 0) goto L_0x0080
            if (r3 == r1) goto L_0x007d
            if (r3 == r6) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            java.lang.String r2 = "yi"
            goto L_0x0082
        L_0x007d:
            java.lang.String r2 = "id"
            goto L_0x0082
        L_0x0080:
            java.lang.String r2 = "he"
        L_0x0082:
            r0.append(r2)
            java.lang.String r8 = r8.getCountry()
            if (r8 == 0) goto L_0x009f
            java.lang.String r2 = "-"
            r0.append(r2)
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r8 = r8.toLowerCase(r2)
            r0.append(r8)
            goto L_0x009f
        L_0x009a:
            java.lang.String r8 = "en"
            r0.append(r8)
        L_0x009f:
            java.lang.String r8 = ";"
            r0.append(r8)
            java.lang.String r8 = "REL"
            java.lang.String r2 = android.os.Build.VERSION.CODENAME
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x00be
            java.lang.String r8 = android.os.Build.MODEL
            int r2 = r8.length()
            if (r2 <= 0) goto L_0x00be
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r8)
        L_0x00be:
            java.lang.String r8 = android.os.Build.ID
            int r2 = r8.length()
            if (r2 <= 0) goto L_0x00ce
            java.lang.String r2 = " Build/"
            r0.append(r2)
            r0.append(r8)
        L_0x00ce:
            java.util.Locale r8 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            java.lang.String r0 = "Mozilla/5.0 (Linux; Android %s; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Mobile Safari/537.36"
            java.lang.String r8 = java.lang.String.format(r8, r0, r1)
        L_0x00da:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p984g.p985a.p986a.p987a.C13564c.apply(java.lang.Object):java.lang.Object");
    }
}
