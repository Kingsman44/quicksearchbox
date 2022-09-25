package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import java.util.UUID;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.l */
/* compiled from: PG */
public final class C134223l {

    /* renamed from: a */
    public final C37215b f365684a;

    public C134223l(C37215b bVar) {
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f365684a = bVar;
    }

    /* renamed from: a */
    public final void mo111655a(UUID uuid, C134219h hVar) {
        C69664n.m101061g(uuid, "id");
        C69664n.m101061g(hVar, "result");
        C37215b bVar = this.f365684a;
        C37258g gVar = C37182a.f97796ab;
        C69664n.m101060f(gVar, "DISCOVER_CACHE_READ_END");
        int i = hVar.f365620k;
        String str = (String) C134222k.f365683a.get(C134219h.class);
        if (str != null) {
            C37252a a = gVar.mo40810a(i, str);
            ((C37253b) a).mo40795s("DCR", uuid.toString());
            bVar.mo19974a(a);
            return;
        }
        throw new IllegalArgumentException("Unsupported error space");
    }
}
