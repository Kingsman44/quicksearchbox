package com.google.android.libraries.search.p2904c.p2916e.p2925c;

import android.media.AudioRecord;
import android.media.audiofx.AudioEffect;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.c.e.c.a */
/* compiled from: PG */
public final class C37540a {

    /* renamed from: a */
    private static final C59071e f99732a = C59071e.m91332i("com.google.android.libraries.search.c.e.c.a");

    /* renamed from: a */
    public static C58833ax m66539a(AudioRecord audioRecord, Function function) {
        try {
            AudioEffect audioEffect = (AudioEffect) function.apply(Integer.valueOf(audioRecord.getAudioSessionId()));
            if (audioEffect.setEnabled(true) != 0) {
                C58836b bVar = C58836b.f156633a;
                ((C59052c) ((C59052c) f99732a.mo56224b()).mo56372aa(52709)).mo56389s("#audio# Failed to enable audio effect: %s", audioEffect.getDescriptor().uuid);
                return bVar;
            }
            C58833ax k = C58833ax.m90834k(audioEffect);
            if (audioEffect.getDescriptor() == null) {
                return k;
            }
            ((C59052c) ((C59052c) f99732a.mo56224b()).mo56372aa(52707)).mo56389s("#audio# Using audio effect: %s", audioEffect.getDescriptor().uuid);
            return k;
        } catch (RuntimeException unused) {
            C58836b bVar2 = C58836b.f156633a;
            ((C59052c) ((C59052c) f99732a.mo56224b()).mo56372aa(52708)).mo56386p("#audio# Error in initializing the audio effect.");
            return bVar2;
        }
    }
}
