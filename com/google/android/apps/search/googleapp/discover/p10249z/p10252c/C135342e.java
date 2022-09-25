package com.google.android.apps.search.googleapp.discover.p10249z.p10252c;

import com.google.android.apps.search.googleapp.p10544z.p10546b.C139906a;
import com.google.android.apps.search.googleapp.p10544z.p10546b.C139907b;
import com.google.android.apps.search.googleapp.p10544z.p10546b.C139909d;
import com.google.android.apps.search.googleapp.p10544z.p10546b.C139911f;
import com.google.android.apps.search.googleapp.p10544z.p10546b.C139912g;
import com.google.android.apps.search.googleapp.p10544z.p10546b.C139914i;
import com.google.common.base.C58817ah;
import com.google.p4283bv.p4354e.C57528m;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62995dn;
import com.google.protobuf.p4746a.C62883b;
import com.google.protobuf.p4746a.C62884c;
import java.util.List;
import p3186j$.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.c.e */
/* compiled from: PG */
final class C135342e implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ List f368755a;

    /* renamed from: b */
    final /* synthetic */ C57528m f368756b;

    public C135342e(List list, C57528m mVar) {
        this.f368755a = list;
        this.f368756b = mVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C139909d dVar = (C139909d) obj;
        C69664n.m101058d(dVar);
        List<String> list = this.f368755a;
        C57528m mVar = this.f368756b;
        C62934bn builder = dVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C139907b bVar = (C139907b) builder;
        C69664n.m101061g(bVar, "builder");
        for (String str : list) {
            C139906a.m227515a(bVar);
            C62884c a = C139906a.m227515a(bVar);
            C139911f fVar = (C139911f) C139912g.f380330c.createBuilder();
            C69664n.m101060f(fVar, "newBuilder()");
            C62934bn builder2 = ((C139912g) Map.EL.getOrDefault(a, str, C69664n.m101061g(fVar, "builder").mo115329a())).toBuilder();
            C69664n.m101060f(builder2, "this.toBuilder()");
            C139914i a2 = C69664n.m101061g((C139911f) builder2, "builder");
            new C62883b(new C62963cj(((C139912g) a2.f380333a.instance).f380332a, C139912g.f380329b));
            C69664n.m101061g(mVar, "value");
            C139911f fVar2 = a2.f380333a;
            fVar2.copyOnWrite();
            C139912g gVar = (C139912g) fVar2.instance;
            mVar.getClass();
            C62961ch chVar = gVar.f380332a;
            if (!chVar.mo58948c()) {
                gVar.f380332a = C62942bv.mutableCopy(chVar);
            }
            gVar.f380332a.mo58916g(mVar.f153693B);
            C139912g a3 = a2.mo115329a();
            C69664n.m101061g(str, "key");
            C69664n.m101061g(a3, "value");
            str.getClass();
            a3.getClass();
            bVar.copyOnWrite();
            C139909d dVar2 = (C139909d) bVar.instance;
            C62995dn dnVar = dVar2.f380328a;
            if (!dnVar.f170058b) {
                dVar2.f380328a = dnVar.mo58980a();
            }
            dVar2.f380328a.put(str, a3);
        }
        C62942bv build = bVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C139909d) build;
    }
}
