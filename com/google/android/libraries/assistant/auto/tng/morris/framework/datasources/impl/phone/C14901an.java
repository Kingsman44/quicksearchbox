package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.car.C143100al;
import com.google.android.gms.car.CarCall;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14117ar;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14430iy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14439jg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14440jh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14504lr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14509lw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14511ly;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14514ma;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14516mc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14518me;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14520mg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14522mi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14523mj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.an */
/* compiled from: PG */
public final class C14901an implements C14781a {

    /* renamed from: a */
    public static final C59071e f44813a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.an");

    /* renamed from: b */
    public final C14907f f44814b;

    /* renamed from: c */
    public final C14905d f44815c;

    /* renamed from: d */
    public final C14986h f44816d;

    /* renamed from: e */
    public final ConcurrentHashMap f44817e = new ConcurrentHashMap();

    /* renamed from: f */
    public final C14117ar f44818f;

    /* renamed from: g */
    public final C14117ar f44819g;

    /* renamed from: h */
    public C60870cx f44820h;

    /* renamed from: i */
    final C143100al f44821i = new C14899al(this);

    /* renamed from: j */
    private final C60888db f44822j;

    public C14901an(C14986h hVar, C14907f fVar, C14905d dVar, C60888db dbVar, C14117ar arVar, C14117ar arVar2) {
        this.f44816d = hVar;
        this.f44814b = fVar;
        this.f44815c = dVar;
        this.f44822j = dbVar;
        this.f44818f = arVar;
        this.f44819g = arVar2;
    }

    /* renamed from: j */
    public static int m31327j(CarCall carCall) {
        int i = carCall.f387935e;
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 6;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 7) {
            return 7;
        }
        if (i == 9) {
            return 8;
        }
        if (i == 10) {
            return 9;
        }
        C59104x c = f44813a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
        ((C59052c) ((C59052c) c).mo56372aa(45761)).mo56387q("Error discerning new phone state. State: %d", carCall.f387935e);
        return 2;
    }

    /* renamed from: k */
    private final CarCall m31328k(int i) {
        CarCall carCall = (CarCall) this.f44817e.get(Integer.valueOf(i));
        if (carCall == null) {
            C59104x c = f44813a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
            ((C59052c) ((C59052c) c).mo56372aa(45760)).mo56386p("Could not find CarCall for ID, firing PhoneErrorEvent.");
            C14986h hVar = this.f44816d;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14430iy iyVar = (C14430iy) C14477kr.f43756c.createBuilder();
            C14439jg jgVar = (C14439jg) C14440jh.f43680b.createBuilder();
            jgVar.copyOnWrite();
            ((C14440jh) jgVar.instance).f43682a = i;
            iyVar.copyOnWrite();
            C14477kr krVar = (C14477kr) iyVar.instance;
            C14440jh jhVar = (C14440jh) jgVar.build();
            jhVar.getClass();
            krVar.f43759b = jhVar;
            krVar.f43758a = 16;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14477kr krVar2 = (C14477kr) iyVar.build();
            krVar2.getClass();
            lfVar.f43801d = krVar2;
            lfVar.f43800c = 4;
            hVar.mo21875g((C14492lf) gtVar.build());
        }
        return carCall;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final void mo21503c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44814b.mo21827i(this.f44821i);
        this.f44814b.mo21824f();
        this.f44816d.mo21875g(C14742l.m31046b(this.f44815c.mo21813a()));
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44817e.clear();
        this.f44814b.mo21831m();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final void mo21810f(CarCall carCall) {
        String f = C15388p.m32018f(carCall);
        if (f == null) {
            f = BuildConfig.FLAVOR;
        }
        this.f44816d.mo21875g(C14742l.m31054j(carCall.f387931a, m31327j(carCall), f, carCall.f387936f.f387943d));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        return C14221be.f43041c;
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        return C60856cj.m92900i(C14782b.FAILED);
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
        C14523mj mjVar;
        int i;
        C14504lr lrVar;
        C14509lw lwVar;
        C14511ly lyVar;
        C14520mg mgVar;
        C14520mg mgVar2;
        C14522mi miVar;
        C14518me meVar;
        C14516mc mcVar;
        C14514ma maVar;
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.PHONE_ACTION_REQUEST) {
            if (bcVar.f43038a == 6) {
                mjVar = (C14523mj) bcVar.f43039b;
            } else {
                mjVar = C14523mj.f43900c;
            }
            C58976aa aaVar = C58975e.f156826a;
            int i2 = mjVar.f43902a;
            int i3 = mjVar.f43902a;
            switch (i3) {
                case 0:
                    i = 10;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case 9:
                    i = 9;
                    break;
                default:
                    i = 0;
                    break;
            }
            int i4 = i - 1;
            if (i != 0) {
                switch (i4) {
                    case 0:
                        if (i3 == 1) {
                            lrVar = (C14504lr) mjVar.f43903b;
                        } else {
                            lrVar = C14504lr.f43872b;
                        }
                        CarCall k = m31328k(lrVar.f43874a);
                        if (k == null) {
                            C59104x c = f44813a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
                            ((C59052c) ((C59052c) c).mo56372aa(45767)).mo56386p("Cannot answer call, unable to find corresponding CarCall");
                            return;
                        }
                        this.f44814b.mo21820b(k);
                        return;
                    case 1:
                        if (i3 == 2) {
                            lwVar = (C14509lw) mjVar.f43903b;
                        } else {
                            lwVar = C14509lw.f43877b;
                        }
                        CarCall k2 = m31328k(lwVar.f43879a);
                        if (k2 == null) {
                            C59104x c2 = f44813a.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
                            ((C59052c) ((C59052c) c2).mo56372aa(45768)).mo56386p("Cannot decline call, unable to find corresponding CarCall");
                            return;
                        }
                        this.f44814b.mo21828j(k2);
                        return;
                    case 2:
                        if (i3 == 3) {
                            lyVar = (C14511ly) mjVar.f43903b;
                        } else {
                            lyVar = C14511ly.f43880b;
                        }
                        CarCall k3 = m31328k(lyVar.f43882a);
                        if (k3 == null) {
                            C59104x c3 = f44813a.mo56225c();
                            c3.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
                            ((C59052c) ((C59052c) c3).mo56372aa(45769)).mo56386p("Cannot end call, unable to find corresponding CarCall");
                            return;
                        }
                        this.f44814b.mo21822d(k3);
                        return;
                    case 3:
                        if (i3 == 4) {
                            mgVar = (C14520mg) mjVar.f43903b;
                        } else {
                            mgVar = C14520mg.f43893c;
                        }
                        CarCall k4 = m31328k(mgVar.f43895a);
                        if (k4 == null) {
                            C59104x c4 = f44813a.mo56225c();
                            c4.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
                            ((C59052c) ((C59052c) c4).mo56372aa(45770)).mo56386p("Cannot toggle hold, unable to find corresponding CarCall");
                            return;
                        }
                        if (mjVar.f43902a == 4) {
                            mgVar2 = (C14520mg) mjVar.f43903b;
                        } else {
                            mgVar2 = C14520mg.f43893c;
                        }
                        if (mgVar2.f43896b) {
                            this.f44814b.mo21823e(k4);
                            return;
                        } else {
                            this.f44814b.mo21833o(k4);
                            return;
                        }
                    case 4:
                        C14907f fVar2 = this.f44814b;
                        if (i3 == 5) {
                            miVar = (C14522mi) mjVar.f43903b;
                        } else {
                            miVar = C14522mi.f43897b;
                        }
                        fVar2.mo21830l(miVar.f43899a);
                        return;
                    case 5:
                        if (i3 == 6) {
                            meVar = (C14518me) mjVar.f43903b;
                        } else {
                            meVar = C14518me.f43890b;
                        }
                        C14594p a = C14594p.m30642a(meVar.f43892a);
                        if (a == null) {
                            a = C14594p.UNRECOGNIZED;
                        }
                        a.name();
                        if (!this.f44815c.mo21818f(a)) {
                            C59104x c5 = f44813a.mo56225c();
                            c5.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
                            ((C59052c) ((C59052c) c5).mo56372aa(45774)).mo56389s("#streamToAudioRoute(): audioRouteType not available: %s", a.name());
                            return;
                        }
                        this.f44814b.mo21829k(C15388p.m32014a(a));
                        return;
                    case 6:
                        if (i3 == 7) {
                            mcVar = (C14516mc) mjVar.f43903b;
                        } else {
                            mcVar = C14516mc.f43886c;
                        }
                        CarCall k5 = m31328k(mcVar.f43888a);
                        if (k5 == null) {
                            C59104x c6 = f44813a.mo56225c();
                            c6.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
                            ((C59052c) ((C59052c) c6).mo56372aa(45762)).mo56386p("Cannot play Dtmf tone, unable to find corresponding CarCall");
                            return;
                        }
                        this.f44814b.mo21826h(k5, mcVar.f43889b.charAt(0));
                        C60870cx cxVar = this.f44820h;
                        if (cxVar != null) {
                            cxVar.cancel(true);
                            this.f44820h = null;
                        }
                        C60872cz e = this.f44822j.mo29165e(C14898ak.f44809a, 250, TimeUnit.MILLISECONDS);
                        this.f44820h = e;
                        C60856cj.m92911t(e, C47810es.m84974n(new C14900am(this, k5)), C60826bg.f164896a);
                        return;
                    case 7:
                        if (i3 == 8) {
                            maVar = (C14514ma) mjVar.f43903b;
                        } else {
                            maVar = C14514ma.f43883b;
                        }
                        String str = maVar.f43885a;
                        if (!str.isEmpty()) {
                            this.f44814b.mo21825g(str);
                            return;
                        }
                        C59104x c7 = f44813a.mo56225c();
                        c7.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
                        ((C59052c) ((C59052c) c7).mo56372aa(45771)).mo56386p("Unable to place call, empty phone number.");
                        return;
                    case 8:
                        this.f44814b.mo21821c();
                        return;
                    case 9:
                        C59104x c8 = f44813a.mo56225c();
                        c8.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
                        ((C59052c) ((C59052c) c8).mo56372aa(45766)).mo56386p("Phone action request not set, dropping request.");
                        return;
                    default:
                        return;
                }
            } else {
                throw null;
            }
        } else {
            C59104x c9 = f44813a.mo56225c();
            c9.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
            ((C59052c) ((C59052c) c9).mo56372aa(45772)).mo56389s("sendFireAndForgetRequest(), request.getRequestCase() should be PHONE_ACTION_REQUEST but was: %s", C14218bb.m30579a(bcVar.f43038a));
        }
    }
}
