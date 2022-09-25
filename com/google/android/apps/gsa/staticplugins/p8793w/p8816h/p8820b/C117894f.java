package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6491a.C84357c;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87760co;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.b.f */
/* compiled from: PG */
public final class C117894f extends C84357c {

    /* renamed from: b */
    private final C86683e f327231b;

    /* renamed from: c */
    private final C89859i f327232c;

    public C117894f(C89859i iVar, C86683e eVar) {
        this.f327232c = iVar;
        this.f327231b = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77896a(C89857g gVar) {
        this.f327232c.mo74236a(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77898c(C87768cw cwVar, C58833ax axVar) {
        C87684al alVar = new C87684al(C88244um.CONVERSATION_SURFACE_EVENT);
        alVar.mo81965b(C87760co.f237522a, cwVar);
        if (axVar.mo56113h()) {
            alVar.mo81966c((Parcelable) axVar.mo56107c());
        }
        C87682aj ajVar = this.f327231b.f234157a;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(alVar.mo81964a());
        }
    }
}
