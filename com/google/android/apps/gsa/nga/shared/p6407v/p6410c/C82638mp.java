package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.mp */
/* compiled from: PG */
public abstract class C82638mp implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_PIE_FLOW_FAILURE";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "failure_cause";
        String c = mo76075c();
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
        aee3.f158452d = "trigger_source";
        String g = mo76078g();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        g.getClass();
        aee4.f158450b = 4;
        aee4.f158451c = g;
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "flow_id";
        String f = mo76077f();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        f.getClass();
        aee6.f158450b = 4;
        aee6.f158451c = f;
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "step";
        int b = mo76074b();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        aee8.f158450b = 2;
        aee8.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed4.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo76074b();

    /* renamed from: c */
    public abstract String mo76075c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19567d) ifVar.f226976aR.mo6453a()).mo24822a(1, str, str2, mo76075c(), mo76078g(), mo76077f(), Integer.valueOf(mo76074b()));
    }

    /* renamed from: f */
    public abstract String mo76077f();

    /* renamed from: g */
    public abstract String mo76078g();
}
