package com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b;

import com.google.android.apps.search.googleapp.discover.p10214s.C134546ak;
import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import com.google.common.p4552o.C59722dg;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57200f;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.b.a */
/* compiled from: PG */
public final class C134834a {

    /* renamed from: a */
    public final C135359p f367071a;

    /* renamed from: b */
    public final C57528m f367072b;

    /* renamed from: c */
    public final C59722dg f367073c;

    public C134834a(C135359p pVar, C57528m mVar) {
        C57315dp dpVar;
        Object obj;
        C69664n.m101061g(mVar, "surface");
        this.f367071a = pVar;
        this.f367072b = mVar;
        C134546ak akVar = pVar.f368799a;
        if (akVar.f366407b == 5) {
            dpVar = (C57315dp) akVar.f366408c;
        } else {
            dpVar = C57315dp.f152986c;
        }
        C62940bt r3 = C62942bv.checkIsLite(C57200f.f152712d);
        dpVar.mo58887l(r3);
        Object l = dpVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj = r3.f169969b;
        } else {
            obj = r3.mo58889c(l);
        }
        C59722dg dgVar = ((C57200f) obj).f152715b;
        dgVar = dgVar == null ? C59722dg.f160302a : dgVar;
        C69664n.m101060f(dgVar, "token.streamToken.nextPa…eTokenExtension).metadata");
        this.f367073c = dgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134834a)) {
            return false;
        }
        C134834a aVar = (C134834a) obj;
        return C69664n.m101066l(this.f367071a, aVar.f367071a) && this.f367072b == aVar.f367072b;
    }

    public final int hashCode() {
        return (this.f367071a.hashCode() * 31) + this.f367072b.hashCode();
    }

    public final String toString() {
        C135359p pVar = this.f367071a;
        C57528m mVar = this.f367072b;
        return "TokenContents(token=" + pVar + ", surface=" + mVar + ")";
    }
}
