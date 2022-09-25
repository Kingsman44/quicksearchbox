package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124607a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124661c;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.protobuf.C62995dn;
import java.util.Map;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C124574b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f343673a;

    public /* synthetic */ C124574b(C70862aj ajVar) {
        this.f343673a = ajVar;
    }

    public final void accept(Object obj) {
        C70862aj ajVar = this.f343673a;
        C59071e eVar = C124571aq.f343658a;
        C124607a aVar = (C124607a) C124661c.f343917b.createBuilder();
        C58495hd h = C59364ae.m92266l((Map) obj).mo56892c(C124576d.f343675a).mo56899h();
        aVar.copyOnWrite();
        C124661c cVar = (C124661c) aVar.instance;
        C62995dn dnVar = cVar.f343919a;
        if (!dnVar.f170058b) {
            cVar.f343919a = dnVar.mo58980a();
        }
        cVar.f343919a.putAll(h);
        ajVar.mo20123c((C124661c) aVar.build());
        ajVar.mo20121a();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
