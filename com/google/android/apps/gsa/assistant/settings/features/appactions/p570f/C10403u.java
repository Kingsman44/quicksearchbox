package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import com.google.assistant.p3825an.p3830c.p3831a.C49348y;
import com.google.assistant.p3861at.C49821ag;
import com.google.assistant.p3861at.C49826ak;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.u */
/* compiled from: PG */
public final /* synthetic */ class C10403u implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C10403u f35110a = new C10403u();

    private /* synthetic */ C10403u() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C10383ae.f35085a;
        C49826ak akVar = ((C10382ad) obj).mo18464b().f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C49821ag agVar = akVar.f129475l;
        if (agVar == null) {
            agVar = C49821ag.f129197d;
        }
        C49348y a = C49348y.m85417a(agVar.f129200b);
        if (a == null) {
            a = C49348y.PRIORITY_NONE;
        }
        return Integer.valueOf(a.getNumber());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
