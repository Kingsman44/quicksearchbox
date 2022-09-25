package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.p735a;

import android.media.AudioTrack;
import androidx.p104d.p105a.C2164c;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.b.a.h */
/* compiled from: PG */
public final class C12033h implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C69615a f38574a;

    /* renamed from: b */
    final /* synthetic */ AtomicReference f38575b;

    public C12033h(C69615a aVar, AtomicReference atomicReference) {
        this.f38574a = aVar;
        this.f38575b = atomicReference;
    }

    public final void onMarkerReached(AudioTrack audioTrack) {
        this.f38574a.mo5672a();
        if (audioTrack != null) {
            C12034i.m27930a(audioTrack);
        }
        ((C2164c) this.f38575b.get()).mo5437b((Object) null);
    }

    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
