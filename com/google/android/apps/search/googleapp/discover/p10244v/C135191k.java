package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$createEphemeralSessionChange$2", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {152})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.k */
/* compiled from: PG */
final class C135191k extends C69572j implements C69630p {

    /* renamed from: a */
    int f368254a;

    /* renamed from: b */
    final /* synthetic */ C135200t f368255b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368256c;

    /* renamed from: d */
    final /* synthetic */ String f368257d;

    /* renamed from: e */
    final /* synthetic */ List f368258e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135191k(C135200t tVar, C134755f fVar, String str, List list, C69577g gVar) {
        super(2, gVar);
        this.f368255b = tVar;
        this.f368256c = fVar;
        this.f368257d = str;
        this.f368258e = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135191k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        throw new com.google.android.apps.search.googleapp.discover.p10244v.C135175bt(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f368254a
            if (r1 == 0) goto L_0x000d
            p5462h.C69714l.m101134b(r8)     // Catch:{ Exception -> 0x000a }
            goto L_0x0024
        L_0x000a:
            r8 = move-exception
            goto L_0x0096
        L_0x000d:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.googleapp.discover.v.t r8 = r7.f368255b     // Catch:{ Exception -> 0x000a }
            com.google.android.apps.search.googleapp.discover.v.bp r8 = r8.f368289c     // Catch:{ Exception -> 0x000a }
            com.google.android.apps.search.googleapp.discover.streamui.h.f r1 = r7.f368256c     // Catch:{ Exception -> 0x000a }
            com.google.android.apps.search.googleapp.discover.v.br r8 = r8.mo112140a(r1)     // Catch:{ Exception -> 0x000a }
            r1 = 1
            r7.f368254a = r1     // Catch:{ Exception -> 0x000a }
            java.lang.Object r8 = r8.mo112133b(r7)     // Catch:{ Exception -> 0x000a }
            if (r8 != r0) goto L_0x0024
            return r0
        L_0x0024:
            com.google.android.apps.search.googleapp.discover.s.au r8 = (com.google.android.apps.search.googleapp.discover.p10214s.C134556au) r8     // Catch:{ Exception -> 0x000a }
            com.google.android.apps.search.googleapp.discover.s.aw r8 = r8.f366438b     // Catch:{ Exception -> 0x000a }
            if (r8 != 0) goto L_0x002c
            com.google.android.apps.search.googleapp.discover.s.aw r8 = com.google.android.apps.search.googleapp.discover.p10214s.C134558aw.f366443h     // Catch:{ Exception -> 0x000a }
        L_0x002c:
            java.lang.String r8 = r8.f366448d     // Catch:{ Exception -> 0x000a }
            java.lang.String r0 = r7.f368257d     // Catch:{ Exception -> 0x000a }
            boolean r8 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r0)     // Catch:{ Exception -> 0x000a }
            if (r8 == 0) goto L_0x0094
            com.google.android.apps.search.googleapp.discover.v.t r8 = r7.f368255b     // Catch:{ Exception -> 0x000a }
            com.google.android.apps.search.googleapp.discover.v.b r8 = r8.f368287a     // Catch:{ Exception -> 0x000a }
            com.google.android.apps.search.googleapp.discover.streamui.h.f r0 = r7.f368256c     // Catch:{ Exception -> 0x000a }
            java.lang.String r1 = r7.f368257d     // Catch:{ Exception -> 0x000a }
            java.util.List r2 = r7.f368258e     // Catch:{ Exception -> 0x000a }
            java.lang.String r3 = "streamStorageKey"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)     // Catch:{ Exception -> 0x000a }
            java.lang.String r3 = "sessionId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)     // Catch:{ Exception -> 0x000a }
            com.google.android.apps.search.googleapp.discover.v.c r3 = new com.google.android.apps.search.googleapp.discover.v.c     // Catch:{ Exception -> 0x000a }
            com.google.common.b.gu r2 = com.google.common.p4522b.C58479go.m89810b(r2)     // Catch:{ Exception -> 0x000a }
            r3.<init>(r1, r0, r2)     // Catch:{ Exception -> 0x000a }
            java.lang.Object r0 = r8.f368128b     // Catch:{ Exception -> 0x000a }
            monitor-enter(r0)     // Catch:{ Exception -> 0x000a }
            java.lang.String r2 = r8.f368129c     // Catch:{ all -> 0x0091 }
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r2)     // Catch:{ all -> 0x0091 }
            if (r2 != 0) goto L_0x008a
            r8.f368129c = r1     // Catch:{ all -> 0x0091 }
            java.util.List r2 = r8.f368130d     // Catch:{ all -> 0x0091 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0091 }
            r4.<init>()     // Catch:{ all -> 0x0091 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0091 }
        L_0x006b:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x0084
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0091 }
            r6 = r5
            com.google.android.apps.search.googleapp.discover.v.c r6 = (com.google.android.apps.search.googleapp.discover.p10244v.C135182c) r6     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r6.f368222a     // Catch:{ all -> 0x0091 }
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r1)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x006b
            r4.add(r5)     // Catch:{ all -> 0x0091 }
            goto L_0x006b
        L_0x0084:
            java.util.List r1 = p5462h.p5463a.C69540x.m100842X(r4)     // Catch:{ all -> 0x0091 }
            r8.f368130d = r1     // Catch:{ all -> 0x0091 }
        L_0x008a:
            java.util.List r8 = r8.f368130d     // Catch:{ all -> 0x0091 }
            r8.add(r3)     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)     // Catch:{ Exception -> 0x000a }
            goto L_0x0095
        L_0x0091:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x000a }
            throw r8     // Catch:{ Exception -> 0x000a }
        L_0x0094:
            r3 = 0
        L_0x0095:
            return r3
        L_0x0096:
            com.google.android.apps.search.googleapp.discover.v.bt r0 = new com.google.android.apps.search.googleapp.discover.v.bt
            r0.<init>(r8)
            goto L_0x009d
        L_0x009c:
            throw r0
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135191k.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135191k(this.f368255b, this.f368256c, this.f368257d, this.f368258e, gVar);
    }
}
