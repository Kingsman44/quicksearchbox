package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.search.p3055n.C39276az;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.android.libraries.search.p3055n.C39673d;
import com.google.android.libraries.search.p3055n.C39690f;
import com.google.android.libraries.search.p3055n.p3058b.p3059a.C39278a;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67091ks;
import com.google.speech.p5218j.C67175t;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.n.b.b.v */
/* compiled from: PG */
public final /* synthetic */ class C39347v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C39655ci f103626a;

    public /* synthetic */ C39347v(C39655ci ciVar) {
        this.f103626a = ciVar;
    }

    public final void accept(Object obj) {
        C39655ci ciVar = this.f103626a;
        C39278a aVar = (C39278a) obj;
        C59071e eVar = C39280aa.f103467a;
        StringBuilder sb = new StringBuilder("\tClientInfo.ClientId=");
        C39690f fVar = ciVar.f104381b;
        if (fVar == null) {
            fVar = C39690f.f104461c;
        }
        sb.append(fVar.f104464b);
        sb.append("\n\tLocaleParams.Locale=");
        C39276az azVar = ciVar.f104382c;
        if (azVar == null) {
            azVar = C39276az.f103456b;
        }
        sb.append(azVar.f103458a);
        sb.append("\n\tAudioParams.MicAudioFormat.ChannelCount=");
        C39673d dVar = ciVar.f104383d;
        if (dVar == null) {
            dVar = C39673d.f104428c;
        }
        C67175t tVar = dVar.f104431b;
        if (tVar == null) {
            tVar = C67175t.f182588e;
        }
        sb.append(tVar.f182593d);
        sb.append("\n\tExternalHotwordEvent=");
        boolean z = true;
        sb.append((ciVar.f104380a & 8) != 0);
        sb.append("\n\tExternalHotwordEvent.SpeakerIdInfo=");
        C67050je jeVar = ciVar.f104384e;
        if (jeVar == null) {
            jeVar = C67050je.f182262f;
        }
        if ((jeVar.f182264a & 4) == 0) {
            z = false;
        }
        sb.append(z);
        sb.append("\n\tExternalHotwordEvent.SpeakerIdInfo.IsSpeakerDetected=");
        C67050je jeVar2 = ciVar.f104384e;
        if (jeVar2 == null) {
            jeVar2 = C67050je.f182262f;
        }
        C67091ks ksVar = jeVar2.f182267d;
        if (ksVar == null) {
            ksVar = C67091ks.f182386h;
        }
        sb.append(ksVar.f182389b);
        aVar.mo41755b("SodaAsrStartRequest", sb.toString());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
