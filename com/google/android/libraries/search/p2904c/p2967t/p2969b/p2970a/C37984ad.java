package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.c.t.b.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C37984ad implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C37987ag f100630a;

    public /* synthetic */ C37984ad(C37987ag agVar) {
        this.f100630a = agVar;
    }

    public final Object call() {
        C37987ag agVar = this.f100630a;
        if (!agVar.f100637d.mo41099e().isDone()) {
            return agVar.f100635b.mo41004c();
        }
        throw new C37902d("#openAudioSource failed: routing failed.", C37846as.m66803i(C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING));
    }
}
