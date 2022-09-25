package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.aps;
import com.google.assistant.p3897e.p3921j.apu;
import com.google.common.base.C58852bp;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.m */
/* compiled from: PG */
final class C129491m implements C58852bp {

    /* renamed from: a */
    final /* synthetic */ C129484h f355526a;

    public C129491m(C129484h hVar) {
        this.f355526a = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo40846a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            aps aps = (aps) apu.f135583d.createBuilder();
            aps.copyOnWrite();
            apu apu = (apu) aps.instance;
            apu.f135586b = 6;
            apu.f135585a |= 1;
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_input.WarmerWelcomeInput";
            C63088z byteString = ((apu) aps.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar = (C51805du) dsVar.instance;
            duVar.f135926a |= 1;
            duVar.f135927b = "warmer_welcome.TRIGGER";
            dsVar.mo53729a("warmer_welcome_input", (C52230ka) jzVar.build());
            C129484h hVar = this.f355526a;
            hVar.f355505m.mo50445g(C46438d.m82810b(hVar.f355503k.mo107931g(C127407d.m208361a(C127454b.CLIENT_INPUT, (C51805du) dsVar.build()))), new C46436b("startInteraction"), this.f355526a.f355515w);
        }
    }
}
