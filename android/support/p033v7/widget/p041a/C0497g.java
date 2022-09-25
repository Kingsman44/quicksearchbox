package android.support.p033v7.widget.p041a;

import android.support.p033v7.widget.C0673gh;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.widget.a.g */
/* compiled from: PG */
final class C0497g extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public boolean f1985a = true;

    /* renamed from: b */
    final /* synthetic */ C0502l f1986b;

    public C0497g(C0502l lVar) {
        this.f1986b = lVar;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        View c;
        C0673gh childViewHolder;
        int i;
        if (this.f1985a && (c = this.f1986b.mo2459c(motionEvent)) != null && (childViewHolder = this.f1986b.f2017m.getChildViewHolder(c)) != null) {
            C0502l lVar = this.f1986b;
            if (lVar.f2014j.mo2450m(lVar.f2017m) && motionEvent.getPointerId(0) == (i = this.f1986b.f2013i)) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                C0502l lVar2 = this.f1986b;
                lVar2.f2007c = x;
                lVar2.f2008d = y;
                lVar2.f2010f = 0.0f;
                lVar2.f2009e = 0.0f;
                if (lVar2.f2014j.mo2443f()) {
                    this.f1986b.mo2467j(childViewHolder, 2);
                }
            }
        }
    }
}
