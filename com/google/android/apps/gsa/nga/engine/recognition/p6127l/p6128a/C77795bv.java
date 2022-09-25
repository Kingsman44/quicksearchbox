package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.p5970d.C75156a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.p6260x.C79878z;
import com.google.android.apps.gsa.nga.engine.recognition.C77564aq;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.engine.recognition.p6111d.C77616b;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77828d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82952gn;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82954gp;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.agx;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.bv */
/* compiled from: PG */
public final class C77795bv implements C77564aq {

    /* renamed from: a */
    public static final C58974d f214320a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f214321b;

    /* renamed from: c */
    public final C77732a f214322c;

    /* renamed from: d */
    public C77787bn f214323d;

    /* renamed from: e */
    private final C77788bo f214324e;

    /* renamed from: f */
    private final C75050a f214325f;

    /* renamed from: g */
    private final C75156a f214326g;

    /* renamed from: h */
    private final C77616b f214327h;

    /* renamed from: i */
    private final C91142g f214328i;

    public C77795bv(C22871g gVar, C77788bo boVar, C77732a aVar, C75050a aVar2, C75156a aVar3, C77616b bVar, C91142g gVar2) {
        this.f214321b = gVar;
        this.f214324e = boVar;
        this.f214322c = aVar;
        this.f214325f = aVar2;
        this.f214326g = aVar3;
        this.f214327h = bVar;
        this.f214328i = gVar2;
    }

    /* renamed from: h */
    private final void m124800h(C77566as asVar) {
        if (asVar.mo72682e().isPresent()) {
            this.f214326g.mo71505c((HotwordResult) asVar.mo72682e().get());
        }
    }

    /* renamed from: a */
    public final void mo72673a(ac acVar) {
        if (!mo72674b()) {
            ((C58970a) ((C58970a) f214320a.mo56226d()).mo56372aa(4478)).mo56386p("Not closing audio session because manual endpointing is not allowed");
            return;
        }
        this.f214322c.mo72788c(C89849ae.NGA_SPEECH_HANDLER_MANUAL_ENDPOINT, C77889u.SODA);
        this.f214321b.mo28212l("[NGA] SodaSpeechRecognizer.ensureAudioSessionClosed", new C77793bt(this, acVar));
    }

    /* renamed from: b */
    public final boolean mo72674b() {
        return !this.f214328i.mo85405j(C90126fx.f251516kL);
    }

    /* renamed from: c */
    public final boolean mo72675c(C77566as asVar, C79856d dVar) {
        this.f214322c.mo72788c(C89849ae.NGA_SPEECH_HANDLER_RESET, C77889u.SODA);
        if (asVar.mo72697v() || asVar.mo72694s() || asVar.mo72698w()) {
            m124800h(asVar);
            this.f214321b.mo28212l("[NGA] SodaSpeechRecognizer.reset", new C77790bq(this, asVar, dVar));
            return true;
        }
        ((C58970a) ((C58970a) f214320a.mo56226d()).mo56372aa(4480)).mo56389s("Soda can't reset with SpeechSessionParams %s", asVar);
        this.f214322c.mo72795j(4);
        this.f214327h.mo72746b(asVar);
        return false;
    }

    /* renamed from: d */
    public final boolean mo72676d(C77566as asVar, C79856d dVar) {
        this.f214322c.mo72788c(C89849ae.NGA_SPEECH_HANDLER_RESUME, C77889u.SODA);
        boolean z = asVar.mo72695t() && this.f214328i.mo85405j(C90126fx.f251302gJ);
        if (asVar.mo72697v() || asVar.mo72694s() || asVar.mo72698w() || z) {
            m124800h(asVar);
            this.f214321b.mo28212l("[NGA] SodaSpeechRecognizer.start", new C77794bu(this, asVar, dVar));
            return true;
        }
        ((C58970a) ((C58970a) f214320a.mo56226d()).mo56372aa(4482)).mo56389s("Soda can't start with SpeechSessionParams %s", asVar);
        this.f214322c.mo72795j(1);
        this.f214327h.mo72746b(asVar);
        return false;
    }

    /* renamed from: e */
    public final boolean mo72677e() {
        this.f214322c.mo72788c(C89849ae.NGA_SPEECH_HANDLER_PAUSE, C77889u.SODA);
        this.f214321b.mo28212l("[NGA] SodaSpeechRecognizer.stop", new C77792bs(this));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo72827f() {
        C77787bn bnVar = this.f214323d;
        this.f214323d = null;
        if (bnVar != null) {
            ((C58970a) ((C58970a) f214320a.mo56224b()).mo56372aa(4475)).mo56389s("Stopping Soda session %s", bnVar.f214291l.f218924a);
            bnVar.mo72825b();
        }
    }

    /* renamed from: g */
    public final void mo72828g(C77566as asVar, C79856d dVar) {
        Lock readLock;
        Lock readLock2;
        C75077bo a = this.f214325f.mo71417a();
        C77787bn bnVar = this.f214323d;
        C77787bn bnVar2 = null;
        if (asVar.mo72694s() || bnVar == null || bnVar.f214293n.isDone() || asVar.mo72698w()) {
            mo72827f();
            if (this.f214323d == null) {
                ((C58970a) ((C58970a) f214320a.mo56224b()).mo56372aa(4474)).mo56389s("Starting Soda session with utterance id %s", dVar.f218924a.c());
                C77787bn a2 = this.f214324e.mo72826a(asVar, dVar, Optional.empty(), Optional.empty());
                try {
                    a2.f214294o = a2.f214290k.mo72590a(a2.f214282c);
                    InputStream inputStream = a2.f214294o;
                    ((C77752af) a2.f214283d.mo27525b()).mo72812f(a2.f214291l);
                    ((C58970a) ((C58970a) C77787bn.f214280a.mo56224b()).mo56372aa(4469)).mo56389s("Starting capturing for utteranceid %s", a2.f214292m);
                    a2.f214288i.mo74271b(C89849ae.NGA_AUDIO_CAPTURE_STARTED);
                    C77782bi biVar = a2.f214285f;
                    int m = a2.f214282c.mo72690m();
                    C79856d dVar2 = a2.f214291l;
                    C83334w wVar = biVar.f214262b;
                    C82887ec ecVar = C82887ec.SODA_SESSION_EVENT;
                    C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
                    C82952gn gnVar = (C82952gn) C82954gp.f226321e.createBuilder();
                    gnVar.copyOnWrite();
                    C82954gp gpVar = (C82954gp) gnVar.instance;
                    if (m != 0) {
                        gpVar.f226325c = m;
                        gpVar.f226323a |= 2;
                        gnVar.copyOnWrite();
                        C82954gp gpVar2 = (C82954gp) gnVar.instance;
                        gpVar2.f226324b = 1;
                        gpVar2.f226323a |= 1;
                        agx d = C79878z.m128029d(biVar.f214266f.i);
                        gnVar.copyOnWrite();
                        C82954gp gpVar3 = (C82954gp) gnVar.instance;
                        d.getClass();
                        gpVar3.f226326d = d;
                        gpVar3.f226323a |= 4;
                        C82954gp gpVar4 = (C82954gp) gnVar.build();
                        dzVar.copyOnWrite();
                        C82885ea eaVar = (C82885ea) dzVar.instance;
                        gpVar4.getClass();
                        eaVar.f225980b = gpVar4;
                        eaVar.f225979a = 82;
                        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), dVar2.f218924a.b());
                        C77817v vVar = a2.f214281b;
                        C66752s a3 = ((C77828d) vVar.f214368l.mo27525b()).mo72813a(a2.f214282c);
                        C66751r rVar = (C66751r) a3.toBuilder();
                        C66722az azVar = C66722az.f181493f;
                        rVar.copyOnWrite();
                        C66752s sVar = (C66752s) rVar.instance;
                        azVar.getClass();
                        sVar.f181552g = azVar;
                        sVar.f181546a |= 32;
                        rVar.build();
                        readLock = vVar.f214367k.readLock();
                        readLock.lock();
                        Soda a4 = vVar.mo72833a();
                        C58836b bVar = C58836b.f156633a;
                        C60870cx c = a4.mo24326c(a3, inputStream, bVar, bVar);
                        readLock.unlock();
                        a2.f214293n = c;
                        C90875ai.m148465b(new C77785bl(a2, inputStream), a2.f214293n, a2.f214286g, "[NGA] NgaSodaSession.captureFutureCallback").mo85223a(new C77786bm(a2, inputStream));
                        this.f214323d = a2;
                        return;
                    }
                    throw null;
                } catch (C77816u e) {
                    a2.f214287h.mo72795j(6);
                    ((C58970a) ((C58970a) ((C58970a) C77787bn.f214280a.mo56226d()).mo56382g(e)).mo56372aa(4471)).mo56386p("Trying to start but there is no Soda instance");
                    a2.mo72825b();
                    C77772az azVar2 = a2.f214289j;
                    azVar2.f214238g.mo28213m("[NGA] SodaLifecycleHandler.scheduleLifecycle", C77772az.f214233b.toMillis(), new C77767au(azVar2));
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            }
        } else {
            try {
                int i = true != a.mo71471q() ? 1 : 5;
                C77817v vVar2 = bnVar.f214281b;
                readLock2 = vVar2.f214367k.readLock();
                readLock2.lock();
                vVar2.mo72833a().mo24357x(i);
                readLock2.unlock();
                ((C77752af) bnVar.f214283d.mo27525b()).mo72812f(dVar);
                C77782bi biVar2 = bnVar.f214285f;
                int m2 = bnVar.f214282c.mo72690m();
                C83334w wVar2 = biVar2.f214262b;
                C82887ec ecVar2 = C82887ec.SODA_SESSION_EVENT;
                C82883dz dzVar2 = (C82883dz) C82885ea.f225977c.createBuilder();
                C82952gn gnVar2 = (C82952gn) C82954gp.f226321e.createBuilder();
                gnVar2.copyOnWrite();
                C82954gp gpVar5 = (C82954gp) gnVar2.instance;
                if (m2 != 0) {
                    gpVar5.f226325c = m2;
                    gpVar5.f226323a |= 2;
                    gnVar2.copyOnWrite();
                    C82954gp gpVar6 = (C82954gp) gnVar2.instance;
                    gpVar6.f226324b = 3;
                    gpVar6.f226323a = 1 | gpVar6.f226323a;
                    C82954gp gpVar7 = (C82954gp) gnVar2.build();
                    dzVar2.copyOnWrite();
                    C82885ea eaVar2 = (C82885ea) dzVar2.instance;
                    gpVar7.getClass();
                    eaVar2.f225980b = gpVar7;
                    eaVar2.f225979a = 82;
                    wVar2.mo75545c(ecVar2, (C82885ea) dzVar2.build(), dVar.f218924a.b());
                    bnVar2 = bnVar.f214284e.mo72826a(asVar, dVar, Optional.m71637of(bnVar.f214293n), Optional.ofNullable(bnVar.f214294o));
                    this.f214323d = bnVar2;
                    return;
                }
                throw null;
            } catch (C77816u unused) {
                bnVar.f214287h.mo72795j(8);
                ((C58970a) ((C58970a) C77787bn.f214280a.mo56226d()).mo56372aa(4467)).mo56386p("Trying to reset but there is no Soda instance");
                bnVar.mo72825b();
            } catch (Throwable th2) {
                readLock2.unlock();
                throw th2;
            }
        }
    }
}
