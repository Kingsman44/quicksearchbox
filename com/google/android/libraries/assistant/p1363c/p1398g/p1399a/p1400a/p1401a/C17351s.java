package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.s */
/* compiled from: PG */
public final /* synthetic */ class C17351s implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C17355w f50196a;

    public /* synthetic */ C17351s(C17355w wVar) {
        this.f50196a = wVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C17355w wVar = this.f50196a;
        if (wVar.f50204d) {
            cVar.mo5439d(new IllegalStateException("The player has already been released"));
            return "called when playback ends with STATE_ENDED or the session is closed";
        }
        wVar.f50205e.ifPresent(C17345m.f50190a);
        wVar.f50205e = Optional.m71637of(cVar);
        return "called when playback ends with STATE_ENDED or the session is closed";
    }
}
