package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.libraries.elements.p1708c.p1710b.C20747a;
import com.google.android.libraries.elements.p1708c.p1710b.C20749c;

/* renamed from: com.facebook.litho.widget.aq */
/* compiled from: PG */
public final class C6431aq extends RecyclerView {

    /* renamed from: a */
    public C20747a f19081a;

    /* renamed from: b */
    public C6453bl f19082b;

    public C6431aq(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C6453bl blVar = this.f19082b;
        if (blVar != null) {
            blVar.f19135a.mo13569y();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C20747a aVar = this.f19081a;
        if (aVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (aVar.f58069a == null) {
            aVar.f58069a = new C20749c(this);
        }
        aVar.f58069a.onInterceptTouchEvent(this, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
