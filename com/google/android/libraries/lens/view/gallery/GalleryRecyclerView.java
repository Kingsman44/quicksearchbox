package com.google.android.libraries.lens.view.gallery;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Size;

/* compiled from: PG */
public final class GalleryRecyclerView extends RecyclerView {

    /* renamed from: a */
    public C26317ar f71463a;

    public GalleryRecyclerView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth2 = getMeasuredWidth();
        C26317ar arVar = this.f71463a;
        if (arVar == null) {
            return;
        }
        if (measuredHeight != measuredHeight2 || measuredWidth != measuredWidth2) {
            arVar.mo31516a(new Size(measuredWidth2, measuredHeight2));
        }
    }

    public GalleryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
