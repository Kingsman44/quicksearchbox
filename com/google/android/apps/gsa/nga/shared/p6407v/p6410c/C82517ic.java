package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ic */
/* compiled from: PG */
public abstract class C82517ic implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "DID_ACOUSTIC_SCORE_EVENT";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "language_code";
        String c = mo76555c();
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
        aee3.f158452d = "speech_engine";
        String f = mo76556f();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        f.getClass();
        aee4.f158450b = 4;
        aee4.f158451c = f;
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "event_type";
        String b = mo76554b();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        b.getClass();
        aee6.f158450b = 4;
        aee6.f158451c = b;
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "score_is_present";
        boolean g = mo76557g();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        aee8.f158450b = 3;
        aee8.f158451c = Boolean.valueOf(g);
        aec.mo56976a((aee) aed4.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract String mo76554b();

    /* renamed from: c */
    public abstract String mo76555c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        ((C19567d) ifVar.f226947P.mo6453a()).mo24822a(1, str, str2, mo76555c(), mo76556f(), mo76554b(), Boolean.valueOf(mo76557g()));
    }

    /* renamed from: f */
    public abstract String mo76556f();

    /* renamed from: g */
    public abstract boolean mo76557g();
}
