package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.c.c.l */
/* compiled from: PG */
public final /* synthetic */ class C37442l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C37446p f99398a;

    /* renamed from: b */
    public final /* synthetic */ C37362b f99399b;

    public /* synthetic */ C37442l(C37446p pVar, C37362b bVar) {
        this.f99398a = pVar;
        this.f99399b = bVar;
    }

    public final Object call() {
        C37446p pVar = this.f99398a;
        C37362b bVar = this.f99399b;
        boolean z = pVar.f99411f > pVar.f99408c;
        if (z) {
            pVar.mo40970f(C37589fa.OUTCOME_AUDIO_BYTES_RECEIVER_BYTES_DISPOSED);
            C59104x d = C37446p.f99406a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.BytesReceiverBuffer");
            ((C59052c) ((C59052c) d).mo56372aa(52677)).mo56395y("#audio# registerAudioBytesReceiver bytes disposed(%d), buffer(%s)", (pVar.f99411f - pVar.f99408c) * pVar.f99409d, C37331f.m66337a(pVar));
        }
        pVar.mo40971g(bVar);
        return Boolean.valueOf(!z);
    }
}
