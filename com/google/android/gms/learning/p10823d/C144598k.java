package com.google.android.gms.learning.p10823d;

import com.google.android.gms.learning.dynamite.training.C144706bv;
import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29702l;
import com.google.android.libraries.micore.learning.p2258a.C29703m;
import com.google.android.libraries.micore.learning.p2258a.C29704n;
import com.google.android.libraries.micore.learning.p2258a.C29705o;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.android.libraries.micore.learning.p2258a.C29707q;
import com.google.android.libraries.micore.learning.p2258a.C29708r;
import com.google.common.base.C58835az;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.learning.d.k */
/* compiled from: PG */
public final /* synthetic */ class C144598k implements C144587ac {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391271a;

    /* renamed from: b */
    public final /* synthetic */ String f391272b;

    /* renamed from: c */
    public final /* synthetic */ C144706bv f391273c;

    /* renamed from: d */
    public final /* synthetic */ int f391274d;

    /* renamed from: e */
    public final /* synthetic */ int f391275e;

    public /* synthetic */ C144598k(C144588ad adVar, String str, C144706bv bvVar, int i, int i2) {
        this.f391271a = adVar;
        this.f391272b = str;
        this.f391273c = bvVar;
        this.f391274d = i;
        this.f391275e = i2;
    }

    /* renamed from: a */
    public final C58835az mo120064a(C29708r rVar) {
        C58835az azVar;
        C63042fg fgVar;
        C144588ad adVar = this.f391271a;
        String str = this.f391272b;
        C144706bv bvVar = this.f391273c;
        int i = this.f391274d;
        int i2 = this.f391275e;
        C29707q qVar = (C29707q) rVar.toBuilder();
        C29706p g = C144588ad.m235084g(qVar, str, bvVar, i);
        if (g == null) {
            return new C58835az(rVar, true);
        }
        C29697g c = bvVar.mo120151c();
        if (c.f80435d == null) {
            adVar.f391253i.mo120062a(g);
            adVar.f391251g.mo120056h(1131);
            adVar.mo120075r(c);
            azVar = new C58835az((C29708r) qVar.build(), true);
        } else if (!C144588ad.m235086p(c) || i2 != 0) {
            long b = C144588ad.m235080b(bvVar.mo120151c());
            long a = adVar.f391252h.mo34859a();
            C29703m mVar = c.f80435d;
            if (mVar == null) {
                mVar = C29703m.f80444c;
            }
            int a2 = C29702l.m54787a(mVar.f80446a);
            if (a2 == 0) {
                a2 = 1;
            }
            int i3 = 2;
            if (i2 == 2) {
                fgVar = C62953e.m95484i(TimeUnit.SECONDS.toMillis(adVar.f391250f.mo120039s()) + a);
            } else {
                fgVar = C62953e.m95484i(adVar.mo120076t(i2 == 0 ? b : TimeUnit.SECONDS.toMillis(adVar.f391250f.mo119942C()), a2, false) + a);
            }
            if (i2 == 0) {
                i3 = 5;
            } else if (i2 == 1) {
                i3 = 6;
            } else if (i2 == 2) {
                i3 = 7;
            }
            C29704n nVar = (C29704n) g.toBuilder();
            C63042fg i4 = C62953e.m95484i(a);
            nVar.copyOnWrite();
            i4.getClass();
            ((C29706p) nVar.instance).f80458i = i4;
            nVar.copyOnWrite();
            fgVar.getClass();
            ((C29706p) nVar.instance).f80459j = fgVar;
            nVar.copyOnWrite();
            ((C29706p) nVar.instance).f80462m = C29705o.m54788a(i3);
            C29706p pVar = (C29706p) nVar.build();
            qVar.mo34848a(pVar);
            C29708r rVar2 = (C29708r) qVar.build();
            if (adVar.f391253i.mo120063b(pVar, 0)) {
                return new C58835az(rVar2, true);
            }
            azVar = new C58835az(rVar2, false);
        } else {
            adVar.f391253i.mo120062a(g);
            adVar.f391251g.mo120056h(1132);
            adVar.mo120075r(c);
            azVar = new C58835az((C29708r) qVar.build(), true);
        }
        return azVar;
    }
}
