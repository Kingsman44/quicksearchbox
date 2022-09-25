package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.engine.recognition.C77552ae;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80476a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80479d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80480e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80482g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80483h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.v */
/* compiled from: PG */
public final /* synthetic */ class C79874v implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ Optional f218941a;

    /* renamed from: b */
    public final /* synthetic */ C77557aj f218942b;

    public /* synthetic */ C79874v(Optional optional, C77557aj ajVar) {
        this.f218941a = optional;
        this.f218942b = ajVar;
    }

    public final Object get() {
        Optional optional = this.f218941a;
        C77557aj ajVar = this.f218942b;
        C79877y yVar = C79878z.f218943a;
        C80476a aVar = (C80476a) C80484i.f220937h.createBuilder();
        Objects.requireNonNull(aVar);
        optional.ifPresent(new C79867o(aVar));
        String x = ajVar.mo72660x();
        aVar.copyOnWrite();
        x.getClass();
        ((C80484i) aVar.instance).f220939a = x;
        C80479d a = C79878z.f218944b.apply(ajVar.mo72641d());
        aVar.copyOnWrite();
        ((C80484i) aVar.instance).f220942d = a.getNumber();
        C58480gp e = C58485gu.m89837e();
        C58485gu f = ajVar.mo72643f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            C77552ae aeVar = (C77552ae) f.get(i);
            C80480e eVar = (C80480e) C80483h.f220932d.createBuilder();
            String h = aeVar.mo72618h();
            eVar.copyOnWrite();
            h.getClass();
            ((C80483h) eVar.instance).f220934a = h;
            C80482g a2 = C79878z.f218943a.apply(aeVar.mo72612b());
            eVar.copyOnWrite();
            ((C80483h) eVar.instance).f220935b = a2.getNumber();
            if (aeVar.mo72615e().isPresent()) {
                int intValue = ((Integer) aeVar.mo72615e().get()).intValue();
                eVar.copyOnWrite();
                ((C80483h) eVar.instance).f220936c = intValue;
            }
            e.mo55395g((C80483h) eVar.build());
        }
        C58485gu f2 = e.mo55394f();
        aVar.copyOnWrite();
        C80484i iVar = (C80484i) aVar.instance;
        iVar.mo74341a();
        C62947c.addAll((Iterable) f2, (List) iVar.f220943e);
        C80478c c = C79878z.m128028c(ajVar);
        aVar.copyOnWrite();
        ((C80484i) aVar.instance).f220944f = c.getNumber();
        long epochMilli = ajVar.mo72644g().toEpochMilli();
        aVar.copyOnWrite();
        ((C80484i) aVar.instance).f220940b = epochMilli;
        Optional j = ajVar.mo72647j();
        Objects.requireNonNull(aVar);
        j.ifPresent(new C79868p(aVar));
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C80484i iVar2 = (C80484i) aVar.build();
        iVar2.getClass();
        eaVar.f225980b = iVar2;
        eaVar.f225979a = 1;
        return (C82885ea) dzVar.build();
    }
}
