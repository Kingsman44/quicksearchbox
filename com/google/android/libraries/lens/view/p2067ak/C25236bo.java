package com.google.android.libraries.lens.view.p2067ak;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.lens.view.ak.bo */
/* compiled from: PG */
public final /* synthetic */ class C25236bo implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C25240bs f68687a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f68688b;

    public /* synthetic */ C25236bo(C25240bs bsVar, AtomicReference atomicReference) {
        this.f68687a = bsVar;
        this.f68688b = atomicReference;
    }

    public final Object apply(Object obj) {
        C25240bs bsVar = this.f68687a;
        AtomicReference atomicReference = this.f68688b;
        C58974d dVar = C25241bt.f68692a;
        MessageLite a = bsVar.mo30341a((MessageLite) obj);
        atomicReference.set(a);
        return a;
    }
}
