package com.google.android.apps.search.googleapp.p10381r;

import androidx.preference.SwitchPreference;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.r.f */
/* compiled from: PG */
class C137147f implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C137148g f373188a;

    public C137147f(C137148g gVar) {
        this.f373188a = gVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C137148g.f373189a.mo56225c()).mo56382g(th)).mo56372aa(40712)).mo56386p("Failed to load Biometrics settings.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        SwitchPreference switchPreference = (SwitchPreference) this.f373188a.f373190b.mo8411gg("biometrics_preference");
        switchPreference.getClass();
        switchPreference.mo8391j(((Boolean) obj).booleanValue());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
