package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.C12025a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p788a.p789a.C12321e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13030ar;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.android.libraries.assistant.auto.tng.p893b.C13184b;
import com.google.android.libraries.assistant.auto.tng.p893b.C13187e;
import com.google.android.libraries.assistant.auto.tng.p893b.C13192j;
import com.google.android.libraries.assistant.auto.tng.p893b.C13193k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.q */
/* compiled from: PG */
public final class C12669q extends C68247h {

    /* renamed from: a */
    private final C68283d f39711a;

    /* renamed from: c */
    private final C68283d f39712c;

    /* renamed from: d */
    private final C68283d f39713d;

    /* renamed from: e */
    private final C68283d f39714e;

    /* renamed from: f */
    private final C68283d f39715f;

    /* renamed from: g */
    private final C69464a f39716g;

    public C12669q(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C69464a aVar3) {
        super(aVar2, new C68277d(C12669q.class), aVar);
        this.f39711a = C68236af.m98549d(dVar);
        this.f39712c = C68236af.m98549d(dVar2);
        this.f39713d = C68236af.m98549d(dVar3);
        this.f39714e = C68236af.m98549d(dVar4);
        this.f39715f = C68236af.m98549d(dVar5);
        this.f39716g = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C13030ar arVar;
        List list = (List) obj;
        C12025a aVar = (C12025a) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        C12321e eVar = (C12321e) list.get(2);
        Executor executor = (Executor) list.get(3);
        C13184b bVar = (C13184b) list.get(4);
        C69464a aVar2 = this.f39716g;
        if (!C57940c.m88582i(cVar)) {
            return aVar.mo20370a();
        }
        C47633f.m84733g(eVar.f39128b.f42146e).mo51516i(new C12667o(aVar), executor);
        try {
            C58833ax axVar = (C58833ax) cVar.mo60292a();
            if (!axVar.mo56113h()) {
                return C60866ct.f164955a;
            }
            C13033au auVar = (C13033au) axVar.mo56107c();
            if (auVar.f40464a == 2) {
                arVar = (C13030ar) auVar.f40465b;
            } else {
                arVar = C13030ar.f40453c;
            }
            String str = arVar.f40456b;
            C13192j jVar = (C13192j) C13193k.f40832c.createBuilder();
            jVar.copyOnWrite();
            C13193k kVar = (C13193k) jVar.instance;
            str.getClass();
            kVar.f40834a = 1 | kVar.f40834a;
            kVar.f40835b = str;
            C70876o.m103760a(bVar.f189039a.mo39510a(C13187e.m29439d(), bVar.f189040b), (C13193k) jVar.build());
            if (((Boolean) aVar2.mo17428b()).booleanValue()) {
                C59104x b = C12668p.f39710a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "EarconPlaybackProducerModule");
                ((C59052c) ((C59052c) b).mo56372aa(44368)).mo56389s("Got final transcription for earcon: %s", str);
            } else {
                C58976aa aaVar = C58975e.f156826a;
            }
            return aVar.mo20373d();
        } catch (ExecutionException e) {
            C59104x d = C12668p.f39710a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EarconPlaybackProducerModule");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(44367)).mo56386p("Could not get TranscriptionState producer");
            return aVar.mo20370a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39711a.mo60297gq(), C68236af.m98546a(this.f39712c.mo60297gq()), this.f39713d.mo60297gq(), this.f39714e.mo60297gq(), this.f39715f.mo60297gq());
    }
}
