package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.api.C74728g;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52801c;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p4988b.p4990b.C64737c;
import com.google.protos.p4985f.p4988b.p4990b.C64738d;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.p */
/* compiled from: PG */
public final /* synthetic */ class C92967p implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C92967p f259324a = new C92967p();

    private /* synthetic */ C92967p() {
    }

    public final Object apply(Object obj) {
        C74728g gVar = (C74728g) obj;
        C59071e eVar = C92970s.f259329a;
        if (gVar.mo71109b().isEmpty()) {
            return C58836b.f156633a;
        }
        try {
            List list = (List) Collection.EL.stream(((C52829f) C52801c.m86708a((Bundle) gVar.mo71109b().get(), "app_action_metadata", C52829f.f138611c)).f138613a).map(C92966o.f259323a).collect(Collectors.toList());
            C64737c cVar = (C64737c) C64738d.f175490b.createBuilder();
            cVar.copyOnWrite();
            C64738d dVar = (C64738d) cVar.instance;
            C62971cq cqVar = dVar.f175492a;
            if (!cqVar.mo58948c()) {
                dVar.f175492a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) dVar.f175492a);
            return C58833ax.m90834k((C64738d) cVar.build());
        } catch (C52802d e) {
            ((C59052c) ((C59052c) ((C59052c) C92970s.f259329a.mo56225c()).mo56382g(e)).mo56372aa(13240)).mo56386p("DirectActions data could not be parsed from assistData Bundle.");
            return C58836b.f156633a;
        }
    }
}
