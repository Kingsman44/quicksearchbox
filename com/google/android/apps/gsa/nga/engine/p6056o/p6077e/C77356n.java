package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.TelephonyManager;
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
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80338cf;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.n */
/* compiled from: PG */
public final class C77356n implements C76591c {

    /* renamed from: a */
    public static final C58485gu f213327a = C58485gu.m89846n("Initiate_call");

    /* renamed from: b */
    private final Context f213328b;

    /* renamed from: c */
    private final C77280f f213329c;

    /* renamed from: d */
    private final C83216f f213330d;

    public C77356n(Context context, C77280f fVar, C83251g gVar) {
        this.f213328b = context;
        this.f213329c = fVar;
        this.f213330d = gVar.mo76652a(C82831ca.EMERGENCY_CALL);
    }

    /* renamed from: c */
    static boolean m124127c(Context context, String str) {
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        return ((TelephonyManager) systemService).isEmergencyNumber(str);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.EMERGENCY_CALL));
        h.mo72277g("Initiate_call", C90126fx.f251275fj);
        h.mo72244c(f213327a);
        ((C76541a) h).f211766c = 10503;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C58485gu d = bgVar.mo72262d("callee", "PhoneNumberContact", "contact_id");
        if (d.isEmpty()) {
            this.f213330d.mo76648a(nVar.mo71336k(), C82835ce.NO_PHONE_NUMBER, C83044e.f226656a);
            return C60856cj.m92900i(C80401n.f220656k);
        } else if (d.size() > 1) {
            this.f213330d.mo76648a(nVar.mo71336k(), C82835ce.MULTIPLE_PHONE_NUMBERS, C83044e.f226656a);
            return C60856cj.m92900i(C80401n.f220656k);
        } else {
            String str = (String) d.get(0);
            if (!m124127c(this.f213328b, str)) {
                this.f213330d.mo76648a(nVar.mo71336k(), C82835ce.NOT_EMERGENCY_PHONE_NUMBER, C83044e.f226656a);
                return C60856cj.m92900i(C80401n.f220656k);
            }
            C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
            lVar.copyOnWrite();
            ((C80401n) lVar.instance).f220664g = C80403p.m128150a(3);
            C77280f fVar = this.f213329c;
            C83320io k = nVar.mo71336k();
            t tVar = fVar.f213156a;
            C81442m.m129557s(lVar, t.u(new Intent("android.intent.action.CALL_PRIVILEGED", Uri.parse("tel:".concat(String.valueOf(str)))), 1, k, false, false));
            lVar.mo74319k(23192);
            C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
            C80338cf cfVar = C80338cf.f220449a;
            aoVar.copyOnWrite();
            C80295aq aqVar = (C80295aq) aoVar.instance;
            cfVar.getClass();
            aqVar.f220360b = cfVar;
            aqVar.f220359a = 7;
            C81442m.m129555q(lVar, aoVar);
            return C60856cj.m92900i((C80401n) lVar.build());
        }
    }
}
