package com.google.android.apps.search.transcription.voiceime;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.search.transcription.voiceime.az */
/* compiled from: PG */
public final /* synthetic */ class C141988az implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141992bc f385277a;

    /* renamed from: b */
    public final /* synthetic */ String f385278b;

    public /* synthetic */ C141988az(C141992bc bcVar, String str) {
        this.f385277a = bcVar;
        this.f385278b = str;
    }

    public final void run() {
        C141992bc bcVar = this.f385277a;
        String str = this.f385278b;
        if (bcVar.f385283a.equals(bcVar.f385284b.f385295k)) {
            bcVar.f385284b.mo116955h(str);
            C141993bd bdVar = bcVar.f385284b;
            C141993bd.m230509d();
            if (bdVar.f385292h != null) {
                bdVar.f385291g = new C141987ay(bdVar.mo116950b().f385276b, bdVar.mo116950b().f385276b);
                bdVar.f385292h.finishComposingText();
                bdVar.f385296l = BuildConfig.FLAVOR;
            }
        }
    }
}
