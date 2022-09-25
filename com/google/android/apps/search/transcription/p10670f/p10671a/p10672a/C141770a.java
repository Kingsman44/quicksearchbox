package com.google.android.apps.search.transcription.p10670f.p10671a.p10672a;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.transcription.f.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C141770a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141780k f384738a;

    public /* synthetic */ C141770a(C141780k kVar) {
        this.f384738a = kVar;
    }

    public final void run() {
        C141780k kVar = this.f384738a;
        if (kVar.f384751f.compareAndSet(false, true)) {
            ((C59052c) ((C59052c) C141780k.f384746a.mo56226d()).mo56372aa(41924)).mo56386p("Transcription audio client deactivated before explicit mic close requested");
            kVar.f384749d.mo116743m();
            kVar.f384749d.mo116742l();
        }
    }
}
