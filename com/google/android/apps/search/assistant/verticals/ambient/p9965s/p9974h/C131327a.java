package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9974h;

import com.google.assistant.p3886c.C50818do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.h.a */
/* compiled from: PG */
public final /* synthetic */ class C131327a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131334h f359031a;

    public /* synthetic */ C131327a(C131334h hVar) {
        this.f359031a = hVar;
    }

    public final C60870cx apply(Object obj) {
        C131334h hVar = this.f359031a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return hVar.f359042d.mo110131e((C50818do) optional.get());
        }
        return C60856cj.m92900i(optional);
    }
}
