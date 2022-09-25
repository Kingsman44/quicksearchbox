package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.p427am.p432b.p433a.C8632ak;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8663bo;
import com.google.p427am.p432b.p433a.C8664bp;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8684n;
import com.google.p427am.p432b.p433a.C8685o;
import com.google.p427am.p432b.p433a.C8686p;
import com.google.p427am.p432b.p433a.C8687q;
import com.google.p4479cg.C58077i;
import com.google.p4479cg.C58081m;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.al */
/* compiled from: PG */
public final /* synthetic */ class C132121al implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132123an f360642a;

    /* renamed from: b */
    public final /* synthetic */ C8675e f360643b;

    public /* synthetic */ C132121al(C132123an anVar, C8675e eVar) {
        this.f360642a = anVar;
        this.f360643b = eVar;
    }

    public final void onClick(View view) {
        C132123an anVar = this.f360642a;
        C8675e eVar = this.f360643b;
        anVar.mo110489g();
        String string = anVar.f360647c.getString("entry_point_id");
        String string2 = anVar.f360647c.getString("supervised_oid");
        boolean z = ((CustodioDowntimeDayPickerViewModel) Objects.requireNonNull(anVar.f360655k)).f360521a == R.id.assistant_custodio_downtime_day_picker_fragment_customize_radio;
        if (string2 == null || string == null) {
            throw new IllegalStateException("Not provided with required argument!");
        }
        C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
        C8686p pVar = (C8686p) C8687q.f30013c.createBuilder();
        C8633al alVar = eVar.f29993b;
        if (alVar == null) {
            alVar = C8633al.f29901j;
        }
        C8687q qVar = alVar.f29911i;
        if (qVar == null) {
            qVar = C8687q.f30013c;
        }
        boolean z2 = qVar.f30016b;
        pVar.copyOnWrite();
        ((C8687q) pVar.instance).f30016b = z2;
        C8684n nVar = (C8684n) C8685o.f30009c.createBuilder();
        C8633al alVar2 = eVar.f29993b;
        if (alVar2 == null) {
            alVar2 = C8633al.f29901j;
        }
        C8687q qVar2 = alVar2.f29911i;
        if (qVar2 == null) {
            qVar2 = C8687q.f30013c;
        }
        C58081m mVar = ((C8664bp) ((C8685o) qVar2.f30015a.get(0)).f30011a.get(0)).f29974b;
        if (mVar == null) {
            mVar = C58081m.f155254e;
        }
        C8633al alVar3 = eVar.f29993b;
        if (alVar3 == null) {
            alVar3 = C8633al.f29901j;
        }
        C8687q qVar3 = alVar3.f29911i;
        if (qVar3 == null) {
            qVar3 = C8687q.f30013c;
        }
        C58081m mVar2 = ((C8664bp) ((C8685o) qVar3.f30015a.get(0)).f30011a.get(0)).f29975c;
        if (mVar2 == null) {
            mVar2 = C58081m.f155254e;
        }
        ArrayList arrayList = new ArrayList();
        for (C58077i number : anVar.mo110484a()) {
            C8663bo boVar = (C8663bo) C8664bp.f29971d.createBuilder();
            boVar.copyOnWrite();
            ((C8664bp) boVar.instance).f29973a = number.getNumber();
            boVar.copyOnWrite();
            mVar.getClass();
            ((C8664bp) boVar.instance).f29974b = mVar;
            boVar.copyOnWrite();
            mVar2.getClass();
            ((C8664bp) boVar.instance).f29975c = mVar2;
            arrayList.add((C8664bp) boVar.build());
        }
        nVar.mo17211a(arrayList);
        nVar.copyOnWrite();
        ((C8685o) nVar.instance).f30012b = z;
        pVar.mo17212a(nVar);
        C8687q qVar4 = (C8687q) pVar.build();
        akVar.copyOnWrite();
        qVar4.getClass();
        ((C8633al) akVar.instance).f29911i = qVar4;
        anVar.f360650f.mo50428h(C46438d.m82810b(anVar.f360651g.mo110504d(string, string2, (C8633al) akVar.build())).f121541a, (Object) null, anVar.f360652h);
    }
}
