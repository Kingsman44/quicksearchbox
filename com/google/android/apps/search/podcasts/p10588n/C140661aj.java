package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4017at.p4082j.p4083a.C54402da;
import com.google.protobuf.C62942bv;
import com.google.protos.p4757ac.p4758a.C63110i;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.aj */
/* compiled from: PG */
final class C140661aj extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140665an f382038a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140661aj(C140665an anVar) {
        super(1);
        this.f382038a = anVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C54402da daVar = (C54402da) obj;
        if (daVar == null || daVar.f142891b == null) {
            return C60856cj.m92900i(C69496am.f185918a);
        }
        C139958c cVar = this.f382038a.f382042a;
        Collection<C63111j> values = Collections.unmodifiableMap(daVar.f142892c).values();
        ArrayList arrayList = new ArrayList(C69540x.m100804k(values, 10));
        for (C63111j builder : values) {
            C63110i iVar = (C63110i) builder.toBuilder();
            C63113l lVar = daVar.f142891b;
            if (lVar == null) {
                lVar = C63113l.f170365p;
            }
            iVar.copyOnWrite();
            C63111j jVar = (C63111j) iVar.instance;
            lVar.getClass();
            jVar.f170360k = lVar;
            jVar.f170350a |= 512;
            C62942bv build = iVar.build();
            C69664n.m101060f(build, "it.toBuilder().setShowMe…(showResult.show).build()");
            arrayList.add((C63111j) build);
        }
        return cVar.mo115362b(arrayList);
    }
}
