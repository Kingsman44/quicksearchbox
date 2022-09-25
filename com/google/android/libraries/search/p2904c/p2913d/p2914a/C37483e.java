package com.google.android.libraries.search.p2904c.p2913d.p2914a;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.media.C2427e;
import androidx.media.C2428f;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.c.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C37483e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C37485g f99512a;

    /* renamed from: b */
    public final /* synthetic */ C2427e f99513b;

    public /* synthetic */ C37483e(C37485g gVar, C2427e eVar) {
        this.f99512a = gVar;
        this.f99513b = eVar;
    }

    public final Object call() {
        C37485g gVar = this.f99512a;
        C2427e eVar = this.f99513b;
        AudioManager audioManager = gVar.f99517b;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        } else if (C2428f.m6454b(audioManager, (AudioFocusRequest) eVar.f6704a) == 1) {
            return C37846as.m66795a(C37341af.ACQUIRED);
        } else {
            return C37846as.m66795a(C37341af.FAILED_ACQUIRING_PLATFORM_ERROR);
        }
    }
}
