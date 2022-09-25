package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137308f;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10403c.C137353a;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10403c.C137354b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.ar */
/* compiled from: PG */
final class C137334ar implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137332aq f373569a;

    public C137334ar(C137332aq aqVar) {
        this.f373569a = aqVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C137308f fVar = (C137308f) bVar;
        C137332aq aqVar = this.f373569a;
        if (aqVar.mo113656a() == null) {
            C137353a aVar = (C137353a) C137354b.f373619c.createBuilder();
            C57665z zVar = C57665z.WEB_PAGE;
            aVar.copyOnWrite();
            ((C137354b) aVar.instance).f373621a = zVar.getNumber();
            C57648i iVar = aqVar.f373566i.f373512f;
            if (iVar != null) {
                aVar.copyOnWrite();
                ((C137354b) aVar.instance).f373622b = iVar;
            }
            C137370s a = C137370s.m223196a(aqVar.f373559b, (C137354b) aVar.build());
            C0154a aVar2 = new C0154a(aqVar.f373560c.getChildFragmentManager());
            aVar2.mo691x(R.anim.googleapp_save_feature_fade_in, R.anim.googleapp_save_feature_fade_out, R.anim.googleapp_save_feature_fade_in, R.anim.googleapp_save_feature_fade_out);
            aVar2.mo511h(R.id.googleapp_list_picker_fragment_container, a, "saveListPicker", 1);
            aVar2.mo509f();
        }
        return C47392e.f123115a;
    }
}
