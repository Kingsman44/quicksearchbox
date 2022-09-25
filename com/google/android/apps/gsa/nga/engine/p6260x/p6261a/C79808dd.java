package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.nga.engine.at.a.b;
import com.google.android.apps.gsa.nga.engine.p5961at.C75043a;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6407v.C83278h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82980ho;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82981hp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82983hr;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89852b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7051b.C89862l;
import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import dagger.C68214a;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.dd */
/* compiled from: PG */
public final class C79808dd extends C89859i implements C79863k {

    /* renamed from: a */
    public final C22871g f218800a;

    /* renamed from: b */
    public final Object f218801b = new Object();

    /* renamed from: c */
    public ArrayList f218802c = new ArrayList();

    /* renamed from: d */
    public boolean f218803d = false;

    /* renamed from: e */
    public Optional f218804e = Optional.empty();

    /* renamed from: f */
    private final C68214a f218805f;

    /* renamed from: g */
    private final C68214a f218806g;

    /* renamed from: h */
    private final C58889cz f218807h;

    /* renamed from: i */
    private final C79853ak f218808i;

    /* renamed from: j */
    private final C75043a f218809j;

    /* renamed from: k */
    private final C83278h f218810k;

    public C79808dd(C68214a aVar, C68214a aVar2, C22871g gVar, C58889cz czVar, C79853ak akVar, C75043a aVar3, C83278h hVar) {
        this.f218805f = aVar;
        this.f218806g = aVar2;
        this.f218800a = gVar;
        this.f218807h = czVar;
        this.f218808i = akVar;
        this.f218809j = aVar3;
        this.f218810k = hVar;
    }

    /* renamed from: q */
    private final C89857g m127922q(C89849ae aeVar, C83320io ioVar, boolean z, boolean z2, long j, C59582aj ajVar) {
        String str;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        if (j != 0) {
            fVar.f246204d = j;
        }
        if (ioVar.f227136c.isEmpty()) {
            fVar.f246203c = (C59687cb) ajVar.build();
            return fVar.mo83699a();
        }
        fVar.mo83701c("RecognitionUtteranceId", ioVar.f227136c);
        if (z) {
            fVar.mo83701c("RecognitionCandidateId", ioVar.f227135b);
        }
        C59687cb cbVar = (C59687cb) ajVar.instance;
        if ((cbVar.f160062a & 4) != 0) {
            str = cbVar.f160127h;
        } else {
            str = this.f218808i.mo74223h(ioVar);
        }
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        str.getClass();
        cbVar2.f160062a |= 4;
        cbVar2.f160127h = str;
        if (z) {
            String str2 = ioVar.f227135b;
            ajVar.copyOnWrite();
            C59687cb cbVar3 = (C59687cb) ajVar.instance;
            str2.getClass();
            cbVar3.f160123d |= 128;
            cbVar3.f160076aN = str2;
        }
        if (z2) {
            fVar.mo83701c("rId", str);
        }
        fVar.f246203c = (C59687cb) ajVar.build();
        return fVar.mo83699a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74236a(com.google.android.apps.gsa.shared.logger.p7051b.C89857g r9) {
        /*
            r8 = this;
            com.google.common.base.cz r0 = r8.f218807h
            long r0 = r0.mo26884a()
            java.lang.Object r2 = r8.f218801b
            monitor-enter(r2)
            boolean r3 = r8.f218803d     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x003a
            long r3 = r9.f246210e     // Catch:{ all -> 0x0048 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0023
            com.google.android.apps.gsa.shared.logger.b.f r3 = new com.google.android.apps.gsa.shared.logger.b.f     // Catch:{ all -> 0x0048 }
            r3.<init>()     // Catch:{ all -> 0x0048 }
            r3.mo83700b(r9)     // Catch:{ all -> 0x0048 }
            r3.f246204d = r0     // Catch:{ all -> 0x0048 }
            com.google.android.apps.gsa.shared.logger.b.g r9 = r3.mo83699a()     // Catch:{ all -> 0x0048 }
        L_0x0023:
            java.util.ArrayList r0 = r8.f218802c     // Catch:{ all -> 0x0048 }
            r0.add(r9)     // Catch:{ all -> 0x0048 }
            java.util.ArrayList r9 = r8.f218802c     // Catch:{ all -> 0x0048 }
            int r9 = r9.size()     // Catch:{ all -> 0x0048 }
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r9 <= r0) goto L_0x0038
            java.util.ArrayList r9 = r8.f218802c     // Catch:{ all -> 0x0048 }
            r0 = 0
            r9.remove(r0)     // Catch:{ all -> 0x0048 }
        L_0x0038:
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            return
        L_0x003a:
            j$.util.Optional r3 = r8.f218804e     // Catch:{ all -> 0x0048 }
            r4 = 0
            java.lang.Object r3 = r3.orElse(r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            r8.mo74249o(r9, r0, r3)
            return
        L_0x0048:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79808dd.mo74236a(com.google.android.apps.gsa.shared.logger.b.g):void");
    }

    /* renamed from: c */
    public final void mo74237c(C89849ae aeVar, C83320io ioVar) {
        mo74236a(m127922q(aeVar, ioVar, true, false, 0, (C59582aj) C59687cb.f160034bf.createBuilder()));
    }

    /* renamed from: d */
    public final void mo74238d(C89849ae aeVar, C83320io ioVar, long j) {
        mo74236a(m127922q(aeVar, ioVar, true, false, j, (C59582aj) C59687cb.f160034bf.createBuilder()));
    }

    /* renamed from: e */
    public final void mo74239e(C89849ae aeVar, C83320io ioVar, C59582aj ajVar) {
        mo74236a(m127922q(aeVar, ioVar, true, false, 0, ajVar));
    }

    /* renamed from: f */
    public final void mo74240f(C89849ae aeVar, C83320io ioVar) {
        mo74241g(aeVar, ioVar, (C59582aj) C59687cb.f160034bf.createBuilder());
    }

    /* renamed from: g */
    public final void mo74241g(C89849ae aeVar, C83320io ioVar, C59582aj ajVar) {
        C48420g b = this.f218810k.mo75573b();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        b.getClass();
        cbVar.f160060Y = b;
        cbVar.f160115b |= 8388608;
        mo74239e(aeVar, ioVar, ajVar);
    }

    /* renamed from: h */
    public final void mo74242h(C89849ae aeVar, C83320io ioVar) {
        mo74236a(m127922q(aeVar, ioVar, true, true, 0, (C59582aj) C59687cb.f160034bf.createBuilder()));
    }

    /* renamed from: i */
    public final void mo74243i(C89849ae aeVar, C83320io ioVar) {
        mo74236a(m127922q(aeVar, ioVar, false, false, 0, (C59582aj) C59687cb.f160034bf.createBuilder()));
    }

    /* renamed from: j */
    public final void mo74244j(C89849ae aeVar, C83320io ioVar, long j) {
        mo74236a(m127922q(aeVar, ioVar, false, false, j, (C59582aj) C59687cb.f160034bf.createBuilder()));
    }

    /* renamed from: k */
    public final void mo74245k(C89849ae aeVar, C83320io ioVar, C59582aj ajVar) {
        mo74236a(m127922q(aeVar, ioVar, false, false, 0, ajVar));
    }

    /* renamed from: l */
    public final void mo74246l(C89849ae aeVar, C83320io ioVar, C59582aj ajVar, long j) {
        mo74236a(m127922q(aeVar, ioVar, false, false, j, ajVar));
    }

    /* renamed from: m */
    public final void mo74247m(C89849ae aeVar) {
        mo74248n(aeVar, 0);
    }

    /* renamed from: n */
    public final void mo74248n(C89849ae aeVar, int i) {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C48420g b = this.f218810k.mo75573b();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        b.getClass();
        cbVar.f160060Y = b;
        cbVar.f160115b |= 8388608;
        if (i != 0) {
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            cbVar2.f160037B = i - 1;
            cbVar2.f160062a |= LinearLayoutManager.INVALID_OFFSET;
        }
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = (C59687cb) ajVar.build();
        mo74236a(fVar.mo83699a());
    }

    /* renamed from: o */
    public final void mo74249o(C89857g gVar, long j, String str) {
        ((C89862l) this.f218805f.mo27525b()).mo83705b((C89852b) this.f218806g.mo27525b());
        C22804a b = C22804a.m42624b(gVar, j, gVar.f246208c, str, gVar.f246209d);
        ((C89862l) this.f218805f.mo27525b()).mo83706c(b);
        b bVar = this.f218809j;
        C82983hr hrVar = (C82983hr) bVar.a.get(b.f62786a);
        if (hrVar != null) {
            C82980ho hoVar = (C82980ho) C82981hp.f226382f.createBuilder();
            hoVar.copyOnWrite();
            C82981hp hpVar = (C82981hp) hoVar.instance;
            hpVar.f226385b = hrVar.f226438V;
            hpVar.f226384a |= 1;
            long j2 = b.f62787b;
            hoVar.copyOnWrite();
            C82981hp hpVar2 = (C82981hp) hoVar.instance;
            hpVar2.f226384a |= 8;
            hpVar2.f226388e = j2;
            C58495hd hdVar = b.f62789d;
            bVar.a(hoVar, (String) hdVar.get("RecognitionUtteranceId"), (String) hdVar.get("RecognitionCandidateId"));
        }
    }
}
