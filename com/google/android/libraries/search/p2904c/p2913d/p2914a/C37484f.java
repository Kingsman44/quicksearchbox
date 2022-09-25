package com.google.android.libraries.search.p2904c.p2913d.p2914a;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.media.C2427e;
import androidx.media.C2428f;
import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.c.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C37484f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C37485g f99514a;

    /* renamed from: b */
    public final /* synthetic */ C2427e f99515b;

    public /* synthetic */ C37484f(C37485g gVar, C2427e eVar) {
        this.f99514a = gVar;
        this.f99515b = eVar;
    }

    public final Object call() {
        C37485g gVar = this.f99514a;
        C2427e eVar = this.f99515b;
        AudioManager audioManager = gVar.f99517b;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        } else if (C2428f.m6453a(audioManager, (AudioFocusRequest) eVar.f6704a) == 1) {
            return C37846as.m66796b(C37344ai.RELEASED);
        } else {
            return C37846as.m66796b(C37344ai.FAILED_RELEASING_PLATFORM_ERROR);
        }
    }
}
