package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import com.google.android.libraries.web.profile.p3431a.p3434b.C44042e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.internal.GaiaCookieManagerImpl$refreshCookiesIfNeeded$2", mo61344c = "GaiaCookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {470, 130})
/* renamed from: com.google.android.libraries.web.profile.a.b.a.p */
/* compiled from: PG */
final class C44028p extends C69572j implements C69630p {

    /* renamed from: a */
    Object f114613a;

    /* renamed from: b */
    Object f114614b;

    /* renamed from: c */
    Object f114615c;

    /* renamed from: d */
    int f114616d;

    /* renamed from: e */
    final /* synthetic */ C44037y f114617e;

    /* renamed from: f */
    final /* synthetic */ C44042e f114618f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44028p(C44037y yVar, C44042e eVar, C69577g gVar) {
        super(2, gVar);
        this.f114617e = yVar;
        this.f114618f = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44028p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.libraries.web.profile.a.b.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f114616d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001d
            if (r1 == r2) goto L_0x0012
            java.lang.Object r0 = r7.f114613a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0010 }
            goto L_0x0047
        L_0x0010:
            r8 = move-exception
            goto L_0x0052
        L_0x0012:
            java.lang.Object r1 = r7.f114615c
            java.lang.Object r4 = r7.f114614b
            java.lang.Object r5 = r7.f114613a
            p5462h.C69714l.m101134b(r8)
            r8 = r5
            goto L_0x0034
        L_0x001d:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.web.profile.a.b.a.y r4 = r7.f114617e
            kotlinx.coroutines.j.b r8 = r4.f114657f
            com.google.android.libraries.web.profile.a.b.e r1 = r7.f114618f
            r7.f114613a = r8
            r7.f114614b = r4
            r7.f114615c = r1
            r7.f114616d = r2
            java.lang.Object r5 = r8.mo63025b(r3, r7)
            if (r5 == r0) goto L_0x0056
        L_0x0034:
            r7.f114613a = r8     // Catch:{ all -> 0x004e }
            r7.f114614b = r3     // Catch:{ all -> 0x004e }
            r7.f114615c = r3     // Catch:{ all -> 0x004e }
            r5 = 2
            r7.f114616d = r5     // Catch:{ all -> 0x004e }
            com.google.android.libraries.web.profile.a.b.a.y r4 = (com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44037y) r4     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r4.mo47004n(r2, r1, r7)     // Catch:{ all -> 0x004e }
            if (r1 == r0) goto L_0x004d
            r0 = r8
            r8 = r1
        L_0x0047:
            com.google.android.libraries.web.profile.a.b.i r8 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44046i) r8     // Catch:{ all -> 0x0010 }
            r0.mo63026c(r3)
            return r8
        L_0x004d:
            return r0
        L_0x004e:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0052:
            r0.mo63026c(r3)
            throw r8
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44028p.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44028p(this.f114617e, this.f114618f, gVar);
    }
}
