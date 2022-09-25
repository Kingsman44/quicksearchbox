package com.google.android.libraries.web.webview.p3480e;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.callbacks.WebViewLocalAssetsManager$assetInfos$1", mo61344c = "WebViewLocalAssetsManager.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.libraries.web.webview.e.b */
/* compiled from: PG */
final class C44403b extends C69572j implements C69626l {

    /* renamed from: a */
    Object f115429a;

    /* renamed from: b */
    Object f115430b;

    /* renamed from: c */
    Object f115431c;

    /* renamed from: d */
    Object f115432d;

    /* renamed from: e */
    int f115433e;

    /* renamed from: f */
    final /* synthetic */ C44407f f115434f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44403b(C44407f fVar, C69577g gVar) {
        super(1, gVar);
        this.f115434f = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C44403b(this.f115434f, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.google.android.libraries.web.webview.e.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f115433e
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r7.f115432d
            java.lang.Object r2 = r7.f115431c
            java.lang.Object r3 = r7.f115430b
            java.lang.Object r4 = r7.f115429a
            p5462h.C69714l.m101134b(r8)
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r7
            goto L_0x007d
        L_0x0018:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.web.webview.e.f r8 = r7.f115434f
            com.google.android.libraries.web.base.t r8 = r8.f115443b
            com.google.android.libraries.web.base.WebConfig r8 = r8.mo46384b()
            java.util.List r8 = r8.f112977p
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x002e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r8.next()
            boolean r3 = r2 instanceof com.google.android.libraries.web.localassets.AccountStorageWebDirectory
            if (r3 == 0) goto L_0x002e
            r1.add(r2)
            goto L_0x002e
        L_0x0040:
            com.google.android.libraries.web.webview.e.f r8 = r7.f115434f
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p5462h.p5463a.C69540x.m100804k(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r4 = r8
            r8 = r7
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x0056:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0089
            java.lang.Object r3 = r2.next()
            com.google.android.libraries.web.localassets.AccountStorageWebDirectory r3 = (com.google.android.libraries.web.localassets.AccountStorageWebDirectory) r3
            r8.f115429a = r4
            r8.f115430b = r1
            r8.f115431c = r2
            r8.f115432d = r1
            r5 = 1
            r8.f115433e = r5
            r5 = r4
            com.google.android.libraries.web.webview.e.f r5 = (com.google.android.libraries.web.webview.p3480e.C44407f) r5
            java.lang.Object r3 = r5.mo47298b(r3, r8)
            if (r3 == r0) goto L_0x0088
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r8
            r8 = r3
            r3 = r2
        L_0x007d:
            com.google.android.libraries.web.webview.e.a r8 = (com.google.android.libraries.web.webview.p3480e.C44402a) r8
            r2.add(r8)
            r8 = r0
            r0 = r1
            r1 = r3
            r2 = r4
            r4 = r5
            goto L_0x0056
        L_0x0088:
            return r0
        L_0x0089:
            java.util.List r8 = p5462h.p5463a.C69540x.m100840V(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3480e.C44403b.mo5193b(java.lang.Object):java.lang.Object");
    }
}
