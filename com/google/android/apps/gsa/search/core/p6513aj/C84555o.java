package com.google.android.apps.gsa.search.core.p6513aj;

import com.google.android.apps.gsa.search.core.google.p6794d.C85935b;
import com.google.android.apps.gsa.search.core.google.p6794d.C85936c;
import com.google.android.apps.gsa.search.core.google.p6794d.C85937d;
import com.google.android.apps.gsa.search.core.google.p6794d.C85939f;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89956x;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.C90723ag;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59337t;
import dagger.C68214a;
import java.io.Closeable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.search.core.aj.o */
/* compiled from: PG */
public final class C84555o extends C84553m implements Closeable, C85935b, C90991b {

    /* renamed from: e */
    private static final C59071e f230096e = C59071e.m91332i("com.google.android.apps.gsa.search.core.aj.o");

    /* renamed from: a */
    public final C90931ca f230097a;

    /* renamed from: b */
    public final C89956x f230098b;

    /* renamed from: c */
    public final C68214a f230099c;

    /* renamed from: d */
    public volatile Future f230100d;

    /* renamed from: f */
    private final C90723ag f230101f;

    /* renamed from: g */
    private final C85937d f230102g;

    /* renamed from: h */
    private final Object f230103h = new Object();

    /* renamed from: i */
    private boolean f230104i = false;

    /* renamed from: j */
    private C85936c f230105j;

    public C84555o(C90723ag agVar, C84551k kVar, C85937d dVar, C90931ca caVar, C89956x xVar, C68214a aVar) {
        super(kVar);
        agVar.getClass();
        this.f230101f = agVar;
        dVar.getClass();
        this.f230102g = dVar;
        caVar.getClass();
        this.f230097a = caVar;
        xVar.getClass();
        this.f230098b = xVar;
        aVar.getClass();
        this.f230099c = aVar;
    }

    /* renamed from: j */
    private final void m135238j(C90455b bVar) {
        if (!mo78285g(bVar)) {
            C89886e b = ((C89911f) this.f230099c.mo27525b()).mo83756b(bVar);
            b.f246284e = this.f230098b;
            b.mo83721a();
        }
    }

    /* renamed from: k */
    private static final void m135239k(C85939f fVar) {
        if (fVar != null) {
            C59337t.m92221a(fVar.f232360a);
        }
    }

    /* renamed from: a */
    public final void mo78287a(Exception exc) {
        if (mo78292i()) {
            throw new C90457d("ChunkProducer was stopped", exc, C89885b.GWS_CHUNK_PRODUCER_STOPPED_VALUE);
        }
    }

    /* renamed from: b */
    public final void mo78288b(String str) {
        if (mo78292i()) {
            throw new C90457d(str, (int) C89885b.GWS_CHUNK_PRODUCER_STOPPED_VALUE);
        }
    }

    /* renamed from: c */
    public final boolean mo78289c(C84552l lVar) {
        return mo78284f(lVar);
    }

    public final void close() {
        synchronized (this.f230103h) {
            this.f230104i = true;
        }
        mo78285g(new C90457d("Stream cancelled", (int) C89885b.GWS_CHUNK_PRODUCER_STOPPED_VALUE));
        Future future = this.f230100d;
        if (future != null) {
            future.cancel(true);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C85936c cVar = this.f230105j;
        if (cVar instanceof C90991b) {
            ((C90991b) cVar).mo17602gS(fVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.android.apps.gsa.search.core.google.d.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: com.google.android.apps.gsa.search.core.google.d.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.google.android.apps.gsa.search.core.google.d.f} */
    /* JADX WARNING: type inference failed for: r2v15, types: [com.google.protobuf.eb] */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.google.protobuf.eb] */
    /* JADX WARNING: type inference failed for: r2v17, types: [com.google.android.apps.gsa.search.core.google.d.c] */
    /* JADX WARNING: type inference failed for: r2v26, types: [com.google.protobuf.eb] */
    /* JADX WARNING: type inference failed for: r5v13, types: [com.google.android.apps.gsa.search.core.google.d.k] */
    /* JADX WARNING: type inference failed for: r5v14, types: [com.google.android.apps.gsa.search.core.google.d.u] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[Catch:{ InterruptedException -> 0x00bf, b -> 0x00a2, all -> 0x00a0, all -> 0x00ce }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78291h() {
        /*
            r15 = this;
            java.lang.String r0 = "InputStreamChunkProduce"
            r1 = 196616(0x30008, float:2.75518E-40)
            r2 = 0
            java.lang.String r3 = "ChunkProducer stopped by another thread, before stream"
            r15.mo78288b(r3)     // Catch:{ InterruptedException -> 0x00bf, b -> 0x00a2, all -> 0x00a0 }
            com.google.android.apps.gsa.shared.util.ag r3 = r15.f230101f     // Catch:{ InterruptedException -> 0x00bf, b -> 0x00a2, all -> 0x00a0 }
            java.lang.Object r3 = r3.mo79589b()     // Catch:{ InterruptedException -> 0x00bf, b -> 0x00a2, all -> 0x00a0 }
            com.google.android.apps.gsa.search.core.google.d.f r3 = (com.google.android.apps.gsa.search.core.google.p6794d.C85939f) r3     // Catch:{ InterruptedException -> 0x00bf, b -> 0x00a2, all -> 0x00a0 }
            com.google.android.apps.gsa.search.core.google.d.d r4 = r15.f230102g     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            java.io.InputStream r7 = r3.f232360a     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            int r5 = r3.f232361b     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            r6 = 3
            if (r5 == r6) goto L_0x002b
            r6 = 5
            if (r5 == r6) goto L_0x002b
            r6 = 6
            if (r5 == r6) goto L_0x0024
        L_0x0022:
            r6 = r2
            goto L_0x0032
        L_0x0024:
            com.google.at.h.b.a.m r2 = com.google.p4017at.p4060h.p4068b.p4069a.C54196m.f142231f     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            goto L_0x0022
        L_0x002b:
            com.google.al.d.a.ac r2 = com.google.p395al.p417d.p418a.C8523ac.f29564e     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            goto L_0x0022
        L_0x0032:
            if (r6 != 0) goto L_0x0060
            r2 = 2
            if (r5 == r2) goto L_0x0060
            r2 = 4
            if (r5 != r2) goto L_0x003b
            goto L_0x0060
        L_0x003b:
            com.google.android.apps.gsa.search.core.google.d.u r2 = new com.google.android.apps.gsa.search.core.google.d.u     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            java.lang.String r8 = r3.f232362c     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            r8.getClass()
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f232350a     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250779S     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            long r5 = r5.mo79743a(r6)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            int r9 = (int) r5     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.search.core.google.d.n r10 = r4.f232351b     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.search.core.i.t r4 = r4.f232350a     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250766F     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            long r4 = r4.mo79743a(r5)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            int r11 = (int) r4     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            r5 = r2
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            goto L_0x008b
        L_0x0060:
            r2 = 1
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.search.core.i.t r2 = r4.f232350a     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250800aM     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            java.lang.String r2 = r2.mo79758x(r5)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            r5 = 0
            r10[r5] = r2     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.search.core.google.d.k r2 = new com.google.android.apps.gsa.search.core.google.d.k     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f232350a     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250779S     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            long r8 = r5.mo79743a(r8)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            int r8 = (int) r8     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.search.core.google.d.n r9 = r4.f232351b     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f232350a     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.shared.m.h r11 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250798aK     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            java.lang.String r11 = r5.mo79758x(r11)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            dagger.a r12 = r4.f232352c     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            com.google.android.apps.gsa.shared.s.a.a r13 = r4.f232353d     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
        L_0x008b:
            r15.f230105j = r2     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            java.lang.String r4 = "ChunkProducer stopped by another thread, after stream"
            r15.mo78288b(r4)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            r2.mo79588a(r15)     // Catch:{ InterruptedException -> 0x009e, b -> 0x009c }
            m135239k(r3)     // Catch:{ b -> 0x010e, RuntimeException -> 0x00f2, Error -> 0x00d6 }
            r15.mo78283e()     // Catch:{ b -> 0x010e, RuntimeException -> 0x00f2, Error -> 0x00d6 }
            return
        L_0x009c:
            r2 = move-exception
            goto L_0x00a6
        L_0x009e:
            r2 = move-exception
            goto L_0x00c3
        L_0x00a0:
            r3 = move-exception
            goto L_0x00d2
        L_0x00a2:
            r3 = move-exception
            r14 = r3
            r3 = r2
            r2 = r14
        L_0x00a6:
            boolean r4 = r15.mo78292i()     // Catch:{ all -> 0x00ce }
            if (r4 != 0) goto L_0x00be
            com.google.common.f.e r4 = f230096e     // Catch:{ all -> 0x00ce }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x00ce }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ce }
            r4.mo56378ag(r5, r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = "Exception while buffering stream"
            r6 = 9422(0x24ce, float:1.3203E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r2)).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x00ce }
        L_0x00be:
            throw r2     // Catch:{ all -> 0x00ce }
        L_0x00bf:
            r3 = move-exception
            r14 = r3
            r3 = r2
            r2 = r14
        L_0x00c3:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ce }
            com.google.android.apps.gsa.shared.q.d r4 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x00ce }
            r5 = 196609(0x30001, float:2.75508E-40)
            r4.<init>((java.lang.Throwable) r2, (int) r5)     // Catch:{ all -> 0x00ce }
            throw r4     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r2 = move-exception
            r14 = r3
            r3 = r2
            r2 = r14
        L_0x00d2:
            m135239k(r2)     // Catch:{ b -> 0x010e, RuntimeException -> 0x00f2, Error -> 0x00d6 }
            throw r3     // Catch:{ b -> 0x010e, RuntimeException -> 0x00f2, Error -> 0x00d6 }
        L_0x00d6:
            r2 = move-exception
            com.google.common.f.e r3 = f230096e
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r0)
            java.lang.String r0 = "Error in runReadTask()"
            r4 = 9420(0x24cc, float:1.32E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r4)).mo56386p(r0)
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d
            r0.<init>((java.lang.Throwable) r2, (int) r1)
            r15.m135238j(r0)
            throw r2
        L_0x00f2:
            r2 = move-exception
            com.google.common.f.e r3 = f230096e
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r0)
            java.lang.String r0 = "RuntimeException in runReadTask()"
            r4 = 9419(0x24cb, float:1.3199E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r4)).mo56386p(r0)
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d
            r0.<init>((java.lang.Throwable) r2, (int) r1)
            r15.m135238j(r0)
            throw r2
        L_0x010e:
            r1 = move-exception
            com.google.common.f.e r2 = f230096e
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r0)
            java.lang.String r0 = "Checked exception in runReadTask()"
            r3 = 9418(0x24ca, float:1.3197E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r3)).mo56386p(r0)
            r15.m135238j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6513aj.C84555o.mo78291h():void");
    }

    /* renamed from: i */
    public final boolean mo78292i() {
        boolean z;
        synchronized (this.f230103h) {
            z = this.f230104i;
        }
        return z;
    }
}
