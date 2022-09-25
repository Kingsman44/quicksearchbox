package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.d */
/* compiled from: PG */
public final class C101735d implements C101718a {

    /* renamed from: a */
    public static final C59071e f283836a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.d");

    /* renamed from: b */
    public final C92518d f283837b;

    public C101735d(C92518d dVar) {
        this.f283837b = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo92524a(boolean z, EventForDump eventForDump) {
        if (this.f283837b != null) {
            mo92530d(z, eventForDump);
        } else {
            C59104x d = f283836a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AlwaysOnAController");
            ((C59052c) ((C59052c) d).mo56372aa(20251)).mo56389s("Always on hotword adapter will not be updated to %b adapter is null", Boolean.valueOf(z));
        }
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final void mo92525b() {
        C92518d dVar = this.f283837b;
        if (dVar != null) {
            dVar.mo87274b();
        }
    }

    /* renamed from: c */
    public final void mo92526c() {
        C58976aa aaVar = C58975e.f156826a;
        C92518d dVar = this.f283837b;
        if (dVar != null) {
            dVar.mo87273a(new C101733b(this));
            return;
        }
        C59104x d = f283836a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AlwaysOnAController");
        ((C59052c) ((C59052c) d).mo56372aa(20253)).mo56386p("AlwaysOnAdapter is null. Skipping initialize.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo92530d(boolean z, EventForDump eventForDump) {
        if (this.f283837b != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f283837b.mo87273a(new C101734c(this, z, eventForDump));
        }
    }
}
