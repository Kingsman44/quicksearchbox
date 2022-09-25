package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9076c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1388a.C17231p;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1388a.C17232q;
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

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.c.e */
/* compiled from: PG */
public final class C120242e extends C68247h {

    /* renamed from: a */
    private final C68283d f334599a;

    /* renamed from: c */
    private final C68283d f334600c;

    public C120242e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C120242e.class), aVar);
        this.f334599a = C68236af.m98549d(dVar);
        this.f334600c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C71422aw awVar = (C71422aw) list.get(0);
        C119834cb cbVar = (C119834cb) list.get(1);
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cbVar, "interactionId");
        C66617co coVar = C17232q.f49986a;
        String str = cbVar.f333767a;
        C69664n.m101060f(str, "interactionId.getId()");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(str, "requestId");
        return C60856cj.m92900i(new C17231p(awVar, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f334599a.mo60297gq(), this.f334600c.mo60297gq());
    }
}
