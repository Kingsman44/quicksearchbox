package com.google.android.libraries.search.assistant.p2497ab;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.ab.bu */
/* compiled from: PG */
final class C32406bu implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C32407bv.f86857a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TopContactUploaderImpl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(52635)).mo56386p("Failed to sync ASSISTANT_CONTACT_AFFINITY corpus.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        boolean z = false;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (((C65753ak) entry.getKey()).equals(C65753ak.ASSISTANT_CONTACT_AFFINITY)) {
                if (((C21850cf) entry.getValue()).mo27152b().isEmpty()) {
                    z = true;
                } else {
                    C59104x d = C32407bv.f86857a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "TopContactUploaderImpl");
                    ((C59052c) ((C59052c) d).mo56372aa(52637)).mo56389s("Failed to sync ASSISTANT_CONTACT_AFFINITY corpus: %s", Collection.EL.stream(((C21850cf) entry.getValue()).mo27152b()).map(C32405bt.f86856a).collect(Collectors.joining("\n")));
                }
            }
        }
        if (!z) {
            C59104x d2 = C32407bv.f86857a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "TopContactUploaderImpl");
            ((C59052c) ((C59052c) d2).mo56372aa(52636)).mo56386p("Could not find corpus to sync");
        }
    }
}
