package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.shared.util.p7159c.C90878al;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.eb */
/* compiled from: PG */
final class C118222eb extends C90878al {

    /* renamed from: a */
    final /* synthetic */ String f328196a;

    /* renamed from: b */
    final /* synthetic */ String f328197b;

    /* renamed from: c */
    final /* synthetic */ Map f328198c;

    /* renamed from: d */
    final /* synthetic */ C68214a f328199d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118222eb(String str, String str2, Map map, C68214a aVar) {
        super("Intercept request", 1, 4);
        this.f328196a = str;
        this.f328197b = str2;
        this.f328198c = map;
        this.f328199d = aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C60870cx apply(java.lang.Object r5) {
        /*
            r4 = this;
            com.google.android.apps.gsa.x.c r5 = (com.google.android.apps.gsa.p8883x.C118826c) r5
            java.lang.String r5 = r4.f328196a
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case 70454: goto L_0x002d;
                case 79599: goto L_0x0023;
                case 2213344: goto L_0x0019;
                case 2461856: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0037
        L_0x000f:
            java.lang.String r0 = "POST"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            r0 = 2
            goto L_0x0038
        L_0x0019:
            java.lang.String r0 = "HEAD"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0023:
            java.lang.String r0 = "PUT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            r0 = 3
            goto L_0x0038
        L_0x002d:
            java.lang.String r0 = "GET"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0038
        L_0x0037:
            r0 = -1
        L_0x0038:
            if (r0 == 0) goto L_0x0068
            if (r0 == r3) goto L_0x0063
            if (r0 == r2) goto L_0x005e
            if (r0 != r1) goto L_0x0045
            com.google.android.apps.gsa.shared.aa.aq r5 = com.google.android.apps.gsa.shared.p6968aa.C89020ar.m144760e()
            goto L_0x006c
        L_0x0045:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method ["
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = "] is not supported."
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x005e:
            com.google.android.apps.gsa.shared.aa.aq r5 = com.google.android.apps.gsa.shared.p6968aa.C89020ar.m144759d()
            goto L_0x006c
        L_0x0063:
            com.google.android.apps.gsa.shared.aa.aq r5 = com.google.android.apps.gsa.shared.p6968aa.C89020ar.m144757b()
            goto L_0x006c
        L_0x0068:
            com.google.android.apps.gsa.shared.aa.aq r5 = com.google.android.apps.gsa.shared.p6968aa.C89020ar.m144756a()
        L_0x006c:
            java.lang.String r0 = r4.f328197b
            r5.mo82994f(r0)
            r0 = 46
            r5.f241245k = r0
            java.util.Map r0 = r4.f328198c
            r5.mo82991c(r0)
            com.google.android.apps.gsa.shared.aa.ar r5 = r5.mo82989a()
            dagger.a r0 = r4.f328199d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.aa.aj r0 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r0
            com.google.android.apps.gsa.shared.aa.x r1 = com.google.android.apps.gsa.shared.p6968aa.C89009ag.f241207b
            dagger.a r2 = r4.f328199d
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.aa.aj r2 = (com.google.android.apps.gsa.shared.p6968aa.C89012aj) r2
            com.google.android.apps.gsa.shared.aa.v r3 = com.google.android.apps.gsa.shared.p6968aa.C89066v.f241382a
            com.google.android.apps.gsa.shared.aa.q r2 = r2.mo27510b(r3)
            com.google.common.util.concurrent.cx r5 = r0.mo27496g(r5, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.webview.C118222eb.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
