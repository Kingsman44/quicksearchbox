package com.google.android.apps.search.googleapp.discover.p10166a;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57237as;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57239au;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57240av;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57243ay;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57244az;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.i */
/* compiled from: PG */
final class C133995i implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C69648ae f364988a;

    /* renamed from: b */
    final /* synthetic */ List f364989b;

    public C133995i(C69648ae aeVar, List list) {
        this.f364988a = aeVar;
        this.f364989b = list;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C57246ba baVar;
        C133993g gVar = (C133993g) obj;
        C69648ae aeVar = this.f364988a;
        List list = this.f364989b;
        long j = gVar.f364985b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            C57246ba baVar2 = (C57246ba) next;
            C57244az azVar = baVar2.f152823c;
            if (azVar == null) {
                azVar = C57244az.f152807g;
            }
            if ((azVar.f152809a & 1) != 0) {
                C62934bn builder = baVar2.toBuilder();
                C69664n.m101060f(builder, "this.toBuilder()");
                C57239au a = C69664n.m101061g((C57240av) builder, "builder");
                C62934bn builder2 = a.mo54450a().toBuilder();
                C69664n.m101060f(builder2, "this.toBuilder()");
                C57237as a2 = C69664n.m101061g((C57243ay) builder2, "builder");
                C57243ay ayVar = a2.f152799a;
                ayVar.copyOnWrite();
                C57244az azVar2 = (C57244az) ayVar.instance;
                azVar2.f152809a |= 2;
                azVar2.f152811c = ((long) i) + j;
                a.mo54453d(a2.mo54448a());
                baVar = a.mo54451b();
            } else {
                C59052c cVar = (C59052c) C133997k.f364994a.mo56226d();
                cVar.mo56379ah(new C59094n(40199));
                cVar.mo56389s("Action timestamp is not filled in for %s", baVar2);
                baVar = null;
            }
            if (baVar != null) {
                arrayList.add(baVar);
            }
            i = i2;
        }
        aeVar.f186027a = arrayList;
        C69664n.m101060f(gVar, "storedNumber");
        List list2 = this.f364989b;
        C62934bn builder3 = gVar.toBuilder();
        C69664n.m101060f(builder3, "this.toBuilder()");
        C133992f fVar = (C133992f) builder3;
        C69664n.m101061g(fVar, "builder");
        long j2 = ((C133993g) fVar.instance).f364985b;
        int size = list2.size();
        fVar.copyOnWrite();
        C133993g gVar2 = (C133993g) fVar.instance;
        gVar2.f364984a |= 1;
        gVar2.f364985b = j2 + ((long) size);
        C62942bv build = fVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C133993g) build;
    }
}
