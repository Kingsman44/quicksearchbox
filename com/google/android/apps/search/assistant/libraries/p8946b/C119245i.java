package com.google.android.apps.search.assistant.libraries.p8946b;

import android.content.Context;
import com.google.android.apps.search.assistant.libraries.p8946b.p8955g.C119241a;
import com.google.android.apps.search.assistant.libraries.p8946b.p8955g.C119243c;
import com.google.android.libraries.geller.p1818f.C21848cd;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29551bd;
import com.google.android.libraries.search.p3005i.C38437d;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3012f.C38456a;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.i */
/* compiled from: PG */
public final class C119245i implements C21848cd {

    /* renamed from: a */
    public final Context f332544a;

    /* renamed from: b */
    public final C60887da f332545b;

    /* renamed from: c */
    public final C29551bd f332546c;

    /* renamed from: d */
    public final C38437d f332547d;

    /* renamed from: e */
    public final C38456a f332548e;

    /* renamed from: f */
    private final C46128f f332549f;

    /* renamed from: g */
    private final C46194e f332550g;

    /* renamed from: com.google.android.apps.search.assistant.libraries.b.i$a */
    /* compiled from: PG */
    public interface C119246a {
        /* renamed from: B */
        C119241a mo104256B();

        /* renamed from: fM */
        C38469m mo104257fM();

        /* renamed from: nM */
        C119243c mo104258nM();
    }

    public C119245i(Context context, C60887da daVar, C38456a aVar, C46128f fVar, C46194e eVar, C38437d dVar, C29551bd bdVar) {
        this.f332544a = context;
        this.f332545b = daVar;
        this.f332546c = bdVar;
        this.f332549f = fVar;
        this.f332550g = eVar;
        this.f332547d = dVar;
        this.f332548e = aVar;
    }

    /* renamed from: b */
    public final C60870cx mo27146b(String str, Iterable iterable, C65813cq cqVar) {
        C60870cx cxVar;
        if (str.isEmpty()) {
            cxVar = this.f332550g.mo50254a();
        } else {
            cxVar = this.f332549f.mo50216c(str);
        }
        C119230d dVar = new C119230d(this, iterable, str, cqVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(dVar), this.f332545b);
    }
}
