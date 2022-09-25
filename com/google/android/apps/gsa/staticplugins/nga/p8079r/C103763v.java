package com.google.android.apps.gsa.staticplugins.nga.p8079r;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80456d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80457e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80466n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83619ah;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83629ar;
import com.google.android.apps.gsa.search.core.p6519al.p6594bj.C84874a;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88050nh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88051ni;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88052nj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88053nk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88414al;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88417ao;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103330ak;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58852bp;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5129p.p5131b.C65819cw;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.v */
/* compiled from: PG */
public final class C103763v implements C86686h {

    /* renamed from: a */
    public static final C58974d f288927a = C58974d.m91136j();

    /* renamed from: c */
    public C86697a f288928c;

    /* renamed from: d */
    private final C84874a f288929d;

    /* renamed from: e */
    private final C22871g f288930e;

    /* renamed from: f */
    private final C103649c f288931f;

    /* renamed from: g */
    private final C68214a f288932g;

    /* renamed from: h */
    private final long f288933h;

    /* renamed from: i */
    private final Map f288934i;

    /* renamed from: j */
    private final C68214a f288935j;

    /* renamed from: k */
    private final C68214a f288936k;

    /* renamed from: l */
    private final C83334w f288937l;

    public C103763v(C84874a aVar, C22871g gVar, C103649c cVar, long j, Map map, C68214a aVar2, C68214a aVar3, C68214a aVar4, C83334w wVar) {
        this.f288929d = aVar;
        this.f288930e = gVar;
        this.f288931f = cVar;
        this.f288933h = j;
        this.f288934i = map;
        this.f288932g = aVar2;
        this.f288935j = aVar3;
        this.f288936k = aVar4;
        this.f288937l = wVar;
    }

    /* renamed from: q */
    private static C58833ax m171726q(ClientEventData clientEventData) {
        return clientEventData.mo81913d(Bundle.class) ? C58833ax.m90833j(C90772bp.m148299g((Bundle) clientEventData.mo81912b(Bundle.class))) : C58836b.f156633a;
    }

    /* renamed from: r */
    private final void m171727r(C58852bp bpVar) {
        C83619ah ahVar = (C83619ah) C83629ar.f227979f.createBuilder();
        ahVar.copyOnWrite();
        C83629ar arVar = (C83629ar) ahVar.instance;
        arVar.f227984d = 1;
        arVar.f227981a = 1 | arVar.f227981a;
        long j = this.f288933h;
        ahVar.copyOnWrite();
        C83629ar arVar2 = (C83629ar) ahVar.instance;
        arVar2.f227981a |= 2;
        arVar2.f227985e = j;
        bpVar.mo40846a(ahVar);
        C83334w wVar = this.f288937l;
        C82887ec ecVar = C82887ec.SEARCH_SESSION_LIFECYCLE;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C83629ar arVar3 = (C83629ar) ahVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        arVar3.getClass();
        eaVar.f225980b = arVar3;
        eaVar.f225979a = 89;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
    }

    /* renamed from: a */
    public final void mo93829a(C80456d dVar) {
        C87684al alVar = new C87684al(C88244um.GET_EMAIL_THREADS);
        alVar.mo81965b(C80457e.f220823a, dVar);
        mo93833o(alVar.mo81964a());
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: c */
    public final void mo93830c(C65819cw cwVar) {
        C87684al alVar = new C87684al(C88244um.HANDLE_DEEPLINK_DONE);
        alVar.mo81965b(C88050nh.f238088a, cwVar);
        mo93833o(alVar.mo81964a());
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0273  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80293f(long r17, com.google.android.apps.gsa.search.shared.service.ClientEventData r19, com.google.android.apps.gsa.search.core.service.p6848e.C86681c r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r1.f236955a
            int r3 = r3.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r1.f236955a
            int r3 = r3.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r3)
            if (r3 != 0) goto L_0x0018
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x0018:
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.NGA_CLIENT_EVENT
            if (r3 != r4) goto L_0x0203
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88045nc.f238080a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r1.f236955a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 == 0) goto L_0x0203
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88045nc.f238080a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r1.f236955a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r5 = r3.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x0049
            java.lang.Object r3 = r3.f169969b
            goto L_0x004d
        L_0x0049:
            java.lang.Object r3 = r3.mo58889c(r4)
        L_0x004d:
            com.google.android.apps.gsa.search.shared.service.b.ne r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88047ne) r3
            int r4 = r3.f238083a
            r5 = 0
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = 2
            r11 = 19
            r12 = 13
            r13 = 1
            r14 = 3
            r15 = 7
            if (r4 == 0) goto L_0x0081
            if (r4 == r14) goto L_0x007f
            if (r4 == r15) goto L_0x007d
            if (r4 == r12) goto L_0x007b
            r14 = 18
            if (r4 == r14) goto L_0x0079
            if (r4 == r11) goto L_0x0076
            switch(r4) {
                case 9: goto L_0x0074;
                case 10: goto L_0x0072;
                case 11: goto L_0x0070;
                default: goto L_0x006e;
            }
        L_0x006e:
            r14 = 0
            goto L_0x0083
        L_0x0070:
            r14 = 5
            goto L_0x0083
        L_0x0072:
            r14 = 4
            goto L_0x0083
        L_0x0074:
            r14 = 3
            goto L_0x0083
        L_0x0076:
            r14 = 8
            goto L_0x0083
        L_0x0079:
            r14 = 7
            goto L_0x0083
        L_0x007b:
            r14 = 6
            goto L_0x0083
        L_0x007d:
            r14 = 2
            goto L_0x0083
        L_0x007f:
            r14 = 1
            goto L_0x0083
        L_0x0081:
            r14 = 9
        L_0x0083:
            int r10 = r14 + -1
            if (r14 == 0) goto L_0x0201
            if (r10 == 0) goto L_0x01c8
            if (r10 == r13) goto L_0x0196
            if (r10 == r9) goto L_0x0166
            if (r10 == r8) goto L_0x013d
            if (r10 == r7) goto L_0x00e6
            if (r10 == r6) goto L_0x00c3
            if (r10 == r15) goto L_0x0097
            goto L_0x0203
        L_0x0097:
            if (r4 != r11) goto L_0x009e
            java.lang.Object r1 = r3.f238084b
            com.google.android.apps.gsa.search.shared.service.b.gx r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87877gx) r1
            goto L_0x00a0
        L_0x009e:
            com.google.android.apps.gsa.search.shared.service.b.gx r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C87877gx.f237731f
        L_0x00a0:
            dagger.a r2 = r0.f288936k
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.h.m r2 = (com.google.android.apps.gsa.staticplugins.nga.p8065h.C103284m) r2
            com.google.common.util.concurrent.cx r1 = r2.mo93746a(r1)
            com.google.android.libraries.gsa.k.g r2 = r0.f288930e
            com.google.android.apps.gsa.staticplugins.nga.r.m r3 = new com.google.android.apps.gsa.staticplugins.nga.r.m
            r3.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r5 = "[NGA] fetch icingdata data callback"
            r4.<init>(r1, r2, r5, r3)
            com.google.android.apps.gsa.staticplugins.nga.r.n r1 = new com.google.android.apps.gsa.staticplugins.nga.r.n
            r1.<init>(r0)
            r4.mo85223a(r1)
            return
        L_0x00c3:
            dagger.a r1 = r0.f288935j
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.h.ar r1 = (com.google.android.apps.gsa.staticplugins.nga.p8065h.C103225ar) r1
            com.google.common.util.concurrent.cx r1 = r1.mo93717a()
            com.google.android.libraries.gsa.k.g r2 = r0.f288930e
            com.google.android.apps.gsa.staticplugins.nga.r.u r3 = new com.google.android.apps.gsa.staticplugins.nga.r.u
            r3.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r5 = "[NGA] fetch email thread data callback"
            r4.<init>(r1, r2, r5, r3)
            com.google.android.apps.gsa.staticplugins.nga.r.e r1 = new com.google.android.apps.gsa.staticplugins.nga.r.e
            r1.<init>(r0)
            r4.mo85223a(r1)
            return
        L_0x00e6:
            if (r4 != r12) goto L_0x00ed
            java.lang.Object r2 = r3.f238084b
            com.google.android.apps.gsa.nga.shared.aa.bn r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn) r2
            goto L_0x00ef
        L_0x00ed:
            com.google.android.apps.gsa.nga.shared.aa.bn r2 = com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn.f219915c
        L_0x00ef:
            m171726q(r19)
            java.util.Map r1 = r0.f288934i
            int r3 = r2.f219917a
            com.google.android.apps.gsa.nga.shared.aa.bg r3 = com.google.android.apps.gsa.nga.shared.p6275aa.C80129bg.m128086a(r3)
            java.lang.Object r1 = r1.get(r3)
            g.a.a r1 = (p5460g.p5461a.C69464a) r1
            if (r1 != 0) goto L_0x011c
            android.os.RemoteException r1 = new android.os.RemoteException
            java.lang.Object[] r3 = new java.lang.Object[r13]
            int r4 = r2.f219917a
            com.google.android.apps.gsa.nga.shared.aa.bg r4 = com.google.android.apps.gsa.nga.shared.p6275aa.C80129bg.m128086a(r4)
            r3[r5] = r4
            java.lang.String r4 = "Unknown one off handler: %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r1.<init>(r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92899h(r1)
            goto L_0x0126
        L_0x011c:
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.staticplugins.nga.r.c.a.a r1 = (com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a) r1
            com.google.common.util.concurrent.cx r1 = r1.mo93582a(r2)
        L_0x0126:
            com.google.android.libraries.gsa.k.g r3 = r0.f288930e
            com.google.android.apps.gsa.staticplugins.nga.r.f r4 = new com.google.android.apps.gsa.staticplugins.nga.r.f
            r4.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r6 = "[NGA] one-off handler result"
            r5.<init>(r1, r3, r6, r4)
            com.google.android.apps.gsa.staticplugins.nga.r.g r1 = new com.google.android.apps.gsa.staticplugins.nga.r.g
            r1.<init>(r0, r2)
            r5.mo85223a(r1)
            return
        L_0x013d:
            r1 = 11
            if (r4 != r1) goto L_0x0146
            java.lang.Object r1 = r3.f238084b
            com.google.android.apps.gsa.search.shared.service.b.ag r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87698ag) r1
            goto L_0x0148
        L_0x0146:
            com.google.android.apps.gsa.search.shared.service.b.ag r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C87698ag.f237151b
        L_0x0148:
            boolean r1 = r1.f237153a
            if (r1 == 0) goto L_0x0165
            com.google.android.apps.gsa.search.core.al.bj.a r1 = r0.f288929d
            com.google.common.util.concurrent.cx r1 = r1.mo78554c()
            com.google.android.libraries.gsa.k.g r2 = r0.f288930e
            com.google.android.apps.gsa.staticplugins.nga.r.o r3 = new com.google.android.apps.gsa.staticplugins.nga.r.o
            r3.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r5 = "[NGA] Start assistant session"
            r4.<init>(r1, r2, r5, r3)
            com.google.android.apps.gsa.staticplugins.nga.r.p r1 = com.google.android.apps.gsa.staticplugins.nga.p8079r.C103757p.f288921a
            r4.mo85223a(r1)
        L_0x0165:
            return
        L_0x0166:
            r1 = 9
            if (r4 != r1) goto L_0x016f
            java.lang.Object r1 = r3.f238084b
            com.google.android.apps.gsa.search.shared.service.b.fq r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87843fq) r1
            goto L_0x0171
        L_0x016f:
            com.google.android.apps.gsa.search.shared.service.b.fq r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C87843fq.f237669c
        L_0x0171:
            com.google.android.apps.gsa.search.core.al.bj.a r2 = r0.f288929d
            com.google.protos.p.b.co r3 = r1.f237671a
            if (r3 != 0) goto L_0x0179
            com.google.protos.p.b.co r3 = com.google.protos.p5129p.p5131b.C65811co.f178905g
        L_0x0179:
            java.lang.String r1 = r1.f237672b
            com.google.common.util.concurrent.cx r1 = r2.mo78552a(r3, r1)
            com.google.android.libraries.gsa.k.g r2 = r0.f288930e
            com.google.android.apps.gsa.staticplugins.nga.r.s r3 = new com.google.android.apps.gsa.staticplugins.nga.r.s
            r3.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r5 = "[NGA] Deeplink response callback"
            r4.<init>(r1, r2, r5, r3)
            com.google.android.apps.gsa.staticplugins.nga.r.t r1 = new com.google.android.apps.gsa.staticplugins.nga.r.t
            r1.<init>(r0)
            r4.mo85223a(r1)
            return
        L_0x0196:
            if (r4 != r15) goto L_0x019d
            java.lang.Object r1 = r3.f238084b
            com.google.android.apps.gsa.search.shared.service.b.zb r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88368zb) r1
            goto L_0x019f
        L_0x019d:
            com.google.android.apps.gsa.search.shared.service.b.zb r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88368zb.f238965d
        L_0x019f:
            java.lang.String r1 = r1.f238968b
            int r2 = r3.f238083a
            if (r2 != r15) goto L_0x01aa
            java.lang.Object r2 = r3.f238084b
            com.google.android.apps.gsa.search.shared.service.b.zb r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88368zb) r2
            goto L_0x01ac
        L_0x01aa:
            com.google.android.apps.gsa.search.shared.service.b.zb r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88368zb.f238965d
        L_0x01ac:
            int r2 = r2.f238969c
            com.google.android.apps.gsa.search.core.al.bj.a r3 = r0.f288929d
            com.google.common.util.concurrent.cx r1 = r3.mo78555d(r1, r2)
            com.google.android.libraries.gsa.k.g r2 = r0.f288930e
            com.google.android.apps.gsa.staticplugins.nga.r.q r3 = new com.google.android.apps.gsa.staticplugins.nga.r.q
            r3.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r5 = "[NGA] NgaSessionController.updateDeeplinkDatabase.updateDeeplinksDatabase"
            r4.<init>(r1, r2, r5, r3)
            com.google.android.apps.gsa.staticplugins.nga.r.r r1 = com.google.android.apps.gsa.staticplugins.nga.p8079r.C103759r.f288923a
            r4.mo85223a(r1)
            return
        L_0x01c8:
            com.google.common.base.ax r1 = m171726q(r19)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.Object r1 = r1.mo56109e(r2)
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r2 = "SCREENSHOTS"
            r1.getParcelableArrayList(r2)
            java.util.ArrayList r1 = r1.getParcelableArrayList(r2)
            java.lang.Object r1 = p3186j$.util.Objects.requireNonNull(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r1)
            com.google.android.apps.gsa.search.core.al.bj.a r2 = r0.f288929d
            int r4 = r3.f238083a
            r5 = 3
            if (r4 != r5) goto L_0x01f6
            java.lang.Object r3 = r3.f238084b
            com.google.android.apps.gsa.nga.shared.aa.b r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80112b) r3
            goto L_0x01f8
        L_0x01f6:
            com.google.android.apps.gsa.nga.shared.aa.b r3 = com.google.android.apps.gsa.nga.shared.p6275aa.C80112b.f219825d
        L_0x01f8:
            r2.mo78557f(r3, r1)
            com.google.android.apps.gsa.search.shared.service.b.um r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.UNBIND_BACKGROUND_CLIENT
            r0.mo93834p(r1)
            return
        L_0x0201:
            r1 = 0
            throw r1
        L_0x0203:
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r1.f236955a
            int r3 = r3.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r3)
            if (r3 != 0) goto L_0x020f
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x020f:
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.NGA_CLIENT_EVENT
            if (r3 != r4) goto L_0x024b
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88057no.f238102a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r1.f236955a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 == 0) goto L_0x024b
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88057no.f238102a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r1.f236955a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r5 = r3.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x0240
            java.lang.Object r3 = r3.f169969b
            goto L_0x0244
        L_0x0240:
            java.lang.Object r3 = r3.mo58889c(r4)
        L_0x0244:
            com.google.android.apps.gsa.search.shared.service.b.nn r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88056nn) r3
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            goto L_0x024d
        L_0x024b:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
        L_0x024d:
            boolean r4 = r3.mo56113h()
            if (r4 == 0) goto L_0x0273
            java.lang.Object r1 = r3.mo56107c()
            com.google.android.apps.gsa.search.shared.service.b.nn r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88056nn) r1
            com.google.android.apps.gsa.staticplugins.nga.r.c r2 = r0.f288931f
            com.google.common.util.concurrent.cx r1 = r2.mo93822a(r1)
            com.google.android.libraries.gsa.k.g r2 = r0.f288930e
            com.google.android.apps.gsa.staticplugins.nga.r.h r3 = new com.google.android.apps.gsa.staticplugins.nga.r.h
            r3.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r5 = "[NGA] NgaSessionController.handleUiEvent"
            r4.<init>(r1, r2, r5, r3)
            com.google.android.apps.gsa.staticplugins.nga.r.i r1 = com.google.android.apps.gsa.staticplugins.nga.p8079r.C103750i.f288914a
            r4.mo85223a(r1)
            return
        L_0x0273:
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r1.f236955a
            int r3 = r3.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r3)
            if (r3 != 0) goto L_0x027f
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x027f:
            int r3 = r3.ordinal()
            r4 = 40
            if (r3 == r4) goto L_0x028b
            r2.mo80279a(r1)
            return
        L_0x028b:
            r2.mo80279a(r1)
            com.google.android.apps.gsa.search.shared.service.b.um r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.UNBIND_BACKGROUND_CLIENT
            r0.mo93834p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8079r.C103763v.mo80293f(long, com.google.android.apps.gsa.search.shared.service.ClientEventData, com.google.android.apps.gsa.search.core.service.e.c):void");
    }

    /* renamed from: g */
    public final void mo80294g(boolean z) {
        m171727r(new C103752k(this));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
        this.f288928c = null;
        m171727r(C103753l.f288917a);
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        long j = ((C86775r) aVar).f234381c;
        this.f288928c = aVar;
        m171727r(new C103745d(aVar));
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        if (bbVar != null) {
            C62940bt r1 = C62942bv.checkIsLite(C88417ao.f239064a);
            bbVar.mo58887l(r1);
            if (bbVar.f169962ag.mo58857o(r1.f169971d)) {
                C62940bt r12 = C62942bv.checkIsLite(C88417ao.f239064a);
                bbVar.mo58887l(r12);
                Object l = bbVar.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj = r12.f169969b;
                } else {
                    obj = r12.mo58889c(l);
                }
                ((C103335ap) this.f288932g.mo27525b()).f288119a.mo93770d(new C103330ak(((C88414al) obj).toByteArray()));
            }
        }
        m171727r(C103751j.f288915a);
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }

    /* renamed from: m */
    public final void mo93831m(C80465m mVar) {
        C87684al alVar = new C87684al(C88244um.GET_ICING_DATA);
        alVar.mo81965b(C80466n.f220848a, mVar);
        mo93833o(alVar.mo81964a());
    }

    /* renamed from: n */
    public final void mo93832n(C80275dd ddVar) {
        C87684al alVar = new C87684al(C88244um.NGA_SERVICE_EVENT);
        C62940bt btVar = C88051ni.f238089a;
        C88052nj njVar = (C88052nj) C88053nk.f238090c.createBuilder();
        njVar.copyOnWrite();
        C88053nk nkVar = (C88053nk) njVar.instance;
        ddVar.getClass();
        nkVar.f238093b = ddVar;
        nkVar.f238092a = 1;
        alVar.mo81965b(btVar, (C88053nk) njVar.build());
        mo93833o(alVar.mo81964a());
    }

    /* renamed from: o */
    public final void mo93833o(ServiceEventData serviceEventData) {
        C86697a aVar = this.f288928c;
        if (aVar == null) {
            int i = serviceEventData.f236959a.f238699b;
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            return;
        }
        ((C86775r) aVar).f234383e.mo80379b(serviceEventData);
    }

    /* renamed from: p */
    public final void mo93834p(C88244um umVar) {
        mo93833o(new C87684al(umVar).mo81964a());
    }
}
