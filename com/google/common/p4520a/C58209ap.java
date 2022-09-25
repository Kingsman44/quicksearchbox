package com.google.common.p4520a;

import com.google.common.util.concurrent.C60870cx;
import java.util.logging.Level;

/* renamed from: com.google.common.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C58209ap implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C58210aq f155663a;

    /* renamed from: b */
    public final /* synthetic */ Object f155664b;

    /* renamed from: c */
    public final /* synthetic */ int f155665c;

    /* renamed from: d */
    public final /* synthetic */ C58203aj f155666d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f155667e;

    public /* synthetic */ C58209ap(C58210aq aqVar, Object obj, int i, C58203aj ajVar, C60870cx cxVar) {
        this.f155663a = aqVar;
        this.f155664b = obj;
        this.f155665c = i;
        this.f155666d = ajVar;
        this.f155667e = cxVar;
    }

    public final void run() {
        C58210aq aqVar = this.f155663a;
        Object obj = this.f155664b;
        int i = this.f155665c;
        C58203aj ajVar = this.f155666d;
        try {
            aqVar.mo54743g(obj, i, ajVar, this.f155667e);
        } catch (Throwable th) {
            C58234bn.f155731a.logp(Level.WARNING, "com.google.common.cache.LocalCache$Segment", "lambda$loadAsync$0", "Exception thrown during refresh", th);
            ajVar.f155644b.mo57357o(th);
        }
    }
}
