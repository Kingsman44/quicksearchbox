package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import android.media.AudioTrack;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.am */
/* compiled from: PG */
public final /* synthetic */ class C117969am implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117971ao f327416a;

    public /* synthetic */ C117969am(C117971ao aoVar) {
        this.f327416a = aoVar;
    }

    public final void run() {
        AudioTrack audioTrack;
        C117971ao aoVar = this.f327416a;
        C117970an anVar = aoVar.f327426f;
        if (anVar != null) {
            synchronized (anVar) {
                audioTrack = anVar.f327419c;
                anVar.f327417a = true;
                anVar.f327419c = null;
                anVar.f327418b = false;
            }
            C117970an.m196009b(audioTrack);
        }
        aoVar.f327426f = null;
    }
}
