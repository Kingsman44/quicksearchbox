package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.au */
/* compiled from: PG */
public final /* synthetic */ class C25215au implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ long f68655a;

    public /* synthetic */ C25215au(long j) {
        this.f68655a = j;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        long j = this.f68655a;
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25231bj bjVar = aeVar.f68632e;
        if (bjVar == null) {
            bjVar = C25231bj.f68676f;
        }
        C25230bi biVar = (C25230bi) bjVar.toBuilder();
        biVar.copyOnWrite();
        ((C25231bj) biVar.instance).f68681d = j;
        adVar.copyOnWrite();
        C25231bj bjVar2 = (C25231bj) biVar.build();
        bjVar2.getClass();
        ((C25199ae) adVar.instance).f68632e = bjVar2;
        return (C25199ae) adVar.build();
    }
}
