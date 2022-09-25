package com.google.android.apps.gsa.staticplugins.p7909eg;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.e */
/* compiled from: PG */
final class C100514e extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C58833ax f281018a;

    /* renamed from: b */
    final /* synthetic */ String f281019b;

    /* renamed from: c */
    final /* synthetic */ C90908be f281020c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100514e(C58833ax axVar, String str, C90908be beVar) {
        super("TTS onDone", 1, 0);
        this.f281018a = axVar;
        this.f281019b = str;
        this.f281020c = beVar;
    }

    public final void run() {
        if (this.f281018a.mo56113h()) {
            ((C100321a) this.f281018a.mo56107c()).mo91879c("TtsManager", "TTS_END", this.f281019b, (String) null, (String) null);
            this.f281020c.run();
        }
    }
}
