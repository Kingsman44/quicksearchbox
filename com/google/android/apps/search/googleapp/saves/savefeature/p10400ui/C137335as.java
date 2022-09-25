package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.support.p031v4.app.C0154a;
import android.view.View;
import com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a.C137311i;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.as */
/* compiled from: PG */
final class C137335as implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137332aq f373570a;

    public C137335as(C137332aq aqVar) {
        this.f373570a = aqVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C137311i iVar = (C137311i) bVar;
        C137332aq aqVar = this.f373570a;
        C137370s a = aqVar.mo113656a();
        if (a != null) {
            C0154a aVar = new C0154a(aqVar.f373560c.getChildFragmentManager());
            aVar.mo691x(R.anim.googleapp_save_feature_fade_in, R.anim.googleapp_save_feature_fade_out, R.anim.googleapp_save_feature_fade_in, R.anim.googleapp_save_feature_fade_out);
            aVar.mo516m(a);
            aVar.mo509f();
        }
        C57578av avVar = iVar.mo113629a().f373396a;
        if (avVar == null) {
            avVar = C57578av.f153822h;
        }
        aqVar.f373564g.mo50381d(C62912at.f169862a, avVar);
        View view = aqVar.f373560c.getView();
        view.getClass();
        C137332aq.m223126c(view, avVar);
        return C47392e.f123115a;
    }
}
