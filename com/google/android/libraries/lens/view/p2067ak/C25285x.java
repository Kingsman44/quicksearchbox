package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.x */
/* compiled from: PG */
public final /* synthetic */ class C25285x implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ long f68783a;

    public /* synthetic */ C25285x(long j) {
        this.f68783a = j;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        long j = this.f68783a;
        C25284w wVar = (C25284w) messageLite;
        C25283v vVar = (C25283v) wVar.toBuilder();
        C25269h hVar = wVar.f68782c;
        if (hVar == null) {
            hVar = C25269h.f68742d;
        }
        C25268g gVar = (C25268g) hVar.toBuilder();
        gVar.copyOnWrite();
        ((C25269h) gVar.instance).f68744a = j;
        vVar.copyOnWrite();
        C25269h hVar2 = (C25269h) gVar.build();
        hVar2.getClass();
        ((C25284w) vVar.instance).f68782c = hVar2;
        return (C25284w) vVar.build();
    }
}
