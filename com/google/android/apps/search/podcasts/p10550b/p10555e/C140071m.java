package com.google.android.apps.search.podcasts.p10550b.p10555e;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C139988a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.podcasts.b.e.m */
/* compiled from: PG */
public final /* synthetic */ class C140071m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140084z f380662a;

    public /* synthetic */ C140071m(C140084z zVar) {
        this.f380662a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C140075q qVar = (C140075q) obj;
        return this.f380662a.f380691b.mo115381a((Collection) Stream.CC.concat(Collection.EL.stream(qVar.f380670b), Collection.EL.stream(qVar.f380671c)).map(C140062d.f380648a).collect(Collectors.toCollection(C140063e.f380649a)), C139988a.DONT_CARE);
    }
}
