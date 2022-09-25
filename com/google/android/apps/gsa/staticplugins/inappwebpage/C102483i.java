package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.apps.gsa.shared.p7148ui.C90650az;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.i */
/* compiled from: PG */
final class C102483i extends C90650az {

    /* renamed from: a */
    private boolean f286034a = true;

    public C102483i(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final boolean m169943a() {
        return getUrl().contains("/sorry");
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (m169943a() && this.f286034a) {
            scrollTo(0, 0);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (m169943a()) {
            this.f286034a = false;
        }
        return onTouchEvent;
    }
}
