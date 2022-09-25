package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.jl */
/* compiled from: PG */
public abstract class C82553jl implements C82548jg {
    /* renamed from: g */
    public static C82552jk m131478g() {
        C82322ax axVar = new C82322ax();
        axVar.f224882a = "NGA_APA_DATA_FILE_PROVIDER";
        return axVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_APA_DATA_FILE_PROVIDER";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "group_id";
        int b = mo75703b();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 2;
        aee2.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "status";
        String f = mo75706f();
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
        aee5.f158452d = "grpc_error";
        int c = mo75704c();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 2;
        aee6.f158451c = Long.valueOf((long) c);
        aec.mo56976a((aee) aed3.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo75703b();

    /* renamed from: c */
    public abstract int mo75704c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        int b = mo75703b();
        ((C19567d) ifVar.f227067cC.mo6453a()).mo24822a(1, str, str2, Integer.valueOf(b), mo75706f(), Integer.valueOf(mo75704c()));
    }

    /* renamed from: f */
    public abstract String mo75706f();
}
