package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$isEligibleForBackgroundRefreshReplacement$2", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {187})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.p */
/* compiled from: PG */
public final class C135196p extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368273a;

    /* renamed from: b */
    int f368274b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368275c;

    /* renamed from: d */
    final /* synthetic */ C135200t f368276d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135196p(C134755f fVar, C135200t tVar, C69577g gVar) {
        super(2, gVar);
        this.f368275c = fVar;
        this.f368276d = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135196p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (p3186j$.time.Duration.between(r5, r0.f368198a.mo57444a()).compareTo(r0.f368199b) > 0) goto L_0x0039;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r4.f368274b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x000e
            java.lang.Object r0 = r4.f368273a
            p5462h.C69714l.m101134b(r5)
            goto L_0x002d
        L_0x000e:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.googleapp.discover.streamui.h.f r5 = r4.f368275c
            boolean r5 = r5 instanceof com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c
            if (r5 != 0) goto L_0x001c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x001c:
            com.google.android.apps.search.googleapp.discover.v.t r5 = r4.f368276d
            com.google.android.apps.search.googleapp.discover.v.bq r1 = r5.f368292f
            com.google.android.apps.search.googleapp.discover.v.ca r5 = r5.f368288b
            r4.f368273a = r1
            r4.f368274b = r3
            java.lang.Object r5 = r5.mo112150a(r4)
            if (r5 == r0) goto L_0x0055
            r0 = r1
        L_0x002d:
            com.google.android.apps.search.googleapp.discover.s.bo r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134577bo) r5
            if (r5 == 0) goto L_0x0036
            j$.time.Instant r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134582bt.m218299a(r5)
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            if (r5 != 0) goto L_0x003b
        L_0x0039:
            r2 = 1
            goto L_0x0050
        L_0x003b:
            com.google.android.apps.search.googleapp.discover.v.bq r0 = (com.google.android.apps.search.googleapp.discover.p10244v.C135172bq) r0
            com.google.common.v.i r1 = r0.f368198a
            j$.time.Instant r1 = r1.mo57444a()
            j$.time.Duration r5 = p3186j$.time.Duration.between(r5, r1)
            j$.time.Duration r0 = r0.f368199b
            int r5 = r5.compareTo((p3186j$.time.Duration) r0)
            if (r5 <= 0) goto L_0x0050
            goto L_0x0039
        L_0x0050:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135196p.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135196p(this.f368275c, this.f368276d, gVar);
    }
}
