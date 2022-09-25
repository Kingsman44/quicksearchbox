package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.pz */
/* compiled from: PG */
public abstract class C82729pz implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "TC_LIB_PERSON_NAME_ANNOTATION_COUNT";
        double doubleValue = mo76496g().doubleValue();
        aec.copyOnWrite();
        aef aef2 = (aef) aec.instance;
        aef2.f158455a |= 2;
        aef2.f158457c = doubleValue;
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "core_model_version";
        int b = mo76492b();
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
        int f = mo76495f();
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
        int c = mo76493c();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 2;
        aee6.f158451c = Long.valueOf((long) c);
        aec.mo56976a((aee) aed3.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo76492b();

    /* renamed from: c */
    public abstract int mo76493c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19569f) ifVar.f226951T.mo6453a()).mo24824b(mo76496g().doubleValue(), str, str2, Integer.valueOf(mo76492b()), Integer.valueOf(mo76495f()), Integer.valueOf(mo76493c()));
    }

    /* renamed from: f */
    public abstract int mo76495f();

    /* renamed from: g */
    public abstract Double mo76496g();
}
