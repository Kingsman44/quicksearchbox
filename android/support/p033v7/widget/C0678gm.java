package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import androidx.p060c.C0981k;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.gm */
/* compiled from: PG */
public final class C0678gm {

    /* renamed from: a */
    private static final PorterDuff.Mode f2484a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0678gm f2485b;

    /* renamed from: c */
    private static final C0676gk f2486c = new C0676gk();

    /* renamed from: d */
    private WeakHashMap f2487d;

    /* renamed from: e */
    private final WeakHashMap f2488e = new WeakHashMap(0);

    /* renamed from: f */
    private TypedValue f2489f;

    /* renamed from: g */
    private boolean f2490g;

    /* renamed from: h */
    private C0677gl f2491h;

    /* renamed from: b */
    public static synchronized PorterDuffColorFilter m2374b(int i, PorterDuff.Mode mode) {
        synchronized (C0678gm.class) {
            C0676gk gkVar = f2486c;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) gkVar.mo3690d(Integer.valueOf(C0676gk.m2373a(i, mode)));
            if (porterDuffColorFilter != null) {
                return porterDuffColorFilter;
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
            PorterDuffColorFilter porterDuffColorFilter3 = (PorterDuffColorFilter) gkVar.mo3691e(Integer.valueOf(C0676gk.m2373a(i, mode)), porterDuffColorFilter2);
            return porterDuffColorFilter2;
        }
    }

    /* renamed from: e */
    public static synchronized C0678gm m2375e() {
        C0678gm gmVar;
        synchronized (C0678gm.class) {
            if (f2485b == null) {
                f2485b = new C0678gm();
            }
            gmVar = f2485b;
        }
        return gmVar;
    }

    /* renamed from: h */
    static void m2376h(Drawable drawable, C0733in inVar, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        Rect rect = C0571cn.f2215a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (inVar.f2594d) {
                colorStateList = inVar.f2591a;
            } else if (inVar.f2593c) {
                colorStateList = null;
            } else {
                drawable.clearColorFilter();
                return;
            }
            if (inVar.f2593c) {
                mode = inVar.f2592b;
            } else {
                mode = f2484a;
            }
            if (!(colorStateList == null || mode == null)) {
                porterDuffColorFilter = m2374b(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized android.graphics.drawable.Drawable m2377i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f2488e     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            androidx.c.k r0 = (androidx.p060c.C0981k) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo3678e(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo3683j(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0678gm.m2377i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: j */
    private final synchronized void m2378j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0981k kVar = (C0981k) this.f2488e.get(context);
            if (kVar == null) {
                kVar = new C0981k(10);
                this.f2488e.put(context, kVar);
            }
            kVar.mo3682i(j, new WeakReference(constantState));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = (androidx.p060c.C0985o) r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018d, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList mo3099a(android.content.Context r10, int r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.WeakHashMap r0 = r9.f2487d     // Catch:{ all -> 0x018e }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x018e }
            androidx.c.o r0 = (androidx.p060c.C0985o) r0     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.mo3726e(r11)     // Catch:{ all -> 0x018e }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x018e }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x018c
            android.support.v7.widget.gl r0 = r9.f2491h     // Catch:{ all -> 0x018e }
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0020
            goto L_0x0121
        L_0x0020:
            r4 = 2131231194(0x7f0801da, float:1.8078462E38)
            if (r11 != r4) goto L_0x002e
            r0 = 2131099705(0x7f060039, float:1.781177E38)
            android.content.res.ColorStateList r1 = androidx.core.content.C1882h.m5138d(r10, r0)     // Catch:{ all -> 0x018e }
            goto L_0x0121
        L_0x002e:
            r4 = 2131231247(0x7f08020f, float:1.807857E38)
            if (r11 != r4) goto L_0x003c
            r0 = 2131099708(0x7f06003c, float:1.7811777E38)
            android.content.res.ColorStateList r1 = androidx.core.content.C1882h.m5138d(r10, r0)     // Catch:{ all -> 0x018e }
            goto L_0x0121
        L_0x003c:
            r4 = 2131231246(0x7f08020e, float:1.8078568E38)
            if (r11 != r4) goto L_0x009e
            r0 = 3
            int[][] r1 = new int[r0][]     // Catch:{ all -> 0x018e }
            int[] r0 = new int[r0]     // Catch:{ all -> 0x018e }
            r4 = 2130969176(0x7f040258, float:1.7547026E38)
            android.content.res.ColorStateList r5 = android.support.p033v7.widget.C0730ik.m2466c(r10, r4)     // Catch:{ all -> 0x018e }
            r6 = 2130969073(0x7f0401f1, float:1.7546818E38)
            r7 = 2
            if (r5 == 0) goto L_0x0078
            boolean r8 = r5.isStateful()     // Catch:{ all -> 0x018e }
            if (r8 == 0) goto L_0x0078
            int[] r4 = android.support.p033v7.widget.C0730ik.f2584a     // Catch:{ all -> 0x018e }
            r1[r3] = r4     // Catch:{ all -> 0x018e }
            int r4 = r5.getColorForState(r4, r3)     // Catch:{ all -> 0x018e }
            r0[r3] = r4     // Catch:{ all -> 0x018e }
            int[] r4 = android.support.p033v7.widget.C0730ik.f2587d     // Catch:{ all -> 0x018e }
            r1[r2] = r4     // Catch:{ all -> 0x018e }
            int r4 = android.support.p033v7.widget.C0730ik.m2465b(r10, r6)     // Catch:{ all -> 0x018e }
            r0[r2] = r4     // Catch:{ all -> 0x018e }
            int[] r4 = android.support.p033v7.widget.C0730ik.f2588e     // Catch:{ all -> 0x018e }
            r1[r7] = r4     // Catch:{ all -> 0x018e }
            int r4 = r5.getDefaultColor()     // Catch:{ all -> 0x018e }
            r0[r7] = r4     // Catch:{ all -> 0x018e }
            goto L_0x0096
        L_0x0078:
            int[] r5 = android.support.p033v7.widget.C0730ik.f2584a     // Catch:{ all -> 0x018e }
            r1[r3] = r5     // Catch:{ all -> 0x018e }
            int r5 = android.support.p033v7.widget.C0730ik.m2464a(r10, r4)     // Catch:{ all -> 0x018e }
            r0[r3] = r5     // Catch:{ all -> 0x018e }
            int[] r5 = android.support.p033v7.widget.C0730ik.f2587d     // Catch:{ all -> 0x018e }
            r1[r2] = r5     // Catch:{ all -> 0x018e }
            int r5 = android.support.p033v7.widget.C0730ik.m2465b(r10, r6)     // Catch:{ all -> 0x018e }
            r0[r2] = r5     // Catch:{ all -> 0x018e }
            int[] r5 = android.support.p033v7.widget.C0730ik.f2588e     // Catch:{ all -> 0x018e }
            r1[r7] = r5     // Catch:{ all -> 0x018e }
            int r4 = android.support.p033v7.widget.C0730ik.m2465b(r10, r4)     // Catch:{ all -> 0x018e }
            r0[r7] = r4     // Catch:{ all -> 0x018e }
        L_0x0096:
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList     // Catch:{ all -> 0x018e }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x018e }
            r1 = r4
            goto L_0x0121
        L_0x009e:
            r4 = 2131231182(0x7f0801ce, float:1.8078438E38)
            if (r11 != r4) goto L_0x00b0
            r0 = 2130969069(0x7f0401ed, float:1.754681E38)
            int r0 = android.support.p033v7.widget.C0730ik.m2465b(r10, r0)     // Catch:{ all -> 0x018e }
        L_0x00aa:
            android.content.res.ColorStateList r1 = android.support.p033v7.widget.C0505ac.m1891b(r10, r0)     // Catch:{ all -> 0x018e }
            goto L_0x0121
        L_0x00b0:
            r4 = 2131231176(0x7f0801c8, float:1.8078426E38)
            if (r11 != r4) goto L_0x00ba
            android.content.res.ColorStateList r1 = android.support.p033v7.widget.C0505ac.m1891b(r10, r3)     // Catch:{ all -> 0x018e }
            goto L_0x0121
        L_0x00ba:
            r4 = 2131231181(0x7f0801cd, float:1.8078436E38)
            if (r11 != r4) goto L_0x00c7
            r0 = 2130969066(0x7f0401ea, float:1.7546803E38)
            int r0 = android.support.p033v7.widget.C0730ik.m2465b(r10, r0)     // Catch:{ all -> 0x018e }
            goto L_0x00aa
        L_0x00c7:
            r4 = 2131231242(0x7f08020a, float:1.807856E38)
            if (r11 == r4) goto L_0x011a
            r4 = 2131231243(0x7f08020b, float:1.8078562E38)
            if (r11 != r4) goto L_0x00d2
            goto L_0x011a
        L_0x00d2:
            r4 = r0
            android.support.v7.widget.ac r4 = (android.support.p033v7.widget.C0505ac) r4     // Catch:{ all -> 0x018e }
            int[] r4 = r4.f2039b     // Catch:{ all -> 0x018e }
            boolean r4 = android.support.p033v7.widget.C0505ac.m1890a(r4, r11)     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x00e5
            r0 = 2130969075(0x7f0401f3, float:1.7546822E38)
            android.content.res.ColorStateList r1 = android.support.p033v7.widget.C0730ik.m2466c(r10, r0)     // Catch:{ all -> 0x018e }
            goto L_0x0121
        L_0x00e5:
            r4 = r0
            android.support.v7.widget.ac r4 = (android.support.p033v7.widget.C0505ac) r4     // Catch:{ all -> 0x018e }
            int[] r4 = r4.f2042e     // Catch:{ all -> 0x018e }
            boolean r4 = android.support.p033v7.widget.C0505ac.m1890a(r4, r11)     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x00f8
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            android.content.res.ColorStateList r1 = androidx.core.content.C1882h.m5138d(r10, r0)     // Catch:{ all -> 0x018e }
            goto L_0x0121
        L_0x00f8:
            android.support.v7.widget.ac r0 = (android.support.p033v7.widget.C0505ac) r0     // Catch:{ all -> 0x018e }
            int[] r0 = r0.f2043f     // Catch:{ all -> 0x018e }
            boolean r0 = android.support.p033v7.widget.C0505ac.m1890a(r0, r11)     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x010a
            r0 = 2131099703(0x7f060037, float:1.7811767E38)
            android.content.res.ColorStateList r1 = androidx.core.content.C1882h.m5138d(r10, r0)     // Catch:{ all -> 0x018e }
            goto L_0x0121
        L_0x010a:
            r0 = 2131231235(0x7f080203, float:1.8078545E38)
            if (r11 != r0) goto L_0x0121
            r11 = 2131099706(0x7f06003a, float:1.7811773E38)
            android.content.res.ColorStateList r1 = androidx.core.content.C1882h.m5138d(r10, r11)     // Catch:{ all -> 0x018e }
            r11 = 2131231235(0x7f080203, float:1.8078545E38)
            goto L_0x0121
        L_0x011a:
            r0 = 2131099707(0x7f06003b, float:1.7811775E38)
            android.content.res.ColorStateList r1 = androidx.core.content.C1882h.m5138d(r10, r0)     // Catch:{ all -> 0x018e }
        L_0x0121:
            if (r1 == 0) goto L_0x018b
            java.util.WeakHashMap r0 = r9.f2487d     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x012e
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x018e }
            r0.<init>()     // Catch:{ all -> 0x018e }
            r9.f2487d = r0     // Catch:{ all -> 0x018e }
        L_0x012e:
            java.util.WeakHashMap r0 = r9.f2487d     // Catch:{ all -> 0x018e }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x018e }
            androidx.c.o r0 = (androidx.p060c.C0985o) r0     // Catch:{ all -> 0x018e }
            if (r0 != 0) goto L_0x0144
            androidx.c.o r0 = new androidx.c.o     // Catch:{ all -> 0x018e }
            r4 = 10
            r0.<init>(r4)     // Catch:{ all -> 0x018e }
            java.util.WeakHashMap r4 = r9.f2487d     // Catch:{ all -> 0x018e }
            r4.put(r10, r0)     // Catch:{ all -> 0x018e }
        L_0x0144:
            int r10 = r0.f3127e     // Catch:{ all -> 0x018e }
            if (r10 == 0) goto L_0x0154
            int[] r4 = r0.f3125c     // Catch:{ all -> 0x018e }
            int r5 = r10 + -1
            r4 = r4[r5]     // Catch:{ all -> 0x018e }
            if (r11 > r4) goto L_0x0154
            r0.mo3730i(r11, r1)     // Catch:{ all -> 0x018e }
            goto L_0x0189
        L_0x0154:
            boolean r4 = r0.f3124b     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x0160
            int[] r4 = r0.f3125c     // Catch:{ all -> 0x018e }
            int r4 = r4.length     // Catch:{ all -> 0x018e }
            if (r10 < r4) goto L_0x0160
            r0.mo3729h()     // Catch:{ all -> 0x018e }
        L_0x0160:
            int r10 = r0.f3127e     // Catch:{ all -> 0x018e }
            int[] r4 = r0.f3125c     // Catch:{ all -> 0x018e }
            int r5 = r4.length     // Catch:{ all -> 0x018e }
            if (r10 < r5) goto L_0x017e
            int r6 = r10 + 1
            int r6 = androidx.p060c.p061a.C0969a.m2918d(r6)     // Catch:{ all -> 0x018e }
            int[] r7 = new int[r6]     // Catch:{ all -> 0x018e }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x018e }
            java.lang.System.arraycopy(r4, r3, r7, r3, r5)     // Catch:{ all -> 0x018e }
            java.lang.Object[] r4 = r0.f3126d     // Catch:{ all -> 0x018e }
            int r5 = r4.length     // Catch:{ all -> 0x018e }
            java.lang.System.arraycopy(r4, r3, r6, r3, r5)     // Catch:{ all -> 0x018e }
            r0.f3125c = r7     // Catch:{ all -> 0x018e }
            r0.f3126d = r6     // Catch:{ all -> 0x018e }
        L_0x017e:
            int[] r3 = r0.f3125c     // Catch:{ all -> 0x018e }
            r3[r10] = r11     // Catch:{ all -> 0x018e }
            java.lang.Object[] r11 = r0.f3126d     // Catch:{ all -> 0x018e }
            r11[r10] = r1     // Catch:{ all -> 0x018e }
            int r10 = r10 + r2
            r0.f3127e = r10     // Catch:{ all -> 0x018e }
        L_0x0189:
            monitor-exit(r9)
            return r1
        L_0x018b:
            r0 = r1
        L_0x018c:
            monitor-exit(r9)
            return r0
        L_0x018e:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0192
        L_0x0191:
            throw r10
        L_0x0192:
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0678gm.mo3099a(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public final synchronized Drawable mo3100c(Context context, int i) {
        return mo3101d(context, i, false);
    }

    /* renamed from: f */
    public final synchronized void mo3102f(Context context) {
        C0981k kVar = (C0981k) this.f2488e.get(context);
        if (kVar != null) {
            kVar.mo3681h();
        }
    }

    /* renamed from: g */
    public final synchronized void mo3103g(C0677gl glVar) {
        this.f2491h = glVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b8  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo3101d(android.content.Context r17, int r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            monitor-enter(r16)
            boolean r3 = r1.f2490g     // Catch:{ all -> 0x01c7 }
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x000e
            goto L_0x002d
        L_0x000e:
            r1.f2490g = r5     // Catch:{ all -> 0x01c7 }
            r3 = 2131231259(0x7f08021b, float:1.8078594E38)
            android.graphics.drawable.Drawable r3 = r1.mo3100c(r0, r3)     // Catch:{ all -> 0x01c7 }
            if (r3 == 0) goto L_0x01bd
            boolean r6 = r3 instanceof androidx.p198v.p199a.p200a.C4261t     // Catch:{ all -> 0x01c7 }
            if (r6 != 0) goto L_0x002d
            java.lang.String r6 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x01c7 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x01c7 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x01c7 }
            if (r3 == 0) goto L_0x01bd
        L_0x002d:
            android.util.TypedValue r3 = r1.f2489f     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x0038
            android.util.TypedValue r3 = new android.util.TypedValue     // Catch:{ all -> 0x01c7 }
            r3.<init>()     // Catch:{ all -> 0x01c7 }
            r1.f2489f = r3     // Catch:{ all -> 0x01c7 }
        L_0x0038:
            android.util.TypedValue r3 = r1.f2489f     // Catch:{ all -> 0x01c7 }
            android.content.res.Resources r6 = r17.getResources()     // Catch:{ all -> 0x01c7 }
            r6.getValue(r2, r3, r5)     // Catch:{ all -> 0x01c7 }
            int r6 = r3.assetCookie     // Catch:{ all -> 0x01c7 }
            long r6 = (long) r6     // Catch:{ all -> 0x01c7 }
            r8 = 32
            long r6 = r6 << r8
            int r8 = r3.data     // Catch:{ all -> 0x01c7 }
            long r8 = (long) r8     // Catch:{ all -> 0x01c7 }
            long r6 = r6 | r8
            android.graphics.drawable.Drawable r8 = r1.m2377i(r0, r6)     // Catch:{ all -> 0x01c7 }
            r9 = 2131231227(0x7f0801fb, float:1.807853E38)
            r10 = 2131231228(0x7f0801fc, float:1.8078531E38)
            r11 = 2131231229(0x7f0801fd, float:1.8078533E38)
            r12 = 0
            if (r8 == 0) goto L_0x005c
            goto L_0x00ad
        L_0x005c:
            android.support.v7.widget.gl r8 = r1.f2491h     // Catch:{ all -> 0x01c7 }
            if (r8 != 0) goto L_0x0062
        L_0x0060:
            r8 = r12
            goto L_0x00a3
        L_0x0062:
            r8 = 2131231190(0x7f0801d6, float:1.8078454E38)
            if (r2 != r8) goto L_0x0082
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x01c7 }
            r13 = 2
            android.graphics.drawable.Drawable[] r13 = new android.graphics.drawable.Drawable[r13]     // Catch:{ all -> 0x01c7 }
            r14 = 2131231189(0x7f0801d5, float:1.8078452E38)
            android.graphics.drawable.Drawable r14 = r1.mo3100c(r0, r14)     // Catch:{ all -> 0x01c7 }
            r13[r4] = r14     // Catch:{ all -> 0x01c7 }
            r14 = 2131231191(0x7f0801d7, float:1.8078456E38)
            android.graphics.drawable.Drawable r14 = r1.mo3100c(r0, r14)     // Catch:{ all -> 0x01c7 }
            r13[r5] = r14     // Catch:{ all -> 0x01c7 }
            r8.<init>(r13)     // Catch:{ all -> 0x01c7 }
            goto L_0x00a3
        L_0x0082:
            if (r2 != r10) goto L_0x008c
            r8 = 2131165322(0x7f07008a, float:1.7944858E38)
            android.graphics.drawable.LayerDrawable r8 = android.support.p033v7.widget.C0505ac.m1892c(r1, r0, r8)     // Catch:{ all -> 0x01c7 }
            goto L_0x00a3
        L_0x008c:
            if (r2 != r9) goto L_0x0096
            r8 = 2131165323(0x7f07008b, float:1.794486E38)
            android.graphics.drawable.LayerDrawable r8 = android.support.p033v7.widget.C0505ac.m1892c(r1, r0, r8)     // Catch:{ all -> 0x01c7 }
            goto L_0x00a3
        L_0x0096:
            if (r2 != r11) goto L_0x0060
            r2 = 2131165324(0x7f07008c, float:1.7944862E38)
            android.graphics.drawable.LayerDrawable r2 = android.support.p033v7.widget.C0505ac.m1892c(r1, r0, r2)     // Catch:{ all -> 0x01c7 }
            r8 = r2
            r2 = 2131231229(0x7f0801fd, float:1.8078533E38)
        L_0x00a3:
            if (r8 == 0) goto L_0x00ad
            int r3 = r3.changingConfigurations     // Catch:{ all -> 0x01c7 }
            r8.setChangingConfigurations(r3)     // Catch:{ all -> 0x01c7 }
            r1.m2378j(r0, r6, r8)     // Catch:{ all -> 0x01c7 }
        L_0x00ad:
            if (r8 != 0) goto L_0x00b3
            android.graphics.drawable.Drawable r8 = androidx.core.content.C1877c.m5125a(r0, r2)     // Catch:{ all -> 0x01c7 }
        L_0x00b3:
            if (r8 == 0) goto L_0x01b5
            android.content.res.ColorStateList r3 = r1.mo3099a(r0, r2)     // Catch:{ all -> 0x01c7 }
            if (r3 == 0) goto L_0x00d8
            android.graphics.Rect r0 = android.support.p033v7.widget.C0571cn.f2215a     // Catch:{ all -> 0x01c7 }
            android.graphics.drawable.Drawable r0 = r8.mutate()     // Catch:{ all -> 0x01c7 }
            androidx.core.graphics.drawable.C1929b.m5226g(r0, r3)     // Catch:{ all -> 0x01c7 }
            android.support.v7.widget.gl r3 = r1.f2491h     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x00c9
            goto L_0x00d0
        L_0x00c9:
            r3 = 2131231246(0x7f08020e, float:1.8078568E38)
            if (r2 != r3) goto L_0x00d0
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x01c7 }
        L_0x00d0:
            if (r12 == 0) goto L_0x00d5
            androidx.core.graphics.drawable.C1929b.m5227h(r0, r12)     // Catch:{ all -> 0x01c7 }
        L_0x00d5:
            r12 = r0
            goto L_0x01b6
        L_0x00d8:
            android.support.v7.widget.gl r3 = r1.f2491h     // Catch:{ all -> 0x01c7 }
            r6 = 2130969073(0x7f0401f1, float:1.7546818E38)
            r7 = 2130969075(0x7f0401f3, float:1.7546822E38)
            if (r3 == 0) goto L_0x0149
            r13 = 2131231237(0x7f080205, float:1.807855E38)
            r14 = 16908301(0x102000d, float:2.3877265E-38)
            r15 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            if (r2 != r13) goto L_0x011b
            r2 = r8
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2     // Catch:{ all -> 0x01c7 }
            android.graphics.drawable.Drawable r3 = r2.findDrawableByLayerId(r5)     // Catch:{ all -> 0x01c7 }
            int r4 = android.support.p033v7.widget.C0730ik.m2465b(r0, r7)     // Catch:{ all -> 0x01c7 }
            android.graphics.PorterDuff$Mode r5 = android.support.p033v7.widget.C0506ad.f2044a     // Catch:{ all -> 0x01c7 }
            android.support.p033v7.widget.C0505ac.m1893d(r3, r4, r5)     // Catch:{ all -> 0x01c7 }
            android.graphics.drawable.Drawable r3 = r2.findDrawableByLayerId(r15)     // Catch:{ all -> 0x01c7 }
            int r4 = android.support.p033v7.widget.C0730ik.m2465b(r0, r7)     // Catch:{ all -> 0x01c7 }
            android.graphics.PorterDuff$Mode r5 = android.support.p033v7.widget.C0506ad.f2044a     // Catch:{ all -> 0x01c7 }
            android.support.p033v7.widget.C0505ac.m1893d(r3, r4, r5)     // Catch:{ all -> 0x01c7 }
            android.graphics.drawable.Drawable r2 = r2.findDrawableByLayerId(r14)     // Catch:{ all -> 0x01c7 }
            int r0 = android.support.p033v7.widget.C0730ik.m2465b(r0, r6)     // Catch:{ all -> 0x01c7 }
            android.graphics.PorterDuff$Mode r3 = android.support.p033v7.widget.C0506ad.f2044a     // Catch:{ all -> 0x01c7 }
        L_0x0116:
            android.support.p033v7.widget.C0505ac.m1893d(r2, r0, r3)     // Catch:{ all -> 0x01c7 }
            goto L_0x01b5
        L_0x011b:
            if (r2 == r10) goto L_0x0121
            if (r2 == r9) goto L_0x0121
            if (r2 != r11) goto L_0x0149
        L_0x0121:
            r2 = r8
            android.graphics.drawable.LayerDrawable r2 = (android.graphics.drawable.LayerDrawable) r2     // Catch:{ all -> 0x01c7 }
            android.graphics.drawable.Drawable r3 = r2.findDrawableByLayerId(r5)     // Catch:{ all -> 0x01c7 }
            int r4 = android.support.p033v7.widget.C0730ik.m2464a(r0, r7)     // Catch:{ all -> 0x01c7 }
            android.graphics.PorterDuff$Mode r5 = android.support.p033v7.widget.C0506ad.f2044a     // Catch:{ all -> 0x01c7 }
            android.support.p033v7.widget.C0505ac.m1893d(r3, r4, r5)     // Catch:{ all -> 0x01c7 }
            android.graphics.drawable.Drawable r3 = r2.findDrawableByLayerId(r15)     // Catch:{ all -> 0x01c7 }
            int r4 = android.support.p033v7.widget.C0730ik.m2465b(r0, r6)     // Catch:{ all -> 0x01c7 }
            android.graphics.PorterDuff$Mode r5 = android.support.p033v7.widget.C0506ad.f2044a     // Catch:{ all -> 0x01c7 }
            android.support.p033v7.widget.C0505ac.m1893d(r3, r4, r5)     // Catch:{ all -> 0x01c7 }
            android.graphics.drawable.Drawable r2 = r2.findDrawableByLayerId(r14)     // Catch:{ all -> 0x01c7 }
            int r0 = android.support.p033v7.widget.C0730ik.m2465b(r0, r6)     // Catch:{ all -> 0x01c7 }
            android.graphics.PorterDuff$Mode r3 = android.support.p033v7.widget.C0506ad.f2044a     // Catch:{ all -> 0x01c7 }
            goto L_0x0116
        L_0x0149:
            if (r3 == 0) goto L_0x01b2
            android.graphics.PorterDuff$Mode r5 = android.support.p033v7.widget.C0506ad.f2044a     // Catch:{ all -> 0x01c7 }
            r9 = r3
            android.support.v7.widget.ac r9 = (android.support.p033v7.widget.C0505ac) r9     // Catch:{ all -> 0x01c7 }
            int[] r9 = r9.f2038a     // Catch:{ all -> 0x01c7 }
            boolean r9 = android.support.p033v7.widget.C0505ac.m1890a(r9, r2)     // Catch:{ all -> 0x01c7 }
            r10 = -1
            if (r9 == 0) goto L_0x015f
            r2 = -1
            r4 = 1
            r6 = 2130969075(0x7f0401f3, float:1.7546822E38)
            goto L_0x0199
        L_0x015f:
            r7 = r3
            android.support.v7.widget.ac r7 = (android.support.p033v7.widget.C0505ac) r7     // Catch:{ all -> 0x01c7 }
            int[] r7 = r7.f2040c     // Catch:{ all -> 0x01c7 }
            boolean r7 = android.support.p033v7.widget.C0505ac.m1890a(r7, r2)     // Catch:{ all -> 0x01c7 }
            if (r7 == 0) goto L_0x016d
        L_0x016a:
            r2 = -1
            r4 = 1
            goto L_0x0199
        L_0x016d:
            android.support.v7.widget.ac r3 = (android.support.p033v7.widget.C0505ac) r3     // Catch:{ all -> 0x01c7 }
            int[] r3 = r3.f2041d     // Catch:{ all -> 0x01c7 }
            boolean r3 = android.support.p033v7.widget.C0505ac.m1890a(r3, r2)     // Catch:{ all -> 0x01c7 }
            r6 = 16842801(0x1010031, float:2.3693695E-38)
            if (r3 == 0) goto L_0x017d
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x01c7 }
            goto L_0x016a
        L_0x017d:
            r3 = 2131231214(0x7f0801ee, float:1.8078503E38)
            if (r2 != r3) goto L_0x0191
            r2 = 1109603123(0x42233333, float:40.8)
            int r2 = java.lang.Math.round(r2)     // Catch:{ all -> 0x01c7 }
            r4 = 16842800(0x1010030, float:2.3693693E-38)
            r4 = 1
            r6 = 16842800(0x1010030, float:2.3693693E-38)
            goto L_0x0199
        L_0x0191:
            r3 = 2131231193(0x7f0801d9, float:1.807846E38)
            if (r2 != r3) goto L_0x0197
            goto L_0x016a
        L_0x0197:
            r2 = -1
            r6 = 0
        L_0x0199:
            if (r4 == 0) goto L_0x01b2
            android.graphics.Rect r3 = android.support.p033v7.widget.C0571cn.f2215a     // Catch:{ all -> 0x01c7 }
            android.graphics.drawable.Drawable r3 = r8.mutate()     // Catch:{ all -> 0x01c7 }
            int r0 = android.support.p033v7.widget.C0730ik.m2465b(r0, r6)     // Catch:{ all -> 0x01c7 }
            android.graphics.PorterDuffColorFilter r0 = android.support.p033v7.widget.C0506ad.m1894b(r0, r5)     // Catch:{ all -> 0x01c7 }
            r3.setColorFilter(r0)     // Catch:{ all -> 0x01c7 }
            if (r2 == r10) goto L_0x01b5
            r3.setAlpha(r2)     // Catch:{ all -> 0x01c7 }
            goto L_0x01b5
        L_0x01b2:
            if (r19 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            r12 = r8
        L_0x01b6:
            if (r12 == 0) goto L_0x01bb
            android.support.p033v7.widget.C0571cn.m2116c(r12)     // Catch:{ all -> 0x01c7 }
        L_0x01bb:
            monitor-exit(r16)
            return r12
        L_0x01bd:
            r1.f2490g = r4     // Catch:{ all -> 0x01c7 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r0.<init>(r2)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x01cb
        L_0x01ca:
            throw r0
        L_0x01cb:
            goto L_0x01ca
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0678gm.mo3101d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }
}
