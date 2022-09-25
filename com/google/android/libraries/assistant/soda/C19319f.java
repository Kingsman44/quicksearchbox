package com.google.android.libraries.assistant.soda;

import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62910ar;

/* renamed from: com.google.android.libraries.assistant.soda.f */
/* compiled from: PG */
public final /* synthetic */ class C19319f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Soda f54067a;

    /* renamed from: b */
    public final /* synthetic */ C62910ar f54068b;

    public /* synthetic */ C19319f(Soda soda, C62910ar arVar) {
        this.f54067a = soda;
        this.f54068b = arVar;
    }

    public final void run() {
        Soda soda = this.f54067a;
        ((C59052c) ((C59052c) Soda.f53868a.mo56224b()).mo56372aa(47595)).mo56388r("TTL (%d seconds) reached - destroy SODA", this.f54068b.f169860a);
        soda.mo24340l();
    }
}
