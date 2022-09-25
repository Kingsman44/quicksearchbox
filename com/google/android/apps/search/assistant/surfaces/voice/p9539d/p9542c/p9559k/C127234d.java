package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32790al;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32791am;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.k.d */
/* compiled from: PG */
public final class C127234d implements C127369n {

    /* renamed from: a */
    public static final C32836cd f350329a;

    /* renamed from: b */
    private final C71422aw f350330b;

    /* renamed from: c */
    private final C127369n f350331c;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        C32790al alVar = (C32790al) C32791am.f87965c.createBuilder();
        C69664n.m101060f(alVar, "newBuilder()");
        C69664n.m101061g(alVar, "builder");
        alVar.copyOnWrite();
        C32791am amVar = (C32791am) alVar.instance;
        amVar.f87967a |= 1;
        amVar.f87968b = "X-Client-Opt-In-Context";
        C62942bv build = alVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C32791am amVar2 = (C32791am) build;
        C69664n.m101061g(amVar2, "value");
        C32788aj ajVar2 = a2.f87977a;
        ajVar2.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar2.instance;
        amVar2.getClass();
        arVar.f87976b = amVar2;
        arVar.f87975a = 2;
        a.mo38319b(a2.mo38298a());
        f350329a = a.mo38318a();
    }

    public C127234d(C71422aw awVar, C127369n nVar) {
        C69664n.m101061g(awVar, "backgroundScope");
        this.f350330b = awVar;
        this.f350331c = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350330b, (C71424ay) null, new C127232b(this, iVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108001b(com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k.C127233c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.d.c.k.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k.C127233c) r0
            int r1 = r0.f350328c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350328c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.k.c r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.k.c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f350326a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350328c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.d.n r7 = r5.f350331c
            com.google.android.libraries.search.assistant.f.a.d.be r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c
            java.lang.String r4 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.apps.search.assistant.surfaces.voice.d.e.l r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e.C127318l) r7
            com.google.android.apps.search.assistant.surfaces.voice.d.e.q r7 = r7.f350646a
            com.google.common.util.concurrent.cx r6 = r7.mo108016b(r6)
            r0.f350328c = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r7 == r1) goto L_0x011c
        L_0x004b:
            com.google.android.libraries.search.assistant.f.a.d.aw r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r7
            int r6 = r7.f87980a
            if (r6 != r3) goto L_0x0056
            java.lang.Object r6 = r7.f87981b
            com.google.android.libraries.search.assistant.f.a.d.ba r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba) r6
            goto L_0x0058
        L_0x0056:
            com.google.android.libraries.search.assistant.f.a.d.ba r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba.f87988c
        L_0x0058:
            com.google.assistant.e.j.ka r6 = r6.f87991b
            if (r6 != 0) goto L_0x005e
            com.google.assistant.e.j.ka r6 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x005e:
            java.lang.String r6 = r6.f137060b
            java.lang.String r0 = "assistant.api.params.GwsRequestParams"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r0)
            if (r6 != 0) goto L_0x0098
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k.C127235e.f350332a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            int r0 = r7.f87980a
            if (r0 != r3) goto L_0x0079
            java.lang.Object r7 = r7.f87981b
            com.google.android.libraries.search.assistant.f.a.d.ba r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba) r7
            goto L_0x007b
        L_0x0079:
            com.google.android.libraries.search.assistant.f.a.d.ba r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba.f87988c
        L_0x007b:
            com.google.assistant.e.j.ka r7 = r7.f87991b
            if (r7 != 0) goto L_0x0081
            com.google.assistant.e.j.ka r7 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0081:
            java.lang.String r7 = r7.f137060b
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 37264(0x9190, float:5.2218E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Failed to fetch ClientOptInParams, invalid GWS params type: %s"
            r6.mo56389s(r0, r7)
            java.lang.String r6 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k.C127231a.m208112a()
            return r6
        L_0x0098:
            int r6 = r7.f87980a
            if (r6 != r3) goto L_0x00a1
            java.lang.Object r6 = r7.f87981b
            com.google.android.libraries.search.assistant.f.a.d.ba r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba) r6
            goto L_0x00a3
        L_0x00a1:
            com.google.android.libraries.search.assistant.f.a.d.ba r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba.f87988c
        L_0x00a3:
            com.google.assistant.e.j.ka r6 = r6.f87991b
            if (r6 != 0) goto L_0x00a9
            com.google.assistant.e.j.ka r6 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x00a9:
            com.google.protobuf.z r6 = r6.f137061c
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()
            com.google.assistant.e.i.a.hc r0 = com.google.assistant.p3897e.p3917i.p3918a.C51422hc.f133938f
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r0, (com.google.protobuf.C63088z) r6, (com.google.protobuf.C62921ba) r7)
            com.google.assistant.e.i.a.hc r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51422hc) r6
            java.lang.String r7 = "parseFrom(\n        conte…neratedRegistry()\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.protobuf.z r6 = r6.f133941b
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()
            com.google.speech.h.ax r0 = com.google.speech.p5208h.C66567ax.f181069f
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r0, (com.google.protobuf.C63088z) r6, (com.google.protobuf.C62921ba) r7)
            com.google.speech.h.ax r6 = (com.google.speech.p5208h.C66567ax) r6
            java.lang.String r7 = "parseFrom(\n          gws…ratedRegistry()\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.protobuf.cq r6 = r6.f181075d
            java.lang.String r7 = "pinholeParams.headersList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x00da:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00f2
            java.lang.Object r7 = r6.next()
            r0 = r7
            com.google.speech.h.at r0 = (com.google.speech.p5208h.C66563at) r0
            java.lang.String r0 = r0.f181057b
            java.lang.String r1 = "X-Client-Opt-In-Context"
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r1)
            if (r0 == 0) goto L_0x00da
            goto L_0x00f3
        L_0x00f2:
            r7 = 0
        L_0x00f3:
            com.google.speech.h.at r7 = (com.google.speech.p5208h.C66563at) r7
            if (r7 != 0) goto L_0x0114
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k.C127235e.f350332a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r7 = new com.google.common.f.n
            r0 = 37263(0x918f, float:5.2217E-41)
            r7.<init>(r0)
            r6.mo56379ah(r7)
            java.lang.String r7 = "Failed to fetch ClientOptInParams, header not found"
            r6.mo56386p(r7)
            java.lang.String r6 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k.C127231a.m208112a()
            goto L_0x011b
        L_0x0114:
            java.lang.String r6 = r7.f181058c
            java.lang.String r7 = "optInContextHeader.value"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
        L_0x011b:
            return r6
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k.C127234d.mo108001b(com.google.android.apps.search.assistant.surfaces.voice.d.d.i, h.c.g):java.lang.Object");
    }
}
