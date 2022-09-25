package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C140003p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.podcasts.b.f.c */
/* compiled from: PG */
public final /* synthetic */ class C140100c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380732a;

    /* renamed from: b */
    public final /* synthetic */ C140003p f380733b;

    public /* synthetic */ C140100c(C140097al alVar, C140003p pVar) {
        this.f380732a = alVar;
        this.f380733b = pVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C140097al alVar = this.f380732a;
        C140003p pVar = this.f380733b;
        C140088ac acVar = (C140088ac) obj;
        Map map = pVar.f380525a;
        Map map2 = pVar.f380526b;
        List list = (List) Collection.EL.stream(acVar.mo115447e()).filter(new C140106i(map)).map(new C140107j(map2)).filter(new C140087ab()).collect(Collectors.toCollection(C140108k.f380743a));
        C59104x b = C140097al.f380721a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueueManager");
        ((C59052c) ((C59052c) b).mo56372aa(41568)).mo56393w("episodes removed: %d episodes updated: %d", acVar.mo115447e().size() - list.size(), map2.size());
        acVar.mo115450h(list);
        acVar.mo115456n();
        C140095aj ajVar = alVar.f380723c;
        acVar.getClass();
        ajVar.mo115458a(acVar);
        return alVar.mo115462e(C140097al.m227766a(acVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
