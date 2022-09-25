package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120810c;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120815h;
import com.google.common.base.C58817ah;
import com.google.speech.p5218j.C67050je;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.cl */
/* compiled from: PG */
public final /* synthetic */ class C120254cl implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C120254cl f334620a = new C120254cl();

    private /* synthetic */ C120254cl() {
    }

    public final Object apply(Object obj) {
        int i;
        C120811d dVar = (C120811d) obj;
        if (dVar == null || dVar.f335967a != 1) {
            if (dVar == null) {
                i = 3;
            } else {
                i = C120810c.m200013b(dVar.f335967a);
            }
            throw new C120365ge(i, C120243ca.RECOGNITION_PASSTHROUGH);
        }
        C120815h hVar = (C120815h) dVar.f335968b;
        if ((hVar.f335974a & 1) == 0) {
            return Optional.empty();
        }
        C67050je jeVar = hVar.f335977d;
        if (jeVar == null) {
            jeVar = C67050je.f182262f;
        }
        return Optional.m71637of(jeVar);
    }
}
