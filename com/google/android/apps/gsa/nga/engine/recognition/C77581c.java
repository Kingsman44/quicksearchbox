package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.speech.p5218j.C67026ih;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c */
/* compiled from: PG */
public final class C77581c {

    /* renamed from: a */
    private final C58247c f213727a;

    public C77581c() {
        C58254i iVar = new C58254i();
        iVar.mo54821e(1, TimeUnit.MINUTES);
        this.f213727a = iVar.mo54817a();
    }

    /* renamed from: a */
    public final Optional mo72721a(ac acVar) {
        return Optional.ofNullable((C77623f) ((C58206am) this.f213727a).f155647a.mo54792f(acVar));
    }

    /* renamed from: b */
    public final void mo72722b(ac acVar, C67026ih ihVar, long j) {
        C58247c cVar = this.f213727a;
        ((C58206am) cVar).f155647a.put(acVar, C77623f.m124587e(acVar, ihVar.f182191b, ihVar.f182192c, j));
    }
}
