package com.google.android.libraries.search.silk.p3162a.p3164b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.silk.a.b.i */
/* compiled from: PG */
public final /* synthetic */ class C40559i implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C40562l f106441a;

    /* renamed from: b */
    public final /* synthetic */ int f106442b;

    public /* synthetic */ C40559i(C40562l lVar, int i) {
        this.f106441a = lVar;
        this.f106442b = i;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C40562l lVar = this.f106441a;
        lVar.f106457m = lVar.f106452h.mo29165e(new C40557g(cVar), (long) this.f106442b, TimeUnit.MILLISECONDS);
        lVar.f106459o = cVar;
        return "SilkAudioRecordingApiImpl.recordInner.stopRecording";
    }
}
