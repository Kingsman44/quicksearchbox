package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.content.Context;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97112h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97214b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.j */
/* compiled from: PG */
public final class C97224j {

    /* renamed from: e */
    private static final C59071e f271617e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.j");

    /* renamed from: a */
    public final C97147as f271618a = new C97147as();

    /* renamed from: b */
    public final C97138aj f271619b;

    /* renamed from: c */
    public final C88473w f271620c;

    /* renamed from: d */
    public boolean f271621d = true;

    /* renamed from: f */
    private final View f271622f;

    /* renamed from: g */
    private final Context f271623g;

    /* renamed from: h */
    private final C97112h f271624h;

    /* renamed from: i */
    private final PointF f271625i = new PointF();

    /* renamed from: j */
    private final PointF f271626j = new PointF();

    /* renamed from: k */
    private final C21370a f271627k;

    /* renamed from: l */
    private boolean f271628l = false;

    /* renamed from: m */
    private long f271629m;

    public C97224j(View view, View view2, Context context, C97112h hVar, C97138aj ajVar, C88473w wVar, C21370a aVar) {
        this.f271622f = view;
        this.f271623g = context;
        this.f271624h = hVar;
        this.f271619b = ajVar;
        this.f271620c = wVar;
        this.f271627k = aVar;
        view.setOnTouchListener(new C97221g(this, new GestureDetector(context, new C97223i())));
        view.setOnClickListener(new C97222h(this));
        Objects.requireNonNull(ajVar);
        C97194d dVar = new C97194d(ajVar);
        Objects.requireNonNull(ajVar);
        new C97142an(context, view2, dVar, new C97205e(ajVar), new C97212f(this));
    }

    /* renamed from: c */
    private final void m160929c(MotionEvent motionEvent) {
        this.f271626j.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f271618a.mo90546d();
        this.f271628l = true;
        C97214b a = this.f271624h.f271343l.mo90472a();
        this.f271625i.set(m160931e(motionEvent.getRawX() - a.mo90592a(), this.f271622f.getWidth() / 2), m160931e(motionEvent.getRawY() - a.mo90593b(), this.f271622f.getHeight() / 2));
        float f = this.f271625i.x;
        float f2 = this.f271625i.y;
    }

    /* renamed from: d */
    private final void m160930d(float f, float f2) {
        this.f271618a.mo90544b();
        this.f271628l = false;
        this.f271619b.mo90524l(f, f2);
    }

    /* renamed from: e */
    private static final float m160931e(float f, int i) {
        float f2 = (float) i;
        if (f > f2) {
            f = f2;
        }
        float f3 = (float) (-i);
        return f < f3 ? f3 : f;
    }

    /* renamed from: a */
    public final void mo90602a(MotionEvent motionEvent) {
        float f;
        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f271628l) {
                        ((C59052c) ((C59052c) f271617e.mo56226d()).mo56372aa(18379)).mo56386p("ACTION_MOVE occurred while movement not in progress");
                        this.f271619b.mo90527o();
                        m160929c(motionEvent);
                        this.f271629m = this.f271627k.mo26870b();
                    }
                    if (this.f271620c != C88473w.SEARCH || this.f271627k.mo26870b() - this.f271629m >= 100) {
                        this.f271618a.mo90545c(motionEvent);
                        if (this.f271621d || mo90603b(motionEvent)) {
                            this.f271619b.mo90523k(motionEvent.getRawX() - this.f271625i.x, motionEvent.getRawY() - this.f271625i.y);
                        }
                    }
                } else if (actionMasked != 4) {
                    m160930d(0.0f, 0.0f);
                }
            } else if (!this.f271628l) {
                m160930d(0.0f, 0.0f);
            } else {
                this.f271618a.mo90545c(motionEvent);
                C97147as asVar = this.f271618a;
                if (asVar.f271455b == null) {
                    ((C59052c) ((C59052c) C97147as.f271454a.mo56226d()).mo56372aa(18419)).mo56386p("Missing call for VelocityUtil.init()");
                    int i = C90755l.f253831a;
                    f = 0.0f;
                } else {
                    asVar.mo90543a();
                    f = asVar.f271455b.getXVelocity();
                }
                C97147as asVar2 = this.f271618a;
                if (asVar2.f271455b == null) {
                    ((C59052c) ((C59052c) C97147as.f271454a.mo56226d()).mo56372aa(18420)).mo56386p("Missing call for VelocityUtil.init()");
                    int i2 = C90755l.f253831a;
                } else {
                    asVar2.mo90543a();
                    f2 = asVar2.f271455b.getYVelocity();
                }
                m160930d(f, f2);
            }
        } else {
            if (this.f271620c != C88473w.SEARCH) {
                this.f271619b.mo90527o();
            }
            m160929c(motionEvent);
            this.f271618a.mo90545c(motionEvent);
            this.f271629m = this.f271627k.mo26870b();
        }
    }

    /* renamed from: b */
    public final boolean mo90603b(MotionEvent motionEvent) {
        if (Math.hypot((double) (motionEvent.getRawX() - this.f271626j.x), (double) (motionEvent.getRawY() - this.f271626j.y)) > ((double) TypedValue.applyDimension(1, 5.0f, this.f271623g.getResources().getDisplayMetrics()))) {
            return true;
        }
        return false;
    }
}
