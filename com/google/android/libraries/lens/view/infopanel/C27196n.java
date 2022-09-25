package com.google.android.libraries.lens.view.infopanel;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27082i;
import com.google.android.libraries.lens.view.infopanel.scrollview.LensResultsNestedScrollView;
import com.google.android.libraries.lens.view.weblrp.C28191f;
import com.google.android.libraries.lens.view.weblrp.C28195j;
import com.google.android.libraries.lens.view.weblrp.C28201o;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.view.infopanel.n */
/* compiled from: PG */
final class C27196n implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27195m f74363a;

    public C27196n(C27195m mVar) {
        this.f74363a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        View a;
        C27082i iVar = (C27082i) bVar;
        C27195m mVar = this.f74363a;
        C28201o d = mVar.mo32625d();
        if (d != null) {
            C28191f a2 = d.mo17754z().mo33715a();
            if (a2 != null) {
                C28195j f = a2.mo17754z();
                View view = f.f76734h.getView();
                if (!(view == null || (a = C28195j.m52740a(view)) == null)) {
                    long f2 = f.f76745s.mo26874f();
                    a.dispatchTouchEvent(MotionEvent.obtain(f2, f2, 0, 0.0f, 0.0f, 0));
                    a.scrollTo(0, 0);
                }
            }
        } else if (mVar.f74361y.mo32375t()) {
            LensResultsNestedScrollView f3 = mVar.f74361y.mo32356f();
            if (f3.getChildCount() > 0) {
                LensResultsNestedScrollView.m50442r(f3.getChildAt(0));
            }
            f3.mo5322o(0, false);
        } else {
            ((C58970a) ((C58970a) C27195m.f74328a.mo56226d()).mo56372aa(49500)).mo56386p("ScrollToTopEvent is unhandled!");
        }
        return C47392e.f123115a;
    }
}
