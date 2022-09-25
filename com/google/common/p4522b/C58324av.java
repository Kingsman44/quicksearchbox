package com.google.common.p4522b;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: com.google.common.b.av */
/* compiled from: PG */
abstract class C58324av extends C58319aq implements C58765rd {

    /* renamed from: a */
    private transient C58765rd f155896a;
    final Comparator comparator;

    public C58324av() {
        this.comparator = C58701ou.f156429a;
    }

    public final Comparator comparator() {
        return this.comparator;
    }

    /* renamed from: g */
    public final C58691ok mo54991g() {
        Iterator f = mo54926f();
        if (f.hasNext()) {
            return (C58691ok) f.next();
        }
        return null;
    }

    /* renamed from: j */
    public final /* synthetic */ Set mo54972j() {
        return new C58767rf(this);
    }

    /* renamed from: l */
    public final /* synthetic */ Set mo54974l() {
        return (NavigableSet) super.mo54974l();
    }

    /* renamed from: n */
    public final C58691ok mo54992n() {
        Iterator r = mo54996r();
        if (r.hasNext()) {
            return (C58691ok) r.next();
        }
        return null;
    }

    /* renamed from: o */
    public final C58691ok mo54993o() {
        Iterator f = mo54926f();
        if (!f.hasNext()) {
            return null;
        }
        C58691ok okVar = (C58691ok) f.next();
        C58697oq oqVar = new C58697oq(okVar.mo55768b(), okVar.mo55767a());
        f.remove();
        return oqVar;
    }

    /* renamed from: p */
    public final C58691ok mo54994p() {
        Iterator r = mo54996r();
        if (!r.hasNext()) {
            return null;
        }
        C58691ok okVar = (C58691ok) r.next();
        C58697oq oqVar = new C58697oq(okVar.mo55768b(), okVar.mo55767a());
        r.remove();
        return oqVar;
    }

    /* renamed from: q */
    public final C58765rd mo54995q() {
        C58765rd rdVar = this.f155896a;
        if (rdVar != null) {
            return rdVar;
        }
        C58323au auVar = new C58323au(this);
        this.f155896a = auVar;
        return auVar;
    }

    /* renamed from: r */
    public abstract Iterator mo54996r();

    /* renamed from: s */
    public final NavigableSet mo54997s() {
        return (NavigableSet) super.mo54974l();
    }

    /* renamed from: t */
    public final C58765rd mo54998t(Object obj, int i, Object obj2, int i2) {
        return mo55219lx(obj, i).mo55218lw(obj2, i2);
    }

    public C58324av(Comparator comparator2) {
        this.comparator = comparator2;
    }
}
