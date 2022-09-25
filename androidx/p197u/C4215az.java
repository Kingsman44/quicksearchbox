package androidx.p197u;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.u.az */
/* compiled from: PG */
public class C4215az extends C4195af {

    /* renamed from: p */
    private static final String[] f13650p = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: o */
    public int f13651o = 3;

    /* renamed from: H */
    public static final void m12099H(C4206aq aqVar) {
        aqVar.f13625a.put("android:visibility:visibility", Integer.valueOf(aqVar.f13626b.getVisibility()));
        aqVar.f13625a.put("android:visibility:parent", aqVar.f13626b.getParent());
        int[] iArr = new int[2];
        aqVar.f13626b.getLocationOnScreen(iArr);
        aqVar.f13625a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r8 == 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r0.f13648e == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r0.f13646c == 0) goto L_0x0094;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.p197u.C4214ay m12100I(androidx.p197u.C4206aq r7, androidx.p197u.C4206aq r8) {
        /*
            androidx.u.ay r0 = new androidx.u.ay
            r0.<init>()
            r1 = 0
            r0.f13644a = r1
            r0.f13645b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L_0x0033
            java.util.Map r6 = r7.f13625a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map r6 = r7.f13625a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f13646c = r6
            java.util.Map r6 = r7.f13625a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f13648e = r6
            goto L_0x0037
        L_0x0033:
            r0.f13646c = r4
            r0.f13648e = r3
        L_0x0037:
            if (r8 == 0) goto L_0x005a
            java.util.Map r6 = r8.f13625a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map r3 = r8.f13625a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f13647d = r3
            java.util.Map r3 = r8.f13625a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f13649f = r2
            goto L_0x005e
        L_0x005a:
            r0.f13647d = r4
            r0.f13649f = r3
        L_0x005e:
            r2 = 1
            if (r7 == 0) goto L_0x0083
            if (r8 == 0) goto L_0x0083
            int r7 = r0.f13646c
            int r8 = r0.f13647d
            if (r7 != r8) goto L_0x0071
            android.view.ViewGroup r3 = r0.f13648e
            android.view.ViewGroup r4 = r0.f13649f
            if (r3 == r4) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            return r0
        L_0x0071:
            if (r7 == r8) goto L_0x0079
            if (r7 != 0) goto L_0x0076
            goto L_0x0094
        L_0x0076:
            if (r8 != 0) goto L_0x0097
            goto L_0x0089
        L_0x0079:
            android.view.ViewGroup r7 = r0.f13649f
            if (r7 != 0) goto L_0x007e
            goto L_0x0094
        L_0x007e:
            android.view.ViewGroup r7 = r0.f13648e
            if (r7 != 0) goto L_0x0097
            goto L_0x0089
        L_0x0083:
            if (r7 != 0) goto L_0x008e
            int r7 = r0.f13647d
            if (r7 != 0) goto L_0x008e
        L_0x0089:
            r0.f13645b = r2
        L_0x008b:
            r0.f13644a = r2
            goto L_0x0097
        L_0x008e:
            if (r8 != 0) goto L_0x0097
            int r7 = r0.f13646c
            if (r7 != 0) goto L_0x0097
        L_0x0094:
            r0.f13645b = r1
            goto L_0x008b
        L_0x0097:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p197u.C4215az.m12100I(androidx.u.aq, androidx.u.aq):androidx.u.ay");
    }

    /* JADX WARNING: type inference failed for: r16v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (m12100I(mo8882i(r4, false), mo8883j(r4, false)).f13644a == false) goto L_0x0041;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0191  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo8876a(android.view.ViewGroup r21, androidx.p197u.C4206aq r22, androidx.p197u.C4206aq r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            androidx.u.ay r4 = m12100I(r22, r23)
            boolean r5 = r4.f13644a
            r6 = 0
            if (r5 == 0) goto L_0x024f
            android.view.ViewGroup r5 = r4.f13648e
            if (r5 != 0) goto L_0x0019
            android.view.ViewGroup r5 = r4.f13649f
            if (r5 == 0) goto L_0x024f
        L_0x0019:
            boolean r5 = r4.f13645b
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0049
            int r4 = r0.f13651o
            r4 = r4 & r7
            if (r4 != r7) goto L_0x0048
            if (r3 != 0) goto L_0x0027
            goto L_0x0048
        L_0x0027:
            if (r2 != 0) goto L_0x0041
            android.view.View r4 = r3.f13626b
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            androidx.u.aq r5 = r0.mo8882i(r4, r8)
            androidx.u.aq r4 = r0.mo8883j(r4, r8)
            androidx.u.ay r4 = m12100I(r5, r4)
            boolean r4 = r4.f13644a
            if (r4 != 0) goto L_0x0048
        L_0x0041:
            android.view.View r3 = r3.f13626b
            android.animation.Animator r1 = r0.mo8922e(r1, r3, r2)
            return r1
        L_0x0048:
            return r6
        L_0x0049:
            int r4 = r4.f13647d
            int r5 = r0.f13651o
            r9 = 2
            r5 = r5 & r9
            if (r5 == r9) goto L_0x0054
        L_0x0051:
            r2 = r0
            goto L_0x024e
        L_0x0054:
            if (r2 != 0) goto L_0x0057
            goto L_0x0051
        L_0x0057:
            android.view.View r5 = r2.f13626b
            if (r3 == 0) goto L_0x005e
            android.view.View r3 = r3.f13626b
            goto L_0x005f
        L_0x005e:
            r3 = r6
        L_0x005f:
            r10 = 2131435452(0x7f0b1fbc, float:1.8492747E38)
            java.lang.Object r11 = r5.getTag(r10)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x006e
            r19 = r4
            goto L_0x01c7
        L_0x006e:
            if (r3 == 0) goto L_0x0080
            android.view.ViewParent r11 = r3.getParent()
            if (r11 != 0) goto L_0x0077
            goto L_0x0080
        L_0x0077:
            r11 = 4
            if (r4 != r11) goto L_0x007d
        L_0x007a:
            r11 = r3
            r3 = r6
            goto L_0x0083
        L_0x007d:
            if (r5 != r3) goto L_0x0085
            goto L_0x007a
        L_0x0080:
            if (r3 == 0) goto L_0x0085
            r11 = r6
        L_0x0083:
            r12 = 0
            goto L_0x0088
        L_0x0085:
            r3 = r6
            r11 = r3
            r12 = 1
        L_0x0088:
            if (r12 == 0) goto L_0x01bf
            android.view.ViewParent r12 = r5.getParent()
            if (r12 != 0) goto L_0x0097
            r19 = r4
            r6 = r11
            r7 = 0
            r11 = r5
            goto L_0x01c7
        L_0x0097:
            android.view.ViewParent r12 = r5.getParent()
            boolean r12 = r12 instanceof android.view.View
            if (r12 == 0) goto L_0x01bf
            android.view.ViewParent r12 = r5.getParent()
            android.view.View r12 = (android.view.View) r12
            androidx.u.aq r13 = r0.mo8883j(r12, r7)
            androidx.u.aq r14 = r0.mo8882i(r12, r7)
            androidx.u.ay r13 = m12100I(r13, r14)
            boolean r13 = r13.f13644a
            if (r13 != 0) goto L_0x01aa
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            int r13 = r12.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = r12.getScrollY()
            int r12 = -r12
            float r12 = (float) r12
            r3.setTranslate(r13, r12)
            int r12 = androidx.p197u.C4211av.f13633b
            r5.transformMatrixToGlobal(r3)
            r1.transformMatrixToLocal(r3)
            android.graphics.RectF r12 = new android.graphics.RectF
            int r13 = r5.getWidth()
            float r13 = (float) r13
            int r14 = r5.getHeight()
            float r14 = (float) r14
            r15 = 0
            r12.<init>(r15, r15, r13, r14)
            r3.mapRect(r12)
            float r13 = r12.left
            int r13 = java.lang.Math.round(r13)
            float r14 = r12.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r12.right
            int r15 = java.lang.Math.round(r15)
            float r6 = r12.bottom
            int r6 = java.lang.Math.round(r6)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r9 = r5.getContext()
            r10.<init>(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r9)
            boolean r9 = androidx.p197u.C4204ao.m12084a(r5)
            r9 = r9 ^ r7
            boolean r16 = androidx.p197u.C4204ao.m12084a(r21)
            if (r9 == 0) goto L_0x012f
            if (r16 != 0) goto L_0x011d
            r19 = r4
            r18 = r11
            r0 = 0
            goto L_0x018f
        L_0x011d:
            android.view.ViewParent r16 = r5.getParent()
            r7 = r16
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r16 = r7.indexOfChild(r5)
            androidx.p197u.C4203an.m12082a(r1, r5)
            r8 = r16
            goto L_0x0130
        L_0x012f:
            r7 = 0
        L_0x0130:
            float r17 = r12.width()
            r18 = r11
            int r11 = java.lang.Math.round(r17)
            float r17 = r12.height()
            r19 = r4
            int r4 = java.lang.Math.round(r17)
            if (r11 <= 0) goto L_0x0186
            if (r4 <= 0) goto L_0x0186
            int r0 = r11 * r4
            float r0 = (float) r0
            r17 = 1233125376(0x49800000, float:1048576.0)
            float r0 = r17 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r2 = (float) r11
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r11 = r12.left
            float r11 = -r11
            float r12 = r12.top
            float r12 = -r12
            r3.postTranslate(r11, r12)
            r3.postScale(r0, r0)
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r2, r4)
            r2.concat(r3)
            r5.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = androidx.p197u.C4205ap.m12085a(r0)
            goto L_0x0187
        L_0x0186:
            r0 = 0
        L_0x0187:
            if (r9 == 0) goto L_0x018f
            androidx.p197u.C4203an.m12083b(r1, r5)
            r7.addView(r5, r8)
        L_0x018f:
            if (r0 == 0) goto L_0x0194
            r10.setImageBitmap(r0)
        L_0x0194:
            int r0 = r15 - r13
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r6 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r0, r2)
            r10.layout(r13, r14, r15, r6)
            r11 = r10
            goto L_0x01c4
        L_0x01aa:
            r19 = r4
            r18 = r11
            int r0 = r12.getId()
            android.view.ViewParent r2 = r12.getParent()
            if (r2 != 0) goto L_0x01c3
            r2 = -1
            if (r0 == r2) goto L_0x01c3
            r1.findViewById(r0)
            goto L_0x01c3
        L_0x01bf:
            r19 = r4
            r18 = r11
        L_0x01c3:
            r11 = r3
        L_0x01c4:
            r6 = r18
            r7 = 0
        L_0x01c7:
            if (r11 == 0) goto L_0x0221
            r0 = r22
            if (r7 != 0) goto L_0x0200
            java.util.Map r2 = r0.f13625a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r8 = 2
            int[] r8 = new int[r8]
            r1.getLocationOnScreen(r8)
            r3 = r8[r3]
            int r4 = r4 - r3
            int r3 = r11.getLeft()
            int r4 = r4 - r3
            r11.offsetLeftAndRight(r4)
            r3 = r8[r6]
            int r2 = r2 - r3
            int r3 = r11.getTop()
            int r2 = r2 - r3
            r11.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.add(r11)
        L_0x0200:
            r2 = r20
            android.animation.Animator r6 = r2.mo8923f(r1, r11, r0)
            if (r7 != 0) goto L_0x024e
            if (r6 != 0) goto L_0x0212
            android.view.ViewGroupOverlay r0 = r21.getOverlay()
            r0.remove(r11)
            goto L_0x024e
        L_0x0212:
            r0 = 2131435452(0x7f0b1fbc, float:1.8492747E38)
            r5.setTag(r0, r11)
            androidx.u.aw r0 = new androidx.u.aw
            r0.<init>(r2, r1, r11, r5)
            r2.mo8900z(r0)
            goto L_0x024e
        L_0x0221:
            r2 = r20
            r0 = r22
            if (r6 == 0) goto L_0x024d
            int r3 = r6.getVisibility()
            int r4 = androidx.p197u.C4211av.f13633b
            r4 = 0
            r6.setTransitionVisibility(r4)
            android.animation.Animator r0 = r2.mo8923f(r1, r6, r0)
            if (r0 == 0) goto L_0x0248
            androidx.u.ax r1 = new androidx.u.ax
            r3 = r19
            r1.<init>(r6, r3)
            r0.addListener(r1)
            androidx.p197u.C4189a.m12004a(r0, r1)
            r2.mo8900z(r1)
            goto L_0x024b
        L_0x0248:
            r6.setTransitionVisibility(r3)
        L_0x024b:
            r6 = r0
            goto L_0x024e
        L_0x024d:
            r6 = 0
        L_0x024e:
            return r6
        L_0x024f:
            r2 = r0
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p197u.C4215az.mo8876a(android.view.ViewGroup, androidx.u.aq, androidx.u.aq):android.animation.Animator");
    }

    /* renamed from: b */
    public final void mo8877b(C4206aq aqVar) {
        m12099H(aqVar);
    }

    /* renamed from: c */
    public void mo8878c(C4206aq aqVar) {
        m12099H(aqVar);
    }

    /* renamed from: d */
    public final String[] mo8880d() {
        return f13650p;
    }

    /* renamed from: e */
    public Animator mo8922e(ViewGroup viewGroup, View view, C4206aq aqVar) {
        throw null;
    }

    /* renamed from: f */
    public Animator mo8923f(ViewGroup viewGroup, View view, C4206aq aqVar) {
        throw null;
    }

    /* renamed from: x */
    public final boolean mo8898x(C4206aq aqVar, C4206aq aqVar2) {
        if (aqVar == null && aqVar2 == null) {
            return false;
        }
        if (aqVar != null && aqVar2 != null && aqVar2.f13625a.containsKey("android:visibility:visibility") != aqVar.f13625a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C4214ay I = m12100I(aqVar, aqVar2);
        if (!I.f13644a) {
            return false;
        }
        if (I.f13646c == 0 || I.f13647d == 0) {
            return true;
        }
        return false;
    }
}
