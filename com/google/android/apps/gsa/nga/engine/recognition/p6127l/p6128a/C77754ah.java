package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.d.a.fa;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77828d;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a.C77845m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82430ex;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82660nk;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82661nl;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66876cv;
import com.google.speech.p5218j.C66878cx;
import com.google.speech.p5218j.C66880cz;
import com.google.speech.p5218j.C67049jd;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67071jz;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67170o;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.ah */
/* compiled from: PG */
public final class C77754ah implements C77828d {

    /* renamed from: a */
    private final C79851ai f214203a;

    /* renamed from: b */
    private final C91142g f214204b;

    /* renamed from: c */
    private final fa f214205c;

    /* renamed from: d */
    private final C75050a f214206d;

    /* renamed from: e */
    private final C77845m f214207e;

    public C77754ah(C79851ai aiVar, C91142g gVar, fa faVar, C75050a aVar, C77845m mVar) {
        this.f214203a = aiVar;
        this.f214204b = gVar;
        this.f214205c = faVar;
        this.f214206d = aVar;
        this.f214207e = mVar;
    }

    /* renamed from: a */
    public final C66752s mo72813a(C77566as asVar) {
        C66751r rVar = (C66751r) C66752s.f181544q.createBuilder();
        C19245ah.m36702j(rVar, asVar.mo72680c(), Integer.bitCount(asVar.mo72678a()));
        rVar.copyOnWrite();
        C66752s sVar = (C66752s) rVar.instance;
        sVar.f181546a |= 1;
        sVar.f181547b = true;
        if (this.f214206d.mo71417a().mo71471q()) {
            rVar.copyOnWrite();
            C66752s sVar2 = (C66752s) rVar.instance;
            sVar2.f181557l = 4;
            sVar2.f181546a |= 32768;
        }
        if (this.f214204b.mo85405j(C90126fx.f251412iN)) {
            C79850ah b = this.f214203a.mo74251b(14003);
            try {
                fa faVar = this.f214205c;
                long d = faVar.d.mo26872d();
                C66722az c = faVar.c.c();
                if (faVar.f.mo85405j(C90126fx.f251676nM)) {
                    C66722az azVar = faVar.h.a;
                    C66721ay ayVar = (C66721ay) c.toBuilder();
                    ayVar.mergeFrom(azVar);
                    c = (C66722az) ayVar.build();
                    faVar.i = c;
                }
                faVar.b(c, C82887ec.SPEECH_RECOGNITION_CONTEXT);
                C83305i iVar = faVar.g;
                C82660nk f = C82661nl.m131982f();
                ((C82430ex) f).f225226b = Double.valueOf((double) Duration.ofNanos(faVar.d.mo26872d() - d).toMillis());
                ((C82430ex) f).f225227c = "START_CAPTURE_TOTAL";
                iVar.mo75579d(f.mo76190a());
                rVar.copyOnWrite();
                C66752s sVar3 = (C66752s) rVar.instance;
                c.getClass();
                sVar3.f181552g = c;
                sVar3.f181546a |= 32;
                if (b != null) {
                    b.mo74255b();
                }
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        }
        int a = C66878cx.m97369a((int) this.f214204b.mo85399d(C90126fx.f251745oc));
        if (a == 0 || a == 1) {
            rVar.copyOnWrite();
            C66752s sVar4 = (C66752s) rVar.instance;
            sVar4.f181556k = null;
            sVar4.f181546a &= -513;
        } else {
            if (a == 8) {
                C77845m mVar = this.f214207e;
                if (mVar.f214427d.mo26884a() - mVar.f214428e <= Duration.ofSeconds(mVar.f214424a.mo85399d(C90126fx.f251515kK)).toNanos() && mVar.f214426c.mo74010c() && mVar.f214425b.mo72840e(false, false)) {
                    a = 3;
                } else {
                    a = 1;
                }
            }
            String h = this.f214204b.mo85403h(C90126fx.f251746od);
            C66876cv cvVar = (C66876cv) C66880cz.f181819e.createBuilder();
            cvVar.copyOnWrite();
            C66880cz czVar = (C66880cz) cvVar.instance;
            czVar.f181822b = a - 1;
            czVar.f181821a |= 1;
            cvVar.copyOnWrite();
            C66880cz czVar2 = (C66880cz) cvVar.instance;
            czVar2.f181823c = 2;
            czVar2.f181821a |= 2;
            cvVar.copyOnWrite();
            C66880cz czVar3 = (C66880cz) cvVar.instance;
            h.getClass();
            czVar3.f181821a = 8 | czVar3.f181821a;
            czVar3.f181824d = h;
            C66880cz czVar4 = (C66880cz) cvVar.build();
            rVar.copyOnWrite();
            C66752s sVar5 = (C66752s) rVar.instance;
            czVar4.getClass();
            sVar5.f181556k = czVar4;
            sVar5.f181546a |= 512;
        }
        if (asVar.mo72682e().isPresent() && ((HotwordResult) asVar.mo72682e().get()).mo84698p().mo56113h()) {
            C67170o oVar = (C67170o) C67171p.f182575e.createBuilder();
            C63088z A = C63088z.m96139A((byte[]) ((HotwordResult) asVar.mo72682e().get()).mo84698p().mo56107c());
            oVar.copyOnWrite();
            C67171p pVar = (C67171p) oVar.instance;
            pVar.f182577a |= 1;
            pVar.f182578b = A;
            C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
            int c2 = asVar.mo72680c();
            qVar.copyOnWrite();
            C67175t tVar = (C67175t) qVar.instance;
            tVar.f182590a |= 2;
            tVar.f182592c = c2;
            int bitCount = Integer.bitCount(asVar.mo72678a());
            qVar.copyOnWrite();
            C67175t tVar2 = (C67175t) qVar.instance;
            tVar2.f182590a = 4 | tVar2.f182590a;
            tVar2.f182593d = bitCount;
            oVar.copyOnWrite();
            C67171p pVar2 = (C67171p) oVar.instance;
            C67175t tVar3 = (C67175t) qVar.build();
            tVar3.getClass();
            pVar2.f182579c = tVar3;
            pVar2.f182577a |= 2;
            C67171p pVar3 = (C67171p) oVar.build();
            C67049jd jdVar = (C67049jd) C67050je.f182262f.createBuilder();
            C67071jz jzVar = (C67071jz) C67073ka.f182324f.createBuilder();
            jzVar.copyOnWrite();
            C67073ka kaVar = (C67073ka) jzVar.instance;
            pVar3.getClass();
            kaVar.f182327b = pVar3;
            kaVar.f182326a |= 1;
            jdVar.copyOnWrite();
            C67050je jeVar = (C67050je) jdVar.instance;
            C67073ka kaVar2 = (C67073ka) jzVar.build();
            kaVar2.getClass();
            jeVar.f182266c = kaVar2;
            jeVar.f182264a |= 2;
            rVar.copyOnWrite();
            C66752s sVar6 = (C66752s) rVar.instance;
            C67050je jeVar2 = (C67050je) jdVar.build();
            jeVar2.getClass();
            sVar6.f181558m = jeVar2;
            sVar6.f181546a |= C89885b.S3REQUEST_VALUE;
        }
        return (C66752s) rVar.build();
        throw th;
    }
}
