package com.google.apps.tiktok.coroutines.p3632a;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69648ae;

/* renamed from: com.google.apps.tiktok.coroutines.a.n */
/* compiled from: PG */
final class C46636n implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71422aw f121868a;

    /* renamed from: b */
    final /* synthetic */ C71788b f121869b;

    /* renamed from: c */
    final /* synthetic */ C69648ae f121870c;

    /* renamed from: d */
    final /* synthetic */ C69631q f121871d;

    /* renamed from: e */
    final /* synthetic */ C69626l f121872e;

    /* renamed from: f */
    final /* synthetic */ List f121873f;

    /* renamed from: g */
    final /* synthetic */ C71361ao f121874g;

    public C46636n(C71422aw awVar, C71788b bVar, C69648ae aeVar, C69631q qVar, C69626l lVar, List list, C71361ao aoVar) {
        this.f121868a = awVar;
        this.f121869b = bVar;
        this.f121870c = aeVar;
        this.f121871d = qVar;
        this.f121872e = lVar;
        this.f121873f = list;
        this.f121874g = aoVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlinx.coroutines.cp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[SYNTHETIC, Splitter:B:24:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(kotlinx.coroutines.p5574b.C71587n r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof com.google.apps.tiktok.coroutines.p3632a.C46632j
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.apps.tiktok.coroutines.a.j r2 = (com.google.apps.tiktok.coroutines.p3632a.C46632j) r2
            int r3 = r2.f121840f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f121840f = r3
            goto L_0x001c
        L_0x0017:
            com.google.apps.tiktok.coroutines.a.j r2 = new com.google.apps.tiktok.coroutines.a.j
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f121838d
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f121840f
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r6) goto L_0x0032
            java.lang.Object r3 = r2.f121837c
            java.lang.Object r4 = r2.f121836b
            java.lang.Object r2 = r2.f121835a
            p5462h.C69714l.m101134b(r0)
            goto L_0x0075
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003a:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.aw r0 = r1.f121868a
            kotlinx.coroutines.ay r4 = kotlinx.coroutines.C71424ay.LAZY
            com.google.apps.tiktok.coroutines.a.m r15 = new com.google.apps.tiktok.coroutines.a.m
            kotlinx.coroutines.j.b r9 = r1.f121869b
            h.f.b.ae r10 = r1.f121870c
            h.f.a.q r11 = r1.f121871d
            h.f.a.l r12 = r1.f121872e
            java.util.List r13 = r1.f121873f
            kotlinx.coroutines.a.ao r14 = r1.f121874g
            r16 = 0
            r7 = r15
            r8 = r18
            r19 = r3
            r3 = r15
            r15 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            kotlinx.coroutines.cp r0 = kotlinx.coroutines.C71803m.m105043d(r0, r5, r4, r3, r6)
            kotlinx.coroutines.j.b r4 = r1.f121869b
            java.util.List r3 = r1.f121873f
            r2.f121835a = r0
            r2.f121836b = r4
            r2.f121837c = r3
            r2.f121840f = r6
            java.lang.Object r2 = r4.mo63025b(r5, r2)
            r7 = r19
            if (r2 == r7) goto L_0x00a5
            r2 = r0
        L_0x0075:
            int r0 = r3.size()     // Catch:{ all -> 0x00a0 }
            r7 = 2
            if (r0 > r7) goto L_0x0098
            int r0 = r3.size()     // Catch:{ all -> 0x00a0 }
            int r0 = r0 + r6
            if (r0 <= r7) goto L_0x008c
            java.lang.Object r0 = r3.remove(r6)     // Catch:{ all -> 0x00a0 }
            kotlinx.coroutines.cp r0 = (kotlinx.coroutines.C71643cp) r0     // Catch:{ all -> 0x00a0 }
            r0.mo62723u(r5)     // Catch:{ all -> 0x00a0 }
        L_0x008c:
            r3.add(r2)     // Catch:{ all -> 0x00a0 }
            r4.mo63026c(r5)
            r2.mo62876y()
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0098:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = "This Job queue has overflowed. Please report this as a bug at go/tiktok-bug"
            r0.<init>(r2)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r4.mo63026c(r5)
            throw r0
        L_0x00a5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.coroutines.p3632a.C46636n.mo20883a(kotlinx.coroutines.b.n, h.c.g):java.lang.Object");
    }
}
