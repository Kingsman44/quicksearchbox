package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.x */
/* compiled from: PG */
public final /* synthetic */ class C104360x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetListView f290413a;

    /* renamed from: b */
    public final /* synthetic */ int f290414b;

    /* renamed from: c */
    public final /* synthetic */ BottomSheetBehavior f290415c;

    public /* synthetic */ C104360x(BottomSheetListView bottomSheetListView, int i, BottomSheetBehavior bottomSheetBehavior) {
        this.f290413a = bottomSheetListView;
        this.f290414b = i;
        this.f290415c = bottomSheetBehavior;
    }

    public final void run() {
        BottomSheetListView bottomSheetListView = this.f290413a;
        int i = this.f290414b;
        BottomSheetBehavior bottomSheetBehavior = this.f290415c;
        int childCount = bottomSheetListView.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            if (bottomSheetListView.getChildAt(i2).getBottom() > i) {
                View childAt = bottomSheetListView.getChildAt(i2);
                if (i2 <= 0 || i2 != childCount - 1) {
                    bottomSheetBehavior.mo47516N(childAt.getTop() + (childAt.getHeight() / 2));
                    return;
                } else {
                    bottomSheetBehavior.mo47516N(childAt.getBottom());
                    return;
                }
            } else {
                i2++;
            }
        }
    }
}
