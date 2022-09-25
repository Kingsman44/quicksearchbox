package com.google.android.libraries.componentview.p1699f.p1700a;

import android.view.ViewTreeObserver;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;

/* renamed from: com.google.android.libraries.componentview.f.a.b */
/* compiled from: PG */
public abstract class C20513b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final C20601ca f57626a;

    /* renamed from: b */
    private final String f57627b = "AbsCarouselEager";

    public C20513b(C20601ca caVar) {
        this.f57626a = caVar;
    }

    /* renamed from: a */
    public abstract boolean mo25382a();

    public final boolean onPreDraw() {
        try {
            return mo25382a();
        } catch (Exception e) {
            C20601ca caVar = this.f57626a;
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.ON_PREDRAW_EXCEPTION);
            eVar.f57821a = e;
            eVar.f57824d = this.f57627b;
            caVar.mo25487b(eVar.mo25531a());
            return false;
        }
    }
}
