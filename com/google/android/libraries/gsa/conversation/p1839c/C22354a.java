package com.google.android.libraries.gsa.conversation.p1839c;

import android.content.Context;
import android.media.AudioManager;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.c.a */
/* compiled from: PG */
public final class C22354a implements C68220f {

    /* renamed from: a */
    private final C69464a f61701a;

    public C22354a(C69464a aVar) {
        this.f61701a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        AudioManager audioManager = (AudioManager) ((Context) ((C68221g) this.f61701a).f184583a).getSystemService("audio");
        C68225k.m98532d(audioManager);
        return audioManager;
    }
}
