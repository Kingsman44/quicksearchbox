package com.google.android.apps.search.googleapp.discover.channels;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.channels.ChannelsDataService$updateFollowedState$2$cacheUpdate$1", mo61344c = "ChannelsDataService.kt", mo61345d = "invokeSuspend", mo61346e = {87, 89, 92})
/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ay */
/* compiled from: PG */
final class C134136ay extends C69572j implements C69630p {

    /* renamed from: a */
    int f365395a;

    /* renamed from: b */
    final /* synthetic */ C71604be f365396b;

    /* renamed from: c */
    final /* synthetic */ C134139ba f365397c;

    /* renamed from: d */
    final /* synthetic */ C134150bl f365398d;

    /* renamed from: e */
    final /* synthetic */ C69626l f365399e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134136ay(C71604be beVar, C134139ba baVar, C134150bl blVar, C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f365396b = beVar;
        this.f365397c = baVar;
        this.f365398d = blVar;
        this.f365399e = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134136ay) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r5 != r0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r5.mo62825a(r4) != r0) goto L_0x0025;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r4.f365395a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 == r3) goto L_0x0014
            if (r1 == r2) goto L_0x0010
            p5462h.C69714l.m101134b(r5)
            goto L_0x0069
        L_0x0010:
            p5462h.C69714l.m101134b(r5)
            goto L_0x003c
        L_0x0014:
            p5462h.C69714l.m101134b(r5)
            goto L_0x0025
        L_0x0018:
            p5462h.C69714l.m101134b(r5)
            kotlinx.coroutines.be r5 = r4.f365396b
            r4.f365395a = r3
            java.lang.Object r5 = r5.mo62825a(r4)
            if (r5 == r0) goto L_0x006c
        L_0x0025:
            com.google.android.apps.search.googleapp.discover.channels.ba r5 = r4.f365397c
            com.google.apps.tiktok.cache.v r5 = r5.f365408a
            com.google.android.apps.search.googleapp.discover.channels.bl r1 = r4.f365398d
            com.google.common.util.concurrent.cx r5 = r5.mo50345e(r1)
            java.lang.String r1 = "cache.getIfPresent(clientChannelLookup)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)
            r4.f365395a = r2
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r4)
            if (r5 == r0) goto L_0x006c
        L_0x003c:
            com.google.common.base.ax r5 = (com.google.common.base.C58833ax) r5
            boolean r1 = r5.mo56113h()
            if (r1 == 0) goto L_0x0069
            h.f.a.l r1 = r4.f365399e
            java.lang.Object r5 = r5.mo56107c()
            com.google.apps.tiktok.cache.ah r5 = (com.google.apps.tiktok.cache.C46370ah) r5
            java.lang.Object r5 = r5.f121384a
            java.lang.String r2 = "storedChannelResult.get().value()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            java.lang.Object r5 = r1.mo5761a(r5)
            com.google.android.apps.search.googleapp.discover.channels.bf r5 = (com.google.android.apps.search.googleapp.discover.channels.C134144bf) r5
            com.google.android.apps.search.googleapp.discover.channels.ba r1 = r4.f365397c
            com.google.android.apps.search.googleapp.discover.channels.aq r1 = r1.f365414g
            com.google.android.apps.search.googleapp.discover.channels.bl r2 = r4.f365398d
            r3 = 3
            r4.f365395a = r3
            java.lang.Object r5 = r1.mo111576a(r2, r5, r4)
            if (r5 != r0) goto L_0x0069
            return r0
        L_0x0069:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.channels.C134136ay.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134136ay(this.f365396b, this.f365397c, this.f365398d, this.f365399e, gVar);
    }
}
