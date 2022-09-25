package com.google.android.libraries.assistant.slices;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.slice.C4093a;
import androidx.slice.SliceItem;
import androidx.slice.widget.C4130ah;
import androidx.slice.widget.C4141as;
import androidx.slice.widget.C4149e;
import androidx.slice.widget.GridRowView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.slices.a */
/* compiled from: PG */
public final class C19225a extends GridRowView {

    /* renamed from: l */
    private HorizontalScrollView f53829l;

    public C19225a(Context context) {
        super(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo8639c() {
        C4149e eVar = this.f13174f;
        if (eVar == null || !eVar.mo8711d() || getWidth() == 0) {
            return -1;
        }
        return Math.min(12, this.f13174f.f13358c.size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo8640d() {
        return R.layout.assistant_slice_title;
    }

    /* renamed from: fz */
    public final void mo8643fz(C4130ah ahVar, boolean z, int i, int i2, C4141as asVar) {
        mo8642f();
        this.f13256o = asVar;
        this.f13171c = i;
        this.f13172d = i2;
        this.f13174f = (C4149e) ahVar;
        removeAllViews();
        if (this.f53829l == null) {
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
            this.f53829l = horizontalScrollView;
            horizontalScrollView.removeAllViews();
        }
        this.f53829l.addView(this.f13179k, new FrameLayout.LayoutParams(-2, -2));
        this.f53829l.setHorizontalScrollBarEnabled(false);
        this.f53829l.setVerticalScrollbarThumbDrawable(new ColorDrawable(getResources().getColor(17170445)));
        addView(this.f53829l, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f13170b, new FrameLayout.LayoutParams(-1, -1));
        if (!super.mo8647k()) {
            super.mo8641e();
        }
        this.f13179k.setPadding(this.f13260s, this.f13261t + super.mo8638b(), this.f13262u, this.f13263v + super.mo8637a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo8646j(SliceItem sliceItem, SliceItem sliceItem2, int i, ViewGroup viewGroup, boolean z) {
        boolean j = super.mo8646j(sliceItem, sliceItem2, i, viewGroup, z);
        if (!j || C4093a.m11737a(sliceItem.f13091a, "raw") || !C4093a.m11737a(sliceItem.f13091a, "large") || viewGroup.getChildCount() <= 0) {
            return j;
        }
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        childAt.setPadding(2, 2, 2, 2);
        childAt.setBackgroundResource(R.drawable.slice_grid_image_item_background);
        int i2 = this.f13175g;
        double d = (double) i2;
        Double.isNaN(d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (d * 1.8d), i2);
        layoutParams.setMargins(4, 0, 4, 0);
        childAt.setLayoutParams(layoutParams);
        return true;
    }
}
