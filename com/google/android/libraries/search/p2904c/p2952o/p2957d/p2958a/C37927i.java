package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import android.media.AudioManager;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.List;

/* renamed from: com.google.android.libraries.search.c.o.d.a.i */
/* compiled from: PG */
final class C37927i extends AudioManager.AudioRecordingCallback {

    /* renamed from: b */
    public static final /* synthetic */ int f100526b = 0;

    /* renamed from: a */
    final /* synthetic */ C37928j f100527a;

    public C37927i(C37928j jVar) {
        this.f100527a = jVar;
    }

    public final void onRecordingConfigChanged(List list) {
        C46459k.m82829b(this.f100527a.f100531d.mo57304a(C47810es.m84978r(new C37926h(this, list)), this.f100527a.f100528a), "Failed processing onRecordingConfigChanged", new Object[0]);
    }
}
