package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17251p;
import com.google.android.libraries.search.assistant.p2511d.C32542e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66675i;
import com.google.speech.p5208h.C66676j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C129705b implements C32542e {

    /* renamed from: a */
    public final /* synthetic */ Consumer f355939a;

    public /* synthetic */ C129705b(Consumer consumer) {
        this.f355939a = consumer;
    }

    /* renamed from: a */
    public final C60870cx mo38138a(Object obj) {
        Consumer consumer = this.f355939a;
        C63088z zVar = (C63088z) obj;
        C66675i iVar = (C66675i) C66676j.f181378c.createBuilder();
        iVar.copyOnWrite();
        C66676j jVar = (C66676j) iVar.instance;
        zVar.getClass();
        jVar.f181382a |= 1;
        jVar.f181383b = zVar;
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        cdVar.mo58885m(C66676j.f181379d, (C66676j) iVar.build());
        ((C17251p) consumer).accept((C66607ce) cdVar.build());
        return C60866ct.f164955a;
    }
}
