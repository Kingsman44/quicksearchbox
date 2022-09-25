package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import com.google.assistant.p4016z.C53694as;
import com.google.assistant.p4016z.C53698aw;
import com.google.assistant.p4016z.C53737v;
import com.google.assistant.p4016z.C53738w;
import com.google.p4479cg.C58079k;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.i */
/* compiled from: PG */
public final /* synthetic */ class C130848i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130848i f358106a = new C130848i();

    private /* synthetic */ C130848i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53698aw awVar = (C53698aw) obj;
        int i = C130857r.f358121f;
        C53694as asVar = awVar.f140962c;
        if (asVar == null) {
            asVar = C53694as.f140951e;
        }
        double min = (double) Math.min(awVar.f140961b, asVar.f140954b);
        C53737v vVar = (C53737v) C53738w.f141079d.createBuilder();
        C58079k kVar = asVar.f140955c;
        if (kVar == null) {
            kVar = C58079k.f155250c;
        }
        vVar.copyOnWrite();
        C53738w wVar = (C53738w) vVar.instance;
        kVar.getClass();
        wVar.f141082b = kVar;
        wVar.f141081a |= 1;
        return Optional.m71637of(new C130840a((C53738w) vVar.build(), min));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
