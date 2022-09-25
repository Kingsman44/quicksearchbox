package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.f */
/* compiled from: PG */
public class C23290f extends C22939d {

    /* renamed from: D */
    public final List f63764D = new ArrayList();

    /* renamed from: E */
    public C23286b f63765E;

    /* renamed from: F */
    public final C23286b f63766F = new C23287c(this);

    /* renamed from: Zq */
    private final Map f63767Zq = new HashMap();

    protected C23290f(C22945j jVar) {
        super(jVar);
    }

    /* renamed from: R */
    public final int mo28770R(String str) {
        C23289e U = mo28773U(str);
        C23067b.m43236i(U, "Cannot get offset for an untracked child");
        int i = 0;
        for (C23289e eVar : this.f63764D) {
            if (eVar.equals(U)) {
                break;
            }
            i += eVar.mo28767a();
        }
        return i;
    }

    /* renamed from: S */
    public final int mo28771S(String str) {
        C23289e U = mo28773U(str);
        C23067b.m43236i(U, "Cannot get offset for an untracked child");
        int i = 0;
        for (C23289e eVar : this.f63764D) {
            i += eVar.mo28767a();
            if (eVar.equals(U)) {
                break;
            }
        }
        return i;
    }

    /* renamed from: T */
    public final C23289e mo28772T(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f63764D.size()) {
            z = true;
        }
        C23067b.m43228a(z);
        return (C23289e) this.f63764D.get(i);
    }

    /* renamed from: U */
    public final C23289e mo28773U(String str) {
        return (C23289e) this.f63767Zq.get(str);
    }

    /* renamed from: V */
    public final C23289e mo28774V(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f63764D.size()) {
            z = true;
        }
        C23067b.m43228a(z);
        C23289e eVar = (C23289e) this.f63764D.remove(i);
        this.f63767Zq.remove(eVar.f63762b);
        return eVar;
    }

    /* renamed from: W */
    public final C23290f mo28775W(int i) {
        C23289e T = mo28772T(i);
        C23067b.m43236i(T, "Get container attempted on an untracked child");
        return T.f63761a;
    }

    /* renamed from: X */
    public final void mo28776X(int i, C23289e eVar) {
        boolean z = false;
        if (i >= 0 && i <= this.f63764D.size()) {
            z = true;
        }
        C23067b.m43228a(z);
        this.f63764D.add(i, eVar);
        this.f63767Zq.put(eVar.f63762b, eVar);
    }

    /* renamed from: Y */
    public final void mo28777Y(List list) {
        for (C23289e eVar : this.f63764D) {
            C23290f fVar = eVar.f63761a;
            if (fVar != null) {
                fVar.mo28777Y(list);
            } else {
                C23293i iVar = eVar.f63763c;
                iVar.getClass();
                list.add(iVar);
            }
        }
    }

    /* renamed from: Z */
    public final void mo28778Z(int i, int i2) {
        C23289e V = mo28774V(i);
        C23067b.m43236i(V, "Move attempted on an untracked child");
        mo28776X(i2, V);
    }
}
