package android.support.p033v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.widget.db */
/* compiled from: PG */
final class C0586db implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0587dc f2275a;

    public C0586db(C0587dc dcVar) {
        this.f2275a = dcVar;
    }

    public final void run() {
        C0587dc dcVar = this.f2275a;
        dcVar.mo2724d();
        View view = dcVar.f2278c;
        if (view.isEnabled() && !view.isLongClickable() && dcVar.mo1612b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            dcVar.f2279d = true;
        }
    }
}
