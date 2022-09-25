package com.google.android.apps.gsa.staticplugins.p7909eg;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.d */
/* compiled from: PG */
final class C100513d extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C58833ax f281015a;

    /* renamed from: b */
    final /* synthetic */ String f281016b;

    /* renamed from: c */
    final /* synthetic */ C90908be f281017c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100513d(C58833ax axVar, String str, C90908be beVar) {
        super("TTS onAudioReceived", 1, 0);
        this.f281015a = axVar;
        this.f281016b = str;
        this.f281017c = beVar;
    }

    public final void run() {
        if (this.f281015a.mo56113h()) {
            ((C100321a) this.f281015a.mo56107c()).mo91879c("TtsManager", "TTS_AUDIO_RECEIVED", this.f281016b, (String) null, (String) null);
            this.f281017c.run();
        }
    }
}
