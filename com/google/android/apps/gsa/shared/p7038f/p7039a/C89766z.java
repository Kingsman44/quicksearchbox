package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.assistant.p3825an.p3830c.p3831a.C49322cn;
import com.google.assistant.p3825an.p3830c.p3831a.C49334k;
import com.google.assistant.p3825an.p3830c.p3831a.C49335l;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.shared.f.a.z */
/* compiled from: PG */
public final /* synthetic */ class C89766z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49334k f242959a;

    public /* synthetic */ C89766z(C49334k kVar) {
        this.f242959a = kVar;
    }

    public final void accept(Object obj) {
        C49334k kVar = this.f242959a;
        C49322cn cnVar = (C49322cn) obj;
        kVar.copyOnWrite();
        C49335l lVar = (C49335l) kVar.instance;
        C49335l lVar2 = C49335l.f127511o;
        cnVar.getClass();
        lVar.f127521i = cnVar;
        lVar.f127513a |= 128;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
