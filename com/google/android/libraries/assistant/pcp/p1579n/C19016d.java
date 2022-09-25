package com.google.android.libraries.assistant.pcp.p1579n;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import java.util.List;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.libraries.assistant.pcp.n.d */
/* compiled from: PG */
public final /* synthetic */ class C19016d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C53306j f53396a;

    public /* synthetic */ C19016d(C53306j jVar) {
        this.f53396a = jVar;
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        return (List) IntStream.CC.range(0, list.size()).mapToObj(new C19017e(list, this.f53396a)).collect(C58370cn.f155946a);
    }
}
