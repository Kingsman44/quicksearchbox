package com.google.android.apps.gsa.speech.audio.p7267d;

import android.databinding.C0118a;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.LoudnessEnhancer;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.audio.d.i */
/* compiled from: PG */
final class C92182i {

    /* renamed from: c */
    private static C92182i f256979c;

    /* renamed from: a */
    public final Object f256980a = new Object();

    /* renamed from: b */
    public LoudnessEnhancer f256981b = null;

    /* renamed from: d */
    private boolean f256982d = false;

    /* renamed from: e */
    private boolean f256983e = false;

    private C92182i() {
    }

    /* renamed from: a */
    public static synchronized C92182i m151314a() {
        C92182i iVar;
        synchronized (C92182i.class) {
            if (f256979c == null) {
                f256979c = new C92182i();
            }
            iVar = f256979c;
        }
        return iVar;
    }

    /* renamed from: b */
    public final void mo86836b() {
        synchronized (this.f256980a) {
            LoudnessEnhancer loudnessEnhancer = this.f256981b;
            if (loudnessEnhancer != null) {
                loudnessEnhancer.setEnabled(false);
                this.f256981b.release();
                this.f256981b = null;
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo86837c() {
        if (!this.f256983e) {
            this.f256983e = true;
            AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
            if (queryEffects != null) {
                int length = queryEffects.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (queryEffects[i].type.equals(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER)) {
                        this.f256982d = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!this.f256982d) {
                C59104x d = C92183j.f256984a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AudioRouter");
                C0118a.m109q(d, "System lacks LoudnessEnhancer. Will NOT amplify audio.", 12162, "LoudnessEnhancerProxy", C58975e.f156826a);
            }
        }
        return this.f256982d;
    }
}
