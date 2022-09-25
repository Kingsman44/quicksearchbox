package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67175t;
import com.google.speech.recognizer.p5233a.C67451at;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C120162k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C120163l f334420a;

    /* renamed from: b */
    public final /* synthetic */ C66606cd f334421b;

    public /* synthetic */ C120162k(C120163l lVar, C66606cd cdVar) {
        this.f334420a = lVar;
        this.f334421b = cdVar;
    }

    public final void accept(Object obj) {
        C120163l lVar = this.f334420a;
        C66606cd cdVar = this.f334421b;
        C62940bt btVar = C66678l.f181386h;
        C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
        C67073ka kaVar = ((C67050je) obj).f182266c;
        if (kaVar == null) {
            kaVar = C67073ka.f182324f;
        }
        C67171p pVar = kaVar.f182327b;
        if (pVar == null) {
            pVar = C67171p.f182575e;
        }
        C67175t tVar = pVar.f182579c;
        if (tVar == null) {
            tVar = C67175t.f182588e;
        }
        int i = tVar.f182592c;
        kVar.copyOnWrite();
        C66678l lVar2 = (C66678l) kVar.instance;
        lVar2.f181388a |= 2;
        lVar2.f181390c = (float) i;
        int i2 = tVar.f182593d;
        kVar.copyOnWrite();
        C66678l lVar3 = (C66678l) kVar.instance;
        lVar3.f181388a |= 4;
        lVar3.f181391d = i2;
        C119891j jVar = C119891j.DEFAULT_AUDIO_ENCODING;
        int ordinal = lVar.f334424b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            C67451at atVar = C67451at.LINEAR16;
            kVar.copyOnWrite();
            C66678l lVar4 = (C66678l) kVar.instance;
            lVar4.f181389b = atVar.f183321p;
            lVar4.f181388a |= 1;
        } else if (ordinal == 2) {
            C67451at atVar2 = C67451at.OGG_OPUS;
            kVar.copyOnWrite();
            C66678l lVar5 = (C66678l) kVar.instance;
            lVar5.f181389b = atVar2.f183321p;
            lVar5.f181388a |= 1;
        }
        cdVar.mo58885m(btVar, (C66678l) kVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
