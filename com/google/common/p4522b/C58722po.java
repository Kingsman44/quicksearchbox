package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.po */
/* compiled from: PG */
final class C58722po extends C58401dr {
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    private final C58714pg f156465e;

    public C58722po(C58714pg pgVar, C58419ei eiVar) {
        super(eiVar);
        this.f156465e = pgVar;
    }

    /* renamed from: X */
    public static boolean m90525X(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && C58714pg.m90499b(comparable, comparable2) == 0;
    }

    /* renamed from: Y */
    private final C58401dr m90526Y(C58714pg pgVar) {
        if (this.f156465e.mo55823n(pgVar)) {
            return C58401dr.m89515b(this.f156465e.mo55819i(pgVar), this.f156001a);
        }
        return new C58421ek(this.f156001a);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: B */
    public final C58485gu mo55492B() {
        boolean z = this.f156001a.f156031b;
        return new C58720pm(this);
    }

    /* renamed from: V */
    public final Comparable first() {
        return (Comparable) Objects.requireNonNull(this.f156465e.f156456b.mo55179d(this.f156001a));
    }

    /* renamed from: W */
    public final Comparable last() {
        return (Comparable) Objects.requireNonNull(this.f156465e.f156457c.mo55177c(this.f156001a));
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f156465e.mo5941a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final boolean containsAll(Collection collection) {
        return C58374cr.m89411c(this, collection);
    }

    /* renamed from: d */
    public final C58401dr mo55162m(Comparable comparable, boolean z) {
        return m90526Y(C58714pg.m90509r(comparable, C58335bf.m89396a(z)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58722po) {
            C58722po poVar = (C58722po) obj;
            if (this.f156001a.equals(poVar.f156001a)) {
                if (!first().equals(poVar.first()) || !last().equals(poVar.last())) {
                    return false;
                }
                return true;
            }
        }
        return super.equals(obj);
    }

    /* renamed from: g */
    public final C58401dr mo55165p(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        if (comparable.compareTo(comparable2) != 0 || z || z2) {
            return m90526Y(C58714pg.m90508q(comparable, C58335bf.m89396a(z), comparable2, C58335bf.m89396a(z2)));
        }
        return new C58421ek(this.f156001a);
    }

    public final int hashCode() {
        return C58758qx.m90643a(this);
    }

    /* renamed from: i */
    public final C58401dr mo55168s(Comparable comparable, boolean z) {
        return m90526Y(C58714pg.m90507p(comparable, C58335bf.m89396a(z)));
    }

    public final boolean isEmpty() {
        return false;
    }

    /* renamed from: lA */
    public final C58800sl iterator() {
        return new C58718pk(this, first());
    }

    /* renamed from: lz */
    public final C58800sl descendingIterator() {
        return new C58719pl(this, last());
    }

    public final int size() {
        long intValue = ((long) ((Integer) last()).intValue()) - ((long) ((Integer) first()).intValue());
        if (intValue >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) intValue) + 1;
    }

    /* renamed from: t */
    public final C58714pg mo55171t() {
        return new C58714pg(this.f156465e.f156456b.mo55183h(this.f156001a), this.f156465e.f156457c.mo55185i(this.f156001a));
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58721pn(this.f156465e, this.f156001a);
    }
}
