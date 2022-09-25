package com.google.android.libraries.lens.view.filters.translation;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.cm */
/* compiled from: PG */
public final /* synthetic */ class C26102cm implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26077bo f70914a;

    public /* synthetic */ C26102cm(C26077bo boVar) {
        this.f70914a = boVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26077bo boVar = this.f70914a;
        Locale locale = (Locale) obj;
        C26061az azVar = (C26061az) C26063ba.f70840l.createBuilder();
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70844c = R.drawable.quantum_gm_ic_downloading_vd_theme_24;
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70845d = true;
        String string = boVar.f70883d.getString(R.string.lens_translate_continue_downloading_dialog_title, new Object[]{boVar.f70882c.mo31434d(locale)});
        azVar.copyOnWrite();
        string.getClass();
        ((C26063ba) azVar.instance).f70846e = string;
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70851j = 118624;
        C26125h hVar = (C26125h) C26126i.f70993c.createBuilder();
        String string2 = boVar.f70883d.getString(R.string.lens_translate_continue_downloading_button_continue);
        hVar.copyOnWrite();
        string2.getClass();
        ((C26126i) hVar.instance).f70995a = string2;
        hVar.copyOnWrite();
        ((C26126i) hVar.instance).f70996b = 118626;
        azVar.copyOnWrite();
        C26126i iVar = (C26126i) hVar.build();
        iVar.getClass();
        ((C26063ba) azVar.instance).f70842a = iVar;
        C26125h hVar2 = (C26125h) C26126i.f70993c.createBuilder();
        String string3 = boVar.f70883d.getString(R.string.lens_translate_continue_downloading_button_cancel);
        hVar2.copyOnWrite();
        string3.getClass();
        ((C26126i) hVar2.instance).f70995a = string3;
        hVar2.copyOnWrite();
        ((C26126i) hVar2.instance).f70996b = 118625;
        azVar.copyOnWrite();
        C26126i iVar2 = (C26126i) hVar2.build();
        iVar2.getClass();
        ((C26063ba) azVar.instance).f70843b = iVar2;
        boVar.mo31278b((C26063ba) azVar.build(), C26073bk.f70874a, new C26074bl(boVar, locale));
    }
}
