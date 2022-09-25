package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import com.google.android.gms.pay.PassInstance;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.g */
/* compiled from: PG */
public final /* synthetic */ class C131348g implements Function {

    /* renamed from: a */
    public final /* synthetic */ Collection f359074a;

    public /* synthetic */ C131348g(Collection collection) {
        this.f359074a = collection;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        Collection collection = this.f359074a;
        PassInstance passInstance = (PassInstance) obj;
        if (passInstance != null) {
            C58485gu j = C58485gu.m89842j(collection);
            if (j != null) {
                return new C131335a(passInstance, j);
            }
            throw new NullPointerException("Null places");
        }
        throw new NullPointerException("Null passInstance");
    }
}
