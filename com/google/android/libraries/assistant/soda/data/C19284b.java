package com.google.android.libraries.assistant.soda.data;

import com.google.common.util.concurrent.C60845bz;
import com.google.speech.p5218j.C67010hs;
import com.google.speech.p5218j.C67013hv;
import com.google.speech.p5218j.C67014hw;
import com.google.speech.p5218j.C67017hz;

/* renamed from: com.google.android.libraries.assistant.soda.data.b */
/* compiled from: PG */
final class C19284b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f54007a;

    /* renamed from: b */
    final /* synthetic */ long f54008b;

    /* renamed from: c */
    final /* synthetic */ SodaDataProviderJni f54009c;

    public C19284b(SodaDataProviderJni sodaDataProviderJni, long j, long j2) {
        this.f54009c = sodaDataProviderJni;
        this.f54007a = j;
        this.f54008b = j2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C67010hs hsVar = (C67010hs) C67017hz.f182174c.createBuilder();
        C67013hv hvVar = (C67013hv) C67014hw.f182165c.createBuilder();
        String message = th.getMessage();
        hvVar.copyOnWrite();
        C67014hw hwVar = (C67014hw) hvVar.instance;
        message.getClass();
        hwVar.f182167a |= 1;
        hwVar.f182168b = message;
        hsVar.copyOnWrite();
        C67017hz hzVar = (C67017hz) hsVar.instance;
        C67014hw hwVar2 = (C67014hw) hvVar.build();
        hwVar2.getClass();
        hzVar.f182177b = hwVar2;
        hzVar.f182176a = 1;
        this.f54009c.nativeHandleDataResponse(this.f54007a, this.f54008b, ((C67017hz) hsVar.build()).toByteArray());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f54009c.nativeHandleDataResponse(this.f54007a, this.f54008b, ((C67017hz) obj).toByteArray());
    }
}
