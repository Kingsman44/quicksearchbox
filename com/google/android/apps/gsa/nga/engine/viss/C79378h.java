package com.google.android.apps.gsa.nga.engine.viss;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Debug;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.assistant.settings.features.p529a.p531b.C9779b;
import com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.api.C74682ab;
import com.google.android.apps.gsa.nga.api.C74688ai;
import com.google.android.apps.gsa.nga.api.C74694au;
import com.google.android.apps.gsa.nga.api.C74701ba;
import com.google.android.apps.gsa.nga.api.C74704bd;
import com.google.android.apps.gsa.nga.api.C74731k;
import com.google.android.apps.gsa.nga.api.C74737q;
import com.google.android.apps.gsa.nga.api.ForegroundSignalType;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.api.al;
import com.google.android.apps.gsa.nga.api.ar;
import com.google.android.apps.gsa.nga.api.t;
import com.google.android.apps.gsa.nga.api.w;
import com.google.android.apps.gsa.nga.engine.ae.l;
import com.google.android.apps.gsa.nga.engine.am.l.b.a;
import com.google.android.apps.gsa.nga.engine.am.l.b.c;
import com.google.android.apps.gsa.nga.engine.am.l.b.d;
import com.google.android.apps.gsa.nga.engine.ar.ck;
import com.google.android.apps.gsa.nga.engine.ar.cl;
import com.google.android.apps.gsa.nga.engine.ar.cm;
import com.google.android.apps.gsa.nga.engine.ar.cq;
import com.google.android.apps.gsa.nga.engine.as.f;
import com.google.android.apps.gsa.nga.engine.as.g;
import com.google.android.apps.gsa.nga.engine.av.be;
import com.google.android.apps.gsa.nga.engine.b.b;
import com.google.android.apps.gsa.nga.engine.bisto.C75309c;
import com.google.android.apps.gsa.nga.engine.education.C75688am;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.p5897ae.C74800o;
import com.google.android.apps.gsa.nga.engine.p5913am.p5914a.C74862a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5919f.p5920a.C74890a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5923j.p5924a.C74925a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5926l.p5928b.C74928e;
import com.google.android.apps.gsa.nga.engine.p5913am.p5933n.C74942e;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74946b;
import com.google.android.apps.gsa.nga.engine.p5913am.p5941w.p5942a.C74975e;
import com.google.android.apps.gsa.nga.engine.p5960as.C75040d;
import com.google.android.apps.gsa.nga.engine.p5960as.C75041h;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75119bv;
import com.google.android.apps.gsa.nga.engine.p5964av.p5970d.C75156a;
import com.google.android.apps.gsa.nga.engine.p5972aw.C75165g;
import com.google.android.apps.gsa.nga.engine.p5994c.C75325d;
import com.google.android.apps.gsa.nga.engine.p5994c.C75331t;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6096p.C77454k;
import com.google.android.apps.gsa.nga.engine.p6096p.C77467x;
import com.google.android.apps.gsa.nga.engine.p6140t.C77974n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6102a.C77497a;
import com.google.android.apps.gsa.nga.engine.recognition.p6119h.p6120a.C77652a;
import com.google.android.apps.gsa.nga.engine.recognition.p6134n.C77867a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80456d;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6301a.C80545c;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b.C80547b;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80970b;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80997q;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80998r;
import com.google.android.apps.gsa.nga.shared.p6328ap.C81002v;
import com.google.android.apps.gsa.nga.shared.p6334b.C81015a;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.nga.shared.p6363s.C81457f;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81487e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82783ag;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82786aj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6416w.C83338a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88412aj;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88414al;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.p7038f.p7039a.C89758r;
import com.google.android.apps.gsa.shared.proto.p7126io.LargeProtoParcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.libraries.appactions.p11035a.C147828ad;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.assistant.p1484g.p1502d.C18155ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.p445a.C8850c;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.ahi;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.h */
/* compiled from: PG */
final class C79378h extends C74682ab {

    /* renamed from: a */
    final /* synthetic */ NgaService f217998a;

    public C79378h(NgaService ngaService) {
        this.f217998a = ngaService;
    }

    /* renamed from: A */
    public final void mo73949A(int i, boolean z) {
        ((C75156a) this.f217998a.f217944t.mo27525b()).mo71504b();
        C81015a aVar = new C81015a();
        aVar.mo74797e(e.a(i));
        aVar.mo74798f();
        aVar.mo74795c();
        ((C81016b) this.f217998a.f217943s.mo27525b()).mo74800a(aVar.mo74793a());
    }

    /* renamed from: B */
    public final void mo73950B(C74737q qVar) {
        ((C79375e) this.f217998a.f217915C.mo27525b()).mo71124j(qVar);
    }

    /* renamed from: C */
    public final void mo73951C() {
        C75041h hVar = (C75041h) this.f217998a.f217934j.mo27525b();
        C22871g gVar = hVar.f209307h;
        C91142g gVar2 = hVar.f209301b;
        Objects.requireNonNull(gVar2);
        gVar.mo28212l("[NGA] onLocationAccessChanged", new C75040d(gVar2));
    }

    /* renamed from: D */
    public final void mo73952D() {
        if (((C76092h) this.f217998a.f217919G.mo27525b()).mo72021b().mo72042g()) {
            cq cqVar = (cq) this.f217998a.f217936l.mo27525b();
            C60922j.m93045h(C60846c.m92878g(C60838bs.m92859i(cqVar.b.mo72022c()), Exception.class, ck.a, C60826bg.f164896a), new cl(cqVar), new cm(cqVar));
        }
    }

    /* renamed from: E */
    public final void mo73953E(ProtoLiteParcelable protoLiteParcelable) {
        ((C74800o) this.f217998a.f217949y.mo27525b()).mo71173a(protoLiteParcelable);
    }

    /* renamed from: F */
    public final void mo73954F(ProtoLiteParcelable protoLiteParcelable) {
        ((C75910k) this.f217998a.f217947w.mo27525b()).mo71910b(protoLiteParcelable);
    }

    /* renamed from: G */
    public final void mo73955G(int i) {
        C75041h hVar = (C75041h) this.f217998a.f217934j.mo27525b();
        C81251ap apVar = C81251ap.values()[i];
        new C90873ag(hVar.f209305f.mo75086a(apVar), hVar.f209306g, "[NGA] NgaCrossProcessPrefsNotifier.onNgaDataStoreChanged", new f(hVar, apVar)).mo85223a(g.a);
    }

    /* renamed from: H */
    public final void mo73956H(ProtoLiteParcelable protoLiteParcelable) {
        ((C75309c) this.f217998a.f217918F.mo27525b()).mo71655k(protoLiteParcelable);
    }

    /* renamed from: I */
    public final void mo73957I(String str) {
        ((be) this.f217998a.f217929e.mo27525b()).c(str);
    }

    /* renamed from: J */
    public final void mo73958J() {
        ((be) this.f217998a.f217929e.mo27525b()).d();
    }

    /* renamed from: K */
    public final void mo73959K(String str) {
        ((C77867a) this.f217998a.f217939o.mo27525b()).mo72852f(str);
    }

    /* renamed from: L */
    public final void mo73960L(long j, C80545c cVar) {
        C77652a aVar = (C77652a) this.f217998a.f217916D.mo27525b();
        C80547b bVar = (C80547b) aVar.f213880c.get();
        if (bVar == null) {
            ((C58970a) ((C58970a) C77652a.f213878a.mo56224b()).mo56372aa(4342)).mo56386p("onRemoteAudioRecordingRequest: recording is null");
            C77652a.m124625a(cVar, (C80547b) null);
            return;
        }
        C83320io ioVar = bVar.f221096e;
        if (ioVar == null) {
            ioVar = C83320io.f227132d;
        }
        if (j == C39191a.m68622a(aVar.f213879b.mo74223h(ioVar))) {
            C77652a.m124625a(cVar, bVar);
            return;
        }
        ((C58970a) ((C58970a) C77652a.f213878a.mo56224b()).mo56372aa(4340)).mo56386p("onRemoteAudioRecordingRequest: utteranceId does not match. Sending empty");
        C77652a.m124625a(cVar, (C80547b) null);
    }

    /* renamed from: M */
    public final void mo73961M(Bundle bundle, int i) {
        ((C79375e) this.f217998a.f217915C.mo27525b()).mo71125k(bundle, i);
    }

    /* renamed from: N */
    public final void mo73962N(String str) {
        ((C77867a) this.f217998a.f217939o.mo27525b()).mo72850d(str);
    }

    /* renamed from: O */
    public final void mo73963O(String str, Bundle bundle, al alVar) {
        C74928e eVar = (C74928e) this.f217998a.f217945u.mo27525b();
        eVar.f209131c.mo28211k(eVar.f209130b.f(C18100a.m35256b(new d(str), bundle), C83320io.f227132d), "[NGA] OpaDirectActionsNgaAdapter.performDirectAction", new a(alVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73964P(java.lang.String r6, android.os.Bundle r7, boolean r8, com.google.android.apps.gsa.nga.api.ao r9) {
        /*
            r5 = this;
            com.google.android.apps.gsa.nga.engine.viss.NgaService r0 = r5.f217998a
            dagger.a r0 = r0.f217946v
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.nga.engine.am.m.a.t r0 = (com.google.android.apps.gsa.nga.engine.am.m.a.t) r0
            int r1 = r6.hashCode()
            r2 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0025
            r2 = 1536904518(0x5b9b4d46, float:8.7427169E16)
            if (r1 == r2) goto L_0x001b
            goto L_0x002f
        L_0x001b:
            java.lang.String r1 = "checkout"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x0025:
            java.lang.String r1 = "search"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x002f
            r6 = 0
            goto L_0x0030
        L_0x002f:
            r6 = -1
        L_0x0030:
            if (r6 == 0) goto L_0x0059
            if (r6 == r4) goto L_0x003a
            java.lang.String r6 = com.google.android.apps.gsa.nga.engine.am.m.a.t.a
            com.google.android.apps.gsa.nga.engine.am.m.a.t.c(r6, r9)
            return
        L_0x003a:
            com.google.android.libraries.assistant.g.c.d.a r6 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C18058w.f51532a
            com.google.android.libraries.assistant.g.c.a.b.a r7 = new com.google.android.libraries.assistant.g.c.a.b.a
            r7.<init>()
            com.google.android.libraries.assistant.g.c.a.b.v r7 = r7.mo23506a()
            com.google.android.libraries.assistant.g.c.b.a r6 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r6, r7)
            com.google.android.libraries.assistant.g.c.a.b.c r7 = new com.google.android.libraries.assistant.g.c.a.b.c
            r7.<init>()
            com.google.android.libraries.assistant.g.c.a.b.ab r7 = r7.mo23506a()
            com.google.android.libraries.assistant.g.c.a.b.ch r1 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C17967ac.f51428a
            com.google.android.libraries.assistant.g.c.a.b.ck r6 = r1.mo23546a(r7, r6)
            goto L_0x0092
        L_0x0059:
            java.lang.String r6 = "SEARCH_QUERY"
            java.lang.String r1 = r7.getString(r6)
            if (r1 == 0) goto L_0x00ea
            java.lang.String r7 = r7.getString(r6)
            if (r7 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            java.lang.String r1 = "missing required param %s"
            com.google.common.base.C58838bb.m90873h(r4, r1, r6)
            com.google.android.libraries.assistant.g.c.d.a r6 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C18038ct.f51490a
            com.google.android.libraries.assistant.g.c.a.b.o r1 = new com.google.android.libraries.assistant.g.c.a.b.o
            r1.<init>()
            r1.mo23551d(r7)
            com.google.android.libraries.assistant.g.c.a.b.cs r1 = r1.mo23506a()
            com.google.android.libraries.assistant.g.c.b.a r6 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r6, r1)
            com.google.android.libraries.assistant.g.c.a.b.i r1 = new com.google.android.libraries.assistant.g.c.a.b.i
            r1.<init>()
            r1.mo23524d(r7)
            com.google.android.libraries.assistant.g.c.a.b.ax r7 = r1.mo23506a()
            com.google.android.libraries.assistant.g.c.a.b.ch r1 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C17989ay.f51445a
            com.google.android.libraries.assistant.g.c.a.b.ck r6 = r1.mo23546a(r7, r6)
        L_0x0092:
            com.google.android.libraries.gsa.k.g r7 = r0.e
            if (r8 != 0) goto L_0x00a6
            com.google.common.f.a.d r8 = com.google.android.apps.gsa.nga.engine.am.m.a.t.c
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r1 = "Skipping fetching supported website actions."
            r2 = 4643(0x1223, float:6.506E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r8 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            goto L_0x00b4
        L_0x00a6:
            com.google.android.apps.gsa.nga.engine.am.m.b.t r8 = r0.d
            java.lang.String r1 = r6.f51484d
            com.google.android.apps.gsa.nga.shared.v.io r2 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d
            com.google.common.util.concurrent.cx r8 = r8.d(r1, r2, r3)
            com.google.common.util.concurrent.cx r8 = com.google.android.apps.gsa.p8883x.C118826c.m197213c(r8)
        L_0x00b4:
            com.google.android.apps.gsa.nga.engine.am.m.a.b r1 = new com.google.android.apps.gsa.nga.engine.am.m.a.b
            r1.<init>(r0, r6)
            java.lang.String r6 = "[NGA] OpaDynamicActionNgaAdapter: maybe onboarding and sending the dynamic action"
            com.google.common.util.concurrent.cx r6 = r7.mo28210j(r8, r6, r1)
            com.google.android.libraries.gsa.k.g r7 = r0.e
            com.google.android.apps.gsa.nga.engine.am.m.a.o r8 = new com.google.android.apps.gsa.nga.engine.am.m.a.o
            r8.<init>(r9)
            com.google.android.apps.gsa.shared.util.c.ag r0 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r1 = "Sending dynamic action finished."
            r0.<init>(r6, r7, r1, r8)
            com.google.android.apps.gsa.nga.engine.am.m.a.p r6 = new com.google.android.apps.gsa.nga.engine.am.m.a.p
            r6.<init>(r9)
            java.lang.Class<com.google.android.apps.gsa.nga.shared.k.a> r7 = com.google.android.apps.gsa.nga.shared.p6350k.C81338a.class
            r0.mo85224b(r7, r6)
            com.google.android.apps.gsa.nga.engine.am.m.a.q r6 = new com.google.android.apps.gsa.nga.engine.am.m.a.q
            r6.<init>(r9)
            java.lang.Class<com.google.android.libraries.assistant.g.d.l> r7 = com.google.android.libraries.assistant.p1484g.p1502d.C18175l.class
            r0.mo85224b(r7, r6)
            com.google.android.apps.gsa.nga.engine.am.m.a.r r6 = new com.google.android.apps.gsa.nga.engine.am.m.a.r
            r6.<init>(r9)
            r0.mo85223a(r6)
            return
        L_0x00ea:
            java.lang.String r6 = com.google.android.apps.gsa.nga.engine.am.m.a.t.b
            com.google.android.apps.gsa.nga.engine.am.m.a.t.c(r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.viss.C79378h.mo73964P(java.lang.String, android.os.Bundle, boolean, com.google.android.apps.gsa.nga.api.ao):void");
    }

    /* renamed from: Q */
    public final void mo73965Q() {
        C75325d dVar = (C75325d) this.f217998a.f217914B.mo27525b();
    }

    /* renamed from: R */
    public final void mo73966R(C74694au auVar) {
        ((C75165g) this.f217998a.f217941q.mo27525b()).f209602a.set(auVar);
    }

    /* renamed from: S */
    public final void mo73967S(C74704bd bdVar) {
        NgaService ngaService = this.f217998a;
        ((C80970b) ngaService.f217931g.mo27525b()).mo74747h(new C80998r(bdVar));
    }

    /* renamed from: T */
    public final void mo73968T(ar arVar) {
        C74928e eVar = (C74928e) this.f217998a.f217945u.mo27525b();
        eVar.f209131c.mo28211k(eVar.f209130b.c(C83320io.f227132d), "[NGA] OpaDirectActionsNgaAdapter.requestDirectActions", new c(arVar));
    }

    /* renamed from: U */
    public final void mo73969U(ForegroundSignalType foregroundSignalType, t tVar) {
        ((C74942e) this.f217998a.f217917E.mo27525b()).mo71310a(foregroundSignalType, tVar);
    }

    /* renamed from: V */
    public final void mo73970V(MorrisRunningStatus morrisRunningStatus) {
    }

    /* renamed from: W */
    public final void mo73971W(NgaState ngaState, int i) {
        ahi a = ahi.m92401a(i);
        if (a == null) {
            a = ahi.UNKNOWN;
        }
        ((com.google.android.apps.gsa.nga.engine.b.e) this.f217998a.f217926b.mo27525b()).d(ngaState, a);
        if (!ngaState.b()) {
            this.f217998a.stopSelf();
        }
    }

    /* renamed from: X */
    public final void mo73972X(C74701ba baVar) {
        NgaService ngaService = this.f217998a;
        synchronized (ngaService.f217923K) {
            ngaService.f217924L = new C80997q(baVar);
            ((C80970b) ngaService.f217931g.mo27525b()).mo74749j(ngaService.f217924L);
        }
    }

    /* renamed from: Y */
    public final void mo73973Y(C74688ai aiVar) {
        NgaService ngaService = this.f217998a;
        synchronized (ngaService.f217923K) {
            C81002v vVar = new C81002v(aiVar);
            ((C80970b) ngaService.f217931g.mo27525b()).mo74750k(vVar);
            ((C74975e) ngaService.f217950z.mo27525b()).mo71358a(new C79379i(ngaService, vVar));
        }
    }

    /* renamed from: Z */
    public final void mo73974Z(C74694au auVar) {
        com.google.android.apps.gsa.nga.engine.aw.f.a(((C75165g) this.f217998a.f217941q.mo27525b()).f209602a, auVar);
    }

    /* renamed from: aa */
    public final void mo73975aa() {
        C75325d dVar = (C75325d) this.f217998a.f217914B.mo27525b();
    }

    /* renamed from: ab */
    public final void mo73976ab(C74731k kVar) {
        Optional optional;
        C147828ad a = ((C75331t) this.f217998a.f217913A.mo27525b()).f209809b.mo71662a();
        C142826w wVar = new C142826w();
        C58487gw b = a.mo124503b();
        if (b.mo54954G()) {
            optional = Optional.empty();
        } else {
            C58800sl lA = b.mo54948A().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                String str = (String) entry.getKey();
                Optional ofNullable = Optional.ofNullable((String) C89758r.f242950a.get((String) entry.getValue()));
                CorpusId corpusId = null;
                if (ofNullable.isPresent()) {
                    corpusId = new CorpusId(str, (String) ofNullable.get(), (Bundle) null);
                }
                Optional ofNullable2 = Optional.ofNullable(corpusId);
                if (ofNullable2.isPresent()) {
                    CorpusId corpusId2 = (CorpusId) ofNullable2.get();
                    String str2 = corpusId2.f387417a;
                    String str3 = corpusId2.f387418b;
                    wVar.mo117756b(corpusId2);
                    wVar.mo117757c(corpusId2, 1, 50);
                }
            }
            wVar.f387611d = true;
            optional = Optional.m71637of(wVar.mo117755a());
        }
        try {
            if (optional.isPresent()) {
                Parcel gA = kVar.mo17260gA();
                C8850c.m23497f(gA, (GlobalSearchQuerySpecification) optional.get());
                kVar.mo17263hf(1, gA);
                return;
            }
            Parcel gA2 = kVar.mo17260gA();
            gA2.writeString("No corpus was requested.");
            kVar.mo17263hf(2, gA2);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) C75331t.f209808a.mo56225c()).mo56382g(e)).mo56372aa(2823)).mo56386p("Exception in query spec generator");
        }
    }

    /* renamed from: e */
    public final void mo73977e() {
        ((C77497a) this.f217998a.f217948x.mo27525b()).mo72591c();
    }

    /* renamed from: f */
    public final void mo73978f(w wVar) {
        ((C58970a) ((C58970a) NgaService.f217912a.mo56224b()).mo56372aa(5539)).mo56386p("Attempting to obtain the ModelVersion from the TcLibWrapper.");
        if (!((C76092h) this.f217998a.f217919G.mo27525b()).mo72021b().mo72042g()) {
            ((C58970a) ((C58970a) NgaService.f217912a.mo56226d()).mo56372aa(5540)).mo56386p("Attempted to obtain the ModelVersion from the TcLibWrapper when on-device is not eligible.");
        } else {
            ((C22871g) this.f217998a.f217940p.mo27525b()).mo28212l("[NGA] NgaService.getModelVersion", new C79377g(this, wVar));
        }
    }

    /* renamed from: g */
    public final void mo73979g(IBinder iBinder) {
        C79396z zVar = (C79396z) this.f217998a.f217920H.mo27525b();
        zVar.f218026b.mo28212l("[NGA] SearchProcessStateTracker.trackNewSearchProcessConnection", new C79392v(zVar, iBinder));
    }

    /* renamed from: h */
    public final void mo73980h(int i, long j) {
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.m146281a(i);
        fVar.f246204d = j;
        ((C79863k) this.f217998a.f217928d.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: i */
    public final void mo73981i() {
        C83334w wVar = ((C83338a) this.f217998a.f217937m.mo27525b()).f227153a;
        C82887ec ecVar = C82887ec.MEMORY_STATS;
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        Map<String, String> memoryStats = memoryInfo.getMemoryStats();
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82783ag agVar = (C82783ag) C82786aj.f225562d.createBuilder();
        agVar.copyOnWrite();
        C82786aj ajVar = (C82786aj) agVar.instance;
        ajVar.f225565b = 1;
        ajVar.f225564a = 1 | ajVar.f225564a;
        agVar.copyOnWrite();
        C82786aj ajVar2 = (C82786aj) agVar.instance;
        C62995dn dnVar = ajVar2.f225566c;
        if (!dnVar.f170058b) {
            ajVar2.f225566c = dnVar.mo58980a();
        }
        ajVar2.f225566c.putAll(memoryStats);
        C82786aj ajVar3 = (C82786aj) agVar.build();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        ajVar3.getClass();
        eaVar.f225980b = ajVar3;
        eaVar.f225979a = 41;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
    }

    /* renamed from: j */
    public final void mo73982j(ProtoLiteParcelable protoLiteParcelable) {
        C74862a aVar = (C74862a) this.f217998a.f217922J.mo27525b();
        C9779b bVar = (C9779b) protoLiteParcelable.mo84191d(C9779b.f33746d.getParserForType());
        if (bVar == null) {
            ((C58970a) ((C58970a) C74862a.f209051a.mo56225c()).mo56372aa(4555)).mo56386p("No changes on accessibility settings.");
            return;
        }
        aVar.f209053c.set(bVar.f33749b);
        aVar.f209054d.set(bVar.f33750c);
    }

    /* renamed from: k */
    public final void mo73983k(String str) {
        ((be) this.f217998a.f217929e.mo27525b()).a(str);
    }

    /* renamed from: l */
    public final void mo73984l() {
        ((C79375e) this.f217998a.f217915C.mo27525b()).mo71119e();
    }

    /* renamed from: m */
    public final void mo73985m() {
        ((C79375e) this.f217998a.f217915C.mo27525b()).mo71120f();
    }

    /* renamed from: n */
    public final void mo73986n(String str) {
        ((b) this.f217998a.f217927c.mo27525b()).b(str);
    }

    /* renamed from: o */
    public final void mo73987o(Bundle bundle, C81487e eVar) {
        ((l) this.f217998a.f217935k.mo27525b()).a(bundle, eVar);
    }

    /* renamed from: p */
    public final void mo73988p(Bundle bundle, byte[] bArr) {
        ((l) this.f217998a.f217935k.mo27525b()).b(bundle, bArr);
    }

    /* renamed from: q */
    public final void mo73989q(List list) {
        C75041h hVar = (C75041h) this.f217998a.f217934j.mo27525b();
        hVar.f209307h.mo28212l("[NGA] onNgaConfigFlagChanged", new com.google.android.apps.gsa.nga.engine.as.e(hVar, C58528ij.m90006F(list)));
    }

    /* renamed from: r */
    public final void mo73990r(int i) {
        int i2;
        C74890a aVar = (C74890a) this.f217998a.f217921I.mo27525b();
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            default:
                i2 = 0;
                break;
        }
        synchronized (aVar.f209087a) {
            aVar.f209088b = i2;
        }
    }

    /* renamed from: s */
    public final void mo73991s(int i) {
        ((C79375e) this.f217998a.f217915C.mo27525b()).mo71121g(i);
    }

    /* renamed from: t */
    public final void mo73992t(byte[] bArr, Bundle bundle) {
        ((l) this.f217998a.f217935k.mo27525b()).f(bArr, bundle);
    }

    /* renamed from: u */
    public final void mo73993u() {
        ((C74946b) this.f217998a.f217930f.mo27525b()).mo71314d();
    }

    /* renamed from: v */
    public final void mo73994v(byte[] bArr) {
        C74925a aVar = (C74925a) this.f217998a.f217942r.mo27525b();
        try {
            C88414al alVar = (C88414al) C62942bv.parseFrom((C62942bv) C88414al.f239058c, bArr, C62921ba.m95368a());
            int i = alVar.f239060a;
            if (i == 1) {
                C75688am amVar = aVar.f209127b;
                if (amVar.mo71835k(((C88412aj) alVar.f239061b).f239056a)) {
                    ((C75119bv) amVar.f210110m.mo27525b()).mo71499a();
                }
            } else if (i == 2) {
                aVar.f209128c.mo71499a();
            } else {
                ((C58970a) ((C58970a) C74925a.f209126a.mo56226d()).mo56372aa(4605)).mo56386p("External deeplink invoked, but no valid action was attached.");
            }
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) C74925a.f209126a.mo56225c()).mo56382g(e)).mo56372aa(4606)).mo56386p("Invalid protobuf received");
        }
    }

    /* renamed from: w */
    public final void mo73995w(int i) {
        if (((C76092h) this.f217998a.f217919G.mo27525b()).mo72021b().mo72042g()) {
            C77467x xVar = (C77467x) this.f217998a.f217932h.mo27525b();
            if (xVar.mo71201gC()) {
                C65753ak b = C65753ak.m96797b(i);
                int ordinal = b.ordinal();
                if (ordinal == 3) {
                    C81457f fVar = xVar.f213499f;
                    fVar.mo75091b(fVar.f222871a);
                } else if (ordinal == 8) {
                    xVar.mo72579d();
                } else if (ordinal == 20) {
                    xVar.mo72580e();
                } else if (ordinal == 27) {
                    C81457f fVar2 = xVar.f213498e;
                    fVar2.mo75091b(fVar2.f222871a);
                } else if (ordinal == 109) {
                    C81457f fVar3 = xVar.f213500g;
                    fVar3.mo75091b(fVar3.f222871a);
                } else if (ordinal == 111) {
                    xVar.mo72581g(true);
                } else if (ordinal == 86) {
                    xVar.mo72578b();
                } else if (ordinal == 87) {
                    xVar.mo72582j();
                }
                xVar.f213502i.ifPresent(new C77454k(b));
            }
        }
    }

    /* renamed from: x */
    public final void mo73996x(LargeProtoParcelable largeProtoParcelable) {
        try {
            C80456d dVar = (C80456d) largeProtoParcelable.mo84185a(C80456d.f220820b.getParserForType());
            if (dVar == null) {
                ((C58970a) ((C58970a) NgaService.f217912a.mo56226d()).mo56372aa(5542)).mo56386p("Unexpected null payload in the parcelable");
            } else {
                ((C77974n) this.f217998a.f217933i.mo27525b()).mo72933d(dVar);
            }
        } catch (IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) NgaService.f217912a.mo56226d()).mo56382g(e)).mo56372aa(5543)).mo56386p("Unable to read NgaEmailData proto from the parcelable's payload");
        }
    }

    /* renamed from: y */
    public final void mo73997y(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, C18155ag agVar) {
        ((C79375e) this.f217998a.f217915C.mo27525b()).mo71122h(bundle, assistStructure, assistContent, i, agVar);
    }

    /* renamed from: z */
    public final void mo73998z(Bitmap bitmap) {
        ((C79375e) this.f217998a.f217915C.mo27525b()).mo71123i(bitmap);
    }
}
