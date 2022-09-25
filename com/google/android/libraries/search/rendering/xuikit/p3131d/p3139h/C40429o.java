package com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4931b.C64257b;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4931b.C64258c;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4931b.C64259d;
import java.util.ArrayList;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.h.o */
/* compiled from: PG */
public final class C40429o extends Observer {

    /* renamed from: a */
    final /* synthetic */ C40432r f106120a;

    public C40429o(C40432r rVar) {
        this.f106120a = rVar;
    }

    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        ArrayList<String> arrayList;
        C40432r rVar = this.f106120a;
        synchronized (rVar.f106133g) {
            if (transactionRecord != null) {
                try {
                    arrayList = transactionRecord.keysOrdered();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                Status status = Status.f186906d;
                C69664n.m101060f(status, "INVALID_ARGUMENT");
                return status;
            }
            for (String str : arrayList) {
                C69664n.m101060f(str, "key");
                if (C69764m.m101234m(str, rVar.f106128b)) {
                    rVar.f106132f.add(str);
                    Snapshot endState = transactionRecord.endState();
                    if (endState == null) {
                        Status status2 = Status.f186906d;
                        C69664n.m101060f(status2, "INVALID_ARGUMENT");
                        return status2;
                    }
                    byte[] find = endState.find(str);
                    if (find == null) {
                        C40420f fVar = rVar.f106137k;
                        C60870cx cxVar = (C60870cx) fVar.f106093b.mo42464a(new C40415a(fVar, C40435u.m70130a(str)), "evict()", new String[0]);
                        C69664n.m101060f(cxVar, "diskCache.evict(createKey(key))");
                        C71663i.m104691d(cxVar).mo62873s(new C40425k(rVar.f106136j));
                    } else {
                        C40420f fVar2 = rVar.f106137k;
                        C64257b a = C40435u.m70130a(str);
                        C64258c cVar = (C64258c) C64259d.f173744c.createBuilder();
                        C69664n.m101060f(cVar, "newBuilder()");
                        C69664n.m101061g(cVar, "builder");
                        C63088z A = C63088z.m96139A(find);
                        cVar.copyOnWrite();
                        C64259d dVar = (C64259d) cVar.instance;
                        dVar.f173746a |= 1;
                        dVar.f173747b = A;
                        C62942bv build = cVar.build();
                        C69664n.m101060f(build, "_builder.build()");
                        C60870cx cxVar2 = (C60870cx) fVar2.f106093b.mo42464a(new C40416b(fVar2, a, (C64259d) build), "put()", new String[0]);
                        C69664n.m101060f(cxVar2, "diskCache.put(createKey(key), createValue(value))");
                        C71663i.m104691d(cxVar2).mo62873s(new C40431q(rVar.f106136j));
                    }
                }
            }
            Status status3 = Status.f186902OK;
            C69664n.m101060f(status3, "OK");
            return status3;
        }
    }
}
