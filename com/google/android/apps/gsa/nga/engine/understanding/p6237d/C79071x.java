package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.nlp.p4735b.p4736a.p4738b.C62830l;
import com.google.nlp.p4735b.p4736a.p4738b.C62831m;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.x */
/* compiled from: PG */
public final /* synthetic */ class C79071x implements Function {

    /* renamed from: a */
    public final /* synthetic */ C62831m f217419a;

    public /* synthetic */ C79071x(C62831m mVar) {
        this.f217419a = mVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C62830l lVar = (C62830l) this.f217419a.toBuilder();
        lVar.copyOnWrite();
        ((C62831m) lVar.instance).f169670c = C62831m.emptyProtobufList();
        return lVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
