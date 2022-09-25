package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.at.c;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.s */
/* compiled from: PG */
public final class C9851s {
    /* renamed from: a */
    public static C72856b m24614a(Bundle bundle) {
        String string = bundle.getString("extra_assistant_settings_entry_source", BuildConfig.FLAVOR);
        c d = C72856b.m107584d();
        C9833d dVar = new C9833d();
        C68324h.m98669f(dVar);
        C47243l.m84040b(dVar, string);
        d.b = Optional.m71637of(dVar);
        d.h(1);
        return d.a();
    }

    /* renamed from: b */
    public static C72856b m24615b(C86124t tVar) {
        c d = C72856b.m107584d();
        C9841j jVar = new C9841j();
        C68324h.m98669f(jVar);
        d.b = Optional.m71637of(jVar);
        d.b(Boolean.valueOf(tVar.mo79746e(C90059dk.f249056aS)));
        return d.a();
    }
}
