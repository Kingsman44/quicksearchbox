package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f;
import com.google.android.apps.search.googleapp.discover.p10214s.C134548am;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57051b;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.PersistentSessionStore$commitNewSession$2", mo61344c = "PersistentSessionStore.kt", mo61345d = "invokeSuspend", mo61346e = {154})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.an */
/* compiled from: PG */
final class C135142an extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368086a;

    /* renamed from: b */
    int f368087b;

    /* renamed from: c */
    final /* synthetic */ C135157bb f368088c;

    /* renamed from: d */
    final /* synthetic */ List f368089d;

    /* renamed from: e */
    final /* synthetic */ String f368090e;

    /* renamed from: f */
    final /* synthetic */ C60218r f368091f;

    /* renamed from: g */
    final /* synthetic */ C57051b f368092g;

    /* renamed from: h */
    final /* synthetic */ C134548am f368093h;

    /* renamed from: i */
    final /* synthetic */ C134555at f368094i;

    /* renamed from: j */
    final /* synthetic */ C134500f f368095j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135142an(C135157bb bbVar, List list, String str, C60218r rVar, C57051b bVar, C134548am amVar, C134555at atVar, C134500f fVar, C69577g gVar) {
        super(2, gVar);
        this.f368088c = bbVar;
        this.f368089d = list;
        this.f368090e = str;
        this.f368091f = rVar;
        this.f368092g = bVar;
        this.f368093h = amVar;
        this.f368094i = atVar;
        this.f368095j = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135142an) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f368087b
            if (r1 == 0) goto L_0x000e
            java.lang.Object r0 = r13.f368086a
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x000c }
            goto L_0x003b
        L_0x000c:
            r14 = move-exception
            goto L_0x0047
        L_0x000e:
            p5462h.C69714l.m101134b(r14)
            com.google.android.apps.search.googleapp.discover.v.bb r3 = r13.f368088c
            java.util.List r2 = r13.f368089d
            java.lang.String r4 = r13.f368090e
            com.google.common.o.l.r r5 = r13.f368091f
            com.google.bv.e.b r6 = r13.f368092g
            com.google.android.apps.search.googleapp.discover.s.am r7 = r13.f368093h
            com.google.android.apps.search.googleapp.discover.s.at r8 = r13.f368094i
            com.google.android.apps.search.googleapp.discover.p.c.f r9 = r13.f368095j
            java.lang.String r14 = "SessionStore#commit"
            com.google.apps.tiktok.tracing.bi r14 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r14)
            com.google.android.apps.search.googleapp.discover.v.ab r10 = r3.f368136b     // Catch:{ all -> 0x0043 }
            com.google.android.apps.search.googleapp.discover.v.am r11 = new com.google.android.apps.search.googleapp.discover.v.am     // Catch:{ all -> 0x0043 }
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0043 }
            r13.f368086a = r14     // Catch:{ all -> 0x0043 }
            r1 = 1
            r13.f368087b = r1     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r10.mo112130b(r11, r13)     // Catch:{ all -> 0x0043 }
            if (r1 == r0) goto L_0x0042
            r0 = r14
        L_0x003b:
            r14 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r14)
            h.q r14 = p5462h.C69788q.f186170a
            return r14
        L_0x0042:
            return r0
        L_0x0043:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
        L_0x0047:
            throw r14     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10244v.C135142an.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135142an(this.f368088c, this.f368089d, this.f368090e, this.f368091f, this.f368092g, this.f368093h, this.f368094i, this.f368095j, gVar);
    }
}
