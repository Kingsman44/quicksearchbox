package com.google.android.libraries.lens.view.p2059ah.p2060a.p2062b;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.ah.a.b.f */
/* compiled from: PG */
final class C25126f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Locale f68425a;

    public C25126f(Locale locale) {
        this.f68425a = locale;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C25128h.f68427a.mo56225c()).mo56382g(th)).mo56372aa(49804)).mo56389s("Download failed for Language Model %s", th.getMessage());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        for (C24440ab abVar : (List) obj) {
            if (abVar != null) {
                C58974d dVar = C25128h.f68427a;
            } else {
                ((C58970a) ((C58970a) C25128h.f68427a.mo56225c()).mo56372aa(49805)).mo56389s("Download for Language Model failed for lang:%s. Model may be misconfigured.", this.f68425a);
            }
        }
    }
}
