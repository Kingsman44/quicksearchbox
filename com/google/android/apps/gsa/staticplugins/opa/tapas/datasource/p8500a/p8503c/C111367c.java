package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.p4129b.p4136c.C54761i;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C111367c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111370f f309886a;

    /* renamed from: b */
    public final /* synthetic */ String f309887b;

    /* renamed from: c */
    public final /* synthetic */ int f309888c;

    public /* synthetic */ C111367c(C111370f fVar, String str, int i) {
        this.f309886a = fVar;
        this.f309887b = str;
        this.f309888c = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111370f fVar = this.f309886a;
        String str = this.f309887b;
        int i = this.f309888c;
        Map.Entry entry = (Map.Entry) obj;
        C54761i iVar = ((C49301bt) entry.getKey()).f127429e;
        if (iVar == null) {
            iVar = C54761i.f143683c;
        }
        return Collection.EL.stream(iVar.f143685a).map(new C111331a(fVar, entry, str, i));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
