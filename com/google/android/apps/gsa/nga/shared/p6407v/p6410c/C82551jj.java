package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.jj */
/* compiled from: PG */
public abstract class C82551jj implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_ANNOTATION_REQUEST_UNCACHED_LATENCY";
        double doubleValue = mo75696g().doubleValue();
        aec.copyOnWrite();
        aef aef2 = (aef) aec.instance;
        aef2.f158455a |= 2;
        aef2.f158457c = doubleValue;
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "core_model_version";
        int b = mo75692b();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 2;
        aee2.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "person_name_model_version";
        int f = mo75695f();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 2;
        aee4.f158451c = Long.valueOf((long) f);
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "neural_matching_encoder_version";
        int c = mo75693c();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 2;
        aee6.f158451c = Long.valueOf((long) c);
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "annotation_types";
        String h = mo75697h();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        h.getClass();
        aee8.f158450b = 4;
        aee8.f158451c = h;
        aec.mo56976a((aee) aed4.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo75692b();

    /* renamed from: c */
    public abstract int mo75693c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        double doubleValue = mo75696g().doubleValue();
        int b = mo75692b();
        int f = mo75695f();
        int c = mo75693c();
        ((C19569f) ifVar.f226949R.mo6453a()).mo24824b(doubleValue, str, str2, Integer.valueOf(b), Integer.valueOf(f), Integer.valueOf(c), mo75697h());
    }

    /* renamed from: f */
    public abstract int mo75695f();

    /* renamed from: g */
    public abstract Double mo75696g();

    /* renamed from: h */
    public abstract String mo75697h();
}
