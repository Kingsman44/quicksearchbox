package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p756a;

import com.google.android.apps.gsa.binaries.satin.app.ajs;
import com.google.android.apps.gsa.binaries.satin.app.aju;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12036c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c.p738b.C12068c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12170b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12173e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b.C12174f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p874f.p875a.C12962c;
import com.google.android.libraries.assistant.auto.tng.common.p922k.p923a.C13276c;
import com.google.android.libraries.assistant.auto.tng.common.p926m.p927a.C13293a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1304c.p1308b.C16614b;
import com.google.android.libraries.assistant.p1363c.p1398g.C17331a;
import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17361a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17478an;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17479ao;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17482ar;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17484at;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17497bf;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17499bh;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17521x;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3929l.p3930a.C52795w;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4449cd.p4450a.C57934a;
import com.google.p4449cd.p4462i.C58048g;
import com.google.speech.p5208h.p5210b.C66572b;
import com.google.speech.p5224k.p5225a.C67190ah;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.g.a.m */
/* compiled from: PG */
public final class C12167m implements C12154a {

    /* renamed from: a */
    public static final C59071e f38855a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.g.a.m");

    /* renamed from: b */
    public final Executor f38856b;

    /* renamed from: c */
    public final C68214a f38857c;

    /* renamed from: d */
    private final C69464a f38858d;

    /* renamed from: e */
    private final int f38859e;

    /* renamed from: f */
    private final C12962c f38860f;

    /* renamed from: g */
    private final C13293a f38861g;

    /* renamed from: h */
    private final C17361a f38862h;

    /* renamed from: i */
    private final ajs f38863i;

    /* renamed from: j */
    private final C58048g f38864j;

    /* renamed from: k */
    private final C13276c f38865k;

    public C12167m(Executor executor, C13293a aVar, C68214a aVar2, C69464a aVar3, C17361a aVar4, int i, C12962c cVar, C13276c cVar2, ajs ajs, C58048g gVar) {
        this.f38856b = executor;
        this.f38861g = aVar;
        this.f38857c = aVar2;
        this.f38858d = aVar3;
        this.f38862h = aVar4;
        this.f38859e = i;
        this.f38860f = cVar;
        this.f38865k = cVar2;
        this.f38863i = ajs;
        this.f38864j = gVar;
    }

    /* renamed from: e */
    private final C17482ar m28073e() {
        C17482ar arVar = (C17482ar) C17485au.f50481h.createBuilder();
        C17484at atVar = C17484at.SERVER;
        arVar.copyOnWrite();
        C17485au auVar = (C17485au) arVar.instance;
        auVar.f50486d = atVar.f50480d;
        auVar.f50483a |= 8;
        long longValue = ((Long) this.f38858d.mo17428b()).longValue();
        arVar.copyOnWrite();
        C17485au auVar2 = (C17485au) arVar.instance;
        auVar2.f50483a |= 32;
        auVar2.f50488f = longValue * 1000;
        return arVar;
    }

    /* renamed from: f */
    private final C12036c m28074f(C12174f fVar, C70967n nVar) {
        C67190ah ahVar = fVar.f38875b;
        if (ahVar == null) {
            ahVar = C67190ah.f182619q;
        }
        C12068c cVar = new C12068c(mo20465d(ahVar, this.f38862h, nVar), this.f38856b);
        if (((Optional) this.f38857c.mo27525b()).isPresent()) {
            C60870cx a = cVar.mo20381a();
            C12165k kVar = new C12165k(this);
            C60856cj.m92911t(a, C47810es.m84974n(kVar), this.f38856b);
        }
        return cVar;
    }

    /* renamed from: g */
    private final C60870cx m28075g(C17482ar arVar, C17361a aVar, C70967n nVar) {
        C60870cx a = this.f38865k.mo21005a();
        ajs ajs = this.f38863i;
        C16614b bVar = C16614b.f48694b;
        bVar.getClass();
        ajs.f196369c = bVar;
        ajs.f196370d = this.f38864j.mo54628a("TtsRequestPlayerImpl");
        C68225k.m98529a(ajs.f196369c, C16614b.class);
        C68225k.m98529a(ajs.f196370d, C57934a.class);
        C60870cx gq = new aju(ajs.f196367a, ajs.f196368b, ajs.f196369c, ajs.f196370d).b.mo60297gq();
        return C47638k.m84753d(a, gq).mo51520a(new C12159e(this, arVar, gq, aVar, nVar, a), this.f38856b);
    }

    /* renamed from: a */
    public final C12036c mo20460a(C12170b bVar, C15481g gVar, C37258g gVar2, C70967n nVar) {
        if ((bVar.f38868a & 1) == 0) {
            return new C12164j("Unhandled type of request. Request does not contain S3NlgServiceRequest.");
        }
        C66572b bVar2 = bVar.f38869b;
        if (bVar2 == null) {
            bVar2 = C66572b.f181083d;
        }
        C17361a aVar = this.f38862h;
        C17482ar e = m28073e();
        e.copyOnWrite();
        C17485au auVar = (C17485au) e.instance;
        C17485au auVar2 = C17485au.f50481h;
        bVar2.getClass();
        auVar.f50485c = bVar2;
        auVar.f50484b = 4;
        C60870cx g = m28075g(e, aVar, nVar);
        C12161g gVar3 = C12161g.f38847a;
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(gVar3), this.f38856b);
        C12166l lVar = new C12166l(gVar, gVar2);
        C60856cj.m92911t(h, C47810es.m84974n(lVar), this.f38856b);
        C12155a aVar2 = new C12155a(this);
        return new C12068c(C60922j.m93044g(g, C47810es.m84963c(aVar2), this.f38856b), this.f38856b);
    }

    /* renamed from: b */
    public final C12036c mo20461b(C12174f fVar, C70967n nVar) {
        if ((fVar.f38874a & 1) == 0) {
            return new C12164j("Unhandled type of request. Request does not contain TtsServiceRequest.");
        }
        C59052c cVar = (C59052c) ((C59052c) f38855a.mo56224b()).mo56372aa(44077);
        int b = C12173e.m28083b(fVar.f38876c);
        int i = 4;
        if (b == 0) {
            b = 4;
        }
        cVar.mo56389s("Mode: %s", C12173e.m28082a(b));
        int b2 = C12173e.m28083b(fVar.f38876c);
        if (b2 != 0) {
            i = b2;
        }
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return m28074f(fVar, nVar);
            }
            if (i2 != 3) {
                return new C12164j("Unhandled type of request.");
            }
            if (!this.f38861g.mo21011a()) {
                return m28074f(fVar, nVar);
            }
            C67190ah ahVar = fVar.f38875b;
            if (ahVar == null) {
                ahVar = C67190ah.f182619q;
            }
            C67190ah ahVar2 = ahVar;
            C17361a aVar = this.f38862h;
            C17482ar e = m28073e();
            e.copyOnWrite();
            C17485au auVar = (C17485au) e.instance;
            C17485au auVar2 = C17485au.f50481h;
            ahVar2.getClass();
            auVar.f50485c = ahVar2;
            auVar.f50484b = 3;
            C60870cx g = m28075g(e, aVar, nVar);
            return new C12068c(C60922j.m93045h(C60922j.m93045h(g, C47810es.m84966f(C12156b.f38830a), this.f38856b), C47810es.m84966f(new C12157c(this, g, ahVar2, aVar, nVar)), this.f38856b), this.f38856b);
        } else if (!this.f38861g.mo21011a()) {
            return new C12164j("Unhandled type of request.");
        } else {
            C67190ah ahVar3 = fVar.f38875b;
            if (ahVar3 == null) {
                ahVar3 = C67190ah.f182619q;
            }
            C17361a aVar2 = this.f38862h;
            C17482ar e2 = m28073e();
            e2.copyOnWrite();
            C17485au auVar3 = (C17485au) e2.instance;
            C17485au auVar4 = C17485au.f50481h;
            ahVar3.getClass();
            auVar3.f50485c = ahVar3;
            auVar3.f50484b = 3;
            return new C12068c(C60922j.m93044g(m28075g(e2, aVar2, nVar), C47810es.m84963c(new C12155a(this)), this.f38856b), this.f38856b);
        }
    }

    /* renamed from: c */
    public final C17360b mo20464c(C17482ar arVar, C17361a aVar, C70967n nVar, Locale locale) {
        C17497bf bfVar = (C17497bf) C17499bh.f50509e.createBuilder();
        C17478an anVar = (C17478an) C17479ao.f50468d.createBuilder();
        C52795w wVar = (C52795w) C52796x.f138517c.createBuilder();
        wVar.mo53910a(locale.toString());
        arVar.copyOnWrite();
        C17485au auVar = (C17485au) arVar.instance;
        C52796x xVar = (C52796x) wVar.build();
        C17485au auVar2 = C17485au.f50481h;
        xVar.getClass();
        auVar.f50487e = xVar;
        auVar.f50483a |= 16;
        anVar.copyOnWrite();
        C17479ao aoVar = (C17479ao) anVar.instance;
        C17485au auVar3 = (C17485au) arVar.build();
        auVar3.getClass();
        aoVar.f50471b = auVar3;
        aoVar.f50470a |= 1;
        C17521x xVar2 = (C17521x) C17522y.f50535c.createBuilder();
        int i = this.f38859e;
        xVar2.copyOnWrite();
        C17522y yVar = (C17522y) xVar2.instance;
        yVar.f50537a |= 1;
        yVar.f50538b = i;
        anVar.copyOnWrite();
        C17479ao aoVar2 = (C17479ao) anVar.instance;
        C17522y yVar2 = (C17522y) xVar2.build();
        yVar2.getClass();
        aoVar2.f50472c = yVar2;
        aoVar2.f50470a |= 2;
        bfVar.copyOnWrite();
        C17499bh bhVar = (C17499bh) bfVar.instance;
        C17479ao aoVar3 = (C17479ao) anVar.build();
        aoVar3.getClass();
        bhVar.f50513c = aoVar3;
        bhVar.f50512b = 3;
        C17360b a = aVar.mo23306a((C17499bh) bfVar.build());
        C17331a a2 = a.mo23302a();
        this.f38860f.mo20856a(a2, nVar);
        C60870cx a3 = a2.mo23275a();
        Objects.requireNonNull(a);
        a3.mo4106b(C47810es.m84977q(new C12160f(a)), this.f38856b);
        return a;
    }

    /* renamed from: d */
    public final C60870cx mo20465d(C67190ah ahVar, C17361a aVar, C70967n nVar) {
        C17482ar arVar = (C17482ar) C17485au.f50481h.createBuilder();
        C17484at atVar = C17484at.CLIENT;
        arVar.copyOnWrite();
        C17485au auVar = (C17485au) arVar.instance;
        auVar.f50486d = atVar.f50480d;
        auVar.f50483a |= 8;
        arVar.copyOnWrite();
        C17485au auVar2 = (C17485au) arVar.instance;
        ahVar.getClass();
        auVar2.f50485c = ahVar;
        auVar2.f50484b = 3;
        return C60922j.m93044g(C60922j.m93044g(this.f38865k.mo21005a(), C47810es.m84963c(new C12158d(this, arVar, aVar, nVar)), this.f38856b), C47810es.m84963c(new C12155a(this)), this.f38856b);
    }
}
