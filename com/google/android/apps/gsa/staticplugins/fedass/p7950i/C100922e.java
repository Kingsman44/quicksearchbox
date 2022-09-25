package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5228m.C67329cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.e */
/* compiled from: PG */
public final /* synthetic */ class C100922e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C100923f f281960a;

    /* renamed from: b */
    public final /* synthetic */ C67329cf f281961b;

    public /* synthetic */ C100922e(C100923f fVar, C67329cf cfVar) {
        this.f281960a = fVar;
        this.f281961b = cfVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C100923f fVar = this.f281960a;
        C67329cf cfVar = this.f281961b;
        C58833ax axVar = (C58833ax) fVar.f281962a.mo27525b();
        if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("Training cache not loaded"));
        }
        return C100742h.m166944c(((C100719ab) fVar.f281963b.mo27525b()).mo92020d()).mo92035e(new C100921d(fVar, (C84235h) axVar.mo56107c(), cfVar)).f281631a;
    }
}
