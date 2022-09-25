package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.base.C58817ah;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.f */
/* compiled from: PG */
public final /* synthetic */ class C12812f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C12812f f40009a = new C12812f();

    private /* synthetic */ C12812f() {
    }

    public final Object apply(Object obj) {
        C52686as asVar;
        Optional optional = (Optional) obj;
        int i = C12814h.f40012d;
        if (!optional.isPresent()) {
            return (C52685ar) C52686as.f138291q.createBuilder();
        }
        C65849r rVar = (C65849r) optional.get();
        if (rVar.f179004a == 10) {
            asVar = (C52686as) rVar.f179005b;
        } else {
            asVar = C52686as.f138291q;
        }
        return (C52685ar) asVar.toBuilder();
    }
}
