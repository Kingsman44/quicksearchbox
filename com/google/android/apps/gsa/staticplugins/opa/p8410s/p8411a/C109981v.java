package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107473al;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107475an;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64110b;
import com.google.protos.youtube.elements.C66059au;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.v */
/* compiled from: PG */
public final class C109981v implements C21312s {

    /* renamed from: a */
    public final C21232ab f306440a;

    /* renamed from: b */
    public final C107698i f306441b;

    /* renamed from: c */
    public final C68214a f306442c;

    /* renamed from: d */
    public final C107710u f306443d;

    /* renamed from: e */
    private final C68214a f306444e;

    public C109981v(C21232ab abVar, C107698i iVar, C68214a aVar, C107710u uVar, C68214a aVar2) {
        this.f306440a = abVar;
        this.f306441b = iVar;
        this.f306442c = aVar;
        this.f306443d = uVar;
        this.f306444e = aVar2;
    }

    /* renamed from: d */
    public static ClientEventData m183176d(C107475an anVar) {
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_TEXT_TO_SPEECH;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107473al.f299053a, anVar);
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        return jVar.mo82013a();
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64110b.f173322h;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ p5488io.p5490b.C69794a mo25804c(java.lang.Object r6, com.google.android.libraries.elements.interfaces.C21311r r7) {
        /*
            r5 = this;
            com.google.protos.aw.c.a.a.a.a.a.b r6 = (com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64110b) r6
            int r7 = r6.f173324a
            r0 = 1
            r7 = r7 & r0
            r1 = 6
            r2 = 3
            if (r7 == 0) goto L_0x000b
            goto L_0x0014
        L_0x000b:
            int r7 = r6.f173325b
            if (r7 == r2) goto L_0x0014
            if (r7 == r1) goto L_0x0014
        L_0x0011:
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x0082
        L_0x0014:
            com.google.speech.k.a.ah r7 = com.google.speech.p5224k.p5225a.C67190ah.f182619q
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.speech.k.a.ae r7 = (com.google.speech.p5224k.p5225a.C67187ae) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.speech.k.a.ah r3 = (com.google.speech.p5224k.p5225a.C67190ah) r3
            int r4 = r3.f182622a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r3.f182622a = r4
            r3.f182629h = r0
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.speech.k.a.ah r3 = (com.google.speech.p5224k.p5225a.C67190ah) r3
            int r4 = r3.f182622a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r3.f182622a = r4
            r3.f182630i = r0
            int r3 = r6.f173325b
            if (r3 != r1) goto L_0x0052
            java.lang.Object r1 = r6.f173326c     // Catch:{ ct -> 0x0011 }
            com.google.protobuf.z r1 = (com.google.protobuf.C63088z) r1     // Catch:{ ct -> 0x0011 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0011 }
            com.google.speech.k.a.ah r4 = com.google.speech.p5224k.p5225a.C67190ah.f182619q     // Catch:{ ct -> 0x0011 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0011 }
            com.google.speech.k.a.ah r1 = (com.google.speech.p5224k.p5225a.C67190ah) r1     // Catch:{ ct -> 0x0011 }
            r7.mergeFrom(r1)     // Catch:{ ct -> 0x0011 }
            goto L_0x007e
        L_0x0052:
            if (r3 != r2) goto L_0x006b
            java.lang.Object r1 = r6.f173326c
            java.lang.String r1 = (java.lang.String) r1
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.speech.k.a.ah r3 = (com.google.speech.p5224k.p5225a.C67190ah) r3
            r1.getClass()
            int r4 = r3.f182622a
            r4 = r4 | 2
            r3.f182622a = r4
            r3.f182626e = r1
            goto L_0x007e
        L_0x006b:
            java.lang.String r1 = r6.f173327d
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.speech.k.a.ah r3 = (com.google.speech.p5224k.p5225a.C67190ah) r3
            r1.getClass()
            int r4 = r3.f182622a
            r4 = r4 | r0
            r3.f182622a = r4
            r3.f182625d = r1
        L_0x007e:
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
        L_0x0082:
            boolean r1 = r7.mo56113h()
            if (r1 != 0) goto L_0x00bc
            java.lang.String r7 = r6.f173329f
            boolean r7 = com.google.common.base.C58879cp.m90962d(r7)
            if (r7 != 0) goto L_0x00b7
            com.google.android.libraries.elements.interfaces.ab r7 = r5.f306440a
            java.lang.String r6 = r6.f173329f
            com.google.protos.aw.c.a.a.a.a.a.e r1 = com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64113e.f173331c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.protos.aw.c.a.a.a.a.a.c r1 = (com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64111c) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.protos.aw.c.a.a.a.a.a.e r3 = (com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64113e) r3
            r3.f173334b = r2
            int r2 = r3.f173333a
            r0 = r0 | r2
            r3.f173333a = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.protos.aw.c.a.a.a.a.a.e r0 = (com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64113e) r0
            byte[] r0 = r0.toByteArray()
            r7.mo26140c(r6, r0)
        L_0x00b7:
            io.b.a r6 = p5488io.p5490b.p5497e.p5502e.p5503a.C69874i.f186267a
            io.b.d.d r7 = p5488io.p5490b.p5517i.C70101a.f186847o
            goto L_0x00d5
        L_0x00bc:
            com.google.android.apps.gsa.staticplugins.opa.s.a.t r0 = new com.google.android.apps.gsa.staticplugins.opa.s.a.t
            r0.<init>(r5, r6, r7)
            io.b.a r6 = p5488io.p5490b.C69794a.m101253c(r0)
            dagger.a r7 = r5.f306444e
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r7 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r7
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90067ds.f249705b
            boolean r7 = r7.mo79746e(r0)
            if (r7 != 0) goto L_0x00d6
        L_0x00d5:
            return r6
        L_0x00d6:
            io.b.t r7 = p5488io.p5490b.p5491a.p5493b.C69797b.f186184a
            p5488io.p5490b.p5491a.p5492a.C69795a.m101266a(r7)
            io.b.a r6 = r6.mo61452j(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a.C109981v.mo25804c(java.lang.Object, com.google.android.libraries.elements.interfaces.r):io.b.a");
    }
}
