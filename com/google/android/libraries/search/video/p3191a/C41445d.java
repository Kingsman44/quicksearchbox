package com.google.android.libraries.search.video.p3191a;

import com.google.android.libraries.search.video.p3194d.C41492c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.video.a.d */
/* compiled from: PG */
final class C41445d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C41446e f108249a;

    public C41445d(C41446e eVar) {
        this.f108249a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C41446e.f108250a.mo56226d()).mo56382g(th)).mo56372aa(53889)).mo56386p("ResumableTimer failed.");
        this.f108249a.f108252c = null;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this) {
            this.f108249a.f108251b.mo56160e();
        }
        C41492c cVar = this.f108249a.f108253d;
        cVar.f108393c.mo44013b(cVar.f108391a, cVar.f108392b);
        this.f108249a.f108252c = null;
    }
}
