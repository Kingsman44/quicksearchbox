package com.facebook.litho.widget;

import com.facebook.litho.C6095af;
import com.facebook.litho.C6099aj;
import com.facebook.litho.C6193dm;
import com.facebook.litho.C6280fw;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.litho.widget.m */
/* compiled from: PG */
public final class C6548m {

    /* renamed from: d */
    private static final AtomicInteger f19498d = new AtomicInteger(1);

    /* renamed from: a */
    public final AtomicInteger f19499a = new AtomicInteger(0);

    /* renamed from: b */
    public final int f19500b;

    /* renamed from: c */
    public C6491cw f19501c;

    /* renamed from: e */
    private final boolean f19502e;

    /* renamed from: f */
    private final boolean f19503f;

    /* renamed from: g */
    private final boolean f19504g;

    /* renamed from: h */
    private boolean f19505h;

    /* renamed from: i */
    private final C6193dm f19506i;

    /* renamed from: j */
    private boolean f19507j = false;

    /* renamed from: k */
    private int f19508k;

    /* renamed from: l */
    private ComponentTree f19509l;

    /* renamed from: m */
    private C6280fw f19510m;

    /* renamed from: n */
    private int f19511n = -1;

    /* renamed from: o */
    private int f19512o = -1;

    /* renamed from: p */
    private final C6445bd f19513p;

    public C6548m(C6547l lVar) {
        this.f19501c = lVar.f19492a;
        this.f19506i = lVar.f19493b;
        this.f19513p = lVar.f19497f;
        this.f19500b = f19498d.getAndIncrement();
        this.f19503f = lVar.f19494c;
        this.f19504g = lVar.f19496e;
        this.f19502e = lVar.f19495d;
    }

    /* renamed from: c */
    public static C6547l m17825c() {
        return new C6547l();
    }

    /* renamed from: p */
    private final void m17826p(C6411u uVar) {
        C6456bo boVar;
        if (this.f19509l == null) {
            C6095af b = ComponentTree.m15673b(uVar, this.f19501c.mo13521c());
            Object g = this.f19501c.mo13525g("is_reconciliation_enabled");
            Object g2 = this.f19501c.mo13525g("layout_diffing_enabled");
            if (g != null) {
                b.f18004j = ((Boolean) g).booleanValue();
            } else {
                b.f18004j = false;
            }
            if (g2 != null) {
                b.f17999e = ((Boolean) g2).booleanValue();
            } else {
                b.f17999e = this.f19502e;
            }
            b.f18000f = this.f19506i;
            b.f18001g = this.f19510m;
            C6445bd bdVar = this.f19513p;
            if (bdVar == null) {
                boVar = null;
            } else {
                boVar = new C6456bo(bdVar.f19119a, this);
            }
            b.f18003i = boVar;
            b.f18002h = this.f19507j;
            b.f17998d = this.f19503f;
            b.f17996b = this.f19504g;
            C21215m p = this.f19501c.mo13534p();
            String h = this.f19501c.mo13526h();
            b.f18007m = p;
            b.f18006l = h;
            this.f19509l = b.mo12841a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo13630a() {
        return this.f19508k;
    }

    /* renamed from: b */
    public final synchronized ComponentTree mo13631b() {
        return this.f19509l;
    }

    /* renamed from: d */
    public final synchronized C6491cw mo13632d() {
        return this.f19501c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13633e(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0017
            com.facebook.litho.widget.cw r2 = r1.f19501c     // Catch:{ all -> 0x002e }
            java.lang.String r0 = "acquire_state_handler"
            java.lang.Object r2 = r2.mo13525g(r0)     // Catch:{ all -> 0x002e }
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0021
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x002e }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0021
        L_0x0017:
            com.facebook.litho.ComponentTree r2 = r1.f19509l     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0021
            com.facebook.litho.fw r2 = r2.mo12707c()     // Catch:{ all -> 0x002e }
            r1.f19510m = r2     // Catch:{ all -> 0x002e }
        L_0x0021:
            com.facebook.litho.ComponentTree r2 = r1.f19509l     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0029
            boolean r2 = r2.f17918u     // Catch:{ all -> 0x002e }
            r1.f19507j = r2     // Catch:{ all -> 0x002e }
        L_0x0029:
            r1.mo13638j()     // Catch:{ all -> 0x002e }
            monitor-exit(r1)
            return
        L_0x002e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6548m.mo13633e(boolean):void");
    }

    /* renamed from: f */
    public final synchronized void mo13634f(C6099aj ajVar) {
        ComponentTree componentTree = this.f19509l;
        if (componentTree != null) {
            synchronized (componentTree) {
                List list = componentTree.f17904g;
                if (list != null) {
                    list.remove(ajVar);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r0 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r14.mo12711g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r15 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r14.mo12726v(r15, r18, r19, true, (com.facebook.litho.C6276fs) null, 1, (java.lang.String) null, r11, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        monitor-enter(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r1.f19509l != r14) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r15 != r1.f19501c.mo13521c()) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r1.f19505h = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        monitor-exit(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        throw new java.lang.IllegalArgumentException("Root component can't be null");
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13635g(com.facebook.litho.C6411u r17, int r18, int r19, com.facebook.litho.C6099aj r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            monitor-enter(r16)
            com.facebook.litho.widget.cw r2 = r1.f19501c     // Catch:{ all -> 0x0063 }
            boolean r2 = r2.mo13533o()     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r16)     // Catch:{ all -> 0x0063 }
            return
        L_0x000f:
            r2 = r18
            r1.f19511n = r2     // Catch:{ all -> 0x0063 }
            r6 = r19
            r1.f19512o = r6     // Catch:{ all -> 0x0063 }
            r16.m17826p(r17)     // Catch:{ all -> 0x0063 }
            com.facebook.litho.ComponentTree r14 = r1.f19509l     // Catch:{ all -> 0x0063 }
            com.facebook.litho.widget.cw r3 = r1.f19501c     // Catch:{ all -> 0x0063 }
            com.facebook.litho.q r15 = r3.mo13521c()     // Catch:{ all -> 0x0063 }
            com.facebook.litho.widget.cw r3 = r1.f19501c     // Catch:{ all -> 0x0063 }
            boolean r4 = r3 instanceof com.facebook.litho.widget.C6527ee     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x002d
            com.facebook.litho.widget.ee r3 = (com.facebook.litho.widget.C6527ee) r3     // Catch:{ all -> 0x0063 }
            com.facebook.litho.hf r3 = r3.f19436a     // Catch:{ all -> 0x0063 }
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            r11 = r3
            monitor-exit(r16)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0035
            r14.mo12711g(r0)
        L_0x0035:
            if (r15 == 0) goto L_0x005b
            r7 = 1
            r8 = 0
            r9 = 1
            r10 = 0
            r12 = 0
            r13 = 0
            r3 = r14
            r4 = r15
            r5 = r18
            r6 = r19
            r3.mo12726v(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            monitor-enter(r16)
            com.facebook.litho.ComponentTree r0 = r1.f19509l     // Catch:{ all -> 0x0058 }
            if (r0 != r14) goto L_0x0056
            com.facebook.litho.widget.cw r0 = r1.f19501c     // Catch:{ all -> 0x0058 }
            com.facebook.litho.q r0 = r0.mo13521c()     // Catch:{ all -> 0x0058 }
            if (r15 != r0) goto L_0x0056
            r0 = 1
            r1.f19505h = r0     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r16)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x005b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Root component can't be null"
            r0.<init>(r2)
            throw r0
        L_0x0063:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0063 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6548m.mo13635g(com.facebook.litho.u, int, int, com.facebook.litho.aj):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r14 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r13.mo12726v(r14, r17, r18, false, r19, 0, (java.lang.String) null, r10, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        monitor-enter(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r13 != r1.f19509l) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r14 != r1.f19501c.mo13521c()) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r1.f19505h = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r1.f19508k = r0.f18536b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        monitor-exit(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        throw new java.lang.IllegalArgumentException("Root component can't be null");
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13636h(com.facebook.litho.C6411u r16, int r17, int r18, com.facebook.litho.C6276fs r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            monitor-enter(r15)
            com.facebook.litho.widget.cw r2 = r1.f19501c     // Catch:{ all -> 0x0064 }
            boolean r2 = r2.mo13533o()     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r15)     // Catch:{ all -> 0x0064 }
            return
        L_0x000e:
            r4 = r17
            r1.f19511n = r4     // Catch:{ all -> 0x0064 }
            r5 = r18
            r1.f19512o = r5     // Catch:{ all -> 0x0064 }
            r15.m17826p(r16)     // Catch:{ all -> 0x0064 }
            com.facebook.litho.ComponentTree r13 = r1.f19509l     // Catch:{ all -> 0x0064 }
            com.facebook.litho.widget.cw r2 = r1.f19501c     // Catch:{ all -> 0x0064 }
            com.facebook.litho.q r14 = r2.mo13521c()     // Catch:{ all -> 0x0064 }
            com.facebook.litho.widget.cw r2 = r1.f19501c     // Catch:{ all -> 0x0064 }
            boolean r3 = r2 instanceof com.facebook.litho.widget.C6527ee     // Catch:{ all -> 0x0064 }
            if (r3 == 0) goto L_0x002c
            com.facebook.litho.widget.ee r2 = (com.facebook.litho.widget.C6527ee) r2     // Catch:{ all -> 0x0064 }
            com.facebook.litho.hf r2 = r2.f19436a     // Catch:{ all -> 0x0064 }
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            r10 = r2
            monitor-exit(r15)     // Catch:{ all -> 0x0064 }
            if (r14 == 0) goto L_0x005c
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r17
            r5 = r18
            r7 = r19
            r2.mo12726v(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            monitor-enter(r15)
            com.facebook.litho.ComponentTree r2 = r1.f19509l     // Catch:{ all -> 0x0059 }
            if (r13 != r2) goto L_0x0057
            com.facebook.litho.widget.cw r2 = r1.f19501c     // Catch:{ all -> 0x0059 }
            com.facebook.litho.q r2 = r2.mo13521c()     // Catch:{ all -> 0x0059 }
            if (r14 != r2) goto L_0x0057
            r2 = 1
            r1.f19505h = r2     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0057
            int r0 = r0.f18536b     // Catch:{ all -> 0x0059 }
            r1.f19508k = r0     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r15)     // Catch:{ all -> 0x0059 }
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Root component can't be null"
            r0.<init>(r2)
            throw r0
        L_0x0064:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6548m.mo13636h(com.facebook.litho.u, int, int, com.facebook.litho.fs):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final synchronized void mo13637i() {
        this.f19505h = false;
    }

    /* renamed from: j */
    public final synchronized void mo13638j() {
        ComponentTree componentTree = this.f19509l;
        if (componentTree != null) {
            componentTree.mo12720o();
            this.f19509l = null;
            this.f19501c.mo13527i();
        }
        this.f19505h = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final synchronized void mo13639k(int i) {
        this.f19508k = i;
    }

    /* renamed from: l */
    public final synchronized void mo13640l(C6491cw cwVar) {
        mo13637i();
        this.f19501c = cwVar;
    }

    /* renamed from: m */
    public final synchronized boolean mo13641m() {
        return this.f19505h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        return false;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo13642n(int r2, int r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo13641m()     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0012
            int r0 = r1.f19511n     // Catch:{ all -> 0x0015 }
            if (r0 != r2) goto L_0x0012
            int r2 = r1.f19512o     // Catch:{ all -> 0x0015 }
            if (r2 != r3) goto L_0x0012
            monitor-exit(r1)
            r2 = 1
            return r2
        L_0x0012:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6548m.mo13642n(int, int):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final synchronized void mo13643o(int i, int i2, int i3) {
        ComponentTree componentTree = this.f19509l;
        if (componentTree != null) {
            componentTree.mo12727w(i, i2, i3);
        }
    }
}
