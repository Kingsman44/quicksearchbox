package com.google.android.apps.gsa.speech.p7279h;

import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;

/* renamed from: com.google.android.apps.gsa.speech.h.a */
/* compiled from: PG */
final class C92300a implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C92301b f257389a;

    public C92300a(C92301b bVar) {
        this.f257389a = bVar;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (z) {
            C92301b bVar = this.f257389a;
            C89994f fVar = bVar.f257391b;
            C92518d dVar = bVar.f257390a;
            dVar.getClass();
            fVar.mo83812a(dVar.mo87278f());
            this.f257389a.f257390a.mo87284l(false, (C92516b) null, EventForDump.m147676e(2, "#unenrollAndDeleteVoiceModel"));
            if (this.f257389a.f257390a.mo87281i()) {
                this.f257389a.mo86968c();
            }
            this.f257389a.f257390a.mo87274b();
        }
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
