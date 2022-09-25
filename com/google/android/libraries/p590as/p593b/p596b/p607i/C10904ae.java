package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.as.b.b.i.ae */
/* compiled from: PG */
final class C10904ae implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C10905af.f35995a.mo56225c()).mo56382g(th)).mo56372aa(54029)).mo56386p("Failed to remove LanguagePack file groups");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            if (Collection.EL.stream(list).allMatch(C10902ac.f35993a)) {
                ((C58970a) ((C58970a) C10905af.f35995a.mo56224b()).mo56372aa(54031)).mo56387q("Successfully removed %d LanguagePack file groups", list.size());
            } else {
                ((C58970a) ((C58970a) C10905af.f35995a.mo56225c()).mo56372aa(54030)).mo56388r("Failed to completely remove LanguagePack file groups. %d remain.", Collection.EL.stream(list).filter(C10903ad.f35994a).count());
            }
        }
    }
}
