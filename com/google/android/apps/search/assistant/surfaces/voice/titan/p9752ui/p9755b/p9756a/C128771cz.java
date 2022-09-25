package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import com.google.android.libraries.search.p2904c.p2966s.C37968a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.cz */
/* compiled from: PG */
public final class C128771cz extends AudioManager.AudioPlaybackCallback {

    /* renamed from: a */
    final /* synthetic */ C71361ao f353972a;

    public C128771cz(C71361ao aoVar) {
        this.f353972a = aoVar;
    }

    public final void onPlaybackConfigChanged(List list) {
        C69664n.m101061g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            AudioPlaybackConfiguration audioPlaybackConfiguration = (AudioPlaybackConfiguration) next;
            if (audioPlaybackConfiguration.getAudioAttributes().getUsage() == 1 && (Build.VERSION.SDK_INT < 30 || C37968a.m67027a(audioPlaybackConfiguration))) {
                arrayList.add(next);
            }
        }
        this.f353972a.mo62730w(Boolean.valueOf(!arrayList.isEmpty()));
    }
}
