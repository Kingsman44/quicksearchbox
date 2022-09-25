package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.ap */
/* compiled from: PG */
final class C40170ap {

    /* renamed from: a */
    public static final C59071e f105525a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.bubbles.e.ap");

    /* renamed from: b */
    public final Context f105526b;

    /* renamed from: c */
    public final PointF f105527c = new PointF();

    /* renamed from: d */
    public boolean f105528d = false;

    public C40170ap(Context context, View view, Runnable runnable, Runnable runnable2, C40228i iVar) {
        this.f105526b = context;
        view.setOnTouchListener(new C40167am(this, new GestureDetector(context, new C40169ao()), runnable2, iVar));
        view.setOnClickListener(new C40168an(runnable));
    }

    /* renamed from: a */
    public final void mo42288a(MotionEvent motionEvent) {
        this.f105527c.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f105528d = true;
    }
}
