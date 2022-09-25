package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ck */
/* compiled from: PG */
public final /* synthetic */ class C126831ck implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C126796bg f349289a;

    public /* synthetic */ C126831ck(C126796bg bgVar) {
        this.f349289a = bgVar;
    }

    public final void accept(Object obj) {
        C126796bg bgVar = this.f349289a;
        int intValue = ((Integer) obj).intValue();
        bgVar.copyOnWrite();
        C126797bh bhVar = (C126797bh) bgVar.instance;
        C126797bh bhVar2 = C126797bh.f349177j;
        C62961ch chVar = bhVar.f349183e;
        if (!chVar.mo58948c()) {
            bhVar.f349183e = C62942bv.mutableCopy(chVar);
        }
        bhVar.f349183e.mo58916g(intValue);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
