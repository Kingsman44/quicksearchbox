package com.google.android.apps.search.soundsearch.p10652a;

import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.soundsearch.a.d */
/* compiled from: PG */
final class C141632d implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141633e.f384444a.mo56225c()).mo56382g(th)).mo56372aa(41764)).mo56386p("Microphone didn't close!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C59052c cVar = (C59052c) ((C59052c) C141633e.f384444a.mo56224b()).mo56372aa(41765);
        C37514du duVar = ((C37418bw) obj).f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        cVar.mo56389s("Mic closing result: %s", duVar);
    }
}
