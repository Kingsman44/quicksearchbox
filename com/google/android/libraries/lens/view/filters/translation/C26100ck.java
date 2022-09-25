package com.google.android.libraries.lens.view.filters.translation;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.ck */
/* compiled from: PG */
public final /* synthetic */ class C26100ck implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26077bo f70912a;

    public /* synthetic */ C26100ck(C26077bo boVar) {
        this.f70912a = boVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26077bo boVar = this.f70912a;
        C26061az azVar = (C26061az) C26063ba.f70840l.createBuilder();
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70844c = R.drawable.quantum_gm_ic_info_vd_theme_24;
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70845d = true;
        String string = boVar.f70883d.getString(R.string.lens_translate_not_enough_space_title);
        azVar.copyOnWrite();
        string.getClass();
        ((C26063ba) azVar.instance).f70846e = string;
        String a = boVar.mo31277a((C26127j) obj);
        azVar.copyOnWrite();
        a.getClass();
        ((C26063ba) azVar.instance).f70847f = a;
        String string2 = boVar.f70883d.getString(R.string.lens_translate_not_enough_space_message);
        azVar.copyOnWrite();
        string2.getClass();
        ((C26063ba) azVar.instance).f70849h = string2;
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70851j = 118701;
        C26125h hVar = (C26125h) C26126i.f70993c.createBuilder();
        String string3 = boVar.f70883d.getString(R.string.lens_translate_not_enough_space_positive_button);
        hVar.copyOnWrite();
        string3.getClass();
        ((C26126i) hVar.instance).f70995a = string3;
        hVar.copyOnWrite();
        ((C26126i) hVar.instance).f70996b = 118703;
        azVar.copyOnWrite();
        C26126i iVar = (C26126i) hVar.build();
        iVar.getClass();
        ((C26063ba) azVar.instance).f70842a = iVar;
        C26125h hVar2 = (C26125h) C26126i.f70993c.createBuilder();
        String string4 = boVar.f70883d.getString(17039360);
        hVar2.copyOnWrite();
        string4.getClass();
        ((C26126i) hVar2.instance).f70995a = string4;
        hVar2.copyOnWrite();
        ((C26126i) hVar2.instance).f70996b = 118702;
        azVar.copyOnWrite();
        C26126i iVar2 = (C26126i) hVar2.build();
        iVar2.getClass();
        ((C26063ba) azVar.instance).f70843b = iVar2;
        boVar.mo31278b((C26063ba) azVar.build(), new C26075bm(boVar), C26072bj.f70873a);
    }
}
