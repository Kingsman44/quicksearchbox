package com.google.android.apps.gsa.nga.engine.recognition.p6125k;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.recognition.C77568au;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6407v.C82297c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82367co;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82432ez;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82487h;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82812bi;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82813bj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82955gq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60418pm;
import com.google.common.p4552o.C60420po;
import com.google.common.p4552o.C60421pp;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.k.a */
/* compiled from: PG */
public final class C77732a implements C75155d {

    /* renamed from: a */
    public final C79863k f214131a;

    /* renamed from: b */
    public final C83334w f214132b;

    /* renamed from: c */
    public final C82297c f214133c;

    /* renamed from: d */
    public final C21370a f214134d;

    /* renamed from: e */
    public final C83305i f214135e;

    /* renamed from: f */
    public final C68214a f214136f;

    /* renamed from: g */
    public final C76092h f214137g;

    /* renamed from: h */
    public final AtomicBoolean f214138h = new AtomicBoolean(false);

    public C77732a(C79863k kVar, C83334w wVar, C82297c cVar, C21370a aVar, C83305i iVar, C68214a aVar2, C76092h hVar) {
        this.f214131a = kVar;
        this.f214132b = wVar;
        this.f214133c = cVar;
        this.f214134d = aVar;
        this.f214135e = iVar;
        this.f214136f = aVar2;
        this.f214137g = hVar;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if (!boVar2.mo71473s() || !boVar.mo71470p() || boVar.mo71472r()) {
            this.f214138h.set(false);
        } else {
            this.f214138h.set(true);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final void mo72788c(C89849ae aeVar, C77889u uVar) {
        C79863k kVar = this.f214131a;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String name = uVar.name();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        name.getClass();
        cbVar.f160122c |= 1;
        cbVar.f160096ah = name;
        fVar.f246203c = (C59687cb) ajVar.build();
        kVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: d */
    public final void mo72789d(C82813bj bjVar, C83320io ioVar) {
        C79863k kVar = this.f214131a;
        C89849ae aeVar = C89849ae.NGA_ESTIMATED_END_OF_SPEECH;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C60421pp ppVar = bjVar.f225661d;
        if (ppVar == null) {
            ppVar = C60421pp.f163510e;
        }
        C60420po a = C60420po.m92578a(ppVar.f163514c);
        if (a == null) {
            a = C60420po.UNKNOWN;
        }
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160104ap = a.f163509l;
        cbVar.f160122c |= 128;
        kVar.mo74246l(aeVar, ioVar, ajVar, bjVar.f225660c);
        C83334w wVar = this.f214132b;
        C82887ec ecVar = C82887ec.END_OF_USER_SPEECH;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        bjVar.getClass();
        eaVar.f225980b = bjVar;
        eaVar.f225979a = 49;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
    }

    /* renamed from: e */
    public final void mo72790e(Duration duration, C60420po poVar, C83320io ioVar) {
        C82812bi biVar = (C82812bi) C82813bj.f225656e.createBuilder();
        long millis = duration.toMillis();
        long c = this.f214134d.mo26871c();
        long b = this.f214134d.mo26870b();
        biVar.copyOnWrite();
        C82813bj bjVar = (C82813bj) biVar.instance;
        bjVar.f225658a |= 1;
        bjVar.f225659b = (millis - c) + b;
        long nanos = duration.toNanos();
        biVar.copyOnWrite();
        C82813bj bjVar2 = (C82813bj) biVar.instance;
        bjVar2.f225658a |= 2;
        bjVar2.f225660c = nanos;
        C60418pm pmVar = (C60418pm) C60421pp.f163510e.createBuilder();
        pmVar.copyOnWrite();
        C60421pp ppVar = (C60421pp) pmVar.instance;
        ppVar.f163514c = poVar.f163509l;
        ppVar.f163512a |= 2;
        biVar.copyOnWrite();
        C82813bj bjVar3 = (C82813bj) biVar.instance;
        C60421pp ppVar2 = (C60421pp) pmVar.build();
        ppVar2.getClass();
        bjVar3.f225661d = ppVar2;
        bjVar3.f225658a |= 4;
        mo72789d((C82813bj) biVar.build(), ioVar);
    }

    /* renamed from: f */
    public final void mo72791f(HotwordResult hotwordResult, boolean z) {
        C83305i iVar = this.f214135e;
        String name = hotwordResult.mo84705v().name();
        if (name != null) {
            iVar.mo75579d(new C82367co("NGA_HOTWORD_DECISION_LOCAL_MDA", name, true != z ? "REJECTED" : "ACCEPTED"));
            return;
        }
        throw new NullPointerException("Null deviceType");
    }

    /* renamed from: g */
    public final void mo72792g(Duration duration, C83320io ioVar, C80478c cVar) {
        C79863k kVar = this.f214131a;
        C89849ae aeVar = C89849ae.NGA_TRUE_END_OF_QUERY;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        String name = cVar.name();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        name.getClass();
        cbVar.f160122c |= 1;
        cbVar.f160096ah = name;
        kVar.mo74246l(aeVar, ioVar, ajVar, duration.toNanos());
        C83334w wVar = this.f214132b;
        C82887ec ecVar = C82887ec.SPEECH_EVENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82955gq gqVar = (C82955gq) C82964gz.f226343j.createBuilder();
        gqVar.copyOnWrite();
        C82964gz gzVar = (C82964gz) gqVar.instance;
        gzVar.f226346b = 8;
        gzVar.f226345a |= 1;
        gqVar.copyOnWrite();
        C82964gz gzVar2 = (C82964gz) gqVar.instance;
        gzVar2.f226349e = cVar.getNumber();
        gzVar2.f226345a |= 16;
        long nanos = duration.toNanos();
        gqVar.copyOnWrite();
        C82964gz gzVar3 = (C82964gz) gqVar.instance;
        gzVar3.f226345a |= 64;
        gzVar3.f226351g = nanos;
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82964gz gzVar4 = (C82964gz) gqVar.build();
        gzVar4.getClass();
        eaVar.f225980b = gzVar4;
        eaVar.f225979a = 13;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
    }

    /* renamed from: h */
    public final void mo72793h(C77889u uVar, int i) {
        C83305i iVar = this.f214135e;
        String a = C77568au.m124486a(i);
        if (i != 0) {
            String name = uVar.name();
            if (name != null) {
                iVar.mo75579d(new C82487h("AUDIO_BUFFER_OVERFLOW", this.f214137g.mo72021b().mo72042g(), a, name));
                return;
            }
            throw new NullPointerException("Null speechRecognizer");
        }
        throw null;
    }

    /* renamed from: i */
    public final void mo72794i(int i, Duration duration, String str, C83320io ioVar) {
        int i2 = i == 1 ? 2 : 3;
        C82955gq gqVar = (C82955gq) C82964gz.f226343j.createBuilder();
        gqVar.copyOnWrite();
        C82964gz gzVar = (C82964gz) gqVar.instance;
        gzVar.f226346b = i2 - 1;
        gzVar.f226345a |= 1;
        gqVar.copyOnWrite();
        C82964gz gzVar2 = (C82964gz) gqVar.instance;
        str.getClass();
        gzVar2.f226345a |= 4;
        gzVar2.f226347c = str;
        if (!duration.isZero()) {
            duration.toMillis();
            long millis = duration.toMillis();
            gqVar.copyOnWrite();
            C82964gz gzVar3 = (C82964gz) gqVar.instance;
            gzVar3.f226345a |= 32;
            gzVar3.f226350f = millis;
        }
        C83334w wVar = this.f214132b;
        C82887ec ecVar = C82887ec.SPEECH_EVENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82964gz gzVar4 = (C82964gz) gqVar.build();
        gzVar4.getClass();
        eaVar.f225980b = gzVar4;
        eaVar.f225979a = 13;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
        String str2 = ioVar.f227136c;
    }

    /* renamed from: j */
    public final void mo72795j(int i) {
        String str;
        C83305i iVar = this.f214135e;
        boolean g = this.f214137g.mo72021b().mo72042g();
        if (i == 1) {
            str = "START_SODA_WITH_NON_VALID_SPEECH_PARAMS";
        } else if (i == 4) {
            str = "RESET_SODA_WITH_NON_VALID_SPEECH_PARAMS";
        } else if (i == 6) {
            str = "START_SODA_FAILED_SODA_NOT_INITIALIZED";
        } else if (i == 7) {
            str = "STOP_SODA_FAILED_SODA_NOT_INITIALIZED";
        } else if (i != 8) {
            switch (i) {
                case 11:
                    str = "STOP_SODA_BY_UTTERANCE_IDENTIFIER_FAILED";
                    break;
                case 12:
                    str = "EMPTY_SODA_FINAL_RECOGNITION";
                    break;
                case 13:
                    str = "SODA_UNEXPECTEDLY_STOPPED";
                    break;
                default:
                    str = "null";
                    break;
            }
        } else {
            str = "RESET_SODA_FAILED_SODA_NOT_INITIALIZED";
        }
        iVar.mo75579d(new C82432ez("NGA_SPEECH_ERROR", g, str));
    }
}
