package com.google.android.apps.search.transcription.voiceime;

import com.google.android.apps.search.transcription.voiceime.p10680a.C141958a;
import com.google.android.apps.search.transcription.voiceime.p10680a.C141959b;
import com.google.common.base.C58817ah;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.transcription.voiceime.x */
/* compiled from: PG */
public final /* synthetic */ class C142044x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f385392a;

    public /* synthetic */ C142044x(long j) {
        this.f385392a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f385392a;
        Duration duration = C141972ak.f385236a;
        C141958a aVar = (C141958a) ((C141959b) obj).toBuilder();
        aVar.copyOnWrite();
        C141959b bVar = (C141959b) aVar.instance;
        bVar.f385214a |= 1;
        bVar.f385215b = j;
        return (C141959b) aVar.build();
    }
}
