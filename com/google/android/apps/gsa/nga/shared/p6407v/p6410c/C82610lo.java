package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.lo */
/* compiled from: PG */
public abstract class C82610lo implements C82548jg {
    /* renamed from: h */
    public static C82609ln m131735h() {
        C82380da daVar = new C82380da();
        daVar.f225064a = "NGA_LIFECYCLE_STATUS";
        return daVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_LIFECYCLE_STATUS";
        double doubleValue = mo75952b().doubleValue();
        aec.copyOnWrite();
        aef aef2 = (aef) aec.instance;
        aef2.f158455a |= 2;
        aef2.f158457c = doubleValue;
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "first_lifecycle";
        boolean f = mo75955f();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 3;
        aee2.f158451c = Boolean.valueOf(f);
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "lifecycle_succeeded";
        boolean g = mo75956g();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 3;
        aee4.f158451c = Boolean.valueOf(g);
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "failed_component";
        String c = mo75953c();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        c.getClass();
        aee6.f158450b = 4;
        aee6.f158451c = c;
        aec.mo56976a((aee) aed3.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract Double mo75952b();

    /* renamed from: c */
    public abstract String mo75953c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        double doubleValue = mo75952b().doubleValue();
        boolean f = mo75955f();
        boolean g = mo75956g();
        ((C19569f) ifVar.f227010az.mo6453a()).mo24824b(doubleValue, str, str2, Boolean.valueOf(f), Boolean.valueOf(g), mo75953c());
    }

    /* renamed from: f */
    public abstract boolean mo75955f();

    /* renamed from: g */
    public abstract boolean mo75956g();
}
