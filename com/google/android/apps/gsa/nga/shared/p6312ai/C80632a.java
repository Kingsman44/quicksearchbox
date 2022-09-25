package com.google.android.apps.gsa.nga.shared.p6312ai;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80508k;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ai.a */
/* compiled from: PG */
public final /* synthetic */ class C80632a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80632a f221371a = new C80632a();

    private /* synthetic */ C80632a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80508k kVar = (C80508k) obj;
        C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
        int i = kVar.f221008c;
        eoVar.copyOnWrite();
        C52083ep epVar = (C52083ep) eoVar.instance;
        epVar.f136691a |= 2;
        epVar.f136695e = i;
        int i2 = kVar.f221007b;
        eoVar.copyOnWrite();
        C52083ep epVar2 = (C52083ep) eoVar.instance;
        epVar2.f136691a |= 1;
        epVar2.f136694d = i2;
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        C52070ec ecVar = kVar.f221009d;
        if (ecVar == null) {
            ecVar = C52070ec.f136651d;
        }
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        ecVar.getClass();
        ekVar.f136675c = ecVar;
        ekVar.f136674b = 3;
        eoVar.copyOnWrite();
        C52083ep epVar3 = (C52083ep) eoVar.instance;
        C52078ek ekVar2 = (C52078ek) ejVar.build();
        ekVar2.getClass();
        epVar3.f136693c = ekVar2;
        epVar3.f136692b = 3;
        return (C52083ep) eoVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
