package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130055a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130092b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130288h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130303a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.ai */
/* compiled from: PG */
final class C130159ai implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C130158ah f356890a;

    public C130159ai(C130158ah ahVar) {
        this.f356890a = ahVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C130158ah ahVar = this.f356890a;
        C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
        C129662i iVar = C129662i.RESPONSE;
        gVar.copyOnWrite();
        C129676j jVar = (C129676j) gVar.instance;
        jVar.f355893b = iVar.f355866l;
        jVar.f355892a |= 1;
        C129676j jVar2 = (C129676j) gVar.build();
        Fragment b = ahVar.f356866c.getChildFragmentManager().f634a.mo670b(R.id.assistant_response_layer_transcription_container);
        String str = ((C130303a) bVar).f357175a;
        if ((b instanceof C130288h) && str.isEmpty()) {
            str = ((C130288h) b).mo17754z().mo109628b().toString();
        }
        C129660g gVar2 = (C129660g) C129676j.f355890c.createBuilder();
        C129662i iVar2 = C129662i.KEYBOARD_INPUT;
        gVar2.copyOnWrite();
        C129676j jVar3 = (C129676j) gVar2.instance;
        jVar3.f355893b = iVar2.f355866l;
        jVar3.f355892a |= 1;
        C62940bt btVar = C130092b.f356721e;
        C130055a aVar = (C130055a) C130092b.f356720d.createBuilder();
        aVar.copyOnWrite();
        C130092b bVar2 = (C130092b) aVar.instance;
        str.getClass();
        bVar2.f356723a |= 1;
        bVar2.f356724b = str;
        aVar.copyOnWrite();
        C130092b bVar3 = (C130092b) aVar.instance;
        jVar2.getClass();
        bVar3.f356725c = jVar2;
        bVar3.f356723a |= 2;
        gVar2.mo58885m(btVar, (C130092b) aVar.build());
        ahVar.f356887x.mo108978a((C129676j) gVar2.build());
        return C47392e.f123115a;
    }
}
