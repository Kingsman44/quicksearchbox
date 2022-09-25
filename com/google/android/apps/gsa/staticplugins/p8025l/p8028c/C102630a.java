package com.google.android.apps.gsa.staticplugins.p8025l.p8028c;

import com.google.android.apps.gsa.assist.C9417g;
import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.p6487s3.producers.C84300aa;
import com.google.android.apps.gsa.p6487s3.producers.C84305d;
import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.p11033ap.p11034a.C147814a;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.audio.p4107b.p4108a.C54596s;
import com.google.audio.p4107b.p4108a.C54597t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import com.google.p3728as.p3737c.C48038b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66629d;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67189ag;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5224k.p5225a.C67247y;
import com.google.speech.p5224k.p5225a.C67248z;
import dagger.C68214a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.l.c.a */
/* compiled from: PG */
final class C102630a extends C84305d {

    /* renamed from: a */
    private static final C59071e f286418a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.l.c.a");

    /* renamed from: c */
    private final Query f286419c;

    /* renamed from: d */
    private final C85494a f286420d;

    /* renamed from: e */
    private final C68214a f286421e;

    /* renamed from: f */
    private final C147814a f286422f;

    /* renamed from: g */
    private final C86124t f286423g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C102630a(java.util.concurrent.Future r13, java.util.concurrent.Future r14, java.util.concurrent.Future r15, com.google.android.apps.gsa.shared.search.Query r16, java.lang.String r17, com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a r18, dagger.C68214a r19, com.google.android.apps.gsa.search.core.p6805i.C86124t r20, com.google.android.libraries.p11033ap.p11034a.C147814a r21) {
        /*
            r12 = this;
            r10 = r12
            r11 = r16
            r4 = 0
            r5 = 0
            long r6 = r11.f252749G
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r8 = r17
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r10.f286419c = r11
            r0 = r18
            r10.f286420d = r0
            r0 = r19
            r10.f286421e = r0
            r0 = r21
            r10.f286422f = r0
            r0 = r20
            r10.f286423g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8025l.p8028c.C102630a.<init>(java.util.concurrent.Future, java.util.concurrent.Future, java.util.concurrent.Future, com.google.android.apps.gsa.shared.search.Query, java.lang.String, com.google.android.apps.gsa.search.core.al.i.a, dagger.a, com.google.android.apps.gsa.search.core.i.t, com.google.android.libraries.ap.a.a):void");
    }

    /* renamed from: f */
    private final C9418h m170187f(C9318f fVar) {
        C60870cx d = ((C9321i) this.f286421e.mo27525b()).mo17527d(fVar);
        if (d != null && d.isDone()) {
            try {
                return (C9418h) C90877ak.m148472f(d);
            } catch (InterruptedException | ExecutionException e) {
                C59104x c = f286418a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AssistantTextSearchRP");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14034)).mo56386p("Failed to get AssistData, this should not happen");
            }
        }
        return null;
    }

    /* renamed from: g */
    private static void m170188g(C51188c cVar, C9418h hVar) {
        if (hVar != null) {
            C54188e eVar = ((C51189d) cVar.instance).f133251c;
            if (eVar == null) {
                eVar = C54188e.f142203f;
            }
            C61818k kVar = eVar.f142207c;
            if (kVar == null) {
                kVar = C61818k.f166999r;
            }
            C61817j jVar = (C61817j) kVar.toBuilder();
            C61818k kVar2 = (C61818k) jVar.instance;
            if ((kVar2.f167001a & 2048) != 0) {
                C9418h hVar2 = kVar2.f167012l;
                if (hVar2 == null) {
                    hVar2 = C9418h.f32714k;
                }
                C9417g gVar = (C9417g) hVar2.toBuilder();
                gVar.mergeFrom(hVar);
                jVar.copyOnWrite();
                C61818k kVar3 = (C61818k) jVar.instance;
                C9418h hVar3 = (C9418h) gVar.build();
                hVar3.getClass();
                kVar3.f167012l = hVar3;
                kVar3.f167001a |= 2048;
            } else {
                jVar.copyOnWrite();
                C61818k kVar4 = (C61818k) jVar.instance;
                kVar4.f167012l = hVar;
                kVar4.f167001a |= 2048;
            }
            C54188e eVar2 = ((C51189d) cVar.instance).f133251c;
            if (eVar2 == null) {
                eVar2 = C54188e.f142203f;
            }
            C54185b bVar = (C54185b) eVar2.toBuilder();
            bVar.copyOnWrite();
            C54188e eVar3 = (C54188e) bVar.instance;
            C61818k kVar5 = (C61818k) jVar.build();
            kVar5.getClass();
            eVar3.f142207c = kVar5;
            eVar3.f142205a |= 2;
            cVar.copyOnWrite();
            C51189d dVar = (C51189d) cVar.instance;
            C54188e eVar4 = (C54188e) bVar.build();
            eVar4.getClass();
            dVar.f133251c = eVar4;
            dVar.f133249a |= 2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C66606cd mo77837a() {
        int a;
        C66606cd a2 = super.mo77837a();
        C60870cx a3 = this.f286420d.mo79016a(this.f286419c);
        C84300aa aaVar = this.f229431b;
        if (this.f286423g.mo79746e(C90014bt.f247802ny)) {
            aaVar = new C84300aa((long) ((int) this.f286423g.mo79743a(C90014bt.f247702mD)));
        }
        try {
            C51188c cVar = (C51188c) ((C51189d) aaVar.mo77841a(a3)).toBuilder();
            if (this.f286419c.mo84363bw("com.google.opa.SEND_ORIGINAL_IMAGE")) {
                m170188g(cVar, m170187f(C9318f.SCREENSHOT));
            } else {
                m170188g(cVar, m170187f(C9318f.SCREENSHOT));
                m170188g(cVar, m170187f(C9318f.CONTEXTUAL));
            }
            a2.mo58885m(C66629d.f181274a, (C51189d) cVar.build());
            String str = this.f286419c.f252769h;
            if (str != null) {
                C67247y yVar = (C67247y) C67248z.f182795j.createBuilder();
                C54596s sVar = (C54596s) C54597t.f143337f.createBuilder();
                sVar.copyOnWrite();
                C54597t tVar = (C54597t) sVar.instance;
                tVar.f143339a |= 1024;
                tVar.f143343e = str;
                String bf = this.f286419c.mo84347bf("android.soundsearch.extra.RECOGNIZED_TITLE");
                String bf2 = this.f286419c.mo84347bf("android.soundsearch.extra.RECOGNIZED_ARTIST");
                if (!(bf == null || bf2 == null)) {
                    sVar.copyOnWrite();
                    C54597t tVar2 = (C54597t) sVar.instance;
                    tVar2.f143339a |= 2;
                    tVar2.f143341c = bf;
                    sVar.copyOnWrite();
                    C54597t tVar3 = (C54597t) sVar.instance;
                    tVar3.f143339a |= 1;
                    tVar3.f143340b = bf2;
                }
                yVar.copyOnWrite();
                C67248z zVar = (C67248z) yVar.instance;
                C54597t tVar4 = (C54597t) sVar.build();
                tVar4.getClass();
                zVar.f182804g = tVar4;
                zVar.f182798a |= 32;
                C48038b a4 = this.f286422f.mo124477a();
                yVar.copyOnWrite();
                C67248z zVar2 = (C67248z) yVar.instance;
                a4.getClass();
                zVar2.f182805h = a4;
                zVar2.f182798a |= 64;
                a2.mo58885m(C67248z.f182796k, (C67248z) yVar.build());
            }
            if (this.f286419c.mo84364bx("android.opa.extra.VOICE_SEARCH_TTS_ENCODING") || this.f286419c.mo84364bx("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ")) {
                C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
                if (this.f286419c.mo84364bx("android.opa.extra.VOICE_SEARCH_TTS_ENCODING") && (a = C67189ag.m97437a(this.f286419c.mo84263a("android.opa.extra.VOICE_SEARCH_TTS_ENCODING"))) != 0) {
                    aeVar.copyOnWrite();
                    C67190ah ahVar = (C67190ah) aeVar.instance;
                    ahVar.f182628g = a;
                    ahVar.f182622a |= 128;
                }
                if (this.f286419c.mo84364bx("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ")) {
                    int a5 = this.f286419c.mo84263a("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ");
                    aeVar.copyOnWrite();
                    C67190ah ahVar2 = (C67190ah) aeVar.instance;
                    ahVar2.f182622a |= 32768;
                    ahVar2.f182634m = a5;
                }
                a2.mo58885m(C67190ah.f182620r, (C67190ah) aeVar.build());
            }
            return a2;
        } catch (IOException e) {
            throw new C90523o((Throwable) e, (int) C89885b.S3REQUEST_BUILD_PINHOLE_PARAMS_FAILED_VALUE);
        }
    }

    /* renamed from: b */
    public final boolean mo77850b() {
        return true;
    }
}
