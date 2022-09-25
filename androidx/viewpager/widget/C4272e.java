package androidx.viewpager.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2071ce;
import androidx.core.p098j.C2072cf;
import androidx.core.p098j.C2073cg;
import androidx.core.p098j.C2082cp;

/* renamed from: androidx.viewpager.widget.e */
/* compiled from: PG */
final class C4272e implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ ViewPager f13846a;

    /* renamed from: b */
    private final Rect f13847b = new Rect();

    public C4272e(ViewPager viewPager) {
        this.f13846a = viewPager;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C2073cg cgVar;
        C2082cp A = C2043bi.m5507A(view, cpVar);
        if (A.f5994b.mo5232p()) {
            return A;
        }
        Rect rect = this.f13847b;
        rect.left = A.mo5240b();
        rect.top = A.mo5242d();
        rect.right = A.mo5241c();
        rect.bottom = A.mo5239a();
        int childCount = this.f13846a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C2082cp y = C2043bi.m5596y(this.f13846a.getChildAt(i), A);
            rect.left = Math.min(y.mo5240b(), rect.left);
            rect.top = Math.min(y.mo5242d(), rect.top);
            rect.right = Math.min(y.mo5241c(), rect.right);
            rect.bottom = Math.min(y.mo5239a(), rect.bottom);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            cgVar = new C2072cf(A);
        } else {
            cgVar = new C2071ce(A);
        }
        cgVar.mo5212e(C1926c.m5197c(rect));
        return cgVar.mo5208a();
    }
}
