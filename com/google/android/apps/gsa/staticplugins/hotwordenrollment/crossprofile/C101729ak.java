package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.ak */
/* compiled from: PG */
public final class C101729ak implements C101718a {

    /* renamed from: a */
    private final C101721ac f283826a;

    public C101729ak(C101721ac acVar) {
        this.f283826a = acVar;
    }

    /* renamed from: a */
    public final C60870cx mo92524a(boolean z, EventForDump eventForDump) {
        C101746n nVar;
        C101721ac acVar = this.f283826a;
        if (acVar.f283819a.mo117178i().mo117185a().mo117171a()) {
            nVar = acVar.mo92527a();
        } else {
            nVar = new C101745m(acVar.f283819a);
        }
        return nVar.mo92534a(z, eventForDump);
    }

    /* renamed from: b */
    public final void mo92525b() {
        this.f283826a.mo92527a().f283839a.mo92525b();
    }

    /* renamed from: c */
    public final void mo92526c() {
        this.f283826a.mo92527a().f283839a.mo92526c();
    }
}
