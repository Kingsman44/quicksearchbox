package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8081a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82481gu;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4543n.p4544a.C59358n;
import dagger.p5295b.p5297b.C68276c;
import dagger.p5295b.p5297b.C68277d;
import java.util.concurrent.CancellationException;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.a.b */
/* compiled from: PG */
final class C103463b extends C68276c {

    /* renamed from: a */
    final C21370a f288331a;

    /* renamed from: b */
    final C68277d f288332b;

    /* renamed from: c */
    final C83305i f288333c;

    /* renamed from: d */
    C90762bf f288334d = C90762bf.m148259b();

    public C103463b(C83305i iVar, C21370a aVar, C68277d dVar) {
        this.f288333c = iVar;
        this.f288331a = aVar;
        this.f288332b = dVar;
    }

    /* renamed from: h */
    private final void m171396h(String str, long j) {
        String str2;
        Optional ofNullable = Optional.ofNullable(Objects.toString(C59358n.m92253a(C59358n.m92256d()).mo56871lG(this.f288332b.f184638a.getCanonicalName().toString()), (String) null));
        C83305i iVar = this.f288333c;
        if (ofNullable.isPresent()) {
            str2 = (String) ofNullable.get();
        } else {
            str2 = this.f288332b.f184638a.getCanonicalName();
        }
        if (str2 != null) {
            iVar.mo75579d(new C82481gu("OPA_CLOUD_FULFILLMENT_GRAPH_PRODUCER_LATENCY", Double.valueOf((double) j), str2, str));
            return;
        }
        throw new NullPointerException("Null producerName");
    }

    /* renamed from: a */
    public final void mo54578a(Throwable th) {
        if (th instanceof CancellationException) {
            m171396h("CANCELED", this.f288334d.mo85102a());
        } else {
            m171396h("FAILED", this.f288334d.mo85102a());
        }
    }

    /* renamed from: b */
    public final void mo51658b() {
        this.f288334d = new C90762bf(this.f288331a);
    }

    /* renamed from: c */
    public final void mo54579c(Object obj) {
        m171396h("SUCCEEDED", this.f288334d.mo85102a());
    }
}
