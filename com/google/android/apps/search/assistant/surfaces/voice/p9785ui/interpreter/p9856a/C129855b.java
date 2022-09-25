package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129895ad;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.a.b */
/* compiled from: PG */
public final class C129855b {

    /* renamed from: a */
    public final C129895ad f356253a;

    public C129855b(C129895ad adVar) {
        C69664n.m101061g(adVar, "interpreterStateStore");
        this.f356253a = adVar;
    }

    /* renamed from: a */
    public final C60870cx mo109295a(C129940bo boVar) {
        C69664n.m101061g(boVar, "trigger");
        return this.f356253a.mo109335b(boVar);
    }

    /* renamed from: b */
    public final void mo109296b(C129940bo boVar) {
        C69664n.m101061g(boVar, "trigger");
        C46459k.m82829b(mo109295a(boVar), "Failed to update the state", new Object[0]);
    }
}
