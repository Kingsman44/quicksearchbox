package com.google.android.apps.gsa.search.core.p6884y.p6914h;

import android.content.Intent;
import com.google.android.apps.gsa.binaries.satin.app.ald;
import com.google.android.apps.gsa.binaries.satin.app.alf;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6884y.p6885a.C87285b;
import com.google.android.apps.gsa.search.core.p6884y.p6912f.C87371a;
import com.google.android.apps.gsa.search.core.p6884y.p6912f.C87372b;
import com.google.android.apps.gsa.search.core.p6884y.p6912f.C87373c;
import com.google.android.apps.gsa.search.core.p6884y.p6912f.C87374d;
import com.google.android.apps.gsa.search.core.p6884y.p6912f.C87376f;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.core.service.p6848e.C86690l;
import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86678c;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87996lh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87998lj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87999lk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88011lw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88013ly;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88017mb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88018mc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88409ag;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88410ah;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.monet.shared.C23082am;
import com.google.android.libraries.gsa.monet.shared.C23127w;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.p5294a.C68225k;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.y.h.b */
/* compiled from: PG */
public final class C87382b implements C91007g {

    /* renamed from: a */
    public static final C58528ij f235960a = C58476gl.m89803b(EnumSet.of(C87739bu.MONET_CLIENT_EVENT, new C87739bu[]{C87739bu.MONET_CLIENT_LIFECYCLE_EVENT}));

    /* renamed from: b */
    private static final C59071e f235961b = C59071e.m91332i("com.google.android.apps.gsa.search.core.y.h.b");

    /* renamed from: c */
    private final C91097g f235962c;

    /* renamed from: d */
    private final C69464a f235963d;

    /* renamed from: e */
    private C87374d f235964e;

    /* renamed from: f */
    private amo f235965f;

    public C87382b(C91097g gVar, C69464a aVar) {
        this.f235962c = gVar;
        this.f235963d = aVar;
    }

    /* renamed from: a */
    public final void mo81041a() {
        C87374d dVar = this.f235964e;
        if (dVar != null) {
            for (C87285b a : dVar.f235940c.values()) {
                C87374d.m141360a(a);
            }
            dVar.f235940c.clear();
        }
    }

    /* renamed from: b */
    public final void mo81042b(C86697a aVar) {
        C87374d dVar = this.f235964e;
        if (dVar != null) {
            for (C87285b e : dVar.f235940c.values()) {
                e.mo80931e();
            }
        }
        C86775r rVar = (C86775r) aVar;
        if (!C58832aw.m90831a(this.f235965f, rVar.f234384f.f236951d)) {
            this.f235965f = rVar.f234384f.f236951d;
            mo81041a();
        }
    }

    /* renamed from: c */
    public final void mo81043c(ClientEventData clientEventData) {
        Object obj;
        C87999lk lkVar;
        C88011lw lwVar;
        Object obj2;
        ClientEventData clientEventData2 = clientEventData;
        C87739bu a = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        boolean z = false;
        C58838bb.m90884s(a == C87739bu.MONET_CLIENT_EVENT || a == C87739bu.MONET_CLIENT_LIFECYCLE_EVENT, "Not a Monet event");
        this.f235964e = (C87374d) this.f235963d.mo17428b();
        C87739bu a2 = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
        if (a2 == null) {
            a2 = C87739bu.UNKNOWN;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 61) {
            C87374d dVar = this.f235964e;
            C62940bt btVar = C87987kz.f237952a;
            C87741bw bwVar = clientEventData2.f236955a;
            C62940bt r3 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r3);
            Object l = bwVar.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            C88012lx lxVar = (C88012lx) obj;
            C23127w wVar = null;
            if (lxVar.f238013b == 8) {
                C87376f fVar = (C87376f) dVar.f235939b.mo27525b();
                if (lxVar.f238013b == 8) {
                    lwVar = (C88011lw) lxVar.f238014c;
                } else {
                    lwVar = C88011lw.f238004e;
                }
                int i = lwVar.f238007b;
                int i2 = i != 0 ? i != 2 ? i != 3 ? 0 : 2 : 1 : 3;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    long j = 0;
                    if (i3 == 0) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (lwVar.f238007b == 2) {
                            j = ((Long) lwVar.f238008c).longValue();
                        }
                        fVar.f235949a.mo77945h(C118569b.MONET_RENDER_LATENCY_MILLIS, C118575h.RENDER_MONET_CLIENT, C118575h.m196865a(lwVar.f238009d)).mo104025g(timeUnit.toMillis(j));
                    } else if (i3 == 1) {
                        if (i == 3) {
                            z = ((Boolean) lwVar.f238008c).booleanValue();
                        }
                        C118831d g = fVar.f235949a.mo77944g(C118569b.MONET_RESTORE_SUCCESS_RATE, C118575h.m196865a(lwVar.f238009d));
                        if (true == z) {
                            j = 1;
                        }
                        g.mo104025g(j);
                    }
                } else {
                    throw null;
                }
            } else {
                C87285b bVar = (C87285b) dVar.f235940c.get(lxVar.f238015d);
                if (lxVar.f238013b == 6) {
                    String str = lxVar.f238015d;
                    C87285b bVar2 = (C87285b) dVar.f235940c.get(str);
                    if (lxVar.f238013b == 6) {
                        lkVar = (C87999lk) lxVar.f238014c;
                    } else {
                        lkVar = C87999lk.f237973g;
                    }
                    if (bVar2 != null) {
                        int a3 = C87998lj.m142776a(lkVar.f237976b);
                        if (a3 == 0 || a3 != 5) {
                            C87374d.m141360a(bVar2);
                            dVar.f235940c.remove(str);
                        } else {
                            return;
                        }
                    } else {
                        int a4 = C87998lj.m142776a(lkVar.f237976b);
                        if (a4 != 0 && a4 == 5) {
                            ((C59052c) ((C59052c) C87374d.f235938a.mo56226d()).mo56372aa(8286)).mo56386p("Service holder must exist in order to ignore initialization event.");
                        }
                    }
                    if ((lkVar.f237975a & 4) != 0) {
                        C87996lh lhVar = lkVar.f237978d;
                        if (lhVar == null) {
                            lhVar = C87996lh.f237967d;
                        }
                        wVar = new C23127w(lhVar.f237970b, lhVar.f237971c);
                    }
                    C87371a aVar = dVar.f235946i;
                    int i4 = lkVar.f237979e;
                    boolean z2 = lkVar.f237977c;
                    C86683e eVar = dVar.f235941d;
                    C86678c cVar = (C86678c) dVar.f235942e.mo27525b();
                    C86690l lVar = (C86690l) dVar.f235943f.mo27525b();
                    long j2 = dVar.f235945h;
                    ald ald = (ald) aVar.f235931a.mo17428b();
                    ald.f196421c = C58833ax.m90833j(wVar);
                    str.getClass();
                    ald.f196422d = str;
                    ald.f196423e = Integer.valueOf(i4);
                    eVar.getClass();
                    ald.f196424f = eVar;
                    ald.f196425g = Boolean.valueOf(z2);
                    cVar.getClass();
                    ald.f196426h = cVar;
                    lVar.getClass();
                    ald.f196427i = lVar;
                    ald.f196428j = (C23082am) dVar.f235944g.mo28553b(C23082am.f63431a);
                    ald.f196429k = Long.valueOf(j2);
                    C68225k.m98529a(ald.f196421c, C58833ax.class);
                    C68225k.m98529a(ald.f196422d, String.class);
                    C68225k.m98529a(ald.f196423e, Integer.class);
                    C68225k.m98529a(ald.f196424f, C86683e.class);
                    C68225k.m98529a(ald.f196425g, Boolean.class);
                    C68225k.m98529a(ald.f196426h, C86678c.class);
                    C68225k.m98529a(ald.f196427i, C91097g.class);
                    C68225k.m98529a(ald.f196428j, C23082am.class);
                    C68225k.m98529a(ald.f196429k, Long.class);
                    alf alf = new alf(ald.f196419a, ald.f196420b, ald.f196421c, ald.f196422d, ald.f196423e, ald.f196424f, ald.f196425g, ald.f196426h, ald.f196427i, ald.f196428j, ald.f196429k);
                    dVar.f235940c.put(str, alf);
                    alf.mo80931e().mo80941c(new C87373c(alf, clientEventData2));
                } else if (bVar != null) {
                    bVar.mo80931e().mo80941c(new C87372b(dVar, clientEventData2, lxVar, bVar));
                }
            }
        } else if (ordinal == 64) {
            C87374d dVar2 = this.f235964e;
            C62940bt btVar2 = C88013ly.f238016a;
            C87741bw bwVar2 = clientEventData2.f236955a;
            C62940bt r32 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r32);
            Object l2 = bwVar2.f169962ag.mo58854l(r32.f169971d);
            if (l2 == null) {
                obj2 = r32.f169969b;
            } else {
                obj2 = r32.mo58889c(l2);
            }
            C88018mc mcVar = (C88018mc) obj2;
            C87285b bVar3 = (C87285b) dVar2.f235940c.get(mcVar.f238023c);
            if (bVar3 != null) {
                int a5 = C88017mb.m142777a(mcVar.f238022b);
                if (a5 == 0 || a5 == 1) {
                    bVar3.mo80932f().mo84016h();
                } else if (a5 == 2) {
                    bVar3.mo80932f().mo84014f();
                } else if (a5 == 3) {
                    bVar3.mo80932f().mo84013e();
                } else if (a5 == 5) {
                    bVar3.mo80932f().mo84015g();
                } else if (a5 != 6) {
                    bVar3.mo80932f().mo84017i();
                } else {
                    bVar3.mo80932f().mo84012d();
                }
            }
        } else {
            throw new IllegalArgumentException("Unknown event.");
        }
    }

    /* renamed from: e */
    public final void mo81044e(C88431bb bbVar) {
        Object obj;
        ProtoParcelable protoParcelable;
        if (bbVar != null) {
            C62940bt r0 = C62942bv.checkIsLite(C88410ah.f239053a);
            bbVar.mo58887l(r0);
            if (bbVar.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C88410ah.f239053a);
                bbVar.mo58887l(r02);
                Object l = bbVar.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj = r02.f169969b;
                } else {
                    obj = r02.mo58889c(l);
                }
                C88409ag agVar = (C88409ag) obj;
                if (agVar != null) {
                    int i = agVar.f239049a;
                    if (!((i & 1) == 0 || (i & 2) == 0)) {
                        C23129y yVar = new C23129y(agVar.f239050b, agVar.f239051c);
                        if (((C58759qy) C87380a.f235959a).f156534a.equals(yVar)) {
                            if ((agVar.f239049a & 4) != 0) {
                                protoParcelable = new ProtoParcelable(agVar.f239052d.mo59174N());
                            } else {
                                protoParcelable = ProtoParcelable.f63423a;
                            }
                            Intent a = C90334c.m146886a(C90332a.DEFAULT.f252281i, yVar, protoParcelable);
                            a.setFlags(32768);
                            a.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 4);
                            this.f235962c.mo65089a(a);
                            return;
                        }
                        ((C59052c) ((C59052c) f235961b.mo56225c()).mo56372aa(8302)).mo56389s("Monet feature not whitelisted for deeplinking: %s.", yVar);
                        return;
                    }
                }
                ((C59052c) ((C59052c) f235961b.mo56225c()).mo56372aa(8301)).mo56389s("Invalid Monet deeplink: %s.", agVar);
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MonetSessionHandler");
        fVar.mo85287n(this.f235964e);
    }
}
