package com.google.android.apps.gsa.staticplugins.p7909eg;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.f */
/* compiled from: PG */
final class C100515f extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C58833ax f281021a;

    /* renamed from: b */
    final /* synthetic */ String f281022b;

    /* renamed from: c */
    final /* synthetic */ C90908be f281023c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100515f(C58833ax axVar, String str, C90908be beVar) {
        super("TTS onError", 1, 0);
        this.f281021a = axVar;
        this.f281022b = str;
        this.f281023c = beVar;
    }

    public final void run() {
        if (this.f281021a.mo56113h()) {
            ((C100321a) this.f281021a.mo56107c()).mo91879c("TtsManager", "TTS_ERROR", this.f281022b, (String) null, (String) null);
            this.f281023c.run();
        }
    }
}
