package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import android.net.Network;
import com.google.android.apps.gsa.nga.engine.as.k;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76088d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77772az;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77817v;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.C77859b;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.C77864c;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.C77865d;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6133b.C77860a;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6133b.C77861b;
import com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6133b.C77863d;
import com.google.android.apps.gsa.nga.engine.viss.C79391u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6288j.C80471b;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82970he;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82975hj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.s */
/* compiled from: PG */
public final class C77851s extends C79356f implements C77865d, k, C75155d {

    /* renamed from: a */
    private static final C58974d f214430a = C58974d.m91136j();

    /* renamed from: b */
    private final C91142g f214431b;

    /* renamed from: c */
    private final C77839g f214432c;

    /* renamed from: d */
    private final C68214a f214433d;

    /* renamed from: e */
    private final Set f214434e;

    /* renamed from: f */
    private final C79391u f214435f;

    /* renamed from: g */
    private final C58889cz f214436g;

    /* renamed from: h */
    private final C83334w f214437h;

    /* renamed from: i */
    private final C76092h f214438i;

    /* renamed from: j */
    private final boolean f214439j;

    /* renamed from: k */
    private final C77772az f214440k;

    /* renamed from: l */
    private C80471b f214441l = C80471b.SODA;

    /* renamed from: m */
    private final C80642f f214442m;

    /* renamed from: n */
    private C77859b f214443n = C77859b.HYBRID;

    /* renamed from: o */
    private long f214444o;

    /* renamed from: p */
    private long f214445p;

    public C77851s(C91142g gVar, C77839g gVar2, C68214a aVar, Set set, C79391u uVar, C58889cz czVar, C83334w wVar, C76092h hVar, C79359i iVar, boolean z, C80642f fVar, C77772az azVar) {
        super(iVar);
        this.f214431b = gVar;
        this.f214432c = gVar2;
        this.f214433d = aVar;
        this.f214434e = set;
        this.f214435f = uVar;
        this.f214436g = czVar;
        this.f214437h = wVar;
        this.f214438i = hVar;
        this.f214439j = z;
        this.f214444o = czVar.mo26884a();
        this.f214442m = fVar;
        this.f214440k = azVar;
    }

    /* renamed from: e */
    private final Optional m124897e(C75077bo boVar) {
        if (!this.f214438i.mo72021b().mo72042g()) {
            C77860a aVar = (C77860a) C77861b.f214467e.createBuilder();
            C77859b bVar = this.f214443n;
            aVar.copyOnWrite();
            C77861b bVar2 = (C77861b) aVar.instance;
            bVar2.f214472d = bVar.getNumber();
            bVar2.f214469a |= 4;
            C80471b bVar3 = C80471b.S3;
            aVar.copyOnWrite();
            C77861b bVar4 = (C77861b) aVar.instance;
            bVar4.f214470b = bVar3.f220865d;
            bVar4.f214469a |= 1;
            C77863d dVar = C77863d.ON_DEVICE_DISABLED;
            aVar.copyOnWrite();
            C77861b bVar5 = (C77861b) aVar.instance;
            bVar5.f214471c = dVar.f214495u;
            bVar5.f214469a |= 2;
            return Optional.m71637of((C77861b) aVar.build());
        } else if (!((C76088d) this.f214433d.mo27525b()).mo71201gC()) {
            C77860a aVar2 = (C77860a) C77861b.f214467e.createBuilder();
            C77859b bVar6 = this.f214443n;
            aVar2.copyOnWrite();
            C77861b bVar7 = (C77861b) aVar2.instance;
            bVar7.f214472d = bVar6.getNumber();
            bVar7.f214469a |= 4;
            C80471b bVar8 = C80471b.S3;
            aVar2.copyOnWrite();
            C77861b bVar9 = (C77861b) aVar2.instance;
            bVar9.f214470b = bVar8.f220865d;
            bVar9.f214469a |= 1;
            C77863d dVar2 = C77863d.SODA_COMPONENT_DISABLED;
            aVar2.copyOnWrite();
            C77861b bVar10 = (C77861b) aVar2.instance;
            bVar10.f214471c = dVar2.f214495u;
            bVar10.f214469a |= 2;
            return Optional.m71637of((C77861b) aVar2.build());
        } else {
            C77817v vVar = this.f214440k.f214237f;
            Lock readLock = vVar.f214367k.readLock();
            readLock.lock();
            try {
                if (vVar.f214369m == null) {
                    C77860a aVar3 = (C77860a) C77861b.f214467e.createBuilder();
                    C77859b bVar11 = this.f214443n;
                    aVar3.copyOnWrite();
                    C77861b bVar12 = (C77861b) aVar3.instance;
                    bVar12.f214472d = bVar11.getNumber();
                    bVar12.f214469a |= 4;
                    C80471b bVar13 = C80471b.S3;
                    aVar3.copyOnWrite();
                    C77861b bVar14 = (C77861b) aVar3.instance;
                    bVar14.f214470b = bVar13.f220865d;
                    bVar14.f214469a |= 1;
                    C77863d dVar3 = C77863d.SODA_INITIALIZATION_FAILED;
                    aVar3.copyOnWrite();
                    C77861b bVar15 = (C77861b) aVar3.instance;
                    bVar15.f214471c = dVar3.f214495u;
                    bVar15.f214469a |= 2;
                    return Optional.m71637of((C77861b) aVar3.build());
                } else if (this.f214442m.mo74379e(boVar.mo71465k()).equals(Optional.m71637of(C80471b.S3))) {
                    C77860a aVar4 = (C77860a) C77861b.f214467e.createBuilder();
                    C77859b bVar16 = this.f214443n;
                    aVar4.copyOnWrite();
                    C77861b bVar17 = (C77861b) aVar4.instance;
                    bVar17.f214472d = bVar16.getNumber();
                    bVar17.f214469a |= 4;
                    C80471b bVar18 = C80471b.S3;
                    aVar4.copyOnWrite();
                    C77861b bVar19 = (C77861b) aVar4.instance;
                    bVar19.f214470b = bVar18.f220865d;
                    bVar19.f214469a |= 1;
                    C77863d dVar4 = C77863d.CLIENT_CONFIGURATION;
                    aVar4.copyOnWrite();
                    C77861b bVar20 = (C77861b) aVar4.instance;
                    bVar20.f214471c = dVar4.f214495u;
                    bVar20.f214469a |= 2;
                    return Optional.m71637of((C77861b) aVar4.build());
                } else if (!boVar.mo71476v()) {
                    return Optional.empty();
                } else {
                    C77860a aVar5 = (C77860a) C77861b.f214467e.createBuilder();
                    C77859b bVar21 = this.f214443n;
                    aVar5.copyOnWrite();
                    C77861b bVar22 = (C77861b) aVar5.instance;
                    bVar22.f214472d = bVar21.getNumber();
                    bVar22.f214469a |= 4;
                    C80471b bVar23 = C80471b.S3;
                    aVar5.copyOnWrite();
                    C77861b bVar24 = (C77861b) aVar5.instance;
                    bVar24.f214470b = bVar23.f220865d;
                    bVar24.f214469a |= 1;
                    C77863d dVar5 = C77863d.BLUETOOTH;
                    aVar5.copyOnWrite();
                    C77861b bVar25 = (C77861b) aVar5.instance;
                    bVar25.f214471c = dVar5.f214495u;
                    bVar25.f214469a |= 2;
                    return Optional.m71637of((C77861b) aVar5.build());
                }
            } finally {
                readLock.unlock();
            }
        }
    }

    /* renamed from: g */
    private final Optional m124898g(C75077bo boVar) {
        if (this.f214442m.mo74379e(boVar.mo71465k()).equals(Optional.m71637of(C80471b.SODA))) {
            C77860a aVar = (C77860a) C77861b.f214467e.createBuilder();
            C77859b bVar = this.f214443n;
            aVar.copyOnWrite();
            C77861b bVar2 = (C77861b) aVar.instance;
            bVar2.f214472d = bVar.getNumber();
            bVar2.f214469a |= 4;
            C80471b bVar3 = C80471b.SODA;
            aVar.copyOnWrite();
            C77861b bVar4 = (C77861b) aVar.instance;
            bVar4.f214470b = bVar3.f220865d;
            bVar4.f214469a |= 1;
            C77863d dVar = C77863d.CLIENT_CONFIGURATION;
            aVar.copyOnWrite();
            C77861b bVar5 = (C77861b) aVar.instance;
            bVar5.f214471c = dVar.f214495u;
            bVar5.f214469a |= 2;
            return Optional.m71637of((C77861b) aVar.build());
        } else if (!boVar.mo71471q()) {
            return Optional.empty();
        } else {
            C77860a aVar2 = (C77860a) C77861b.f214467e.createBuilder();
            C77859b bVar6 = this.f214443n;
            aVar2.copyOnWrite();
            C77861b bVar7 = (C77861b) aVar2.instance;
            bVar7.f214472d = bVar6.getNumber();
            bVar7.f214469a |= 4;
            C80471b bVar8 = C80471b.SODA;
            aVar2.copyOnWrite();
            C77861b bVar9 = (C77861b) aVar2.instance;
            bVar9.f214470b = bVar8.f220865d;
            bVar9.f214469a |= 1;
            C77863d dVar2 = C77863d.HALF_LISTENING;
            aVar2.copyOnWrite();
            C77861b bVar10 = (C77861b) aVar2.instance;
            bVar10.f214471c = dVar2.f214495u;
            bVar10.f214469a |= 2;
            return Optional.m71637of((C77861b) aVar2.build());
        }
    }

    /* renamed from: j */
    private final synchronized void m124899j(C77861b bVar) {
        C58970a aVar = (C58970a) ((C58970a) f214430a.mo56224b()).mo56372aa(4505);
        C80471b a = C80471b.m128170a(bVar.f214470b);
        if (a == null) {
            a = C80471b.SODA;
        }
        C77859b a2 = C77859b.m124920a(bVar.f214472d);
        if (a2 == null) {
            a2 = C77859b.DEFAULT_SODA_ONLY;
        }
        C77863d a3 = C77863d.m124922a(bVar.f214471c);
        if (a3 == null) {
            a3 = C77863d.UNKNOWN;
        }
        aVar.mo56359L("Recognizer choice: (recognizer_type: %s, recognizer_mode: %s, choice_reason: %s)", a, a2, a3);
        C80471b a4 = C80471b.m128170a(bVar.f214470b);
        if (a4 == null) {
            a4 = C80471b.SODA;
        }
        if (!a4.equals(this.f214441l)) {
            C80471b a5 = C80471b.m128170a(bVar.f214470b);
            if (a5 == null) {
                a5 = C80471b.SODA;
            }
            this.f214441l = a5;
            this.f214445p = this.f214436g.mo26884a();
            for (C77864c cVar : this.f214434e) {
                C80471b a6 = C80471b.m128170a(bVar.f214470b);
                if (a6 == null) {
                    a6 = C80471b.SODA;
                }
                cVar.mo72836f(a6);
            }
            C58970a aVar2 = (C58970a) ((C58970a) f214430a.mo56224b()).mo56372aa(4506);
            C80471b a7 = C80471b.m128170a(bVar.f214470b);
            if (a7 == null) {
                a7 = C80471b.SODA;
            }
            aVar2.mo56389s("New recognizer: %s", a7);
            C83334w wVar = this.f214437h;
            C82887ec ecVar = C82887ec.SPEECH_RECOGNITION_SWITCH;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C82970he heVar = (C82970he) C82975hj.f226373c.createBuilder();
            C80471b a8 = C80471b.m128170a(bVar.f214470b);
            if (a8 == null) {
                a8 = C80471b.SODA;
            }
            String name = a8.name();
            heVar.copyOnWrite();
            C82975hj hjVar = (C82975hj) heVar.instance;
            name.getClass();
            hjVar.f226375a = 1;
            hjVar.f226376b = name;
            C82975hj hjVar2 = (C82975hj) heVar.build();
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            hjVar2.getClass();
            eaVar.f225980b = hjVar2;
            eaVar.f225979a = 59;
            wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
        }
    }

    /* renamed from: k */
    private final synchronized void m124900k() {
        C77859b bVar = (C77859b) Optional.ofNullable(C77859b.m124920a((int) this.f214431b.mo85399d(C90126fx.f251666nC))).orElse(C77859b.UNRECOGNIZED);
        if (this.f214439j) {
            bVar = C77859b.S3_ONLY;
        } else {
            C76090f b = this.f214438i.mo72021b();
            if (b.mo72037c().size() <= 1 && C81451b.m129570a(b.mo72039e(), this.f214431b.mo85403h(C90126fx.f251749og))) {
                ((C58970a) ((C58970a) f214430a.mo56224b()).mo56372aa(4508)).mo56386p("100 percent SODA launched, uses SODA_ONLY_WHEN_POSSIBLE");
                bVar = C77859b.SODA_ONLY_WHEN_POSSIBLE;
            }
        }
        if (!bVar.equals(this.f214443n)) {
            this.f214443n = bVar;
            if (bVar.equals(C77859b.DEFAULT_SODA_ONLY)) {
                C77860a aVar = (C77860a) C77861b.f214467e.createBuilder();
                C77859b bVar2 = C77859b.DEFAULT_SODA_ONLY;
                aVar.copyOnWrite();
                C77861b bVar3 = (C77861b) aVar.instance;
                bVar3.f214472d = bVar2.getNumber();
                bVar3.f214469a |= 4;
                C80471b bVar4 = C80471b.SODA;
                aVar.copyOnWrite();
                C77861b bVar5 = (C77861b) aVar.instance;
                bVar5.f214470b = bVar4.f220865d;
                bVar5.f214469a |= 1;
                C77863d dVar = C77863d.SODA_ONLY_MODE;
                aVar.copyOnWrite();
                C77861b bVar6 = (C77861b) aVar.instance;
                bVar6.f214471c = dVar.f214495u;
                bVar6.f214469a |= 2;
                m124899j((C77861b) aVar.build());
            } else if (this.f214443n.equals(C77859b.S3_ONLY)) {
                C77860a aVar2 = (C77860a) C77861b.f214467e.createBuilder();
                C77859b bVar7 = C77859b.S3_ONLY;
                aVar2.copyOnWrite();
                C77861b bVar8 = (C77861b) aVar2.instance;
                bVar8.f214472d = bVar7.getNumber();
                bVar8.f214469a |= 4;
                C80471b bVar9 = C80471b.S3;
                aVar2.copyOnWrite();
                C77861b bVar10 = (C77861b) aVar2.instance;
                bVar10.f214470b = bVar9.f220865d;
                bVar10.f214469a |= 1;
                C77863d dVar2 = C77863d.S3_ONLY_MODE;
                aVar2.copyOnWrite();
                C77861b bVar11 = (C77861b) aVar2.instance;
                bVar11.f214471c = dVar2.f214495u;
                bVar11.f214469a |= 2;
                m124899j((C77861b) aVar2.build());
            }
            if (this.f214441l == null) {
                C77860a aVar3 = (C77860a) C77861b.f214467e.createBuilder();
                C77859b bVar12 = C77859b.UNRECOGNIZED;
                aVar3.copyOnWrite();
                C77861b bVar13 = (C77861b) aVar3.instance;
                bVar13.f214472d = bVar12.getNumber();
                bVar13.f214469a |= 4;
                C80471b bVar14 = C80471b.SODA;
                aVar3.copyOnWrite();
                C77861b bVar15 = (C77861b) aVar3.instance;
                bVar15.f214470b = bVar14.f220865d;
                bVar15.f214469a |= 1;
                C77863d dVar3 = C77863d.UNKNOWN;
                aVar3.copyOnWrite();
                C77861b bVar16 = (C77861b) aVar3.instance;
                bVar16.f214471c = dVar3.f214495u;
                bVar16.f214469a |= 2;
                m124899j((C77861b) aVar3.build());
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71137a(C75077bo boVar, C75077bo boVar2) {
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
        if (blVar == bl.c) {
            this.f214444o = this.f214436g.mo26884a();
        }
    }

    /* renamed from: d */
    public final synchronized C80471b mo72841d(C75077bo boVar) {
        C77861b bVar;
        Optional optional;
        if (boVar.mo71472r()) {
            if (!((Boolean) boVar.mo71463g().map(C77850r.f214429a).orElse(false)).booleanValue()) {
                ((C58970a) ((C58970a) f214430a.mo56224b()).mo56372aa(4504)).mo56386p(" DSP trigger. Not switching recognizer.");
                return this.f214441l;
            }
        }
        if (!boVar.mo71469o()) {
            Optional e = this.f214442m.mo74379e(boVar.mo71465k());
            if (e.isPresent()) {
                C77860a aVar = (C77860a) C77861b.f214467e.createBuilder();
                C77859b bVar2 = this.f214443n;
                aVar.copyOnWrite();
                C77861b bVar3 = (C77861b) aVar.instance;
                bVar3.f214472d = bVar2.getNumber();
                bVar3.f214469a |= 4;
                aVar.copyOnWrite();
                C77861b bVar4 = (C77861b) aVar.instance;
                bVar4.f214470b = ((C80471b) e.get()).f220865d;
                bVar4.f214469a |= 1;
                C77863d dVar = C77863d.CLIENT_CONFIGURATION;
                aVar.copyOnWrite();
                C77861b bVar5 = (C77861b) aVar.instance;
                bVar5.f214471c = dVar.f214495u;
                bVar5.f214469a |= 2;
                bVar = (C77861b) aVar.build();
            } else {
                C77859b bVar6 = C77859b.DEFAULT_SODA_ONLY;
                switch (this.f214443n.ordinal()) {
                    case 0:
                    case 6:
                        C77860a aVar2 = (C77860a) C77861b.f214467e.createBuilder();
                        C77859b bVar7 = C77859b.DEFAULT_SODA_ONLY;
                        aVar2.copyOnWrite();
                        C77861b bVar8 = (C77861b) aVar2.instance;
                        bVar8.f214472d = bVar7.getNumber();
                        bVar8.f214469a |= 4;
                        C80471b bVar9 = C80471b.SODA;
                        aVar2.copyOnWrite();
                        C77861b bVar10 = (C77861b) aVar2.instance;
                        bVar10.f214470b = bVar9.f220865d;
                        bVar10.f214469a |= 1;
                        C77863d dVar2 = C77863d.SODA_ONLY_MODE;
                        aVar2.copyOnWrite();
                        C77861b bVar11 = (C77861b) aVar2.instance;
                        bVar11.f214471c = dVar2.f214495u;
                        bVar11.f214469a |= 2;
                        bVar = (C77861b) aVar2.build();
                        break;
                    case 1:
                        C77860a aVar3 = (C77860a) C77861b.f214467e.createBuilder();
                        C77859b bVar12 = C77859b.S3_ONLY;
                        aVar3.copyOnWrite();
                        C77861b bVar13 = (C77861b) aVar3.instance;
                        bVar13.f214472d = bVar12.getNumber();
                        bVar13.f214469a |= 4;
                        C80471b bVar14 = C80471b.S3;
                        aVar3.copyOnWrite();
                        C77861b bVar15 = (C77861b) aVar3.instance;
                        bVar15.f214470b = bVar14.f220865d;
                        bVar15.f214469a |= 1;
                        C77863d dVar3 = C77863d.S3_ONLY_MODE;
                        aVar3.copyOnWrite();
                        C77861b bVar16 = (C77861b) aVar3.instance;
                        bVar16.f214471c = dVar3.f214495u;
                        bVar16.f214469a |= 2;
                        bVar = (C77861b) aVar3.build();
                        break;
                    case 2:
                    case 3:
                        Optional g = m124898g(boVar);
                        if (!g.isPresent()) {
                            Optional e2 = m124897e(boVar);
                            if (!e2.isPresent()) {
                                if (!boVar.mo71460d().equals(C83016y.RETRY)) {
                                    if (!Objects.equals(this.f214441l, C80471b.SODA) || Duration.ofNanos(this.f214436g.mo26884a() - this.f214445p).compareTo(Duration.ofMillis(this.f214431b.mo85399d(C90126fx.f251673nJ))) >= 0) {
                                        if (this.f214436g.mo26884a() - this.f214444o > Duration.ofSeconds(this.f214431b.mo85399d(C90126fx.f251515kK)).toNanos()) {
                                            C77860a aVar4 = (C77860a) C77861b.f214467e.createBuilder();
                                            C77859b bVar17 = this.f214443n;
                                            aVar4.copyOnWrite();
                                            C77861b bVar18 = (C77861b) aVar4.instance;
                                            bVar18.f214472d = bVar17.getNumber();
                                            bVar18.f214469a |= 4;
                                            C80471b bVar19 = C80471b.SODA;
                                            aVar4.copyOnWrite();
                                            C77861b bVar20 = (C77861b) aVar4.instance;
                                            bVar20.f214470b = bVar19.f220865d;
                                            bVar20.f214469a |= 1;
                                            C77863d dVar4 = C77863d.COLD_START;
                                            aVar4.copyOnWrite();
                                            C77861b bVar21 = (C77861b) aVar4.instance;
                                            bVar21.f214471c = dVar4.f214495u;
                                            bVar21.f214469a |= 2;
                                            optional = Optional.m71637of((C77861b) aVar4.build());
                                        } else {
                                            optional = Optional.empty();
                                        }
                                    } else {
                                        C77860a aVar5 = (C77860a) C77861b.f214467e.createBuilder();
                                        C77859b bVar22 = this.f214443n;
                                        aVar5.copyOnWrite();
                                        C77861b bVar23 = (C77861b) aVar5.instance;
                                        bVar23.f214472d = bVar22.getNumber();
                                        bVar23.f214469a |= 4;
                                        C80471b bVar24 = C80471b.SODA;
                                        aVar5.copyOnWrite();
                                        C77861b bVar25 = (C77861b) aVar5.instance;
                                        bVar25.f214470b = bVar24.f220865d;
                                        bVar25.f214469a |= 1;
                                        C77863d dVar5 = C77863d.FAST_FLIPPING;
                                        aVar5.copyOnWrite();
                                        C77861b bVar26 = (C77861b) aVar5.instance;
                                        bVar26.f214471c = dVar5.f214495u;
                                        bVar26.f214469a |= 2;
                                        optional = Optional.m71637of((C77861b) aVar5.build());
                                    }
                                    if (!optional.isPresent()) {
                                        if (this.f214435f.mo74010c()) {
                                            if (this.f214432c.mo72839d()) {
                                                C77860a aVar6 = (C77860a) C77861b.f214467e.createBuilder();
                                                C77859b bVar27 = C77859b.HYBRID;
                                                aVar6.copyOnWrite();
                                                C77861b bVar28 = (C77861b) aVar6.instance;
                                                bVar28.f214472d = bVar27.getNumber();
                                                bVar28.f214469a |= 4;
                                                C80471b bVar29 = C80471b.S3;
                                                aVar6.copyOnWrite();
                                                C77861b bVar30 = (C77861b) aVar6.instance;
                                                bVar30.f214470b = bVar29.f220865d;
                                                bVar30.f214469a |= 1;
                                                C77863d dVar6 = C77863d.GOOD_NETWORK;
                                                aVar6.copyOnWrite();
                                                C77861b bVar31 = (C77861b) aVar6.instance;
                                                bVar31.f214471c = dVar6.f214495u;
                                                bVar31.f214469a |= 2;
                                                bVar = (C77861b) aVar6.build();
                                                break;
                                            } else {
                                                C77860a aVar7 = (C77860a) C77861b.f214467e.createBuilder();
                                                C77859b bVar32 = C77859b.HYBRID;
                                                aVar7.copyOnWrite();
                                                C77861b bVar33 = (C77861b) aVar7.instance;
                                                bVar33.f214472d = bVar32.getNumber();
                                                bVar33.f214469a |= 4;
                                                C80471b bVar34 = C80471b.SODA;
                                                aVar7.copyOnWrite();
                                                C77861b bVar35 = (C77861b) aVar7.instance;
                                                bVar35.f214470b = bVar34.f220865d;
                                                bVar35.f214469a |= 1;
                                                C77863d dVar7 = C77863d.BAD_NETWORK;
                                                aVar7.copyOnWrite();
                                                C77861b bVar36 = (C77861b) aVar7.instance;
                                                bVar36.f214471c = dVar7.f214495u;
                                                bVar36.f214469a |= 2;
                                                bVar = (C77861b) aVar7.build();
                                                break;
                                            }
                                        } else {
                                            C77860a aVar8 = (C77860a) C77861b.f214467e.createBuilder();
                                            C77859b bVar37 = C77859b.HYBRID;
                                            aVar8.copyOnWrite();
                                            C77861b bVar38 = (C77861b) aVar8.instance;
                                            bVar38.f214472d = bVar37.getNumber();
                                            bVar38.f214469a |= 4;
                                            C80471b bVar39 = C80471b.SODA;
                                            aVar8.copyOnWrite();
                                            C77861b bVar40 = (C77861b) aVar8.instance;
                                            bVar40.f214470b = bVar39.f220865d;
                                            bVar40.f214469a |= 1;
                                            C77863d dVar8 = C77863d.SEARCH_PROCESS_DEAD;
                                            aVar8.copyOnWrite();
                                            C77861b bVar41 = (C77861b) aVar8.instance;
                                            bVar41.f214471c = dVar8.f214495u;
                                            bVar41.f214469a |= 2;
                                            bVar = (C77861b) aVar8.build();
                                            break;
                                        }
                                    } else {
                                        bVar = (C77861b) optional.get();
                                        break;
                                    }
                                } else {
                                    C77860a aVar9 = (C77860a) C77861b.f214467e.createBuilder();
                                    C77859b bVar42 = C77859b.HYBRID;
                                    aVar9.copyOnWrite();
                                    C77861b bVar43 = (C77861b) aVar9.instance;
                                    bVar43.f214472d = bVar42.getNumber();
                                    bVar43.f214469a |= 4;
                                    C80471b bVar44 = C80471b.SODA;
                                    aVar9.copyOnWrite();
                                    C77861b bVar45 = (C77861b) aVar9.instance;
                                    bVar45.f214470b = bVar44.f220865d;
                                    bVar45.f214469a |= 1;
                                    C77863d dVar9 = C77863d.RETRYING;
                                    aVar9.copyOnWrite();
                                    C77861b bVar46 = (C77861b) aVar9.instance;
                                    bVar46.f214471c = dVar9.f214495u;
                                    bVar46.f214469a |= 2;
                                    bVar = (C77861b) aVar9.build();
                                    break;
                                }
                            } else {
                                bVar = (C77861b) e2.get();
                                break;
                            }
                        } else {
                            bVar = (C77861b) g.get();
                            break;
                        }
                        break;
                    case 4:
                        Optional g2 = m124898g(boVar);
                        if (!g2.isPresent()) {
                            Optional e3 = m124897e(boVar);
                            if (!e3.isPresent()) {
                                this.f214432c.mo72839d();
                                C77860a aVar10 = (C77860a) C77861b.f214467e.createBuilder();
                                C77859b bVar47 = C77859b.SODA_ONLY_WHEN_POSSIBLE;
                                aVar10.copyOnWrite();
                                C77861b bVar48 = (C77861b) aVar10.instance;
                                bVar48.f214472d = bVar47.getNumber();
                                bVar48.f214469a |= 4;
                                C80471b bVar49 = C80471b.SODA;
                                aVar10.copyOnWrite();
                                C77861b bVar50 = (C77861b) aVar10.instance;
                                bVar50.f214470b = bVar49.f220865d;
                                bVar50.f214469a |= 1;
                                C77863d dVar10 = C77863d.SODA_ONLY_MODE;
                                aVar10.copyOnWrite();
                                C77861b bVar51 = (C77861b) aVar10.instance;
                                bVar51.f214471c = dVar10.f214495u;
                                bVar51.f214469a |= 2;
                                bVar = (C77861b) aVar10.build();
                                break;
                            } else {
                                bVar = (C77861b) e3.get();
                                break;
                            }
                        } else {
                            bVar = (C77861b) g2.get();
                            break;
                        }
                    case 5:
                        Optional g3 = m124898g(boVar);
                        if (!g3.isPresent()) {
                            Optional e4 = m124897e(boVar);
                            if (!e4.isPresent()) {
                                C77839g gVar = this.f214432c;
                                Network activeNetwork = gVar.f214417c.getActiveNetwork();
                                if (activeNetwork != null) {
                                    if (gVar.mo72838c(activeNetwork)) {
                                        C77860a aVar11 = (C77860a) C77861b.f214467e.createBuilder();
                                        C77859b bVar52 = C77859b.S3_UNLESS_OFFLINE;
                                        aVar11.copyOnWrite();
                                        C77861b bVar53 = (C77861b) aVar11.instance;
                                        bVar53.f214472d = bVar52.getNumber();
                                        bVar53.f214469a |= 4;
                                        C80471b bVar54 = C80471b.S3;
                                        aVar11.copyOnWrite();
                                        C77861b bVar55 = (C77861b) aVar11.instance;
                                        bVar55.f214470b = bVar54.f220865d;
                                        bVar55.f214469a |= 1;
                                        C77863d dVar11 = C77863d.NETWORK_AVAILABLE;
                                        aVar11.copyOnWrite();
                                        C77861b bVar56 = (C77861b) aVar11.instance;
                                        bVar56.f214471c = dVar11.f214495u;
                                        bVar56.f214469a |= 2;
                                        bVar = (C77861b) aVar11.build();
                                        break;
                                    }
                                } else {
                                    ((C58970a) ((C58970a) C77839g.f214415a.mo56224b()).mo56372aa(4497)).mo56386p("No active network");
                                }
                                C77860a aVar12 = (C77860a) C77861b.f214467e.createBuilder();
                                C77859b bVar57 = C77859b.S3_UNLESS_OFFLINE;
                                aVar12.copyOnWrite();
                                C77861b bVar58 = (C77861b) aVar12.instance;
                                bVar58.f214472d = bVar57.getNumber();
                                bVar58.f214469a |= 4;
                                C80471b bVar59 = C80471b.SODA;
                                aVar12.copyOnWrite();
                                C77861b bVar60 = (C77861b) aVar12.instance;
                                bVar60.f214470b = bVar59.f220865d;
                                bVar60.f214469a |= 1;
                                C77863d dVar12 = C77863d.NETWORK_NOT_AVAILABLE;
                                aVar12.copyOnWrite();
                                C77861b bVar61 = (C77861b) aVar12.instance;
                                bVar61.f214471c = dVar12.f214495u;
                                bVar61.f214469a |= 2;
                                bVar = (C77861b) aVar12.build();
                                break;
                            } else {
                                bVar = (C77861b) e4.get();
                                break;
                            }
                        } else {
                            bVar = (C77861b) g3.get();
                            break;
                        }
                    default:
                        throw new AssertionError();
                }
            }
            m124899j(bVar);
            return this.f214441l;
        }
        return this.f214441l;
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f214438i.mo72021b().mo72041f();
    }

    /* renamed from: gE */
    public final void mo72033gE(C58528ij ijVar) {
        if (ijVar.contains(Integer.valueOf(C90126fx.f251666nC.f250556a)) || ijVar.contains(Integer.valueOf(C90126fx.f251749og.f251802a))) {
            m124900k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        m124900k();
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "SwitchManager";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 42;
    }
}
