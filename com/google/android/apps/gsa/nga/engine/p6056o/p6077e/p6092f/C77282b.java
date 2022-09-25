package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.b */
/* compiled from: PG */
public final class C77282b implements C76591c {

    /* renamed from: a */
    private static final C58974d f213159a = C58974d.m91136j();

    /* renamed from: b */
    private static final C58528ij f213160b = C58528ij.m90012L(C63490p.DATA_ROAMING, C63490p.LOCATION, C63490p.CONTINUED_CONVERSATION);

    /* renamed from: c */
    private static final C58528ij f213161c = C58528ij.m90014N(C63490p.ACCESSIBILITY, C63490p.ADAPTIVE_BRIGHTNESS, C63490p.AIRPLANE_MODE, C63490p.AUTO_ROTATE, C63490p.HOT_SPOT);

    /* renamed from: d */
    private static final C58528ij f213162d = new C58759qy(C63490p.DARK_THEME);

    /* renamed from: e */
    private final C91142g f213163e;

    /* renamed from: f */
    private final C77301u f213164f;

    public C77282b(C91142g gVar, C77301u uVar) {
        this.f213163e = gVar;
        this.f213164f = uVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.ENABLE_DISABLE));
        h.mo72277g("Turn_device_setting_on", C90126fx.f251250fK);
        h.mo72277g("Turn_device_setting_off", C90126fx.f251250fK);
        h.mo72277g("Connect_bluetooth", C90126fx.f251250fK);
        h.mo72277g("Disconnect_bluetooth", C90126fx.f251250fK);
        h.mo72244c(C58485gu.m89849q("Turn_device_setting_on", "Turn_device_setting_off", "Connect_bluetooth", "Disconnect_bluetooth"));
        ((C76541a) h).f211766c = 10101;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        Optional j = bgVar.mo72268j("setting");
        if (j.isEmpty()) {
            ((C58970a) ((C58970a) f213159a.mo56225c()).mo56372aa(3848)).mo56386p("No device setting set");
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C63490p pVar = (C63490p) j.get();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(3);
        if ((f213160b.contains(pVar) || pVar == C63490p.DARK_THEME || (this.f213163e.mo85405j(C90126fx.f251404iF) && f213161c.contains(pVar))) && this.f213164f.mo72513r(lVar, pVar, nVar, this.f213163e)) {
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        if (((C58759qy) f213162d).f156534a.equals(pVar) && this.f213164f.mo72512q(lVar, pVar, nVar)) {
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        boolean z = bgVar.f211838b.mo73901d("Turn_device_setting_on") || bgVar.f211838b.mo73901d("Connect_bluetooth");
        if (this.f213164f.mo72511o(pVar)) {
            this.f213164f.mo72502f(lVar, nVar.mo71342q(), pVar, z);
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        if (z) {
            this.f213164f.mo72503g(lVar, pVar, true);
            this.f213164f.mo72505i(pVar, lVar, nVar.mo71342q());
        } else if (bgVar.f211838b.mo73901d("Turn_device_setting_off") || bgVar.f211838b.mo73901d("Disconnect_bluetooth")) {
            this.f213164f.mo72503g(lVar, pVar, false);
            this.f213164f.mo72505i(pVar, lVar, nVar.mo71342q());
        } else {
            ((C58970a) ((C58970a) f213159a.mo56225c()).mo56372aa(3846)).mo56354G("Unknown intent: %s, expected: %s", bgVar.f211838b, mo71711a().mo72250b());
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        if (pVar == C63490p.BATTERY_SAVER) {
            if (!this.f213163e.mo85405j(C90126fx.f251762ot)) {
                lVar.copyOnWrite();
                ((C80401n) lVar.instance).f220663f = true;
            }
            C77301u uVar = this.f213164f;
            Locale q = nVar.mo71342q();
            if (uVar.mo72510n()) {
                String string = uVar.f213204b.mo75121a(q).getString(true != z ? R.string.nga_phone_settings_disable_battery_saver_while_charging : R.string.nga_phone_settings_enable_battery_saver_while_charging, new Object[0]);
                t tVar = uVar.f213203a;
                C81442m.m129557s(lVar, t.r(string));
                return C60856cj.m92900i((C80401n) lVar.build());
            }
        }
        if (this.f213164f.mo72508l(lVar, pVar, nVar.mo71342q())) {
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        if (this.f213164f.mo72509m(lVar, pVar, nVar.mo71342q())) {
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        if (pVar == C63490p.FLASHLIGHT) {
            this.f213164f.mo72500d(lVar, nVar.mo71342q(), z);
        }
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
