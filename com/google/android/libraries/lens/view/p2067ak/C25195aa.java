package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.aa */
/* compiled from: PG */
public final /* synthetic */ class C25195aa implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ boolean f68622a;

    public /* synthetic */ C25195aa(boolean z) {
        this.f68622a = z;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        boolean z = this.f68622a;
        C25284w wVar = (C25284w) messageLite;
        C25283v vVar = (C25283v) wVar.toBuilder();
        C25269h hVar = wVar.f68782c;
        if (hVar == null) {
            hVar = C25269h.f68742d;
        }
        C25268g gVar = (C25268g) hVar.toBuilder();
        gVar.copyOnWrite();
        ((C25269h) gVar.instance).f68746c = z;
        vVar.copyOnWrite();
        C25269h hVar2 = (C25269h) gVar.build();
        hVar2.getClass();
        ((C25284w) vVar.instance).f68782c = hVar2;
        return (C25284w) vVar.build();
    }
}
