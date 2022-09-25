package com.google.android.apps.search.googleapp.discover.p10166a.p10168b;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.upload.ActionsUpload$scheduleActionsUpload$2", mo61344c = "ActionsUpload.kt", mo61345d = "invokeSuspend", mo61346e = {71})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.c */
/* compiled from: PG */
public final class C133968c extends C69572j implements C69630p {

    /* renamed from: a */
    Object f364891a;

    /* renamed from: b */
    Object f364892b;

    /* renamed from: c */
    int f364893c;

    /* renamed from: d */
    final /* synthetic */ C133969d f364894d;

    /* renamed from: e */
    final /* synthetic */ List f364895e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133968c(C133969d dVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f364894d = dVar;
        this.f364895e = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133968c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.apps.tiktok.tracing.bi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f364893c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r0 = r9.f364892b
            java.lang.Object r1 = r9.f364891a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0010 }
            goto L_0x0043
        L_0x0010:
            r10 = move-exception
            goto L_0x0059
        L_0x0012:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.googleapp.discover.a.b.d r1 = r9.f364894d
            java.util.List r10 = r9.f364895e
            java.lang.String r4 = "ActionsUpload#scheduleActionsUpload"
            com.google.apps.tiktok.tracing.bi r4 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r4)
            com.google.android.apps.search.googleapp.discover.d.a r5 = r1.f364899d     // Catch:{ all -> 0x0136 }
            com.google.android.apps.gsa.shared.logger.b.i r5 = r5.f365540a     // Catch:{ all -> 0x0136 }
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_ACTION_UPLOAD_START     // Catch:{ all -> 0x0136 }
            r5.mo83702b(r6)     // Catch:{ all -> 0x0136 }
            com.google.android.apps.search.googleapp.discover.a.b.g r5 = r1.f364897b     // Catch:{ all -> 0x0057 }
            long r6 = r1.f364900e     // Catch:{ all -> 0x0057 }
            int r7 = (int) r6     // Catch:{ all -> 0x0057 }
            int r6 = r10.size()     // Catch:{ all -> 0x0057 }
            int r7 = r7 - r6
            int r6 = java.lang.Math.max(r7, r2)     // Catch:{ all -> 0x0057 }
            r9.f364891a = r1     // Catch:{ all -> 0x0057 }
            r9.f364892b = r4     // Catch:{ all -> 0x0057 }
            r9.f364893c = r3     // Catch:{ all -> 0x0057 }
            java.lang.Object r10 = r5.mo111481b(r6, r10, r2, r9)     // Catch:{ all -> 0x0057 }
            if (r10 == r0) goto L_0x0056
            r0 = r4
        L_0x0043:
            r10 = r1
            com.google.android.apps.search.googleapp.discover.a.b.d r10 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133969d) r10     // Catch:{ all -> 0x0010 }
            com.google.android.apps.search.googleapp.discover.d.a r10 = r10.f364899d     // Catch:{ all -> 0x0010 }
            com.google.android.apps.gsa.shared.logger.b.i r10 = r10.f365540a     // Catch:{ all -> 0x0010 }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_ACTION_UPLOAD_SUCCESS     // Catch:{ all -> 0x0010 }
            r10.mo83702b(r4)     // Catch:{ all -> 0x0010 }
            r10 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r10)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = move-exception
            r0 = r4
        L_0x0059:
            com.google.common.f.e r4 = com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133969d.f364896a     // Catch:{ all -> 0x0133 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0133 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0133 }
            com.google.common.f.x r4 = r4.mo56382g(r10)     // Catch:{ all -> 0x0133 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0133 }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x0133 }
            r6 = 40205(0x9d0d, float:5.6339E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x0133 }
            r4.mo56379ah(r5)     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = "Standalone action upload failed"
            r4.mo56386p(r5)     // Catch:{ all -> 0x0133 }
            io.grpc.Status r4 = p5488io.grpc.Status.m102100d(r10)     // Catch:{ all -> 0x0133 }
            io.grpc.Status$Code r4 = r4.getCode()     // Catch:{ all -> 0x0133 }
            int[] r5 = com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133940a.f364816a     // Catch:{ all -> 0x0133 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0133 }
            r4 = r5[r4]     // Catch:{ all -> 0x0133 }
            r5 = 2
            java.lang.String r6 = "newBuilder()"
            if (r4 != r3) goto L_0x00c6
            com.google.common.o.f r2 = com.google.common.p4552o.C59770f.f161501d     // Catch:{ all -> 0x0133 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0133 }
            com.google.common.o.e r2 = (com.google.common.p4552o.C59742e) r2     // Catch:{ all -> 0x0133 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)     // Catch:{ all -> 0x0133 }
            com.google.common.o.it r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")     // Catch:{ all -> 0x0133 }
            com.google.common.o.e r4 = r2.f162151a     // Catch:{ all -> 0x0133 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0133 }
            com.google.protobuf.bv r4 = r4.instance     // Catch:{ all -> 0x0133 }
            com.google.common.o.f r4 = (com.google.common.p4552o.C59770f) r4     // Catch:{ all -> 0x0133 }
            int r7 = r4.f161503a     // Catch:{ all -> 0x0133 }
            r3 = r3 | r7
            r4.f161503a = r3     // Catch:{ all -> 0x0133 }
            r4.f161504b = r5     // Catch:{ all -> 0x0133 }
            io.grpc.Status$Code r3 = p5488io.grpc.Status.Code.UNAVAILABLE     // Catch:{ all -> 0x0133 }
            int r3 = r3.value()     // Catch:{ all -> 0x0133 }
            com.google.common.o.e r4 = r2.f162151a     // Catch:{ all -> 0x0133 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0133 }
            com.google.protobuf.bv r4 = r4.instance     // Catch:{ all -> 0x0133 }
            com.google.common.o.f r4 = (com.google.common.p4552o.C59770f) r4     // Catch:{ all -> 0x0133 }
            int r7 = r4.f161503a     // Catch:{ all -> 0x0133 }
            r5 = r5 | r7
            r4.f161503a = r5     // Catch:{ all -> 0x0133 }
            r4.f161505c = r3     // Catch:{ all -> 0x0133 }
            com.google.common.o.f r2 = r2.mo57062a()     // Catch:{ all -> 0x0133 }
            goto L_0x00fc
        L_0x00c6:
            com.google.common.o.f r4 = com.google.common.p4552o.C59770f.f161501d     // Catch:{ all -> 0x0133 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0133 }
            com.google.common.o.e r4 = (com.google.common.p4552o.C59742e) r4     // Catch:{ all -> 0x0133 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)     // Catch:{ all -> 0x0133 }
            com.google.common.o.it r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")     // Catch:{ all -> 0x0133 }
            com.google.common.o.e r7 = r4.f162151a     // Catch:{ all -> 0x0133 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0133 }
            com.google.protobuf.bv r7 = r7.instance     // Catch:{ all -> 0x0133 }
            com.google.common.o.f r7 = (com.google.common.p4552o.C59770f) r7     // Catch:{ all -> 0x0133 }
            int r8 = r7.f161503a     // Catch:{ all -> 0x0133 }
            r3 = r3 | r8
            r7.f161503a = r3     // Catch:{ all -> 0x0133 }
            r7.f161504b = r2     // Catch:{ all -> 0x0133 }
            com.google.common.o.e r2 = r4.f162151a     // Catch:{ all -> 0x0133 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0133 }
            com.google.protobuf.bv r2 = r2.instance     // Catch:{ all -> 0x0133 }
            com.google.common.o.f r2 = (com.google.common.p4552o.C59770f) r2     // Catch:{ all -> 0x0133 }
            int r3 = r2.f161503a     // Catch:{ all -> 0x0133 }
            r3 = r3 | r5
            r2.f161503a = r3     // Catch:{ all -> 0x0133 }
            r3 = 196636(0x3001c, float:2.75546E-40)
            r2.f161505c = r3     // Catch:{ all -> 0x0133 }
            com.google.common.o.f r2 = r4.mo57062a()     // Catch:{ all -> 0x0133 }
        L_0x00fc:
            com.google.android.apps.search.googleapp.discover.a.b.d r1 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133969d) r1     // Catch:{ all -> 0x0133 }
            com.google.android.apps.search.googleapp.discover.d.a r1 = r1.f364899d     // Catch:{ all -> 0x0133 }
            java.lang.String r3 = "appFlowErrorInfo"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.shared.logger.b.i r1 = r1.f365540a     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.shared.logger.b.f r3 = new com.google.android.apps.gsa.shared.logger.b.f     // Catch:{ all -> 0x0133 }
            r3.<init>()     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DISCOVER_TNG_ACTION_UPLOAD_FAILURE     // Catch:{ all -> 0x0133 }
            r3.f246201a = r4     // Catch:{ all -> 0x0133 }
            com.google.common.o.cb r4 = com.google.common.p4552o.C59687cb.f160034bf     // Catch:{ all -> 0x0133 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x0133 }
            com.google.common.o.aj r4 = (com.google.common.p4552o.C59582aj) r4     // Catch:{ all -> 0x0133 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)     // Catch:{ all -> 0x0133 }
            com.google.common.o.qq r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")     // Catch:{ all -> 0x0133 }
            r4.mo57096d()     // Catch:{ all -> 0x0133 }
            r4.mo57095c(r2)     // Catch:{ all -> 0x0133 }
            com.google.common.o.cb r2 = r4.mo57093a()     // Catch:{ all -> 0x0133 }
            r3.f246203c = r2     // Catch:{ all -> 0x0133 }
            com.google.android.apps.gsa.shared.logger.b.g r2 = r3.mo83699a()     // Catch:{ all -> 0x0133 }
            r1.mo74236a(r2)     // Catch:{ all -> 0x0133 }
            throw r10     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r10 = move-exception
            r4 = r0
            goto L_0x0137
        L_0x0136:
            r10 = move-exception
        L_0x0137:
            throw r10     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r4, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133968c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133968c(this.f364894d, this.f364895e, gVar);
    }
}
