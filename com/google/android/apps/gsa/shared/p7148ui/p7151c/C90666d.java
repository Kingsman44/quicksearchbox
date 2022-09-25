package com.google.android.apps.gsa.shared.p7148ui.p7151c;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import androidx.drawerlayout.widget.C2179h;
import androidx.drawerlayout.widget.C2180i;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.apps.gsa.searchnow.C88861am;
import com.google.android.apps.gsa.searchnow.C88878o;
import com.google.android.apps.gsa.searchnow.C88885v;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.sidekick.shared.overlay.C91896e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
/* renamed from: com.google.android.apps.gsa.shared.ui.c.d */
/* compiled from: PG */
public class C90666d extends DrawerLayout implements C2179h {

    /* renamed from: h */
    private boolean f253545h;

    /* renamed from: i */
    private boolean f253546i;

    /* renamed from: j */
    public final List f253547j = new ArrayList();

    /* renamed from: k */
    protected FrameLayout f253548k;

    /* renamed from: l */
    protected C2180i f253549l;

    /* renamed from: m */
    protected float f253550m;

    /* renamed from: n */
    protected float f253551n;

    /* renamed from: o */
    protected final Set f253552o = new HashSet();

    /* renamed from: p */
    protected Rect f253553p;

    /* renamed from: q */
    public int f253554q;

    /* renamed from: r */
    private float f253555r;

    /* renamed from: s */
    private float f253556s;

    public C90666d(Context context) {
        super(context);
        mo84961z(context);
    }

    /* renamed from: x */
    private final void mo82635x() {
        this.f253545h = false;
        this.f253546i = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final View mo84963B(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C2043bi.m5577f(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((Gravity.getAbsoluteGravity(((C2180i) childAt.getLayoutParams()).f6189a, C2043bi.m5577f(this)) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo5487a(View view) {
        throw null;
    }

    /* renamed from: b */
    public void mo5488b(View view) {
        throw null;
    }

    /* renamed from: c */
    public final void mo5489c(View view) {
        if (view == this.f253548k) {
            Iterator it = this.f253552o.iterator();
            if (it.hasNext()) {
                C90664b bVar = (C90664b) it.next();
                throw null;
            }
        }
    }

    /* renamed from: d */
    public final void mo5490d() {
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo82636y(rect);
        return super.fitSystemWindows(rect);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(this.f253548k);
        this.f253548k.setFitsSystemWindows(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 != 3) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 == r1) goto L_0x004f
            r2 = 2
            r3 = 3
            if (r0 == r2) goto L_0x0011
            if (r0 == r3) goto L_0x004f
            goto L_0x00c6
        L_0x0011:
            boolean r0 = r6.f253545h
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r6.f253546i
            if (r0 != 0) goto L_0x00c6
            float r0 = r7.getX()
            float r2 = r6.f253555r
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r7.getY()
            float r4 = r6.f253556s
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            int r4 = r6.f253554q
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x003b
            r6.mo82635x()
            goto L_0x00c6
        L_0x003b:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            r6.f253546i = r1
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r7)
            r7.setAction(r3)
            super.onInterceptTouchEvent(r7)
            r7.recycle()
            return r1
        L_0x004f:
            r6.mo82635x()
            goto L_0x00c6
        L_0x0054:
            float r0 = r7.getX()
            r6.f253555r = r0
            float r0 = r7.getY()
            r6.f253556s = r0
            float r0 = r7.getX()
            r7.getY()
            int r2 = r6.getLeft()
            float r2 = (float) r2
            float r2 = r2 + r0
            float r3 = r6.f253551n
            r4 = 8388613(0x800005, float:1.175495E-38)
            r5 = 8388611(0x800003, float:1.1754948E-38)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0099
            int r2 = r6.getLeft()
            float r2 = (float) r2
            float r2 = r2 + r0
            float r3 = r6.f253550m
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0099
            boolean r0 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148876h(r6)
            if (r0 == 0) goto L_0x0092
            android.view.View r0 = r6.mo84963B(r4)
            if (r0 == 0) goto L_0x00c6
            goto L_0x00c4
        L_0x0092:
            android.view.View r0 = r6.mo84963B(r5)
            if (r0 == 0) goto L_0x00c6
            goto L_0x00c4
        L_0x0099:
            int r2 = r6.getRight()
            float r2 = (float) r2
            float r2 = r2 - r0
            float r3 = r6.f253551n
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c6
            int r2 = r6.getRight()
            float r2 = (float) r2
            float r2 = r2 - r0
            float r0 = r6.f253550m
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00c6
            boolean r0 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148876h(r6)
            if (r0 == 0) goto L_0x00be
            android.view.View r0 = r6.mo84963B(r5)
            if (r0 == 0) goto L_0x00c6
            goto L_0x00c4
        L_0x00be:
            android.view.View r0 = r6.mo84963B(r4)
            if (r0 == 0) goto L_0x00c6
        L_0x00c4:
            r6.f253545h = r1
        L_0x00c6:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.p7151c.C90666d.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        View g = mo5456g(8388611);
        if (g != null) {
            DrawerLayout.m6036w(g);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            mo82635x();
        }
        if (this.f253546i) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: y */
    public void mo82636y(Rect rect) {
        C58976aa aaVar = C58975e.f156826a;
        if (!rect.equals(this.f253553p)) {
            this.f253553p = new Rect(rect);
            for (C88878o oVar : this.f253547j) {
                Rect rect2 = new Rect(rect);
                C88861am amVar = oVar.f240653a;
                amVar.f240576F = rect2;
                C90730an.m148190c(amVar.f240609j, new C88885v(rect2));
                amVar.mo82648i();
                C91896e eVar = amVar.f240591U;
                if (eVar != null) {
                    eVar.f256229a = rect2;
                    eVar.f256232d.notifyObservers();
                    C90714z zVar = eVar.f256238j;
                    if (zVar != null) {
                        zVar.mo85045i(eVar.mo86475c(), !eVar.f256239k);
                    }
                    eVar.mo86479g(false);
                }
                amVar.f240573C.f256340c.set(rect2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo84961z(Context context) {
        throw null;
    }

    public C90666d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo84961z(context);
    }

    public C90666d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo84961z(context);
    }
}
