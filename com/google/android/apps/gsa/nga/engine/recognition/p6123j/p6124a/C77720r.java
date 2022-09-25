package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.d.a.a.c;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77551ad;
import com.google.android.apps.gsa.nga.engine.recognition.C77552ae;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77632g;
import com.google.android.apps.gsa.nga.engine.recognition.C77731k;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a.C77843k;
import com.google.android.apps.gsa.nga.engine.recognition.p6136o.C77881f;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82978hm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82979hn;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66686t;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67470r;
import com.google.speech.recognizer.p5233a.C67476x;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.r */
/* compiled from: PG */
final class C77720r {

    /* renamed from: a */
    public static final C58974d f214083a = C58974d.m91136j();

    /* renamed from: b */
    public final C77881f f214084b;

    /* renamed from: c */
    public final C60950i f214085c;

    /* renamed from: d */
    public final C77843k f214086d;

    /* renamed from: e */
    public final C79856d f214087e;

    /* renamed from: f */
    public final c f214088f;

    /* renamed from: g */
    public final C91142g f214089g;

    /* renamed from: h */
    public final AtomicReference f214090h;

    /* renamed from: i */
    public final C21370a f214091i;

    /* renamed from: j */
    public final C77566as f214092j;

    /* renamed from: k */
    public final C77726x f214093k;

    /* renamed from: l */
    public final C77632g f214094l;

    /* renamed from: m */
    public long f214095m = 1;

    /* renamed from: n */
    public long f214096n = 0;

    /* renamed from: o */
    public final AtomicBoolean f214097o = new AtomicBoolean(false);

    /* renamed from: p */
    private final C80642f f214098p;

    /* renamed from: q */
    private final C75050a f214099q;

    /* renamed from: r */
    private final C81459h f214100r;

    /* renamed from: s */
    private final AtomicBoolean f214101s = new AtomicBoolean(false);

    /* renamed from: t */
    private final C81459h f214102t;

    public C77720r(C79856d dVar, C77566as asVar, C77881f fVar, C60950i iVar, C77843k kVar, c cVar, C91142g gVar, C21370a aVar, C81465n nVar, C22871g gVar2, C81465n nVar2, C22871g gVar3, C77726x xVar, C80642f fVar2, C75050a aVar2, C77632g gVar4) {
        this.f214087e = dVar;
        this.f214084b = fVar;
        this.f214085c = iVar;
        this.f214086d = kVar;
        this.f214088f = cVar;
        this.f214089g = gVar;
        this.f214091i = aVar;
        this.f214093k = xVar;
        this.f214092j = asVar;
        this.f214090h = new AtomicReference(Duration.ofNanos(aVar.mo26872d()));
        this.f214098p = fVar2;
        this.f214099q = aVar2;
        C81465n nVar3 = nVar;
        C22871g gVar5 = gVar2;
        this.f214100r = nVar.mo75095b(gVar2, C77717o.f214080a);
        this.f214102t = nVar2.mo75095b(gVar3, C77718p.f214081a);
        this.f214094l = gVar4;
    }

    /* renamed from: a */
    public static C77552ae m124689a(int i, String str) {
        C77731k kVar = new C77731k();
        kVar.mo72608f(C77551ad.S3);
        kVar.mo72606d(i + 1);
        kVar.mo72610h(str.replaceAll("<.*?>", BuildConfig.FLAVOR).trim().replaceAll(" +", " "));
        return kVar.mo72603a();
    }

    /* renamed from: b */
    public static C58485gu m124690b(C67442ak akVar) {
        C62971cq cqVar = akVar.f183281d;
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < cqVar.size(); i++) {
            C67468p pVar = (C67468p) cqVar.get(i);
            e.mo55395g(m124689a(i, (pVar.f183366a & 1) != 0 ? pVar.f183367b : BuildConfig.FLAVOR));
        }
        return e.mo55394f();
    }

    /* renamed from: c */
    public static Optional m124691c(C67438ag agVar) {
        C67442ak akVar;
        int i = agVar.f183258a;
        if ((i & 8) != 0) {
            C67476x xVar = agVar.f183262e;
            if (xVar == null) {
                xVar = C67476x.f183390i;
            }
            if ((xVar.f183392a & 32768) == 0) {
                return Optional.empty();
            }
            C67470r rVar = xVar.f183398g;
            if (rVar == null) {
                rVar = C67470r.f183377c;
            }
            return Optional.m71637of(rVar);
        }
        if ((i & 32) != 0) {
            akVar = agVar.f183264g;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
        } else {
            akVar = agVar.f183261d;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
        }
        if ((akVar.f183278a & 512) == 0) {
            return Optional.empty();
        }
        C67470r rVar2 = akVar.f183284g;
        if (rVar2 == null) {
            rVar2 = C67470r.f183377c;
        }
        return Optional.m71637of(rVar2);
    }

    /* renamed from: d */
    public final void mo72784d(ac acVar) {
        if (this.f214101s.compareAndSet(false, true)) {
            this.f214102t.mo75090a(acVar);
        } else {
            ((C58970a) ((C58970a) f214083a.mo56224b()).mo56372aa(4381)).mo56389s("Already notified about no-speech for %s", acVar);
        }
    }

    /* renamed from: e */
    public final void mo72785e() {
        if (this.f214097o.compareAndSet(false, true)) {
            this.f214100r.mo75090a(this.f214087e.f218924a);
        }
    }

    /* renamed from: f */
    public final void mo72786f(C67464l lVar, String str, boolean z) {
        C83320io b = this.f214087e.f218924a.b();
        C67463k a = C67463k.m97475a(lVar.f183359b);
        if (a == null) {
            a = C67463k.START_OF_SPEECH;
        }
        C66686t tVar = C66686t.DEFAULT_INTERVAL_GUEST;
        int ordinal = a.ordinal();
        boolean z2 = true;
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                this.f214093k.f214120a.mo72794i(2, Duration.ZERO, str, b);
            }
        } else if (z || !this.f214098p.mo74389o(this.f214099q.mo71417a().mo71465k())) {
            mo72785e();
            C77726x xVar = this.f214093k;
            C77566as asVar = this.f214092j;
            Duration ofNanos = Duration.ofNanos(xVar.f214121b.mo26872d());
            Duration a2 = xVar.mo72787a(asVar, (Duration) this.f214090h.get());
            boolean isPresent = asVar.mo72682e().isPresent();
            Duration duration = Duration.ZERO;
            if ((lVar.f183358a & 4) != 0 && !isPresent) {
                duration = ofNanos.minus(a2).minus(lVar.f183361d, ChronoUnit.MICROS);
            }
            xVar.f214120a.mo72794i(1, duration, str, b);
            if ((lVar.f183358a & 2) != 0 && !isPresent) {
                Duration plus = a2.plus(lVar.f183360c, ChronoUnit.MICROS);
                C83334w wVar = xVar.f214120a.f214132b;
                C82887ec ecVar = C82887ec.START_OF_USER_SPEECH;
                C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
                C82978hm hmVar = (C82978hm) C82979hn.f226378c.createBuilder();
                long nanos = plus.toNanos();
                hmVar.copyOnWrite();
                C82979hn hnVar = (C82979hn) hmVar.instance;
                hnVar.f226380a |= 1;
                hnVar.f226381b = nanos;
                dzVar.copyOnWrite();
                C82885ea eaVar = (C82885ea) dzVar.instance;
                C82979hn hnVar2 = (C82979hn) hmVar.build();
                hnVar2.getClass();
                eaVar.f225980b = hnVar2;
                eaVar.f225979a = 76;
                wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), b);
            }
        } else {
            return;
        }
        C77843k kVar = this.f214086d;
        ac acVar = this.f214087e.f218924a;
        if (z || !a.equals(C67463k.END_OF_UTTERANCE)) {
            z2 = false;
        }
        kVar.mo72601a(lVar, acVar, z2);
    }
}
