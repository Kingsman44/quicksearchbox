package com.google.android.apps.search.googleapp.stampviewer.webview;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139354j;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139550a;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139551b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139554e;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.t */
/* compiled from: PG */
final class C139662t implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139638n f379643a;

    public C139662t(C139638n nVar) {
        this.f379643a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139354j jVar = (C139354j) bVar;
        C139638n nVar = this.f379643a;
        nVar.mo115125h("load failed", C89885b.STAMP_VIEWER_INVALID_STAMP);
        if (nVar.f379594r) {
            nVar.mo115119b(false);
        }
        C139554e eVar = nVar.f379584h;
        C44080d dVar = eVar.f379406b;
        C139550a aVar = (C139550a) ((C139551b) dVar.mo47045a()).toBuilder();
        aVar.copyOnWrite();
        C139551b bVar2 = (C139551b) aVar.instance;
        bVar2.f379398a |= 2;
        bVar2.f379400c = true;
        dVar.mo47046b((C139551b) aVar.build());
        eVar.mo115055c();
        return C47392e.f123115a;
    }
}
