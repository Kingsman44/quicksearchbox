package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.ar */
/* compiled from: PG */
public final /* synthetic */ class C25212ar implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ boolean f68652a;

    public /* synthetic */ C25212ar(boolean z) {
        this.f68652a = z;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        boolean z = this.f68652a;
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25231bj bjVar = aeVar.f68632e;
        if (bjVar == null) {
            bjVar = C25231bj.f68676f;
        }
        C25230bi biVar = (C25230bi) bjVar.toBuilder();
        biVar.copyOnWrite();
        ((C25231bj) biVar.instance).f68680c = z;
        adVar.copyOnWrite();
        C25231bj bjVar2 = (C25231bj) biVar.build();
        bjVar2.getClass();
        ((C25199ae) adVar.instance).f68632e = bjVar2;
        return (C25199ae) adVar.build();
    }
}
