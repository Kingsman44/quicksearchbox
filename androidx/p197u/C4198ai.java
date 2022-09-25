package androidx.p197u;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* renamed from: androidx.u.ai */
/* compiled from: PG */
final class C4198ai implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    final C4195af f13613a;

    /* renamed from: b */
    final ViewGroup f13614b;

    public C4198ai(C4195af afVar, ViewGroup viewGroup) {
        this.f13613a = afVar;
        this.f13614b = viewGroup;
    }

    /* renamed from: a */
    private final void m12052a() {
        this.f13614b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f13614b.removeOnAttachStateChangeListener(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: androidx.u.aq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01d6 A[EDGE_INSN: B:128:0x01d6->B:85:0x01d6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0281 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r19 = this;
            r0 = r19
            r19.m12052a()
            java.util.ArrayList r1 = androidx.p197u.C4199aj.f13615a
            android.view.ViewGroup r2 = r0.f13614b
            boolean r1 = r1.remove(r2)
            r2 = 1
            if (r1 != 0) goto L_0x0011
            return r2
        L_0x0011:
            androidx.c.g r1 = androidx.p197u.C4199aj.m12053a()
            android.view.ViewGroup r3 = r0.f13614b
            java.lang.Object r3 = r1.get(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto L_0x002b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.view.ViewGroup r5 = r0.f13614b
            r1.put(r5, r3)
        L_0x0029:
            r5 = 0
            goto L_0x0036
        L_0x002b:
            int r5 = r3.size()
            if (r5 <= 0) goto L_0x0029
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
        L_0x0036:
            androidx.u.af r6 = r0.f13613a
            r3.add(r6)
            androidx.u.af r3 = r0.f13613a
            androidx.u.ah r6 = new androidx.u.ah
            r6.<init>(r0, r1)
            r3.mo8900z(r6)
            androidx.u.af r1 = r0.f13613a
            android.view.ViewGroup r3 = r0.f13614b
            r6 = 0
            r1.mo8887n(r3, r6)
            if (r5 == 0) goto L_0x0064
            int r1 = r5.size()
            r3 = 0
        L_0x0054:
            if (r3 >= r1) goto L_0x0064
            java.lang.Object r7 = r5.get(r3)
            androidx.u.af r7 = (androidx.p197u.C4195af) r7
            android.view.ViewGroup r8 = r0.f13614b
            r7.mo8892s(r8)
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0064:
            androidx.u.af r1 = r0.f13613a
            android.view.ViewGroup r8 = r0.f13614b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f13600j = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f13601k = r3
            androidx.u.ar r3 = r1.f13596f
            androidx.u.ar r5 = r1.f13597g
            androidx.c.g r7 = new androidx.c.g
            androidx.c.g r9 = r3.f13628a
            r7.<init>((androidx.p060c.C0984n) r9)
            androidx.c.g r9 = new androidx.c.g
            androidx.c.g r10 = r5.f13628a
            r9.<init>((androidx.p060c.C0984n) r10)
            r10 = 0
        L_0x0089:
            int[] r11 = r1.f13599i
            r12 = 4
            if (r10 >= r12) goto L_0x01d6
            r11 = r11[r10]
            if (r11 == r2) goto L_0x0197
            r13 = 2
            if (r11 == r13) goto L_0x014a
            r13 = 3
            if (r11 == r13) goto L_0x00f6
            if (r11 == r12) goto L_0x009d
        L_0x009a:
            r4 = r5
            goto L_0x01cd
        L_0x009d:
            androidx.c.k r11 = r3.f13630c
            androidx.c.k r12 = r5.f13630c
            int r13 = r11.mo3675c()
            r14 = 0
        L_0x00a6:
            if (r14 >= r13) goto L_0x009a
            java.lang.Object r15 = r11.mo3680g(r14)
            android.view.View r15 = (android.view.View) r15
            if (r15 == 0) goto L_0x00ed
            boolean r16 = r1.mo8899y(r15)
            if (r16 == 0) goto L_0x00ed
            r17 = r5
            long r4 = r11.mo3677d(r14)
            java.lang.Object r4 = r12.mo3678e(r4)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x00ef
            boolean r5 = r1.mo8899y(r4)
            if (r5 == 0) goto L_0x00ef
            java.lang.Object r5 = r7.get(r15)
            androidx.u.aq r5 = (androidx.p197u.C4206aq) r5
            java.lang.Object r18 = r9.get(r4)
            r6 = r18
            androidx.u.aq r6 = (androidx.p197u.C4206aq) r6
            if (r5 == 0) goto L_0x00ef
            if (r6 == 0) goto L_0x00ef
            java.util.ArrayList r2 = r1.f13600j
            r2.add(r5)
            java.util.ArrayList r2 = r1.f13601k
            r2.add(r6)
            r7.remove(r15)
            r9.remove(r4)
            goto L_0x00ef
        L_0x00ed:
            r17 = r5
        L_0x00ef:
            int r14 = r14 + 1
            r5 = r17
            r2 = 1
            r6 = 0
            goto L_0x00a6
        L_0x00f6:
            r17 = r5
            android.util.SparseArray r2 = r3.f13629b
            r4 = r17
            android.util.SparseArray r5 = r4.f13629b
            int r6 = r2.size()
            r11 = 0
        L_0x0103:
            if (r11 >= r6) goto L_0x01cd
            java.lang.Object r12 = r2.valueAt(r11)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x0145
            boolean r13 = r1.mo8899y(r12)
            if (r13 == 0) goto L_0x0145
            int r13 = r2.keyAt(r11)
            java.lang.Object r13 = r5.get(r13)
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto L_0x0145
            boolean r14 = r1.mo8899y(r13)
            if (r14 == 0) goto L_0x0145
            java.lang.Object r14 = r7.get(r12)
            androidx.u.aq r14 = (androidx.p197u.C4206aq) r14
            java.lang.Object r15 = r9.get(r13)
            androidx.u.aq r15 = (androidx.p197u.C4206aq) r15
            if (r14 == 0) goto L_0x0145
            if (r15 == 0) goto L_0x0145
            java.util.ArrayList r0 = r1.f13600j
            r0.add(r14)
            java.util.ArrayList r0 = r1.f13601k
            r0.add(r15)
            r7.remove(r12)
            r9.remove(r13)
        L_0x0145:
            int r11 = r11 + 1
            r0 = r19
            goto L_0x0103
        L_0x014a:
            r4 = r5
            androidx.c.g r0 = r3.f13631d
            androidx.c.g r2 = r4.f13631d
            int r5 = r0.f3122d
            r6 = 0
        L_0x0152:
            if (r6 >= r5) goto L_0x01cd
            java.lang.Object r11 = r0.mo3708h(r6)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x0194
            boolean r12 = r1.mo8899y(r11)
            if (r12 == 0) goto L_0x0194
            java.lang.Object r12 = r0.mo3702e(r6)
            java.lang.Object r12 = r2.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x0194
            boolean r13 = r1.mo8899y(r12)
            if (r13 == 0) goto L_0x0194
            java.lang.Object r13 = r7.get(r11)
            androidx.u.aq r13 = (androidx.p197u.C4206aq) r13
            java.lang.Object r14 = r9.get(r12)
            androidx.u.aq r14 = (androidx.p197u.C4206aq) r14
            if (r13 == 0) goto L_0x0194
            if (r14 == 0) goto L_0x0194
            java.util.ArrayList r15 = r1.f13600j
            r15.add(r13)
            java.util.ArrayList r13 = r1.f13601k
            r13.add(r14)
            r7.remove(r11)
            r9.remove(r12)
        L_0x0194:
            int r6 = r6 + 1
            goto L_0x0152
        L_0x0197:
            r4 = r5
            int r0 = r7.f3122d
        L_0x019a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x01cd
            java.lang.Object r2 = r7.mo3702e(r0)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x01cc
            boolean r5 = r1.mo8899y(r2)
            if (r5 == 0) goto L_0x01cc
            java.lang.Object r2 = r9.remove(r2)
            androidx.u.aq r2 = (androidx.p197u.C4206aq) r2
            if (r2 == 0) goto L_0x01cc
            android.view.View r5 = r2.f13626b
            boolean r5 = r1.mo8899y(r5)
            if (r5 == 0) goto L_0x01cc
            java.lang.Object r5 = r7.mo3704f(r0)
            androidx.u.aq r5 = (androidx.p197u.C4206aq) r5
            java.util.ArrayList r6 = r1.f13600j
            r6.add(r5)
            java.util.ArrayList r5 = r1.f13601k
            r5.add(r2)
        L_0x01cc:
            goto L_0x019a
        L_0x01cd:
            int r10 = r10 + 1
            r0 = r19
            r5 = r4
            r2 = 1
            r6 = 0
            goto L_0x0089
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            int r2 = r7.f3122d
            if (r0 >= r2) goto L_0x01f7
            java.lang.Object r2 = r7.mo3708h(r0)
            androidx.u.aq r2 = (androidx.p197u.C4206aq) r2
            android.view.View r3 = r2.f13626b
            boolean r3 = r1.mo8899y(r3)
            if (r3 == 0) goto L_0x01f4
            java.util.ArrayList r3 = r1.f13600j
            r3.add(r2)
            java.util.ArrayList r2 = r1.f13601k
            r3 = 0
            r2.add(r3)
        L_0x01f4:
            int r0 = r0 + 1
            goto L_0x01d7
        L_0x01f7:
            r6 = 0
        L_0x01f8:
            int r0 = r9.f3122d
            if (r6 >= r0) goto L_0x021a
            java.lang.Object r0 = r9.mo3708h(r6)
            androidx.u.aq r0 = (androidx.p197u.C4206aq) r0
            android.view.View r2 = r0.f13626b
            boolean r2 = r1.mo8899y(r2)
            if (r2 == 0) goto L_0x0216
            java.util.ArrayList r2 = r1.f13601k
            r2.add(r0)
            java.util.ArrayList r0 = r1.f13600j
            r2 = 0
            r0.add(r2)
            goto L_0x0217
        L_0x0216:
            r2 = 0
        L_0x0217:
            int r6 = r6 + 1
            goto L_0x01f8
        L_0x021a:
            androidx.c.g r0 = androidx.p197u.C4195af.m12015g()
            int r2 = r0.f3122d
            androidx.u.ba r3 = androidx.p197u.C4211av.m12088a(r8)
        L_0x0224:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0281
            java.lang.Object r4 = r0.mo3702e(r2)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x0280
            java.lang.Object r5 = r0.get(r4)
            androidx.u.ac r5 = (androidx.p197u.C4192ac) r5
            if (r5 == 0) goto L_0x0280
            android.view.View r6 = r5.f13583a
            if (r6 == 0) goto L_0x0280
            androidx.u.ba r6 = r5.f13587e
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0280
            androidx.u.aq r6 = r5.f13585c
            android.view.View r7 = r5.f13583a
            r9 = 1
            androidx.u.aq r10 = r1.mo8883j(r7, r9)
            androidx.u.aq r11 = r1.mo8882i(r7, r9)
            if (r10 != 0) goto L_0x0260
            if (r11 != 0) goto L_0x0260
            androidx.u.ar r9 = r1.f13597g
            androidx.c.g r9 = r9.f13628a
            java.lang.Object r7 = r9.get(r7)
            r11 = r7
            androidx.u.aq r11 = (androidx.p197u.C4206aq) r11
        L_0x0260:
            if (r10 != 0) goto L_0x0264
            if (r11 == 0) goto L_0x0280
        L_0x0264:
            androidx.u.af r5 = r5.f13586d
            boolean r5 = r5.mo8898x(r6, r11)
            if (r5 == 0) goto L_0x0280
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x027d
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0279
            goto L_0x027d
        L_0x0279:
            r0.remove(r4)
            goto L_0x0280
        L_0x027d:
            r4.cancel()
        L_0x0280:
            goto L_0x0224
        L_0x0281:
            androidx.u.ar r9 = r1.f13596f
            androidx.u.ar r10 = r1.f13597g
            java.util.ArrayList r11 = r1.f13600j
            java.util.ArrayList r12 = r1.f13601k
            r7 = r1
            r7.mo8889p(r8, r9, r10, r11, r12)
            r1.mo8893t()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p197u.C4198ai.onPreDraw():boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        m12052a();
        C4199aj.f13615a.remove(this.f13614b);
        ArrayList arrayList = (ArrayList) C4199aj.m12053a().get(this.f13614b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4195af) arrayList.get(i)).mo8892s(this.f13614b);
            }
        }
        this.f13613a.mo8888o(true);
    }
}
