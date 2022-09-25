package com.google.android.libraries.assistant.pcp.p1579n.p1582c;

import com.google.assistant.p3803ag.p3809c.C49110gv;
import com.google.assistant.p3803ag.p3809c.C49111gw;
import com.google.assistant.p3980n.p3985c.C53025p;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.n.c.h */
/* compiled from: PG */
public final /* synthetic */ class C19012h implements C58817ah {
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        C58485gu guVar = C19015k.f53389a;
        if (optional.isEmpty() || ((C53025p) optional.get()).f138986a.isEmpty()) {
            return C58485gu.m89845m();
        }
        C49110gv gvVar = (C49110gv) C49111gw.f127019a.createBuilder();
        gvVar.mo58885m(C53025p.f138984c, (C53025p) optional.get());
        return C58485gu.m89846n((C49111gw) gvVar.build());
    }
}
