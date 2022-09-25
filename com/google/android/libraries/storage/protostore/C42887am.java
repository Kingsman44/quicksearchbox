package com.google.android.libraries.storage.protostore;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import com.google.protobuf.MessageLite;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4783b.C63133a;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4783b.C63134b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.storage.protostore.am */
/* compiled from: PG */
public final /* synthetic */ class C42887am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112204a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f112205b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f112206c;

    public /* synthetic */ C42887am(C42905ba baVar, MessageLite messageLite, AtomicBoolean atomicBoolean) {
        this.f112204a = baVar;
        this.f112205b = messageLite;
        this.f112206c = atomicBoolean;
    }

    public final C60870cx apply(Object obj) {
        C42905ba baVar = this.f112204a;
        MessageLite messageLite = this.f112205b;
        AtomicBoolean atomicBoolean = this.f112206c;
        MessageLite messageLite2 = (MessageLite) obj;
        if (messageLite.equals(messageLite2)) {
            atomicBoolean.set(true);
            return C60856cj.m92900i(messageLite);
        }
        C63134b d = baVar.mo45988d(messageLite);
        C42882ah ahVar = baVar.f112248c;
        C63133a aVar = (C63133a) d.toBuilder();
        long j = d.f170486b;
        aVar.copyOnWrite();
        C63134b bVar = (C63134b) aVar.instance;
        bVar.f170485a |= 1;
        bVar.f170486b = j + 1;
        C63042fg i = C62953e.m95484i(baVar.f112250e.mo26870b());
        aVar.copyOnWrite();
        C63134b bVar2 = (C63134b) aVar.instance;
        i.getClass();
        bVar2.f170487c = i;
        bVar2.f170485a |= 2;
        aVar.copyOnWrite();
        C63134b bVar3 = (C63134b) aVar.instance;
        bVar3.f170485a |= 8;
        bVar3.f170489e = true;
        return C60856cj.m92900i(ahVar.mo41369d(messageLite2, ((C63134b) aVar.build()).toByteString()));
    }
}
