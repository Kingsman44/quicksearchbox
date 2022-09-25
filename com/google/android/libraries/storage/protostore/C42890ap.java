package com.google.android.libraries.storage.protostore;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4783b.C63133a;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4783b.C63134b;

/* renamed from: com.google.android.libraries.storage.protostore.ap */
/* compiled from: PG */
public final /* synthetic */ class C42890ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112209a;

    public /* synthetic */ C42890ap(C42905ba baVar) {
        this.f112209a = baVar;
    }

    public final C60870cx apply(Object obj) {
        C42905ba baVar = this.f112209a;
        MessageLite messageLite = (MessageLite) obj;
        if (!baVar.f112248c.mo41368c(messageLite).mo59173M()) {
            return C60856cj.m92900i(messageLite);
        }
        boolean z = messageLite.getSerializedSize() > 0;
        C42882ah ahVar = baVar.f112248c;
        C63133a aVar = (C63133a) C63134b.f170483h.createBuilder();
        aVar.copyOnWrite();
        C63134b bVar = (C63134b) aVar.instance;
        bVar.f170485a |= 8;
        bVar.f170489e = z;
        return C60856cj.m92900i(ahVar.mo41369d(messageLite, ((C63134b) aVar.build()).toByteString()));
    }
}
