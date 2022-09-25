package android.support.p031v4.app;

import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: android.support.v4.app.ap */
/* compiled from: PG */
final class C0170ap {
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d6 A[SYNTHETIC, Splitter:B:65:0x00d6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.support.p031v4.app.C0168an m370a(android.content.Context r5, android.support.p031v4.app.Fragment r6, boolean r7, boolean r8) {
        /*
            int r0 = r6.getNextTransition()
            if (r8 == 0) goto L_0x0012
            if (r7 == 0) goto L_0x000d
            int r8 = r6.getPopEnterAnim()
            goto L_0x001d
        L_0x000d:
            int r8 = r6.getPopExitAnim()
            goto L_0x001d
        L_0x0012:
            if (r7 == 0) goto L_0x0019
            int r8 = r6.getEnterAnim()
            goto L_0x001d
        L_0x0019:
            int r8 = r6.getExitAnim()
        L_0x001d:
            r1 = 0
            r6.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r2 = r6.mContainer
            r3 = 0
            if (r2 == 0) goto L_0x0034
            r4 = 2131436945(0x7f0b2591, float:1.8495775E38)
            java.lang.Object r2 = r2.getTag(r4)
            if (r2 == 0) goto L_0x0034
            android.view.ViewGroup r2 = r6.mContainer
            r2.setTag(r4, r3)
        L_0x0034:
            android.view.ViewGroup r2 = r6.mContainer
            if (r2 == 0) goto L_0x0040
            android.animation.LayoutTransition r2 = r2.getLayoutTransition()
            if (r2 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            return r3
        L_0x0040:
            android.view.animation.Animation r2 = r6.onCreateAnimation(r0, r7, r8)
            if (r2 == 0) goto L_0x004c
            android.support.v4.app.an r5 = new android.support.v4.app.an
            r5.<init>((android.view.animation.Animation) r2)
            return r5
        L_0x004c:
            android.animation.Animator r6 = r6.onCreateAnimator(r0, r7, r8)
            if (r6 == 0) goto L_0x0058
            android.support.v4.app.an r5 = new android.support.v4.app.an
            r5.<init>((android.animation.Animator) r6)
            return r5
        L_0x0058:
            if (r8 != 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00b5
            r6 = 4097(0x1001, float:5.741E-42)
            r8 = 1
            if (r0 == r6) goto L_0x00ab
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r0 == r6) goto L_0x00a1
            r6 = 8197(0x2005, float:1.1486E-41)
            if (r0 == r6) goto L_0x008f
            r6 = 4099(0x1003, float:5.744E-42)
            if (r0 == r6) goto L_0x0085
            r6 = 4100(0x1004, float:5.745E-42)
            if (r0 == r6) goto L_0x0073
            r8 = -1
            goto L_0x00b6
        L_0x0073:
            if (r7 == 0) goto L_0x007d
            r6 = 16842936(0x10100b8, float:2.3694074E-38)
            int r8 = m371b(r5, r6)
            goto L_0x00b6
        L_0x007d:
            r6 = 16842937(0x10100b9, float:2.3694076E-38)
            int r8 = m371b(r5, r6)
            goto L_0x00b6
        L_0x0085:
            if (r8 == r7) goto L_0x008b
            r8 = 2130837514(0x7f02000a, float:1.7279984E38)
            goto L_0x00b6
        L_0x008b:
            r8 = 2130837513(0x7f020009, float:1.7279982E38)
            goto L_0x00b6
        L_0x008f:
            if (r7 == 0) goto L_0x0099
            r6 = 16842938(0x10100ba, float:2.369408E-38)
            int r8 = m371b(r5, r6)
            goto L_0x00b6
        L_0x0099:
            r6 = 16842939(0x10100bb, float:2.3694082E-38)
            int r8 = m371b(r5, r6)
            goto L_0x00b6
        L_0x00a1:
            if (r8 == r7) goto L_0x00a7
            r8 = 2130837512(0x7f020008, float:1.727998E38)
            goto L_0x00b6
        L_0x00a7:
            r8 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x00b6
        L_0x00ab:
            if (r8 == r7) goto L_0x00b1
            r8 = 2130837516(0x7f02000c, float:1.7279988E38)
            goto L_0x00b6
        L_0x00b1:
            r8 = 2130837515(0x7f02000b, float:1.7279986E38)
            goto L_0x00b6
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            if (r8 == 0) goto L_0x00f2
            android.content.res.Resources r6 = r5.getResources()
            java.lang.String r6 = r6.getResourceTypeName(r8)
            java.lang.String r7 = "anim"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00d6
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)     // Catch:{ NotFoundException -> 0x00d4, RuntimeException -> 0x00d6 }
            if (r7 == 0) goto L_0x00f2
            android.support.v4.app.an r0 = new android.support.v4.app.an     // Catch:{ NotFoundException -> 0x00d4, RuntimeException -> 0x00d6 }
            r0.<init>((android.view.animation.Animation) r7)     // Catch:{ NotFoundException -> 0x00d4, RuntimeException -> 0x00d6 }
            return r0
        L_0x00d4:
            r5 = move-exception
            throw r5
        L_0x00d6:
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r5, r8)     // Catch:{ RuntimeException -> 0x00e2 }
            if (r7 == 0) goto L_0x00f2
            android.support.v4.app.an r0 = new android.support.v4.app.an     // Catch:{ RuntimeException -> 0x00e2 }
            r0.<init>((android.animation.Animator) r7)     // Catch:{ RuntimeException -> 0x00e2 }
            return r0
        L_0x00e2:
            r7 = move-exception
            if (r6 != 0) goto L_0x00f1
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)
            if (r5 == 0) goto L_0x00f2
            android.support.v4.app.an r6 = new android.support.v4.app.an
            r6.<init>((android.view.animation.Animation) r5)
            return r6
        L_0x00f1:
            throw r7
        L_0x00f2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.C0170ap.m370a(android.content.Context, android.support.v4.app.Fragment, boolean, boolean):android.support.v4.app.an");
    }

    /* renamed from: b */
    private static int m371b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
