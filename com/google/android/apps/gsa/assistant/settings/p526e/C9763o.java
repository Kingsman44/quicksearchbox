package com.google.android.apps.gsa.assistant.settings.p526e;

import com.google.android.apps.gsa.assistant.settings.features.at.c;
import com.google.android.apps.gsa.assistant.settings.features.p5698at.C72856b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.o */
/* compiled from: PG */
public final class C9763o {

    /* renamed from: a */
    private final C9766r f33711a;

    public C9763o(C9766r rVar) {
        this.f33711a = rVar;
    }

    /* renamed from: a */
    public final C72856b mo18024a(C9753e eVar) {
        c d = C72856b.m107584d();
        C9770v vVar = new C9770v();
        C68324h.m98669f(vVar);
        C47243l.m84039a(vVar, eVar);
        c cVar = d;
        cVar.b = Optional.m71637of(vVar);
        C89849ae a = C89849ae.m146281a(this.f33711a.mo18025a(eVar.f33667b).f33716c);
        if (a == null) {
            a = C89849ae.UNKNOWN_EVENT;
        }
        d.c(a);
        cVar.d = 2;
        d.b(Boolean.valueOf(eVar.f33668c));
        return d.a();
    }
}
