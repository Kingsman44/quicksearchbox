package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.p4526f.C59052c;
import com.google.p427am.p432b.p433a.C8622aa;
import com.google.p427am.p432b.p433a.C8624ac;
import com.google.p427am.p432b.p433a.C8632ak;
import com.google.p427am.p432b.p433a.C8633al;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ch */
/* compiled from: PG */
public final /* synthetic */ class C132219ch implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C132220ci f360886a;

    /* renamed from: b */
    public final /* synthetic */ C132300ev f360887b;

    public /* synthetic */ C132219ch(C132220ci ciVar, C132300ev evVar) {
        this.f360886a = ciVar;
        this.f360887b = evVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C132220ci ciVar = this.f360886a;
        C132300ev evVar = this.f360887b;
        if (z) {
            evVar.mo110599a(compoundButton);
            ciVar.mo110548a();
            String string = ciVar.f360890c.getString("entry_point_id");
            String string2 = ciVar.f360890c.getString("supervised_oid");
            if (string2 == null || string == null) {
                ((C59052c) ((C59052c) C132220ci.f360888a.mo56225c()).mo56372aa(39559)).mo56386p("Not provided with required argument!");
                ciVar.mo110549b();
                return;
            }
            View requireView = ciVar.f360889b.requireView();
            CompoundButton compoundButton2 = (CompoundButton) requireView.findViewById(R.id.assistant_custodio_podcast_blocked_radio_button);
            C8622aa aaVar = (C8622aa) C8624ac.f29887b.createBuilder();
            if (((CompoundButton) requireView.findViewById(R.id.assistant_custodio_podcast_allowed_radio_button)).isChecked()) {
                aaVar.copyOnWrite();
                ((C8624ac) aaVar.instance).f29889a = 1;
            } else if (compoundButton2.isChecked()) {
                aaVar.copyOnWrite();
                ((C8624ac) aaVar.instance).f29889a = 2;
            }
            C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
            akVar.copyOnWrite();
            C8624ac acVar = (C8624ac) aaVar.build();
            acVar.getClass();
            ((C8633al) akVar.instance).f29909g = acVar;
            C46439e eVar = ciVar.f360894g;
            C46438d b = C46438d.m82810b(ciVar.f360892e.mo110504d(string, string2, (C8633al) akVar.build()));
            eVar.mo50428h(b.f121541a, (Object) null, ciVar.f360895h);
        }
    }
}
