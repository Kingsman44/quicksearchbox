package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.g.d */
/* compiled from: PG */
public final /* synthetic */ class C76893d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76895f f212338a;

    /* renamed from: b */
    public final /* synthetic */ C76590bg f212339b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f212340c;

    public /* synthetic */ C76893d(C76895f fVar, C76590bg bgVar, C74965n nVar) {
        this.f212338a = fVar;
        this.f212339b = bgVar;
        this.f212340c = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r13 = this;
            com.google.android.apps.gsa.nga.engine.o.e.b.g.f r0 = r13.f212338a
            com.google.android.apps.gsa.nga.engine.o.c.bg r1 = r13.f212339b
            com.google.android.apps.gsa.nga.engine.am.u.n r2 = r13.f212340c
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "action"
            r6 = 0
            r4[r6] = r5
            com.google.android.apps.gsa.nga.engine.o.c.ah r5 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r4 = r1.mo72265g(r5, r4)
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String r7 = "title"
            r5[r6] = r7
            com.google.android.apps.gsa.nga.engine.o.c.ah r7 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r1 = r1.mo72265g(r7, r5)
            android.content.Context r5 = r0.f212343b
            int r5 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g.C76890a.m123509a(r5)
            if (r5 >= 0) goto L_0x0046
            com.google.android.apps.gsa.nga.shared.v.f r0 = r0.f212344c
            com.google.android.apps.gsa.nga.shared.v.io r1 = r2.mo71336k()
            com.google.android.apps.gsa.nga.shared.v.d.ce r2 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce.SUPPORTED_APPLICATION_NOT_FOUND
            com.google.android.apps.gsa.nga.shared.v.e r3 = com.google.android.apps.gsa.nga.shared.p6407v.C83044e.f226656a
            r0.mo76648a(r1, r2, r3)
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g.C76895f.f212342a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "recorder not installed"
            r2 = 3790(0xece, float:5.311E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.nga.shared.aa.e.n r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n.f220656k
            goto L_0x0126
        L_0x0046:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x005d
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g.C76895f.f212342a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "voice command action is empty"
            r2 = 3789(0xecd, float:5.31E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.nga.shared.aa.e.n r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n.f220656k
            goto L_0x0126
        L_0x005d:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            com.google.android.apps.gsa.nga.shared.aa.e.n r8 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n.f220656k
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.e.l r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.e.n r9 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r9
            r9.f220663f = r3
            java.lang.Object r9 = r4.get()
            java.lang.String r9 = (java.lang.String) r9
            int r10 = r9.hashCode()
            r11 = 3522941(0x35c17d, float:4.936692E-39)
            r12 = 2
            if (r10 == r11) goto L_0x00a2
            r11 = 3540994(0x360802, float:4.96199E-39)
            if (r10 == r11) goto L_0x0098
            r11 = 109757538(0x68ac462, float:5.219839E-35)
            if (r10 == r11) goto L_0x008e
            goto L_0x00ac
        L_0x008e:
            java.lang.String r10 = "start"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00ac
            r9 = 0
            goto L_0x00ad
        L_0x0098:
            java.lang.String r10 = "stop"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00ac
            r9 = 1
            goto L_0x00ad
        L_0x00a2:
            java.lang.String r10 = "save"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00ac
            r9 = 2
            goto L_0x00ad
        L_0x00ac:
            r9 = -1
        L_0x00ad:
            if (r9 == 0) goto L_0x00d5
            if (r9 == r3) goto L_0x00c7
            if (r9 == r12) goto L_0x00c7
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g.C76895f.f212342a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.Object r1 = r4.get()
            r2 = 3788(0xecc, float:5.308E-42)
            java.lang.String r3 = "unsupported action: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r2)).mo56389s(r3, r1)
            com.google.android.apps.gsa.nga.shared.aa.e.n r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n.f220656k
            goto L_0x0126
        L_0x00c7:
            java.lang.String r0 = "com.google.android.apps.recorder.VOICE_COMMAND_STOP_RECORDING"
            r7.setAction(r0)
            com.google.android.apps.gsa.nga.engine.o.e.b.g.e r0 = new com.google.android.apps.gsa.nga.engine.o.e.b.g.e
            r0.<init>(r7)
            r1.ifPresent(r0)
            goto L_0x00f8
        L_0x00d5:
            java.lang.String r1 = "com.google.android.apps.recorder.VOICE_COMMAND_START_RECORDING"
            r7.setAction(r1)
            com.google.android.apps.gsa.nga.engine.ag.be r1 = r0.f212346e
            boolean r1 = r1.mo71218c()
            if (r1 == 0) goto L_0x00f8
            com.google.android.apps.gsa.nga.shared.u.c r0 = r0.f212345d
            java.util.Locale r1 = r2.mo71342q()
            r3 = 2132089775(0x7f151baf, float:1.9819871E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            com.google.android.apps.gsa.nga.shared.u.d r0 = r0.mo75122b(r1, r3, r4)
            com.google.assistant.e.j.dy r0 = com.google.android.apps.gsa.nga.engine.am.t.d(r0)
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129557s(r8, r0)
        L_0x00f8:
            java.lang.String r0 = "com.google.android.apps.recorder"
            r7.setPackage(r0)
            int r0 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g.C76890a.m123510b(r5)
            com.google.android.apps.gsa.nga.shared.v.io r1 = r2.mo71336k()
            com.google.assistant.e.j.dy r0 = com.google.android.apps.gsa.nga.engine.am.t.u(r7, r0, r1, r6, r6)
            com.google.android.apps.gsa.nga.shared.p6358n.C81442m.m129557s(r8, r0)
            r0 = 101890(0x18e02, float:1.42778E-40)
            r8.mo74319k(r0)
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.e.n r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r0
            r1 = 3
            int r1 = com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p.m128150a(r1)
            r0.f220664g = r1
            com.google.protobuf.bv r0 = r8.build()
            com.google.android.apps.gsa.nga.shared.aa.e.n r0 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n) r0
        L_0x0126:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g.C76893d.mo17947a():java.lang.Object");
    }
}
