package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.p4526f.C59052c;
import com.google.p427am.p432b.p433a.C8632ak;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8694x;
import com.google.p427am.p432b.p433a.C8696z;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cg */
/* compiled from: PG */
public final /* synthetic */ class C132218cg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C132220ci f360884a;

    /* renamed from: b */
    public final /* synthetic */ C132300ev f360885b;

    public /* synthetic */ C132218cg(C132220ci ciVar, C132300ev evVar) {
        this.f360884a = ciVar;
        this.f360885b = evVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C132220ci ciVar = this.f360884a;
        C132300ev evVar = this.f360885b;
        if (z) {
            evVar.mo110599a(compoundButton);
            ciVar.mo110548a();
            String string = ciVar.f360890c.getString("entry_point_id");
            String string2 = ciVar.f360890c.getString("supervised_oid");
            if (string2 == null || string == null) {
                ((C59052c) ((C59052c) C132220ci.f360888a.mo56225c()).mo56372aa(39558)).mo56386p("Not provided with required argument!");
                ciVar.mo110549b();
                return;
            }
            View requireView = ciVar.f360889b.requireView();
            CompoundButton compoundButton2 = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_news_blocked_radio_button);
            C8694x xVar = (C8694x) C8696z.f30032b.createBuilder();
            if (((CompoundButton) requireView.findViewById(R.id.assistant_custodio_news_allowed_radio_button)).isChecked()) {
                xVar.copyOnWrite();
                ((C8696z) xVar.instance).f30034a = 1;
            } else if (compoundButton2.isChecked()) {
                xVar.copyOnWrite();
                ((C8696z) xVar.instance).f30034a = 2;
            }
            C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
            akVar.copyOnWrite();
            C8696z zVar = (C8696z) xVar.build();
            zVar.getClass();
            ((C8633al) akVar.instance).f29908f = zVar;
            C46439e eVar = ciVar.f360894g;
            C46438d b = C46438d.m82810b(ciVar.f360892e.mo110504d(string, string2, (C8633al) akVar.build()));
            eVar.mo50428h(b.f121541a, (Object) null, ciVar.f360895h);
        }
    }
}
