package com.google.android.apps.gsa.searchplate;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchplate.af */
/* compiled from: PG */
public final class C88904af extends ValueAnimator {

    /* renamed from: a */
    public final boolean f240824a;

    /* renamed from: b */
    public View f240825b;

    /* renamed from: c */
    public int f240826c;

    /* renamed from: d */
    public float f240827d;

    /* renamed from: e */
    private final Map f240828e = new HashMap();

    public C88904af(boolean z) {
        this.f240824a = z;
        addListener(new C88902ad());
        addUpdateListener(new C88903ae());
        if (z) {
            setFloatValues(new float[]{0.0f, 1.0f});
        } else {
            setFloatValues(new float[]{1.0f, 0.0f});
        }
        super.setDuration(100);
    }

    /* renamed from: a */
    public final void mo82771a(View view, int i) {
        this.f240828e.put(view, Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r7 != 5) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTarget(java.lang.Object r7) {
        /*
            r6 = this;
            android.view.View r7 = (android.view.View) r7
            r6.f240825b = r7
            java.util.Map r0 = r6.f240828e
            boolean r7 = r0.containsKey(r7)
            r0 = 5
            r1 = 4
            r2 = 2
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L_0x0040
            java.util.Map r7 = r6.f240828e
            android.view.View r5 = r6.f240825b
            java.lang.Object r7 = r7.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.f240826c = r7
            if (r7 == r2) goto L_0x0035
            r5 = 3
            if (r7 == r5) goto L_0x002b
            if (r7 == r1) goto L_0x0035
            if (r7 == r0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            android.view.View r7 = r6.f240825b
            int r7 = r7.getMeasuredWidth()
            float r7 = (float) r7
            r6.f240827d = r7
            goto L_0x0045
        L_0x0035:
            android.view.View r7 = r6.f240825b
            int r7 = r7.getMeasuredWidth()
            int r7 = -r7
            float r7 = (float) r7
            r6.f240827d = r7
            goto L_0x0045
        L_0x0040:
            r6.f240826c = r3
        L_0x0042:
            r6.f240827d = r4
            r7 = 0
        L_0x0045:
            int r5 = r6.f240826c
            if (r5 == r1) goto L_0x004b
            if (r5 != r0) goto L_0x005c
        L_0x004b:
            android.view.View r0 = r6.f240825b
            boolean r0 = com.google.android.apps.gsa.searchplate.p6966d.C88939k.m144555k(r0)
            if (r3 == r0) goto L_0x0056
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0058
        L_0x0056:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0058:
            float r7 = r7 * r0
            r6.f240827d = r7
        L_0x005c:
            int r7 = r6.f240826c
            r0 = 6
            if (r7 != r0) goto L_0x006c
            android.view.View r7 = r6.f240825b
            r7.setScaleX(r4)
            android.view.View r7 = r6.f240825b
            r7.setScaleY(r4)
            return
        L_0x006c:
            r0 = 7
            if (r7 != r0) goto L_0x007f
            android.view.View r7 = r6.f240825b
            r7.setScaleX(r4)
            android.view.View r7 = r6.f240825b
            r7.setScaleY(r4)
            android.view.View r7 = r6.f240825b
            r7.setAlpha(r4)
            return
        L_0x007f:
            if (r7 == 0) goto L_0x0090
            boolean r7 = r6.f240824a
            if (r7 == 0) goto L_0x008a
            android.view.View r7 = r6.f240825b
            r7.setAlpha(r4)
        L_0x008a:
            android.view.View r7 = r6.f240825b
            r0 = 0
            r7.setLayerType(r2, r0)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchplate.C88904af.setTarget(java.lang.Object):void");
    }
}
