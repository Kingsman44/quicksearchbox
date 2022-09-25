package com.google.android.libraries.elements.p1714d.p1719e.p1720a.p1721a;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.elements.d.e.a.a.c */
/* compiled from: PG */
public final class C20936c extends CommandRunContext {

    /* renamed from: a */
    public final C21311r f58709a;

    /* renamed from: b */
    private final ByteStore f58710b;

    public C20936c(ByteStore byteStore, C21311r rVar) {
        this.f58710b = byteStore;
        this.f58709a = rVar;
    }

    public final ByteStore byteStore() {
        return this.f58710b;
    }

    public final boolean enableV2() {
        return false;
    }

    public final SenderStateOuterClass$SenderState senderState() {
        SenderStateOuterClass$SenderState h = this.f58709a.mo26739h();
        return h == null ? SenderStateOuterClass$SenderState.f179521a : h;
    }
}
