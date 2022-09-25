package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9574z;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127354b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51514kn;
import com.google.assistant.p3897e.p3917i.p3918a.C51515ko;
import com.google.common.p4580v.C60950i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.z.a */
/* compiled from: PG */
public final class C127279a implements C127369n {

    /* renamed from: a */
    public static final C33476a f350538a;

    /* renamed from: b */
    public static final C32836cd f350539b;

    /* renamed from: c */
    private final C127354b f350540c;

    /* renamed from: d */
    private final C60950i f350541d;

    static {
        C51514kn knVar = (C51514kn) C51515ko.f134212e.createBuilder();
        C69664n.m101060f(knVar, "newBuilder()");
        f350538a = new C33476a("assistant.api.params.QueryContextParams", C69664n.m101061g(knVar, "builder").mo53628b());
        C51514kn knVar2 = (C51514kn) C51515ko.f134212e.createBuilder();
        C69664n.m101060f(knVar2, "newBuilder()");
        C69664n.m101061g(knVar2, "builder").mo53628b();
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.query.context.params");
        a.mo38319b(a2.mo38298a());
        f350539b = a.mo38318a();
    }

    public C127279a(C127354b bVar, C60950i iVar) {
        C69664n.m101061g(bVar, "conversationParamsStore");
        C69664n.m101061g(iVar, "timeSource");
        this.f350540c = bVar;
        this.f350541d = iVar;
    }

    /* JADX WARNING: type inference failed for: r2v17, types: [com.google.protobuf.MessageLite] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo107986a(com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i r8, com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be r9) {
        /*
            r7 = this;
            java.lang.String r0 = "queryContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
            java.lang.String r8 = "request"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r8)
            com.google.android.libraries.search.assistant.f.a.d.aw r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw.f87978c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.au r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au) r8
            java.lang.String r9 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            com.google.android.libraries.search.assistant.f.a.d.ay r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.libraries.search.assistant.f.a.d.ba r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba.f87988c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.az r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)
            com.google.android.libraries.search.assistant.f.a.d.bc r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.android.libraries.search.assistant.i.a r1 = f350538a
            com.google.android.apps.search.assistant.surfaces.voice.d.g.b r2 = r7.f350540c
            java.lang.String r3 = "asst.query.context.params"
            com.google.assistant.e.j.kc r2 = r2.mo108031a(r3)
            r3 = 0
            if (r2 == 0) goto L_0x0047
            com.google.assistant.e.j.ka r2 = r2.f137066c
            if (r2 != 0) goto L_0x003d
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x003d:
            if (r2 != 0) goto L_0x0040
            goto L_0x0047
        L_0x0040:
            com.google.protobuf.MessageLite r2 = r1.mo38880b(r2)
            r3 = r2
            com.google.assistant.e.i.a.ko r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51515ko) r3
        L_0x0047:
            if (r3 != 0) goto L_0x005c
            com.google.assistant.e.i.a.ko r2 = com.google.assistant.p3897e.p3917i.p3918a.C51515ko.f134212e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.i.a.kn r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51514kn) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r9)
            com.google.assistant.e.i.a.jx r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.assistant.e.i.a.ko r3 = r9.mo53628b()
        L_0x005c:
            com.google.protobuf.bn r9 = r3.toBuilder()
            java.lang.String r2 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            com.google.assistant.e.i.a.kn r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51514kn) r9
            com.google.assistant.e.i.a.jx r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.assistant.e.i.a.ki r3 = r9.mo53627a()
            int r3 = r3.f134190a
            r3 = r3 & 4
            if (r3 != 0) goto L_0x00c9
            com.google.assistant.e.i.a.ki r3 = r9.mo53627a()
            com.google.protobuf.bn r3 = r3.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r2)
            com.google.assistant.e.i.a.kh r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51508kh) r3
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r2)
            com.google.common.v.i r2 = r7.f350541d
            j$.time.Instant r2 = r2.mo57444a()
            java.lang.String r4 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            long r4 = com.google.common.p4580v.C60941b.m93082a(r2)
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.assistant.e.i.a.ki r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51509ki) r2
            int r6 = r2.f134190a
            r6 = r6 | 4
            r2.f134190a = r6
            r2.f134194e = r4
            com.google.protobuf.bv r2 = r3.build()
            java.lang.String r3 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.assistant.e.i.a.ki r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51509ki) r2
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            com.google.assistant.e.i.a.kn r3 = r9.f134173a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.assistant.e.i.a.ko r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51515ko) r3
            r2.getClass()
            r3.f134216c = r2
            int r2 = r3.f134214a
            r2 = r2 | 2
            r3.f134214a = r2
        L_0x00c9:
            com.google.assistant.e.i.a.ko r9 = r9.mo53628b()
            com.google.assistant.e.j.ka r9 = r1.mo38879a(r9)
            java.lang.String r1 = "QUERY_CONTEXT_PARAMS_KEY…atedQueryContextParams())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)
            r0.mo38306b(r9)
            com.google.android.libraries.search.assistant.f.a.d.ba r9 = r0.mo38305a()
            r8.mo38303b(r9)
            com.google.android.libraries.search.assistant.f.a.d.aw r8 = r8.mo38302a()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9574z.C127279a.mo107986a(com.google.android.apps.search.assistant.surfaces.voice.d.d.i, com.google.android.libraries.search.assistant.f.a.d.be):com.google.common.util.concurrent.cx");
    }
}
