package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.iu */
/* compiled from: PG */
public abstract class C82535iu implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "HOTWORD_VERIFICATION_LATENCY";
        double doubleValue = mo75622b().doubleValue();
        aec.copyOnWrite();
        aef aef2 = (aef) aec.instance;
        aef2.f158455a |= 2;
        aef2.f158457c = doubleValue;
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "is_bisto";
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 3;
        aee2.f158451c = Boolean.valueOf(mo75623c());
        aec.mo56976a((aee) aed.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract Double mo75622b();

    /* renamed from: c */
    public abstract boolean mo75623c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19569f) ifVar.f227060bw.mo6453a()).mo24824b(mo75622b().doubleValue(), str, str2, Boolean.valueOf(mo75623c()));
    }
}
