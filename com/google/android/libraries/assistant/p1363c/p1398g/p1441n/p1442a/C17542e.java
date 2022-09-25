package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1442a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a.C17384b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a.C17387e;
import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a.C17399q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.n.a.e */
/* compiled from: PG */
public final class C17542e extends C68247h {

    /* renamed from: a */
    private final C68283d f50587a;

    /* renamed from: c */
    private final C68283d f50588c;

    public C17542e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C17542e.class), aVar);
        this.f50587a = C68236af.m98549d(dVar);
        this.f50588c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C17399q qVar = (C17399q) list.get(1);
        C59104x b = C17540c.f50583a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) b).mo56372aa(42766)).mo56386p("Connecting to S3");
        C17384b bVar = new C17384b(qVar, (C57981b) list.get(0));
        return C60856cj.m92900i(new C17387e(qVar, C60856cj.m92904m(C47810es.m84978r(bVar), qVar.f50292b)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f50587a.mo60297gq(), this.f50588c.mo60297gq());
    }
}
