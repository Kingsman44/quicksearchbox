package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
class PopoverCardView extends MaterialCardView {

    /* renamed from: i */
    private final boolean f82889i;

    /* renamed from: j */
    private final int f82890j;

    /* renamed from: k */
    private final int f82891k;

    public PopoverCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f82889i && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int size = View.MeasureSpec.getSize(i2);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = getMeasuredHeight();
            int i3 = this.f82891k;
            if (measuredHeight > i3) {
                i3 = this.f82890j;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i, i2);
    }

    public PopoverCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82889i = context.getResources().getBoolean(R.bool.is_large_screen);
        this.f82890j = getContext().getResources().getDimensionPixelSize(R.dimen.og_popover_large_screen_max_height);
        this.f82891k = getContext().getResources().getDimensionPixelSize(R.dimen.og_popover_large_screen_extended_max_height);
    }
}
