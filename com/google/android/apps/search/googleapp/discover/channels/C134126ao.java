package com.google.android.apps.search.googleapp.discover.channels;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.channels.ChannelsCacheUpdater$updateLocally$2", mo61344c = "ChannelsCacheUpdater.kt", mo61345d = "invokeSuspend", mo61346e = {44})
/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ao */
/* compiled from: PG */
final class C134126ao extends C69572j implements C69630p {

    /* renamed from: a */
    Object f365364a;

    /* renamed from: b */
    Object f365365b;

    /* renamed from: c */
    Object f365366c;

    /* renamed from: d */
    int f365367d;

    /* renamed from: e */
    final /* synthetic */ C134128aq f365368e;

    /* renamed from: f */
    final /* synthetic */ C134150bl f365369f;

    /* renamed from: g */
    final /* synthetic */ C134144bf f365370g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134126ao(C134128aq aqVar, C134150bl blVar, C134144bf bfVar, C69577g gVar) {
        super(2, gVar);
        this.f365368e = aqVar;
        this.f365369f = blVar;
        this.f365370g = bfVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134126ao) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.google.android.apps.search.googleapp.discover.channels.aq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.google.android.apps.search.googleapp.discover.channels.aq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.google.android.apps.search.googleapp.discover.channels.aq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "/persistent/follows/"
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r8.f365367d
            r3 = 1
            if (r2 == 0) goto L_0x0016
            java.lang.Object r1 = r8.f365366c
            java.lang.Object r2 = r8.f365365b
            java.lang.Object r4 = r8.f365364a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x0013 }
            goto L_0x0043
        L_0x0013:
            r9 = move-exception
            goto L_0x00ad
        L_0x0016:
            p5462h.C69714l.m101134b(r9)
            com.google.android.apps.search.googleapp.discover.channels.aq r4 = r8.f365368e
            com.google.android.apps.search.googleapp.discover.channels.bl r9 = r8.f365369f
            com.google.android.apps.search.googleapp.discover.channels.bf r2 = r8.f365370g
            java.lang.String r5 = "ChannelsCacheUpdater#updateLocally"
            com.google.apps.tiktok.tracing.bi r5 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r5)
            com.google.apps.tiktok.cache.v r6 = r4.f365375a     // Catch:{ all -> 0x00ab }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r2)     // Catch:{ all -> 0x00ab }
            com.google.common.util.concurrent.cx r9 = r6.mo50346f(r9, r7)     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = "cache.put(clientChannelL…ateFuture(clientChannel))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r6)     // Catch:{ all -> 0x00ab }
            r8.f365364a = r4     // Catch:{ all -> 0x00ab }
            r8.f365365b = r2     // Catch:{ all -> 0x00ab }
            r8.f365366c = r5     // Catch:{ all -> 0x00ab }
            r8.f365367d = r3     // Catch:{ all -> 0x00ab }
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r8)     // Catch:{ all -> 0x00ab }
            if (r9 == r1) goto L_0x00aa
            r1 = r5
        L_0x0043:
            r9 = r4
            com.google.android.apps.search.googleapp.discover.channels.aq r9 = (com.google.android.apps.search.googleapp.discover.channels.C134128aq) r9     // Catch:{ all -> 0x0013 }
            boolean r9 = r9.f365377c     // Catch:{ all -> 0x0013 }
            if (r9 == 0) goto L_0x00a3
            com.google.android.apps.search.googleapp.discover.channels.aq r4 = (com.google.android.apps.search.googleapp.discover.channels.C134128aq) r4     // Catch:{ all -> 0x0013 }
            com.google.android.libraries.elements.interfaces.ab r9 = r4.f365376b     // Catch:{ all -> 0x0013 }
            r4 = r2
            com.google.android.apps.search.googleapp.discover.channels.bf r4 = (com.google.android.apps.search.googleapp.discover.channels.C134144bf) r4     // Catch:{ all -> 0x0013 }
            java.lang.String r4 = r4.f365419b     // Catch:{ all -> 0x0013 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0013 }
            r5.<init>(r0)     // Catch:{ all -> 0x0013 }
            r5.append(r4)     // Catch:{ all -> 0x0013 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0013 }
            com.google.bv.e.b.b.b.aj r4 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57126aj.f152491c     // Catch:{ all -> 0x0013 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0013 }
            com.google.bv.e.b.b.b.ag r4 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57123ag) r4     // Catch:{ all -> 0x0013 }
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ all -> 0x0013 }
            java.lang.String r5 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)     // Catch:{ all -> 0x0013 }
            com.google.android.apps.search.googleapp.discover.channels.bf r2 = (com.google.android.apps.search.googleapp.discover.channels.C134144bf) r2     // Catch:{ all -> 0x0013 }
            boolean r2 = r2.f365423f     // Catch:{ all -> 0x0013 }
            if (r2 == 0) goto L_0x007a
            com.google.bv.e.b.b.b.ai r2 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57125ai.FOLLOWED     // Catch:{ all -> 0x0013 }
            goto L_0x007c
        L_0x007a:
            com.google.bv.e.b.b.b.ai r2 = com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57125ai.NOT_FOLLOWED     // Catch:{ all -> 0x0013 }
        L_0x007c:
            java.lang.String r5 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)     // Catch:{ all -> 0x0013 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0013 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x0013 }
            com.google.bv.e.b.b.b.aj r5 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57126aj) r5     // Catch:{ all -> 0x0013 }
            int r2 = r2.f152490e     // Catch:{ all -> 0x0013 }
            r5.f152494b = r2     // Catch:{ all -> 0x0013 }
            int r2 = r5.f152493a     // Catch:{ all -> 0x0013 }
            r2 = r2 | r3
            r5.f152493a = r2     // Catch:{ all -> 0x0013 }
            com.google.protobuf.bv r2 = r4.build()     // Catch:{ all -> 0x0013 }
            java.lang.String r3 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x0013 }
            com.google.bv.e.b.b.b.aj r2 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57126aj) r2     // Catch:{ all -> 0x0013 }
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x0013 }
            r9.mo26140c(r0, r2)     // Catch:{ all -> 0x0013 }
        L_0x00a3:
            r9 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r9)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00aa:
            return r1
        L_0x00ab:
            r9 = move-exception
            r1 = r5
        L_0x00ad:
            throw r9     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.channels.C134126ao.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134126ao(this.f365368e, this.f365369f, this.f365370g, gVar);
    }
}
