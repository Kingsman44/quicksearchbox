package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.notifications.platform.internal.gms.auth.impl.GnpAuthManagerImpl$forceRefreshToken$2$1", mo61344c = "GnpAuthManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.a.d */
/* compiled from: PG */
final class C30106d extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C30107e f81445a;

    /* renamed from: b */
    final /* synthetic */ C30103a f81446b;

    /* renamed from: c */
    private /* synthetic */ Object f81447c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30106d(C30107e eVar, C30103a aVar, C69577g gVar) {
        super(2, gVar);
        this.f81445a = eVar;
        this.f81446b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C30106d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0059, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        r2 = p5462h.C69714l.m101133a(r9);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f81447c
            kotlinx.coroutines.aw r9 = (kotlinx.coroutines.C71422aw) r9
            com.google.android.libraries.notifications.platform.f.a.a.a.e r9 = r8.f81445a
            com.google.android.libraries.notifications.platform.f.a.a.a.a r0 = r8.f81446b
            java.util.Map r1 = r9.f81450a     // Catch:{ all -> 0x0048 }
            monitor-enter(r1)     // Catch:{ all -> 0x0048 }
            com.google.android.libraries.notifications.platform.f.a.a.a.b r2 = r9.mo35500e(r0)     // Catch:{ all -> 0x0045 }
            r9.mo35501f(r2)     // Catch:{ all -> 0x0045 }
            com.google.android.libraries.notifications.platform.f.a.a.a.b r2 = r9.mo35499d(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "GnpGoogleAuthUtilImpl"
            java.lang.String r4 = "Refreshed oauth token for [%s, %s] expiration %s"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0045 }
            android.accounts.Account r6 = r0.f81437a     // Catch:{ all -> 0x0045 }
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = r0.f81438b     // Catch:{ all -> 0x0045 }
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x0045 }
            java.lang.Long r6 = r2.f81441c     // Catch:{ all -> 0x0045 }
            r7 = 2
            r5[r7] = r6     // Catch:{ all -> 0x0045 }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55789a(r3, r4, r5)     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            java.util.Map r1 = r9.f81451b     // Catch:{ all -> 0x0059 }
            monitor-enter(r1)     // Catch:{ all -> 0x0059 }
            java.util.Map r9 = r9.f81451b     // Catch:{ all -> 0x0042 }
            java.lang.Object r9 = r9.remove(r0)     // Catch:{ all -> 0x0042 }
            kotlinx.coroutines.be r9 = (kotlinx.coroutines.C71604be) r9     // Catch:{ all -> 0x0042 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            goto L_0x005e
        L_0x0042:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r9     // Catch:{ all -> 0x0059 }
        L_0x0045:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            java.util.Map r2 = r9.f81451b     // Catch:{ all -> 0x0059 }
            monitor-enter(r2)     // Catch:{ all -> 0x0059 }
            java.util.Map r9 = r9.f81451b     // Catch:{ all -> 0x0056 }
            java.lang.Object r9 = r9.remove(r0)     // Catch:{ all -> 0x0056 }
            kotlinx.coroutines.be r9 = (kotlinx.coroutines.C71604be) r9     // Catch:{ all -> 0x0056 }
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0056:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            throw r9     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r9 = move-exception
            java.lang.Object r2 = p5462h.C69714l.m101133a(r9)
        L_0x005e:
            h.k r9 = new h.k
            r9.<init>(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a.C30106d.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C30106d dVar = new C30106d(this.f81445a, this.f81446b, gVar);
        dVar.f81447c = obj;
        return dVar;
    }
}
