package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.qf */
/* compiled from: PG */
public abstract class C82736qf implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "UNINTENDED_QUERY_SUPPRESSION_SERVER_EXECUTION_COUNT";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "language";
        String c = mo76527c();
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
        aee3.f158452d = "cloud_handover_reason";
        int b = mo76526b();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 2;
        aee4.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "suppressed_by_pqrnn";
        boolean i = mo76533i();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 3;
        aee6.f158451c = Boolean.valueOf(i);
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "suppressed_by_ranklab";
        boolean j = mo76534j();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        aee8.f158450b = 3;
        aee8.f158451c = Boolean.valueOf(j);
        aec.mo56976a((aee) aed4.build());
        aed aed5 = (aed) aee.f158447e.createBuilder();
        aed5.copyOnWrite();
        aee aee9 = (aee) aed5.instance;
        aee9.f158449a |= 1;
        aee9.f158452d = "suppressed_by_speech_aware_model";
        boolean k = mo76535k();
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        aee10.f158450b = 3;
        aee10.f158451c = Boolean.valueOf(k);
        aec.mo56976a((aee) aed5.build());
        aed aed6 = (aed) aee.f158447e.createBuilder();
        aed6.copyOnWrite();
        aee aee11 = (aee) aed6.instance;
        aee11.f158449a |= 1;
        aee11.f158452d = "suppressed_by_hotword";
        boolean g = mo76530g();
        aed6.copyOnWrite();
        aee aee12 = (aee) aed6.instance;
        aee12.f158450b = 3;
        aee12.f158451c = Boolean.valueOf(g);
        aec.mo56976a((aee) aed6.build());
        aed aed7 = (aed) aee.f158447e.createBuilder();
        aed7.copyOnWrite();
        aee aee13 = (aee) aed7.instance;
        aee13.f158449a |= 1;
        aee13.f158452d = "suppressed_by_lph";
        boolean h = mo76531h();
        aed7.copyOnWrite();
        aee aee14 = (aee) aed7.instance;
        aee14.f158450b = 3;
        aee14.f158451c = Boolean.valueOf(h);
        aec.mo56976a((aee) aed7.build());
        aed aed8 = (aed) aee.f158447e.createBuilder();
        aed8.copyOnWrite();
        aee aee15 = (aee) aed8.instance;
        aee15.f158449a |= 1;
        aee15.f158452d = "supports_hotword_validation";
        boolean f = mo76529f();
        aed8.copyOnWrite();
        aee aee16 = (aee) aed8.instance;
        aee16.f158450b = 3;
        aee16.f158451c = Boolean.valueOf(f);
        aec.mo56976a((aee) aed8.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo76526b();

    /* renamed from: c */
    public abstract String mo76527c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19567d) ifVar.f227094cs.mo6453a()).mo24822a(1, str, mo76527c(), Integer.valueOf(mo76526b()), Boolean.valueOf(mo76533i()), Boolean.valueOf(mo76534j()), Boolean.valueOf(mo76535k()), Boolean.valueOf(mo76530g()), Boolean.valueOf(mo76531h()), Boolean.valueOf(mo76529f()));
    }

    /* renamed from: f */
    public abstract boolean mo76529f();

    /* renamed from: g */
    public abstract boolean mo76530g();

    /* renamed from: h */
    public abstract boolean mo76531h();

    /* renamed from: i */
    public abstract boolean mo76533i();

    /* renamed from: j */
    public abstract boolean mo76534j();

    /* renamed from: k */
    public abstract boolean mo76535k();
}
