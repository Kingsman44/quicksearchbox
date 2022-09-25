package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1174a.C15786a;
import com.google.common.p4522b.C58529ik;
import com.google.common.p4522b.C58800sl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C15821g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58529ik f47048a;

    public /* synthetic */ C15821g(C58529ik ikVar) {
        this.f47048a = ikVar;
    }

    public final void accept(Object obj) {
        C58529ik ikVar = this.f47048a;
        C15786a aVar = (C15786a) obj;
        C58800sl lA = aVar.mo22570b().iterator();
        while (lA.hasNext()) {
            ikVar.mo55495c((C15785a) lA.next(), aVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
