package com.google.android.libraries.lens.view.p2174v;

import android.content.Context;
import com.google.android.libraries.geller.p1818f.C21848cd;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29551bd;
import com.google.android.libraries.search.p3005i.C38437d;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.libraries.lens.view.v.f */
/* compiled from: PG */
public final class C28144f implements C21848cd {

    /* renamed from: a */
    public final Context f76567a;

    /* renamed from: b */
    public final C60887da f76568b;

    /* renamed from: c */
    public final C29551bd f76569c;

    /* renamed from: d */
    public final C38437d f76570d;

    /* renamed from: e */
    private final C46128f f76571e;

    /* renamed from: f */
    private final C46194e f76572f;

    /* renamed from: com.google.android.libraries.lens.view.v.f$a */
    /* compiled from: PG */
    public interface C28145a {
        /* renamed from: fM */
        C38469m mo33579fM();
    }

    public C28144f(Context context, C60887da daVar, C29551bd bdVar, C46128f fVar, C46194e eVar, C38437d dVar) {
        this.f76567a = context;
        this.f76568b = daVar;
        this.f76569c = bdVar;
        this.f76571e = fVar;
        this.f76572f = eVar;
        this.f76570d = dVar;
    }

    /* renamed from: b */
    public final C60870cx mo27146b(String str, Iterable iterable, C65813cq cqVar) {
        C60870cx cxVar;
        if (str.isEmpty()) {
            cxVar = this.f76572f.mo50254a();
        } else {
            cxVar = this.f76571e.mo50216c(str);
        }
        C28141c cVar = new C28141c(this, iterable, str, cqVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(cVar), this.f76568b);
    }
}
