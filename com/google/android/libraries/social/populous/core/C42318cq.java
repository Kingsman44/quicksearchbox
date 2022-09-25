package com.google.android.libraries.social.populous.core;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57885b;
import java.util.Collection;
import java.util.EnumSet;

/* renamed from: com.google.android.libraries.social.populous.core.cq */
/* compiled from: PG */
public final class C42318cq {

    /* renamed from: a */
    public PeopleApiAffinity f110974a = PeopleApiAffinity.f110783e;

    /* renamed from: b */
    public double f110975b = ((C$AutoValue_PeopleApiAffinity) PeopleApiAffinity.f110783e).f110655a;

    /* renamed from: c */
    public int f110976c = 0;

    /* renamed from: d */
    public int f110977d = 0;

    /* renamed from: e */
    public boolean f110978e = false;

    /* renamed from: f */
    public boolean f110979f = false;

    /* renamed from: g */
    public C58485gu f110980g = C58485gu.m89845m();

    /* renamed from: h */
    public final EnumSet f110981h = EnumSet.noneOf(C42331dc.class);

    /* renamed from: i */
    public C58485gu f110982i = C58485gu.m89845m();

    /* renamed from: j */
    public boolean f110983j = false;

    /* renamed from: k */
    public boolean f110984k = false;

    /* renamed from: l */
    public boolean f110985l = false;

    /* renamed from: m */
    public boolean f110986m = false;

    /* renamed from: n */
    public boolean f110987n = false;

    /* renamed from: o */
    public boolean f110988o = false;

    /* renamed from: p */
    public String f110989p = null;

    /* renamed from: q */
    public String f110990q = null;

    /* renamed from: r */
    public Long f110991r = null;

    /* renamed from: s */
    public C57885b f110992s = null;

    /* renamed from: t */
    public int f110993t = 1;

    /* renamed from: u */
    private C58485gu f110994u = C58485gu.m89845m();

    /* renamed from: a */
    public final PersonFieldMetadata mo45296a() {
        return new PersonFieldMetadata(this.f110974a, this.f110975b, this.f110976c, this.f110977d, this.f110978e, this.f110979f, this.f110980g, this.f110994u, this.f110981h, this.f110982i, this.f110983j, this.f110984k, this.f110985l, this.f110986m, this.f110987n, this.f110988o, this.f110993t, this.f110989p, this.f110990q, this.f110991r, this.f110992s);
    }

    /* renamed from: b */
    public final void mo45297b(Collection collection) {
        this.f110981h.clear();
        this.f110981h.addAll(collection);
    }

    /* renamed from: c */
    public final void mo45298c(PersonFieldMetadata personFieldMetadata) {
        EnumSet enumSet = personFieldMetadata.f110792i;
        EnumSet<E> noneOf = EnumSet.noneOf(C42331dc.class);
        C58557jl.m90136q(noneOf, enumSet);
        mo45297b(noneOf);
        this.f110974a = personFieldMetadata.f110784a;
        this.f110975b = personFieldMetadata.f110785b;
        this.f110976c = personFieldMetadata.f110786c;
        this.f110977d = personFieldMetadata.f110787d;
        this.f110985l = personFieldMetadata.f110796m;
        this.f110993t = personFieldMetadata.f110804u;
        this.f110989p = personFieldMetadata.f110800q;
        this.f110994u = C58485gu.m89835E(personFieldMetadata.f110791h);
        this.f110983j = personFieldMetadata.f110794k;
        this.f110984k = personFieldMetadata.f110795l;
        this.f110980g = C58485gu.m89842j(personFieldMetadata.f110790g);
        this.f110990q = personFieldMetadata.f110801r;
        this.f110991r = personFieldMetadata.f110802s;
        this.f110982i = C58485gu.m89842j(personFieldMetadata.f110793j);
        this.f110978e = personFieldMetadata.f110788e;
        this.f110979f = personFieldMetadata.f110789f;
        this.f110992s = personFieldMetadata.f110803t;
        this.f110986m = personFieldMetadata.f110797n;
        this.f110987n = personFieldMetadata.f110798o;
        this.f110988o = personFieldMetadata.f110799p;
    }
}
