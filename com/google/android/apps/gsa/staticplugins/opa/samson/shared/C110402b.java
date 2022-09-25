package com.google.android.apps.gsa.staticplugins.opa.samson.shared;

import android.os.Build;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90023cb;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92599f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.b */
/* compiled from: PG */
public final class C110402b {

    /* renamed from: a */
    private final C86124t f307690a;

    /* renamed from: b */
    private final C92599f f307691b;

    /* renamed from: c */
    private final C89994f f307692c;

    public C110402b(C86124t tVar, C92599f fVar, C89994f fVar2) {
        this.f307690a = tVar;
        this.f307691b = fVar;
        this.f307692c = fVar2;
    }

    /* renamed from: a */
    public final boolean mo98629a() {
        boolean z = !this.f307690a.mo79746e(C90014bt.f247104ap) || ((this.f307691b.mo87380c() || this.f307691b.mo87378a() || this.f307691b.mo87379b()) && this.f307692c.mo83823l());
        C58976aa aaVar = C58975e.f156826a;
        this.f307690a.mo79746e(C90014bt.f247104ap);
        this.f307691b.mo87380c();
        this.f307691b.mo87378a();
        this.f307691b.mo87379b();
        this.f307692c.mo83823l();
        return z && (Build.VERSION.SDK_INT <= 30 || this.f307690a.mo79746e(C90023cb.f248128d)) && this.f307690a.mo79746e(C90014bt.f247110av) && this.f307690a.mo79758x(C90014bt.f247067aE).startsWith("1xcxjjiojio1jd90jfkdn2511z9x1g30_!_");
    }
}
