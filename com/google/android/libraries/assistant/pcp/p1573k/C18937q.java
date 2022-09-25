package com.google.android.libraries.assistant.pcp.p1573k;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.pcp.k.q */
/* compiled from: PG */
public final /* synthetic */ class C18937q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C18939s f53235a;

    /* renamed from: b */
    public final /* synthetic */ LinkedHashSet f53236b;

    public /* synthetic */ C18937q(C18939s sVar, LinkedHashSet linkedHashSet) {
        this.f53235a = sVar;
        this.f53236b = linkedHashSet;
    }

    public final Object call() {
        C18939s sVar = this.f53235a;
        LinkedHashSet linkedHashSet = this.f53236b;
        if (linkedHashSet.isEmpty()) {
            return sVar.f53243b.mo24218b(C18929i.MOSTLY_USED);
        }
        return new ArrayList(linkedHashSet);
    }
}
