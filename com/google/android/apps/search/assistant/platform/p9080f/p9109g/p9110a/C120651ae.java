package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.apps.search.assistant.platform.p9080f.p9081a.C120390a;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67087ko;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C120651ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C67087ko f335593a;

    public /* synthetic */ C120651ae(C67087ko koVar) {
        this.f335593a = koVar;
    }

    public final void accept(Object obj) {
        C67087ko koVar = this.f335593a;
        C120390a aVar = (C120390a) obj;
        if ((koVar.f182368a & 1) != 0) {
            C67050je jeVar = koVar.f182369b;
            if (jeVar == null) {
                jeVar = C67050je.f182262f;
            }
            Optional.m71637of(jeVar);
        } else {
            Optional.empty();
        }
        aVar.mo104737b();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
