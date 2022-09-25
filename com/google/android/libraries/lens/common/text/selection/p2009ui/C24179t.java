package com.google.android.libraries.lens.common.text.selection.p2009ui;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2010a.C24154a;
import com.google.android.libraries.lens.view.textoverlay.C28090w;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.t */
/* compiled from: PG */
final class C24179t extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: f */
    public static final /* synthetic */ int f66082f = 0;

    /* renamed from: a */
    public final GestureDetector f66083a;

    /* renamed from: b */
    public boolean f66084b;

    /* renamed from: c */
    public final TextSelectionView f66085c;

    /* renamed from: d */
    MotionEvent f66086d;

    /* renamed from: e */
    final /* synthetic */ TextSelectionView f66087e;

    /* renamed from: g */
    private int f66088g = 1;

    public C24179t(TextSelectionView textSelectionView, TextSelectionView textSelectionView2, Context context) {
        this.f66087e = textSelectionView;
        this.f66085c = textSelectionView2;
        this.f66083a = new GestureDetector(context, this);
    }

    /* renamed from: d */
    private final boolean m45000d(MotionEvent motionEvent, int i) {
        C24154a aVar = this.f66087e.f65963p;
        if (aVar == null) {
            return false;
        }
        return ((C24178s) aVar).mo29639e((int) motionEvent.getX(), (int) motionEvent.getY(), i);
    }

    /* renamed from: a */
    public final void mo29641a(Point point) {
        this.f66085c.f65955h.mo29630e(point);
        this.f66085c.f65956i.mo29630e(point);
    }

    /* renamed from: b */
    public final boolean mo29642b() {
        boolean z = false;
        if (this.f66084b) {
            this.f66087e.mo29565f();
            if (this.f66087e.f65960m) {
                this.f66085c.f65955h.mo29633h(true);
                this.f66085c.f65956i.mo29633h(true);
                this.f66087e.mo29568i();
            }
            this.f66084b = false;
            this.f66088g = 1;
            C24163d dVar = this.f66085c.f65959l;
            dVar.f66026d = false;
            dVar.invalidate();
            mo29641a(new Point());
            C24154a aVar = this.f66087e.f65963p;
            if (aVar != null) {
                C24178s sVar = (C24178s) aVar;
                sVar.f66076i.mo33548a();
                C28090w wVar = sVar.f66074g;
                if (wVar != null) {
                    wVar.mo33547a();
                }
            }
            z = true;
        }
        this.f66083a.setIsLongpressEnabled(true);
        return z;
    }

    /* renamed from: c */
    public final void mo29643c(int i) {
        this.f66084b = true;
        this.f66088g = i;
        this.f66083a.setIsLongpressEnabled(false);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (this.f66084b) {
            int i = TextSelectionView.f65945s;
            return true;
        }
        boolean d = m45000d(motionEvent, 2);
        int i2 = TextSelectionView.f65945s;
        return d;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        m45000d(motionEvent, 3);
        int i = TextSelectionView.f65945s;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f66084b || this.f66088g == 1) {
            int i = TextSelectionView.f65945s;
            return false;
        }
        int x = (int) motionEvent2.getX();
        int y = (int) motionEvent2.getY();
        int i2 = this.f66088g;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 1) {
                Point point = new Point();
                this.f66085c.f65955h.mo29628c(point, x, y);
                this.f66085c.f65959l.mo29598a(x, y, point);
                this.f66087e.f65963p.mo29576a(point.x, point.y);
            } else if (i3 == 2) {
                Point point2 = new Point();
                this.f66085c.f65956i.mo29628c(point2, x, y);
                this.f66085c.f65959l.mo29598a(x, y, point2);
                this.f66087e.f65963p.mo29576a(point2.x, point2.y);
            } else if (i3 != 3) {
                C58838bb.m90883r(false);
            } else {
                this.f66087e.f65963p.mo29576a(x, y);
            }
            int i4 = TextSelectionView.f65945s;
            return true;
        }
        throw null;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.f66084b) {
            int i = TextSelectionView.f65945s;
            return false;
        }
        boolean d = m45000d(motionEvent, 4);
        int i2 = TextSelectionView.f65945s;
        return d;
    }
}
