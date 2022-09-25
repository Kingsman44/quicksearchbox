package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.protobuf.C62921ba;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.y */
/* compiled from: PG */
public final class C115455y implements C23113i {

    /* renamed from: a */
    private final C115453w f320291a;

    public C115455y(C115453w wVar) {
        this.f320291a = wVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SpeakrVoiceSelectionEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onBannerClicked")) {
                this.f320291a.mo101994e();
            } else if (str.equals("onVoiceSelected_google.search.readaloud.v1.VoiceSelection")) {
                this.f320291a.mo101995f((C68185bu) new C23271p(C68185bu.f184497d.getParserForType(), C62921ba.m95368a(), C68185bu.f184497d).mo28733b("voiceSelection", pVar));
            }
        }
    }
}
