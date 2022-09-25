package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.h */
/* compiled from: PG */
final class C79450h extends C79420ap {

    /* renamed from: a */
    private final long f218122a;

    /* renamed from: b */
    private final C79570b f218123b;

    /* renamed from: c */
    private final C79583o f218124c;

    /* renamed from: d */
    private final Instant f218125d;

    public C79450h(long j, C79570b bVar, C79583o oVar, Instant instant) {
        this.f218122a = j;
        if (bVar != null) {
            this.f218123b = bVar;
            if (oVar != null) {
                this.f218124c = oVar;
                if (instant != null) {
                    this.f218125d = instant;
                    return;
                }
                throw new NullPointerException("Null startTime");
            }
            throw new NullPointerException("Null config");
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final long mo74039a() {
        return this.f218122a;
    }

    /* renamed from: b */
    public final C79570b mo74040b() {
        return this.f218123b;
    }

    /* renamed from: c */
    public final C79583o mo74041c() {
        return this.f218124c;
    }

    /* renamed from: d */
    public final Instant mo74042d() {
        return this.f218125d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79420ap) {
            C79420ap apVar = (C79420ap) obj;
            return this.f218122a == apVar.mo74039a() && this.f218123b.equals(apVar.mo74040b()) && this.f218124c.equals(apVar.mo74041c()) && this.f218125d.equals(apVar.mo74042d());
        }
    }

    public final int hashCode() {
        long j = this.f218122a;
        return this.f218125d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f218123b.hashCode()) * 1000003) ^ this.f218124c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f218122a;
        String num = Integer.toString(this.f218123b.f218339o);
        String obj = this.f218124c.toString();
        String obj2 = this.f218125d.toString();
        return "ContextSession{id=" + j + ", type=" + num + ", config=" + obj + ", startTime=" + obj2 + "}";
    }
}
