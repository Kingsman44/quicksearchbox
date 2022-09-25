package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80556a;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80557b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.e */
/* compiled from: PG */
public final /* synthetic */ class C77637e implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f213855a;

    public /* synthetic */ C77637e(int i) {
        this.f213855a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = this.f213855a;
        C80556a aVar = (C80556a) ((C80557b) obj).toBuilder();
        aVar.copyOnWrite();
        C80557b bVar = (C80557b) aVar.instance;
        bVar.f221116a |= 8;
        bVar.f221120e = i;
        return (C80557b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
