package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37422c;
import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2911c.C37441k;
import com.google.android.libraries.search.p2904c.p2911c.C37446p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.t.b.a.v */
/* compiled from: PG */
public final /* synthetic */ class C38013v implements C37422c {

    /* renamed from: a */
    public final /* synthetic */ C37446p f100711a;

    /* renamed from: b */
    public final /* synthetic */ int f100712b;

    public /* synthetic */ C38013v(C37446p pVar, int i) {
        this.f100711a = pVar;
        this.f100712b = i;
    }

    /* renamed from: j */
    public final C60870cx mo40946j(C37362b bVar) {
        C37446p pVar = this.f100711a;
        int i = this.f100712b;
        pVar.mo40970f(C37589fa.OUTCOME_AUDIO_BYTES_RECEIVER_REGISTERED_WITH_OFFSET);
        C59104x b = C37446p.f99406a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.BytesReceiverBuffer");
        ((C59052c) ((C59052c) b).mo56372aa(52676)).mo56395y("#audio# registerAudioBytesReceiver with offset(%d bytes), buffer(%s)", i, C37331f.m66337a(pVar));
        C37441k kVar = new C37441k(pVar, i, bVar);
        return C60856cj.m92904m(C47810es.m84978r(kVar), pVar.f99407b);
    }
}
