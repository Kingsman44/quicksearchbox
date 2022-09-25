package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: androidx.viewpager.widget.i */
/* compiled from: PG */
final class C4276i extends C2061c {

    /* renamed from: a */
    final /* synthetic */ ViewPager f13859a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4276i(ViewPager viewPager) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f13859a = viewPager;
    }

    /* renamed from: a */
    private final boolean m12289a() {
        C4268a aVar = this.f13859a.f13818b;
        return aVar != null && aVar.mo9175k() > 1;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C4268a aVar;
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(m12289a());
        if (accessibilityEvent.getEventType() == 4096 && (aVar = this.f13859a.f13818b) != null) {
            accessibilityEvent.setItemCount(aVar.mo9175k());
            accessibilityEvent.setFromIndex(this.f13859a.f13819c);
            accessibilityEvent.setToIndex(this.f13859a.f13819c);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setClassName("androidx.viewpager.widget.ViewPager");
        kVar.f5921a.setScrollable(m12289a());
        if (this.f13859a.canScrollHorizontally(1)) {
            kVar.f5921a.addAction(4096);
        }
        if (this.f13859a.canScrollHorizontally(-1)) {
            kVar.f5921a.addAction(8192);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || !this.f13859a.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager = this.f13859a;
            viewPager.mo9147l(viewPager.f13819c - 1);
            return true;
        } else if (!this.f13859a.canScrollHorizontally(1)) {
            return false;
        } else {
            ViewPager viewPager2 = this.f13859a;
            viewPager2.mo9147l(viewPager2.f13819c + 1);
            return true;
        }
    }
}
