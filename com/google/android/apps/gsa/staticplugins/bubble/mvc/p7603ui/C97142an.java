package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.an */
/* compiled from: PG */
final class C97142an {

    /* renamed from: a */
    public static final C59071e f271434a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.an");

    /* renamed from: b */
    public final Context f271435b;

    /* renamed from: c */
    public final PointF f271436c = new PointF();

    /* renamed from: d */
    public boolean f271437d = false;

    public C97142an(Context context, View view, Runnable runnable, Runnable runnable2, C97212f fVar) {
        this.f271435b = context;
        view.setOnTouchListener(new C97139ak(this, new GestureDetector(context, new C97141am()), runnable2, fVar));
        view.setOnClickListener(new C97140al(runnable));
    }

    /* renamed from: a */
    public final void mo90534a(MotionEvent motionEvent) {
        this.f271436c.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f271437d = true;
    }
}
