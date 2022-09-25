package com.google.android.apps.gsa.staticplugins.p8793w.p8802c;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8793w.p8827i.C118083b;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11900p;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.q */
/* compiled from: PG */
final class C117840q implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Query f327031a;

    /* renamed from: b */
    final /* synthetic */ C117845v f327032b;

    public C117840q(C117845v vVar, Query query) {
        this.f327032b = vVar;
        this.f327031a = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f327032b.f327037a.mo56226d()).mo56382g(th)).mo56372aa(18614)).mo56386p("Offline text component fetch failed.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C118083b bVar = (C118083b) obj;
        if (bVar.mo103507a().mo56113h()) {
            ((C11897m) ((C58847bk) this.f327032b.f327042f).f156646a).mo20289j(this.f327031a, (C11900p) bVar.mo103507a().mo56107c());
        }
    }
}
