package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.assistant.p3994s.p3995a.C53459or;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cm */
/* compiled from: PG */
public final /* synthetic */ class C18867cm implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C18867cm f53114a = new C18867cm();

    private /* synthetic */ C18867cm() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        C59071e eVar = C18868cn.f53115a;
        if (optional.isEmpty()) {
            return C58836b.f156633a;
        }
        C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
        Collection.EL.stream(((C53459or) optional.get()).f140310b).filter(C18863ci.f53110a).map(C18864cj.f53111a).forEach(new C18865ck(fVar));
        return C58833ax.m90834k((C118365g) fVar.build());
    }
}
