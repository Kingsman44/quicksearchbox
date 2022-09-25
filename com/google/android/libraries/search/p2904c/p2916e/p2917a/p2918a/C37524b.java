package com.google.android.libraries.search.p2904c.p2916e.p2917a.p2918a;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.C37522a;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2922c.C37535b;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.c.e.a.a.b */
/* compiled from: PG */
public final class C37524b implements C37522a {

    /* renamed from: a */
    private static final C59071e f99696a = C59071e.m91332i("com.google.android.libraries.search.c.e.a.a.b");

    /* renamed from: a */
    public final AudioRecord mo41005a(C37535b bVar) {
        C37360ay ayVar = bVar.f99723d;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        C59104x b = f99696a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.DspRecordFactory");
        ((C59052c) ((C59052c) b).mo56372aa(52703)).mo56386p("#audio# createDspAudioRecord");
        if ((bVar.f99720a & 2) == 0 || bVar.f99724e < 0) {
            throw new C37902d("#createAudioRecord failed: invalid capture session id.", C37846as.m66803i(C37519dz.FAILED_OPENING_INVALID_CAPTURE_SESSION_ID));
        } else if (ayVar.f99227b == 1999) {
            try {
                AudioRecord audioRecord = new AudioRecord(new AudioAttributes.Builder().setInternalCapturePreset(ayVar.f99227b).build(), new AudioFormat.Builder().setChannelMask(ayVar.f99229d).setEncoding(ayVar.f99230e).setSampleRate(ayVar.f99228c).build(), C37329d.m66334b(ayVar) * 10, bVar.f99724e);
                if (audioRecord.getState() == 1) {
                    return audioRecord;
                }
                audioRecord.release();
                throw new C37902d("#createAudioRecord failed: Audio record state initialized error.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT));
            } catch (IllegalArgumentException e) {
                throw new C37902d("#createAudioRecord failed: error creating dsp audio record.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT), e);
            }
        } else {
            throw new C37902d("#createAudioRecord failed: invalid android audio source.", C37846as.m66803i(C37519dz.FAILED_OPENING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE));
        }
    }
}
