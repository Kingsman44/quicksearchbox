package androidx.viewpager2.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: androidx.viewpager2.widget.o */
/* compiled from: PG */
final class C4312o extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f13935a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4312o(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f13935a = viewPager2;
    }

    /* access modifiers changed from: protected */
    public final void calculateExtraLayoutSpace(C0670ge geVar, int[] iArr) {
        int i;
        int i2;
        ViewPager2 viewPager2 = this.f13935a;
        int i3 = viewPager2.f13900j;
        if (i3 == -1) {
            super.calculateExtraLayoutSpace(geVar, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.f13896f;
        if (viewPager2.mo9209a() == 0) {
            i2 = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i = recyclerView.getPaddingRight();
        } else {
            i2 = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i = recyclerView.getPaddingBottom();
        }
        int i4 = (i2 - i) * i3;
        iArr[0] = i4;
        iArr[1] = i4;
    }

    public final void onInitializeAccessibilityNodeInfo(C0661fw fwVar, C0670ge geVar, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(fwVar, geVar, kVar);
        this.f13935a.f13901k.mo9245f(kVar);
    }

    public final void onInitializeAccessibilityNodeInfoForItem(C0661fw fwVar, C0670ge geVar, View view, C1991k kVar) {
        this.f13935a.f13901k.mo9246g(view, kVar);
    }

    public final boolean performAccessibilityAction(C0661fw fwVar, C0670ge geVar, int i, Bundle bundle) {
        if (this.f13935a.f13901k.mo9254o(i)) {
            return this.f13935a.f13901k.mo9256q(i);
        }
        return super.performAccessibilityAction(fwVar, geVar, i, bundle);
    }

    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
