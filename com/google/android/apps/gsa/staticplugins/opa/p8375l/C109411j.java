package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.j */
/* compiled from: PG */
public final /* synthetic */ class C109411j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f304708a;

    public /* synthetic */ C109411j(int i) {
        this.f304708a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f304708a;
        List list = (List) obj;
        if (list.isEmpty()) {
            return C58485gu.m89846n(C53593bz.f140658j);
        }
        Collections.shuffle(list);
        return (C58485gu) Collection.EL.stream(list).limit((long) Math.min(i, list.size())).collect(C58370cn.f155946a);
    }
}
