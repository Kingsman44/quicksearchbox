package com.google.android.libraries.search.p3005i.p3009d;

import android.content.Context;
import com.google.android.libraries.geller.p1818f.C21848cd;
import com.google.android.libraries.search.p3005i.C38437d;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3012f.C38456a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.libraries.search.i.d.h */
/* compiled from: PG */
public final class C38446h implements C21848cd {

    /* renamed from: a */
    public final Context f101758a;

    /* renamed from: b */
    public final C60887da f101759b;

    /* renamed from: c */
    public final C38437d f101760c;

    /* renamed from: d */
    public final C38456a f101761d;

    /* renamed from: e */
    public final C46175b f101762e;

    /* renamed from: f */
    private final C46128f f101763f;

    /* renamed from: com.google.android.libraries.search.i.d.h$a */
    /* compiled from: PG */
    public interface C38447a {
        /* renamed from: fM */
        C38469m mo41425fM();
    }

    public C38446h(Context context, C60887da daVar, C46128f fVar, C38437d dVar, C38456a aVar, C46175b bVar) {
        this.f101758a = context;
        this.f101759b = daVar;
        this.f101763f = fVar;
        this.f101760c = dVar;
        this.f101761d = aVar;
        this.f101762e = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo27146b(String str, Iterable iterable, C65813cq cqVar) {
        C60870cx c = this.f101763f.mo50216c(str);
        C38443e eVar = new C38443e(this, iterable, cqVar);
        return C60922j.m93045h(c, C47810es.m84966f(eVar), this.f101759b);
    }
}
