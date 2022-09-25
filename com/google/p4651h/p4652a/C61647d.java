package com.google.p4651h.p4652a;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.p4522b.C58490gz;
import com.google.p4651h.C61643a;
import com.google.p4651h.C61648b;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5488io.grpc.p5520a.C70133a;

/* renamed from: com.google.h.a.d */
/* compiled from: PG */
public class C61647d extends C61648b {

    /* renamed from: a */
    private static final Map f166545a = Collections.emptyMap();
    private static final long serialVersionUID = 4556936364828217687L;

    /* renamed from: b */
    private final Object f166546b;

    /* renamed from: c */
    private Map f166547c;

    /* renamed from: d */
    private C61644a f166548d;

    protected C61647d() {
        this((C61644a) null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    /* renamed from: a */
    public final Map mo58162a() {
        Map map;
        synchronized (this.f166546b) {
            if (!m94419c()) {
                map = this.f166547c;
                if (map == null) {
                    throw new NullPointerException("requestMetadata");
                }
            } else {
                synchronized (this.f166546b) {
                    this.f166547c = null;
                    this.f166548d = null;
                    throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
                }
            }
        }
        return map;
    }

    /* renamed from: b */
    public final void mo58163b(Executor executor, C70133a aVar) {
        synchronized (this.f166546b) {
            if (m94419c()) {
                executor.execute(new C61643a(this, aVar));
                return;
            }
            Map map = this.f166547c;
            if (map != null) {
                aVar.mo61689a(map);
                return;
            }
            throw new NullPointerException("cached requestMetadata");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C61647d)) {
            return false;
        }
        C61647d dVar = (C61647d) obj;
        if (!Objects.equals(this.f166547c, dVar.f166547c) || !Objects.equals(this.f166548d, dVar.f166548d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f166547c, this.f166548d);
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("requestMetadata", this.f166547c);
        b.mo56102b("temporaryAccess", this.f166548d);
        return b.toString();
    }

    public C61647d(C61644a aVar) {
        this.f166546b = new byte[0];
        if (aVar != null) {
            Map map = f166545a;
            this.f166548d = aVar;
            C58490gz gzVar = new C58490gz(4);
            gzVar.mo55429h("Authorization", Collections.singletonList("Bearer ".concat(String.valueOf(aVar.f166542a))));
            gzVar.mo55433l(map);
            this.f166547c = gzVar.mo55427f(true);
        }
    }

    /* renamed from: c */
    private final boolean m94419c() {
        Date date;
        C61644a aVar = this.f166548d;
        Long l = null;
        if (aVar != null) {
            Long l2 = aVar.f166543b;
            if (l2 == null) {
                date = null;
            } else {
                date = new Date(l2.longValue());
            }
            if (date != null) {
                l = Long.valueOf(date.getTime() - System.currentTimeMillis());
            }
        }
        if (this.f166547c != null) {
            return l != null && l.longValue() <= 300000;
        }
        return true;
    }
}
