package com.google.android.apps.gsa.staticplugins.p7564bt;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6584be.C84824a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;

/* renamed from: com.google.android.apps.gsa.staticplugins.bt.a */
/* compiled from: PG */
public final class C96752a extends C86734a implements C84824a {

    /* renamed from: a */
    private final C86610af f270636a;

    public C96752a(C86610af afVar) {
        super(C118575h.WORKER_LOGO_HEADER, "logo_header");
        this.f270636a = afVar;
    }

    /* renamed from: a */
    public final void mo78513a(ServiceEventData serviceEventData) {
        C86775r rVar = this.f270636a.f233977l;
        if (rVar != null) {
            rVar.f234383e.mo80379b(serviceEventData);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
