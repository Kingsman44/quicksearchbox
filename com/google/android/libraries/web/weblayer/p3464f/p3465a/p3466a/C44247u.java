package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.web.base.p3348b.p3351c.C43246b;
import com.google.android.libraries.web.profile.p3431a.C44051c;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.u */
/* compiled from: PG */
public final class C44247u implements C44051c {

    /* renamed from: a */
    public final C44315a f115078a;

    /* renamed from: b */
    public final C69585o f115079b;

    /* renamed from: c */
    private final C71422aw f115080c;

    /* renamed from: d */
    private final C69626l f115081d;

    public C44247u(C69626l lVar, C44315a aVar, C43246b bVar, C71788b bVar2, C42876ab abVar, C71548cy cyVar, C69585o oVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "webLayerWrapper");
        C69664n.m101061g(bVar, "accountScopedRequestRequirements");
        C69664n.m101061g(bVar2, "lazyCookiesMutex");
        C69664n.m101061g(abVar, "lazyCookiesProtoDataStore");
        C69664n.m101061g(cyVar, "areLazyCookiesFlushedMutableFlow");
        C69664n.m101061g(oVar, "mainImmediateContext");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f115078a = aVar;
        this.f115079b = oVar;
        this.f115080c = awVar;
        this.f115081d = new C59425c(lVar);
    }

    /* renamed from: a */
    public final C60870cx mo47012a(String str) {
        C69664n.m101061g(str, "url");
        return C71663i.m104692e(this.f115080c, C71424ay.UNDISPATCHED, new C44237k(this, str, (C69577g) null), 1);
    }

    /* renamed from: b */
    public final C60870cx mo47013b(String str, String str2) {
        C69664n.m101061g(str, "url");
        C69664n.m101061g(str2, "cookie");
        return C71663i.m104692e(this.f115080c, C71424ay.UNDISPATCHED, new C44238l(this, str, str2, (C69577g) null), 1);
    }

    /* renamed from: c */
    public final C60870cx mo47014c(String str, Iterable iterable) {
        C69664n.m101061g(str, "url");
        C69664n.m101061g(iterable, "cookies");
        return C71663i.m104692e(this.f115080c, C71424ay.UNDISPATCHED, new C44239m(this, str, iterable, (C69577g) null), 1);
    }

    /* renamed from: d */
    public final Object mo47015d(String str, C69577g gVar) {
        return mo47161f(new C44236j(str, (C69577g) null), gVar);
    }

    /* renamed from: e */
    public final Object mo47016e(String str, Iterable iterable, C69577g gVar) {
        Object f = mo47161f(new C44242p(str, iterable, this, (C69577g) null), gVar);
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (f != aVar) {
            f = C69788q.f186170a;
        }
        return f == aVar ? f : C69788q.f186170a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: h.f.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: h.f.a.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:18:0x0062, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47161f(p5462h.p5473f.p5474a.C69630p r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a.C44244r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.web.weblayer.f.a.a.r r0 = (com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a.C44244r) r0
            int r1 = r0.f115071e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115071e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.weblayer.f.a.a.r r0 = new com.google.android.libraries.web.weblayer.f.a.a.r
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f115069c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f115071e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0065
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            java.lang.Object r8 = r0.f115068b
            java.lang.Object r2 = r0.f115067a
            p5462h.C69714l.m101134b(r9)
            goto L_0x004c
        L_0x003a:
            p5462h.C69714l.m101134b(r9)
            h.f.a.l r9 = r7.f115081d
            r0.f115067a = r7
            r0.f115068b = r8
            r0.f115071e = r4
            java.lang.Object r9 = r9.mo5761a(r0)
            if (r9 == r1) goto L_0x0066
            r2 = r7
        L_0x004c:
            com.google.android.libraries.web.profile.Profile r9 = (com.google.android.libraries.web.profile.Profile) r9
            com.google.android.libraries.web.weblayer.f.a.a.u r2 = (com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a.C44247u) r2
            h.c.o r4 = r2.f115079b
            com.google.android.libraries.web.weblayer.f.a.a.t r5 = new com.google.android.libraries.web.weblayer.f.a.a.t
            r6 = 0
            r5.<init>(r8, r2, r9, r6)
            r0.f115067a = r6
            r0.f115068b = r6
            r0.f115071e = r3
            java.lang.Object r9 = kotlinx.coroutines.C71803m.m105040a(r4, r5, r0)
            if (r9 != r1) goto L_0x0065
            return r1
        L_0x0065:
            return r9
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a.C44247u.mo47161f(h.f.a.p, h.c.g):java.lang.Object");
    }
}
