package com.google.android.apps.search.googleapp.stampviewer.webview.p10504e;

import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c;
import com.google.apps.tiktok.dataservice.local.C46855i;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.e.q */
/* compiled from: PG */
public final class C139566q {

    /* renamed from: a */
    public final C28306ab f379427a;

    /* renamed from: b */
    public final C46855i f379428b;

    /* renamed from: c */
    public final C43513c f379429c;

    /* renamed from: d */
    public final C139554e f379430d;

    /* renamed from: e */
    private final C139563n f379431e;

    public C139566q(C139563n nVar, C28306ab abVar, C46855i iVar, C43513c cVar, C139554e eVar) {
        this.f379431e = nVar;
        this.f379427a = abVar;
        this.f379428b = iVar;
        this.f379429c = cVar;
        this.f379430d = eVar;
    }

    /* renamed from: a */
    public final void mo115063a(boolean z, C139551b bVar) {
        if (z || bVar.f379399b || bVar.f379400c) {
            this.f379431e.requireView().setVisibility(8);
        } else {
            this.f379431e.requireView().setVisibility(0);
        }
    }
}
