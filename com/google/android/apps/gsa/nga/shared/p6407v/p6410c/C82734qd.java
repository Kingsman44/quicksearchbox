package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.qd */
/* compiled from: PG */
public abstract class C82734qd implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "UNINTENDED_QUERY_SUPPRESSION_EXECUTION_COUNT";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "language";
        String c = mo76512c();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        c.getClass();
        aee2.f158450b = 4;
        aee2.f158451c = c;
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "is_suppressed";
        boolean h = mo76516h();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 3;
        aee4.f158451c = Boolean.valueOf(h);
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "is_cloud_handover";
        boolean g = mo76515g();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 3;
        aee6.f158451c = Boolean.valueOf(g);
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "cloud_handover_reason";
        int b = mo76511b();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        aee8.f158450b = 2;
        aee8.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed4.build());
        aed aed5 = (aed) aee.f158447e.createBuilder();
        aed5.copyOnWrite();
        aee aee9 = (aee) aed5.instance;
        aee9.f158449a |= 1;
        aee9.f158452d = "has_client_suppression_support";
        boolean f = mo76514f();
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        aee10.f158450b = 3;
        aee10.f158451c = Boolean.valueOf(f);
        aec.mo56976a((aee) aed5.build());
        aed aed6 = (aed) aee.f158447e.createBuilder();
        aed6.copyOnWrite();
        aee aee11 = (aee) aed6.instance;
        aee11.f158449a |= 1;
        aee11.f158452d = "supports_hotword_invalidation";
        boolean i = mo76518i();
        aed6.copyOnWrite();
        aee aee12 = (aee) aed6.instance;
        aee12.f158450b = 3;
        aee12.f158451c = Boolean.valueOf(i);
        aec.mo56976a((aee) aed6.build());
        aed aed7 = (aed) aee.f158447e.createBuilder();
        aed7.copyOnWrite();
        aee aee13 = (aee) aed7.instance;
        aee13.f158449a |= 1;
        aee13.f158452d = "suppressed_by_client_hotword";
        boolean j = mo76519j();
        aed7.copyOnWrite();
        aee aee14 = (aee) aed7.instance;
        aee14.f158450b = 3;
        aee14.f158451c = Boolean.valueOf(j);
        aec.mo56976a((aee) aed7.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo76511b();

    /* renamed from: c */
    public abstract String mo76512c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19567d) ifVar.f227093cr.mo6453a()).mo24822a(1, str, mo76512c(), Boolean.valueOf(mo76516h()), Boolean.valueOf(mo76515g()), Integer.valueOf(mo76511b()), Boolean.valueOf(mo76514f()), Boolean.valueOf(mo76518i()), Boolean.valueOf(mo76519j()));
    }

    /* renamed from: f */
    public abstract boolean mo76514f();

    /* renamed from: g */
    public abstract boolean mo76515g();

    /* renamed from: h */
    public abstract boolean mo76516h();

    /* renamed from: i */
    public abstract boolean mo76518i();

    /* renamed from: j */
    public abstract boolean mo76519j();
}
