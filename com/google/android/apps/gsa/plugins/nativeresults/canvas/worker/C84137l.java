package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.l */
/* compiled from: PG */
final class C84137l extends C90883aq {

    /* renamed from: a */
    private final C84147v f229088a;

    public C84137l(C84147v vVar) {
        super("OnFetchCompleteCallback", 1, 4);
        this.f229088a = vVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C84138m.f229089a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CrossProcessFetcher");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7059)).mo56386p("Fetch failed");
        C84138m.m134091e(this.f229088a, C84138m.m134089a());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ParcelableFetcherResponse parcelableFetcherResponse;
        C89057m mVar = (C89057m) obj;
        C84147v vVar = this.f229088a;
        C59071e eVar = C84138m.f229089a;
        try {
            parcelableFetcherResponse = new ParcelableFetcherResponse();
            parcelableFetcherResponse.f57758b = mVar.mo83034a().mo83032c().array();
            parcelableFetcherResponse.f57759c = parcelableFetcherResponse.f57758b != null;
            parcelableFetcherResponse.f57757a = C84138m.m134090d(mVar);
            parcelableFetcherResponse.f57760d = mVar.mo82999g().f241279a;
            C89022at g = mVar.mo82999g();
            boolean d = g.mo83002d();
            String str = BuildConfig.FLAVOR;
            if (d) {
                str = g.mo83000a("Location", str);
            }
            parcelableFetcherResponse.f57762f = str;
        } catch (IOException e) {
            C59104x c = C84138m.f229089a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CrossProcessFetcher");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7060)).mo56386p("Fetch failed");
            parcelableFetcherResponse = C84138m.m134089a();
        }
        C84138m.m134091e(vVar, parcelableFetcherResponse);
    }
}
