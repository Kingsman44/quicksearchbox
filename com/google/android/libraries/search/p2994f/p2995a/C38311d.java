package com.google.android.libraries.search.p2994f.p2995a;

import com.google.android.libraries.search.p2994f.p2995a.p2996a.C38307a;
import com.google.android.libraries.search.p2994f.p2995a.p2996a.C38308b;
import com.google.android.libraries.storage.protostore.C42882ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.p4184bj.p4204d.p4205a.C56011c;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4877b.p4878a.C63694e;
import com.google.protos.p4874ap.p4877b.p4878a.C63695f;
import com.google.protos.p4874ap.p4877b.p4878a.C63698i;
import com.google.protos.p4874ap.p4877b.p4878a.C63700k;
import com.google.protos.p4874ap.p4877b.p4878a.C63709t;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.f.a.d */
/* compiled from: PG */
public final class C38311d implements C42882ah {
    /* renamed from: a */
    public final C58485gu mo41366a() {
        C63695f fVar = (C63695f) C63698i.f172221d.createBuilder();
        fVar.copyOnWrite();
        C63698i iVar = (C63698i) fVar.instance;
        iVar.f172224b = 101;
        iVar.f172223a |= 1;
        C62942bv build = fVar.build();
        C69664n.m101060f(build, "newBuilder()\n      .setI…ISIBILITY)\n      .build()");
        C58485gu n = C58485gu.m89846n((C63698i) build);
        C69664n.m101060f(n, "of(id)");
        return n;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C58495hd mo41367b(List list, MessageLite messageLite) {
        C69664n.m101061g(list, "lastResults");
        C69664n.m101061g((C38308b) messageLite, "proto");
        return C58729pv.f156485a;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C63088z mo41368c(MessageLite messageLite) {
        C38308b bVar = (C38308b) messageLite;
        C69664n.m101061g(bVar, "proto");
        C63088z zVar = bVar.f101481c;
        C69664n.m101060f(zVar, "proto.metadata");
        return zVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ MessageLite mo41369d(MessageLite messageLite, C63088z zVar) {
        C38308b bVar = (C38308b) messageLite;
        C69664n.m101061g(bVar, "proto");
        C69664n.m101061g(zVar, "syncState");
        C38307a aVar = (C38307a) bVar.toBuilder();
        aVar.copyOnWrite();
        C38308b bVar2 = (C38308b) aVar.instance;
        zVar.getClass();
        bVar2.f101479a |= 2;
        bVar2.f101481c = zVar;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "proto.toBuilder().setMetadata(syncState).build()");
        return (C38308b) build;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ MessageLite mo41370e(MessageLite messageLite, List list) {
        Object obj;
        int i;
        C38308b bVar = (C38308b) messageLite;
        C69664n.m101061g(bVar, "existingProto");
        C69664n.m101061g(list, "results");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C63709t tVar = (C63709t) obj;
            C63698i iVar = tVar.f172248a;
            if (iVar == null) {
                iVar = C63698i.f172221d;
            }
            int a = C56011c.m87882a(iVar.f172224b);
            if (a != 0 && a == 102 && tVar.f172249b.size() > 0) {
                break;
            }
        }
        C63709t tVar2 = (C63709t) obj;
        boolean z = false;
        if (tVar2 != null && (i = tVar2.f172250c) >= 0 && i < tVar2.f172249b.size()) {
            C63700k kVar = ((C63694e) tVar2.f172249b.get(tVar2.f172250c)).f172215a;
            if (kVar == null) {
                kVar = C63700k.f172226e;
            }
            if (kVar.f172229b == 2 && ((Integer) kVar.f172230c).intValue() == 1) {
                z = true;
            }
        }
        C62934bn builder = bVar.toBuilder();
        C69664n.m101060f(builder, "existingProto.toBuilder()");
        C38307a aVar = (C38307a) builder;
        aVar.copyOnWrite();
        C38308b bVar2 = (C38308b) aVar.instance;
        bVar2.f101479a = 1 | bVar2.f101479a;
        bVar2.f101480b = z;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "newData.build()");
        return (C38308b) build;
    }
}
