package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.ba */
/* compiled from: PG */
public final /* synthetic */ class C25222ba implements C25240bs {

    /* renamed from: a */
    public static final /* synthetic */ C25222ba f68661a = new C25222ba();

    private /* synthetic */ C25222ba() {
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25274m mVar = aeVar.f68631d;
        if (mVar == null) {
            mVar = C25274m.f68751i;
        }
        C25272k kVar = (C25272k) mVar.toBuilder();
        C25274m mVar2 = aeVar.f68631d;
        if (mVar2 == null) {
            mVar2 = C25274m.f68751i;
        }
        int i = mVar2.f68759g;
        kVar.copyOnWrite();
        ((C25274m) kVar.instance).f68759g = i + 1;
        adVar.copyOnWrite();
        C25274m mVar3 = (C25274m) kVar.build();
        mVar3.getClass();
        ((C25199ae) adVar.instance).f68631d = mVar3;
        return (C25199ae) adVar.build();
    }
}
