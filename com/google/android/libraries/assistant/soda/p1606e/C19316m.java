package com.google.android.libraries.assistant.soda.p1606e;

import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.search.p3055n.p3081g.p3084b.C39760d;
import com.google.android.libraries.search.p3055n.p3081g.p3084b.C39762f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.soda.e.m */
/* compiled from: PG */
final class C19316m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58833ax f54047a;

    /* renamed from: b */
    final /* synthetic */ C19317n f54048b;

    public C19316m(C19317n nVar, C58833ax axVar) {
        this.f54048b = nVar;
        this.f54047a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C39760d dVar = (C39760d) this.f54048b.f54056h.mo56107c();
        ((C58970a) ((C58970a) C39762f.f104591a.mo56226d()).mo56372aa(53853)).mo56386p("SodaResourceManager HotwordDownloadListener.onDownloadFailed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (this.f54047a.mo56113h()) {
            C29690f fVar = (C29690f) this.f54047a.mo56107c();
            C29690f fVar2 = (C29690f) axVar.mo56107c();
            if (fVar.f80416g.size() > 0 && fVar2.f80416g.size() > 0 && ((C28595b) fVar2.f80416g.get(0)).f77799c.equals(((C28595b) fVar.f80416g.get(0)).f77799c)) {
                return;
            }
        }
        C39760d dVar = (C39760d) this.f54048b.f54056h.mo56107c();
        ((C58970a) ((C58970a) C39762f.f104591a.mo56224b()).mo56372aa(53854)).mo56386p("SodaResourceManager HotwordDownloadListener.onDownloadSuccess");
    }
}
