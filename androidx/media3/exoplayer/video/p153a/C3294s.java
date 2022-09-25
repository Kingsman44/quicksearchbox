package androidx.media3.exoplayer.video.p153a;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: androidx.media3.exoplayer.video.a.s */
/* compiled from: PG */
final class C3294s extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C3279d {

    /* renamed from: a */
    private final PointF f9918a = new PointF();

    /* renamed from: b */
    private final PointF f9919b = new PointF();

    /* renamed from: c */
    private final C3293r f9920c;

    /* renamed from: d */
    private final float f9921d;

    /* renamed from: e */
    private final GestureDetector f9922e;

    /* renamed from: f */
    private volatile float f9923f;

    public C3294s(Context context, C3293r rVar) {
        this.f9920c = rVar;
        this.f9921d = 25.0f;
        this.f9922e = new GestureDetector(context, this);
        this.f9923f = 3.1415927f;
    }

    /* renamed from: a */
    public final void mo7264a(float[] fArr, float f) {
        this.f9923f = -f;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f9918a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f9918a.x) / this.f9921d;
        float y = (motionEvent2.getY() - this.f9918a.y) / this.f9921d;
        this.f9918a.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.f9923f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        this.f9919b.x -= (cos * x) - (sin * y);
        this.f9919b.y += (sin * x) + (cos * y);
        PointF pointF = this.f9919b;
        pointF.y = Math.max(-45.0f, Math.min(45.0f, pointF.y));
        this.f9920c.mo7270b(this.f9919b);
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((C3291p) this.f9920c).f9895a.performClick();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9922e.onTouchEvent(motionEvent);
    }
}
