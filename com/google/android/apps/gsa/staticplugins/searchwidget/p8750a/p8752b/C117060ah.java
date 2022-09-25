package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.monet.p7070b.p7090i.C90245a;
import com.google.android.apps.gsa.shared.p6995aq.C89269l;
import com.google.android.apps.gsa.shared.p6995aq.C89272o;
import com.google.android.apps.gsa.shared.p6995aq.C89280w;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.staticplugins.searchwidget.C117241bi;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117097i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.ah */
/* compiled from: PG */
public final class C117060ah extends C23056g {

    /* renamed from: a */
    public final C117097i f325001a;

    /* renamed from: b */
    public final C89283z f325002b;

    /* renamed from: c */
    public C117066d f325003c;

    /* renamed from: d */
    public C117087y f325004d;

    /* renamed from: e */
    private final Resources f325005e;

    /* renamed from: f */
    private final C23058i f325006f;

    /* renamed from: g */
    private C117053aa f325007g;

    /* renamed from: h */
    private C117084v f325008h;

    /* renamed from: i */
    private C117080r f325009i;

    public C117060ah(Context context, C23052c cVar, C117097i iVar, C23058i iVar2, C117241bi biVar) {
        super(cVar);
        this.f325001a = iVar;
        this.f325005e = context.getResources();
        this.f325006f = iVar2;
        this.f325002b = biVar.mo103215b();
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if ("CLICK".equals(str)) {
            mo103123e();
            if ("COLOR_BUTTON".equals(str2)) {
                ((C117076n) this.f325001a).f325053b.mo28730f(0, false);
                C117087y yVar = this.f325004d;
                yVar.f325095c.mo103126e(this.f325005e.getString(R.string.bar_color_title));
            } else if ("SHAPE_BUTTON".equals(str2)) {
                ((C117076n) this.f325001a).f325060i.mo28730f(0, false);
                C117087y yVar2 = this.f325004d;
                yVar2.f325095c.mo103126e(this.f325005e.getString(R.string.bar_shape_title));
            } else if ("OPACITY_BUTTON".equals(str2)) {
                ((C117076n) this.f325001a).f325058g.mo28730f(0, false);
                C117087y yVar3 = this.f325004d;
                yVar3.f325095c.mo103126e(this.f325005e.getString(R.string.bar_shading_title));
            } else if ("LOGO_BUTTON".equals(str2)) {
                ((C117076n) this.f325001a).f325055d.mo28730f(0, false);
                C117087y yVar4 = this.f325004d;
                yVar4.f325095c.mo103126e(this.f325005e.getString(R.string.bar_logo_title));
            } else if ("RESET_BUTTON".equals(str2)) {
                ((C117076n) this.f325001a).f325056e.mo28730f(0, false);
                C117080r rVar = this.f325009i;
                int a = C89280w.m145217a(this.f325002b.f242078d);
                int i = 1;
                if (a == 0) {
                    a = 1;
                }
                rVar.mo103134e(a);
                C117053aa aaVar = this.f325007g;
                int a2 = C89269l.m145214a(this.f325002b.f242077c);
                if (a2 == 0) {
                    a2 = 1;
                }
                aaVar.mo103122e(a2 - 1);
                C117066d dVar = this.f325003c;
                int a3 = C89272o.m145215a(this.f325002b.f242083i);
                if (a3 != 0) {
                    i = a3;
                }
                dVar.mo103128f(i - 1);
                this.f325003c.mo103127e(this.f325002b.f242087m);
                this.f325008h.mo103135e(this.f325002b.f242076b);
            }
        }
    }

    /* renamed from: e */
    public final void mo103123e() {
        C58976aa aaVar = C58975e.f156826a;
        ((C117076n) this.f325001a).f325056e.mo28730f(8, false);
        ((C117076n) this.f325001a).f325053b.mo28730f(8, false);
        ((C117076n) this.f325001a).f325060i.mo28730f(8, false);
        ((C117076n) this.f325001a).f325058g.mo28730f(8, false);
        ((C117076n) this.f325001a).f325055d.mo28730f(8, false);
    }

    /* renamed from: f */
    public final void mo103124f() {
        mo103123e();
        ((C117076n) this.f325001a).f325056e.mo28730f(0, false);
        C117087y yVar = this.f325004d;
        yVar.f325095c.mo103126e(this.f325005e.getString(R.string.customize_title));
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        if (((C117076n) this.f325001a).f325052a.mo28635p(xVar)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C117076n) this.f325001a).f325052a.mo28634o(xVar);
        }
        if (((C117076n) this.f325001a).f325059h.mo28635p(xVar)) {
            C58976aa aaVar2 = C58975e.f156826a;
            ((C117076n) this.f325001a).f325059h.mo28634o(xVar);
        }
        if (((C117076n) this.f325001a).f325057f.mo28635p(xVar)) {
            C58976aa aaVar3 = C58975e.f156826a;
            ((C117076n) this.f325001a).f325057f.mo28634o(xVar);
        }
        if (((C117076n) this.f325001a).f325054c.mo28635p(xVar)) {
            C58976aa aaVar4 = C58975e.f156826a;
            ((C117076n) this.f325001a).f325054c.mo28634o(xVar);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        ((C117076n) this.f325001a).f325052a.mo28623d(C90245a.f252095b, protoParcelable);
        ((C117076n) this.f325001a).f325059h.mo28623d(C90245a.f252098e, protoParcelable);
        ((C117076n) this.f325001a).f325057f.mo28623d(C90245a.f252099f, protoParcelable);
        ((C117076n) this.f325001a).f325054c.mo28623d(C90245a.f252100g, protoParcelable);
        mo103123e();
        ((C117076n) this.f325001a).f325056e.mo28730f(0, false);
        C89283z zVar = (C89283z) C23245b.m43557b(protoParcelable, C89283z.f242073n.getParserForType(), C62921ba.m95368a(), true);
        C23251a aVar = ((C117076n) this.f325001a).f325061j;
        zVar.getClass();
        aVar.mo28730f(Boolean.valueOf(zVar.f242081g), false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C23056g a = ((C117076n) this.f325001a).f325052a.mo28620a();
        a.getClass();
        this.f325003c = (C117066d) a;
        C23056g a2 = ((C117076n) this.f325001a).f325059h.mo28620a();
        a2.getClass();
        this.f325007g = (C117053aa) a2;
        C23056g a3 = ((C117076n) this.f325001a).f325057f.mo28620a();
        a3.getClass();
        this.f325008h = (C117084v) a3;
        C23056g a4 = ((C117076n) this.f325001a).f325054c.mo28620a();
        a4.getClass();
        this.f325009i = (C117080r) a4;
        this.f325003c.f325026b = new C117056ad(this);
        this.f325007g.f324994a = new C117057ae(this);
        this.f325008h.f325088a = new C117058af(this);
        this.f325009i.f325075a = new C117059ag(this);
        this.f325006f.mo28500a(this.f63405W, new C117055ac(this));
    }
}
