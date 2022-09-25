package com.google.android.libraries.search.p2904c.p2913d.p2914a;

import android.media.AudioManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.c.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C37479a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener f99499a;

    /* renamed from: b */
    public final /* synthetic */ int f99500b;

    public /* synthetic */ C37479a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        this.f99499a = onAudioFocusChangeListener;
        this.f99500b = i;
    }

    public final Object call() {
        this.f99499a.onAudioFocusChange(this.f99500b);
        return true;
    }
}
