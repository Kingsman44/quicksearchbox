package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.hu */
/* compiled from: PG */
public abstract class C58512hu extends C58333bd implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient C58495hd map;
    public final transient int size;

    public C58512hu(C58495hd hdVar, int i) {
        this.map = hdVar;
        this.size = i;
    }

    /* renamed from: v */
    public static C58512hu m89942v(C58671nr nrVar) {
        if (nrVar instanceof C58512hu) {
            C58512hu huVar = (C58512hu) nrVar;
            if (!huVar.map.mo55193c()) {
                return huVar;
            }
        }
        return C58487gw.m89866d(nrVar);
    }

    /* renamed from: B */
    public final /* synthetic */ Collection mo54949B() {
        return (C58471gg) super.mo54949B();
    }

    /* renamed from: C */
    public /* synthetic */ Map mo54950C() {
        return this.map;
    }

    /* renamed from: D */
    public final /* synthetic */ Set mo54951D() {
        return this.map.keySet();
    }

    /* renamed from: F */
    public final boolean mo54953F(Object obj) {
        return obj != null && super.mo54953F(obj);
    }

    @Deprecated
    /* renamed from: H */
    public final boolean mo54955H(C58671nr nrVar) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: I */
    public final boolean mo54956I(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: J */
    public final void mo54957J(Object obj, Iterable iterable) {
        throw null;
    }

    /* renamed from: a */
    public abstract C58471gg mo55423a(Object obj);

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Collection mo54902c(Object obj) {
        throw null;
    }

    /* renamed from: f */
    public abstract C58512hu mo55425f();

    /* renamed from: j */
    public final int mo54906j() {
        return this.size;
    }

    /* renamed from: k */
    public final /* synthetic */ C58692ol mo54907k() {
        return new C58509hr(this);
    }

    /* renamed from: l */
    public final /* synthetic */ Collection mo54908l() {
        return new C58507hp(this);
    }

    /* renamed from: m */
    public final /* synthetic */ Collection mo54909m() {
        return new C58511ht(this);
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Iterator mo54910n() {
        throw null;
    }

    /* renamed from: q */
    public final Map mo54913q() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: r */
    public C58471gg mo54948A() {
        return (C58471gg) super.mo54948A();
    }

    /* renamed from: s */
    public final Set mo54915s() {
        throw new AssertionError("unreachable");
    }

    /* renamed from: t */
    public final C58471gg mo55465t() {
        return (C58471gg) super.mo54949B();
    }

    @Deprecated
    /* renamed from: u */
    public final void mo54917u() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: w */
    public final boolean mo54919w(Object obj) {
        return this.map.containsKey(obj);
    }

    @Deprecated
    /* renamed from: x */
    public final boolean mo54920x(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: y */
    public final C58517hz mo55466y() {
        C58692ol olVar = this.f155887c;
        if (olVar == null) {
            olVar = mo54907k();
            this.f155887c = olVar;
        }
        return (C58517hz) olVar;
    }
}
