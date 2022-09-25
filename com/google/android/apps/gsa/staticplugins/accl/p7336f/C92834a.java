package com.google.android.apps.gsa.staticplugins.accl.p7336f;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6491a.C84357c;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87760co;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.f.a */
/* compiled from: PG */
public final class C92834a extends C84357c {

    /* renamed from: b */
    private final C86610af f259026b;

    /* renamed from: c */
    private final C89859i f259027c;

    public C92834a(C86610af afVar, C89859i iVar) {
        this.f259026b = afVar;
        this.f259027c = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77896a(C89857g gVar) {
        this.f259027c.mo74236a(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77898c(C87768cw cwVar, C58833ax axVar) {
        C87684al alVar = new C87684al(C88244um.CONVERSATION_SURFACE_EVENT);
        alVar.mo81965b(C87760co.f237522a, cwVar);
        if (axVar.mo56113h()) {
            alVar.mo81966c((Parcelable) axVar.mo56107c());
        }
        this.f259026b.mo80228i(alVar.mo81964a());
    }
}
