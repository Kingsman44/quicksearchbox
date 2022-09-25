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
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.e.a.a.d */
/* compiled from: PG */
public final class C37526d implements C37522a {

    /* renamed from: a */
    private static final C59071e f99698a = C59071e.m91331h();

    /* renamed from: a */
    public final AudioRecord mo41005a(C37535b bVar) {
        C69664n.m101061g(bVar, "params");
        C59052c cVar = (C59052c) f99698a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.ZLMRecordFactory");
        cVar.mo56379ah(new C59094n(52706));
        cVar.mo56386p("#audio# createZLMAudioRecord");
        C37360ay ayVar = bVar.f99723d;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        C69664n.m101060f(ayVar, "params.audioLibInputParams");
        if (ayVar.f99227b == 6) {
            int i = ayVar.f99229d;
            if (i == 12 || i == 1 || i == 16) {
                try {
                    AudioRecord audioRecord = new AudioRecord(new AudioAttributes.Builder().setCapturePreset(ayVar.f99227b).setHotwordModeEnabled(true).build(), new AudioFormat.Builder().setChannelMask(ayVar.f99229d).setEncoding(ayVar.f99230e).setSampleRate(ayVar.f99228c).build(), C37329d.m66334b(ayVar) * 10, 0);
                    if (audioRecord.getState() == 1) {
                        return audioRecord;
                    }
                    audioRecord.release();
                    throw new C37902d("#createAudioRecord failed: Audio record state initialized error.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT));
                } catch (IllegalArgumentException e) {
                    throw new C37902d("#createAudioRecord failed: error creating Zero Latency Mic audio record.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT), e);
                }
            } else {
                throw new C37902d("#createAudioRecord failed: invalid channel config.", C37846as.m66803i(C37519dz.FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_CHANNEL_MASK));
            }
        } else {
            throw new C37902d("#createAudioRecord failed: invalid android audio source.", C37846as.m66803i(C37519dz.FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_AUDIO_SOURCE));
        }
    }
}
