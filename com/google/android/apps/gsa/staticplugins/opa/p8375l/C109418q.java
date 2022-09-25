package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.assistant.p4008y.p4009a.C53593bz;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.q */
/* compiled from: PG */
public final /* synthetic */ class C109418q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ List f304725a;

    /* renamed from: b */
    public final /* synthetic */ List f304726b;

    public /* synthetic */ C109418q(List list, List list2) {
        this.f304725a = list;
        this.f304726b = list2;
    }

    public final void accept(Object obj) {
        List<C53593bz> list = this.f304725a;
        List list2 = this.f304726b;
        String str = (String) obj;
        for (C53593bz bzVar : list) {
            if (bzVar.f140661b.equals(str)) {
                list2.add(bzVar);
                return;
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
