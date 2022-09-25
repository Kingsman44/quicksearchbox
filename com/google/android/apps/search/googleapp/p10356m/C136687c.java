package com.google.android.apps.search.googleapp.p10356m;

import android.content.Context;
import com.google.android.libraries.geller.p1818f.C21848cd;
import com.google.android.libraries.search.p3005i.C38437d;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65813cq;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.m.c */
/* compiled from: PG */
public final class C136687c implements C21848cd {

    /* renamed from: a */
    public final Context f372063a;

    /* renamed from: b */
    public final C38437d f372064b;

    /* renamed from: c */
    public final C46128f f372065c;

    /* renamed from: d */
    public final C46175b f372066d;

    /* renamed from: e */
    private final C71422aw f372067e;

    /* renamed from: com.google.android.apps.search.googleapp.m.c$a */
    /* compiled from: PG */
    public interface C136688a {
        /* renamed from: fN */
        C38469m mo113329fN();
    }

    public C136687c(Context context, C38437d dVar, C46128f fVar, C46175b bVar, C71422aw awVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f372063a = context;
        this.f372064b = dVar;
        this.f372065c = fVar;
        this.f372066d = bVar;
        this.f372067e = awVar;
    }

    /* renamed from: b */
    public final C60870cx mo27146b(String str, Iterable iterable, C65813cq cqVar) {
        C69664n.m101061g(str, "user");
        C69664n.m101061g(iterable, "corpora");
        C69664n.m101061g(cqVar, "reason");
        return C71663i.m104692e(this.f372067e, (C71424ay) null, new C136689d(this, str, cqVar, iterable, (C69577g) null), 3);
    }
}
