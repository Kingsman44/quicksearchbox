package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1064c;

import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.e */
/* compiled from: PG */
final class C14033e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C14034f f42649a;

    public C14033e(C14034f fVar) {
        this.f42649a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C14035g.f42652a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NewsBrowserCntPrvdr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(45300)).mo56386p("Failed to get news content from AS.");
        this.f42649a.f42650a.mo5863c((Object) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C14034f fVar = this.f42649a;
        fVar.f42650a.mo5863c(fVar.f42651b.mo21390b((C52176ia) obj));
    }
}
