package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130735c;
import com.google.assistant.p3860as.C49794h;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.h */
/* compiled from: PG */
public final /* synthetic */ class C106954h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106954h f297911a = new C106954h();

    private /* synthetic */ C106954h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130696a b = C130701b.m213087b();
        b.mo109786b(((ComponentName) obj).getPackageName());
        ((C130735c) b).f357922b = Optional.m71637of(C49794h.MUSIC);
        b.mo109787c(1.0d);
        return b.mo109785a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
