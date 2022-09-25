package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1963i.C23834ai;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60895di;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.am */
/* compiled from: PG */
public final class C90794am {

    /* renamed from: a */
    private final C91022f f253903a;

    /* renamed from: b */
    private final C21370a f253904b;

    /* renamed from: c */
    private final C90800as f253905c;

    /* renamed from: d */
    private final C23834ai f253906d;

    public C90794am(C91022f fVar, C21370a aVar, C90800as asVar, C23834ai aiVar) {
        this.f253903a = fVar;
        this.f253904b = aVar;
        this.f253905c = asVar;
        this.f253906d = aiVar;
    }

    /* renamed from: a */
    public final C90795an mo85121a(String str, int i) {
        C90476a aVar = C91018d.f254254a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new C90853m(str, i));
        C60888db a = this.f253906d.mo29183a(C60895di.m92996b(scheduledThreadPoolExecutor));
        C90815bg bgVar = new C90815bg(str, 1, new C90816bh(scheduledThreadPoolExecutor), true, this.f253904b, true, 10);
        this.f253903a.mo85301a(bgVar);
        return new C90795an(this.f253905c.mo85125a(new C90793al(a, bgVar)), scheduledThreadPoolExecutor);
    }
}
