package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16164h;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.i */
/* compiled from: PG */
public final /* synthetic */ class C16036i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47480a;

    /* renamed from: b */
    public final /* synthetic */ List f47481b;

    /* renamed from: c */
    public final /* synthetic */ C16091aq f47482c;

    public /* synthetic */ C16036i(C16027ax axVar, List list, C16091aq aqVar) {
        this.f47480a = axVar;
        this.f47481b = list;
        this.f47482c = aqVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C16027ax axVar = this.f47480a;
        List list = this.f47481b;
        C16091aq aqVar = this.f47482c;
        C16170n nVar = (C16170n) obj;
        int i = list.contains(nVar) ? 2 : 1;
        C16164h hVar = new C16164h();
        hVar.f47681a = C16027ax.m32836u(nVar.mo22752f(), axVar.f47453d.f47374o);
        hVar.mo22767c(aqVar.mo22735i());
        hVar.mo22771g(true);
        hVar.mo22772h(i);
        hVar.mo22769e(nVar.mo22750e());
        C16335ai aiVar = nVar.mo22747b().f48084i;
        if (aiVar == null) {
            aiVar = C16335ai.f48090k;
        }
        C16090ap g = aqVar.mo22733g();
        C16327aa a = C16327aa.m33331a(nVar.mo22747b().f48080e);
        if (a == null) {
            a = C16327aa.UNKNOWN_ACTION_TYPE;
        }
        hVar.mo22768d(axVar.mo22665w(aiVar, g, a, true, i));
        C16330ad adVar = nVar.mo22747b().f48082g;
        if (adVar == null) {
            adVar = C16330ad.f48065f;
        }
        hVar.mo22766b(adVar);
        return hVar.mo22765a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
