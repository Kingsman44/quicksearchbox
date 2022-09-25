package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.C89625aw;
import com.google.android.apps.gsa.shared.bisto.C89626ax;
import com.google.android.apps.gsa.shared.bisto.C89644ba;
import com.google.android.apps.gsa.shared.bisto.C89645bb;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95710aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124713k;
import com.google.android.p10712d.C142371cw;
import com.google.android.p10712d.C142372cx;
import com.google.android.p10712d.C142375d;
import com.google.android.p10712d.C142388dm;
import com.google.android.p10712d.C142390do;
import com.google.android.p10712d.C142392dq;
import com.google.android.p10712d.C142396du;
import com.google.android.p10712d.C142400dy;
import com.google.android.p10712d.C142405ec;
import com.google.android.p10712d.C142407ee;
import com.google.android.p10712d.C142409eg;
import com.google.android.p10712d.C142413ek;
import com.google.android.p10712d.C142415em;
import com.google.android.p10712d.C142455fz;
import com.google.android.p10712d.C142526r;
import com.google.android.p10712d.C142531w;
import com.google.android.p10712d.C142532x;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60279mt;
import com.google.common.p4552o.C60281mv;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.dv */
/* compiled from: PG */
public final class C95425dv implements C95419dp, C89625aw, C89626ax {

    /* renamed from: b */
    public static final C59071e f266990b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.dv");

    /* renamed from: k */
    private static final Duration f266991k = Duration.ofMillis(2500);

    /* renamed from: c */
    public final C68214a f266992c;

    /* renamed from: d */
    public final C89656k f266993d;

    /* renamed from: e */
    public final C68214a f266994e;

    /* renamed from: f */
    public final AtomicReference f266995f;

    /* renamed from: g */
    public final C95418do f266996g;

    /* renamed from: h */
    public final C89644ba f266997h;

    /* renamed from: i */
    public final String f266998i;

    /* renamed from: j */
    public final ScheduledExecutorService f266999j;

    /* renamed from: l */
    private final Executor f267000l;

    /* renamed from: m */
    private final C68214a f267001m;

    public C95425dv(C124539a aVar, String str, UUID uuid, C95352bc bcVar, C95418do doVar, C68214a aVar2, Executor executor, ScheduledExecutorService scheduledExecutorService, C68214a aVar3, C89656k kVar, C68214a aVar4, C89645bb bbVar) {
        C89656k kVar2 = kVar;
        C89645bb bbVar2 = bbVar;
        C95352bc bcVar2 = bcVar;
        this.f266995f = new AtomicReference(bcVar);
        this.f266992c = aVar2;
        this.f267000l = executor;
        this.f267001m = aVar3;
        this.f266993d = kVar2;
        this.f266994e = aVar4;
        this.f266996g = doVar;
        boolean h = kVar2.mo83553h("blackboxTestLogging");
        aVar.getClass();
        str.getClass();
        uuid.getClass();
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) bbVar2.f242742a.mo17428b();
        scheduledExecutorService2.getClass();
        Executor executor2 = (Executor) bbVar2.f242743b.mo17428b();
        executor2.getClass();
        this.f266997h = new C89644ba(aVar, uuid, 1024, 0, this, h, scheduledExecutorService2, executor2);
        this.f266998i = aVar.f343619a.getAddress();
        this.f266999j = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo83496a() {
        this.f267000l.execute(new C95421dr(this));
    }

    /* renamed from: b */
    public final void mo83497b(int i, int i2, byte[] bArr) {
        int i3;
        char c;
        C142388dm dmVar;
        C142407ee eeVar;
        C124713k kVar;
        int i4 = i;
        int i5 = i2;
        byte[] bArr2 = bArr;
        if (this.f266993d.mo83553h("bistoDeeperSocketLogging")) {
            String str = this.f266998i;
            C59104x b = C95710aa.f267964a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) b).mo56372aa(15226)).mo56361N("Received message: deviceId=%s, group=%d, type=%d, length=%d bytes=%s", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr2.length), C95710aa.m158487a(bArr));
        }
        if (i4 == 3) {
            C95381ce.m157720a((C89492cd) this.f266992c.mo27525b(), this.f266998i, i5, bArr2, (C95307m) this.f267001m.mo27525b());
        } else {
            i3 = 1;
            if (i4 == 4) {
                switch (i5) {
                    case 1:
                        c = 2;
                        break;
                    case 2:
                        c = 3;
                        break;
                    case 3:
                        c = 4;
                        break;
                    case 4:
                        c = 5;
                        break;
                    case 5:
                        c = 6;
                        break;
                    case 6:
                        c = 7;
                        break;
                    case 7:
                        c = 8;
                        break;
                    case 8:
                        c = 9;
                        break;
                    case 9:
                        c = 10;
                        break;
                    case 10:
                        c = 11;
                        break;
                    case 11:
                        c = 12;
                        break;
                    case 12:
                        c = 13;
                        break;
                    case 13:
                        c = 14;
                        break;
                    case 14:
                        c = 15;
                        break;
                    case 15:
                        c = 16;
                        break;
                    case 16:
                        c = 17;
                        break;
                    case 17:
                        c = 18;
                        break;
                    case 18:
                        c = 19;
                        break;
                    case 19:
                        c = 20;
                        break;
                    case 20:
                        c = 21;
                        break;
                    default:
                        c = 0;
                        break;
                }
                if (c == 4) {
                    try {
                        C142400dy dyVar = (C142400dy) C62942bv.parseFrom((C62942bv) C142400dy.f386405d, bArr2, C62921ba.m95368a());
                        int i6 = dyVar.f386407a;
                        Integer valueOf = (i6 & 4) != 0 ? Integer.valueOf(dyVar.f386409c) : null;
                        if ((i6 & 2) != 0) {
                            int i7 = dyVar.f386408b;
                            int a = C142405ec.m231076a(i7);
                            if (a != 0 && a == 6) {
                                kVar = C124713k.CHARGER_NO_POWER;
                                ((C89492cd) this.f266992c.mo27525b()).mo83382X(this.f266998i, kVar, valueOf);
                            } else {
                                int a2 = C142405ec.m231076a(i7);
                                if (a2 != 0 && a2 == 2) {
                                    kVar = C124713k.CHARGER_TRICKLE_CHARGE;
                                    ((C89492cd) this.f266992c.mo27525b()).mo83382X(this.f266998i, kVar, valueOf);
                                } else {
                                    int a3 = C142405ec.m231076a(i7);
                                    if (a3 != 0 && a3 == 4) {
                                        kVar = C124713k.CHARGER_DISABLED_ERROR;
                                        ((C89492cd) this.f266992c.mo27525b()).mo83382X(this.f266998i, kVar, valueOf);
                                    } else {
                                        int a4 = C142405ec.m231076a(i7);
                                        if (a4 != 0 && a4 == 3) {
                                            kVar = C124713k.CHARGER_FAST_CHARGE;
                                            ((C89492cd) this.f266992c.mo27525b()).mo83382X(this.f266998i, kVar, valueOf);
                                        } else {
                                            int a5 = C142405ec.m231076a(i7);
                                            if (a5 != 0 && a5 == 5) {
                                                kVar = C124713k.CHARGER_STANDBY;
                                                ((C89492cd) this.f266992c.mo27525b()).mo83382X(this.f266998i, kVar, valueOf);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        kVar = null;
                        ((C89492cd) this.f266992c.mo27525b()).mo83382X(this.f266998i, kVar, valueOf);
                    } catch (IOException e) {
                        C59104x c2 = f266990b.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(15033)).mo56386p("Error parsing battery proto");
                    }
                } else if (c == 6) {
                    C58976aa aaVar = C58975e.f156826a;
                    try {
                        C142415em emVar = (C142415em) C62942bv.parseFrom((C62942bv) C142415em.f386437c, bArr2, C62921ba.m95368a());
                        if ((emVar.f386439a & 1) != 0) {
                            C142413ek a6 = C142413ek.m231079a(emVar.f386440b);
                            if (a6 == null) {
                                a6 = C142413ek.UNKNOWN;
                            }
                            if (this.f266993d.mo83558m()) {
                                C60279mt mtVar = (C60279mt) C60281mv.f163083d.createBuilder();
                                if (a6 == C142413ek.OHD_BOTH_DETECTED) {
                                    mtVar.copyOnWrite();
                                    C60281mv mvVar = (C60281mv) mtVar.instance;
                                    mvVar.f163086b = 6;
                                    mvVar.f163085a |= 1;
                                } else if (a6 == C142413ek.OHD_LEFT_DETECTED) {
                                    mtVar.copyOnWrite();
                                    C60281mv mvVar2 = (C60281mv) mtVar.instance;
                                    mvVar2.f163086b = 4;
                                    mvVar2.f163085a |= 1;
                                } else if (a6 == C142413ek.OHD_RIGHT_DETECTED) {
                                    mtVar.copyOnWrite();
                                    C60281mv mvVar3 = (C60281mv) mtVar.instance;
                                    mvVar3.f163086b = 5;
                                    mvVar3.f163085a |= 1;
                                } else if (a6 == C142413ek.OHD_NONE_DETECTED) {
                                    mtVar.copyOnWrite();
                                    C60281mv mvVar4 = (C60281mv) mtVar.instance;
                                    mvVar4.f163086b = 3;
                                    mvVar4.f163085a |= 1;
                                } else if (a6 == C142413ek.OHD_DISABLED) {
                                    mtVar.copyOnWrite();
                                    C60281mv mvVar5 = (C60281mv) mtVar.instance;
                                    mvVar5.f163086b = 1;
                                    mvVar5.f163085a |= 1;
                                } else if (a6 == C142413ek.UNKNOWN) {
                                    mtVar.copyOnWrite();
                                    C60281mv mvVar6 = (C60281mv) mtVar.instance;
                                    mvVar6.f163086b = 2;
                                    mvVar6.f163085a |= 1;
                                }
                                if (a6 != C142413ek.OHD_DISABLED) {
                                    mtVar.copyOnWrite();
                                    C60281mv mvVar7 = (C60281mv) mtVar.instance;
                                    mvVar7.f163085a |= 2;
                                    mvVar7.f163087c = true;
                                }
                                C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
                                nkVar.copyOnWrite();
                                C60300nm nmVar = (C60300nm) nkVar.instance;
                                C60281mv mvVar8 = (C60281mv) mtVar.build();
                                mvVar8.getClass();
                                nmVar.f163150d = mvVar8;
                                nmVar.f163147a |= 64;
                                ((C95307m) this.f267001m.mo27525b()).mo83545c(nkVar);
                            }
                            ((C89492cd) this.f266992c.mo27525b()).mo83393ai(this.f266998i, a6);
                        }
                    } catch (IOException e2) {
                        C59104x c3 = f266990b.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(15049)).mo56386p("Error parsing received proto");
                    }
                } else if (c == 9) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    int i8 = C95873a.f268446a;
                } else if (c == 10) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    int i9 = C95873a.f268446a;
                } else if (c == 17) {
                    C58976aa aaVar4 = C58975e.f156826a;
                    try {
                        C142409eg egVar = (C142409eg) C62942bv.parseFrom((C62942bv) C142409eg.f386419c, bArr2, C62921ba.m95368a());
                        ((C89492cd) this.f266992c.mo27525b()).mo83396al(this.f266998i, (egVar.f386421a & 1) != 0 ? Boolean.valueOf(egVar.f386422b) : null);
                    } catch (IOException e3) {
                        C59104x c4 = f266990b.mo56225c();
                        c4.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e3)).mo56372aa(15045)).mo56386p("Error parsing received proto");
                    }
                } else if (c == 19) {
                    C58976aa aaVar5 = C58975e.f156826a;
                    try {
                        C142396du duVar = (C142396du) C62942bv.parseFrom((C62942bv) C142396du.f386398d, bArr2, C62921ba.m95368a());
                        if ((duVar.f386400a & 1) != 0) {
                            dmVar = C142388dm.m231072a(duVar.f386401b);
                            if (dmVar == null) {
                                dmVar = C142388dm.ACTIVE_AUDIO_SOURCE_UNSPECIFIED;
                            }
                        } else {
                            dmVar = null;
                        }
                        if ((duVar.f386400a & 2) != 0) {
                            eeVar = C142407ee.m231077a(duVar.f386402c);
                            if (eeVar == null) {
                                eeVar = C142407ee.HFP_STATE_UNSPECIFIED;
                            }
                        } else {
                            eeVar = null;
                        }
                        ((C89492cd) this.f266992c.mo27525b()).mo83387ac(this.f266998i, dmVar, eeVar);
                    } catch (IOException e4) {
                        C59104x c5 = f266990b.mo56225c();
                        c5.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(e4)).mo56372aa(15032)).mo56386p("Error parsing received proto");
                    }
                } else if (c == 21) {
                    C58976aa aaVar6 = C58975e.f156826a;
                    try {
                        C142392dq dqVar = (C142392dq) C62942bv.parseFrom((C62942bv) C142392dq.f386392b, bArr2, C62921ba.m95368a());
                        C89492cd cdVar = (C89492cd) this.f266992c.mo27525b();
                        String str2 = this.f266998i;
                        C142390do a7 = C142390do.m231074a(dqVar.f386394a);
                        if (a7 == null) {
                            a7 = C142390do.ASSISTANT_GESTURE_AVAILABILITY_UNSPECIFIED;
                        }
                        cdVar.mo83381W(str2, a7);
                    } catch (IOException e5) {
                        C59104x c6 = f266990b.mo56225c();
                        c6.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c6).mo56382g(e5)).mo56372aa(15030)).mo56386p("Error parsing received proto");
                    }
                } else {
                    C58976aa aaVar7 = C58975e.f156826a;
                }
            } else if (i4 == 9) {
                if (i5 != 2) {
                    C59104x d = f266990b.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                    ((C59052c) ((C59052c) d).mo56372aa(15040)).mo56387q("Unknown settings messageType received: %d", i5);
                } else {
                    try {
                        C142375d dVar = (C142375d) C62942bv.parseFrom((C62942bv) C142375d.f386335d, bArr2, C62921ba.m95368a());
                        C124636bb bbVar = C124636bb.UNKNOWN_ENABLED_STATE;
                        if ((dVar.f386337a & 1) != 0) {
                            bbVar = dVar.f386338b ? C124636bb.OPA_DISABLED : C124636bb.OPA_ENABLED;
                        }
                        ((C95307m) this.f267001m.mo27525b()).mo89246l(this.f266998i, bbVar);
                        ((C89492cd) this.f266992c.mo27525b()).mo83394aj(this.f266998i, bbVar, (C124633az) null);
                    } catch (IOException e6) {
                        C59104x c7 = f266990b.mo56225c();
                        c7.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c7).mo56382g(e6)).mo56372aa(15039)).mo56386p("Error parsing received proto");
                    }
                }
            } else if (i4 == 14) {
                if (i5 == 2) {
                    try {
                        C142526r rVar = (C142526r) C62942bv.parseFrom((C62942bv) C142526r.f386750c, bArr2, C62921ba.m95368a());
                        if ((rVar.f386752a & 1) != 0) {
                            ((C89492cd) this.f266992c.mo27525b()).mo83385aa(this.f266998i, rVar.f386753b);
                        } else {
                            C59104x c8 = f266990b.mo56225c();
                            c8.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                            ((C59052c) ((C59052c) c8).mo56372aa(15038)).mo56386p("Missing deviceActionModelId");
                        }
                    } catch (IOException e7) {
                        C59104x c9 = f266990b.mo56225c();
                        c9.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c9).mo56382g(e7)).mo56372aa(15037)).mo56386p("Error parsing received proto");
                    }
                } else if (i5 == 1) {
                    try {
                        C142532x xVar = (C142532x) C62942bv.parseFrom((C62942bv) C142532x.f386761c, bArr2, C62921ba.m95368a());
                        if ((xVar.f386763a & 1) != 0) {
                            C89492cd cdVar2 = (C89492cd) this.f266992c.mo27525b();
                            String str3 = this.f266998i;
                            C142531w wVar = xVar.f386764b;
                            if (wVar == null) {
                                wVar = C142531w.f386756d;
                            }
                            cdVar2.mo83412r(str3, wVar);
                        } else {
                            C59104x c10 = f266990b.mo56225c();
                            c10.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                            ((C59052c) ((C59052c) c10).mo56372aa(15036)).mo56386p("Missing ActionState");
                        }
                    } catch (IOException e8) {
                        C59104x c11 = f266990b.mo56225c();
                        c11.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c11).mo56382g(e8)).mo56372aa(15035)).mo56386p("Error parsing received proto");
                    }
                } else {
                    C59104x c12 = f266990b.mo56225c();
                    c12.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                    ((C59052c) ((C59052c) c12).mo56372aa(15034)).mo56387q("Unsupported message type: %d", i5);
                }
            } else if (i4 == 1) {
                if (i5 == 11) {
                    try {
                        C142372cx cxVar = (C142372cx) C62942bv.parseFrom((C62942bv) C142372cx.f386324d, bArr2, C62921ba.m95368a());
                        C142371cw a8 = C142371cw.m231070a(cxVar.f386327b);
                        if (a8 == null) {
                            a8 = C142371cw.ROLE_CHANGE_NONE;
                        }
                        if (a8.equals(C142371cw.ROLE_CHANGE_FORCE)) {
                            long millis = f266991k.toMillis();
                            if ((cxVar.f386326a & 2) != 0) {
                                millis = (long) cxVar.f386328c;
                            }
                            C59104x b2 = f266990b.mo56224b();
                            b2.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                            ((C59052c) ((C59052c) b2).mo56372aa(15054)).mo56388r("TWS role change request with delay: %d", millis);
                            Intent intent = new Intent("bisto_force_role_change");
                            intent.putExtra("key_device_id", this.f266998i);
                            intent.putExtra("bisto_role_change_delay", millis);
                            this.f267000l.execute(new C95422ds(this, intent));
                            return;
                        }
                        C59104x c13 = f266990b.mo56225c();
                        c13.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        C59052c cVar = (C59052c) ((C59052c) c13).mo56372aa(15052);
                        C142371cw a9 = C142371cw.m231070a(cxVar.f386327b);
                        if (a9 == null) {
                            a9 = C142371cw.ROLE_CHANGE_NONE;
                        }
                        cVar.mo56389s("TWS role change request not supported: %s", a9);
                        return;
                    } catch (C62974ct e9) {
                        C59104x c14 = f266990b.mo56225c();
                        c14.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
                        ((C59052c) ((C59052c) ((C59052c) c14).mo56382g(e9)).mo56372aa(15053)).mo56386p("Error in role change proto");
                        e9.printStackTrace();
                        return;
                    }
                }
                this.f267000l.execute(new C95423dt(this, i3, i5, bArr2));
            }
        }
        i3 = i4;
        this.f267000l.execute(new C95423dt(this, i3, i5, bArr2));
    }

    /* renamed from: c */
    public final boolean mo83498c(int i, int i2) {
        return i == 2 && i2 == C142455fz.f386557b.f386567k;
    }

    /* renamed from: d */
    public final void mo83499d() {
        C89655j.m145957a("IOException when create RFCOMM socket");
    }
}
