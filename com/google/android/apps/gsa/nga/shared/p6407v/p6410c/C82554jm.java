package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.jm */
/* compiled from: PG */
public abstract class C82554jm implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_AUDIO_FORMAT";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "session_type";
        String h = mo75714h();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        h.getClass();
        aee2.f158450b = 4;
        aee2.f158451c = h;
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "channel_count";
        int b = mo75709b();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 2;
        aee4.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "encoding";
        int c = mo75710c();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 2;
        aee6.f158451c = Long.valueOf((long) c);
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "sample_rate";
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        aee8.f158450b = 2;
        aee8.f158451c = Long.valueOf((long) mo75712f());
        aec.mo56976a((aee) aed4.build());
        aed aed5 = (aed) aee.f158447e.createBuilder();
        aed5.copyOnWrite();
        aee aee9 = (aee) aed5.instance;
        aee9.f158449a |= 1;
        aee9.f158452d = "engine";
        String g = mo75713g();
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        g.getClass();
        aee10.f158450b = 4;
        aee10.f158451c = g;
        aec.mo56976a((aee) aed5.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo75709b();

    /* renamed from: c */
    public abstract int mo75710c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        String h = mo75714h();
        int b = mo75709b();
        int c = mo75710c();
        int f = mo75712f();
        ((C19567d) ifVar.f227050bm.mo6453a()).mo24822a(1, h, Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(f), mo75713g());
    }

    /* renamed from: f */
    public abstract int mo75712f();

    /* renamed from: g */
    public abstract String mo75713g();

    /* renamed from: h */
    public abstract String mo75714h();
}
