package com.google.android.apps.gsa.search.shared.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.C90701m;

/* compiled from: PG */
public class SearchOverlayLayout extends FrameLayout {

    /* renamed from: b */
    public View.OnTouchListener f236701b;

    /* renamed from: c */
    public C90701m f236702c;

    public SearchOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C90701m mVar = this.f236702c;
        if (mVar != null) {
            mVar.mo81785R();
            this.f236702c = null;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f236701b != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f236701b.onTouch(this, obtain);
            obtain.recycle();
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
