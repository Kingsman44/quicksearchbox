package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import androidx.customview.p103b.C2149g;
import androidx.customview.p103b.C2150h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.ui.SwipeDismissableFrameLayout */
/* compiled from: PG */
public class SwipeDismissableFrameLayout extends FrameLayout {

    /* renamed from: i */
    private static final C59071e f253385i = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.SwipeDismissableFrameLayout");

    /* renamed from: a */
    public View f253386a;

    /* renamed from: b */
    public C90643as f253387b;

    /* renamed from: c */
    public C90642ar f253388c;

    /* renamed from: d */
    C2150h f253389d;

    /* renamed from: e */
    Paint f253390e;

    /* renamed from: f */
    public float f253391f;

    /* renamed from: g */
    public boolean f253392g = true;

    /* renamed from: h */
    final C2149g f253393h = new C90641aq(this);

    /* renamed from: j */
    private float f253394j;

    /* renamed from: k */
    private float f253395k;

    /* renamed from: l */
    private boolean f253396l;

    /* renamed from: m */
    private int f253397m;

    public SwipeDismissableFrameLayout(Context context) {
        super(context);
        m147920c(context);
    }

    /* renamed from: b */
    private final void m147919b(View view) {
        if (getChildCount() <= 0) {
            this.f253386a = view;
            return;
        }
        throw new IllegalStateException("SwipeDismissableFrameLayout can host only one direct child");
    }

    /* renamed from: c */
    private final void m147920c(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f253395k = (float) viewConfiguration.getScaledTouchSlop();
        this.f253391f = ((float) viewConfiguration.getScaledMinimumFlingVelocity()) * 20.0f;
        this.f253389d = C2150h.m5964m(this, this.f253393h);
        Paint paint = new Paint();
        this.f253390e = paint;
        paint.setColor(-16777216);
    }

    /* renamed from: d */
    private final void m147921d(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f253397m) {
            this.f253397m = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: e */
    private final void m147922e(float f) {
        float f2 = f - this.f253394j;
        if (f2 < 0.0f && Math.abs(f2) > this.f253395k && !this.f253396l) {
            this.f253396l = true;
        }
    }

    /* renamed from: a */
    public final void mo84857a() {
        View view = this.f253386a;
        if (view != null) {
            this.f253389d.mo5413j(view, view.getLeft(), 0);
            invalidate();
        }
    }

    public final void addView(View view) {
        m147919b(view);
        super.addView(view);
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.f253389d.mo5415l()) {
            C2043bi.m5519M(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        View view = this.f253386a;
        if (view != null) {
            canvas.drawRect(0.0f, (float) view.getBottom(), (float) getWidth(), (float) getBottom(), this.f253390e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        setWillNotDraw(false);
        super.onFinishInflate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0.canScrollVertically(1) != false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x009a
            boolean r0 = r5.f253392g
            if (r0 == 0) goto L_0x009a
            com.google.android.apps.gsa.shared.ui.ar r0 = r5.f253388c
            r2 = 1
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo84935b()
            goto L_0x0021
        L_0x0015:
            android.view.View r0 = r5.f253386a
            boolean r3 = r0 instanceof android.widget.ListView
            if (r3 == 0) goto L_0x0024
            android.widget.ListView r0 = (android.widget.ListView) r0
            boolean r0 = androidx.core.widget.C2126m.m5898b(r0, r2)
        L_0x0021:
            if (r0 != 0) goto L_0x009a
            goto L_0x002e
        L_0x0024:
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 == 0) goto L_0x002e
            goto L_0x009a
        L_0x002e:
            int r0 = r6.getActionMasked()
            if (r0 == 0) goto L_0x0072
            r3 = -1
            if (r0 == r2) goto L_0x006d
            r4 = 2
            if (r0 == r4) goto L_0x0045
            r4 = 3
            if (r0 == r4) goto L_0x006d
            r3 = 6
            if (r0 == r3) goto L_0x0041
            goto L_0x0087
        L_0x0041:
            r5.m147921d(r6)
            goto L_0x0087
        L_0x0045:
            int r0 = r5.f253397m
            if (r0 != r3) goto L_0x005e
            com.google.common.f.e r6 = f253385i
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "SwipeDismissFrameLayout"
            r6.mo56378ag(r0, r2)
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            r2 = 11248(0x2bf0, float:1.5762E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r2)).mo56386p(r0)
            return r1
        L_0x005e:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x0065
            return r1
        L_0x0065:
            float r0 = r6.getY(r0)
            r5.m147922e(r0)
            goto L_0x0087
        L_0x006d:
            r5.f253396l = r1
            r5.f253397m = r3
            goto L_0x0087
        L_0x0072:
            int r0 = r6.getPointerId(r1)
            r5.f253397m = r0
            r5.f253396l = r1
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x0081
            return r1
        L_0x0081:
            float r0 = r6.getY(r0)
            r5.f253394j = r0
        L_0x0087:
            androidx.customview.b.h r0 = r5.f253389d
            boolean r0 = r0.mo5412i(r6)
            if (r0 != 0) goto L_0x0095
            boolean r6 = super.onInterceptTouchEvent(r6)
            if (r6 == 0) goto L_0x009a
        L_0x0095:
            boolean r6 = r5.f253396l
            if (r6 == 0) goto L_0x009a
            return r2
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.SwipeDismissableFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f253392g) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f253397m = motionEvent.getPointerId(0);
            this.f253396l = false;
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f253397m);
                if (findPointerIndex < 0) {
                    C59104x c = f253385i.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SwipeDismissFrameLayout");
                    ((C59052c) ((C59052c) c).mo56372aa(11250)).mo56386p("Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                m147922e(motionEvent.getY(findPointerIndex));
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    C59104x c2 = f253385i.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "SwipeDismissFrameLayout");
                    ((C59052c) ((C59052c) c2).mo56372aa(11251)).mo56386p("Got ACTION_POINTER_DOWN event but have an invalid action index.");
                } else {
                    this.f253397m = motionEvent.getPointerId(actionIndex);
                }
            } else if (actionMasked == 6) {
                m147921d(motionEvent);
            }
        } else if (motionEvent.findPointerIndex(this.f253397m) < 0) {
            C59104x c3 = f253385i.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "SwipeDismissFrameLayout");
            ((C59052c) ((C59052c) c3).mo56372aa(11249)).mo56386p("Got ACTION_UP event but don't have an active pointer id.");
        } else {
            this.f253396l = false;
            this.f253397m = -1;
        }
        this.f253389d.mo5408e(motionEvent);
        return true;
    }

    public SwipeDismissableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m147920c(context);
    }

    public final void addView(View view, int i) {
        m147919b(view);
        super.addView(view, i);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m147919b(view);
        super.addView(view, i, layoutParams);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m147919b(view);
        super.addView(view, layoutParams);
    }
}
