package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ll */
/* compiled from: PG */
public abstract class C82607ll implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_JINN_SPEECH_REWRITE";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "recognition_engine";
        String f = mo75935f();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        f.getClass();
        aee2.f158450b = 4;
        aee2.f158451c = f;
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "event_type";
        String b = mo75932b();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        b.getClass();
        aee4.f158450b = 4;
        aee4.f158451c = b;
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "rewritten_by_jinn";
        boolean g = mo75936g();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 3;
        aee6.f158451c = Boolean.valueOf(g);
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "top_hypothesis_generated_by_jinn";
        boolean h = mo75937h();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        aee8.f158450b = 3;
        aee8.f158451c = Boolean.valueOf(h);
        aec.mo56976a((aee) aed4.build());
        aed aed5 = (aed) aee.f158447e.createBuilder();
        aed5.copyOnWrite();
        aee aee9 = (aee) aed5.instance;
        aee9.f158449a |= 1;
        aee9.f158452d = "jinn_rewrite_source_type";
        String c = mo75933c();
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        c.getClass();
        aee10.f158450b = 4;
        aee10.f158451c = c;
        aec.mo56976a((aee) aed5.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract String mo75932b();

    /* renamed from: c */
    public abstract String mo75933c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        String f = mo75935f();
        String b = mo75932b();
        boolean g = mo75936g();
        boolean h = mo75937h();
        ((C19567d) ifVar.f226952U.mo6453a()).mo24822a(1, str, str2, f, b, Boolean.valueOf(g), Boolean.valueOf(h), mo75933c());
    }

    /* renamed from: f */
    public abstract String mo75935f();

    /* renamed from: g */
    public abstract boolean mo75936g();

    /* renamed from: h */
    public abstract boolean mo75937h();
}
