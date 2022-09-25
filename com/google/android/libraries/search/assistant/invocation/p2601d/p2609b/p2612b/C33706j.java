package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121689ar;
import com.google.android.libraries.search.assistant.invocation.p2597b.C33553a;
import com.google.android.libraries.search.assistant.invocation.p2597b.C33559g;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33667a;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33674b;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33675c;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33693u;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.j */
/* compiled from: PG */
public final class C33706j extends C33693u {

    /* renamed from: a */
    public static final C59071e f90049a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f90050b;

    /* renamed from: c */
    private final C121689ar f90051c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33706j(C121689ar arVar, C71422aw awVar, C69585o oVar) {
        super(oVar);
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f90051c = arVar;
        this.f90050b = awVar;
    }

    /* renamed from: e */
    private final C33675c m62307e(Throwable th) {
        C33674b bVar;
        C33667a aVar = (C33667a) C33675c.f89983c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        String message = th.getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        aVar.copyOnWrite();
        ((C33675c) aVar.instance).f89986b = message;
        if (th instanceof C33553a) {
            bVar = C33674b.EXCEPTION_INVALID_INVOCATION_TOKEN;
        } else if (th instanceof C33559g) {
            bVar = C33674b.EXCEPTION_RESOURCE_NOT_AVAILABLE;
        } else {
            bVar = C33674b.EXCEPTION_UNKNOWN;
        }
        C69664n.m101061g(bVar, "value");
        aVar.copyOnWrite();
        ((C33675c) aVar.instance).f89985a = bVar.getNumber();
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C33675c) build;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39033b(com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33677e r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33664a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.assistant.invocation.d.b.b.a r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33664a) r0
            int r1 = r0.f89967e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89967e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.b.b.a r0 = new com.google.android.libraries.search.assistant.invocation.d.b.b.a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f89965c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f89967e
            java.lang.String r3 = "value"
            java.lang.String r4 = "request.invocationToken"
            java.lang.String r5 = "newBuilder()"
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r7) goto L_0x0039
            if (r2 != r6) goto L_0x0031
            p5462h.C69714l.m101134b(r12)
            goto L_0x00f3
        L_0x0031:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0039:
            java.lang.Object r11 = r0.f89964b
            java.lang.Object r2 = r0.f89963a
            p5462h.C69714l.m101134b(r12)     // Catch:{ all -> 0x0041 }
            goto L_0x0062
        L_0x0041:
            r12 = move-exception
            goto L_0x0068
        L_0x0043:
            p5462h.C69714l.m101134b(r12)
            com.google.android.apps.search.assistant.platform.j.b.a.a.ar r12 = r10.f90051c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r11.f89989a
            if (r2 != 0) goto L_0x004e
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x004e:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.apps.search.assistant.platform.j.b.a.a.aq r12 = r12.mo105297a(r2)
            r0.f89963a = r10     // Catch:{ all -> 0x0066 }
            r0.f89964b = r11     // Catch:{ all -> 0x0066 }
            r0.f89967e = r7     // Catch:{ all -> 0x0066 }
            java.lang.Object r12 = r12.mo105296c(r0)     // Catch:{ all -> 0x0066 }
            if (r12 == r1) goto L_0x0065
            r2 = r10
        L_0x0062:
            com.google.android.apps.search.assistant.platform.j.b.b.c.ag r12 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121758ag) r12     // Catch:{ all -> 0x0041 }
            goto L_0x006c
        L_0x0065:
            return r1
        L_0x0066:
            r12 = move-exception
            r2 = r10
        L_0x0068:
            java.lang.Object r12 = p5462h.C69714l.m101133a(r12)
        L_0x006c:
            java.lang.Throwable r8 = p5462h.C69702k.m101124a(r12)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.e r11 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33677e) r11
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r11.f89989a
            if (r9 != 0) goto L_0x0078
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x0078:
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r4)
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)
            if (r8 == 0) goto L_0x00d0
            boolean r11 = r8 instanceof com.google.android.libraries.search.assistant.invocation.p2597b.C33553a
            if (r11 != 0) goto L_0x00a3
            com.google.common.f.e r11 = f90049a
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.x r11 = r11.mo56382g(r8)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r12 = new com.google.common.f.n
            r0 = 51267(0xc843, float:7.184E-41)
            r12.<init>(r0)
            r11.mo56379ah(r12)
            java.lang.String r12 = "A failure happens when getting the audio input resource with invocation token (%s)"
            r11.mo56389s(r12, r4)
        L_0x00a3:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r11 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33681i.f89994c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.f r11 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33678f) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r5)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.z r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.android.libraries.search.assistant.invocation.d.b.b.j r2 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33706j) r2
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.c r12 = r2.m62307e(r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r3)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.f r0 = r11.f90018a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33681i) r0
            r12.getClass()
            r0.f89997b = r12
            r0.f89996a = r6
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r11 = r11.mo39032a()
            return r11
        L_0x00d0:
            boolean r2 = r12 instanceof p5462h.C69692j
            r8 = 0
            if (r7 == r2) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r12 = r8
        L_0x00d7:
            com.google.android.apps.search.assistant.platform.j.b.b.c.ag r12 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121758ag) r12
            if (r12 == 0) goto L_0x0135
            com.google.android.libraries.search.c.cc r11 = r11.f89990b
            if (r11 != 0) goto L_0x00e1
            com.google.android.libraries.search.c.cc r11 = com.google.android.libraries.search.p2904c.C37454cc.f99428c
        L_0x00e1:
            java.lang.String r2 = "request.sessionAccessToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            r0.f89963a = r8
            r0.f89964b = r8
            r0.f89967e = r6
            java.lang.Object r11 = r12.mo105347g(r11, r0)
            if (r11 != r1) goto L_0x00f3
            return r1
        L_0x00f3:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r11 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33681i.f89994c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.f r11 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33678f) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r5)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.z r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.h r12 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33680h.f89992a
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.g r12 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33679g) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r5)
            java.lang.String r0 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)
            com.google.protobuf.bv r12 = r12.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r0)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.h r12 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33680h) r12
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r3)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.f r0 = r11.f90018a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33681i) r0
            r12.getClass()
            r0.f89997b = r12
            r0.f89996a = r7
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r11 = r11.mo39032a()
            return r11
        L_0x0135:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not get audio input resource even there is no failure. This should not happen. The invocation token: "
            r12.<init>(r0)
            r12.append(r4)
            java.lang.Object r12 = r4.f165796b
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r0.concat(r12)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33706j.mo39033b(com.google.android.libraries.search.assistant.invocation.d.b.b.b.e, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39034c(com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33683k r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33666b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.invocation.d.b.b.b r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33666b) r0
            int r1 = r0.f89972e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89972e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b r0 = new com.google.android.libraries.search.assistant.invocation.d.b.b.b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f89970c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f89972e
            java.lang.String r3 = "request.invocationToken"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r8 = r0.f89969b
            java.lang.Object r0 = r0.f89968a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x0030 }
            goto L_0x0074
        L_0x0030:
            r9 = move-exception
            goto L_0x007a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            java.lang.Object r8 = r0.f89969b
            java.lang.Object r2 = r0.f89968a
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x0042 }
            goto L_0x0064
        L_0x0042:
            r9 = move-exception
            r0 = r2
            goto L_0x007a
        L_0x0045:
            p5462h.C69714l.m101134b(r9)
            com.google.android.apps.search.assistant.platform.j.b.a.a.ar r9 = r7.f90051c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r8.f90000a
            if (r2 != 0) goto L_0x0050
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x0050:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.apps.search.assistant.platform.j.b.a.a.aq r9 = r9.mo105297a(r2)
            r0.f89968a = r7     // Catch:{ all -> 0x0078 }
            r0.f89969b = r8     // Catch:{ all -> 0x0078 }
            r0.f89972e = r5     // Catch:{ all -> 0x0078 }
            java.lang.Object r9 = r9.mo105296c(r0)     // Catch:{ all -> 0x0078 }
            if (r9 == r1) goto L_0x0077
            r2 = r7
        L_0x0064:
            com.google.android.apps.search.assistant.platform.j.b.b.c.ag r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121758ag) r9     // Catch:{ all -> 0x0042 }
            r0.f89968a = r2     // Catch:{ all -> 0x0042 }
            r0.f89969b = r8     // Catch:{ all -> 0x0042 }
            r0.f89972e = r4     // Catch:{ all -> 0x0042 }
            r6 = 0
            java.lang.Object r9 = r9.mo105345e(r6, r0)     // Catch:{ all -> 0x0042 }
            if (r9 == r1) goto L_0x0077
            r0 = r2
        L_0x0074:
            com.google.android.apps.search.assistant.platform.j.b.b.c.at r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at) r9     // Catch:{ all -> 0x0030 }
            goto L_0x007e
        L_0x0077:
            return r1
        L_0x0078:
            r9 = move-exception
            r0 = r7
        L_0x007a:
            java.lang.Object r9 = p5462h.C69714l.m101133a(r9)
        L_0x007e:
            java.lang.Throwable r1 = p5462h.C69702k.m101124a(r9)
            java.lang.String r2 = "newBuilder()"
            if (r1 == 0) goto L_0x00e2
            com.google.common.f.e r9 = f90049a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.x r9 = r9.mo56382g(r1)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.k r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33683k) r8
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = r8.f90000a
            if (r8 != 0) goto L_0x009c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x009c:
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r3)
            com.google.frameworks.client.a.a.b r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r8)
            com.google.common.f.n r3 = new com.google.common.f.n
            r5 = 51266(0xc842, float:7.1839E-41)
            r3.<init>(r5)
            r9.mo56379ah(r3)
            java.lang.String r3 = "A failure happens when getting the audio input resource with invocation token (%s)."
            r9.mo56389s(r3, r8)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.m r8 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33685m.f90002c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.l r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33684l) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.ab r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.libraries.search.assistant.invocation.d.b.b.j r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33706j) r0
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.c r9 = r0.m62307e(r1)
            java.lang.String r0 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.l r0 = r8.f89973a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.m r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33685m) r0
            r9.getClass()
            r0.f90005b = r9
            r0.f90004a = r4
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.m r8 = r8.mo39024a()
            return r8
        L_0x00e2:
            boolean r0 = r9 instanceof p5462h.C69692j
            if (r5 == r0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r9 = 0
        L_0x00e8:
            com.google.android.apps.search.assistant.platform.j.b.b.c.at r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at) r9
            if (r9 != 0) goto L_0x0115
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.k r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33683k) r8
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = r8.f90000a
            if (r8 != 0) goto L_0x00f6
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x00f6:
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r3)
            com.google.frameworks.client.a.a.b r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not get audio input resource even there is no failure. This should not happen. The invocation token: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.Object r8 = r8.f165796b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r1.concat(r8)
            r9.<init>(r8)
            throw r9
        L_0x0115:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.m r8 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33685m.f90002c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.l r8 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33684l) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.ab r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.l r0 = r8.f89973a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.m r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33685m) r0
            r0.f90005b = r9
            r0.f90004a = r5
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.m r8 = r8.mo39024a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33706j.mo39034c(com.google.android.libraries.search.assistant.invocation.d.b.b.b.k, h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final C71587n mo39028d(C71587n nVar) {
        C69664n.m101061g(nVar, "requests");
        return C71590q.m104505b(new C33705i(nVar, this, (C69577g) null));
    }
}
