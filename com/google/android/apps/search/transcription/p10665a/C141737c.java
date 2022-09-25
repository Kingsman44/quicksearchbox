package com.google.android.apps.search.transcription.p10665a;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.transcription.a.c */
/* compiled from: PG */
final class C141737c extends AudioTrack {
    public C141737c(AudioAttributes audioAttributes, AudioFormat audioFormat, int i) {
        super(audioAttributes, audioFormat, i, 1, 0);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            super.finalize();
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C141738d.f384712a.mo56226d()).mo56382g(e)).mo56372aa(41825)).mo56386p("AudioTrack finalization failed");
        }
    }
}
