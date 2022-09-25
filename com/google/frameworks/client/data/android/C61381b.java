package com.google.frameworks.client.data.android;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.frameworks.client.data.android.b */
/* compiled from: PG */
public final class C61381b extends C61425g {

    /* renamed from: a */
    public C61378at f165956a;

    /* renamed from: b */
    public ScheduledExecutorService f165957b;

    /* renamed from: c */
    public C61343d f165958c;

    /* renamed from: d */
    public String f165959d;

    /* renamed from: e */
    public C58881cr f165960e;

    /* renamed from: f */
    public C58881cr f165961f;

    /* renamed from: g */
    public C58881cr f165962g;

    /* renamed from: h */
    public C58881cr f165963h;

    /* renamed from: i */
    public int f165964i;

    /* renamed from: j */
    public byte f165965j;

    /* renamed from: k */
    private Context f165966k;

    /* renamed from: l */
    private C21370a f165967l;

    /* renamed from: m */
    private Executor f165968m;

    /* renamed from: n */
    private Executor f165969n;

    /* renamed from: o */
    private Executor f165970o;

    /* renamed from: a */
    public final C61466h mo57951a() {
        Context context;
        C21370a aVar;
        C61378at atVar;
        Executor executor;
        Executor executor2;
        Executor executor3;
        C58881cr crVar;
        C58881cr crVar2;
        C58881cr crVar3;
        C58881cr crVar4;
        if (this.f165965j != 1 || (context = this.f165966k) == null || (aVar = this.f165967l) == null || (atVar = this.f165956a) == null || (executor = this.f165968m) == null || (executor2 = this.f165969n) == null || (executor3 = this.f165970o) == null || (crVar = this.f165960e) == null || (crVar2 = this.f165961f) == null || (crVar3 = this.f165962g) == null || (crVar4 = this.f165963h) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f165966k == null) {
                sb.append(" context");
            }
            if (this.f165967l == null) {
                sb.append(" clock");
            }
            if (this.f165956a == null) {
                sb.append(" transport");
            }
            if (this.f165968m == null) {
                sb.append(" transportExecutor");
            }
            if (this.f165969n == null) {
                sb.append(" ioExecutor");
            }
            if (this.f165970o == null) {
                sb.append(" networkExecutor");
            }
            if (this.f165960e == null) {
                sb.append(" recordNetworkMetricsToPrimes");
            }
            if (this.f165961f == null) {
                sb.append(" recordCachingMetricsToPrimes");
            }
            if (this.f165962g == null) {
                sb.append(" recordBandwidthMetrics");
            }
            if (this.f165963h == null) {
                sb.append(" grpcIdleTimeoutMillis");
            }
            if (this.f165965j == 0) {
                sb.append(" maxMessageSize");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C61394c(context, aVar, atVar, executor, executor2, executor3, this.f165957b, this.f165958c, this.f165959d, crVar, crVar2, crVar3, crVar4, this.f165964i);
    }

    /* renamed from: b */
    public final void mo57952b(C21370a aVar) {
        if (aVar != null) {
            this.f165967l = aVar;
            return;
        }
        throw new NullPointerException("Null clock");
    }

    /* renamed from: c */
    public final void mo57953c(Context context) {
        if (context != null) {
            this.f165966k = context;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: d */
    public final void mo57954d(Executor executor) {
        if (executor != null) {
            this.f165969n = executor;
            return;
        }
        throw new NullPointerException("Null ioExecutor");
    }

    /* renamed from: e */
    public final void mo57955e(Executor executor) {
        if (executor != null) {
            this.f165970o = executor;
            return;
        }
        throw new NullPointerException("Null networkExecutor");
    }

    /* renamed from: f */
    public final void mo57956f(Executor executor) {
        if (executor != null) {
            this.f165968m = executor;
            return;
        }
        throw new NullPointerException("Null transportExecutor");
    }
}
