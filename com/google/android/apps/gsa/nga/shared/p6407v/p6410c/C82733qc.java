package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.qc */
/* compiled from: PG */
public abstract class C82733qc implements C82548jg {
    /* renamed from: f */
    public static C82732qb m132304f() {
        C82502ho hoVar = new C82502ho();
        hoVar.f225430a = "UNINTENDED_QUERY_SUPPRESSION_ERROR_COUNT";
        return hoVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "UNINTENDED_QUERY_SUPPRESSION_ERROR_COUNT";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "language";
        String c = mo76507c();
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
        aee3.f158452d = "error_message";
        String b = mo76506b();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        b.getClass();
        aee4.f158450b = 4;
        aee4.f158451c = b;
        aec.mo56976a((aee) aed2.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract String mo76506b();

    /* renamed from: c */
    public abstract String mo76507c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19567d) ifVar.f227095ct.mo6453a()).mo24822a(1, str, mo76507c(), mo76506b());
    }
}
