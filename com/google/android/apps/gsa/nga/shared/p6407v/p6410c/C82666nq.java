package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.nq */
/* compiled from: PG */
public abstract class C82666nq implements C82548jg {
    /* renamed from: f */
    public static C82665np m132005f() {
        C82436fc fcVar = new C82436fc();
        fcVar.f225244a = "NGA_SYNC_ERROR";
        return fcVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_SYNC_ERROR";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "error_code";
        int b = mo76216b();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 2;
        aee2.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "exception_type";
        String c = mo76217c();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        c.getClass();
        aee4.f158450b = 4;
        aee4.f158451c = c;
        aec.mo56976a((aee) aed2.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo76216b();

    /* renamed from: c */
    public abstract String mo76217c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        int b = mo76216b();
        ((C19567d) ifVar.f227044bg.mo6453a()).mo24822a(1, str, str2, Integer.valueOf(b), mo76217c());
    }
}
