package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6491a.C84357c;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87760co;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.f */
/* compiled from: PG */
public final class C107780f extends C84357c {

    /* renamed from: b */
    private final C68214a f299909b;

    /* renamed from: c */
    private final C89859i f299910c;

    public C107780f(C68214a aVar, C89859i iVar) {
        this.f299909b = aVar;
        this.f299910c = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77896a(C89857g gVar) {
        this.f299910c.mo74236a(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77898c(C87768cw cwVar, C58833ax axVar) {
        C87684al alVar = new C87684al(C88244um.CONVERSATION_SURFACE_EVENT);
        alVar.mo81965b(C87760co.f237522a, cwVar);
        if (axVar.mo56113h()) {
            alVar.mo81966c((Parcelable) axVar.mo56107c());
        }
        ((C107932g) this.f299909b.mo27525b()).mo96337a(alVar.mo81964a());
    }
}
