package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9312g.p9313a.p9314a;

import android.media.AudioManager;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1388a.C17232q;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66617co;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.g.a.a.w */
/* compiled from: PG */
public final class C123250w extends C68247h {

    /* renamed from: a */
    private final C68283d f340972a;

    /* renamed from: c */
    private final C68283d f340973c;

    /* renamed from: d */
    private final C68283d f340974d;

    public C123250w(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C123250w.class), aVar);
        this.f340972a = C68236af.m98549d(dVar);
        this.f340973c = C68236af.m98549d(dVar2);
        this.f340974d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C71422aw awVar = (C71422aw) list.get(0);
        AudioManager audioManager = (AudioManager) list.get(1);
        C38487e eVar = (C38487e) list.get(2);
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(audioManager, "audioManager");
        C69664n.m101061g(eVar, "clientInstanceIdGenerator");
        C66617co coVar = C17232q.f49986a;
        return C60856cj.m92900i(C17232q.m34396d(awVar, audioManager, eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f340972a.mo60297gq(), this.f340973c.mo60297gq(), this.f340974d.mo60297gq());
    }
}
