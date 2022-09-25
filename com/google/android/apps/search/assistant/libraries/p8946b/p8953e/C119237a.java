package com.google.android.apps.search.assistant.libraries.p8946b.p8953e;

import android.content.pm.ApplicationInfo;
import com.google.protos.p4985f.p5040t.p5041a.C65336b;
import com.google.protos.p4985f.p5040t.p5041a.C65337c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.e.a */
/* compiled from: PG */
public final /* synthetic */ class C119237a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C119237a f332523a = new C119237a();

    private /* synthetic */ C119237a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65336b bVar = (C65336b) C65337c.f176687c.createBuilder();
        String str = ((ApplicationInfo) obj).packageName;
        bVar.copyOnWrite();
        C65337c cVar = (C65337c) bVar.instance;
        str.getClass();
        cVar.f176689a |= 1;
        cVar.f176690b = str;
        return (C65337c) bVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
