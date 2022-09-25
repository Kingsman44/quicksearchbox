package com.google.android.libraries.onegoogle.owners;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.C143875g;
import com.google.android.libraries.mdi.p2213d.p2219c.C28682k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.onegoogle.owners.r */
/* compiled from: PG */
public final class C31016r {

    /* renamed from: a */
    public Context f83519a;

    /* renamed from: b */
    ExecutorService f83520b;

    /* renamed from: c */
    public ScheduledExecutorService f83521c;

    /* renamed from: d */
    public Handler f83522d;

    /* renamed from: e */
    public final C143875g f83523e = C143875g.f389987a;

    /* renamed from: f */
    public C28682k f83524f;

    /* renamed from: g */
    public final C21370a f83525g = new C21375e();

    /* renamed from: h */
    private final C58881cr f83526h = C58886cw.m90973a(C31013o.f83515a);

    /* renamed from: a */
    public final C31012n mo36683a() {
        this.f83519a.getClass();
        if (this.f83520b == null) {
            ExecutorService executorService = this.f83521c;
            if (executorService == null) {
                executorService = Executors.newCachedThreadPool((ThreadFactory) this.f83526h.mo6453a());
            }
            this.f83520b = executorService;
        }
        if (this.f83521c == null) {
            this.f83521c = Executors.newSingleThreadScheduledExecutor((ThreadFactory) this.f83526h.mo6453a());
        }
        return new C30960ad(this.f83520b, new C31014p(this));
    }
}
