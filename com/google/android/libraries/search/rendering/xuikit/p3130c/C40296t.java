package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import p5462h.C69685i;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.t */
/* compiled from: PG */
final class C40296t extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ String f105863a;

    /* renamed from: b */
    final /* synthetic */ C40301y f105864b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40296t(String str, C40301y yVar) {
        super(1);
        this.f105863a = str;
        this.f105864b = yVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C40278b bVar;
        C40262ab abVar = (C40262ab) obj;
        C69664n.m101061g(abVar, "oldIndex");
        C40278b bVar2 = (C40278b) Collections.unmodifiableMap(abVar.f105756a).get(this.f105863a);
        if (bVar2 == null) {
            String str = this.f105863a;
            C40301y yVar = this.f105864b;
            C40260a aVar = (C40260a) C40278b.f105799e.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C40280d a = C69664n.m101061g(aVar, "builder");
            C69664n.m101061g(str, "value");
            C40260a aVar2 = a.f105805a;
            aVar2.copyOnWrite();
            C40278b bVar3 = (C40278b) aVar2.instance;
            str.getClass();
            bVar3.f105801a |= 1;
            bVar3.f105802b = str;
            String uuid = UUID.randomUUID().toString();
            C69664n.m101060f(uuid, "randomUUID().toString()");
            C69664n.m101061g(uuid, "value");
            C40260a aVar3 = a.f105805a;
            aVar3.copyOnWrite();
            C40278b bVar4 = (C40278b) aVar3.instance;
            uuid.getClass();
            bVar4.f105801a |= 2;
            bVar4.f105803c = uuid;
            a.mo42372b(C40265ae.m69882a(yVar.f105878d));
            bVar = a.mo42371a();
        } else {
            C40301y yVar2 = this.f105864b;
            C62934bn builder = bVar2.toBuilder();
            C69664n.m101060f(builder, "this.toBuilder()");
            C40280d a2 = C69664n.m101061g((C40260a) builder, "builder");
            a2.mo42372b(C40265ae.m69882a(yVar2.f105878d));
            bVar = a2.mo42371a();
        }
        String str2 = this.f105863a;
        C62934bn builder2 = abVar.toBuilder();
        C69664n.m101060f(builder2, "this.toBuilder()");
        C40302z zVar = (C40302z) builder2;
        C69664n.m101061g(zVar, "builder");
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C40262ab) zVar.instance).f105756a));
        C69664n.m101060f(unmodifiableMap, "_builder.getFilesMap()");
        new C62884c(unmodifiableMap);
        C69664n.m101061g(str2, "key");
        C69664n.m101061g(bVar, "value");
        zVar.mo42391a(str2, bVar);
        C62942bv build = zVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return new C69685i((C40262ab) build, bVar);
    }
}
