package com.google.android.apps.gsa.speech.p7271d;

import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.speech.d.d */
/* compiled from: PG */
final class C92227d extends C60842bw {

    /* renamed from: a */
    final /* synthetic */ C92229f f257130a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92227d(C92229f fVar, C60870cx cxVar) {
        super(cxVar);
        this.f257130a = fVar;
    }

    public final boolean cancel(boolean z) {
        if (!isDone() && !isCancelled()) {
            this.f257130a.mo86901b();
        }
        return super.cancel(z);
    }
}
