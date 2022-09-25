package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.k */
/* compiled from: PG */
public final /* synthetic */ class C113632k implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ OfflineSubController f314664a;

    /* renamed from: b */
    public final /* synthetic */ String f314665b;

    /* renamed from: c */
    public final /* synthetic */ String f314666c;

    public /* synthetic */ C113632k(OfflineSubController offlineSubController, String str, String str2) {
        this.f314664a = offlineSubController;
        this.f314665b = str;
        this.f314666c = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        if (r5 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        r4 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.OfflineSubController r0 = r10.f314664a
            java.lang.String r1 = r10.f314665b
            java.lang.String r2 = r10.f314666c
            java.lang.Class<com.google.android.libraries.gsa.k.c.a> r3 = com.google.android.libraries.gsa.p1876k.p1879c.C22865a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r3)
            boolean r3 = androidx.core.p094f.C1888a.m5149c()
            r4 = 0
            if (r3 == 0) goto L_0x00b6
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            java.lang.String r1 = r1.getLanguage()
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r2)
            java.lang.String r2 = r2.getLanguage()
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r2)
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.af r0 = r0.f314600d
            boolean r3 = androidx.core.p094f.C1888a.m5149c()
            if (r3 == 0) goto L_0x0045
            android.content.Context r0 = r0.f314626a
            java.lang.Class<android.view.translation.TranslationManager> r3 = android.view.translation.TranslationManager.class
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.translation.TranslationManager r0 = (android.view.translation.TranslationManager) r0
            if (r0 == 0) goto L_0x0045
            r3 = 1000(0x3e8, float:1.401E-42)
            java.util.Set r0 = r0.getOnDeviceTranslationCapabilities(r3, r3)
            goto L_0x0047
        L_0x0045:
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
        L_0x0047:
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r5 = 0
        L_0x004d:
            boolean r6 = r0.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x00b1
            java.lang.Object r6 = r0.next()
            android.view.translation.TranslationCapability r6 = (android.view.translation.TranslationCapability) r6
            int r8 = r6.getState()
            r9 = 3
            if (r8 != r9) goto L_0x004d
            android.view.translation.TranslationSpec r8 = r6.getSourceSpec()
            android.icu.util.ULocale r8 = r8.getLocale()
            java.util.Locale r8 = r8.toLocale()
            android.view.translation.TranslationSpec r6 = r6.getTargetSpec()
            android.icu.util.ULocale r6 = r6.getLocale()
            java.util.Locale r6 = r6.toLocale()
            boolean r9 = r1.equals(r8)
            if (r9 == 0) goto L_0x0085
            boolean r9 = r2.equals(r6)
            if (r9 != 0) goto L_0x00b5
        L_0x0085:
            boolean r9 = r1.equals(r6)
            if (r9 == 0) goto L_0x0092
            boolean r9 = r2.equals(r8)
            if (r9 == 0) goto L_0x0092
            goto L_0x00b5
        L_0x0092:
            java.util.Locale r7 = java.util.Locale.ENGLISH
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x00a5
            java.util.Locale r7 = java.util.Locale.ENGLISH
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00a3
            goto L_0x00a6
        L_0x00a3:
            r8 = 0
            goto L_0x00a6
        L_0x00a5:
            r8 = r6
        L_0x00a6:
            boolean r6 = r1.equals(r8)
            r3 = r3 | r6
            boolean r6 = r2.equals(r8)
            r5 = r5 | r6
            goto L_0x004d
        L_0x00b1:
            if (r3 == 0) goto L_0x00b6
            if (r5 == 0) goto L_0x00b6
        L_0x00b5:
            r4 = 1
        L_0x00b6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.translator.offline.C113632k.mo17947a():java.lang.Object");
    }
}
