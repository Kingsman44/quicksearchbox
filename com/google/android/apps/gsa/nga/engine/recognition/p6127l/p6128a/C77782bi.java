package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.d.a.fa;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77822b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;
import java.io.File;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.bi */
/* compiled from: PG */
public final class C77782bi implements C90991b {

    /* renamed from: a */
    public static final C58974d f214261a = C58974d.m91136j();

    /* renamed from: b */
    public final C83334w f214262b;

    /* renamed from: c */
    public final C79863k f214263c;

    /* renamed from: d */
    public final C83305i f214264d;

    /* renamed from: e */
    public final C22871g f214265e;

    /* renamed from: f */
    public final fa f214266f;

    /* renamed from: g */
    public final C77822b f214267g;

    /* renamed from: h */
    public final C91142g f214268h;

    /* renamed from: i */
    public final Random f214269i;

    /* renamed from: j */
    public Optional f214270j = Optional.empty();

    /* renamed from: k */
    public final AtomicReference f214271k = new AtomicReference();

    /* renamed from: l */
    public final AtomicReference f214272l = new AtomicReference();

    /* renamed from: m */
    private final C77732a f214273m;

    public C77782bi(C83334w wVar, C77732a aVar, C79863k kVar, C83305i iVar, C22871g gVar, fa faVar, C77822b bVar, C91142g gVar2, Random random) {
        this.f214262b = wVar;
        this.f214273m = aVar;
        this.f214263c = kVar;
        this.f214264d = iVar;
        this.f214265e = gVar;
        this.f214266f = faVar;
        this.f214267g = bVar;
        this.f214268h = gVar2;
        this.f214269i = random;
    }

    /* renamed from: a */
    public static long m124786a(File file) {
        long j;
        long j2 = 0;
        if (!file.exists()) {
            return 0;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        j = file2.length();
                    } else {
                        j = m124786a(file2);
                    }
                    j2 += j;
                }
            }
        } else if (file.isFile()) {
            return file.length();
        }
        return j2;
    }

    /* renamed from: b */
    public final Optional mo72820b() {
        return this.f214270j.map(C77779bf.f214258a);
    }

    /* renamed from: c */
    public final Optional mo72821c() {
        return this.f214270j.map(C77775bb.f214248a);
    }

    /* renamed from: e */
    public final void mo72822e(C89857g gVar) {
        C59582aj ajVar;
        C77732a aVar = this.f214273m;
        C77889u uVar = C77889u.SODA;
        C59687cb cbVar = gVar.f246209d;
        if (cbVar != null) {
            ajVar = (C59582aj) cbVar.toBuilder();
        } else {
            ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        }
        C79863k kVar = aVar.f214131a;
        C89856f fVar = new C89856f();
        fVar.mo83700b(gVar);
        String name = uVar.name();
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        name.getClass();
        cbVar2.f160122c |= 1;
        cbVar2.f160096ah = name;
        fVar.f246203c = (C59687cb) ajVar.build();
        kVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: f */
    public final void mo72823f(C66999hh hhVar, C67150mx mxVar) {
        this.f214265e.mo28212l("[NGA] SodaLogger.onSodaInit", new C77777bd(this, mxVar, hhVar));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NGA Soda information");
        C67152mz mzVar = (C67152mz) this.f214271k.get();
        this.f214270j.ifPresent(new C77776bc(fVar));
        if (mzVar != null) {
            fVar.mo85278b("Soda config status").mo85276a(C90752i.m148229c(mzVar.name()));
        }
    }
}
