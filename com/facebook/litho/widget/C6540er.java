package com.facebook.litho.widget;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.litho.widget.er */
/* compiled from: PG */
public final class C6540er {

    /* renamed from: a */
    public int f19465a;

    /* renamed from: b */
    public boolean f19466b;

    /* renamed from: c */
    public final List f19467c;

    /* renamed from: d */
    public final C6539eq f19468d = new C6539eq(this);

    /* renamed from: e */
    private int f19469e;

    /* renamed from: f */
    private int f19470f;

    /* renamed from: g */
    private int f19471g;

    /* renamed from: h */
    private int f19472h;

    /* renamed from: i */
    private final C6427am f19473i;

    public C6540er(int i, int i2, C6427am amVar) {
        this.f19465a = i;
        this.f19469e = i2;
        this.f19470f = amVar.mo13480b();
        this.f19471g = amVar.mo13482d();
        this.f19472h = amVar.mo13486h();
        this.f19473i = amVar;
        this.f19467c = new ArrayList(2);
    }

    /* renamed from: a */
    public final void mo13619a(C6537eo eoVar) {
        if (eoVar != null) {
            synchronized (this) {
                this.f19467c.add(eoVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r11 = r10.size();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r12 >= r11) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        ((com.facebook.litho.widget.C6537eo) r10.get(r12)).mo13320a(r0, r7, r8, r9, r14);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13620b(int r14) {
        /*
            r13 = this;
            com.facebook.litho.widget.am r0 = r13.f19473i
            int r0 = r0.mo13481c()
            com.facebook.litho.widget.am r1 = r13.f19473i
            int r7 = r1.mo13483e()
            com.facebook.litho.widget.am r1 = r13.f19473i
            int r8 = r1.mo13480b()
            com.facebook.litho.widget.am r1 = r13.f19473i
            int r9 = r1.mo13482d()
            com.facebook.litho.widget.am r1 = r13.f19473i
            int r1 = r1.mo13486h()
            if (r0 < 0) goto L_0x0078
            if (r7 >= 0) goto L_0x0023
            goto L_0x0078
        L_0x0023:
            int r2 = r13.f19465a
            if (r0 != r2) goto L_0x003c
            int r2 = r13.f19469e
            if (r7 != r2) goto L_0x003c
            int r2 = r13.f19470f
            if (r8 != r2) goto L_0x003c
            int r2 = r13.f19471g
            if (r9 != r2) goto L_0x003c
            int r2 = r13.f19472h
            if (r1 != r2) goto L_0x003c
            r2 = 1
            if (r14 != r2) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            return
        L_0x003c:
            r13.f19465a = r0
            r13.f19469e = r7
            r13.f19470f = r8
            r13.f19471g = r9
            r13.f19472h = r1
            r1 = 0
            r13.f19466b = r1
            monitor-enter(r13)
            java.util.List r2 = r13.f19467c     // Catch:{ all -> 0x0075 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0054
            monitor-exit(r13)     // Catch:{ all -> 0x0075 }
            return
        L_0x0054:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0075 }
            java.util.List r2 = r13.f19467c     // Catch:{ all -> 0x0075 }
            r10.<init>(r2)     // Catch:{ all -> 0x0075 }
            monitor-exit(r13)     // Catch:{ all -> 0x0075 }
            int r11 = r10.size()
            r12 = 0
        L_0x0061:
            if (r12 >= r11) goto L_0x0074
            java.lang.Object r1 = r10.get(r12)
            com.facebook.litho.widget.eo r1 = (com.facebook.litho.widget.C6537eo) r1
            r2 = r0
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r14
            r1.mo13320a(r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x0061
        L_0x0074:
            return
        L_0x0075:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0075 }
            throw r14
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6540er.mo13620b(int):void");
    }

    /* renamed from: c */
    public final void mo13621c(boolean z) {
        boolean z2 = true;
        if (!this.f19466b && !z) {
            z2 = false;
        }
        this.f19466b = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo13622d() {
        return this.f19465a < 0 || this.f19469e < 0 || this.f19466b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo13623e(int i, int i2) {
        if (mo13622d()) {
            return true;
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.f19465a <= i3 && i3 <= this.f19469e) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo13624f(int i, int i2) {
        return mo13622d() || i2 == -1 || i <= Math.max((this.f19465a + i2) + -1, this.f19469e);
    }

    /* renamed from: g */
    public final boolean mo13625g(int i) {
        return mo13622d() || i <= this.f19469e;
    }
}
