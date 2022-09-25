package com.google.android.libraries.search.video.players;

import com.google.android.libraries.search.video.thirdparty.C41607i;
import com.google.android.libraries.search.video.thirdparty.C41613o;
import com.google.android.libraries.search.video.thirdparty.C41617s;
import com.google.common.base.C58837ba;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.video.players.k */
/* compiled from: PG */
final class C41580k implements C41585p {

    /* renamed from: a */
    final /* synthetic */ C41581l f108697a;

    public C41580k(C41581l lVar) {
        this.f108697a = lVar;
    }

    /* renamed from: a */
    public final C41592w mo44127a() {
        return this.f108697a;
    }

    /* renamed from: b */
    public final void mo44128b(C41607i iVar, C41617s sVar, C41613o oVar) {
        if (this.f108697a.f108700c.isPresent()) {
            oVar.mo44180a((Duration) this.f108697a.f108700c.get());
        }
        if (!C58837ba.m90859h(this.f108697a.f108699b)) {
            sVar.mo44185e(this.f108697a.f108699b);
        }
    }
}
