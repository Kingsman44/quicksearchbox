package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4060h.p4073d.p4074a.C54227ap;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.s */
/* compiled from: PG */
public final /* synthetic */ class C107681s implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C107681s f299679a = new C107681s();

    private /* synthetic */ C107681s() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C58485gu n = C58485gu.m89846n(369);
        Integer num = C41669ai.f108954c;
        C54227ap apVar = (C54227ap) C54228aq.f142328w.createBuilder();
        apVar.copyOnWrite();
        C54228aq aqVar = (C54228aq) apVar.instance;
        str.getClass();
        aqVar.f142330a |= 1;
        aqVar.f142331b = str;
        return new Suggestion(str, 0, 169, n, BuildConfig.FLAVOR, num, 0, (C54228aq) apVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
