package androidx.viewpager2.widget;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.viewpager2.widget.v */
/* compiled from: PG */
final class C4319v extends RecyclerView {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f13944a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4319v(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f13944a = viewPager2;
    }

    public final CharSequence getAccessibilityClassName() {
        return this.f13944a.f13901k.mo9255p() ? this.f13944a.f13901k.mo9240a() : "android.support.v7.widget.RecyclerView";
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setFromIndex(this.f13944a.f13893c);
        accessibilityEvent.setToIndex(this.f13944a.f13893c);
        this.f13944a.f13901k.mo9248i(accessibilityEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13944a.f13899i && super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f13944a.f13899i && super.onTouchEvent(motionEvent);
    }
}
