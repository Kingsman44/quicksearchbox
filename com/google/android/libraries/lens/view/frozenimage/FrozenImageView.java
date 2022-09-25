package com.google.android.libraries.lens.view.frozenimage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.lens.common.p2002e.C24107a;
import com.google.android.libraries.lens.common.p2002e.C24108b;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public final class FrozenImageView extends AppCompatImageView implements C24108b {

    /* renamed from: a */
    public GestureDetector f71402a;

    /* renamed from: b */
    public C28443m f71403b;

    static {
        C58974d.m91135i("FrozenImageView");
    }

    public FrozenImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final View mo29503a() {
        return this;
    }

    /* renamed from: b */
    public final C24107a mo29504b() {
        return C24107a.FROZEN_IMAGE;
    }

    /* renamed from: c */
    public final PointF mo31471c(MotionEvent motionEvent) {
        return new PointF(motionEvent.getX() / ((float) getWidth()), motionEvent.getY() / ((float) getHeight()));
    }

    /* renamed from: d */
    public final boolean mo29505d(MotionEvent motionEvent) {
        return this.f71402a.onTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo31472e(PointF pointF) {
        if (getVisibility() != 0) {
            return false;
        }
        float f = pointF.x;
        float f2 = pointF.y;
        if (pointF.x < 0.0f || pointF.x > 1.0f || pointF.y < 0.0f || pointF.y > 1.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        boolean z = false;
        if (drawable == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        C58838bb.m90868c(View.MeasureSpec.getMode(i) != 1073741824);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            z = true;
        }
        C58838bb.m90868c(z);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        float f = (float) intrinsicWidth;
        float min = Math.min(((float) size2) / intrinsicHeight, ((float) size) / f);
        setMeasuredDimension(Math.min(Math.round(f * min), size), Math.min(Math.round(min * intrinsicHeight), size2));
    }

    public FrozenImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FrozenImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
