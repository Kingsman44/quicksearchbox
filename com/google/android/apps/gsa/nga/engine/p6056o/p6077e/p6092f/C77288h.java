package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import android.os.Build;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52120fz;
import com.google.assistant.p3897e.p3921j.C52124gc;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.h */
/* compiled from: PG */
public final class C77288h implements C76591c {

    /* renamed from: a */
    private final C91142g f213171a;

    /* renamed from: b */
    private final C81515c f213172b;

    public C77288h(C91142g gVar, C81515c cVar) {
        this.f213171a = gVar;
        this.f213172b = cVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.POWER_OFF));
        h.mo72277g("Turn_off_device", C90126fx.f251367hV);
        h.mo72244c(C58485gu.m89846n("Turn_off_device"));
        ((C76541a) h).f211766c = 10107;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C51809dy dyVar;
        if (!this.f213171a.mo85405j(C90126fx.f251367hV)) {
            return C81442m.f222851a;
        }
        if (Build.VERSION.SDK_INT < 31) {
            dyVar = t.r(this.f213172b.mo75121a(nVar.mo71342q()).getString(R.string.nga_phone_power_off_guide_text, new Object[0]));
        } else {
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_op.PowerControlArgs";
            C52120fz fzVar = (C52120fz) C52124gc.f136780c.createBuilder();
            fzVar.copyOnWrite();
            C52124gc gcVar = (C52124gc) fzVar.instance;
            gcVar.f136783b = 1;
            gcVar.f136782a = 1 | gcVar.f136782a;
            C63088z byteString = ((C52124gc) fzVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            dyVar = t.a("device.POWER", "device_setting_params", (C52230ka) jzVar.build());
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C81442m.m129557s(lVar, dyVar);
        lVar.mo74319k(49018);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
