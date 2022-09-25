package android.support.p033v7.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.dz */
/* compiled from: PG */
final class C0610dz implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C0613eb f2347a;

    public C0610dz(C0613eb ebVar) {
        this.f2347a = ebVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            PopupWindow popupWindow = this.f2347a.f2366q;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.f2347a.f2366q.getWidth() || y < 0 || y >= this.f2347a.f2366q.getHeight()) {
                return false;
            }
            C0613eb ebVar = this.f2347a;
            ebVar.f2364o.postDelayed(ebVar.f2363n, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            C0613eb ebVar2 = this.f2347a;
            ebVar2.f2364o.removeCallbacks(ebVar2.f2363n);
            return false;
        }
    }
}
