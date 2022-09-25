package com.google.android.apps.gsa.smartspace.p7258b;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.smartspace.b.i */
/* compiled from: PG */
public final /* synthetic */ class C92066i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C92070m f256674a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f256675b;

    /* renamed from: c */
    public final /* synthetic */ C31520m f256676c;

    public /* synthetic */ C92066i(C92070m mVar, MessageLite messageLite, C31520m mVar2) {
        this.f256674a = mVar;
        this.f256675b = messageLite;
        this.f256676c = mVar2;
    }

    public final void run() {
        C92070m mVar = this.f256674a;
        MessageLite messageLite = this.f256675b;
        C31520m mVar2 = this.f256676c;
        Optional e = C92070m.m151109e(messageLite);
        if (e.isPresent() && mVar.f256689f.mo77082f()) {
            mVar.f256689f.mo77079c();
            mVar.f256690g.mo86683d((C50818do) e.get());
        }
        if (messageLite instanceof C50819dp) {
            C31167ax.m58112a().mo36918j(mVar2, C31164au.m58092b("SmartspaceUpdate_Push_To_AiAi"), 1);
        }
    }
}
