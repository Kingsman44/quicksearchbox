package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.SessionManager$maybeResetMainFeedManagers$2", mo61344c = "SessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {65, 66, 67})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.bm */
/* compiled from: PG */
final class C135168bm extends C69572j implements C69630p {

    /* renamed from: a */
    int f368180a;

    /* renamed from: b */
    final /* synthetic */ C134755f f368181b;

    /* renamed from: c */
    final /* synthetic */ C135171bp f368182c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135168bm(C134755f fVar, C135171bp bpVar, C69577g gVar) {
        super(2, gVar);
        this.f368181b = fVar;
        this.f368182c = bpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135168bm) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r5.mo112151b(r4) != r0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r4) != r0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r5.mo112278b(r4) == r0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r4.f368180a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 == r3) goto L_0x0014
            if (r1 == r2) goto L_0x0010
            p5462h.C69714l.m101134b(r5)
            goto L_0x005a
        L_0x0010:
            p5462h.C69714l.m101134b(r5)
            goto L_0x004c
        L_0x0014:
            p5462h.C69714l.m101134b(r5)
            goto L_0x002d
        L_0x0018:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.googleapp.discover.streamui.h.f r5 = r4.f368181b
            boolean r5 = r5 instanceof com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c
            if (r5 == 0) goto L_0x005a
            com.google.android.apps.search.googleapp.discover.v.bp r5 = r4.f368182c
            com.google.android.apps.search.googleapp.discover.v.ca r5 = r5.f368193c
            r4.f368180a = r3
            java.lang.Object r5 = r5.mo112151b(r4)
            if (r5 == r0) goto L_0x0059
        L_0x002d:
            com.google.android.apps.search.googleapp.discover.v.bp r5 = r4.f368182c
            com.google.android.apps.search.googleapp.discover.z.b.d r5 = r5.f368195e
            com.google.android.libraries.storage.protostore.ab r1 = r5.f368681a
            com.google.android.apps.search.googleapp.discover.z.b.c r3 = com.google.android.apps.search.googleapp.discover.p10249z.p10251b.C135323c.f368680a
            java.util.concurrent.Executor r5 = r5.f368682b
            com.google.common.util.concurrent.cx r5 = r1.mo46039a(r3, r5)
            com.google.apps.tiktok.tracing.contrib.b.f r5 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r5)
            java.lang.String r1 = "featureExpirationLoggingManager.reset()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)
            r4.f368180a = r2
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r4)
            if (r5 == r0) goto L_0x0059
        L_0x004c:
            com.google.android.apps.search.googleapp.discover.v.bp r5 = r4.f368182c
            com.google.android.apps.search.googleapp.discover.z.c.f r5 = r5.f368194d
            r1 = 3
            r4.f368180a = r1
            java.lang.Object r5 = r5.mo112278b(r4)
            if (r5 != r0) goto L_0x005a
        L_0x0059:
            return r0
        L_0x005a:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135168bm.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135168bm(this.f368181b, this.f368182c, gVar);
    }
}
