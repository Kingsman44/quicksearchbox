package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.d.a.f;
import com.google.android.apps.gsa.nga.d.a.j;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80418aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80419ak;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.af */
/* compiled from: PG */
public final /* synthetic */ class C79015af implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79015af f217304a = new C79015af();

    private /* synthetic */ C79015af() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80047aa aaVar;
        String str;
        C80047aa aaVar2;
        C80047aa aaVar3;
        C80053ag agVar;
        j jVar = (j) obj;
        if (jVar.a == 1) {
            aaVar = (C80047aa) jVar.b;
        } else {
            aaVar = C80047aa.f219655i;
        }
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (a == C80080z.WEBREF) {
            if (jVar.a == 1) {
                aaVar3 = (C80047aa) jVar.b;
            } else {
                aaVar3 = C80047aa.f219655i;
            }
            if (aaVar3.f219657a == 10) {
                agVar = (C80053ag) aaVar3.f219658b;
            } else {
                agVar = C80053ag.f219675f;
            }
            str = agVar.f219678b;
        } else if (jVar.c.isEmpty()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ((f) jVar.c.get(0)).a;
        }
        if (jVar.a == 1) {
            aaVar2 = (C80047aa) jVar.b;
        } else {
            aaVar2 = C80047aa.f219655i;
        }
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder(aaVar2);
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219660d = 0;
        int length = str.length();
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219661e = length;
        C80047aa aaVar4 = (C80047aa) xVar.build();
        C80418aj ajVar = (C80418aj) C80419ak.f220716e.createBuilder();
        ajVar.copyOnWrite();
        C80419ak akVar = (C80419ak) ajVar.instance;
        str.getClass();
        akVar.f220718a = 1 | akVar.f220718a;
        akVar.f220719b = str;
        ajVar.copyOnWrite();
        C80419ak akVar2 = (C80419ak) ajVar.instance;
        aaVar4.getClass();
        C62971cq cqVar = akVar2.f220720c;
        if (!cqVar.mo58948c()) {
            akVar2.f220720c = C62942bv.mutableCopy(cqVar);
        }
        akVar2.f220720c.add(aaVar4);
        double d = jVar.e;
        ajVar.copyOnWrite();
        C80419ak akVar3 = (C80419ak) ajVar.instance;
        akVar3.f220718a |= 2;
        akVar3.f220721d = d;
        return (C80419ak) ajVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
