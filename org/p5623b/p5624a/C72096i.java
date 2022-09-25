package org.p5623b.p5624a;

import org.p5623b.p5629b.C72123b;

/* renamed from: org.b.a.i */
/* compiled from: PG */
public abstract class C72096i extends C72108u {

    /* renamed from: a */
    protected C72103p f191918a;

    /* renamed from: b */
    protected C72099l f191919b;

    /* renamed from: c */
    protected C72108u f191920c;

    /* renamed from: d */
    protected int f191921d;

    /* renamed from: e */
    protected C72108u f191922e;

    public C72096i(C72093f fVar) {
        int i = 0;
        C72108u i2 = m105557i(fVar, 0);
        if (i2 instanceof C72103p) {
            this.f191918a = (C72103p) i2;
            i2 = m105557i(fVar, 1);
            i = 1;
        }
        if (i2 instanceof C72099l) {
            this.f191919b = (C72099l) i2;
            i++;
            i2 = m105557i(fVar, i);
        }
        if (!(i2 instanceof C72018ad)) {
            this.f191920c = i2;
            i++;
            i2 = m105557i(fVar, i);
        }
        if (fVar.f191912b != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if (i2 instanceof C72018ad) {
            C72018ad adVar = (C72018ad) i2;
            m105556e(adVar.f191772a);
            this.f191922e = adVar.mo63227e();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    /* renamed from: e */
    private final void m105556e(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid encoding value: " + i);
        }
        this.f191921d = i;
    }

    /* renamed from: i */
    private static final C72108u m105557i(C72093f fVar, int i) {
        if (fVar.f191912b > i) {
            return fVar.mo63278a(i).mo63233g();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    /* renamed from: a */
    public int mo63217a() {
        throw null;
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        C72108u uVar2;
        C72099l lVar;
        C72103p pVar;
        if (!(uVar instanceof C72096i)) {
            return false;
        }
        if (this == uVar) {
            return true;
        }
        C72096i iVar = (C72096i) uVar;
        C72103p pVar2 = this.f191918a;
        if (pVar2 != null && ((pVar = iVar.f191918a) == null || !pVar.mo63309r(pVar2))) {
            return false;
        }
        C72099l lVar2 = this.f191919b;
        if (lVar2 != null && ((lVar = iVar.f191919b) == null || !lVar.mo63309r(lVar2))) {
            return false;
        }
        C72108u uVar3 = this.f191920c;
        if (uVar3 == null || ((uVar2 = iVar.f191920c) != null && uVar2.mo63309r(uVar3))) {
            return this.f191922e.mo63309r(iVar.f191922e);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return true;
    }

    /* renamed from: f */
    public C72108u mo63228f() {
        return new C72035au(this.f191918a, this.f191919b, this.f191920c, this.f191921d, this.f191922e);
    }

    public final int hashCode() {
        C72103p pVar = this.f191918a;
        int hashCode = pVar != null ? pVar.f191932a.hashCode() : 0;
        C72099l lVar = this.f191919b;
        if (lVar != null) {
            hashCode ^= C72123b.m105659a(lVar.f191927a);
        }
        C72108u uVar = this.f191920c;
        if (uVar != null) {
            hashCode ^= uVar.hashCode();
        }
        return hashCode ^ this.f191922e.hashCode();
    }

    public C72096i(C72103p pVar, C72099l lVar, C72108u uVar, int i, C72108u uVar2) {
        this.f191918a = pVar;
        this.f191919b = lVar;
        this.f191920c = uVar;
        m105556e(i);
        this.f191922e = uVar2;
    }
}
