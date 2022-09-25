package com.google.android.apps.search.googleapp.tabs.manager;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.ad */
/* compiled from: PG */
final class C139722ad extends C0648fj {

    /* renamed from: a */
    final /* synthetic */ C139720ac f379794a;

    public C139722ad(C139720ac acVar) {
        this.f379794a = acVar;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        int i;
        Resources resources = this.f379794a.f379770c.requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.googleapp_tabs_manager_tab_horizontal_offset);
        rect.bottom = resources.getDimensionPixelOffset(R.dimen.googleapp_tabs_manager_tab_bottom_offset);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int layoutDirection = resources.getConfiguration().getLayoutDirection();
        boolean z = true;
        if (layoutDirection != 1) {
            z = false;
        }
        if (childLayoutPosition % 2 == 0) {
            rect.left = z ? dimensionPixelOffset / 2 : dimensionPixelOffset;
            if (!z) {
                dimensionPixelOffset /= 2;
            }
            rect.right = dimensionPixelOffset;
            return;
        }
        if (z) {
            i = dimensionPixelOffset;
        } else {
            i = dimensionPixelOffset / 2;
        }
        rect.left = i;
        if (z) {
            dimensionPixelOffset /= 2;
        }
        rect.right = dimensionPixelOffset;
    }
}
