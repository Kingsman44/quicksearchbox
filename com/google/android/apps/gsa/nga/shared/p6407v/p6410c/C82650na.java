package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.na */
/* compiled from: PG */
public abstract class C82650na implements C82548jg {
    /* renamed from: j */
    public static C82648mz m131924j() {
        C82419em emVar = new C82419em();
        emVar.f225179a = "NGA_RESOURCE_GROUP_UPDATE";
        return emVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_RESOURCE_GROUP_UPDATE";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "resource_group_name";
        String c = mo76136c();
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
        aee3.f158452d = "stage";
        String f = mo76138f();
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
        aee5.f158452d = "client_file_group";
        String b = mo76135b();
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
        aee7.f158452d = "success";
        boolean i = mo76142i();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        aee8.f158450b = 3;
        aee8.f158451c = Boolean.valueOf(i);
        aec.mo56976a((aee) aed4.build());
        aed aed5 = (aed) aee.f158447e.createBuilder();
        aed5.copyOnWrite();
        aee aee9 = (aee) aed5.instance;
        aee9.f158449a |= 1;
        aee9.f158452d = "finished";
        boolean h = mo76140h();
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        aee10.f158450b = 3;
        aee10.f158451c = Boolean.valueOf(h);
        aec.mo56976a((aee) aed5.build());
        aed aed6 = (aed) aee.f158447e.createBuilder();
        aed6.copyOnWrite();
        aee aee11 = (aee) aed6.instance;
        aee11.f158449a |= 1;
        aee11.f158452d = "webref_version";
        String g = mo76139g();
        aed6.copyOnWrite();
        aee aee12 = (aee) aed6.instance;
        g.getClass();
        aee12.f158450b = 4;
        aee12.f158451c = g;
        aec.mo56976a((aee) aed6.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract String mo76135b();

    /* renamed from: c */
    public abstract String mo76136c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        String c = mo76136c();
        String f = mo76138f();
        String b = mo76135b();
        boolean i = mo76142i();
        boolean h = mo76140h();
        ((C19567d) ifVar.f226971aM.mo6453a()).mo24822a(1, str, str2, c, f, b, Boolean.valueOf(i), Boolean.valueOf(h), mo76139g());
    }

    /* renamed from: f */
    public abstract String mo76138f();

    /* renamed from: g */
    public abstract String mo76139g();

    /* renamed from: h */
    public abstract boolean mo76140h();

    /* renamed from: i */
    public abstract boolean mo76142i();
}
