package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8501a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111069s;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111071u;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3825an.p3830c.p3831a.C49335l;
import com.google.common.base.C58835az;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C111291f implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111296k f309696a;

    /* renamed from: b */
    public final /* synthetic */ Map f309697b;

    public /* synthetic */ C111291f(C111296k kVar, Map map) {
        this.f309696a = kVar;
        this.f309697b = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111296k kVar = this.f309696a;
        Map map = this.f309697b;
        C58835az azVar = (C58835az) obj;
        C49335l lVar = (C49335l) azVar.f156631a;
        String str = lVar.f127515c;
        String str2 = lVar.f127514b;
        String str3 = lVar.f127516d;
        double doubleValue = ((Double) azVar.f156632b).doubleValue();
        C22871g gVar = kVar.f309708b;
        C111071u uVar = (C111071u) kVar.f309711e.mo27525b();
        return gVar.mo28209i(C60922j.m93044g(C60838bs.m92859i(uVar.f309294a.mo99925b(str2)), new C111069s(str2, str), uVar.f309295b), "buildAppDonationSuggestion", new C111287b(kVar, str, str2, map, doubleValue, str3));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
