package com.google.android.libraries.lens.view.main;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.google.android.libraries.lens.view.filters.C25935c;
import com.google.android.libraries.lens.view.filters.C26022s;
import com.google.android.libraries.lens.view.filters.carousel.C25961q;
import com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView;
import com.google.android.libraries.lens.view.frozenimage.C26270b;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.p2069am.C25328d;
import com.google.android.libraries.lens.view.p2069am.C25329e;
import com.google.android.libraries.lens.view.p2069am.C25330f;
import com.google.android.libraries.lens.view.p2069am.C25331g;
import com.google.android.libraries.lens.view.p2091bb.C25691e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.main.e */
/* compiled from: PG */
public final class C27392e extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener, C27427g {

    /* renamed from: b */
    private static final C59071e f75014b = C59071e.m91332i("com.google.android.libraries.lens.view.main.e");

    /* renamed from: a */
    public C60870cx f75015a;

    /* renamed from: c */
    private final GestureDetector f75016c;

    /* renamed from: d */
    private final ScaleGestureDetector f75017d;

    /* renamed from: e */
    private final long f75018e = ViewConfiguration.getZoomControlsTimeout();

    /* renamed from: f */
    private final C27364d f75019f;

    /* renamed from: g */
    private final C60888db f75020g;

    /* renamed from: h */
    private final C26022s f75021h;

    /* renamed from: i */
    private final LensOverlayLayout f75022i;

    /* renamed from: j */
    private final C25691e f75023j;

    /* renamed from: k */
    private final C26505cj f75024k;

    /* renamed from: l */
    private final C26270b f75025l;

    /* renamed from: m */
    private boolean f75026m;

    public C27392e(Context context, C27364d dVar, C60888db dbVar, C26022s sVar, LensOverlayLayout lensOverlayLayout, C25691e eVar, C26505cj cjVar, C26270b bVar) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.f75016c = gestureDetector;
        gestureDetector.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) null);
        this.f75017d = new ScaleGestureDetector(context, this);
        this.f75019f = dVar;
        this.f75020g = dbVar;
        this.f75021h = sVar;
        this.f75022i = lensOverlayLayout;
        this.f75023j = eVar;
        this.f75024k = cjVar;
        this.f75025l = bVar;
    }

    /* renamed from: e */
    private final float m51054e(float f) {
        return f / ((float) this.f75022i.mo32813b());
    }

    /* renamed from: f */
    private final float m51055f(float f) {
        return f / ((float) this.f75022i.mo32812a());
    }

    /* renamed from: g */
    private final boolean m51056g() {
        return this.f75022i.mo32813b() > 0 && this.f75022i.mo32812a() > 0;
    }

    /* renamed from: a */
    public final PointF mo32963a(PointF pointF) {
        Point c = this.f75022i.mo32814c();
        return new PointF(m51054e(pointF.x - ((float) c.x)), m51055f(pointF.y - ((float) c.y)));
    }

    /* renamed from: b */
    public final PointF mo32964b(MotionEvent motionEvent) {
        return mo32963a(new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
    }

    /* renamed from: c */
    public final void mo32965c(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f75026m = true;
        } else if (!this.f75026m) {
            return;
        }
        this.f75016c.onTouchEvent(motionEvent);
        this.f75017d.onTouchEvent(motionEvent);
        if (actionMasked != 1) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    this.f75015a = this.f75020g.mo29165e(new C27337c(this), this.f75018e, TimeUnit.MILLISECONDS);
                } else if (actionMasked == 6 && motionEvent.getActionIndex() == 0 && m51056g()) {
                    this.f75023j.mo30806h();
                }
            } else if (m51056g()) {
                this.f75023j.mo30805g();
            }
        } else if (m51056g()) {
            this.f75023j.mo30806h();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f75026m = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo32966d(MotionEvent motionEvent) {
        if (this.f75017d.isInProgress() || this.f75015a != null || motionEvent.getPointerCount() > 1 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6) {
            return true;
        }
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (!m51056g()) {
            return false;
        }
        this.f75023j.mo30802d();
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C25935c cVar;
        if (m51056g()) {
            PointF b = mo32964b(motionEvent);
            PointF b2 = mo32964b(motionEvent2);
            PointF pointF = new PointF(m51054e(f), m51055f(f2));
            C25330f fVar = (C25330f) C25331g.f68937g.createBuilder();
            float f3 = b.x;
            fVar.copyOnWrite();
            ((C25331g) fVar.instance).f68939a = f3;
            float f4 = b.y;
            fVar.copyOnWrite();
            ((C25331g) fVar.instance).f68940b = f4;
            float f5 = b2.x;
            fVar.copyOnWrite();
            ((C25331g) fVar.instance).f68941c = f5;
            float f6 = b2.y;
            fVar.copyOnWrite();
            ((C25331g) fVar.instance).f68942d = f6;
            float f7 = pointF.x;
            fVar.copyOnWrite();
            ((C25331g) fVar.instance).f68943e = f7;
            float f8 = pointF.y;
            fVar.copyOnWrite();
            ((C25331g) fVar.instance).f68944f = f8;
            if (this.f75023j.mo30812n((C25331g) fVar.build())) {
                return true;
            }
        }
        if (this.f75021h != null && Math.abs(f) > Math.abs(f2) && !mo32966d(motionEvent) && !mo32966d(motionEvent2)) {
            C26022s sVar = this.f75021h;
            boolean z = motionEvent.getX() > motionEvent2.getX();
            if (!((Boolean) sVar.f70716e.mo3842a()).booleanValue() && ((Boolean) sVar.f70718g.mo3842a()).booleanValue() && (cVar = sVar.f70725n) != null) {
                FilterCarouselView filterCarouselView = cVar.mo17754z().f70687l;
                if (filterCarouselView != null) {
                    C25961q a = filterCarouselView.mo17754z();
                    a.mo31147i(a.mo31141c() + a.mo31140b(z));
                }
                return true;
            }
        }
        if (Math.abs(f2) <= Math.abs(f) || f2 >= 0.0f || mo32966d(motionEvent) || mo32966d(motionEvent2) || this.f75025l.mo31474e() || !this.f75019f.mo32905i()) {
            return false;
        }
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.f75019f.mo32904h() || !m51056g()) {
            return false;
        }
        PointF a = mo32963a(new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (this.f75024k.mo31777m()) {
            return true;
        }
        if (this.f75025l.mo31474e()) {
            this.f75023j.mo30804f(scaleFactor, a);
        } else {
            this.f75019f.mo32902f(scaleFactor);
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!m51056g()) {
            return false;
        }
        PointF b = mo32964b(motionEvent);
        PointF b2 = mo32964b(motionEvent2);
        PointF pointF = new PointF(m51054e(f), m51055f(f2));
        C25328d dVar = (C25328d) C25329e.f68928h.createBuilder();
        float f3 = b.x;
        dVar.copyOnWrite();
        ((C25329e) dVar.instance).f68930a = f3;
        float f4 = b.y;
        dVar.copyOnWrite();
        ((C25329e) dVar.instance).f68931b = f4;
        float f5 = b2.x;
        dVar.copyOnWrite();
        ((C25329e) dVar.instance).f68932c = f5;
        float f6 = b2.y;
        dVar.copyOnWrite();
        ((C25329e) dVar.instance).f68933d = f6;
        float f7 = pointF.x;
        dVar.copyOnWrite();
        ((C25329e) dVar.instance).f68934e = f7;
        float f8 = pointF.y;
        dVar.copyOnWrite();
        ((C25329e) dVar.instance).f68935f = f8;
        C25691e eVar = this.f75023j;
        C25328d dVar2 = (C25328d) ((C25329e) dVar.build()).toBuilder();
        int max = Math.max(motionEvent.getPointerCount(), motionEvent2.getPointerCount());
        dVar2.copyOnWrite();
        ((C25329e) dVar2.instance).f68936g = max;
        eVar.mo30813o((C25329e) dVar2.build());
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (m51056g()) {
            PointF b = mo32964b(motionEvent);
            if (Float.isNaN(b.x) || Float.isNaN(b.y) || b.x < 0.0f || b.x > 1.0f || b.y < 0.0f || b.y > 1.0f) {
                ((C59052c) ((C59052c) f75014b.mo56226d()).mo56372aa(49665)).mo56359L("Ignoring tap outside viewfinder: %s - raw(%s, %s)", b, Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
            } else {
                this.f75019f.mo32901e(b.x, b.y);
            }
        }
        this.f75019f.mo32903g();
        return true;
    }
}
