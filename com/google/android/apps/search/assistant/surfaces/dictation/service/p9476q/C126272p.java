package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125130dd;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125131de;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125132df;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125133dg;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125176y;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125177z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126344u;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Collection;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.p */
/* compiled from: PG */
final class C126272p implements C126267k {

    /* renamed from: a */
    final /* synthetic */ C126276t f347927a;

    public C126272p(C126276t tVar) {
        this.f347927a = tVar;
    }

    /* renamed from: a */
    public final void mo107495a(int i) {
        if (!this.f347927a.f347936h.get()) {
            this.f347927a.f347933e.mo107399A();
            C70862aj ajVar = this.f347927a.f347932d;
            C125132df dfVar = (C125132df) C125133dg.f345203c.createBuilder();
            C125176y yVar = (C125176y) C125177z.f345322b.createBuilder();
            yVar.copyOnWrite();
            ((C125177z) yVar.instance).f345324a = i;
            dfVar.copyOnWrite();
            C125133dg dgVar = (C125133dg) dfVar.instance;
            C125177z zVar = (C125177z) yVar.build();
            zVar.getClass();
            dgVar.f345206b = zVar;
            dgVar.f345205a = 3;
            ajVar.mo20123c((C125133dg) dfVar.build());
        }
    }

    /* renamed from: b */
    public final void mo107496b(Throwable th) {
        if (!this.f347927a.f347936h.get()) {
            ((C59052c) ((C59052c) ((C59052c) C126276t.f347929a.mo56225c()).mo56382g(th)).mo56372aa(36892)).mo56389s("ASR failed for %s, stopping Oration [SD]", this.f347927a.f347939k);
            C2164c cVar = (C2164c) this.f347927a.f347937i.get();
            cVar.getClass();
            cVar.mo5439d(new C126274r(this.f347927a, th));
            this.f347927a.f347931c.mo107461d(C126207au.ASR_ERROR, (Throwable) null);
            return;
        }
        ((C59052c) ((C59052c) C126276t.f347929a.mo56224b()).mo56372aa(36893)).mo56389s("%s stopped ignoring onError [SD]", this.f347927a.f347939k);
    }

    /* renamed from: c */
    public final void mo107497c(C125065at atVar) {
        if (this.f347927a.f347936h.get()) {
            ((C59052c) ((C59052c) C126276t.f347929a.mo56224b()).mo56372aa(36894)).mo56389s("%s stopped ignoring onRecognitionResult [SD]", this.f347927a.f347939k);
            return;
        }
        this.f347927a.f347933e.mo107400B();
        C126208av avVar = this.f347927a.f347931c;
        avVar.mo107459b("Handling transcription", new C126191ae(avVar, atVar));
        if (!Collection.EL.stream(atVar.f345042a).allMatch(C126344u.f348033a)) {
            this.f347927a.f347940l.f347735a.f345896a.mo106940c();
        }
    }

    /* renamed from: d */
    public final void mo107498d() {
        ((C59052c) ((C59052c) C126276t.f347929a.mo56225c()).mo56372aa(36895)).mo56389s("ASR timed out while starting for %s, stopping Oration [SD]", this.f347927a.f347939k);
        C2164c cVar = (C2164c) this.f347927a.f347937i.get();
        cVar.getClass();
        cVar.mo5439d(new C126275s(this.f347927a));
        this.f347927a.f347931c.mo107461d(C126207au.ASR_START_TIMEOUT, (Throwable) null);
    }

    /* renamed from: e */
    public final void mo107499e() {
        C2164c cVar = (C2164c) this.f347927a.f347937i.get();
        cVar.getClass();
        cVar.mo5437b((Object) null);
    }

    /* renamed from: f */
    public final void mo107500f() {
        if (this.f347927a.f347936h.get()) {
            ((C59052c) ((C59052c) C126276t.f347929a.mo56224b()).mo56372aa(36896)).mo56389s("%s stopped ignoring onSpeechStart [SD]", this.f347927a.f347939k);
            return;
        }
        C126208av avVar = this.f347927a.f347931c;
        C125130dd ddVar = (C125130dd) C125131de.f345199c.createBuilder();
        long c = this.f347927a.f347935g.mo26871c();
        ddVar.copyOnWrite();
        C125131de deVar = (C125131de) ddVar.instance;
        deVar.f345201a = 1;
        deVar.f345202b = Long.valueOf(c);
        avVar.mo107460c((C125131de) ddVar.build());
    }
}
