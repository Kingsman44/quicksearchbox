package com.google.android.libraries.search.assistant.p2828y.p2853n;

import com.google.assistant.p3897e.p3917i.p3918a.C51444hy;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.y.n.j */
/* compiled from: PG */
public final /* synthetic */ class C37013j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f96383a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f96384b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f96385c;

    public /* synthetic */ C37013j(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f96383a = cxVar;
        this.f96384b = cxVar2;
        this.f96385c = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f96383a;
        C60870cx cxVar2 = this.f96384b;
        C60870cx cxVar3 = this.f96385c;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        Optional optional3 = (Optional) C60856cj.m92909r(cxVar3);
        if (optional.isEmpty() && optional2.isEmpty() && optional3.isEmpty()) {
            return Optional.empty();
        }
        C51444hy hyVar = (C51444hy) C51450id.f133992h.createBuilder();
        Objects.requireNonNull(hyVar);
        optional.ifPresent(new C37009f(hyVar));
        Objects.requireNonNull(hyVar);
        optional2.ifPresent(new C37010g(hyVar));
        Objects.requireNonNull(hyVar);
        optional3.ifPresent(new C37011h(hyVar));
        return Optional.m71637of((C51450id) hyVar.build());
    }
}
