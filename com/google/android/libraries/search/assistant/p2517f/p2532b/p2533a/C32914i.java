package com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.b.a.i */
/* compiled from: PG */
public final class C32914i implements C46675m {

    /* renamed from: e */
    public static final /* synthetic */ int f88221e = 0;

    /* renamed from: a */
    public final C71422aw f88222a;

    /* renamed from: b */
    public final C21370a f88223b;

    /* renamed from: c */
    public final LinkedHashSet f88224c = new LinkedHashSet();

    /* renamed from: d */
    public final ArrayDeque f88225d = new ArrayDeque();

    /* renamed from: f */
    private final C47632e f88226f = new C47632e();

    public C32914i(C71422aw awVar, C21370a aVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clock");
        this.f88222a = awVar;
        this.f88223b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C69664n.m101061g(oVar, "request");
        if (!oVar.mo50698b().contains(C46667e.TEXT)) {
            return C60856cj.m92900i(C46675m.f121943k);
        }
        return C71663i.m104692e(this.f88222a, (C71424ay) null, new C32908c(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo38343b() {
        return mo38344c(new C32909d(this, (C69577g) null));
    }

    /* renamed from: c */
    public final C60870cx mo38344c(C69630p pVar) {
        C60870cx b = this.f88226f.mo51512b(new C32913h(this, pVar), C60826bg.f164896a);
        C69664n.m101060f(b, "@CanIgnoreReturnValue\n  …ion) }, directExecutor())");
        return b;
    }

    /* renamed from: d */
    public final Closeable mo38345d(C32916k kVar) {
        mo38344c(new C32910e(this, kVar, (C69577g) null));
        return new C32912g(this, kVar);
    }
}
