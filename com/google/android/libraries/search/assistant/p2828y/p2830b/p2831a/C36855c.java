package com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a;

import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.common.base.C58869cf;
import com.google.protos.p5129p.p5131b.C65845n;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.y.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C36855c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C36855c f96000a = new C36855c();

    private /* synthetic */ C36855c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58869cf cfVar = C36858f.f96003a;
        C19088t tVar = ((C65845n) obj).f178995b;
        if (tVar == null) {
            tVar = C19088t.f53533p;
        }
        return cfVar.mo56155i(tVar.f53536b.toLowerCase(Locale.US));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
