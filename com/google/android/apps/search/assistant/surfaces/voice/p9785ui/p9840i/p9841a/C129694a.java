package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9840i.p9841a;

import android.net.NetworkInfo;
import android.util.AndroidRuntimeException;
import p5488io.p5490b.C69807c;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.i.a.a */
/* compiled from: PG */
public final /* synthetic */ class C129694a implements C69807c {

    /* renamed from: a */
    public final /* synthetic */ C129695b f355917a;

    public /* synthetic */ C129694a(C129695b bVar) {
        this.f355917a = bVar;
    }

    /* renamed from: a */
    public final void mo25806a(C69872g gVar) {
        NetworkInfo activeNetworkInfo = this.f355917a.f355918a.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            gVar.mo61501b(new AndroidRuntimeException("Network not connected"));
        } else {
            gVar.mo61500a();
        }
    }
}
