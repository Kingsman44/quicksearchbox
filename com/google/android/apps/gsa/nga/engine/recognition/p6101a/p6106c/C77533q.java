package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82955gq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.q */
/* compiled from: PG */
public final /* synthetic */ class C77533q implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C77534r f213614a;

    public /* synthetic */ C77533q(C77534r rVar) {
        this.f213614a = rVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C77534r rVar = this.f213614a;
        Optional optional = (Optional) obj;
        rVar.f213622h.mo75090a(optional);
        if (optional.isPresent()) {
            C77732a aVar = rVar.f213621g;
            long nanos = ((Duration) optional.get()).toNanos();
            C80478c cVar = C80478c.UNKNOWN;
            C83320io ioVar = C83320io.f227132d;
            C79863k kVar = aVar.f214131a;
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.NGA_SPEECH_HANDLER_MIC_OPENED;
            fVar.f246204d = nanos;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            String name = cVar.name();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            name.getClass();
            cbVar.f160122c |= 1;
            cbVar.f160096ah = name;
            fVar.f246203c = (C59687cb) ajVar.build();
            kVar.mo74236a(fVar.mo83699a());
            C83334w wVar = aVar.f214132b;
            C82887ec ecVar = C82887ec.SPEECH_EVENT;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C82955gq gqVar = (C82955gq) C82964gz.f226343j.createBuilder();
            gqVar.copyOnWrite();
            C82964gz gzVar = (C82964gz) gqVar.instance;
            gzVar.f226346b = 7;
            gzVar.f226345a |= 1;
            gqVar.copyOnWrite();
            C82964gz gzVar2 = (C82964gz) gqVar.instance;
            gzVar2.f226349e = cVar.getNumber();
            gzVar2.f226345a |= 16;
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
            if (aVar.f214138h.get()) {
                C79863k kVar2 = aVar.f214131a;
                C89856f fVar2 = new C89856f();
                fVar2.f246201a = C89849ae.NGA_FIRST_INVOCATION_MIC_OPENED;
                fVar2.f246204d = nanos;
                kVar2.mo74236a(fVar2.mo83699a());
            }
        }
    }
}
