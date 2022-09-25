package com.google.android.apps.gsa.staticplugins.p7635c.p7636a;

import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6519al.p6729e.C85461a;

/* renamed from: com.google.android.apps.gsa.staticplugins.c.a.a */
/* compiled from: PG */
public final class C97496a {

    /* renamed from: a */
    private final C85461a f272294a;

    public C97496a(C85461a aVar) {
        this.f272294a = aVar;
    }

    @JavascriptInterface
    public void addTouchEvent(int i, int i2, int i3, int i4) {
        this.f272294a.mo78987a(MotionEvent.obtain((long) i, (long) i2, 1, (float) i3, (float) i4, 0));
    }
}
