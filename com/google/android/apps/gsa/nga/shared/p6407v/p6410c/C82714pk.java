package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.pk */
/* compiled from: PG */
public abstract class C82714pk implements C82548jg {
    /* renamed from: f */
    public static C82713pj m132222f() {
        C82483gw gwVar = new C82483gw();
        gwVar.f225377a = "PIE_MAPS_EDUCATION_USECASE";
        return gwVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "PIE_MAPS_EDUCATION_USECASE";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "event_type";
        String b = mo76429b();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        b.getClass();
        aee2.f158450b = 4;
        aee2.f158451c = b;
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "is_counterfactual";
        boolean c = mo76430c();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 3;
        aee4.f158451c = Boolean.valueOf(c);
        aec.mo56976a((aee) aed2.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract String mo76429b();

    /* renamed from: c */
    public abstract boolean mo76430c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19567d) ifVar.f227019bH.mo6453a()).mo24822a(1, str, mo76429b(), Boolean.valueOf(mo76430c()));
    }
}
