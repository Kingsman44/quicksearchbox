package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.p735a;

import android.media.AudioTrack;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.b.a.i */
/* compiled from: PG */
public final class C12034i {
    /* renamed from: a */
    public static final void m27930a(AudioTrack audioTrack) {
        C69664n.m101061g(audioTrack, "<this>");
        if (audioTrack.getState() == 1) {
            audioTrack.stop();
            audioTrack.release();
        }
    }
}
