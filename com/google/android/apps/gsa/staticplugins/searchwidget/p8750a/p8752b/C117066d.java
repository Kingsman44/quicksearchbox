package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117090b;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.d */
/* compiled from: PG */
public final class C117066d extends C23056g {

    /* renamed from: a */
    public final C117090b f325025a;

    /* renamed from: b */
    public C117056ad f325026b;

    public C117066d(C23052c cVar, C117090b bVar) {
        super(cVar);
        this.f325025a = bVar;
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        if ("CLOSE".equals(str)) {
            if (((Integer) ((C117069g) this.f325025a).f325030a.f63720e).intValue() == 1) {
                ((C117069g) this.f325025a).f325030a.mo28730f(0, false);
                return;
            }
            C117056ad adVar = this.f325026b;
            adVar.getClass();
            adVar.f324997a.mo103124f();
        } else if ("THEME_CHANGED".equals(str)) {
            mo103128f(bundle.getInt("KEY_THEME"));
        } else if ("HUE_CHANGED".equals(str)) {
            ((C117069g) this.f325025a).f325032c.mo28730f(Integer.valueOf(bundle.getInt("KEY_CUSTOM_HUE")), false);
        } else if ("SATURATION_AND_VALUE_CHANGED".equals(str)) {
            ((C117069g) this.f325025a).f325033d.mo28730f(Integer.valueOf(bundle.getInt("KEY_CUSTOM_SATURATION_VALUE")), false);
        } else if ("CUSTOM_COLOR_CHANGED".equals(str)) {
            mo103127e(bundle.getInt("KEY_CUSTOM_COLOR"));
        }
    }

    /* renamed from: e */
    public final void mo103127e(int i) {
        C23251a aVar = ((C117069g) this.f325025a).f325031b;
        Integer valueOf = Integer.valueOf(i);
        aVar.mo28730f(valueOf, false);
        C117056ad adVar = this.f325026b;
        adVar.getClass();
        ((C117077o) adVar.f324997a.f325004d.f325094b.f325013a).f325063a.mo28730f(valueOf, false);
        C117060ah ahVar = adVar.f324997a;
        ((C117076n) ahVar.f325001a).f325061j.mo28730f(Boolean.valueOf(ahVar.f325004d.f325094b.mo103125e()), false);
    }

    /* renamed from: f */
    public final void mo103128f(int i) {
        if (i == 3) {
            ((C117069g) this.f325025a).f325030a.mo28730f(1, false);
            i = 3;
        }
        C23251a aVar = ((C117069g) this.f325025a).f325034e;
        Integer valueOf = Integer.valueOf(i);
        aVar.mo28730f(valueOf, false);
        C117056ad adVar = this.f325026b;
        adVar.getClass();
        ((C117077o) adVar.f324997a.f325004d.f325094b.f325013a).f325070h.mo28730f(valueOf, false);
        C117060ah ahVar = adVar.f324997a;
        ((C117076n) ahVar.f325001a).f325061j.mo28730f(Boolean.valueOf(ahVar.f325004d.f325094b.mo103125e()), false);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        int i = 1;
        C89283z zVar = (C89283z) C23245b.m43557b(protoParcelable, C89283z.f242073n.getParserForType(), C62921ba.m95368a(), true);
        C23251a aVar = ((C117069g) this.f325025a).f325034e;
        zVar.getClass();
        int a = C89272o.m145215a(zVar.f242083i);
        if (a != 0) {
            i = a;
        }
        aVar.mo28730f(Integer.valueOf(i - 1), false);
        ((C117069g) this.f325025a).f325030a.mo28730f(0, false);
        ((C117069g) this.f325025a).f325031b.mo28730f(Integer.valueOf(zVar.f242087m), false);
    }
}
