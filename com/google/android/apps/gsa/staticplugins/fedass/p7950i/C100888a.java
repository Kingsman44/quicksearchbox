package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.p395al.p408c.p414c.p416b.C8476as;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.a */
/* compiled from: PG */
final class C100888a extends C100907as {

    /* renamed from: a */
    public final String f281879a;

    /* renamed from: b */
    public final C8476as f281880b;

    public C100888a(String str, C8476as asVar) {
        if (str != null) {
            this.f281879a = str;
            this.f281880b = asVar;
            return;
        }
        throw new NullPointerException("Null languagePackDir");
    }

    /* renamed from: a */
    public final C8476as mo92079a() {
        return this.f281880b;
    }

    /* renamed from: b */
    public final String mo92080b() {
        return this.f281879a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f281880b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100907as
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.gsa.staticplugins.fedass.i.as r5 = (com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100907as) r5
            java.lang.String r1 = r4.f281879a
            java.lang.String r3 = r5.mo92080b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.al.c.c.b.as r1 = r4.f281880b
            if (r1 != 0) goto L_0x0022
            com.google.al.c.c.b.as r5 = r5.mo92079a()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.al.c.c.b.as r5 = r5.mo92079a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100888a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f281879a.hashCode() ^ 1000003) * 1000003;
        C8476as asVar = this.f281880b;
        if (asVar == null) {
            i = 0;
        } else {
            i = asVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f281879a;
        String valueOf = String.valueOf(this.f281880b);
        return "SodaLanguagePackDetails{languagePackDir=" + str + ", languagePackMetadata=" + valueOf + "}";
    }
}
