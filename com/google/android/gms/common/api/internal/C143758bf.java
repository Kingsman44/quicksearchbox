package com.google.android.gms.common.api.internal;

import android.os.Handler;

/* renamed from: com.google.android.gms.common.api.internal.bf */
/* compiled from: PG */
final class C143758bf implements C143822k {

    /* renamed from: a */
    final /* synthetic */ C143767bo f389741a;

    public C143758bf(C143767bo boVar) {
        this.f389741a = boVar;
    }

    /* renamed from: a */
    public final void mo57734a(boolean z) {
        Handler handler = this.f389741a.f389784n;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
