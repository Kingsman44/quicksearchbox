package androidx.core.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.core.p098j.C2043bi;

/* renamed from: androidx.core.widget.b */
/* compiled from: PG */
final class C2115b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2116c f6064a;

    public C2115b(C2116c cVar) {
        this.f6064a = cVar;
    }

    public final void run() {
        C2116c cVar = this.f6064a;
        if (cVar.f6070e) {
            if (cVar.f6068c) {
                cVar.f6068c = false;
                C2112a aVar = cVar.f6066a;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                aVar.f6059e = currentAnimationTimeMillis;
                aVar.f6061g = -1;
                aVar.f6060f = currentAnimationTimeMillis;
                aVar.f6062h = 0.5f;
            }
            C2112a aVar2 = this.f6064a.f6066a;
            if ((aVar2.f6061g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar2.f6061g + ((long) aVar2.f6063i)) && this.f6064a.mo5356c()) {
                C2116c cVar2 = this.f6064a;
                if (cVar2.f6069d) {
                    cVar2.f6069d = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    cVar2.f6067b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f6060f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar2.mo5353a(currentAnimationTimeMillis2);
                    long j = aVar2.f6060f;
                    aVar2.f6060f = currentAnimationTimeMillis2;
                    this.f6064a.mo5358e((int) (((float) (currentAnimationTimeMillis2 - j)) * ((-4.0f * a * a) + (a * 4.0f)) * aVar2.f6058d));
                    C2043bi.m5520N(this.f6064a.f6067b, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            this.f6064a.f6070e = false;
        }
    }
}
