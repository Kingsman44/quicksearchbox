package com.google.android.apps.search.googleapp.discover.p10248y;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.RenderableStreamDataSource$loadXUiKitLibAndFonts$2$4", mo61344c = "RenderableStreamDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {227})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.aw */
/* compiled from: PG */
final class C135235aw extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368379a;

    /* renamed from: b */
    int f368380b;

    /* renamed from: c */
    final /* synthetic */ C135241bb f368381c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135235aw(C135241bb bbVar, C69577g gVar) {
        super(2, gVar);
        this.f368381c = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135235aw) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r4.f368380b
            if (r1 == 0) goto L_0x0010
            java.lang.Object r0 = r4.f368379a
            p5462h.C69714l.m101134b(r5)     // Catch:{ Exception -> 0x000e }
            goto L_0x005d
        L_0x000c:
            r5 = move-exception
            goto L_0x0064
        L_0x000e:
            r5 = move-exception
            goto L_0x003f
        L_0x0010:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.googleapp.discover.y.bb r5 = r4.f368381c
            java.lang.String r1 = "RSDS.loadGoogleSansMedium"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)
            com.google.android.libraries.search.rendering.xuikit.d.a.b r5 = r5.f368411n     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            com.google.android.libraries.search.rendering.xuikit.d.k.b r5 = r5.mo32555p()     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            java.lang.String r2 = "google-sans-medium"
            com.google.common.util.concurrent.cx r5 = r5.mo42456c(r2)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            java.lang.String r2 = "xUiKit.cachingTypefacePr…ace(\"google-sans-medium\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r4.f368379a = r1     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r2 = 1
            r4.f368380b = r2     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r4)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            if (r5 == r0) goto L_0x0039
            r0 = r1
            goto L_0x005d
        L_0x0039:
            return r0
        L_0x003a:
            r5 = move-exception
            r0 = r1
            goto L_0x0064
        L_0x003d:
            r5 = move-exception
            r0 = r1
        L_0x003f:
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.discover.p10248y.C135241bb.f368398a     // Catch:{ all -> 0x000c }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x000c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x000c }
            com.google.common.f.x r5 = r1.mo56382g(r5)     // Catch:{ all -> 0x000c }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x000c }
            java.lang.String r1 = "Error loading Google Sans"
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x000c }
            r3 = 40434(0x9df2, float:5.666E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x000c }
            r5.mo56379ah(r2)     // Catch:{ all -> 0x000c }
            r5.mo56386p(r1)     // Catch:{ all -> 0x000c }
        L_0x005d:
            r5 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r5)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x0064:
            throw r5     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10248y.C135235aw.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135235aw(this.f368381c, gVar);
    }
}
