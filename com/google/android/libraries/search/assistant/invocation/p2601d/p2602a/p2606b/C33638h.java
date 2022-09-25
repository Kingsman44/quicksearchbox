package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121689ar;
import com.google.android.libraries.search.assistant.invocation.p2597b.C33553a;
import com.google.android.libraries.search.assistant.invocation.p2597b.C33559g;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33597ad;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33601ah;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33615i;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33616j;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33617k;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.h */
/* compiled from: PG */
public final class C33638h extends C33601ah {

    /* renamed from: a */
    public static final C59071e f89888a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f89889b;

    /* renamed from: c */
    public final C121689ar f89890c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33638h(C121689ar arVar, C69585o oVar, C71422aw awVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f89890c = arVar;
        this.f89889b = awVar;
    }

    /* renamed from: b */
    public final C33617k mo39009b(Throwable th) {
        C33616j jVar;
        C33615i iVar = (C33615i) C33617k.f89844c.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C33597ad a = C69664n.m101061g(iVar, "builder");
        String message = th.getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        a.mo38998b(message);
        if (th instanceof C33553a) {
            jVar = C33616j.EXCEPTION_INVALID_INVOCATION_TOKEN;
        } else if (th instanceof C33559g) {
            jVar = C33616j.EXCEPTION_RESOURCE_NOT_AVAILABLE;
        } else {
            jVar = C33616j.EXCEPTION_UNKNOWN;
        }
        a.mo38999c(jVar);
        return a.mo38997a();
    }

    /* renamed from: d */
    public final C71587n mo39001d(C71587n nVar) {
        C69664n.m101061g(nVar, "requests");
        return C71590q.m104505b(new C33636f(nVar, this, (C69577g) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39000c(com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33630x r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33637g
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.search.assistant.invocation.d.a.b.g r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33637g) r0
            int r1 = r0.f89887e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89887e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.a.b.g r0 = new com.google.android.libraries.search.assistant.invocation.d.a.b.g
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f89885c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f89887e
            java.lang.String r3 = "request.invocationToken"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r9 = r0.f89884b
            java.lang.Object r0 = r0.f89883a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0030 }
            goto L_0x0073
        L_0x0030:
            r10 = move-exception
            goto L_0x0079
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            java.lang.Object r9 = r0.f89884b
            java.lang.Object r2 = r0.f89883a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0042 }
            goto L_0x0064
        L_0x0042:
            r10 = move-exception
            r0 = r2
            goto L_0x0079
        L_0x0045:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.assistant.platform.j.b.a.a.ar r10 = r8.f89890c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r9.f89867a
            if (r2 != 0) goto L_0x0050
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x0050:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.apps.search.assistant.platform.j.b.a.a.aq r10 = r10.mo105297a(r2)
            r0.f89883a = r8     // Catch:{ all -> 0x0077 }
            r0.f89884b = r9     // Catch:{ all -> 0x0077 }
            r0.f89887e = r5     // Catch:{ all -> 0x0077 }
            java.lang.Object r10 = r10.mo105295b(r0)     // Catch:{ all -> 0x0077 }
            if (r10 == r1) goto L_0x0076
            r2 = r8
        L_0x0064:
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r10     // Catch:{ all -> 0x0042 }
            r0.f89883a = r2     // Catch:{ all -> 0x0042 }
            r0.f89884b = r9     // Catch:{ all -> 0x0042 }
            r0.f89887e = r4     // Catch:{ all -> 0x0042 }
            java.lang.Object r10 = r10.mo105342e(r0)     // Catch:{ all -> 0x0042 }
            if (r10 == r1) goto L_0x0076
            r0 = r2
        L_0x0073:
            h.q r10 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0030 }
            goto L_0x007d
        L_0x0076:
            return r1
        L_0x0077:
            r10 = move-exception
            r0 = r8
        L_0x0079:
            java.lang.Object r10 = p5462h.C69714l.m101133a(r10)
        L_0x007d:
            java.lang.Throwable r10 = p5462h.C69702k.m101124a(r10)
            java.lang.String r1 = "value"
            java.lang.String r2 = "newBuilder()"
            if (r10 == 0) goto L_0x00fd
            boolean r5 = r10 instanceof com.google.android.libraries.search.assistant.invocation.p2597b.C33553a
            if (r5 == 0) goto L_0x009c
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.x r9 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33630x) r9
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r9.f89867a
            if (r9 != 0) goto L_0x0095
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x0095:
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r3)
            com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)
            goto L_0x00d0
        L_0x009c:
            com.google.common.f.e r5 = f89888a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "INV.AudioFocus.Server"
            r5.mo56378ag(r6, r7)
            com.google.common.f.x r5 = r5.mo56382g(r10)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.x r9 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33630x) r9
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r9.f89867a
            if (r9 != 0) goto L_0x00b9
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x00b9:
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r3)
            com.google.frameworks.client.a.a.b r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)
            com.google.common.f.n r3 = new com.google.common.f.n
            r6 = 51244(0xc82c, float:7.1808E-41)
            r3.<init>(r6)
            r5.mo56379ah(r3)
            java.lang.String r3 = "A failure happens for releasing audio focus with invocation token (%s)."
            r5.mo56389s(r3, r9)
        L_0x00d0:
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.ab r9 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33595ab.f89813c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.y r9 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33631y) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.an r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.android.libraries.search.assistant.invocation.d.a.b.h r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33638h) r0
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.k r10 = r0.mo39009b(r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r1)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.y r0 = r9.f89825a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.ab r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33595ab) r0
            r10.getClass()
            r0.f89816b = r10
            r0.f89815a = r4
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.ab r9 = r9.mo39005a()
            return r9
        L_0x00fd:
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.ab r9 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33595ab.f89813c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.y r9 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33631y) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.an r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.aa r10 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33594aa.f89811a
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.z r10 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33632z) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            java.lang.String r0 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            com.google.protobuf.bv r10 = r10.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.aa r10 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33594aa) r10
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r1)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.y r0 = r9.f89825a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.ab r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33595ab) r0
            r10.getClass()
            r0.f89816b = r10
            r0.f89815a = r5
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.ab r9 = r9.mo39005a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33638h.mo39000c(com.google.android.libraries.search.assistant.invocation.d.a.b.b.x, h.c.g):java.lang.Object");
    }
}
