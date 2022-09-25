package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.StreamProvider$getSubtree$2", mo61344c = "StreamProvider.kt", mo61345d = "invokeSuspend", mo61346e = {126})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.al */
/* compiled from: PG */
public final class C135305al extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368605a;

    /* renamed from: b */
    int f368606b;

    /* renamed from: c */
    final /* synthetic */ C135314au f368607c;

    /* renamed from: d */
    final /* synthetic */ C134766q f368608d;

    /* renamed from: e */
    final /* synthetic */ String f368609e;

    /* renamed from: f */
    final /* synthetic */ String f368610f;

    /* renamed from: g */
    final /* synthetic */ int f368611g;

    /* renamed from: h */
    final /* synthetic */ C135327ba f368612h;

    /* renamed from: i */
    final /* synthetic */ Instant f368613i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135305al(C135314au auVar, C134766q qVar, String str, String str2, int i, C135327ba baVar, Instant instant, C69577g gVar) {
        super(2, gVar);
        this.f368607c = auVar;
        this.f368608d = qVar;
        this.f368609e = str;
        this.f368610f = str2;
        this.f368611g = i;
        this.f368612h = baVar;
        this.f368613i = instant;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135305al) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f368606b
            if (r1 == 0) goto L_0x0010
            java.lang.Object r0 = r13.f368605a
            p5462h.C69714l.m101134b(r14)     // Catch:{ bt -> 0x000e }
            goto L_0x003c
        L_0x000c:
            r14 = move-exception
            goto L_0x004d
        L_0x000e:
            r14 = move-exception
            goto L_0x0047
        L_0x0010:
            p5462h.C69714l.m101134b(r14)
            com.google.android.apps.search.googleapp.discover.z.au r14 = r13.f368607c
            com.google.android.apps.search.googleapp.discover.streamui.h.q r10 = r13.f368608d
            java.lang.String r3 = r13.f368609e
            java.lang.String r4 = r13.f368610f
            int r5 = r13.f368611g
            com.google.android.apps.search.googleapp.discover.z.ba r6 = r13.f368612h
            j$.time.Instant r7 = r13.f368613i
            java.lang.String r1 = "StreamProvider#getSubtree"
            com.google.apps.tiktok.tracing.bi r11 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            com.google.android.apps.search.googleapp.discover.z.ak r12 = new com.google.android.apps.search.googleapp.discover.z.ak     // Catch:{ bt -> 0x0045, all -> 0x0042 }
            r9 = 0
            r1 = r12
            r2 = r14
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ bt -> 0x0045, all -> 0x0042 }
            r13.f368605a = r11     // Catch:{ bt -> 0x0045, all -> 0x0042 }
            r1 = 1
            r13.f368606b = r1     // Catch:{ bt -> 0x0045, all -> 0x0042 }
            java.lang.Object r14 = r14.mo112254c(r10, r12, r13)     // Catch:{ bt -> 0x0045, all -> 0x0042 }
            if (r14 == r0) goto L_0x0041
            r0 = r11
        L_0x003c:
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            return r14
        L_0x0041:
            return r0
        L_0x0042:
            r14 = move-exception
            r0 = r11
            goto L_0x004d
        L_0x0045:
            r14 = move-exception
            r0 = r11
        L_0x0047:
            com.google.android.apps.search.googleapp.discover.z.a.f r1 = new com.google.android.apps.search.googleapp.discover.z.a.f     // Catch:{ all -> 0x000c }
            r1.<init>(r14)     // Catch:{ all -> 0x000c }
            throw r1     // Catch:{ all -> 0x000c }
        L_0x004d:
            throw r14     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r14)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10249z.C135305al.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135305al(this.f368607c, this.f368608d, this.f368609e, this.f368610f, this.f368611g, this.f368612h, this.f368613i, gVar);
    }
}
