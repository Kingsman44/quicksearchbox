package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9774k.p9777b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128055ad;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128056ae;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128116q;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128120u;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128124y;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128840o;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128846c;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9759d.p9760a.C128848e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.k.b.d */
/* compiled from: PG */
final class C128940d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C128840o f354310a;

    /* renamed from: b */
    final /* synthetic */ C128943g f354311b;

    /* renamed from: c */
    final /* synthetic */ TextView f354312c;

    public C128940d(C128840o oVar, C128943g gVar, TextView textView) {
        this.f354310a = oVar;
        this.f354311b = gVar;
        this.f354312c = textView;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        C128116q qVar;
        Integer b = C128939c.m210470b(this.f354310a);
        if (b != null) {
            C128943g gVar = this.f354311b;
            TextView textView = this.f354312c;
            b.intValue();
            gVar.f354319f.mo108811c(textView);
        }
        C128943g gVar2 = this.f354311b;
        C46439e eVar = gVar2.f354318e;
        C128848e eVar2 = gVar2.f354322i;
        Context requireContext = gVar2.f354315b.requireContext();
        C128840o oVar = this.f354310a;
        C128840o oVar2 = C128840o.UNKNOWN;
        if (oVar.ordinal() == 2) {
            C47810es.m84979s(requireContext, new Intent().setClassName(requireContext, "com.google.android.apps.gsa.staticplugins.nga.ui.account.PrimaryAccountFixActivity").addFlags(32768).addFlags(268435456));
            cxVar = eVar2.mo108699a();
        } else if (eVar2.f354150b.isEmpty()) {
            ((C59052c) ((C59052c) C128848e.f354149a.mo56226d()).mo56372aa(38040)).mo56386p("Missing VoicePlateClassicServiceFutureStub");
            cxVar = C60856cj.m92898g();
        } else {
            C128120u uVar = (C128120u) eVar2.f354150b.get();
            C128124y yVar = (C128124y) C128071at.f352396c.createBuilder();
            C128055ad adVar = (C128055ad) C128056ae.f352361c.createBuilder();
            if (oVar.ordinal() != 1) {
                qVar = C128116q.ONBOARDING_TYPE_UNKNOWN;
            } else {
                qVar = C128116q.ONBOARDING_TYPE_OOBE;
            }
            adVar.copyOnWrite();
            C128056ae aeVar = (C128056ae) adVar.instance;
            aeVar.f352364b = qVar.f352498c;
            aeVar.f352363a |= 1;
            yVar.copyOnWrite();
            C128071at atVar = (C128071at) yVar.instance;
            C128056ae aeVar2 = (C128056ae) adVar.build();
            aeVar2.getClass();
            atVar.f352399b = aeVar2;
            atVar.f352398a = 5;
            cxVar = C60922j.m93044g(uVar.mo108342c((C128071at) yVar.build()), C47810es.m84963c(C128846c.f354147a), C60826bg.f164896a);
        }
        eVar.mo50428h(C46438d.m82810b(cxVar).f121541a, (Object) null, this.f354311b.f354320g);
    }
}
