package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.soda.C19240ac;
import com.google.android.libraries.search.p3055n.p3058b.p3059a.C39278a;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66979go;
import com.google.speech.p5218j.C66985gu;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66999hh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.n.b.b.f */
/* compiled from: PG */
public final /* synthetic */ class C39331f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C19240ac f103594a;

    public /* synthetic */ C39331f(C19240ac acVar) {
        this.f103594a = acVar;
    }

    public final void accept(Object obj) {
        C19240ac acVar = this.f103594a;
        C39278a aVar = (C39278a) obj;
        C59071e eVar = C39280aa.f103467a;
        C66999hh c = acVar.mo24394c();
        StringBuilder sb = new StringBuilder("\tOnDeviceAsrConfig.LanguagePackDirectory=");
        C66997hf hfVar = c.f182132d;
        if (hfVar == null) {
            hfVar = C66997hf.f182099z;
        }
        sb.append(hfVar.f182115n);
        sb.append("\n\tOnDeviceAsrConfig.ApplicationDomain=");
        C66997hf hfVar2 = c.f182132d;
        if (hfVar2 == null) {
            hfVar2 = C66997hf.f182099z;
        }
        C66964g a = C66964g.m97396a(hfVar2.f182119r);
        if (a == null) {
            a = C66964g.UNKNOWN;
        }
        sb.append(a.name());
        sb.append("\n\tHotwordingConfig.HotmatchConfig.Enabled=");
        C66985gu guVar = c.f182131c;
        if (guVar == null) {
            guVar = C66985gu.f182075h;
        }
        C66979go goVar = guVar.f182082f;
        if (goVar == null) {
            goVar = C66979go.f182056g;
        }
        sb.append(goVar.f182061d);
        sb.append("\n\tHotwordingConfig.HotmatchConfig.ReferenceFingerprintsFilePath=");
        C66985gu guVar2 = c.f182131c;
        if (guVar2 == null) {
            guVar2 = C66985gu.f182075h;
        }
        C66979go goVar2 = guVar2.f182082f;
        if (goVar2 == null) {
            goVar2 = C66979go.f182056g;
        }
        sb.append(goVar2.f182059b == 5 ? (String) goVar2.f182060c : BuildConfig.FLAVOR);
        aVar.mo41755b("SodaCoreConfig", sb.toString());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
