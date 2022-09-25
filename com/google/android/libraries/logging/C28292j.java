package com.google.android.libraries.logging;

import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.google.android.libraries.logging.j */
/* compiled from: PG */
public class C28292j {

    /* renamed from: a */
    public final C60213m f76973a;

    /* renamed from: b */
    public final aqp f76974b = ((aqp) aqs.f159780k.createBuilder());

    /* renamed from: c */
    public final Set f76975c = new HashSet();

    /* renamed from: d */
    public boolean f76976d = false;

    /* renamed from: e */
    public int f76977e = 1;

    /* renamed from: f */
    private boolean f76978f = false;

    public C28292j(int i) {
        C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
        this.f76973a = mVar;
        mVar.copyOnWrite();
        C60214n nVar = (C60214n) mVar.instance;
        nVar.f162916a |= 8;
        nVar.f162918c = i;
    }

    /* renamed from: b */
    public final C60214n mo33788b() {
        return (C60214n) this.f76973a.build();
    }

    /* renamed from: c */
    public final C63204j mo33789c() {
        aqs aqs = (aqs) this.f76974b.instance;
        if ((aqs.f159782a & 16) == 0) {
            return null;
        }
        C63204j jVar = aqs.f159788g;
        return jVar == null ? C63204j.f170749e : jVar;
    }

    /* renamed from: d */
    public final boolean mo33790d(int i) {
        return this.f76975c.contains(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo33791e() {
        if (this.f76978f) {
            return true;
        }
        int i = ((C60214n) this.f76973a.instance).f162916a;
        return ((i & 1) == 0 && (i & 2048) == 0) ? false : true;
    }

    /* renamed from: f */
    public final void mo33792f(C63204j jVar) {
        if (jVar == null) {
            aqp aqp = this.f76974b;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs aqs2 = aqs.f159780k;
            aqs.f159788g = null;
            aqs.f159782a &= -17;
            return;
        }
        aqp aqp2 = this.f76974b;
        aqp2.copyOnWrite();
        aqs aqs3 = (aqs) aqp2.instance;
        aqs aqs4 = aqs.f159780k;
        aqs3.f159788g = jVar;
        aqs3.f159782a |= 16;
    }

    /* renamed from: g */
    public final void mo33793g(C60214n nVar) {
        C60213m mVar = this.f76973a;
        int i = ((C60214n) mVar.instance).f162918c;
        mVar.clear();
        this.f76973a.mergeFrom(nVar);
        C60213m mVar2 = this.f76973a;
        mVar2.copyOnWrite();
        C60214n nVar2 = (C60214n) mVar2.instance;
        nVar2.f162916a |= 8;
        nVar2.f162918c = i;
    }

    /* renamed from: h */
    public final void mo33794h(int i) {
        this.f76977e = i;
        this.f76978f = true;
    }

    /* renamed from: i */
    public final void mo33795i(int i) {
        this.f76975c.add(Integer.valueOf(i - 1));
    }

    public final String toString() {
        String obj = super.toString();
        int i = ((C60214n) this.f76973a.instance).f162918c;
        String obj2 = this.f76975c.toString();
        return "Ve[" + obj + ";id=" + i + ";interactions=" + obj2 + "]";
    }
}
