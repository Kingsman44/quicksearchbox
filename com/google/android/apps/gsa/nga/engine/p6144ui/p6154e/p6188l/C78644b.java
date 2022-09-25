package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.b */
/* compiled from: PG */
public final /* synthetic */ class C78644b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C78644b f216544a = new C78644b();

    private /* synthetic */ C78644b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        try {
            return Optional.m71637of(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) C78711q.f216649a.mo56226d()).mo56382g(e)).mo56372aa(5250)).mo56389s("Could not parse string: %s", str);
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
