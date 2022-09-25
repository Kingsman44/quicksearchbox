package com.google.p343ac.p346b.p347a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.ac.b.a.b */
/* compiled from: PG */
public final class C6625b extends C62934bn implements C63001dt {
    public C6625b() {
        super(C6636m.f19775aC);
    }

    /* renamed from: a */
    public final void mo13714a(int i, long j) {
        copyOnWrite();
        C6636m mVar = (C6636m) this.instance;
        C6636m mVar2 = C6636m.f19775aC;
        C62995dn dnVar = mVar.f19811af;
        if (!dnVar.f170058b) {
            mVar.f19811af = dnVar.mo58980a();
        }
        mVar.f19811af.put(Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: b */
    public final void mo13715b(int i, long j) {
        copyOnWrite();
        C6636m mVar = (C6636m) this.instance;
        C6636m mVar2 = C6636m.f19775aC;
        C62995dn dnVar = mVar.f19812ag;
        if (!dnVar.f170058b) {
            mVar.f19812ag = dnVar.mo58980a();
        }
        mVar.f19812ag.put(Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo13716c(int i, String str) {
        copyOnWrite();
        C6636m mVar = (C6636m) this.instance;
        C6636m mVar2 = C6636m.f19775aC;
        C62995dn dnVar = mVar.f19813ah;
        if (!dnVar.f170058b) {
            mVar.f19813ah = dnVar.mo58980a();
        }
        mVar.f19813ah.put(Integer.valueOf(i), str);
    }

    /* renamed from: d */
    public final void mo13717d(int i, String str) {
        copyOnWrite();
        C6636m mVar = (C6636m) this.instance;
        C6636m mVar2 = C6636m.f19775aC;
        C62995dn dnVar = mVar.f19814ai;
        if (!dnVar.f170058b) {
            mVar.f19814ai = dnVar.mo58980a();
        }
        mVar.f19814ai.put(Integer.valueOf(i), str);
    }
}
