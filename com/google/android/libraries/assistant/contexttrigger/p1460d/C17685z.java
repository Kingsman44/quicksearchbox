package com.google.android.libraries.assistant.contexttrigger.p1460d;

import com.google.android.libraries.assistant.contexttrigger.p1457c.C17637b;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17641e;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17642f;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17643g;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17649m;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17653q;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17654r;
import com.google.android.libraries.assistant.contexttrigger.p1457c.C17655s;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.z */
/* compiled from: PG */
final class C17685z implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C17660aa f50844a;

    public C17685z(C17660aa aaVar) {
        this.f50844a = aaVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C17660aa.f50797a.mo56226d()).mo56382g(th)).mo56372aa(46984)).mo56386p("Failed to extract headset state from intent.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C17660aa.f50797a.mo56224b()).mo56372aa(46986)).mo56386p("No headset state extracted.");
            return;
        }
        C17643g gVar = this.f50844a.f50798b;
        C17649m mVar = (C17649m) C17653q.f50778c.createBuilder();
        C17692f fVar = (C17692f) optional.get();
        mVar.copyOnWrite();
        C17653q qVar = (C17653q) mVar.instance;
        fVar.getClass();
        qVar.f50781b = fVar;
        qVar.f50780a = 1;
        C17653q qVar2 = (C17653q) mVar.build();
        C17637b bVar = gVar.f50765b;
        C17654r rVar = (C17654r) C17655s.f50782c.createBuilder();
        rVar.copyOnWrite();
        C17655s sVar = (C17655s) rVar.instance;
        qVar2.getClass();
        sVar.f50785b = qVar2;
        sVar.f50784a = 1 | sVar.f50784a;
        C60870cx a = C70876o.m103760a(bVar.f189039a.mo39510a(C17641e.m34937a(), bVar.f189040b), (C17655s) rVar.build());
        C17642f fVar2 = new C17642f(qVar2);
        C60856cj.m92911t(a, C47810es.m84974n(fVar2), gVar.f50766c);
    }
}
