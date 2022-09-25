package com.google.android.libraries.lens.view.filters.translation;

import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.cj */
/* compiled from: PG */
public final /* synthetic */ class C26099cj implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26077bo f70911a;

    public /* synthetic */ C26099cj(C26077bo boVar) {
        this.f70911a = boVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26077bo boVar = this.f70911a;
        C26127j jVar = (C26127j) obj;
        Locale b = jVar.mo31234b().mo33432b();
        String d = boVar.f70882c.mo31434d(b);
        C26061az azVar = (C26061az) C26063ba.f70840l.createBuilder();
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70844c = R.drawable.quantum_gm_ic_download_white_24;
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70845d = true;
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70850i = true;
        String string = boVar.f70883d.getString(R.string.lens_translate_download_confirm_title, new Object[]{d});
        azVar.copyOnWrite();
        string.getClass();
        ((C26063ba) azVar.instance).f70846e = string;
        String a = boVar.mo31277a(jVar);
        azVar.copyOnWrite();
        a.getClass();
        ((C26063ba) azVar.instance).f70847f = a;
        azVar.copyOnWrite();
        ((C26063ba) azVar.instance).f70851j = 110051;
        C26125h hVar = (C26125h) C26126i.f70993c.createBuilder();
        String string2 = boVar.f70883d.getString(R.string.lens_translate_download_language_pack_yes);
        hVar.copyOnWrite();
        string2.getClass();
        ((C26126i) hVar.instance).f70995a = string2;
        hVar.copyOnWrite();
        ((C26126i) hVar.instance).f70996b = 110053;
        azVar.copyOnWrite();
        C26126i iVar = (C26126i) hVar.build();
        iVar.getClass();
        ((C26063ba) azVar.instance).f70842a = iVar;
        C26125h hVar2 = (C26125h) C26126i.f70993c.createBuilder();
        String string3 = boVar.f70883d.getString(17039360);
        hVar2.copyOnWrite();
        string3.getClass();
        ((C26126i) hVar2.instance).f70995a = string3;
        hVar2.copyOnWrite();
        ((C26126i) hVar2.instance).f70996b = 110052;
        azVar.copyOnWrite();
        C26126i iVar2 = (C26126i) hVar2.build();
        iVar2.getClass();
        ((C26063ba) azVar.instance).f70843b = iVar2;
        boVar.mo31278b((C26063ba) azVar.build(), new C26071bi(boVar, b), C26072bj.f70873a);
    }
}
