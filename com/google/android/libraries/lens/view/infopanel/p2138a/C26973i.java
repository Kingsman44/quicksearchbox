package com.google.android.libraries.lens.view.infopanel.p2138a;

import com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27128ad;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27129ae;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.i */
/* compiled from: PG */
public abstract class C26973i implements C27654a {

    /* renamed from: m */
    public static final C26973i f73554m;

    static {
        C26961a aVar = new C26961a();
        aVar.mo32396d(C58485gu.m89845m());
        aVar.mo32394b(C26965d.m50011g());
        aVar.mo32398f(false);
        C58836b bVar = C58836b.f156633a;
        aVar.f73513e = bVar;
        aVar.f73512d = bVar;
        aVar.f73511c = bVar;
        aVar.f73510b = bVar;
        aVar.mo32395c(false);
        f73554m = aVar.mo32393a();
    }

    /* renamed from: p */
    public static C26971g m50040p() {
        return new C26961a();
    }

    /* renamed from: a */
    public abstract C26971g mo32411a();

    /* renamed from: b */
    public abstract C26965d mo32412b();

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("InfoPanelModel");
        eVar.mo33149f("Header", mo32412b().mo32406d());
        eVar.mo33148e("ShowLoading", String.format(Locale.US, "%b", new Object[]{Boolean.valueOf(mo32425n())}));
        eVar.mo33148e("GoodResult", String.format(Locale.US, "%b", new Object[]{Boolean.valueOf(mo32424m())}));
        C58485gu l = mo32423l();
        int size = l.size();
        for (int i = 0; i < size; i++) {
            eVar.mo33146c((C27129ae) l.get(i));
        }
    }

    /* renamed from: d */
    public abstract C58833ax mo32413d();

    /* renamed from: e */
    public abstract C58833ax mo32414e();

    /* renamed from: f */
    public abstract C58833ax mo32416f();

    /* renamed from: g */
    public abstract C58833ax mo32417g();

    /* renamed from: h */
    public abstract C58833ax mo32418h();

    /* renamed from: i */
    public abstract C58833ax mo32420i();

    /* renamed from: j */
    public abstract C58833ax mo32421j();

    /* renamed from: k */
    public abstract C58833ax mo32422k();

    /* renamed from: l */
    public abstract C58485gu mo32423l();

    /* renamed from: m */
    public abstract boolean mo32424m();

    /* renamed from: n */
    public abstract boolean mo32425n();

    /* renamed from: o */
    public final int mo32432o(C27128ad adVar) {
        C58485gu l = mo32423l();
        int size = l.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((C27129ae) l.get(i2)).mo32561a() == adVar) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: q */
    public final boolean mo32433q() {
        return mo32421j().mo56113h() || mo32420i().mo56113h();
    }
}
