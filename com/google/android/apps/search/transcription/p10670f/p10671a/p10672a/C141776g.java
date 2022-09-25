package com.google.android.apps.search.transcription.p10670f.p10671a.p10672a;

import android.net.Uri;
import com.google.android.libraries.search.p2904c.p2951n.C37899a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.transcription.f.a.a.g */
/* compiled from: PG */
final class C141776g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C141780k f384744a;

    public C141776g(C141780k kVar) {
        this.f384744a = kVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141780k.f384746a.mo56226d()).mo56382g(th)).mo56372aa(41916)).mo56386p("Could not get Audio Recording URI");
        if (!(th instanceof C37899a)) {
            this.f384744a.f384749d.mo116740j(Uri.EMPTY);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f384744a.f384749d.mo116740j((Uri) obj);
    }
}
