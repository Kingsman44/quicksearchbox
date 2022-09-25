package com.google.android.libraries.search.silk.p3162a.p3172j;

import com.google.android.libraries.silk.p3205a.p3225n.C41728a;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.cache.C46401p;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4309n.C56743b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4309n.C56745d;
import com.google.protobuf.C62912at;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.silk.a.j.b */
/* compiled from: PG */
public final class C40605b implements C41728a {

    /* renamed from: a */
    private final C46401p f106567a;

    /* renamed from: b */
    private final C46401p f106568b;

    /* renamed from: c */
    private final Optional f106569c;

    public C40605b(C44077a aVar, C44077a aVar2, Optional optional) {
        this.f106567a = aVar.f114747a.mo50325a("event_id_store", C56743b.f151439c);
        this.f106568b = aVar2.f114747a.mo50325a("search_refinement_suggestions_store", C56745d.f151443b);
        this.f106569c = optional;
    }

    /* renamed from: a */
    public final C60870cx mo42545a() {
        return C60856cj.m92899h(new UnsupportedOperationException("Not Implemented!"));
    }

    /* renamed from: b */
    public final C60870cx mo42546b(C56743b bVar) {
        this.f106567a.mo50381d(C62912at.f169862a, bVar);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo42547c(C56745d dVar) {
        this.f106568b.mo50381d(C62912at.f169862a, dVar);
        if (this.f106569c.isPresent()) {
            C8575bc bcVar = dVar.f151445a;
            if (bcVar == null) {
                bcVar = C8575bc.f29690g;
            }
            ((C40604a) this.f106569c.get()).mo42544a(bcVar);
        }
        return C60866ct.f164955a;
    }
}
