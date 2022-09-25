package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.km */
/* compiled from: PG */
public abstract class C82581km implements C82548jg {
    /* renamed from: i */
    public static C82580kl m131600i() {
        C82350by byVar = new C82350by();
        byVar.f224960a = "NGA_FOREGROUND_ACTIVITY";
        return byVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_FOREGROUND_ACTIVITY";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "found_app";
        boolean h = mo75826h();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 3;
        aee2.f158451c = Boolean.valueOf(h);
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "source_api";
        String g = mo75825g();
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
        aee5.f158452d = "api_level";
        int b = mo75821b();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 2;
        aee6.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "error_message";
        String f = mo75824f();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        f.getClass();
        aee8.f158450b = 4;
        aee8.f158451c = f;
        aec.mo56976a((aee) aed4.build());
        aed aed5 = (aed) aee.f158447e.createBuilder();
        aed5.copyOnWrite();
        aee aee9 = (aee) aed5.instance;
        aee9.f158449a |= 1;
        aee9.f158452d = "component";
        String c = mo75822c();
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        c.getClass();
        aee10.f158450b = 4;
        aee10.f158451c = c;
        aec.mo56976a((aee) aed5.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo75821b();

    /* renamed from: c */
    public abstract String mo75822c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        boolean h = mo75826h();
        String g = mo75825g();
        int b = mo75821b();
        ((C19567d) ifVar.f226954W.mo6453a()).mo24822a(1, Boolean.valueOf(h), g, Integer.valueOf(b), mo75824f(), mo75822c());
    }

    /* renamed from: f */
    public abstract String mo75824f();

    /* renamed from: g */
    public abstract String mo75825g();

    /* renamed from: h */
    public abstract boolean mo75826h();
}
