package com.google.android.libraries.storage.protostore;

import android.util.Log;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.MessageLite;
import com.google.protobuf.p4750c.C62953e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4783b.C63133a;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4783b.C63134b;
import com.google.protos.p4874ap.p4877b.p4878a.C63710u;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.storage.protostore.ak */
/* compiled from: PG */
public final /* synthetic */ class C42885ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42905ba f112199a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f112200b;

    /* renamed from: c */
    public final /* synthetic */ C63710u f112201c;

    /* renamed from: d */
    public final /* synthetic */ AtomicLong f112202d;

    public /* synthetic */ C42885ak(C42905ba baVar, MessageLite messageLite, C63710u uVar, AtomicLong atomicLong) {
        this.f112199a = baVar;
        this.f112200b = messageLite;
        this.f112201c = uVar;
        this.f112202d = atomicLong;
    }

    public final C60870cx apply(Object obj) {
        C42905ba baVar = this.f112199a;
        MessageLite messageLite = this.f112200b;
        C63710u uVar = this.f112201c;
        AtomicLong atomicLong = this.f112202d;
        MessageLite messageLite2 = (MessageLite) obj;
        C63134b d = baVar.mo45988d(messageLite);
        C63134b d2 = baVar.mo45988d(messageLite2);
        if (d.f170486b != d2.f170486b) {
            Log.v("ProtoDataStoreWithLams", "Ignoring stale RPC response");
            return C60856cj.m92900i(messageLite2);
        }
        MessageLite e = baVar.f112248c.mo41370e(messageLite, uVar.f172254a);
        C63133a aVar = (C63133a) d2.toBuilder();
        aVar.copyOnWrite();
        C63134b bVar = (C63134b) aVar.instance;
        bVar.f170485a &= -9;
        bVar.f170489e = false;
        aVar.copyOnWrite();
        ((C63134b) aVar.instance).f170490f = C63134b.emptyProtobufList();
        C63042fg fgVar = uVar.f172255b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        aVar.copyOnWrite();
        C63134b bVar2 = (C63134b) aVar.instance;
        fgVar.getClass();
        bVar2.f170488d = fgVar;
        bVar2.f170485a |= 4;
        C62971cq cqVar = uVar.f172254a;
        aVar.copyOnWrite();
        C63134b bVar3 = (C63134b) aVar.instance;
        C62971cq cqVar2 = bVar3.f170490f;
        if (!cqVar2.mo58948c()) {
            bVar3.f170490f = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) bVar3.f170490f);
        C63042fg i = C62953e.m95484i(atomicLong.get());
        aVar.copyOnWrite();
        C63134b bVar4 = (C63134b) aVar.instance;
        i.getClass();
        bVar4.f170491g = i;
        bVar4.f170485a |= 16;
        return C60856cj.m92900i(baVar.f112248c.mo41369d(e, ((C63134b) aVar.build()).toByteString()));
    }
}
