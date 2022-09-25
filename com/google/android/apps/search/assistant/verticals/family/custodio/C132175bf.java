package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.p4479cg.C58080l;
import com.google.p4479cg.C58081m;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bf */
/* compiled from: PG */
public final /* synthetic */ class C132175bf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132181bl f360766a;

    public /* synthetic */ C132175bf(C132181bl blVar) {
        this.f360766a = blVar;
    }

    public final void onClick(View view) {
        boolean z;
        C132181bl blVar = this.f360766a;
        String string = blVar.f360781c.getString("entry_point_id");
        String string2 = blVar.f360781c.getString("supervised_oid");
        C8675e eVar = ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar.f360789k)).f360535a;
        C8633al alVar = eVar.f29993b;
        if (alVar == null) {
            alVar = C8633al.f29901j;
        }
        C8687q qVar = alVar.f29911i;
        if (qVar == null) {
            qVar = C8687q.f30013c;
        }
        int i = 0;
        if (qVar.f30015a.size() > 0) {
            C8633al alVar2 = eVar.f29993b;
            if (alVar2 == null) {
                alVar2 = C8633al.f29901j;
            }
            C8687q qVar2 = alVar2.f29911i;
            if (qVar2 == null) {
                qVar2 = C8687q.f30013c;
            }
            z = ((C8685o) qVar2.f30015a.get(0)).f30012b;
        } else {
            z = blVar.f360781c.getBoolean("custom_downtime_dayoption", false);
        }
        C8633al alVar3 = eVar.f29993b;
        if (alVar3 == null) {
            alVar3 = C8633al.f29901j;
        }
        C8687q qVar3 = alVar3.f29911i;
        if (qVar3 == null) {
            qVar3 = C8687q.f30013c;
        }
        boolean z2 = true;
        if (qVar3.f30015a.size() != 0) {
            C8633al alVar4 = eVar.f29993b;
            if (alVar4 == null) {
                alVar4 = C8633al.f29901j;
            }
            C8687q qVar4 = alVar4.f29911i;
            if (qVar4 == null) {
                qVar4 = C8687q.f30013c;
            }
            if (!qVar4.f30016b) {
                z2 = false;
            }
        }
        if (string2 == null || string == null) {
            throw new IllegalStateException("Not provided with required argument!");
        }
        C8632ak akVar = (C8632ak) C8633al.f29901j.createBuilder();
        C8686p pVar = (C8686p) C8687q.f30013c.createBuilder();
        pVar.copyOnWrite();
        ((C8687q) pVar.instance).f30016b = z2;
        C8684n nVar = (C8684n) C8685o.f30009c.createBuilder();
        C58080l lVar = ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar.f360789k)).f360537c;
        C58080l lVar2 = ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar.f360789k)).f360538d;
        ArrayList<Integer> integerArrayList = blVar.f360781c.getIntegerArrayList("downtime_days");
        ArrayList arrayList = new ArrayList();
        if (integerArrayList == null || integerArrayList.isEmpty()) {
            C8633al alVar5 = eVar.f29993b;
            if (alVar5 == null) {
                alVar5 = C8633al.f29901j;
            }
            C8687q qVar5 = alVar5.f29911i;
            if (qVar5 == null) {
                qVar5 = C8687q.f30013c;
            }
            if (qVar5.f30015a.size() > 0) {
                C8633al alVar6 = eVar.f29993b;
                if (alVar6 == null) {
                    alVar6 = C8633al.f29901j;
                }
                C8687q qVar6 = alVar6.f29911i;
                if (qVar6 == null) {
                    qVar6 = C8687q.f30013c;
                }
                for (C8664bp bpVar : ((C8685o) qVar6.f30015a.get(0)).f30011a) {
                    C58077i a = C58077i.m88832a(bpVar.f29973a);
                    if (a == null) {
                        a = C58077i.UNRECOGNIZED;
                    }
                    arrayList.add(a);
                }
            }
        } else {
            int size = integerArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(C58077i.m88832a(integerArrayList.get(i2).intValue()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i < size2) {
            C8663bo boVar = (C8663bo) C8664bp.f29971d.createBuilder();
            boVar.copyOnWrite();
            ((C8664bp) boVar.instance).f29973a = ((C58077i) arrayList.get(i)).getNumber();
            C58080l lVar3 = (C58080l) C58081m.f155254e.createBuilder();
            int i3 = ((C58081m) lVar.instance).f155256a;
            lVar3.copyOnWrite();
            int i4 = size2;
            ((C58081m) lVar3.instance).f155256a = i3;
            int i5 = ((C58081m) lVar.instance).f155257b;
            lVar3.copyOnWrite();
            ((C58081m) lVar3.instance).f155257b = i5;
            int i6 = ((C58081m) lVar.instance).f155258c;
            lVar3.copyOnWrite();
            ((C58081m) lVar3.instance).f155258c = i6;
            int i7 = ((C58081m) lVar.instance).f155259d;
            lVar3.copyOnWrite();
            ((C58081m) lVar3.instance).f155259d = i7;
            boVar.copyOnWrite();
            C58081m mVar = (C58081m) lVar3.build();
            mVar.getClass();
            ((C8664bp) boVar.instance).f29974b = mVar;
            C58080l lVar4 = (C58080l) C58081m.f155254e.createBuilder();
            int i8 = ((C58081m) lVar2.instance).f155256a;
            lVar4.copyOnWrite();
            ((C58081m) lVar4.instance).f155256a = i8;
            int i9 = ((C58081m) lVar2.instance).f155257b;
            lVar4.copyOnWrite();
            ((C58081m) lVar4.instance).f155257b = i9;
            int i10 = ((C58081m) lVar2.instance).f155258c;
            lVar4.copyOnWrite();
            ((C58081m) lVar4.instance).f155258c = i10;
            int i11 = ((C58081m) lVar2.instance).f155259d;
            lVar4.copyOnWrite();
            ((C58081m) lVar4.instance).f155259d = i11;
            boVar.copyOnWrite();
            C58081m mVar2 = (C58081m) lVar4.build();
            mVar2.getClass();
            ((C8664bp) boVar.instance).f29975c = mVar2;
            arrayList2.add((C8664bp) boVar.build());
            i++;
            size2 = i4;
        }
        nVar.mo17211a(arrayList2);
        nVar.copyOnWrite();
        ((C8685o) nVar.instance).f30012b = z;
        pVar.mo17212a(nVar);
        C8687q qVar7 = (C8687q) pVar.build();
        akVar.copyOnWrite();
        qVar7.getClass();
        ((C8633al) akVar.instance).f29911i = qVar7;
        C46439e eVar2 = blVar.f360784f;
        C46438d b = C46438d.m82810b(blVar.f360785g.mo110504d(string, string2, (C8633al) akVar.build()));
        eVar2.mo50428h(b.f121541a, (Object) null, blVar.f360786h);
    }
}
