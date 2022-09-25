package androidx.drawerlayout.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: androidx.drawerlayout.widget.k */
/* compiled from: PG */
public final /* synthetic */ class C2182k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2183l f6193a;

    public /* synthetic */ C2182k(C2183l lVar) {
        this.f6193a = lVar;
    }

    public final void run() {
        int i;
        View view;
        C2183l lVar = this.f6193a;
        int i2 = lVar.f6195b.f6099h;
        boolean z = lVar.f6194a == 3;
        if (z) {
            view = lVar.f6196c.mo5456g(3);
            i = (view != null ? -view.getWidth() : 0) + i2;
        } else {
            view = lVar.f6196c.mo5456g(5);
            i = lVar.f6196c.getWidth() - i2;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && lVar.f6196c.mo5454e(view) == 0) {
            lVar.f6195b.mo5413j(view, i, view.getTop());
            ((C2180i) view.getLayoutParams()).f6191c = true;
            lVar.f6196c.invalidate();
            lVar.mo5495n();
            DrawerLayout drawerLayout = lVar.f6196c;
            if (!drawerLayout.f6156b) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                int childCount = drawerLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    drawerLayout.getChildAt(i3).dispatchTouchEvent(obtain);
                }
                obtain.recycle();
                drawerLayout.f6156b = true;
            }
        }
    }
}
