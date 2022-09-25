package com.google.android.apps.search.googleapp.discover.streamui.p10228d;

import android.view.MotionEvent;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.d.b */
/* compiled from: PG */
final /* synthetic */ class C134716b implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C134715a f366836a;

    public C134716b(C134715a aVar) {
        this.f366836a = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C69664n.m101061g(view, "p0");
        C69664n.m101061g(motionEvent, "p1");
        C134715a aVar = this.f366836a;
        C69664n.m101061g(view, "v");
        C69664n.m101061g(motionEvent, "event");
        View.OnTouchListener onTouchListener = aVar.f366835a;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }
}
