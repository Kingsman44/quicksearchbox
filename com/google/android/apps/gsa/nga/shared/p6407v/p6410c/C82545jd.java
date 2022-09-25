package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.jd */
/* compiled from: PG */
public abstract class C82545jd implements C82548jg {
    /* renamed from: j */
    public static C82544jc m131436j() {
        C82315aq aqVar = new C82315aq();
        aqVar.f224851a = "MIC_STATUS";
        return aqVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "MIC_STATUS";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "on_device_enabled";
        boolean i = mo75673i();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 3;
        aee2.f158451c = Boolean.valueOf(i);
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "action";
        String c = mo75667c();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        c.getClass();
        aee4.f158450b = 4;
        aee4.f158451c = c;
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "status";
        String g = mo75670g();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        g.getClass();
        aee6.f158450b = 4;
        aee6.f158451c = g;
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "session_type";
        String f = mo75669f();
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
        aee9.f158452d = "is_continuous_mode";
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        aee10.f158450b = 3;
        aee10.f158451c = Boolean.valueOf(mo75671h());
        aec.mo56976a((aee) aed5.build());
        aed aed6 = (aed) aee.f158447e.createBuilder();
        aed6.copyOnWrite();
        aee aee11 = (aee) aed6.instance;
        aee11.f158449a |= 1;
        aee11.f158452d = "api_level";
        int b = mo75666b();
        aed6.copyOnWrite();
        aee aee12 = (aee) aed6.instance;
        aee12.f158450b = 2;
        aee12.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed6.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo75666b();

    /* renamed from: c */
    public abstract String mo75667c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        boolean i = mo75673i();
        ((C19567d) ifVar.f227003as.mo6453a()).mo24822a(1, str, str2, Boolean.valueOf(i), mo75667c(), mo75670g(), mo75669f(), Boolean.valueOf(mo75671h()), Integer.valueOf(mo75666b()));
    }

    /* renamed from: f */
    public abstract String mo75669f();

    /* renamed from: g */
    public abstract String mo75670g();

    /* renamed from: h */
    public abstract boolean mo75671h();

    /* renamed from: i */
    public abstract boolean mo75673i();
}
