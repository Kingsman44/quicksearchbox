package android.support.p033v7.app;

import android.content.Context;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* renamed from: android.support.v7.app.an */
/* compiled from: PG */
final class C0353an extends ContentFrameLayout {

    /* renamed from: a */
    final /* synthetic */ C0356aq f1154a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0353an(C0356aq aqVar, Context context) {
        super(context);
        this.f1154a = aqVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1154a.mo1166S(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                C0356aq aqVar = this.f1154a;
                aqVar.mo1159L(aqVar.mo1173aa(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C0678gm.m2375e().mo3100c(getContext(), i));
    }
}
