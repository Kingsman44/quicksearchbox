package com.google.android.apps.gsa.staticplugins.p7371ae;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.location.ImproveLocationRequest;
import com.google.android.apps.gsa.location.ad;
import com.google.android.apps.gsa.location.z;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6823b.C86360a;
import com.google.android.apps.gsa.search.core.service.C86649bp;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90951q;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.gcoreclient.p1788q.C21606a;
import com.google.android.libraries.gcoreclient.p1788q.p1789a.C21624k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60578vb;
import com.google.common.p4552o.C60580vd;
import com.google.common.p4552o.C60583vg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p395al.p417d.p418a.C8588o;
import com.google.p4449cd.C57954d;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import com.google.p4449cd.p4460h.p4461a.C58022i;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.p5295b.C68283d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.bu */
/* compiled from: PG */
public final class C93762bu {

    /* renamed from: a */
    static final long f261665a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public static final /* synthetic */ int f261666b = 0;

    /* renamed from: c */
    private static final C59071e f261667c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ae.bu");

    /* renamed from: a */
    static ad m154721a(C93742ba baVar) {
        return baVar.f261615b.mo70988a().mo70995d();
    }

    /* renamed from: b */
    static C91079f m154722b(Context context, C91097g gVar) {
        return new ProxyPermissionsRequester(gVar, context);
    }

    /* renamed from: c */
    static C118826c m154723c(C60580vd vdVar, ad adVar) {
        ImproveLocationRequest.ImproveLocationDialogMetrics a;
        synchronized (adVar) {
            a = adVar.a();
        }
        C60578vb vbVar = (C60578vb) C60583vg.f164342e.createBuilder();
        vbVar.copyOnWrite();
        C60583vg vgVar = (C60583vg) vbVar.instance;
        vgVar.f164345b = vdVar.f164340m;
        vgVar.f164344a |= 1;
        int k = a.mo71003k();
        vbVar.copyOnWrite();
        C60583vg vgVar2 = (C60583vg) vbVar.instance;
        int i = k - 1;
        if (k != 0) {
            vgVar2.f164347d = i;
            vgVar2.f164344a |= 4;
            C60583vg vgVar3 = (C60583vg) vbVar.build();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 636;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            vgVar3.getClass();
            ufVar2.f164108aO = vgVar3;
            ufVar2.f164251f |= 8;
            String h = a.mo71000h();
            if (h != null) {
                tzVar.copyOnWrite();
                C60555uf ufVar3 = (C60555uf) tzVar.instance;
                ufVar3.f164093a |= 4;
                ufVar3.f164259n = h;
            }
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            return C118826c.f331422a;
        }
        throw null;
    }

    /* renamed from: d */
    static C118826c m154724d(C93742ba baVar, C60580vd vdVar, C68283d dVar) {
        C60870cx cxVar;
        if (vdVar == C60580vd.TRIGGER) {
            cxVar = dVar.mo60297gq();
        } else {
            cxVar = C90951q.m148569e(vdVar);
        }
        baVar.f261616c.mo57358p(cxVar);
        return C118826c.f331422a;
    }

    /* renamed from: e */
    static C118826c m154725e(C93742ba baVar, C60580vd vdVar, C93731aq aqVar, ad adVar, C68283d dVar) {
        C60580vd vdVar2 = C60580vd.DISPLAYED;
        switch (vdVar.ordinal()) {
            case 0:
            case 10:
                return C118826c.f331422a;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                baVar.f261617d.mo57356n(false);
                dVar.mo60297gq();
                return C118826c.f331422a;
            case 7:
                synchronized (adVar) {
                    adVar.f(vdVar);
                }
                aqVar.mo88165b(false, adVar.a());
                return C118826c.f331422a;
            case 9:
                synchronized (adVar) {
                    adVar.f(vdVar);
                }
                aqVar.mo88165b(true, adVar.a());
                return C118826c.f331422a;
            default:
                C59104x c = f261667c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "LocationPromptProcessor");
                ((C59052c) ((C59052c) c).mo56372aa(19050)).mo56386p("Prompt state does not exist.");
                return C118826c.f331422a;
        }
    }

    /* renamed from: f */
    static C60580vd m154726f(C93742ba baVar, boolean z, boolean z2, ad adVar) {
        C8588o c = baVar.f261615b.mo70990c();
        if ((c.f29721a & 1) != 0 && c.f29722b == 0) {
            synchronized (adVar) {
                adVar.c(true);
            }
        }
        if (z) {
            return C60580vd.BACKOFF_AFTER_REJECT;
        }
        if (z2) {
            return C60580vd.BACKOFF_AFTER_ACCEPT;
        }
        return C60580vd.TRIGGER;
    }

    /* renamed from: g */
    static C60870cx m154727g(C93742ba baVar, z zVar, C21370a aVar, ad adVar, boolean z) {
        long c = aVar.mo26871c();
        synchronized (adVar) {
            adVar.j(c);
            adVar.i(z);
        }
        if (baVar.f261615b.mo70988a().mo71003k() == 5) {
            return zVar.d((C21606a) zVar.d.mo17428b(), z);
        }
        return zVar.d((C21606a) zVar.d.mo17428b(), z);
    }

    /* renamed from: h */
    static C60870cx m154728h(C68283d dVar, C93713a aVar, ad adVar) {
        synchronized (adVar) {
            adVar.b(aVar.f261529a);
        }
        return dVar.mo60297gq();
    }

    /* renamed from: i */
    static C60870cx m154729i(C60580vd vdVar, ad adVar, C86603d dVar, C86360a aVar) {
        if (vdVar == C60580vd.APP_JUST_GRANTED_DEVICE_ALREADY_GRANTED) {
            return dVar.mo54598b(new C93760bs(aVar, adVar));
        }
        return C118826c.f331423b;
    }

    /* renamed from: j */
    static C57954d m154730j(C68283d dVar) {
        return new C57954d(dVar.mo60297gq());
    }

    /* renamed from: k */
    static boolean m154731k(C85881bd bdVar) {
        return !bdVar.mo79516g();
    }

    /* renamed from: l */
    static C60870cx m154732l(C58022i iVar, ad adVar, C93731aq aqVar, C85881bd bdVar, C91079f fVar) {
        if (bdVar.mo79515f()) {
            return C90951q.m148569e(C93761bt.GRANTED);
        }
        SettableFuture settableFuture = new SettableFuture();
        iVar.mo54598b(new C93757bp(fVar, new C93756bo(settableFuture, adVar, aqVar)));
        return settableFuture;
    }

    /* renamed from: m */
    static C60870cx m154733m(C21370a aVar, SharedPreferences sharedPreferences, C58009ae aeVar) {
        return aeVar.mo54597a(new C93758bq(aVar, sharedPreferences));
    }

    /* renamed from: n */
    static C60870cx m154734n(C93742ba baVar, C21370a aVar, SharedPreferences sharedPreferences, C58009ae aeVar) {
        return aeVar.mo54597a(new C93759br(sharedPreferences, baVar, aVar));
    }

    /* renamed from: o */
    static C60580vd m154735o(C21624k kVar, C93761bt btVar, C21370a aVar, C86649bp bpVar, ad adVar) {
        ImproveLocationRequest.ImproveLocationDialogMetrics a;
        if (btVar == C93761bt.DENIED) {
            C58976aa aaVar = C58975e.f156826a;
            return C60580vd.APP_LEVEL_MISSING;
        } else if (kVar == null) {
            C59104x c = f261667c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LocationPromptProcessor");
            ((C59052c) ((C59052c) c).mo56372aa(19053)).mo56386p("Null LocationSettingsResult.");
            return C60580vd.SETTINGS_NOT_AVAILABLE;
        } else {
            C21551h c2 = kVar.mo26997c();
            int a2 = c2.mo26998a();
            if (a2 == 0) {
                C58976aa aaVar2 = C58975e.f156826a;
                if (btVar == C93761bt.JUST_GRANTED) {
                    return C60580vd.APP_JUST_GRANTED_DEVICE_ALREADY_GRANTED;
                }
                return C60580vd.SETTINGS_SATISFIED;
            } else if (a2 == 6) {
                C58976aa aaVar3 = C58975e.f156826a;
                if (c2.mo26999b() == null) {
                    return C60580vd.SETTINGS_NOT_AVAILABLE;
                }
                long c3 = aVar.mo26871c();
                synchronized (adVar) {
                    adVar.d(c3);
                    a = adVar.a();
                }
                if (!bpVar.mo80262a(1, 2, new StartActivityForResultEventCompoundParcelable(c2.mo26999b().getIntentSender(), a))) {
                    return C60580vd.SETTINGS_NOT_AVAILABLE;
                }
                if (btVar == C93761bt.JUST_GRANTED) {
                    return C60580vd.APP_JUST_GRANTED_LSD_DISPLAYED;
                }
                return C60580vd.DISPLAYED;
            } else if (a2 != 8502) {
                return C60580vd.SETTINGS_NOT_AVAILABLE;
            } else {
                return C60580vd.SETTINGS_NOT_AVAILABLE;
            }
        }
    }

    /* renamed from: p */
    static C118826c m154736p() {
        return C118826c.f331422a;
    }
}
