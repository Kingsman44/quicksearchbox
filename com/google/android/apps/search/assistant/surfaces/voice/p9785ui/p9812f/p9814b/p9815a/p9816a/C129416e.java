package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.p9816a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65552j;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65558p;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65559q;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.e */
/* compiled from: PG */
final class C129416e implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C65552j f355359a;

    public C129416e(C65552j jVar) {
        this.f355359a = jVar;
    }

    public final /* synthetic */ void accept(Object obj) {
        C65558p pVar = (C65558p) obj;
        C65552j jVar = this.f355359a;
        jVar.copyOnWrite();
        C65559q qVar = (C65559q) jVar.instance;
        C65559q qVar2 = C65559q.f178162b;
        pVar.getClass();
        C62971cq cqVar = qVar.f178164a;
        if (!cqVar.mo58948c()) {
            qVar.f178164a = C62942bv.mutableCopy(cqVar);
        }
        qVar.f178164a.add(pVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
