package com.google.android.libraries.lens.view.main;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.lens.common.p2002e.C24107a;
import com.google.android.libraries.lens.common.p2002e.C24108b;
import com.google.android.libraries.lens.common.p2002e.C24110d;
import com.google.android.libraries.lens.common.p2002e.C24111e;
import com.google.android.libraries.lens.common.p2002e.C24112f;
import com.google.android.libraries.lens.common.p2002e.C24113g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public final class LensOverlayLayout extends FrameLayout {

    /* renamed from: i */
    private static final C58974d f74626i = C58974d.m91135i("LensOverlayLayout");

    /* renamed from: a */
    public View f74627a;

    /* renamed from: b */
    public Integer f74628b;

    /* renamed from: c */
    public C27427g f74629c;

    /* renamed from: d */
    C24113g f74630d;

    /* renamed from: e */
    public C21370a f74631e;

    /* renamed from: f */
    public C47770dh f74632f;

    /* renamed from: g */
    public boolean f74633g;

    /* renamed from: h */
    public boolean f74634h;

    /* renamed from: j */
    private int f74635j;

    /* renamed from: k */
    private int f74636k;

    /* renamed from: l */
    private boolean f74637l;

    /* renamed from: m */
    private final Matrix f74638m;

    /* renamed from: n */
    private final Map f74639n;

    /* renamed from: o */
    private final List f74640o;

    public LensOverlayLayout(Context context) {
        super(context);
        this.f74635j = -1;
        this.f74636k = -1;
        this.f74634h = true;
        this.f74638m = new Matrix();
        this.f74639n = new EnumMap(C24107a.class);
        this.f74640o = C58597ky.m90212c(C24107a.GLEAMS, C24107a.TEXT, C24107a.REGION, C24107a.OBJECTS, C24107a.CAMERA, C24107a.FROZEN_IMAGE);
        this.f74630d = new C24112f(context);
    }

    /* renamed from: d */
    static MotionEvent m50799d(C21370a aVar) {
        long b = aVar.mo26870b();
        return MotionEvent.obtain(b, b, 3, 0.0f, 0.0f, 0);
    }

    /* renamed from: f */
    private static int m50800f(int i, int i2) {
        return (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && i2 == -1) ? View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824) : i;
    }

    /* renamed from: g */
    private static int m50801g(int i, int i2, int i3, int i4) {
        if (i == -1) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, i3 - i4), 1073741824);
        }
        return getChildMeasureSpec(i2, i4, i);
    }

    /* renamed from: h */
    private final void m50802h(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C24108b) {
                C24108b bVar = (C24108b) childAt;
                bVar.mo29504b();
                this.f74639n.put(bVar.mo29504b(), bVar);
            }
            if (childAt instanceof ViewGroup) {
                m50802h((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: i */
    private final void m50803i(List list, MotionEvent motionEvent) {
        C24108b bVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24107a aVar = (C24107a) it.next();
            if (this.f74639n.containsKey(aVar) && (bVar = (C24108b) this.f74639n.get(aVar)) != null) {
                bVar.mo29505d(mo32816e(motionEvent, (View) bVar));
                bVar.mo29504b();
            }
        }
    }

    /* renamed from: j */
    private final void m50804j(MotionEvent motionEvent) {
        this.f74629c.mo32965c(motionEvent);
    }

    /* renamed from: k */
    private final boolean m50805k(MotionEvent motionEvent, List list, boolean z) {
        C24108b bVar;
        C24113g gVar;
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C24107a aVar = (C24107a) it.next();
            if (this.f74639n.containsKey(aVar) && (bVar = (C24108b) this.f74639n.get(aVar)) != null) {
                if (!z2) {
                    z2 = bVar.mo29505d(mo32816e(motionEvent, bVar.mo29503a()));
                    if (z2 && (gVar = this.f74630d) != null) {
                        if (gVar.mo29517c(C24111e.FIRST_TAP) && bVar.mo29504b() != C24107a.FROZEN_IMAGE) {
                            this.f74637l = true;
                        }
                    }
                    bVar.mo29504b();
                } else if (z) {
                    bVar.mo29505d(mo32816e(m50799d(this.f74631e), bVar.mo29503a()));
                    bVar.mo29504b();
                }
            }
        }
        return z2;
    }

    /* renamed from: l */
    private final boolean m50806l(MotionEvent motionEvent) {
        C24113g gVar;
        C24108b bVar;
        if (this.f74629c == null || (gVar = this.f74630d) == null) {
            return false;
        }
        C24112f fVar = (C24112f) gVar;
        C24110d dVar = fVar.f65838h;
        if (dVar != null && motionEvent != null && dVar.f65818a == motionEvent.getActionMasked() && dVar.f65819b == motionEvent.getEventTime()) {
            return false;
        }
        if (!fVar.f65841k) {
            fVar.f65841k = true;
            fVar.f65836f.set(motionEvent.getX(), motionEvent.getY());
            fVar.f65840j = C24111e.TOUCH;
        }
        fVar.f65834d.onTouchEvent(motionEvent);
        C24110d dVar2 = fVar.f65838h;
        if (dVar2 == null || dVar2.f65818a != 1 || !C24112f.f65832b.contains(fVar.f65839i) || motionEvent.getEventTime() - dVar2.f65819b >= ((long) C24112f.f65831a)) {
            fVar.f65837g.onTouchEvent(motionEvent);
        }
        fVar.f65833c.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 && fVar.f65840j != C24111e.FIRST_TAP) {
            fVar.f65841k = false;
        }
        if (motionEvent.getActionMasked() == 3) {
            fVar.f65841k = false;
        }
        fVar.f65838h = new C24110d(motionEvent);
        if (!this.f74639n.isEmpty()) {
            this.f74639n.size();
        } else {
            m50802h(this);
        }
        if (this.f74630d.mo29517c(C24111e.TOUCH)) {
            this.f74637l = false;
            m50803i(this.f74640o, motionEvent);
            m50804j(motionEvent);
        } else {
            if (!this.f74630d.mo29517c(C24111e.DOUBLE_TAP)) {
                if (!this.f74630d.mo29517c(C24111e.FIRST_TAP, C24111e.SINGLE_TAP, C24111e.DOUBLE_TAP, C24111e.LONG_PRESS)) {
                    if (!this.f74630d.mo29517c(C24111e.DRAG, C24111e.DRAG_X, C24111e.DRAG_Y)) {
                        if (!this.f74630d.mo29517c(C24111e.FLING)) {
                            if (this.f74630d.mo29517c(C24111e.ZOOM)) {
                                m50803i(this.f74640o, m50799d(this.f74631e));
                                m50804j(motionEvent);
                            } else {
                                m50805k(motionEvent, this.f74640o, false);
                                m50804j(motionEvent);
                            }
                        } else if (m50805k(motionEvent, this.f74640o, true)) {
                            m50804j(m50799d(this.f74631e));
                        } else {
                            m50803i(this.f74640o, m50799d(this.f74631e));
                            m50804j(motionEvent);
                        }
                    } else if (m50805k(motionEvent, this.f74640o, false)) {
                        this.f74629c.mo32965c(m50799d(this.f74631e));
                    } else {
                        m50803i(this.f74640o, m50799d(this.f74631e));
                        m50804j(motionEvent);
                    }
                } else if (m50805k(motionEvent, this.f74640o, true)) {
                    m50804j(m50799d(this.f74631e));
                } else {
                    m50803i(this.f74640o, m50799d(this.f74631e));
                    m50804j(motionEvent);
                }
            } else if (!this.f74637l && (bVar = (C24108b) this.f74639n.get(C24107a.FROZEN_IMAGE)) != null) {
                bVar.mo29505d(mo32816e(motionEvent, bVar.mo29503a()));
            }
        }
        return true;
    }

    /* renamed from: a */
    public final int mo32812a() {
        if (this.f74636k < 0) {
            ((C58970a) ((C58970a) f74626i.mo56225c()).mo56372aa(49666)).mo56386p("getContentHeight called before layout.");
        }
        return this.f74636k;
    }

    /* renamed from: b */
    public final int mo32813b() {
        if (this.f74635j < 0) {
            ((C58970a) ((C58970a) f74626i.mo56225c()).mo56372aa(49667)).mo56386p("getContentWidth called before layout.");
        }
        return this.f74635j;
    }

    /* renamed from: c */
    public final Point mo32814c() {
        int i;
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int width = (getWidth() / 2) - (mo32813b() / 2);
        Integer num = this.f74628b;
        if (num != null) {
            i = num.intValue();
        } else {
            i = (getHeight() / 2) - (mo32812a() / 2);
        }
        Point point = new Point(width, i);
        point.x += iArr[0];
        point.y += iArr[1];
        return point;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final MotionEvent mo32816e(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.f74638m.reset();
        while (view != null && view != this) {
            this.f74638m.preScale(1.0f / view.getScaleX(), 1.0f / view.getScaleY(), view.getPivotX(), view.getPivotY());
            this.f74638m.preTranslate((-view.getTranslationX()) - ((float) view.getLeft()), (-view.getTranslationY()) - ((float) view.getTop()));
            view = (View) view.getParent();
        }
        obtain.transform(this.f74638m);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View view = this.f74627a;
        if (view == null) {
            super.onMeasure(i, i2);
            this.f74635j = getMeasuredWidth();
            this.f74636k = getMeasuredHeight();
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        measureChildWithMargins(view, m50800f(i, layoutParams.width), 0, m50800f(i2, layoutParams.height), 0);
        this.f74635j = view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin + getPaddingLeft() + getPaddingRight();
        this.f74636k = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + getPaddingTop() + getPaddingBottom();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (getMeasureAllChildren() || childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(m50801g(layoutParams2.width, i, mo32813b(), getPaddingLeft() + getPaddingRight() + layoutParams2.leftMargin + layoutParams2.rightMargin), m50801g(layoutParams2.height, i2, mo32812a(), getPaddingTop() + getPaddingBottom() + layoutParams2.topMargin + layoutParams2.bottomMargin));
            }
        }
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f74634h) {
            return false;
        }
        if (!this.f74633g) {
            return m50806l(motionEvent);
        }
        C47538ax c = this.f74632f.mo51613c("dispatchTouchEvent");
        try {
            boolean l = m50806l(motionEvent);
            if (c != null) {
                c.close();
            }
            return l;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    public LensOverlayLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LensOverlayLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public LensOverlayLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f74635j = -1;
        this.f74636k = -1;
        this.f74634h = true;
        this.f74638m = new Matrix();
        this.f74639n = new EnumMap(C24107a.class);
        this.f74640o = C58597ky.m90212c(C24107a.GLEAMS, C24107a.TEXT, C24107a.REGION, C24107a.OBJECTS, C24107a.CAMERA, C24107a.FROZEN_IMAGE);
        this.f74630d = new C24112f(context);
    }
}
