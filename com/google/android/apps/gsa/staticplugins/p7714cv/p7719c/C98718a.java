package com.google.android.apps.gsa.staticplugins.p7714cv.p7719c;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118948b;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90510b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90511c;
import com.google.android.apps.gsa.shared.speech.p7139a.C90513e;
import com.google.android.apps.gsa.shared.speech.p7139a.C90514f;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92265b;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92270g;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92271h;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92274k;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92276m;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92447d;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98710b;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.p7716a.C98709a;
import com.google.common.base.C58833ax;
import com.google.common.p4541l.C59337t;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import dagger.C68214a;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.c.a */
/* compiled from: PG */
public final class C98718a implements C118948b {

    /* renamed from: a */
    private final C92271h f275739a;

    /* renamed from: b */
    private final C68214a f275740b;

    /* renamed from: c */
    private final C89859i f275741c;

    /* renamed from: d */
    private final u f275742d;

    /* renamed from: e */
    private C92274k f275743e;

    /* renamed from: f */
    private C92270g f275744f;

    /* renamed from: g */
    private Long f275745g;

    /* renamed from: h */
    private InputStream f275746h;

    /* renamed from: i */
    private final C98710b f275747i;

    /* renamed from: j */
    private final C92276m f275748j;

    public C98718a(C92271h hVar, C98710b bVar, C92276m mVar, C68214a aVar, C89859i iVar, u uVar) {
        this.f275739a = hVar;
        this.f275747i = bVar;
        this.f275748j = mVar;
        this.f275740b = aVar;
        this.f275741c = iVar;
        this.f275742d = uVar;
    }

    /* renamed from: c */
    private final void m163516c(C92265b bVar, C90528t tVar) {
        this.f275743e = null;
        this.f275744f = null;
        bVar.mo86946b(tVar);
    }

    /* renamed from: d */
    private final void m163517d(C90528t tVar, C89849ae aeVar, long j) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(j));
        C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
        eVar.copyOnWrite();
        C59770f fVar2 = (C59770f) eVar.instance;
        fVar2.f161503a |= 1;
        fVar2.f161504b = tVar.mo79844b();
        int i = tVar.f253082c;
        eVar.copyOnWrite();
        C59770f fVar3 = (C59770f) eVar.instance;
        fVar3.f161503a |= 2;
        fVar3.f161505c = i;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.mo57008e((C59770f) eVar.build());
        fVar.f246203c = (C59687cb) ajVar.build();
        this.f275741c.mo74236a(fVar.mo83699a());
    }

    /* renamed from: e */
    private final void m163518e(C89849ae aeVar, long j) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(j));
        this.f275741c.mo74236a(fVar.mo83699a());
    }

    /* renamed from: a */
    public final void mo91277a(boolean z) {
        C92274k kVar = this.f275743e;
        if (kVar != null) {
            this.f275739a.mo86955f(kVar);
            m163518e(C89849ae.GRECO3_RECOGNITION_CLOSE, this.f275745g.longValue());
            this.f275743e = null;
            this.f275745g = null;
        }
        C59337t.m92221a(this.f275746h);
        this.f275746h = null;
    }

    /* renamed from: b */
    public final void mo91278b(C92216a aVar, C92473f fVar, C58833ax axVar) {
        C92252n nVar;
        C92216a aVar2 = aVar;
        C92473f fVar2 = fVar;
        aVar.getClass();
        C92252n nVar2 = null;
        this.f275743e = null;
        this.f275744f = null;
        this.f275745g = null;
        long j = fVar2.f258032t;
        m163518e(C89849ae.GRECO3_INITIALIZATION_START, j);
        this.f275739a.mo86956g(j);
        C92274k.m151521a();
        C92252n nVar3 = fVar2.f258022j;
        String str = fVar2.f258017e;
        C92249k kVar = fVar2.f258021i;
        this.f275739a.mo86954e();
        C92252n nVar4 = (nVar3 != C92252n.GRAMMAR || this.f275747i.f275707a.mo85391c()) ? nVar3 : C92252n.ENDPOINTER_VOICESEARCH;
        if (nVar3 == C92252n.DICTATION) {
            nVar = C92252n.ENDPOINTER_DICTATION;
        } else {
            nVar = nVar3 == C92252n.GRAMMAR ? C92252n.ENDPOINTER_VOICESEARCH : null;
        }
        if (nVar4 != null) {
            C92270g b = this.f275739a.mo86951b(str, nVar4, kVar);
            if (b == null && nVar4 == C92252n.GRAMMAR && !"en-US".equals(str)) {
                b = this.f275739a.mo86951b("en-US", nVar4, kVar);
            }
            if (b == null) {
                if (!(nVar == null || (b = this.f275739a.mo86951b(str, nVar, (C92249k) null)) == null)) {
                    nVar4 = nVar;
                }
            }
            C92252n nVar5 = b.f257278d;
            String str2 = b.f257277c;
            C92274k b2 = C92274k.m151522b(b, 8000, 1);
            if (b2 == null) {
                ((C89911f) this.f275740b.mo27525b()).mo83755a((Throwable) null, 9067534, 29).mo83721a();
            }
            this.f275743e = b2;
            if (b2 == null) {
                this.f275744f = null;
            } else {
                this.f275744f = b;
                nVar2 = nVar4;
            }
        }
        C98709a aVar3 = new C98709a(nVar2, aVar2);
        if (nVar2 == null || this.f275743e == null || this.f275744f == null) {
            C90510b bVar = new C90510b(458755);
            m163517d(bVar, C89849ae.GRECO3_INITIALIZATION_FAILED, j);
            m163516c(aVar3, bVar);
        } else if (!axVar.mo56113h()) {
            C90514f fVar3 = new C90514f("AudioListeningSessionAdapter is empty.", (int) C89885b.GRECO_CREATE_INPUT_STREAM_FAILED_VALUE);
            m163517d(fVar3, C89849ae.GRECO3_INITIALIZATION_FAILED, j);
            m163516c(aVar3, fVar3);
        } else {
            this.f275746h = this.f275742d.c((C74458k) axVar.mo56107c());
            C92460b a = ((C74458k) axVar.mo56107c()).mo70774a();
            int bitCount = Integer.bitCount(a.mo87190a());
            int f = a.mo87195f();
            m163518e(C89849ae.GRECO3_INITIALIZATION_SUCCESS, j);
            this.f275745g = Long.valueOf(j);
            m163518e(C89849ae.GRECO3_RECOGNITION_START, j);
            this.f275739a.mo86957h(this.f275743e, this.f275746h, aVar3, C92447d.m151921a(f, fVar2.f258025m, fVar2.f258026n, fVar2.f258029q, fVar2.f258030r, bitCount, fVar2.f258015c.mo87188F()), fVar2.f258032t, this.f275748j.mo86962a(nVar2), this.f275744f.f257280f, false);
            String str3 = fVar2.f258017e;
            if (!this.f275744f.f257277c.equals(str3)) {
                aVar2.mo70940b(new C90513e(str3));
            }
            if (nVar2.mo86935b() && !nVar3.mo86935b()) {
                aVar2.mo70940b(new C90511c());
            }
        }
    }
}
