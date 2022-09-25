package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.p097i.C1968c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* compiled from: PG */
final class C1768a implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f5521a;

    public C1768a(CoordinatorLayout coordinatorLayout) {
        this.f5521a = coordinatorLayout;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        CoordinatorLayout coordinatorLayout = this.f5521a;
        if (!C1968c.m5305b(coordinatorLayout.f5503f, cpVar)) {
            coordinatorLayout.f5503f = cpVar;
            boolean z = true;
            boolean z2 = cpVar.mo5242d() > 0;
            coordinatorLayout.f5504g = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z = false;
            }
            coordinatorLayout.setWillNotDraw(z);
            if (!cpVar.f5994b.mo5232p()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (C2043bi.m5564ar(childAt) && ((C1773f) childAt.getLayoutParams()).f5523a != null && cpVar.f5994b.mo5232p()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return cpVar;
    }
}
