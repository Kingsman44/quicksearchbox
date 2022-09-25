package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.nf */
/* compiled from: PG */
public abstract class C82655nf implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_SENSOR_DID_SCORE";
        double doubleValue = mo76161b().doubleValue();
        aec.copyOnWrite();
        aef aef2 = (aef) aec.instance;
        aef2.f158455a |= 2;
        aef2.f158457c = doubleValue;
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "model_version";
        String c = mo76162c();
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
        aee3.f158452d = "allowed_to_stop_continued_conversation";
        boolean g = mo76165g();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 3;
        aee4.f158451c = Boolean.valueOf(g);
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "next_state";
        String f = mo76164f();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        f.getClass();
        aee6.f158450b = 4;
        aee6.f158451c = f;
        aec.mo56976a((aee) aed3.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract Double mo76161b();

    /* renamed from: c */
    public abstract String mo76162c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        double doubleValue = mo76161b().doubleValue();
        String c = mo76162c();
        boolean g = mo76165g();
        ((C19569f) ifVar.f226998an.mo6453a()).mo24824b(doubleValue, str, str2, c, Boolean.valueOf(g), mo76164f());
    }

    /* renamed from: f */
    public abstract String mo76164f();

    /* renamed from: g */
    public abstract boolean mo76165g();
}
