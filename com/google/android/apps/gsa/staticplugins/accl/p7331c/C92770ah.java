package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80507j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80508k;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C92770ah implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C92770ah f258892a = new C92770ah();

    private /* synthetic */ C92770ah() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52078ek ekVar;
        C52070ec ecVar;
        C52083ep epVar = (C52083ep) obj;
        C80507j jVar = (C80507j) C80508k.f221004e.createBuilder();
        int i = epVar.f136694d;
        jVar.copyOnWrite();
        C80508k kVar = (C80508k) jVar.instance;
        kVar.f221006a |= 1;
        kVar.f221007b = i;
        int i2 = epVar.f136695e;
        jVar.copyOnWrite();
        C80508k kVar2 = (C80508k) jVar.instance;
        kVar2.f221006a |= 2;
        kVar2.f221008c = i2;
        if (epVar.f136692b == 3) {
            ekVar = (C52078ek) epVar.f136693c;
        } else {
            ekVar = C52078ek.f136671f;
        }
        if (ekVar.f136674b == 3) {
            ecVar = (C52070ec) ekVar.f136675c;
        } else {
            ecVar = C52070ec.f136651d;
        }
        jVar.copyOnWrite();
        C80508k kVar3 = (C80508k) jVar.instance;
        ecVar.getClass();
        kVar3.f221009d = ecVar;
        kVar3.f221006a |= 4;
        return (C80508k) jVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
