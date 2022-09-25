package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.p4522b.C58485gu;
import java.util.Map;
import p001a.p014d.p015a.p016a.C0079x;
import p001a.p014d.p015a.p016a.C0080y;
import p001a.p014d.p015a.p016a.C0081z;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.gs */
/* compiled from: PG */
public final /* synthetic */ class C123473gs implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C123473gs f341269a = new C123473gs();

    private /* synthetic */ C123473gs() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        Map.Entry entry = (Map.Entry) obj;
        C58485gu guVar = (C58485gu) entry.getValue();
        C0080y yVar = (C0080y) entry.getKey();
        if (guVar.isEmpty()) {
            return Optional.empty();
        }
        if (guVar.size() == 1) {
            str = (String) guVar.get(0);
        } else {
            str = "(?:" + ((String) Collection.EL.stream(guVar).collect(Collectors.joining("|"))) + ")";
        }
        C0079x xVar = (C0079x) C0081z.f222d.createBuilder();
        xVar.copyOnWrite();
        str.getClass();
        ((C0081z) xVar.instance).f225b = str;
        xVar.copyOnWrite();
        ((C0081z) xVar.instance).f224a = yVar.getNumber();
        return Optional.m71637of(C123377dd.m202731a((C0081z) xVar.build()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
