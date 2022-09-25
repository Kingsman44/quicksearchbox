package com.google.android.apps.gsa.searchbox.p6960ui.p6961a;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.a.i */
/* compiled from: PG */
public final class C88700i extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    private C89205j f239825a;

    /* renamed from: a */
    public final synchronized void mo82420a(int i) {
        C89205j jVar = this.f239825a;
        if (jVar != null) {
            jVar.mo83171k("SCROLL_VIEW_HEIGHT", i);
        }
    }

    /* renamed from: c */
    public final synchronized void mo82421c(boolean z) {
        C89205j jVar = this.f239825a;
        if (jVar != null) {
            jVar.mo83170j("VIEW_SCROLLABLE_IN_ZERO_PREFIX", z);
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44231f(com.google.common.p4552o.amt r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x00b2
            com.google.android.apps.gsa.shared.an.a.j r0 = r4.f239825a     // Catch:{ all -> 0x00af }
            if (r0 != 0) goto L_0x0009
            goto L_0x00b2
        L_0x0009:
            com.google.protobuf.bv r0 = r5.instance     // Catch:{ all -> 0x00af }
            com.google.common.o.apd r0 = (com.google.common.p4552o.apd) r0     // Catch:{ all -> 0x00af }
            com.google.common.o.aop r0 = r0.f159594ak     // Catch:{ all -> 0x00af }
            if (r0 != 0) goto L_0x0013
            com.google.common.o.aop r0 = com.google.common.p4552o.aop.f159501f     // Catch:{ all -> 0x00af }
        L_0x0013:
            com.google.protobuf.bn r0 = r0.toBuilder()     // Catch:{ all -> 0x00af }
            com.google.common.o.aoo r0 = (com.google.common.p4552o.aoo) r0     // Catch:{ all -> 0x00af }
            com.google.android.apps.gsa.shared.an.a.j r1 = r4.f239825a     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "USER_SCROLL_IN_ZERO_PREFIX"
            boolean r1 = r1.mo83178r(r2)     // Catch:{ all -> 0x00af }
            r2 = 1
            if (r1 == 0) goto L_0x0032
            r0.copyOnWrite()     // Catch:{ all -> 0x00af }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x00af }
            com.google.common.o.aop r1 = (com.google.common.p4552o.aop) r1     // Catch:{ all -> 0x00af }
            int r3 = r1.f159503a     // Catch:{ all -> 0x00af }
            r3 = r3 | r2
            r1.f159503a = r3     // Catch:{ all -> 0x00af }
            r1.f159504b = r2     // Catch:{ all -> 0x00af }
        L_0x0032:
            com.google.android.apps.gsa.shared.an.a.j r1 = r4.f239825a     // Catch:{ all -> 0x00af }
            java.lang.String r3 = "USER_SCROLL_TO_BOTTOM_IN_ZERO_PREFIX"
            boolean r1 = r1.mo83178r(r3)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x004b
            r0.copyOnWrite()     // Catch:{ all -> 0x00af }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x00af }
            com.google.common.o.aop r1 = (com.google.common.p4552o.aop) r1     // Catch:{ all -> 0x00af }
            int r3 = r1.f159503a     // Catch:{ all -> 0x00af }
            r3 = r3 | 2
            r1.f159503a = r3     // Catch:{ all -> 0x00af }
            r1.f159505c = r2     // Catch:{ all -> 0x00af }
        L_0x004b:
            com.google.android.apps.gsa.shared.an.a.j r1 = r4.f239825a     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "VIEW_SCROLLABLE_IN_ZERO_PREFIX"
            boolean r1 = r1.mo83178r(r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x006c
            com.google.android.apps.gsa.shared.an.a.j r1 = r4.f239825a     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "VIEW_SCROLLABLE_IN_ZERO_PREFIX"
            boolean r1 = r1.mo83178r(r2)     // Catch:{ all -> 0x00af }
            r0.copyOnWrite()     // Catch:{ all -> 0x00af }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x00af }
            com.google.common.o.aop r2 = (com.google.common.p4552o.aop) r2     // Catch:{ all -> 0x00af }
            int r3 = r2.f159503a     // Catch:{ all -> 0x00af }
            r3 = r3 | 4
            r2.f159503a = r3     // Catch:{ all -> 0x00af }
            r2.f159506d = r1     // Catch:{ all -> 0x00af }
        L_0x006c:
            com.google.android.apps.gsa.shared.an.a.j r1 = r4.f239825a     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "SCROLL_VIEW_HEIGHT"
            int r1 = r1.mo83161a(r2)     // Catch:{ all -> 0x00af }
            if (r1 <= 0) goto L_0x008d
            com.google.android.apps.gsa.shared.an.a.j r1 = r4.f239825a     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "SCROLL_VIEW_HEIGHT"
            int r1 = r1.mo83161a(r2)     // Catch:{ all -> 0x00af }
            r0.copyOnWrite()     // Catch:{ all -> 0x00af }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x00af }
            com.google.common.o.aop r2 = (com.google.common.p4552o.aop) r2     // Catch:{ all -> 0x00af }
            int r3 = r2.f159503a     // Catch:{ all -> 0x00af }
            r3 = r3 | 8
            r2.f159503a = r3     // Catch:{ all -> 0x00af }
            r2.f159507e = r1     // Catch:{ all -> 0x00af }
        L_0x008d:
            r5.copyOnWrite()     // Catch:{ all -> 0x00af }
            com.google.protobuf.bv r5 = r5.instance     // Catch:{ all -> 0x00af }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x00af }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x00af }
            com.google.common.o.aop r0 = (com.google.common.p4552o.aop) r0     // Catch:{ all -> 0x00af }
            r0.getClass()     // Catch:{ all -> 0x00af }
            r5.f159594ak = r0     // Catch:{ all -> 0x00af }
            int r0 = r5.f159611c     // Catch:{ all -> 0x00af }
            r0 = r0 | 512(0x200, float:7.175E-43)
            r5.f159611c = r0     // Catch:{ all -> 0x00af }
            com.google.android.apps.gsa.shared.an.a.j r5 = r4.f239825a     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "VIEW_SCROLLED_SINCE_LAST_UI_LOGGING_SNAPSHOT"
            r1 = 0
            r5.mo83170j(r0, r1)     // Catch:{ all -> 0x00af }
            monitor-exit(r4)
            return
        L_0x00af:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x00b2:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88700i.mo44231f(com.google.common.o.amt):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo82422g() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.shared.an.a.j r0 = r2.f239825a     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = "VIEW_SCROLLED_SINCE_LAST_UI_LOGGING_SNAPSHOT"
            boolean r0 = r0.mo83178r(r1)     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0010:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88700i.mo82422g():boolean");
    }

    /* renamed from: h */
    public final synchronized void mo82423h() {
        C89205j jVar = this.f239825a;
        if (jVar != null) {
            jVar.mo83170j("USER_SCROLL_IN_ZERO_PREFIX", true);
            this.f239825a.mo83170j("VIEW_SCROLLED_SINCE_LAST_UI_LOGGING_SNAPSHOT", true);
        }
    }

    /* renamed from: hC */
    public final synchronized void mo78005hC(C89205j jVar) {
        this.f239825a = jVar;
    }

    /* renamed from: hE */
    public final synchronized void mo78006hE() {
        C89205j jVar = this.f239825a;
        if (jVar != null) {
            jVar.mo83168h();
        }
    }

    /* renamed from: i */
    public final synchronized void mo82424i() {
        C89205j jVar = this.f239825a;
        if (jVar != null) {
            jVar.mo83170j("USER_SCROLL_TO_BOTTOM_IN_ZERO_PREFIX", true);
        }
    }
}
