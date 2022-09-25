package com.google.android.libraries.mdi.download.p2248h;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.al */
/* compiled from: PG */
public final /* synthetic */ class C29502al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f79948a;

    public /* synthetic */ C29502al(AtomicReference atomicReference) {
        this.f79948a = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        AtomicReference atomicReference = this.f79948a;
        Void voidR = (Void) obj;
        C29515ay ayVar = (C29515ay) ((C29581bb) atomicReference.get()).toBuilder();
        ayVar.copyOnWrite();
        C29581bb bbVar = (C29581bb) ayVar.instance;
        bbVar.f80151d = 3;
        bbVar.f80148a |= 4;
        atomicReference.set((C29581bb) ayVar.build());
        return C60866ct.f164955a;
    }
}
