package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8235c;

import com.google.android.apps.gsa.opa.p6437d.p6438a.C83605b;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3897e.p3929l.p3930a.C52748d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.c.e */
/* compiled from: PG */
public final /* synthetic */ class C106641e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106641e f297296a = new C106641e();

    private /* synthetic */ C106641e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52748d dVar = (C52748d) obj;
        C52428rj rjVar = dVar.f138424b;
        if (rjVar == null) {
            rjVar = C52428rj.f137558m;
        }
        return new C83605b(rjVar.f137564e, dVar.f138425c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
