package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.graphics.Rect;
import android.support.p031v4.app.Fragment;
import android.view.MotionEvent;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ad */
/* compiled from: PG */
public final /* synthetic */ class C136046ad implements Function {

    /* renamed from: a */
    public final /* synthetic */ C136108z f370506a;

    public /* synthetic */ C136046ad(C136108z zVar) {
        this.f370506a = zVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z;
        MotionEvent motionEvent = (MotionEvent) obj;
        Fragment c = this.f370506a.getChildFragmentManager().f634a.mo671c("DefaultBottomBar");
        if (c != null) {
            Rect rect = new Rect();
            c.requireView().getGlobalVisibleRect(rect);
            z = !rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
