package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53242gq;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.util.concurrent.C60866ct;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneOffset;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.ag */
/* compiled from: PG */
public final /* synthetic */ class C114260ag implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114261ah f316830a;

    /* renamed from: b */
    public final /* synthetic */ C53245gt f316831b;

    /* renamed from: c */
    public final /* synthetic */ boolean f316832c;

    public /* synthetic */ C114260ag(C114261ah ahVar, C53245gt gtVar, boolean z) {
        this.f316830a = ahVar;
        this.f316831b = gtVar;
        this.f316832c = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114261ah ahVar = this.f316830a;
        C53245gt gtVar = this.f316831b;
        boolean z = this.f316832c;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            boolean z2 = ((C53245gt) optional.get()).f139574h;
            boolean z3 = gtVar.f139574h;
            ahVar.f316842l.mo109910ah(z2 != z3);
            if (gtVar.f139569c.size() > 0 && ((C53245gt) optional.get()).f139569c.size() > 0) {
                int parseInt = Integer.parseInt(((C53230ge) ((C53245gt) optional.get()).f139569c.get(0)).f139507c);
                if (!z2) {
                    parseInt = C114261ah.m189517e(parseInt);
                }
                int parseInt2 = Integer.parseInt(((C53230ge) gtVar.f139569c.get(0)).f139507c);
                if (!z3) {
                    parseInt2 = C114261ah.m189517e(parseInt2);
                }
                C130895ag agVar = ahVar.f316842l;
                boolean m = ahVar.f316846p.mo77175m();
                boolean r = C83794j.m133432r(ahVar.f316847q);
                boolean E = C83794j.m133428E(ahVar.f316847q);
                C63042fg fgVar = gtVar.f139572f;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                agVar.mo109896aE(m, r, E, z, C62950b.m95474e(fgVar), (long) Math.abs(parseInt - parseInt2));
                if (z) {
                    C53242gq gqVar = ((C53245gt) optional.get()).f139577k;
                    if (gqVar == null) {
                        gqVar = C53242gq.f139546f;
                    }
                    if ((gqVar.f139548a & 2) != 0) {
                        C53242gq gqVar2 = gtVar.f139577k;
                        if (gqVar2 == null) {
                            gqVar2 = C53242gq.f139546f;
                        }
                        if ((gqVar2.f139548a & 2) != 0) {
                            C130895ag agVar2 = ahVar.f316842l;
                            boolean m2 = ahVar.f316846p.mo77175m();
                            boolean r2 = C83794j.m133432r(ahVar.f316847q);
                            boolean E2 = C83794j.m133428E(ahVar.f316847q);
                            C53242gq gqVar3 = ((C53245gt) optional.get()).f139577k;
                            if (gqVar3 == null) {
                                gqVar3 = C53242gq.f139546f;
                            }
                            String str = gqVar3.f139550c;
                            C53242gq gqVar4 = gtVar.f139577k;
                            if (gqVar4 == null) {
                                gqVar4 = C53242gq.f139546f;
                            }
                            agVar2.mo109906ad(m2, r2, E2, str.equals(gqVar4.f139550c));
                        }
                    }
                }
            }
            C53245gt gtVar2 = (C53245gt) optional.get();
            if (!((gtVar2.f139567a & 8) == 0 || (gtVar.f139567a & 8) == 0)) {
                C63042fg fgVar2 = gtVar.f139572f;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                long c = C62953e.m95478c(fgVar2);
                C63042fg fgVar3 = gtVar2.f139572f;
                if (fgVar3 == null) {
                    fgVar3 = C63042fg.f170152c;
                }
                if (c > C62953e.m95478c(fgVar3)) {
                    C53234gi giVar = gtVar2.f139573g;
                    if (giVar == null) {
                        giVar = C53234gi.f139523e;
                    }
                    if ((giVar.f139525a & 1) != 0) {
                        C53234gi giVar2 = gtVar2.f139573g;
                        if (((giVar2 == null ? C53234gi.f139523e : giVar2).f139525a & 2) != 0) {
                            if (giVar2 == null) {
                                giVar2 = C53234gi.f139523e;
                            }
                            if (!(giVar2.f139528d.isEmpty() || (gtVar2.f139567a & 4) == 0 || (gtVar.f139567a & 4) == 0)) {
                                C53234gi giVar3 = gtVar2.f139573g;
                                if (giVar3 == null) {
                                    giVar3 = C53234gi.f139523e;
                                }
                                C58072d dVar = giVar3.f139526b;
                                if (dVar == null) {
                                    dVar = C58072d.f155218d;
                                }
                                long epochMilli = LocalDateTime.m71183of(dVar.f155220a, dVar.f155221b, dVar.f155222c, giVar3.f139527c, 0).atZone(ZoneOffset.UTC).toInstant().toEpochMilli();
                                long hours = Duration.ofMillis(ahVar.f316840j.mo26870b()).toHours();
                                C63042fg fgVar4 = gtVar2.f139572f;
                                if (fgVar4 == null) {
                                    fgVar4 = C63042fg.f170152c;
                                }
                                long hours2 = hours - Duration.ofMillis(C62953e.m95478c(fgVar4)).toHours();
                                long hours3 = Duration.ofMillis(ahVar.f316840j.mo26870b()).toHours() - Duration.ofMillis(epochMilli).toHours();
                                Duration.ofMillis(ahVar.f316840j.mo26870b()).toHours();
                                Duration.ofMillis(epochMilli).toHours();
                                C63042fg fgVar5 = gtVar2.f139572f;
                                if (fgVar5 == null) {
                                    fgVar5 = C63042fg.f170152c;
                                }
                                Duration.ofMillis(C62953e.m95478c(fgVar5)).toHours();
                                if (hours2 > 0 && hours3 >= 0 && hours3 < ((long) giVar3.f139528d.size())) {
                                    C53244gs gsVar = (C53244gs) giVar3.f139528d.get((int) hours3);
                                    if (!ahVar.f316846p.mo77161F() && (gsVar = gtVar2.f139571e) == null) {
                                        gsVar = C53244gs.f139553j;
                                    }
                                    C53244gs gsVar2 = gtVar.f139571e;
                                    if (gsVar2 == null) {
                                        gsVar2 = C53244gs.f139553j;
                                    }
                                    C130895ag agVar3 = ahVar.f316842l;
                                    int parseInt3 = Integer.parseInt(gsVar.f139557c);
                                    boolean z4 = gtVar2.f139574h;
                                    int parseInt4 = Integer.parseInt(gsVar2.f139557c);
                                    boolean z5 = gtVar.f139574h;
                                    if (!z4) {
                                        parseInt3 = C114261ah.m189517e(parseInt3);
                                    }
                                    if (!z5) {
                                        parseInt4 = C114261ah.m189517e(parseInt4);
                                    }
                                    agVar3.mo109897aF(Math.abs(parseInt4 - parseInt3), Duration.ofHours(hours2), ahVar.f316846p.mo77161F(), C83794j.m133428E(ahVar.f316847q));
                                }
                            }
                        }
                    }
                }
            }
        }
        return C60866ct.f164955a;
    }
}
