package com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a;

import com.google.android.libraries.search.p3005i.C38469m;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.stream.IntStream;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.search.assistant.y.b.a.f */
/* compiled from: PG */
public final class C36858f {

    /* renamed from: a */
    public static final C58869cf f96003a = C58869cf.m90937c(C58837ba.m90854c("[\\p{Space}\\p{Punct}&&[^']]")).mo56152f(C58911u.f156751b).mo56151a();

    /* renamed from: b */
    public final C38469m f96004b;

    /* renamed from: c */
    public final Executor f96005c;

    public C36858f(C38469m mVar, Executor executor) {
        this.f96004b = mVar;
        this.f96005c = executor;
    }

    /* renamed from: a */
    public static Stream m65549a(List list, int i) {
        return IntStream.CC.range(0, (list.size() - i) + 1).mapToObj(new C36850a(list, i));
    }
}
