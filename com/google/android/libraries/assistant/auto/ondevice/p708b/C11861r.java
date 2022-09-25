package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4243a.p4245b.C56151j;
import com.google.p4242bp.p4243a.p4245b.C56152k;
import com.google.protos.p4850an.C63595f;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4850an.p4855d.p4858c.C63498af;
import com.google.protos.p4850an.p4855d.p4858c.C63500ah;
import com.google.protos.p4850an.p4855d.p4858c.C63504al;
import com.google.protos.p4850an.p4855d.p4858c.C63508ap;
import com.google.protos.p4850an.p4855d.p4858c.C63516ax;
import com.google.protos.p4850an.p4855d.p4858c.C63539l;
import com.google.protos.p4850an.p4855d.p4858c.C63541n;
import com.google.protos.p4883as.p4884a.C63775d;
import com.google.speech.grammar.pumpkin.C66525q;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.r */
/* compiled from: PG */
public final class C11861r implements a {

    /* renamed from: a */
    private final SemanticsBuilderUtil f38191a;

    /* renamed from: b */
    private final C11867x f38192b;

    /* renamed from: c */
    private final C11862s f38193c;

    /* renamed from: d */
    private final C11868y f38194d;

    /* renamed from: e */
    private final C86124t f38195e;

    /* renamed from: f */
    private C58833ax f38196f = C58836b.f156633a;

    static {
        C58974d.m91134h("MediaBuilder");
    }

    public C11861r(SemanticsBuilderUtil semanticsBuilderUtil, C11867x xVar, C11862s sVar, C11868y yVar, C86124t tVar) {
        this.f38191a = semanticsBuilderUtil;
        this.f38192b = xVar;
        this.f38193c = sVar;
        this.f38194d = yVar;
        this.f38195e = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r0.f166811b.equals("Radio_source_descriptor") != false) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo20242a(com.google.knowledge.p4661a.p4662a.C61752n r5, com.google.android.apps.gsa.shared.search.Query r6) {
        /*
            r4 = this;
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            r4.f38196f = r0
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r0 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r0.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r5)
            java.lang.String r1 = "media_object"
            com.google.common.base.ax r0 = r0.mo22497b(r1)
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.mo56107c()
            com.google.knowledge.a.a.h r1 = (com.google.knowledge.p4661a.p4662a.C61746h) r1
            com.google.knowledge.a.a.j r1 = r1.f166797e
            if (r1 != 0) goto L_0x0021
            com.google.knowledge.a.a.j r1 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x0021:
            int r2 = r1.f166802a
            r3 = 2
            if (r2 != r3) goto L_0x002b
            java.lang.Object r1 = r1.f166803b
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x002d
        L_0x002b:
            com.google.knowledge.a.a.n r1 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x002d:
            java.lang.String r1 = r1.f166811b
            java.lang.String r2 = "RadioSourceDescriptor"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ce
            java.lang.Object r0 = r0.mo56107c()
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x0043
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x0043:
            int r1 = r0.f166802a
            if (r1 != r3) goto L_0x004c
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.n r0 = (com.google.knowledge.p4661a.p4662a.C61752n) r0
            goto L_0x004e
        L_0x004c:
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x004e:
            java.lang.String r0 = r0.f166811b
            java.lang.String r1 = "Radio_source_descriptor"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005a
            goto L_0x00ce
        L_0x005a:
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r0 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r0.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r5)
            java.lang.String r1 = "car_device"
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r0 = r0.mo22496a(r1)
            java.lang.String r1 = "source"
            com.google.common.base.ax r0 = r0.mo22499d(r1)
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x00ce
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r0 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r0.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r5)
            java.lang.String r1 = "app"
            com.google.common.base.ax r0 = r0.mo22500e(r1)
            boolean r2 = r0.mo56113h()
            java.lang.String r3 = "radio"
            if (r2 == 0) goto L_0x0090
            java.lang.Object r0 = r0.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00ce
        L_0x0090:
            com.google.android.libraries.assistant.auto.tng.r.c.c.c r0 = new com.google.android.libraries.assistant.auto.tng.r.c.c.c
            r0.<init>((com.google.knowledge.p4661a.p4662a.C61752n) r5)
            com.google.common.base.ax r0 = r0.mo22497b(r1)
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x00ce
            java.lang.Object r0 = r0.mo56107c()
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x00ab
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x00ab:
            int r1 = r0.f166802a
            r2 = 15
            if (r1 != r2) goto L_0x00b6
            java.lang.Object r0 = r0.f166803b
            com.google.protos.an.h r0 = (com.google.protos.p4850an.C63624h) r0
            goto L_0x00b8
        L_0x00b6:
            com.google.protos.an.h r0 = com.google.protos.p4850an.C63624h.f172070b
        L_0x00b8:
            com.google.protobuf.cq r1 = r0.f172072a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00ce
            com.google.protobuf.cq r0 = r0.f172072a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.protos.as.a.d r0 = (com.google.protos.p4883as.p4884a.C63775d) r0
            java.lang.String r0 = r0.f172521b
            r0.equals(r3)
        L_0x00ce:
            com.google.android.libraries.assistant.auto.ondevice.b.x r0 = r4.f38192b
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            r4.f38196f = r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x00e9
            com.google.common.base.ax r0 = r4.f38196f
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.g.b.a r0 = (com.google.android.apps.gsa.g.b.a) r0
            com.google.common.base.ax r5 = r0.a(r5, r6)
            return r5
        L_0x00e9:
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11861r.mo20242a(com.google.knowledge.a.a.n, com.google.android.apps.gsa.shared.search.Query):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final C60870cx mo20243b(C66525q qVar, Query query) {
        C63498af afVar;
        C58833ax axVar;
        String str;
        if (qVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        SemanticsBuilderUtil semanticsBuilderUtil = this.f38191a;
        C56151j jVar = (C56151j) C56152k.f149611f.createBuilder();
        jVar.mo54328a("MusicServiceOn");
        C58833ax a = semanticsBuilderUtil.mo20311a(qVar, (C56152k) jVar.build());
        if (!a.mo56113h()) {
            afVar = null;
        } else {
            afVar = (C63498af) C15669a.m32464c((C63595f) a.mo56107c(), C63498af.f171735f);
        }
        if (afVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (!afVar.f171738b) {
            int i = afVar.f171737a;
            if (!((i & 4096) == 0 && (i & 8192) == 0 && (i & 2048) == 0 && (i & 1024) == 0 && (i & 16384) == 0)) {
                this.f38196f = C58833ax.m90834k(this.f38193c);
                C58833ax axVar2 = C58836b.f156633a;
                int i2 = afVar.f171737a;
                if ((i2 & 4096) != 0) {
                    axVar2 = C58833ax.m90834k("media.NEXT");
                } else if ((i2 & 8192) != 0) {
                    axVar2 = C58833ax.m90834k("media.PREVIOUS");
                } else if ((i2 & 2048) != 0) {
                    axVar2 = C58833ax.m90834k("media.RESUME");
                } else if ((i2 & 1024) != 0) {
                    axVar2 = C58833ax.m90834k("media.PAUSE");
                } else if ((i2 & 16384) != 0) {
                    axVar2 = C58833ax.m90834k("media.STOP");
                } else {
                    ((C58970a) ((C58970a) C11862s.f38197a.mo56226d()).mo56372aa(43611)).mo56389s("MediaAction is not related to media control or is not supported: %s", afVar);
                }
                axVar = C11862s.m27620d((String) axVar2.mo56109e(BuildConfig.FLAVOR));
                return C60856cj.m92900i(axVar);
            }
        } else if (afVar.f171739c.size() == 0) {
            if (afVar.f171740d.size() == 1 && this.f38195e.mo79746e(C90086ek.f250384cC)) {
                this.f38196f = C58833ax.m90834k(this.f38194d);
                C11868y yVar = this.f38194d;
                if (afVar.f171740d.size() == 0) {
                    axVar = C58836b.f156633a;
                } else {
                    C63500ah ahVar = (C63500ah) afVar.f171740d.get(0);
                    C63624h hVar = ahVar.f171758c;
                    if (hVar == null) {
                        hVar = C63624h.f172070b;
                    }
                    if (hVar.f172072a.size() > 0) {
                        C63624h hVar2 = ahVar.f171758c;
                        if (hVar2 == null) {
                            hVar2 = C63624h.f172070b;
                        }
                        str = ((C63775d) hVar2.f172072a.get(0)).f172521b;
                    } else {
                        str = ahVar.f171756a;
                    }
                    axVar = yVar.mo20256d(str, (String) null);
                }
                return C60856cj.m92900i(axVar);
            }
        } else if (afVar.f171739c.size() == 1) {
            int i3 = ((C63541n) afVar.f171739c.get(0)).f171867a;
            this.f38196f = C58833ax.m90834k(this.f38192b);
            C11867x xVar = this.f38192b;
            if (!afVar.f171738b || afVar.f171739c.size() != 1) {
                axVar = C58836b.f156633a;
                return C60856cj.m92900i(axVar);
            }
            C11838a aVar = new C11838a();
            C63541n nVar = (C63541n) afVar.f171739c.get(0);
            C63516ax axVar3 = nVar.f171868b;
            if (axVar3 == null) {
                axVar3 = C63516ax.f171799b;
            }
            aVar.f38027a = C58833ax.m90834k(axVar3.f171801a);
            C63504al alVar = nVar.f171869c;
            if (alVar == null) {
                alVar = C63504al.f171767b;
            }
            aVar.f38029c = C58833ax.m90834k(alVar.f171769a);
            C63539l lVar = nVar.f171870d;
            if (lVar == null) {
                lVar = C63539l.f171859b;
            }
            aVar.f38028b = C58833ax.m90834k(lVar.f171861a);
            C63508ap apVar = nVar.f171871e;
            if (apVar == null) {
                apVar = C63508ap.f171778b;
            }
            aVar.f38030d = C58833ax.m90834k(apVar.f171780a);
            if (afVar.f171740d.size() == 1) {
                C63500ah ahVar2 = (C63500ah) afVar.f171740d.get(0);
                aVar.f38032f = C58833ax.m90834k(ahVar2.f171756a);
                if (ahVar2.f171757b.size() > 0) {
                    aVar.f38033g = C58833ax.m90834k((String) ahVar2.f171757b.get(0));
                }
            }
            axVar = xVar.mo20252d(aVar.mo20248p(), query);
            return C60856cj.m92900i(axVar);
        }
        axVar = C58836b.f156633a;
        this.f38196f = axVar;
        return C60856cj.m92900i(axVar);
    }

    /* renamed from: c */
    public final C60870cx mo20244c(C52081en enVar) {
        if (this.f38196f.mo56113h()) {
            return ((a) this.f38196f.mo56107c()).c(enVar);
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
