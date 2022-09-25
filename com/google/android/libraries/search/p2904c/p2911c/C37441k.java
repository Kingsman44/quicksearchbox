package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.c.c.k */
/* compiled from: PG */
public final /* synthetic */ class C37441k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C37446p f99395a;

    /* renamed from: b */
    public final /* synthetic */ int f99396b;

    /* renamed from: c */
    public final /* synthetic */ C37362b f99397c;

    public /* synthetic */ C37441k(C37446p pVar, int i, C37362b bVar) {
        this.f99395a = pVar;
        this.f99396b = i;
        this.f99397c = bVar;
    }

    public final Object call() {
        C37446p pVar = this.f99395a;
        int i = this.f99396b;
        C37362b bVar = this.f99397c;
        int i2 = pVar.f99411f;
        int i3 = pVar.f99408c;
        int i4 = i2 > i3 ? (i2 - i3) * pVar.f99409d : 0;
        if (i4 > i) {
            pVar.mo40970f(C37589fa.OUTCOME_AUDIO_BYTES_RECEIVER_WITH_OFFSET_BYTES_DISPOSED);
            C59104x d = C37446p.f99406a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.BytesReceiverBuffer");
            ((C59052c) ((C59052c) d).mo56372aa(52678)).mo56395y("#audio# registerAudioBytesReceiver with offset bytes disposed(%d), buffer(%s)", i4 - i, C37331f.m66337a(pVar));
            pVar.mo40971g(bVar);
            return false;
        }
        pVar.mo40971g(new C37444n(bVar, i - i4));
        return true;
    }
}
