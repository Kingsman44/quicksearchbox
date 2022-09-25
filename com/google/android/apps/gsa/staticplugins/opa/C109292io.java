package com.google.android.apps.gsa.staticplugins.opa;

import com.google.assistant.p3745ab.C48304dc;
import com.google.assistant.p3745ab.C48305dd;
import com.google.assistant.p3994s.p3995a.C53430np;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.io */
/* compiled from: PG */
public final /* synthetic */ class C109292io implements Function {

    /* renamed from: a */
    public final /* synthetic */ C109297it f304467a;

    public /* synthetic */ C109292io(C109297it itVar) {
        this.f304467a = itVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C109297it itVar = this.f304467a;
        C53430np npVar = (C53430np) obj;
        C48304dc dcVar = (C48304dc) C48305dd.f124927d.createBuilder();
        if ((npVar.f140224a & 2) != 0) {
            long b = itVar.f304473b.mo26870b();
            long j = npVar.f140227d;
            dcVar.copyOnWrite();
            C48305dd ddVar = (C48305dd) dcVar.instance;
            ddVar.f124930a |= 1;
            ddVar.f124931b = b - j;
        }
        return Collection.EL.stream(npVar.f140225b).map(new C109293ip(Optional.m71637of((C48305dd) dcVar.build())));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
