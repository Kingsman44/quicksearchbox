package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p6995aq.C89280w;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117092d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.r */
/* compiled from: PG */
public final class C117080r extends C23056g {

    /* renamed from: a */
    public C117059ag f325075a;

    /* renamed from: b */
    private final C117092d f325076b;

    public C117080r(C23052c cVar, C117092d dVar) {
        super(cVar);
        this.f325076b = dVar;
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if (!"CLICK".equals(str)) {
            return;
        }
        if ("CLOSE_BUTTON".equals(str2)) {
            C117059ag agVar = this.f325075a;
            agVar.getClass();
            agVar.f325000a.mo103124f();
        } else if ("LOGO_FULL".equals(str2)) {
            mo103134e(1);
        } else if ("SUPER_G".equals(str2)) {
            mo103134e(2);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        int i = 1;
        C89283z zVar = (C89283z) C23245b.m43557b(protoParcelable, C89283z.f242073n.getParserForType(), C62921ba.m95368a(), true);
        zVar.getClass();
        int a = C89280w.m145217a(zVar.f242078d);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 != 2) {
            i = i2;
        }
        ((C117071i) this.f325076b).f325039a.mo28730f(Integer.valueOf(i), false);
    }

    /* renamed from: e */
    public final void mo103134e(int i) {
        int a;
        int i2 = 2;
        if (i == 3) {
            i = 2;
        }
        int i3 = i - 1;
        C117059ag agVar = this.f325075a;
        agVar.getClass();
        if (!(i3 == 1 && (a = C89280w.m145217a(agVar.f325000a.f325002b.f242078d)) != 0 && a == 3)) {
            i2 = i3;
        }
        ((C117077o) agVar.f325000a.f325004d.f325094b.f325013a).f325065c.mo28730f(Integer.valueOf(i2), false);
        C117060ah ahVar = agVar.f325000a;
        ((C117076n) ahVar.f325001a).f325061j.mo28730f(Boolean.valueOf(ahVar.f325004d.f325094b.mo103125e()), false);
        ((C117071i) this.f325076b).f325039a.mo28730f(Integer.valueOf(i3), false);
    }
}
