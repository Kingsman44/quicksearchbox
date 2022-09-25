package com.google.android.libraries.assistant.soda.data;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.speech.p5218j.C67002hk;
import com.google.speech.p5218j.C67007hp;

/* compiled from: PG */
public final class SodaDataProviderJni {

    /* renamed from: a */
    private final C19283a f54006a;

    public SodaDataProviderJni(C19283a aVar) {
        this.f54006a = aVar;
    }

    private final void getData(long j, long j2, byte[] bArr) {
        C60870cx s = this.f54006a.mo24441s((C67007hp) ((C67002hk) ((C67002hk) C67007hp.f182153c.createBuilder()).mergeFrom(bArr, C62921ba.m95368a())).build());
        C19284b bVar = new C19284b(this, j, j2);
        C60856cj.m92911t(s, C47810es.m84974n(bVar), C60826bg.f164896a);
    }

    public native void nativeHandleDataResponse(long j, long j2, byte[] bArr);
}
