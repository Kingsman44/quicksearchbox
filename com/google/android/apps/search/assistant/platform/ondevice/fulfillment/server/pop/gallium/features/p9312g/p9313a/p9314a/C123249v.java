package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9312g.p9313a.p9314a;

import com.google.android.libraries.search.assistant.p2783s.p2785b.C36383b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.g.a.a.v */
/* compiled from: PG */
public final class C123249v extends C68247h {

    /* renamed from: a */
    private final C68283d f340970a;

    /* renamed from: c */
    private final C68283d f340971c;

    public C123249v(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C123249v.class), aVar);
        this.f340970a = C68236af.m98549d(dVar);
        this.f340971c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C71422aw awVar = (C71422aw) list.get(0);
        C36383b bVar = (C36383b) list.get(1);
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(bVar, "clientInfoProvider");
        return C60856cj.m92900i(new C123244q(awVar, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f340970a.mo60297gq(), this.f340971c.mo60297gq());
    }
}
