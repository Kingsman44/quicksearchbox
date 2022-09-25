package com.google.android.apps.search.googleapp.discover.loggingsignals;

import android.support.p031v4.app.Fragment;
import android.view.ViewGroup;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57528m;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.loggingsignals.f */
/* compiled from: PG */
public final class C134468f implements C134469g {

    /* renamed from: a */
    private final Set f366224a;

    /* renamed from: b */
    private final Fragment f366225b;

    /* renamed from: c */
    private final ViewLoggingLifecycleObserver f366226c;

    public C134468f(Set set, Fragment fragment) {
        C69664n.m101061g(set, "listeners");
        C69664n.m101061g(fragment, "fragment");
        this.f366224a = set;
        this.f366225b = fragment;
        ViewLoggingLifecycleObserver viewLoggingLifecycleObserver = new ViewLoggingLifecycleObserver(this);
        this.f366226c = viewLoggingLifecycleObserver;
        fragment.getLifecycle().mo5790b(viewLoggingLifecycleObserver);
    }

    /* renamed from: d */
    public final void mo111493d() {
        for (C134469g d : this.f366224a) {
            d.mo111493d();
        }
    }

    /* renamed from: e */
    public final void mo111494e() {
        this.f366225b.getLifecycle().mo5791c(this.f366226c);
        for (C134469g e : this.f366224a) {
            e.mo111494e();
        }
    }

    /* renamed from: f */
    public final void mo111495f() {
        for (C134469g f : this.f366224a) {
            f.mo111495f();
        }
    }

    /* renamed from: g */
    public final void mo111496g() {
        for (C134469g g : this.f366224a) {
            g.mo111496g();
        }
    }

    /* renamed from: h */
    public final void mo111497h() {
        for (C134469g h : this.f366224a) {
            h.mo111497h();
        }
    }

    /* renamed from: i */
    public final void mo111498i(int i, int i2) {
        for (C134469g i3 : this.f366224a) {
            i3.mo111498i(i, i2);
        }
    }

    /* renamed from: j */
    public final void mo111499j() {
        for (C134469g j : this.f366224a) {
            j.mo111499j();
        }
    }

    /* renamed from: k */
    public final void mo111500k(int i, int i2, int i3, int i4) {
        for (C134469g k : this.f366224a) {
            k.mo111500k(i, i2, i3, i4);
        }
    }

    /* renamed from: l */
    public final void mo111501l() {
        for (C134469g l : this.f366224a) {
            l.mo111501l();
        }
    }

    /* renamed from: m */
    public final void mo111502m() {
        for (C134469g m : this.f366224a) {
            m.mo111502m();
        }
    }

    /* renamed from: q */
    public final void mo111506q(C60218r rVar) {
        C69664n.m101061g(rVar, "rootEventId");
        for (C134469g q : this.f366224a) {
            q.mo111506q(rVar);
        }
    }

    /* renamed from: r */
    public final void mo111507r(ViewGroup viewGroup, C57528m mVar) {
        C69664n.m101061g(mVar, "surface");
        for (C134469g r : this.f366224a) {
            r.mo111507r(viewGroup, mVar);
        }
        viewGroup.addOnLayoutChangeListener(new C134466d(this));
    }
}
