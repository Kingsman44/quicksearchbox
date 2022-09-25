package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130735c;
import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p3886c.p3887a.C50676l;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.bw */
/* compiled from: PG */
public final /* synthetic */ class C131036bw implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131036bw f358446a = new C131036bw();

    private /* synthetic */ C131036bw() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50676l lVar = (C50676l) obj;
        C130696a b = C130701b.m213087b();
        b.mo109787c(lVar.f131830c);
        b.mo109786b(lVar.f131829b);
        C49794h a = C49794h.m85713a(lVar.f131831d);
        if (a == null) {
            a = C49794h.UNDEFINED;
        }
        ((C130735c) b).f357922b = Optional.m71637of(a);
        b.mo109789e(lVar.f131832e);
        return b.mo109785a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
