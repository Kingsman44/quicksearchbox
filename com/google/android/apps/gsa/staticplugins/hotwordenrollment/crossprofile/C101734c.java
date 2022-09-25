package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.c */
/* compiled from: PG */
final class C101734c implements C92515a {

    /* renamed from: a */
    final /* synthetic */ boolean f283833a;

    /* renamed from: b */
    final /* synthetic */ EventForDump f283834b;

    /* renamed from: c */
    final /* synthetic */ C101735d f283835c;

    public C101734c(C101735d dVar, boolean z, EventForDump eventForDump) {
        this.f283835c = dVar;
        this.f283833a = z;
        this.f283834b = eventForDump;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        C92518d dVar;
        if (z && (dVar = this.f283835c.f283837b) != null && dVar.mo87279g() && this.f283835c.f283837b.mo87282j()) {
            this.f283835c.f283837b.mo87284l(this.f283833a, (C92516b) null, this.f283834b);
        }
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
