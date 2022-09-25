package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62995dn;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C103829ai implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103829ai f289080a = new C103829ai();

    private /* synthetic */ C103829ai() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = (Map) obj;
        C58974d dVar = C103868bu.f289129a;
        C103873bz bzVar = (C103873bz) C103876cb.f289161b.createBuilder();
        bzVar.copyOnWrite();
        C103876cb cbVar = (C103876cb) bzVar.instance;
        C62995dn dnVar = cbVar.f289163a;
        if (!dnVar.f170058b) {
            cbVar.f289163a = dnVar.mo58980a();
        }
        cbVar.f289163a.putAll(map);
        return (C103876cb) bzVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
