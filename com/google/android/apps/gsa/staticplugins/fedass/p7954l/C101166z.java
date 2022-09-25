package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.content.Context;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.n.b;
import com.google.android.apps.gsa.p5865i.p5866a.C74582a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.debug.C91025i;
import com.google.android.apps.gsa.shared.util.debug.C91026j;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100721ad;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o;
import com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100900al;
import com.google.android.libraries.assistant.portable.p1586b.C19065ai;
import com.google.android.libraries.assistant.portable.p1586b.C19066aj;
import com.google.android.libraries.assistant.portable.p1586b.C19080l;
import com.google.android.libraries.assistant.portable.p1586b.C19081m;
import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65844m;
import com.google.protos.p5129p.p5131b.C65845n;
import dagger.C68214a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executor;
import java.util.zip.ZipOutputStream;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.z */
/* compiled from: PG */
public final class C101166z extends C74582a {

    /* renamed from: a */
    public static final C59071e f282396a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.l.z");

    /* renamed from: b */
    public final C68214a f282397b;

    /* renamed from: c */
    public final C68214a f282398c;

    /* renamed from: d */
    public final C101128ai f282399d;

    /* renamed from: e */
    public final C92486a f282400e;

    /* renamed from: f */
    public final C68214a f282401f;

    /* renamed from: g */
    public final C86124t f282402g;

    /* renamed from: h */
    public final C100721ad f282403h;

    /* renamed from: i */
    public final Executor f282404i;

    /* renamed from: j */
    public final C100900al f282405j;

    /* renamed from: k */
    public final Geller f282406k;

    /* renamed from: l */
    private final Context f282407l;

    /* renamed from: m */
    private final C68214a f282408m;

    /* renamed from: n */
    private final C22871g f282409n;

    /* renamed from: o */
    private final C69464a f282410o;

    /* renamed from: p */
    private final C69464a f282411p;

    /* renamed from: q */
    private final C100784o f282412q;

    /* renamed from: r */
    private final C100719ab f282413r;

    /* renamed from: s */
    private final C68214a f282414s;

    /* renamed from: t */
    private final C32160b f282415t;

    public C101166z(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar, C69464a aVar4, C69464a aVar5, C101128ai aiVar, C100784o oVar, C100719ab abVar, C92486a aVar6, C68214a aVar7, C86124t tVar, C100721ad adVar, Executor executor, C68214a aVar8, C100900al alVar, b bVar, C32160b bVar2) {
        this.f282407l = context;
        this.f282408m = aVar;
        this.f282397b = aVar2;
        this.f282398c = aVar3;
        this.f282409n = gVar;
        this.f282410o = aVar4;
        this.f282399d = aiVar;
        this.f282411p = aVar5;
        this.f282412q = oVar;
        this.f282413r = abVar;
        this.f282400e = aVar6;
        this.f282401f = aVar7;
        this.f282402g = tVar;
        this.f282403h = adVar;
        this.f282404i = executor;
        this.f282414s = aVar8;
        this.f282405j = alVar;
        this.f282406k = bVar.a();
        this.f282415t = bVar2;
    }

    /* renamed from: a */
    public final void mo92142a(int i, byte[] bArr) {
        Optional optional = (Optional) this.f282408m.mo27525b();
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) f282396a.mo56225c()).mo56372aa(19819)).mo56386p("trainingCacheEntryPoint is absent.");
        }
        this.f282409n.mo28211k(this.f282409n.mo28202b("[FedAss]cacheClientEvent", new C101145e(optional, i, bArr)), "[FedAss]cacheClientEvent", new C101162v());
    }

    /* renamed from: b */
    public final void mo92143b() {
        this.f282409n.mo28211k(this.f282409n.mo28210j(this.f282409n.mo28202b("[FedAss] TrainNow", new C101143c(this)), "TrianNowAfterMaintenance", new C101144d(this)), "[FedAss] TrainNow callback", new C101161u());
    }

    /* renamed from: c */
    public final boolean mo92144c() {
        ZipOutputStream zipOutputStream;
        Context context = this.f282407l;
        File b = C91026j.m148687b(context, "fed_ass_dump.zip");
        b.getParentFile().getClass();
        C58838bb.m90873h(b.getParentFile().getName().equals("dump"), "File %s is not located in /dump directory", b.getPath());
        Path path = new File(this.f282407l.getNoBackupFilesDir(), "fedass").toPath();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b);
            try {
                zipOutputStream = new ZipOutputStream(fileOutputStream);
                Files.walkFileTree(path, new C101163w(path, zipOutputStream));
                C91025i.m148685a("training cache dump", context, b);
                zipOutputStream.close();
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f282396a.mo56225c()).mo56382g(e)).mo56372aa(19826)).mo56384n();
            return false;
        } catch (Throwable th2) {
            C101119a.m167321a(th, th2);
        }
    }

    /* renamed from: d */
    public final void mo92145d(c cVar) {
        Optional optional = (Optional) this.f282408m.mo27525b();
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) f282396a.mo56225c()).mo56372aa(19820)).mo56386p("trainingCacheEntryPoint is absent.");
            return;
        }
        C60870cx g = ((C100719ab) this.f282414s.mo27525b()).mo92023g();
        C47633f i = C47633f.m84733g(g).mo51516i(new C101154n(optional), this.f282404i).mo51516i(new C101155o(this, g), this.f282404i);
        C101164x xVar = new C101164x(cVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(xVar), this.f282404i);
    }

    /* renamed from: e */
    public final void mo92146e(c cVar) {
        C47633f h = C47633f.m84733g(this.f282415t.mo37974b()).mo51515h(C101151k.f282375a, this.f282404i);
        Optional empty = Optional.empty();
        C51209d dVar = C51209d.SPOKEN;
        C19087s sVar = (C19087s) C19088t.f53533p.createBuilder();
        sVar.copyOnWrite();
        C19088t tVar = (C19088t) sVar.instance;
        tVar.f53535a |= 1;
        tVar.f53536b = BuildConfig.FLAVOR;
        sVar.copyOnWrite();
        C19088t tVar2 = (C19088t) sVar.instance;
        tVar2.f53535a |= 2;
        tVar2.f53537c = "en-US";
        C19080l lVar = (C19080l) C19081m.f53515g.createBuilder();
        C19065ai aiVar = (C19065ai) C19066aj.f53483e.createBuilder();
        aiVar.mo24282a(dVar);
        C19066aj ajVar = (C19066aj) aiVar.build();
        lVar.copyOnWrite();
        C19081m mVar = (C19081m) lVar.instance;
        ajVar.getClass();
        mVar.f53519c = ajVar;
        mVar.f53517a |= 8;
        C19081m mVar2 = (C19081m) lVar.build();
        sVar.copyOnWrite();
        C19088t tVar3 = (C19088t) sVar.instance;
        mVar2.getClass();
        tVar3.f53542h = mVar2;
        tVar3.f53535a |= 128;
        C19088t tVar4 = (C19088t) sVar.build();
        C65844m mVar3 = (C65844m) C65845n.f178992c.createBuilder();
        mVar3.copyOnWrite();
        C65845n nVar = (C65845n) mVar3.instance;
        tVar4.getClass();
        nVar.f178995b = tVar4;
        nVar.f178994a |= 2;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        C65138c cVar2 = (C65138c) C65139d.f176307e.createBuilder();
        cVar2.copyOnWrite();
        C65139d dVar2 = (C65139d) cVar2.instance;
        dVar2.f176309a |= 1;
        dVar2.f176310b = 1;
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        C65139d dVar3 = (C65139d) cVar2.build();
        dVar3.getClass();
        azVar.f178796b = dVar3;
        azVar.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        C63088z byteString = ((C65845n) mVar3.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        C63070h hVar = (C63070h) gVar.build();
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        hVar.getClass();
        azVar2.f178799e = hVar;
        azVar2.f178795a |= 8;
        if (empty.isPresent()) {
            String str = (String) empty.get();
            ayVar.copyOnWrite();
            C65768az azVar3 = (C65768az) ayVar.instance;
            str.getClass();
            azVar3.f178795a |= 4;
            azVar3.f178798d = str;
        }
        C65768az azVar4 = (C65768az) ayVar.build();
        C60856cj.m92911t(C47633f.m84733g(h).mo51516i(new C101152l(this, azVar4), this.f282404i).mo51516i(new C101153m(this, h, azVar4), this.f282404i).f164926b, C47810es.m84974n(new C101160t(cVar)), this.f282404i);
    }

    /* renamed from: f */
    public final void mo92147f(c cVar) {
        C60870cx d = ((C42876ab) ((C100719ab) this.f282414s.mo27525b()).f281602a.mo27525b()).mo46042d();
        C101165y yVar = new C101165y(cVar);
        C60856cj.m92911t(d, C47810es.m84974n(yVar), this.f282404i);
    }

    /* renamed from: g */
    public final void mo92148g(c cVar) {
        ((C59052c) ((C59052c) C101137ar.f282348a.mo56225c()).mo56372aa(19849)).mo56386p("getSheldonAllSessionsData()");
        ((C101137ar) this.f282410o.mo17428b()).mo92139a(Optional.empty(), cVar);
    }

    /* renamed from: h */
    public final void mo92149h(c cVar) {
        C101137ar arVar = (C101137ar) this.f282410o.mo17428b();
        ((C59052c) ((C59052c) C101137ar.f282348a.mo56224b()).mo56372aa(19850)).mo56386p("getSheldonSessions()");
        C100784o oVar = arVar.f282350c;
        Objects.requireNonNull(oVar);
        C101133an anVar = new C101133an(oVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(anVar), arVar.f282352e);
        arVar.f282351d.mo24615a();
        C47633f.m84733g(n).mo51515h(new C101134ao(cVar), arVar.f282352e);
    }

    /* renamed from: i */
    public final void mo92150i(long j, c cVar) {
        ((C101137ar) this.f282410o.mo17428b()).mo92139a(Optional.m71637of(Long.valueOf(j)), cVar);
    }

    /* renamed from: j */
    public final void mo92151j(c cVar) {
        C101137ar arVar = (C101137ar) this.f282410o.mo17428b();
        ((C59052c) ((C59052c) C101137ar.f282348a.mo56224b()).mo56372aa(19851)).mo56386p("getSheldonSessions()");
        C100784o oVar = arVar.f282350c;
        Objects.requireNonNull(oVar);
        C101130ak akVar = new C101130ak(oVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(akVar), arVar.f282352e);
        arVar.f282351d.mo24615a();
        C47633f h = C47633f.m84733g(n).mo51515h(new C101132am(arVar, cVar), arVar.f282352e);
        C101135ap apVar = new C101135ap(cVar);
        C60856cj.m92911t(h.f164926b, C47810es.m84974n(apVar), arVar.f282352e);
    }

    /* renamed from: k */
    public final void mo92152k(c cVar) {
        C101141av avVar = (C101141av) this.f282411p.mo17428b();
        C100784o oVar = avVar.f282359c;
        Objects.requireNonNull(oVar);
        C101138as asVar = new C101138as(oVar);
        C47633f i = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(asVar), avVar.f282360d)).mo51516i(new C101139at(avVar, cVar), avVar.f282360d);
        C101140au auVar = new C101140au(cVar);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(auVar), avVar.f282360d);
    }

    /* renamed from: l */
    public final void mo92153l(c cVar) {
        ((C59052c) ((C59052c) f282396a.mo56224b()).mo56372aa(19825)).mo56386p("retrieveDebugConfig");
        C22871g gVar = this.f282409n;
        C100784o oVar = this.f282412q;
        Objects.requireNonNull(oVar);
        C60870cx b = gVar.mo28202b("[FedAssTestBinder]policyConfigTask", new C101146f(oVar));
        C22871g gVar2 = this.f282409n;
        C100719ab abVar = this.f282413r;
        Objects.requireNonNull(abVar);
        C60870cx b2 = gVar2.mo28202b("[FedAssTestBinder]accountParamsTask", new C101147g(abVar));
        new C90873ag(C60856cj.m92895d(b2, b).mo57335b(C47810es.m84965e(new C101148h(this, b2, b, cVar)), this.f282404i), this.f282409n, "callback of getDebugConfigValues", C101149i.f282373a).mo85223a(C101150j.f282374a);
    }

    /* renamed from: m */
    public final void mo92154m(Bundle bundle, c cVar) {
        new C90873ag(this.f282409n.mo28210j(this.f282409n.mo28202b("[FedAssTestBinder]TrainPeriodicTask", new C101157q(this)), "[FedAssTestBinder]StartMaterialization", new C101158r(this, bundle, cVar)), this.f282409n, "[FedAssTestBinder]MaterializationCallback", C101159s.f282390a).mo85223a(C101142b.f282361a);
    }
}
