package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45699p;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3593d.C45760s;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3600k.C45937b;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.h.k */
/* compiled from: PG */
final class C45885k extends C45882h {

    /* renamed from: a */
    public static final /* synthetic */ int f120621a = 0;

    /* renamed from: f */
    private final C45868ai f120622f;

    /* renamed from: g */
    private final C45868ai f120623g;

    /* renamed from: h */
    private final double f120624h;

    /* renamed from: i */
    private final double f120625i;

    public C45885k(C45760s sVar, C45868ai aiVar, C45868ai aiVar2, double d, double d2, C45819v vVar, C45946k kVar, C45946k kVar2) {
        super(sVar, vVar, kVar, kVar2);
        this.f120622f = aiVar;
        this.f120623g = aiVar2;
        this.f120624h = d2;
        this.f120625i = d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C45699p mo50000a(C45703t tVar, C45944i iVar) {
        C45699p k = this.f120622f.mo50016k(tVar, iVar);
        if (!k.mo49794e()) {
            return k;
        }
        return this.f120623g.mo50016k(tVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C45879e mo50001b(C45944i iVar, C45944i iVar2) {
        C45944i g = iVar.mo50059g(iVar2);
        double c = this.f120615d.mo50049c();
        C45937b bVar = (C45937b) g;
        double d = bVar.f120725a;
        if (c > d || d > this.f120615d.mo50047a()) {
            return mo50017n(bVar.f120725a);
        }
        if (bVar.f120726b < this.f120624h) {
            return this.f120623g.mo50018o(iVar, iVar2);
        }
        return this.f120622f.mo50018o(iVar, iVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar) {
        C45941f fVar2 = fVar;
        this.f120622f.mo50002d(ajVar, iVar, fVar2);
        this.f120623g.mo50002d(ajVar, iVar, fVar2);
        C45937b bVar = (C45937b) iVar;
        double d = bVar.f120726b + this.f120624h;
        double d2 = bVar.f120725a;
        C45946k kVar = this.f120615d;
        ajVar.mo50012c(d2, d, d2 + (kVar.mo50047a() - kVar.mo50049c()), d, fVar2, this.f120625i);
    }
}
