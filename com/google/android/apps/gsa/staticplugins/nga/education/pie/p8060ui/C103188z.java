package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.z */
/* compiled from: PG */
public final class C103188z {

    /* renamed from: a */
    public final C80244ck f287927a;

    /* renamed from: b */
    public final C103173k f287928b;

    /* renamed from: c */
    public final C103032a f287929c;

    /* renamed from: d */
    public final C86124t f287930d;

    /* renamed from: e */
    public final C103143bf f287931e;

    /* renamed from: f */
    public ViewGroup f287932f = null;

    public C103188z(C80244ck ckVar, C103173k kVar, C103032a aVar, C86124t tVar) {
        this.f287927a = ckVar;
        this.f287928b = kVar;
        this.f287929c = aVar;
        this.f287930d = tVar;
        this.f287931e = ((PieActivity) kVar.getActivity()).mo17754z();
    }

    /* renamed from: a */
    public final void mo93697a(Runnable runnable) {
        ViewGroup viewGroup = this.f287932f;
        if (viewGroup != null) {
            ViewPropertyAnimator duration = viewGroup.animate().translationY(2000.0f).setDuration(500);
            Objects.requireNonNull(runnable);
            duration.withEndAction(new C103177o(runnable)).start();
            return;
        }
        runnable.run();
    }

    /* renamed from: b */
    public final void mo93698b() {
        mo93697a(new C103184v(this));
    }
}
