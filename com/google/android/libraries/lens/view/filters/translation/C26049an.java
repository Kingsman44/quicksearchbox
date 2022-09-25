package com.google.android.libraries.lens.view.filters.translation;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.an */
/* compiled from: PG */
final class C26049an implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Locale f70771a;

    /* renamed from: b */
    final /* synthetic */ C26059ax f70772b;

    public C26049an(C26059ax axVar, Locale locale) {
        this.f70772b = axVar;
        this.f70771a = locale;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C26059ax.f70786c.mo56225c()).mo56382g(th)).mo56372aa(49375)).mo56389s("Unable to retrieve download information for language pack: %s", this.f70771a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C26127j jVar = (C26127j) obj;
        if (jVar.mo31233a() >= jVar.mo31234b().mo33431a()) {
            this.f70772b.f70832v.mo5706i(jVar);
        } else {
            this.f70772b.f70835y.mo5706i(jVar);
        }
    }
}
