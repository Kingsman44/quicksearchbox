package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.content.Context;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40137i;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.k */
/* compiled from: PG */
public final class C40230k {

    /* renamed from: d */
    private static final C59071e f105686d = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.bubbles.e.k");

    /* renamed from: a */
    public final C40174at f105687a = new C40174at();

    /* renamed from: b */
    public final C40166al f105688b;

    /* renamed from: c */
    public boolean f105689c = true;

    /* renamed from: e */
    private final View f105690e;

    /* renamed from: f */
    private final Context f105691f;

    /* renamed from: g */
    private final C40137i f105692g;

    /* renamed from: h */
    private final PointF f105693h = new PointF();

    /* renamed from: i */
    private final PointF f105694i = new PointF();

    /* renamed from: j */
    private boolean f105695j = false;

    public C40230k(View view, View view2, Context context, C40137i iVar, C40166al alVar) {
        this.f105690e = view;
        this.f105691f = context;
        this.f105692g = iVar;
        this.f105688b = alVar;
        view.setOnTouchListener(new C40224e(this, new GestureDetector(context, new C40229j())));
        view.setOnClickListener(new C40225f(this));
        Objects.requireNonNull(alVar);
        C40226g gVar = new C40226g(alVar);
        Objects.requireNonNull(alVar);
        new C40170ap(context, view2, gVar, new C40227h(alVar), new C40228i(this));
    }

    /* renamed from: c */
    private static float m69852c(float f, int i) {
        float f2 = (float) i;
        if (f > f2) {
            f = f2;
        }
        float f3 = (float) (-i);
        return f < f3 ? f3 : f;
    }

    /* renamed from: d */
    private final void m69853d(MotionEvent motionEvent) {
        this.f105694i.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f105687a.mo42297d();
        this.f105695j = true;
        C40248b a = this.f105692g.f105431l.mo42220a();
        this.f105693h.set(m69852c(motionEvent.getRawX() - a.mo42347a(), this.f105690e.getWidth() / 2), m69852c(motionEvent.getRawY() - a.mo42348b(), this.f105690e.getHeight() / 2));
        float f = this.f105693h.x;
        float f2 = this.f105693h.y;
    }

    /* renamed from: e */
    private final void m69854e(float f, float f2) {
        this.f105687a.mo42295b();
        this.f105695j = false;
        this.f105688b.mo42276g(f, f2);
    }

    /* renamed from: a */
    public final void mo42334a(MotionEvent motionEvent) {
        float f;
        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f105695j) {
                        ((C59052c) ((C59052c) f105686d.mo56226d()).mo56372aa(53221)).mo56386p("ACTION_MOVE occurred while movement not in progress");
                        this.f105688b.mo42281l();
                        m69853d(motionEvent);
                    }
                    this.f105687a.mo42296c(motionEvent);
                    if (this.f105689c || mo42335b(motionEvent)) {
                        this.f105688b.mo42275f(motionEvent.getRawX() - this.f105693h.x, motionEvent.getRawY() - this.f105693h.y);
                    }
                } else if (actionMasked != 4) {
                    m69854e(0.0f, 0.0f);
                }
            } else if (!this.f105695j) {
                m69854e(0.0f, 0.0f);
            } else {
                this.f105687a.mo42296c(motionEvent);
                C40174at atVar = this.f105687a;
                if (atVar.f105545b == null) {
                    ((C59052c) ((C59052c) C40174at.f105544a.mo56225c()).mo56372aa(53257)).mo56386p("Missing call for VelocityUtil.init()");
                    f = 0.0f;
                } else {
                    atVar.mo42294a();
                    f = atVar.f105545b.getXVelocity();
                }
                C40174at atVar2 = this.f105687a;
                if (atVar2.f105545b == null) {
                    ((C59052c) ((C59052c) C40174at.f105544a.mo56225c()).mo56372aa(53258)).mo56386p("Missing call for VelocityUtil.init()");
                } else {
                    atVar2.mo42294a();
                    f2 = atVar2.f105545b.getYVelocity();
                }
                m69854e(f, f2);
            }
        } else {
            m69853d(motionEvent);
            this.f105687a.mo42296c(motionEvent);
        }
    }

    /* renamed from: b */
    public final boolean mo42335b(MotionEvent motionEvent) {
        if (Math.hypot((double) (motionEvent.getRawX() - this.f105694i.x), (double) (motionEvent.getRawY() - this.f105694i.y)) > ((double) TypedValue.applyDimension(1, 5.0f, this.f105691f.getResources().getDisplayMetrics()))) {
            return true;
        }
        return false;
    }
}
