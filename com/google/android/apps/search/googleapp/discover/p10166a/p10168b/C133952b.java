package com.google.android.apps.search.googleapp.discover.p10166a.p10168b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.upload.ActionsUpload$refreshActionsUpload$2", mo61344c = "ActionsUpload.kt", mo61345d = "invokeSuspend", mo61346e = {50, 57})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.b */
/* compiled from: PG */
final class C133952b extends C69572j implements C69630p {

    /* renamed from: a */
    Object f364860a;

    /* renamed from: b */
    Object f364861b;

    /* renamed from: c */
    int f364862c;

    /* renamed from: d */
    final /* synthetic */ C133969d f364863d;

    /* renamed from: e */
    final /* synthetic */ boolean f364864e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133952b(C133969d dVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f364863d = dVar;
        this.f364864e = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133952b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0047 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f364862c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x0014
            java.lang.Object r0 = r8.f364860a
            java.io.Closeable r0 = (java.io.Closeable) r0
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x0012 }
            goto L_0x006f
        L_0x0012:
            r9 = move-exception
            goto L_0x0079
        L_0x0014:
            java.lang.Object r1 = r8.f364861b
            java.lang.Object r3 = r8.f364860a
            com.google.android.apps.search.googleapp.discover.a.b.d r3 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133969d) r3
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x0047 }
            goto L_0x0041
        L_0x001e:
            p5462h.C69714l.m101134b(r9)
            com.google.android.apps.search.googleapp.discover.a.b.d r9 = r8.f364863d
            boolean r1 = r8.f364864e
            java.lang.String r4 = "ActionsUpload#refreshActionsUpload"
            com.google.apps.tiktok.tracing.bi r4 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r4)
            com.google.android.apps.search.googleapp.discover.a.b.g r5 = r9.f364897b     // Catch:{ all -> 0x0045 }
            long r6 = r9.f364901f     // Catch:{ all -> 0x0045 }
            int r7 = (int) r6     // Catch:{ all -> 0x0045 }
            h.a.am r6 = p5462h.p5463a.C69496am.f185918a     // Catch:{ all -> 0x0045 }
            r8.f364860a = r9     // Catch:{ all -> 0x0045 }
            r8.f364861b = r4     // Catch:{ all -> 0x0045 }
            r8.f364862c = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r5.mo111481b(r7, r6, r1, r8)     // Catch:{ all -> 0x0045 }
            if (r1 == r0) goto L_0x0044
            r3 = r9
            r9 = r1
            r1 = r4
        L_0x0041:
            com.google.bv.e.b.c.a.w r9 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w) r9     // Catch:{ all -> 0x0047 }
            goto L_0x0072
        L_0x0044:
            return r0
        L_0x0045:
            r3 = r9
            r1 = r4
        L_0x0047:
            com.google.common.f.e r9 = com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133969d.f364896a     // Catch:{ all -> 0x0077 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ all -> 0x0077 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x0077 }
            java.lang.String r4 = "Returning previous token due to failed action upload."
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x0077 }
            r6 = 40204(0x9d0c, float:5.6338E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x0077 }
            r9.mo56379ah(r5)     // Catch:{ all -> 0x0077 }
            r9.mo56386p(r4)     // Catch:{ all -> 0x0077 }
            com.google.android.apps.search.googleapp.discover.a.b.a.g r9 = r3.f364898c     // Catch:{ all -> 0x0077 }
            r8.f364860a = r1     // Catch:{ all -> 0x0077 }
            r8.f364861b = r2     // Catch:{ all -> 0x0077 }
            r3 = 2
            r8.f364862c = r3     // Catch:{ all -> 0x0077 }
            java.lang.Object r9 = r9.mo111467a(r8)     // Catch:{ all -> 0x0077 }
            if (r9 == r0) goto L_0x0076
            r0 = r1
        L_0x006f:
            com.google.bv.e.b.c.a.w r9 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w) r9     // Catch:{ all -> 0x0012 }
            r1 = r0
        L_0x0072:
            p5462h.p5472e.C69598b.m101013a(r1, r2)
            return r9
        L_0x0076:
            return r0
        L_0x0077:
            r9 = move-exception
            r0 = r1
        L_0x0079:
            throw r9     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133952b.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133952b(this.f364863d, this.f364864e, gVar);
    }
}
