package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80453a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80454b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ap */
/* compiled from: PG */
public final /* synthetic */ class C103223ap implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103223ap f287988a = new C103223ap();

    private /* synthetic */ C103223ap() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C80453a aVar = (C80453a) C80454b.f220816c.createBuilder();
        aVar.copyOnWrite();
        C80454b bVar = (C80454b) aVar.instance;
        str.getClass();
        bVar.f220818a |= 1;
        bVar.f220819b = str;
        return (C80454b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
