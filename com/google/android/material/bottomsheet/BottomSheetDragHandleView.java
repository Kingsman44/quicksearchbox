package com.google.android.material.bottomsheet;

import android.content.Context;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.theme.p3518a.C44965a;

/* compiled from: PG */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a */
    private final AccessibilityManager f115921a;

    /* renamed from: b */
    private BottomSheetBehavior f115922b;

    /* renamed from: c */
    private boolean f115923c;

    /* renamed from: d */
    private boolean f115924d;

    /* renamed from: e */
    private boolean f115925e;

    /* renamed from: f */
    private final String f115926f;

    /* renamed from: g */
    private final String f115927g;

    /* renamed from: h */
    private final String f115928h;

    /* renamed from: i */
    private final C44555f f115929i;

    public BottomSheetDragHandleView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private final void m78810c(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f115922b;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f115869L.remove(this.f115929i);
        }
        this.f115922b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            mo47524a(bottomSheetBehavior.f115862E);
            this.f115922b.mo47506D(this.f115929i);
        }
        m78811d();
    }

    /* renamed from: d */
    private final void m78811d() {
        int i = 1;
        boolean z = false;
        if (this.f115923c && this.f115922b != null) {
            z = true;
        }
        this.f115924d = z;
        if (this.f115922b == null) {
            i = 2;
        }
        C2043bi.m5551ae(this, i);
        setClickable(this.f115924d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47524a(int r3) {
        /*
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L_0x0007
            r3 = 1
        L_0x0004:
            r2.f115925e = r3
            goto L_0x000c
        L_0x0007:
            r0 = 3
            if (r3 != r0) goto L_0x000c
            r3 = 0
            goto L_0x0004
        L_0x000c:
            androidx.core.j.a.h r3 = androidx.core.p098j.p099a.C1988h.f5905c
            boolean r0 = r2.f115925e
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r2.f115926f
            goto L_0x0017
        L_0x0015:
            java.lang.String r0 = r2.f115927g
        L_0x0017:
            com.google.android.material.bottomsheet.r r1 = new com.google.android.material.bottomsheet.r
            r1.<init>(r2)
            androidx.core.p098j.C2043bi.m5523Q(r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.mo47524a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (true != r1) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (true != r1) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (true != r7.f115925e) goto L_0x0042;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47525b() {
        /*
            r7 = this;
            boolean r0 = r7.f115924d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r7.f115928h
            android.view.accessibility.AccessibilityManager r2 = r7.f115921a
            if (r2 == 0) goto L_0x001e
            r2 = 16384(0x4000, float:2.2959E-41)
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain(r2)
            java.util.List r3 = r2.getText()
            r3.add(r0)
            android.view.accessibility.AccessibilityManager r0 = r7.f115921a
            r0.sendAccessibilityEvent(r2)
        L_0x001e:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.f115922b
            boolean r2 = r0.f115895f
            r3 = 1
            if (r2 != 0) goto L_0x002c
            boolean r0 = r0.mo47521x()
            if (r0 != 0) goto L_0x002c
            r1 = 1
        L_0x002c:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.f115922b
            int r2 = r0.f115862E
            r4 = 6
            r5 = 3
            r6 = 4
            if (r2 != r6) goto L_0x0039
            if (r3 == r1) goto L_0x0043
        L_0x0037:
            r4 = 3
            goto L_0x0043
        L_0x0039:
            if (r2 != r5) goto L_0x003e
            if (r3 == r1) goto L_0x0043
            goto L_0x0042
        L_0x003e:
            boolean r1 = r7.f115925e
            if (r3 == r1) goto L_0x0037
        L_0x0042:
            r4 = 4
        L_0x0043:
            r0.mo47519v(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.mo47525b():boolean");
    }

    public final void onAccessibilityStateChanged(boolean z) {
        this.f115923c = z;
        m78811d();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [androidx.coordinatorlayout.widget.c] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r3 = this;
            super.onAttachedToWindow()
            r0 = r3
        L_0x0004:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L_0x0010
            android.view.View r0 = (android.view.View) r0
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 == 0) goto L_0x0026
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof androidx.coordinatorlayout.widget.C1773f
            if (r2 == 0) goto L_0x0004
            androidx.coordinatorlayout.widget.f r1 = (androidx.coordinatorlayout.widget.C1773f) r1
            androidx.coordinatorlayout.widget.c r1 = r1.f5523a
            boolean r2 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r2 == 0) goto L_0x0004
            r2 = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
        L_0x0026:
            r3.m78810c(r2)
            android.view.accessibility.AccessibilityManager r0 = r3.f115921a
            if (r0 == 0) goto L_0x003b
            r0.addAccessibilityStateChangeListener(r3)
            android.view.accessibility.AccessibilityManager r0 = r3.f115921a
            boolean r0 = r0.isEnabled()
            r3.f115923c = r0
            r3.m78811d()
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f115921a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        m78810c((BottomSheetBehavior) null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151577), attributeSet, i);
        this.f115926f = getResources().getString(R.string.bottomsheet_action_expand);
        this.f115927g = getResources().getString(R.string.bottomsheet_action_collapse);
        this.f115928h = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.f115929i = new C44568s(this);
        this.f115921a = (AccessibilityManager) getContext().getSystemService("accessibility");
        m78811d();
        C2043bi.m5526T(this, new C44569t(this));
    }
}
