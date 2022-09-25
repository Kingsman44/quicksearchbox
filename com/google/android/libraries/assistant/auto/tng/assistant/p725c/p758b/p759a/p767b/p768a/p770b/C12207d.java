package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b;

import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.d */
/* compiled from: PG */
public final /* synthetic */ class C12207d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C12207d f38924a = new C12207d();

    private /* synthetic */ C12207d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52078ek ekVar;
        C52070ec ecVar;
        C52083ep epVar = (C52083ep) obj;
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
        C52069eb ebVar = ecVar.f136655c;
        if (ebVar == null) {
            ebVar = C52069eb.f136648b;
        }
        return Collection.EL.stream(ebVar.f136650a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
