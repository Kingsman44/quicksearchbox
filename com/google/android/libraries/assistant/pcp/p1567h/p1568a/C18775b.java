package com.google.android.libraries.assistant.pcp.p1567h.p1568a;

import com.google.assistant.p3803ag.p3804a.p3806b.C48831l;
import com.google.assistant.p3803ag.p3804a.p3806b.C48832m;
import com.google.assistant.p3994s.p3995a.C53229gd;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53236gk;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.h.a.b */
/* compiled from: PG */
public final /* synthetic */ class C18775b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18775b f52891a = new C18775b();

    private /* synthetic */ C18775b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48832m mVar = (C48832m) obj;
        C53229gd gdVar = (C53229gd) C53230ge.f139503j.createBuilder();
        String str = mVar.f126343b;
        gdVar.copyOnWrite();
        C53230ge geVar = (C53230ge) gdVar.instance;
        str.getClass();
        geVar.f139505a |= 1;
        geVar.f139506b = str;
        String str2 = mVar.f126344c;
        gdVar.copyOnWrite();
        C53230ge geVar2 = (C53230ge) gdVar.instance;
        str2.getClass();
        geVar2.f139505a |= 2;
        geVar2.f139507c = str2;
        String str3 = mVar.f126345d;
        gdVar.copyOnWrite();
        C53230ge geVar3 = (C53230ge) gdVar.instance;
        str3.getClass();
        geVar3.f139505a |= 4;
        geVar3.f139508d = str3;
        String str4 = mVar.f126346e;
        gdVar.copyOnWrite();
        C53230ge geVar4 = (C53230ge) gdVar.instance;
        str4.getClass();
        geVar4.f139505a |= 8;
        geVar4.f139509e = str4;
        int a = C48831l.m85283a(mVar.f126349h);
        if (a == 0) {
            a = 1;
        }
        C53236gk a2 = C18776c.m36177a(a);
        gdVar.copyOnWrite();
        C53230ge geVar5 = (C53230ge) gdVar.instance;
        geVar5.f139510f = a2.f139534d;
        geVar5.f139505a |= 16;
        String str5 = mVar.f126347f;
        gdVar.copyOnWrite();
        C53230ge geVar6 = (C53230ge) gdVar.instance;
        str5.getClass();
        geVar6.f139505a |= 32;
        geVar6.f139511g = str5;
        String str6 = mVar.f126348g;
        gdVar.copyOnWrite();
        C53230ge geVar7 = (C53230ge) gdVar.instance;
        str6.getClass();
        geVar7.f139505a |= 64;
        geVar7.f139512h = str6;
        gdVar.copyOnWrite();
        C53230ge geVar8 = (C53230ge) gdVar.instance;
        geVar8.f139513i = 1;
        geVar8.f139505a |= 128;
        return (C53230ge) gdVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
