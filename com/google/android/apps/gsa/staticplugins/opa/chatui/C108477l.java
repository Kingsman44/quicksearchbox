package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.os.SystemClock;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.C90740ax;
import com.google.android.apps.gsa.staticplugins.opa.soundsearch.AudioWaveformView;
import com.google.android.libraries.logging.C28293k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.l */
/* compiled from: PG */
public final class C108477l extends C108232bc {

    /* renamed from: a */
    private final C90740ax f301729a;

    public C108477l(C90740ax axVar) {
        super((byte[]) null);
        this.f301729a = axVar;
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 41706;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 10;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        return null;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        AudioWaveformView audioWaveformView = blVar.f301093t;
        audioWaveformView.f309053a.f309038b = this.f301729a;
        audioWaveformView.f309055c = SystemClock.uptimeMillis();
        if (!audioWaveformView.f309054b.isStarted()) {
            audioWaveformView.f309054b.start();
        }
        audioWaveformView.f309053a.mo98941a();
    }

    /* renamed from: jz */
    public final int mo96576jz(BitFlags bitFlags) {
        return 2;
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301093t.mo98946a();
    }
}
