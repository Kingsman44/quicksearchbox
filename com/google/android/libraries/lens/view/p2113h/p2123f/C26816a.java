package com.google.android.libraries.lens.view.p2113h.p2123f;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.h.f.a */
/* compiled from: PG */
final class C26816a {

    /* renamed from: a */
    private boolean f73093a = false;

    /* renamed from: b */
    private C58833ax f73094b;

    /* renamed from: c */
    private C58833ax f73095c;

    /* renamed from: d */
    private C58833ax f73096d;

    static {
        C58974d.m91135i("FocusRequestProcessor");
    }

    public C26816a() {
        C58836b bVar = C58836b.f156633a;
        this.f73094b = bVar;
        this.f73095c = bVar;
        this.f73096d = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo32178a() {
        if (!this.f73094b.mo56113h() || ((C58485gu) this.f73094b.mo56107c()).size() <= 1) {
            this.f73093a = true;
            this.f73095c = this.f73094b;
            this.f73096d = C58836b.f156633a;
            return;
        }
        this.f73093a = false;
    }

    /* renamed from: b */
    public final synchronized void mo32179b() {
        this.f73093a = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        if ((((java.lang.Math.abs(r7.bottom - r0.bottom) + java.lang.Math.abs(r7.left - r0.left)) + java.lang.Math.abs(r7.top - r0.top)) + java.lang.Math.abs(r7.right - r0.right)) <= 100) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo32180c(com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.common.base.ax r0 = r7.mo32050d()     // Catch:{ all -> 0x00dc }
            r6.f73094b = r0     // Catch:{ all -> 0x00dc }
            boolean r1 = r6.f73093a     // Catch:{ all -> 0x00dc }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            monitor-exit(r6)
            return r2
        L_0x000e:
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00da
            com.google.common.base.ax r0 = r6.f73094b     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x00dc }
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ all -> 0x00dc }
            int r0 = r0.size()     // Catch:{ all -> 0x00dc }
            r1 = 1
            if (r0 == r1) goto L_0x0025
            goto L_0x00da
        L_0x0025:
            com.google.common.base.ax r0 = r7.mo32054h()     // Catch:{ all -> 0x00dc }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d4
            com.google.common.base.ax r7 = r7.mo32054h()     // Catch:{ all -> 0x00dc }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ all -> 0x00dc }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00dc }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00dc }
            if (r7 != 0) goto L_0x0041
            goto L_0x00d4
        L_0x0041:
            com.google.common.base.ax r7 = r6.f73096d     // Catch:{ all -> 0x00dc }
            boolean r7 = r7.mo56113h()     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00d2
            com.google.common.base.ax r7 = r6.f73096d     // Catch:{ all -> 0x00dc }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ all -> 0x00dc }
            com.google.common.b.gu r7 = (com.google.common.p4522b.C58485gu) r7     // Catch:{ all -> 0x00dc }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x0059
            goto L_0x00d2
        L_0x0059:
            com.google.common.base.ax r7 = r6.f73096d     // Catch:{ all -> 0x00dc }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ all -> 0x00dc }
            com.google.common.b.gu r7 = (com.google.common.p4522b.C58485gu) r7     // Catch:{ all -> 0x00dc }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x00dc }
            android.graphics.Rect r7 = (android.graphics.Rect) r7     // Catch:{ all -> 0x00dc }
            com.google.common.base.ax r0 = r6.f73094b     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x00dc }
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x00dc }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ all -> 0x00dc }
            boolean r7 = r0.equals(r7)     // Catch:{ all -> 0x00dc }
            if (r7 != 0) goto L_0x007d
            monitor-exit(r6)
            return r2
        L_0x007d:
            com.google.common.base.ax r7 = r6.f73095c     // Catch:{ all -> 0x00dc }
            boolean r7 = r7.mo56113h()     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x00d0
            com.google.common.base.ax r7 = r6.f73095c     // Catch:{ all -> 0x00dc }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ all -> 0x00dc }
            com.google.common.b.gu r7 = (com.google.common.p4522b.C58485gu) r7     // Catch:{ all -> 0x00dc }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x0094
            goto L_0x00d0
        L_0x0094:
            com.google.common.base.ax r7 = r6.f73095c     // Catch:{ all -> 0x00dc }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ all -> 0x00dc }
            com.google.common.b.gu r7 = (com.google.common.p4522b.C58485gu) r7     // Catch:{ all -> 0x00dc }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x00dc }
            android.graphics.Rect r7 = (android.graphics.Rect) r7     // Catch:{ all -> 0x00dc }
            int r3 = r7.bottom     // Catch:{ all -> 0x00dc }
            int r4 = r0.bottom     // Catch:{ all -> 0x00dc }
            int r3 = r3 - r4
            int r3 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x00dc }
            int r4 = r7.left     // Catch:{ all -> 0x00dc }
            int r5 = r0.left     // Catch:{ all -> 0x00dc }
            int r4 = r4 - r5
            int r4 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x00dc }
            int r3 = r3 + r4
            int r4 = r7.top     // Catch:{ all -> 0x00dc }
            int r5 = r0.top     // Catch:{ all -> 0x00dc }
            int r4 = r4 - r5
            int r4 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x00dc }
            int r3 = r3 + r4
            int r7 = r7.right     // Catch:{ all -> 0x00dc }
            int r0 = r0.right     // Catch:{ all -> 0x00dc }
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x00dc }
            int r3 = r3 + r7
            r7 = 100
            monitor-exit(r6)
            if (r3 <= r7) goto L_0x00cf
            return r1
        L_0x00cf:
            return r2
        L_0x00d0:
            monitor-exit(r6)
            return r1
        L_0x00d2:
            monitor-exit(r6)
            return r2
        L_0x00d4:
            com.google.common.base.ax r7 = r6.f73094b     // Catch:{ all -> 0x00dc }
            r6.f73096d = r7     // Catch:{ all -> 0x00dc }
            monitor-exit(r6)
            return r2
        L_0x00da:
            monitor-exit(r6)
            return r2
        L_0x00dc:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2113h.p2123f.C26816a.mo32180c(com.google.android.libraries.lens.view.h.d.ab):boolean");
    }
}
