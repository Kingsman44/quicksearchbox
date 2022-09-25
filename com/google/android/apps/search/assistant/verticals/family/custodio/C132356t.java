package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.RadioGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.common.p4526f.C59052c;
import com.google.p427am.p432b.p433a.C8629ah;
import com.google.p427am.p432b.p433a.C8631aj;
import com.google.p427am.p432b.p433a.C8632ak;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8634am;
import com.google.p427am.p432b.p433a.C8636ao;
import com.google.p427am.p432b.p433a.C8643av;
import com.google.p427am.p432b.p433a.C8645ax;
import com.google.p427am.p432b.p433a.C8681k;
import com.google.p427am.p432b.p433a.C8683m;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.t */
/* compiled from: PG */
public final /* synthetic */ class C132356t implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C132358v f361290a;

    public /* synthetic */ C132356t(C132358v vVar) {
        this.f361290a = vVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C132358v vVar = this.f361290a;
        String string = vVar.f361296c.getString("entry_point_id");
        String string2 = vVar.f361296c.getString("supervised_oid");
        if (string2 == null || string == null) {
            ((C59052c) ((C59052c) C132358v.f361294a.mo56225c()).mo56372aa(39514)).mo56386p("Not provided with required argument!");
            vVar.mo110666b();
            return;
        }
        View requireView = vVar.f361295b.requireView();
        int i2 = 3;
        int i3 = true != C132358v.m215119d(requireView, R.id.assistant_custodio_assistant_features_settings_fragment_calling_section) ? 4 : 3;
        int i4 = true != C132358v.m215119d(requireView, R.id.assistant_custodio_assistant_features_settings_fragment_answers_section) ? 4 : 3;
        int i5 = true != C132358v.m215119d(requireView, R.id.assistant_custodio_assistant_features_settings_fragment_actions_section) ? 5 : 4;
        if (true != C132358v.m215119d(requireView, R.id.assistant_custodio_assistant_features_settings_fragment_websites_section)) {
            i2 = 4;
        }
        C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
        C8681k kVar = (C8681k) C8683m.f30006b.createBuilder();
        kVar.copyOnWrite();
        ((C8683m) kVar.instance).f30008a = i3 - 2;
        C8683m mVar = (C8683m) kVar.build();
        akVar.copyOnWrite();
        mVar.getClass();
        ((C8633al) akVar.instance).f29905c = mVar;
        C8629ah ahVar = (C8629ah) C8631aj.f29898b.createBuilder();
        ahVar.copyOnWrite();
        ((C8631aj) ahVar.instance).f29900a = i4 - 2;
        C8631aj ajVar = (C8631aj) ahVar.build();
        akVar.copyOnWrite();
        ajVar.getClass();
        ((C8633al) akVar.instance).f29906d = ajVar;
        C8634am amVar = (C8634am) C8636ao.f29912b.createBuilder();
        amVar.copyOnWrite();
        ((C8636ao) amVar.instance).f29914a = i5 - 2;
        C8636ao aoVar = (C8636ao) amVar.build();
        akVar.copyOnWrite();
        aoVar.getClass();
        ((C8633al) akVar.instance).f29907e = aoVar;
        if (vVar.f361304k) {
            C8643av avVar = (C8643av) C8645ax.f29929b.createBuilder();
            avVar.copyOnWrite();
            ((C8645ax) avVar.instance).f29931a = i2 - 2;
            C8645ax axVar = (C8645ax) avVar.build();
            akVar.copyOnWrite();
            axVar.getClass();
            ((C8633al) akVar.instance).f29910h = axVar;
        }
        vVar.f361300g.mo50428h(C46438d.m82810b(vVar.f361298e.mo110504d(string, string2, (C8633al) akVar.build())).f121541a, (Object) null, vVar.f361301h);
    }
}
