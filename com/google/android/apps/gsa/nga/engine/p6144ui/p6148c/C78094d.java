package com.google.android.apps.gsa.nga.engine.p6144ui.p6148c;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83001j;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.c.d */
/* compiled from: PG */
public final /* synthetic */ class C78094d implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f215081a;

    public /* synthetic */ C78094d(Map.Entry entry) {
        this.f215081a = entry;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = this.f215081a;
        C83001j jVar = (C83001j) obj;
        int i = C78097g.f215085a;
        return String.format("%s \"%s-%s\"", new Object[]{entry.getKey(), jVar.f226502a, jVar.f226503b});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
