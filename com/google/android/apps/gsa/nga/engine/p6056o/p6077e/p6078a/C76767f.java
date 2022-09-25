package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6078a;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4535g.C59127at;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import com.google.protos.p4850an.C63389bg;
import com.google.protos.p4850an.p4854c.C63410ak;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.a.f */
/* compiled from: PG */
public final /* synthetic */ class C76767f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f212141a;

    /* renamed from: b */
    public final /* synthetic */ String f212142b;

    public /* synthetic */ C76767f(C58490gz gzVar, String str) {
        this.f212141a = gzVar;
        this.f212142b = str;
    }

    public final void accept(Object obj) {
        C58490gz gzVar = this.f212141a;
        String str = this.f212142b;
        C63410ak akVar = (C63410ak) obj;
        C63389bg bgVar = akVar.f171367d;
        if (bgVar == null) {
            bgVar = C63389bg.f171305d;
        }
        C8213ab abVar = bgVar.f171309c;
        if (abVar == null) {
            abVar = C8213ab.f28837d;
        }
        int i = abVar.f28840b;
        C63389bg bgVar2 = akVar.f171367d;
        if (bgVar2 == null) {
            bgVar2 = C63389bg.f171305d;
        }
        C8213ab abVar2 = bgVar2.f171309c;
        if (abVar2 == null) {
            abVar2 = C8213ab.f28837d;
        }
        C59127at c = C59127at.m91611c(i, abVar2.f28841c);
        C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
        double d = c.f157132a;
        fyVar.copyOnWrite();
        C63063ga gaVar = (C63063ga) fyVar.instance;
        gaVar.f170181a = 2;
        gaVar.f170182b = Double.valueOf(d * 57.29577951308232d);
        gzVar.mo55429h(str.concat(".geo.latitude"), (C63063ga) fyVar.build());
        C63060fy fyVar2 = (C63060fy) C63063ga.f170179c.createBuilder();
        double d2 = c.f157133b;
        fyVar2.copyOnWrite();
        C63063ga gaVar2 = (C63063ga) fyVar2.instance;
        gaVar2.f170181a = 2;
        gaVar2.f170182b = Double.valueOf(d2 * 57.29577951308232d);
        gzVar.mo55429h(str.concat(".geo.longitude"), (C63063ga) fyVar2.build());
        C63060fy fyVar3 = (C63060fy) C63063ga.f170179c.createBuilder();
        String str2 = akVar.f171365b;
        fyVar3.copyOnWrite();
        C63063ga gaVar3 = (C63063ga) fyVar3.instance;
        str2.getClass();
        gaVar3.f170181a = 3;
        gaVar3.f170182b = str2;
        gzVar.mo55429h(str.concat(".name"), (C63063ga) fyVar3.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
