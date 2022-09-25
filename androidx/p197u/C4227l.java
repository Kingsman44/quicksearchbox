package androidx.p197u;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: androidx.u.l */
/* compiled from: PG */
public final class C4227l extends C4195af {

    /* renamed from: o */
    private static final String[] f13664o = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: p */
    private static final Property f13665p = new C4219d(PointF.class);

    /* renamed from: q */
    private static final Property f13666q = new C4220e(PointF.class);

    /* renamed from: r */
    private static final Property f13667r = new C4221f(PointF.class);

    /* renamed from: s */
    private static final Property f13668s = new C4222g(PointF.class);

    /* renamed from: t */
    private static final Property f13669t = new C4223h(PointF.class);

    static {
        new C4218c(PointF.class);
    }

    /* renamed from: e */
    private static final void m12113e(C4206aq aqVar) {
        View view = aqVar.f13626b;
        if (C2043bi.m5570ax(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            aqVar.f13625a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            aqVar.f13625a.put("android:changeBounds:parent", aqVar.f13626b.getParent());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0134 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo8876a(android.view.ViewGroup r20, androidx.p197u.C4206aq r21, androidx.p197u.C4206aq r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            if (r1 == 0) goto L_0x0138
            if (r2 != 0) goto L_0x000c
            goto L_0x0138
        L_0x000c:
            java.util.Map r4 = r1.f13625a
            java.util.Map r5 = r2.f13625a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x0136
            if (r5 != 0) goto L_0x0024
            goto L_0x0136
        L_0x0024:
            android.view.View r4 = r2.f13626b
            java.util.Map r5 = r1.f13625a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map r7 = r2.f13625a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r16 = r6 - r10
            java.util.Map r1 = r1.f13625a
            java.lang.String r3 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r3)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map r2 = r2.f13625a
            java.lang.Object r2 = r2.get(r3)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            r17 = 0
            if (r13 == 0) goto L_0x0069
            if (r14 != 0) goto L_0x006f
            r14 = 0
        L_0x0069:
            if (r15 == 0) goto L_0x0082
            if (r16 != 0) goto L_0x006f
            r3 = 0
            goto L_0x0084
        L_0x006f:
            if (r7 != r8) goto L_0x0077
            if (r9 == r10) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            r18 = 0
            goto L_0x0079
        L_0x0077:
            r18 = 1
        L_0x0079:
            if (r11 != r12) goto L_0x007d
            if (r5 == r6) goto L_0x007f
        L_0x007d:
            int r18 = r18 + 1
        L_0x007f:
            r3 = r16
            goto L_0x0086
        L_0x0082:
            r3 = r16
        L_0x0084:
            r18 = 0
        L_0x0086:
            if (r1 == 0) goto L_0x008e
            boolean r16 = r1.equals(r2)
            if (r16 == 0) goto L_0x0092
        L_0x008e:
            if (r1 != 0) goto L_0x0094
            if (r2 == 0) goto L_0x0094
        L_0x0092:
            int r18 = r18 + 1
        L_0x0094:
            r1 = r18
            if (r1 <= 0) goto L_0x0134
            int r2 = androidx.p197u.C4211av.f13633b
            r4.setLeftTopRightBottom(r7, r9, r11, r5)
            r2 = 2
            if (r1 != r2) goto L_0x00f3
            if (r13 != r15) goto L_0x00b5
            if (r14 != r3) goto L_0x00b5
            androidx.u.x r1 = r0.f13604n
            float r2 = (float) r7
            float r3 = (float) r9
            float r5 = (float) r8
            float r6 = (float) r10
            android.graphics.Path r1 = r1.mo8942a(r2, r3, r5, r6)
            android.util.Property r2 = f13669t
            android.animation.ObjectAnimator r1 = androidx.p197u.C4238w.m12154a(r4, r2, r1)
            goto L_0x0119
        L_0x00b5:
            androidx.u.k r1 = new androidx.u.k
            r1.<init>(r4)
            androidx.u.x r3 = r0.f13604n
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r3 = r3.mo8942a(r7, r9, r8, r10)
            android.util.Property r7 = f13665p
            android.animation.ObjectAnimator r3 = androidx.p197u.C4238w.m12154a(r1, r7, r3)
            androidx.u.x r7 = r0.f13604n
            float r8 = (float) r11
            float r5 = (float) r5
            float r9 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r7.mo8942a(r8, r5, r9, r6)
            android.util.Property r6 = f13666q
            android.animation.ObjectAnimator r5 = androidx.p197u.C4238w.m12154a(r1, r6, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r2[r17] = r3
            r3 = 1
            r2[r3] = r5
            r6.playTogether(r2)
            androidx.u.i r2 = new androidx.u.i
            r2.<init>(r1)
            r6.addListener(r2)
            r1 = r6
            goto L_0x0119
        L_0x00f3:
            if (r7 != r8) goto L_0x0109
            if (r9 == r10) goto L_0x00f8
            goto L_0x0109
        L_0x00f8:
            androidx.u.x r1 = r0.f13604n
            float r2 = (float) r11
            float r3 = (float) r5
            float r5 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.mo8942a(r2, r3, r5, r6)
            android.util.Property r2 = f13667r
            android.animation.ObjectAnimator r1 = androidx.p197u.C4238w.m12154a(r4, r2, r1)
            goto L_0x0119
        L_0x0109:
            androidx.u.x r1 = r0.f13604n
            float r2 = (float) r7
            float r3 = (float) r9
            float r5 = (float) r8
            float r6 = (float) r10
            android.graphics.Path r1 = r1.mo8942a(r2, r3, r5, r6)
            android.util.Property r2 = f13668s
            android.animation.ObjectAnimator r1 = androidx.p197u.C4238w.m12154a(r4, r2, r1)
        L_0x0119:
            android.view.ViewParent r2 = r4.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0133
            android.view.ViewParent r2 = r4.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 1
            androidx.p197u.C4208as.m12087b(r2, r3)
            androidx.u.j r3 = new androidx.u.j
            r3.<init>(r2)
            r0.mo8900z(r3)
        L_0x0133:
            return r1
        L_0x0134:
            r1 = 0
            return r1
        L_0x0136:
            r1 = 0
            return r1
        L_0x0138:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p197u.C4227l.mo8876a(android.view.ViewGroup, androidx.u.aq, androidx.u.aq):android.animation.Animator");
    }

    /* renamed from: b */
    public final void mo8877b(C4206aq aqVar) {
        m12113e(aqVar);
    }

    /* renamed from: c */
    public final void mo8878c(C4206aq aqVar) {
        m12113e(aqVar);
    }

    /* renamed from: d */
    public final String[] mo8880d() {
        return f13664o;
    }
}
