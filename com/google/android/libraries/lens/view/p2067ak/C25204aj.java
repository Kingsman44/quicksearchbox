package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.aj */
/* compiled from: PG */
public final /* synthetic */ class C25204aj implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ int f68646a;

    public /* synthetic */ C25204aj(int i) {
        this.f68646a = i;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        int i = this.f68646a;
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25258cj cjVar = aeVar.f68630c;
        if (cjVar == null) {
            cjVar = C25258cj.f68719b;
        }
        C25257ci ciVar = (C25257ci) cjVar.toBuilder();
        ciVar.copyOnWrite();
        ((C25258cj) ciVar.instance).f68721a = i;
        adVar.copyOnWrite();
        C25258cj cjVar2 = (C25258cj) ciVar.build();
        cjVar2.getClass();
        ((C25199ae) adVar.instance).f68630c = cjVar2;
        return (C25199ae) adVar.build();
    }
}
