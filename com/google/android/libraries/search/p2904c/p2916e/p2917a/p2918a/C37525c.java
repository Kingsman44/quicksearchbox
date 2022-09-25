package com.google.android.libraries.search.p2904c.p2916e.p2917a.p2918a;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaSyncEvent;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37668ho;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.C37522a;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2922c.C37535b;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37827a;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.c.e.a.a.c */
/* compiled from: PG */
public final class C37525c implements C37522a {

    /* renamed from: a */
    private static final C59071e f99697a = C59071e.m91332i("com.google.android.libraries.search.c.e.a.a.c");

    /* renamed from: a */
    public final AudioRecord mo41005a(C37535b bVar) {
        C37360ay ayVar = bVar.f99723d;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        C59071e eVar = f99697a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.SyncRecordFactory");
        ((C59052c) ((C59052c) b).mo56372aa(52704)).mo56386p("#audio# createMediaSyncAudioRecord");
        if (ayVar.f99227b == 1999) {
            try {
                AudioRecord.Builder bufferSizeInBytes = new AudioRecord.Builder().setAudioAttributes(new AudioAttributes.Builder().setInternalCapturePreset(ayVar.f99227b).build()).setAudioFormat(new AudioFormat.Builder().setChannelMask(ayVar.f99229d).setEncoding(ayVar.f99230e).setSampleRate(ayVar.f99228c).build()).setBufferSizeInBytes(C37827a.m66750a(ayVar));
                C37668ho hoVar = bVar.f99726g;
                if (hoVar == null) {
                    hoVar = C37668ho.f100047c;
                }
                MediaSyncEvent createEvent = MediaSyncEvent.createEvent(hoVar.f100050b);
                C37668ho hoVar2 = bVar.f99726g;
                if (hoVar2 == null) {
                    hoVar2 = C37668ho.f100047c;
                }
                AudioRecord build = bufferSizeInBytes.setSharedAudioEvent(createEvent.setAudioSessionId(hoVar2.f100049a)).build();
                if (build.getState() == 1) {
                    return build;
                }
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ALT.SyncRecordFactory");
                ((C59052c) ((C59052c) d).mo56372aa(52705)).mo56386p("#audio# createAudioRecord failed: audio record state initialized error.");
                build.release();
                throw new C37902d("#createMediaSyncAudioRecord failed: audio record state initialized error.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT));
            } catch (IllegalArgumentException e) {
                throw new C37902d("#createMediaSyncAudioRecord failed: invalid media sync event.", C37846as.m66803i(C37519dz.FAILED_OPENING_INVALID_MEDIA_SYNC_EVENT), e);
            }
        } else {
            throw new C37902d("#createMediaSyncAudioRecord failed: invalid android audio source.", C37846as.m66803i(C37519dz.FAILED_OPENING_MEDIA_SYNC_MIC_INVALID_AUDIO_SOURCE));
        }
    }
}
