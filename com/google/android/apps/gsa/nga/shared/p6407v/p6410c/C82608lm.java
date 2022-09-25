package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.lm */
/* compiled from: PG */
public abstract class C82608lm implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_LANGUAGE_PACK_SIZE2";
        double doubleValue = mo75941c().doubleValue();
        aec.copyOnWrite();
        aef aef2 = (aef) aec.instance;
        aef2.f158455a |= 2;
        aef2.f158457c = doubleValue;
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "lp_version";
        int b = mo75940b();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 2;
        aee2.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "assistant_locale";
        String f = mo75943f();
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
        aee5.f158452d = "failure_reason";
        String g = mo75944g();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        g.getClass();
        aee6.f158450b = 4;
        aee6.f158451c = g;
        aec.mo56976a((aee) aed3.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo75940b();

    /* renamed from: c */
    public abstract Double mo75941c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        double doubleValue = mo75941c().doubleValue();
        int b = mo75940b();
        ((C19569f) ifVar.f226997am.mo6453a()).mo24824b(doubleValue, str, str2, Integer.valueOf(b), mo75943f(), mo75944g());
    }

    /* renamed from: f */
    public abstract String mo75943f();

    /* renamed from: g */
    public abstract String mo75944g();
}
