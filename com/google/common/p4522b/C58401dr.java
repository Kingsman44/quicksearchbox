package com.google.common.p4522b;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.common.base.C58838bb;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.dr */
/* compiled from: PG */
public abstract class C58401dr extends C58541iw {

    /* renamed from: a */
    final C58419ei f156001a;

    public C58401dr(C58419ei eiVar) {
        super(C58701ou.f156429a);
        this.f156001a = eiVar;
    }

    /* renamed from: d */
    public abstract C58401dr mo55151d(Comparable comparable, boolean z);

    /* renamed from: g */
    public abstract C58401dr mo55154g(Comparable comparable, boolean z, Comparable comparable2, boolean z2);

    /* renamed from: i */
    public abstract C58401dr mo55158i(Comparable comparable, boolean z);

    /* renamed from: j */
    public C58541iw mo55159j() {
        return new C58415ee(this);
    }

    /* renamed from: l */
    public final /* synthetic */ C58541iw mo55161l(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return mo55151d(comparable, z);
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ C58541iw mo55162m(Object obj, boolean z) {
        throw null;
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ C58541iw mo55165p(Object obj, boolean z, Object obj2, boolean z2) {
        throw null;
    }

    /* renamed from: r */
    public final /* synthetic */ C58541iw mo55167r(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return mo55158i(comparable, z);
    }

    /* renamed from: s */
    public /* bridge */ /* synthetic */ C58541iw mo55168s(Object obj, boolean z) {
        throw null;
    }

    /* renamed from: t */
    public abstract C58714pg mo55171t();

    public String toString() {
        return mo55171t().toString();
    }

    /* renamed from: c */
    public final C58401dr mo55160k(Comparable comparable) {
        comparable.getClass();
        return mo55151d(comparable, false);
    }

    /* renamed from: h */
    public final C58401dr tailSet(Comparable comparable) {
        comparable.getClass();
        return mo55158i(comparable, true);
    }

    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return mo55151d(comparable, z);
    }

    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return mo55158i(comparable, z);
    }

    /* renamed from: e */
    public final C58401dr subSet(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        C58838bb.m90868c(this.f156195b.compare(comparable, comparable2) <= 0);
        return mo55154g(comparable, true, comparable2, false);
    }

    /* renamed from: f */
    public final C58401dr subSet(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        comparable.getClass();
        comparable2.getClass();
        C58838bb.m90868c(this.f156195b.compare(comparable, comparable2) <= 0);
        return mo55154g(comparable, z, comparable2, z2);
    }

    /* renamed from: b */
    public static C58401dr m89515b(C58714pg pgVar, C58419ei eiVar) {
        pgVar.getClass();
        eiVar.getClass();
        try {
            C58714pg i = !pgVar.mo55821l() ? pgVar.mo55819i(C58714pg.m90502e(Integer.valueOf(LinearLayoutManager.INVALID_OFFSET))) : pgVar;
            if (!pgVar.mo55822m()) {
                i = i.mo55819i(C58714pg.m90503f(Integer.MAX_VALUE));
            }
            if (!i.mo55824o() && C58714pg.m90499b((Comparable) Objects.requireNonNull(pgVar.f156456b.mo55179d(eiVar)), (Comparable) Objects.requireNonNull(pgVar.f156457c.mo55177c(eiVar))) <= 0) {
                return new C58722po(i, eiVar);
            }
            return new C58421ek(eiVar);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
