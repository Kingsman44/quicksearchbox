package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3591b.C45713d;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3593d.C45736ad;
import com.google.apps.p3589d.p3593d.C45737ae;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.h.z */
/* compiled from: PG */
public final /* synthetic */ class C45900z implements C45713d {

    /* renamed from: a */
    public final /* synthetic */ C45737ae f120662a;

    /* renamed from: b */
    public final /* synthetic */ C45719j f120663b;

    /* renamed from: c */
    public final /* synthetic */ C45819v f120664c;

    public /* synthetic */ C45900z(C45737ae aeVar, C45719j jVar, C45819v vVar) {
        this.f120662a = aeVar;
        this.f120663b = jVar;
        this.f120664c = vVar;
    }

    /* renamed from: a */
    public final Object mo49809a(Object obj) {
        double d;
        double d2;
        C45737ae aeVar = this.f120662a;
        C45719j jVar = this.f120663b;
        C45819v vVar = this.f120664c;
        C45719j jVar2 = (C45719j) obj;
        int i = C45860aa.f120564a;
        C45723n nVar = new C45723n(jVar2.f120220a.size());
        int i2 = 0;
        double d3 = C59203do.f157270a;
        while (i2 < jVar2.f120220a.size()) {
            C45882h hVar = (C45882h) jVar2.mo49815d(i2);
            double doubleValue = ((Double) jVar.mo49815d(i2)).doubleValue();
            C45736ad adVar = C45736ad.LEFT;
            int ordinal = ((C45736ad) aeVar.f120248i.mo49815d(i2)).ordinal();
            if (ordinal == 1) {
                C45946k r = hVar.mo50007r();
                d2 = (doubleValue - (r.mo50047a() - r.mo50049c())) / 2.0d;
            } else if (ordinal != 2) {
                d = d3;
                d3 += doubleValue + ((aeVar.f120246a.f120258h / 18.0d) * vVar.f120480a);
                nVar.f120220a.add(new C45868ai(hVar, new C45937b(d, C59203do.f157270a)));
                i2++;
                aeVar = aeVar;
            } else {
                C45946k r2 = hVar.mo50007r();
                d2 = doubleValue - (r2.mo50047a() - r2.mo50049c());
            }
            d = d2 + d3;
            d3 += doubleValue + ((aeVar.f120246a.f120258h / 18.0d) * vVar.f120480a);
            nVar.f120220a.add(new C45868ai(hVar, new C45937b(d, C59203do.f157270a)));
            i2++;
            aeVar = aeVar;
        }
        return C45894t.m81940x((C45763v) null, nVar.mo49829f(), vVar);
    }
}
