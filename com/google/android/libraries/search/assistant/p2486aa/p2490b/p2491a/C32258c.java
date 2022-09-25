package com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.b.a.c */
/* compiled from: PG */
public final class C32258c implements C46675m {

    /* renamed from: d */
    public static final /* synthetic */ int f86485d = 0;

    /* renamed from: a */
    public final Set f86486a;

    /* renamed from: b */
    public final Queue f86487b = new PriorityQueue(10);

    /* renamed from: c */
    public final ReentrantReadWriteLock f86488c = new ReentrantReadWriteLock();

    /* renamed from: e */
    private final C21370a f86489e;

    /* renamed from: f */
    private final C71422aw f86490f;

    public C32258c(C21370a aVar, C71422aw awVar, Set set) {
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f86489e = aVar;
        this.f86490f = awVar;
        this.f86486a = set;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C69664n.m101061g(oVar, "request");
        if (!oVar.mo50698b().contains(C46667e.TEXT)) {
            return C60856cj.m92900i(C46675m.f121943k);
        }
        return C71663i.m104692e(this.f86490f, (C71424ay) null, new C32257b(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final Duration mo38015b() {
        return Duration.ofMillis(this.f86489e.mo26871c());
    }
}
