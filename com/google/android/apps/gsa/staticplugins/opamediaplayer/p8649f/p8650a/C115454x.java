package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.x */
/* compiled from: PG */
public final class C115454x implements C115453w {

    /* renamed from: a */
    private final C23112h f320290a;

    public C115454x(C23112h hVar) {
        this.f320290a = hVar;
    }

    /* renamed from: e */
    public final void mo101994e() {
        this.f320290a.mo28345s("onBannerClicked", "SpeakrVoiceSelectionEventsDispatcher", new Bundle());
    }

    /* renamed from: f */
    public final void mo101995f(C68185bu buVar) {
        Bundle bundle = new Bundle();
        C68185bu.f184497d.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("voiceSelection", C23245b.m43556a(buVar));
        this.f320290a.mo28345s("onVoiceSelected_google.search.readaloud.v1.VoiceSelection", "SpeakrVoiceSelectionEventsDispatcher", bundle);
    }
}
