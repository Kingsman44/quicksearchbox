package com.google.android.libraries.assistant.pcp.p1579n.p1582c;

import com.google.assistant.p3994s.p3995a.C53459or;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.n.c.b */
/* compiled from: PG */
public final /* synthetic */ class C19006b implements C58817ah {
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C58485gu.m89845m();
        }
        return (List) Collection.EL.stream(((C53459or) optional.get()).f140310b).filter(C19007c.f53380a).flatMap(C19008d.f53381a).map(C19009e.f53382a).collect(C58370cn.f155946a);
    }
}
