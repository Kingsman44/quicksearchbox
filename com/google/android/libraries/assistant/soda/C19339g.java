package com.google.android.libraries.assistant.soda;

import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62910ar;

/* renamed from: com.google.android.libraries.assistant.soda.g */
/* compiled from: PG */
public final /* synthetic */ class C19339g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Soda f54113a;

    /* renamed from: b */
    public final /* synthetic */ C62910ar f54114b;

    public /* synthetic */ C19339g(Soda soda, C62910ar arVar) {
        this.f54113a = soda;
        this.f54114b = arVar;
    }

    public final void run() {
        Soda soda = this.f54113a;
        ((C59052c) ((C59052c) Soda.f53868a.mo56224b()).mo56372aa(47596)).mo56388r("TTL (%d seconds) reached - destroy SodaSharedResources", this.f54114b.f169860a);
        soda.mo24339k();
    }
}
