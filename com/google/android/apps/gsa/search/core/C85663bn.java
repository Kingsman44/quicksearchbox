package com.google.android.apps.gsa.search.core;

import com.google.knowledge.p4671b.C61829v;
import com.google.knowledge.p4671b.C61832y;

/* renamed from: com.google.android.apps.gsa.search.core.bn */
/* compiled from: PG */
public final class C85663bn implements Cloneable {

    /* renamed from: a */
    public C85660bk f231552a;

    /* renamed from: b */
    public boolean f231553b;

    public C85663bn(C85660bk bkVar, boolean z) {
        this.f231552a = bkVar;
        this.f231553b = z;
    }

    /* renamed from: a */
    public final C61832y mo79183a() {
        C61829v vVar = (C61829v) C61832y.f167087d.createBuilder();
        int i = this.f231552a.f231533g;
        vVar.copyOnWrite();
        C61832y yVar = (C61832y) vVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            yVar.f167090b = i2;
            yVar.f167089a |= 1;
            boolean z = this.f231553b;
            vVar.copyOnWrite();
            C61832y yVar2 = (C61832y) vVar.instance;
            yVar2.f167089a |= 2;
            yVar2.f167091c = z;
            return (C61832y) vVar.build();
        }
        throw null;
    }

    /* renamed from: b */
    public final boolean mo79184b() {
        return this.f231552a == C85660bk.ELIGIBLE;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object clone() {
        return new C85663bn(this.f231552a, this.f231553b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85663bn)) {
            return false;
        }
        C85663bn bnVar = (C85663bn) obj;
        return this.f231553b == bnVar.f231553b && this.f231552a == bnVar.f231552a;
    }

    public final int hashCode() {
        boolean z = this.f231553b;
        return (z ? 1 : 0) + this.f231552a.hashCode();
    }

    public final String toString() {
        String str = true != this.f231553b ? "off" : "on";
        String valueOf = String.valueOf(this.f231552a);
        return str + " [" + valueOf + "]";
    }
}
