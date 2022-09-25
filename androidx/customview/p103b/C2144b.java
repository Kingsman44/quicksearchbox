package androidx.customview.p103b;

import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1982b;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1995o;
import androidx.core.p098j.p099a.C1997q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.customview.b.b */
/* compiled from: PG */
public abstract class C2144b extends C2061c {
    private static final Rect INVALID_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
    public int mAccessibilityFocusedVirtualViewId = LinearLayoutManager.INVALID_OFFSET;
    public final View mHost;
    private int mHoveredVirtualViewId = LinearLayoutManager.INVALID_OFFSET;
    public int mKeyboardFocusedVirtualViewId = LinearLayoutManager.INVALID_OFFSET;
    public final AccessibilityManager mManager;
    private C2143a mNodeProvider;
    private final int[] mTempGlobalRect = new int[2];
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();

    public C2144b(View view) {
        super(C2061c.DEFAULT_DELEGATE);
        if (view != null) {
            this.mHost = view;
            this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C2043bi.m5575d(view) == 0) {
                C2043bi.m5551ae(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private final AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private final C1991k createNodeForChild(int i) {
        C1991k kVar = new C1991k(AccessibilityNodeInfo.obtain());
        kVar.f5921a.setEnabled(true);
        kVar.f5921a.setFocusable(true);
        kVar.f5921a.setClassName("android.view.View");
        Rect rect = INVALID_BOUNDS;
        kVar.f5921a.setBoundsInParent(rect);
        kVar.f5921a.setBoundsInScreen(rect);
        kVar.mo5156e(this.mHost);
        onPopulateNodeForVirtualView(i, kVar);
        if (kVar.mo5152a() == null && kVar.f5921a.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        kVar.f5921a.getBoundsInParent(this.mTempParentRect);
        kVar.f5921a.getBoundsInScreen(this.mTempScreenRect);
        if (!this.mTempParentRect.equals(rect) || !this.mTempScreenRect.equals(rect)) {
            int actions = kVar.f5921a.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                kVar.f5921a.setPackageName(this.mHost.getContext().getPackageName());
                View view = this.mHost;
                kVar.f5923c = i;
                kVar.f5921a.setSource(view, i);
                if (this.mAccessibilityFocusedVirtualViewId == i) {
                    kVar.f5921a.setAccessibilityFocused(true);
                    kVar.f5921a.addAction(128);
                } else {
                    kVar.f5921a.setAccessibilityFocused(false);
                    kVar.f5921a.addAction(64);
                }
                boolean z = this.mKeyboardFocusedVirtualViewId == i;
                if (z) {
                    kVar.f5921a.addAction(2);
                } else if (kVar.f5921a.isFocusable()) {
                    kVar.f5921a.addAction(1);
                }
                kVar.f5921a.setFocused(z);
                this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                if (this.mTempScreenRect.equals(rect)) {
                    setBoundsInScreenFromBoundsInParent(kVar, this.mTempParentRect);
                    kVar.f5921a.getBoundsInScreen(this.mTempScreenRect);
                }
                if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                    this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                    if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                        kVar.f5921a.setBoundsInScreen(this.mTempScreenRect);
                        Rect rect2 = this.mTempScreenRect;
                        if (rect2 != null && !rect2.isEmpty() && this.mHost.getWindowVisibility() == 0) {
                            ViewParent parent = this.mHost.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    kVar.f5921a.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return kVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: androidx.core.j.a.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: androidx.core.j.a.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: androidx.core.j.a.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: androidx.core.j.a.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean moveFocus(int r18, android.graphics.Rect r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.getVisibleVirtualViews(r3)
            androidx.c.o r4 = new androidx.c.o
            r5 = 10
            r4.<init>(r5)
            r5 = 0
            r6 = 0
        L_0x0017:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x003b
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            androidx.core.j.a.k r7 = r0.createNodeForChild(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.mo3730i(r8, r7)
            int r6 = r6 + 1
            goto L_0x0017
        L_0x003b:
            int r3 = r0.mKeyboardFocusedVirtualViewId
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r6) goto L_0x0043
            r3 = 0
            goto L_0x0049
        L_0x0043:
            java.lang.Object r3 = r4.mo3726e(r3)
            androidx.core.j.a.k r3 = (androidx.core.p098j.p099a.C1991k) r3
        L_0x0049:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0142
            if (r1 == r8) goto L_0x0142
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0069
            if (r1 == r12) goto L_0x0069
            if (r1 == r11) goto L_0x0069
            if (r1 != r8) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0069:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.mKeyboardFocusedVirtualViewId
            java.lang.String r7 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r6) goto L_0x007e
            androidx.core.j.a.k r2 = r0.obtainAccessibilityNodeInfo(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f5921a
            r2.getBoundsInScreen(r14)
            goto L_0x00ab
        L_0x007e:
            if (r2 == 0) goto L_0x0084
            r14.set(r2)
            goto L_0x00ab
        L_0x0084:
            android.view.View r2 = r0.mHost
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a8
            if (r1 == r12) goto L_0x00a4
            if (r1 == r11) goto L_0x00a0
            if (r1 != r8) goto L_0x009a
            r14.set(r5, r9, r15, r9)
            goto L_0x00ab
        L_0x009a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x00a0:
            r14.set(r9, r5, r9, r2)
            goto L_0x00ab
        L_0x00a4:
            r14.set(r5, r2, r15, r2)
            goto L_0x00ab
        L_0x00a8:
            r14.set(r15, r5, r15, r2)
        L_0x00ab:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r14)
            if (r1 == r13) goto L_0x00db
            if (r1 == r12) goto L_0x00d2
            if (r1 == r11) goto L_0x00c8
            if (r1 != r8) goto L_0x00c2
            int r7 = r14.height()
            int r7 = r7 + r10
            int r7 = -r7
            r2.offset(r5, r7)
            goto L_0x00e3
        L_0x00c2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x00c8:
            int r7 = r14.width()
            int r7 = r7 + r10
            int r7 = -r7
            r2.offset(r7, r5)
            goto L_0x00e3
        L_0x00d2:
            int r7 = r14.height()
            int r7 = r7 + r10
            r2.offset(r5, r7)
            goto L_0x00e3
        L_0x00db:
            int r7 = r14.width()
            int r7 = r7 + r10
            r2.offset(r7, r5)
        L_0x00e3:
            int r7 = r4.mo3725d()
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r16 = 0
        L_0x00ee:
            if (r5 >= r7) goto L_0x013f
            java.lang.Object r9 = r4.mo3727f(r5)
            androidx.core.j.a.k r9 = (androidx.core.p098j.p099a.C1991k) r9
            if (r9 != r3) goto L_0x00f9
            goto L_0x013c
        L_0x00f9:
            android.view.accessibility.AccessibilityNodeInfo r10 = r9.f5921a
            r10.getBoundsInScreen(r8)
            boolean r10 = androidx.customview.p103b.C2146d.m5948d(r14, r8, r1)
            if (r10 == 0) goto L_0x013c
            boolean r10 = androidx.customview.p103b.C2146d.m5948d(r14, r2, r1)
            if (r10 != 0) goto L_0x010b
            goto L_0x0137
        L_0x010b:
            boolean r10 = androidx.customview.p103b.C2146d.m5947c(r1, r14, r8, r2)
            if (r10 != 0) goto L_0x0137
            boolean r10 = androidx.customview.p103b.C2146d.m5947c(r1, r14, r2, r8)
            if (r10 != 0) goto L_0x013c
            int r10 = androidx.customview.p103b.C2146d.m5945a(r1, r14, r8)
            int r11 = androidx.customview.p103b.C2146d.m5946b(r1, r14, r8)
            int r12 = androidx.customview.p103b.C2146d.m5945a(r1, r14, r2)
            int r13 = androidx.customview.p103b.C2146d.m5946b(r1, r14, r2)
            int r15 = r10 * 13
            int r15 = r15 * r10
            int r11 = r11 * r11
            int r15 = r15 + r11
            int r10 = r12 * 13
            int r10 = r10 * r12
            int r13 = r13 * r13
            int r10 = r10 + r13
            if (r15 >= r10) goto L_0x013c
        L_0x0137:
            r2.set(r8)
            r16 = r9
        L_0x013c:
            int r5 = r5 + 1
            goto L_0x00ee
        L_0x013f:
            r1 = r16
            goto L_0x01a3
        L_0x0142:
            android.view.View r2 = r0.mHost
            int r2 = androidx.core.p098j.C2043bi.m5577f(r2)
            if (r2 != r10) goto L_0x014c
            r2 = 1
            goto L_0x014d
        L_0x014c:
            r2 = 0
        L_0x014d:
            int r7 = r4.mo3725d()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r7)
        L_0x0156:
            if (r5 >= r7) goto L_0x0164
            java.lang.Object r12 = r4.mo3727f(r5)
            androidx.core.j.a.k r12 = (androidx.core.p098j.p099a.C1991k) r12
            r11.add(r12)
            int r5 = r5 + 1
            goto L_0x0156
        L_0x0164:
            androidx.customview.b.c r5 = new androidx.customview.b.c
            r5.<init>(r2)
            java.util.Collections.sort(r11, r5)
            if (r1 == r10) goto L_0x018b
            if (r1 != r8) goto L_0x0183
            int r1 = r11.size()
            if (r3 != 0) goto L_0x0177
            goto L_0x017b
        L_0x0177:
            int r9 = r11.lastIndexOf(r3)
        L_0x017b:
            int r9 = r9 + r10
            if (r9 >= r1) goto L_0x019d
            java.lang.Object r7 = r11.get(r9)
            goto L_0x019e
        L_0x0183:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x018b:
            int r1 = r11.size()
            if (r3 == 0) goto L_0x0195
            int r1 = r11.indexOf(r3)
        L_0x0195:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x019d
            java.lang.Object r7 = r11.get(r1)
            goto L_0x019e
        L_0x019d:
            r7 = 0
        L_0x019e:
            r16 = r7
            androidx.core.j.a.k r16 = (androidx.core.p098j.p099a.C1991k) r16
            goto L_0x013f
        L_0x01a3:
            if (r1 != 0) goto L_0x01a6
            goto L_0x01ae
        L_0x01a6:
            int r1 = r4.mo3722b(r1)
            int r6 = r4.mo3723c(r1)
        L_0x01ae:
            boolean r1 = r0.requestKeyboardFocusForVirtualView(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p103b.C2144b.moveFocus(int, android.graphics.Rect):boolean");
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 != i) {
            this.mHoveredVirtualViewId = i;
            sendEventForVirtualView$ar$ds(i, 128);
            sendEventForVirtualView$ar$ds(i2, 256);
        }
    }

    public final boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = LinearLayoutManager.INVALID_OFFSET;
        this.mHost.invalidate();
        sendEventForVirtualView$ar$ds(i, 65536);
        return true;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = LinearLayoutManager.INVALID_OFFSET;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView$ar$ds(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                updateHoveredVirtualView(virtualViewAt);
                if (virtualViewAt != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                return false;
            } else {
                updateHoveredVirtualView(LinearLayoutManager.INVALID_OFFSET);
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            int i2 = 66;
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        if (keyCode == 19) {
                            i2 = 33;
                        } else if (keyCode == 21) {
                            i2 = 17;
                        } else if (keyCode != 22) {
                            i2 = 130;
                        }
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && moveFocus(i2, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            int i3 = this.mKeyboardFocusedVirtualViewId;
            if (i3 != Integer.MIN_VALUE) {
                onPerformActionForVirtualView$ar$ds(i3, 16);
            }
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return moveFocus(2, (Rect) null);
        } else {
            if (!keyEvent.hasModifiers(1)) {
                return false;
            }
            return moveFocus(1, (Rect) null);
        }
    }

    public C1995o getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C2143a(this);
        }
        return this.mNodeProvider;
    }

    /* access modifiers changed from: protected */
    public abstract int getVirtualViewAt(float f, float f2);

    /* access modifiers changed from: protected */
    public abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        ViewParent parent;
        if (this.mManager.isEnabled() && (parent = this.mHost.getParent()) != null) {
            AccessibilityEvent createEventForHost = createEventForHost(2048);
            C1982b.m5325b(createEventForHost, 1);
            parent.requestSendAccessibilityEvent(this.mHost, createEventForHost);
        }
    }

    /* access modifiers changed from: package-private */
    public final C1991k obtainAccessibilityNodeInfo(int i) {
        if (i != -1) {
            return createNodeForChild(i);
        }
        C1991k kVar = new C1991k(AccessibilityNodeInfo.obtain(this.mHost));
        C2043bi.m5518L(this.mHost, kVar);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (kVar.f5921a.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                kVar.f5921a.addChild(this.mHost, ((Integer) arrayList.get(i2)).intValue());
            }
            return kVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        onPopulateNodeForHost(kVar);
    }

    /* access modifiers changed from: protected */
    public abstract boolean onPerformActionForVirtualView$ar$ds(int i, int i2);

    /* access modifiers changed from: protected */
    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void onPopulateNodeForHost(C1991k kVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void onPopulateNodeForVirtualView(int i, C1991k kVar);

    /* access modifiers changed from: protected */
    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView$ar$ds(i, 8);
        return true;
    }

    public final void sendEventForVirtualView$ar$ds(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i != Integer.MIN_VALUE && this.mManager.isEnabled() && (parent = this.mHost.getParent()) != null) {
            if (i != -1) {
                accessibilityEvent = AccessibilityEvent.obtain(i2);
                C1991k obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
                accessibilityEvent.getText().add(obtainAccessibilityNodeInfo.mo5152a());
                accessibilityEvent.setContentDescription(obtainAccessibilityNodeInfo.f5921a.getContentDescription());
                accessibilityEvent.setScrollable(obtainAccessibilityNodeInfo.f5921a.isScrollable());
                accessibilityEvent.setPassword(obtainAccessibilityNodeInfo.f5921a.isPassword());
                accessibilityEvent.setEnabled(obtainAccessibilityNodeInfo.f5921a.isEnabled());
                accessibilityEvent.setChecked(obtainAccessibilityNodeInfo.f5921a.isChecked());
                onPopulateEventForVirtualView(i, accessibilityEvent);
                if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                    accessibilityEvent.setClassName(obtainAccessibilityNodeInfo.f5921a.getClassName());
                    C1997q.m5349a(accessibilityEvent, this.mHost, i);
                    accessibilityEvent.setPackageName(this.mHost.getContext().getPackageName());
                } else {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
            } else {
                accessibilityEvent = createEventForHost(i2);
            }
            parent.requestSendAccessibilityEvent(this.mHost, accessibilityEvent);
        }
    }

    public final void setBoundsInScreenFromBoundsInParent(C1991k kVar, Rect rect) {
        kVar.f5921a.setBoundsInParent(rect);
        Rect rect2 = new Rect();
        rect2.set(rect);
        if (kVar.f5922b != -1) {
            C1991k kVar2 = new C1991k(AccessibilityNodeInfo.obtain());
            Rect rect3 = new Rect();
            for (int i = kVar.f5922b; i != -1; i = kVar2.f5922b) {
                View view = this.mHost;
                kVar2.f5922b = -1;
                kVar2.f5921a.setParent(view, -1);
                kVar2.f5921a.setBoundsInParent(INVALID_BOUNDS);
                onPopulateNodeForVirtualView(0, kVar2);
                kVar2.f5921a.getBoundsInParent(rect3);
                rect2.offset(rect3.left, rect3.top);
            }
            kVar2.f5921a.recycle();
        }
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        rect2.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        kVar.f5921a.setBoundsInScreen(rect2);
    }
}
