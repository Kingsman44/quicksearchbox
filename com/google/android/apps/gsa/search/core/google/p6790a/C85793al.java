package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.al */
/* compiled from: PG */
public final /* synthetic */ class C85793al implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C85799ar f231955a;

    /* renamed from: b */
    public final /* synthetic */ C51303cs f231956b;

    /* renamed from: c */
    public final /* synthetic */ Query f231957c;

    public /* synthetic */ C85793al(C85799ar arVar, C51303cs csVar, Query query) {
        this.f231955a = arVar;
        this.f231956b = csVar;
        this.f231957c = query;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r3 == com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.STANDBY) goto L_0x004b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.search.core.google.a.ar r0 = r5.f231955a
            com.google.assistant.e.i.a.cs r1 = r5.f231956b
            com.google.android.apps.gsa.shared.search.Query r2 = r5.f231957c
            com.google.android.apps.gsa.assistant.settings.features.ad.y r6 = (com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y) r6
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f231983b
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247234dM
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0074
            dagger.a r3 = r0.f231988g
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.google.a.az r3 = (com.google.android.apps.gsa.search.core.google.p6790a.C85807az) r3
            boolean r3 = r3.mo79452a()
            if (r3 != 0) goto L_0x0021
            goto L_0x0074
        L_0x0021:
            dagger.a r3 = r0.f231984c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r3 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r3
            boolean r3 = r3.mo83840z()
            if (r3 == 0) goto L_0x0074
            int r3 = r6.f33886b
            com.google.android.apps.gsa.assistant.settings.features.ad.w r3 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.m24617a(r3)
            if (r3 != 0) goto L_0x0039
            com.google.android.apps.gsa.assistant.settings.features.ad.w r3 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.STANDBY
        L_0x0039:
            com.google.android.apps.gsa.assistant.settings.features.ad.w r4 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.ENABLED
            if (r3 == r4) goto L_0x004b
            int r3 = r6.f33886b
            com.google.android.apps.gsa.assistant.settings.features.ad.w r3 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.m24617a(r3)
            if (r3 != 0) goto L_0x0047
            com.google.android.apps.gsa.assistant.settings.features.ad.w r3 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.STANDBY
        L_0x0047:
            com.google.android.apps.gsa.assistant.settings.features.ad.w r4 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.STANDBY
            if (r3 != r4) goto L_0x0074
        L_0x004b:
            com.google.assistant.e.i.a.dt r6 = com.google.assistant.p3897e.p3917i.p3918a.C51331dt.FULLY_TRUSTED
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0
            com.google.protobuf.ci r2 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133657N
            int r6 = r6.f133647e
            r0.f133665F = r6
            int r6 = r0.f133688b
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r0.f133688b = r6
            com.google.assistant.e.i.a.dh r6 = com.google.assistant.p3897e.p3917i.p3918a.C51319dh.SHOW_RESPONSE_TO_TRUSTED_USER_ALWAYS
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0
            int r6 = r6.f133616c
            r0.f133664E = r6
            int r6 = r0.f133688b
            r6 = r6 | 512(0x200, float:7.175E-43)
            r0.f133688b = r6
            goto L_0x00bb
        L_0x0074:
            int r3 = r6.f33886b
            com.google.android.apps.gsa.assistant.settings.features.ad.w r3 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.m24617a(r3)
            if (r3 != 0) goto L_0x007e
            com.google.android.apps.gsa.assistant.settings.features.ad.w r3 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.STANDBY
        L_0x007e:
            com.google.android.apps.gsa.assistant.settings.features.ad.w r4 = com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w.ENABLED
            if (r3 != r4) goto L_0x00a1
            boolean r6 = r6.f33887c
            if (r6 == 0) goto L_0x00a1
            com.google.android.apps.gsa.search.core.google.a.bi r6 = r0.f231985d
            r0 = 1
            com.google.assistant.e.i.a.dt r6 = r6.mo79463a(r2, r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0
            com.google.protobuf.ci r1 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133657N
            int r6 = r6.f133647e
            r0.f133665F = r6
            int r6 = r0.f133688b
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r0.f133688b = r6
            goto L_0x00bb
        L_0x00a1:
            com.google.android.apps.gsa.search.core.google.a.bi r6 = r0.f231985d
            r0 = 0
            com.google.assistant.e.i.a.dt r6 = r6.mo79463a(r2, r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0
            com.google.protobuf.ci r1 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133657N
            int r6 = r6.f133647e
            r0.f133665F = r6
            int r6 = r0.f133688b
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r0.f133688b = r6
        L_0x00bb:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6790a.C85793al.mo17879a(java.lang.Object):java.lang.Object");
    }
}
