package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9871b.C130177c;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.v */
/* compiled from: PG */
final class C129334v implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C129331t f355221a;

    public C129334v(C129331t tVar) {
        this.f355221a = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C129331t tVar = this.f355221a;
        C46439e eVar = tVar.f355210i;
        C127118j jVar = tVar.f355212k;
        C127454b bVar2 = C127454b.CORRECTION_CHIP;
        amm amm = (amm) C51682amp.f135384d.createBuilder();
        String str = ((C130177c.C130179b) bVar).f356928a;
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        str.getClass();
        amp.f135386a |= 1;
        amp.f135387b = str;
        amo amo = amo.TRUSTED;
        amm.copyOnWrite();
        C51682amp amp2 = (C51682amp) amm.instance;
        amp2.f135388c = amo.f135383d;
        amp2.f135386a |= 2;
        eVar.mo50428h(C46438d.m82810b(jVar.mo107931g(C127407d.m208363c(bVar2, (C51682amp) amm.build()))).f121541a, (Object) null, tVar.f355216o);
        return C47392e.f123115a;
    }
}
