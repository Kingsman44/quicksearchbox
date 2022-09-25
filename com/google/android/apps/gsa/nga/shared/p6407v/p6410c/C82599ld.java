package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ld */
/* compiled from: PG */
public abstract class C82599ld implements C82548jg {
    /* renamed from: l */
    public static C82598lc m131673l() {
        C82368cp cpVar = new C82368cp();
        cpVar.f225012a = "NGA_HOTWORD";
        return cpVar;
    }

    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_HOTWORD";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "source";
        String g = mo75894g();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        g.getClass();
        aee2.f158450b = 4;
        aee2.f158451c = g;
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "stage";
        int b = mo75890b();
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 2;
        aee4.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "speech_recognizer";
        String h = mo75895h();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        h.getClass();
        aee6.f158450b = 4;
        aee6.f158451c = h;
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "voice_match";
        String j = mo75898j();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        j.getClass();
        aee8.f158450b = 4;
        aee8.f158451c = j;
        aec.mo56976a((aee) aed4.build());
        aed aed5 = (aed) aee.f158447e.createBuilder();
        aed5.copyOnWrite();
        aee aee9 = (aee) aed5.instance;
        aee9.f158449a |= 1;
        aee9.f158452d = "trigger_type";
        String i = mo75897i();
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        i.getClass();
        aee10.f158450b = 4;
        aee10.f158451c = i;
        aec.mo56976a((aee) aed5.build());
        aed aed6 = (aed) aee.f158447e.createBuilder();
        aed6.copyOnWrite();
        aee aee11 = (aee) aed6.instance;
        aee11.f158449a |= 1;
        aee11.f158452d = "delegated_to_nga";
        boolean k = mo75899k();
        aed6.copyOnWrite();
        aee aee12 = (aee) aed6.instance;
        aee12.f158450b = 3;
        aee12.f158451c = Boolean.valueOf(k);
        aec.mo56976a((aee) aed6.build());
        aed aed7 = (aed) aee.f158447e.createBuilder();
        aed7.copyOnWrite();
        aee aee13 = (aee) aed7.instance;
        aee13.f158449a |= 1;
        aee13.f158452d = "screen_locked";
        String f = mo75893f();
        aed7.copyOnWrite();
        aee aee14 = (aee) aed7.instance;
        f.getClass();
        aee14.f158450b = 4;
        aee14.f158451c = f;
        aec.mo56976a((aee) aed7.build());
        aed aed8 = (aed) aee.f158447e.createBuilder();
        aed8.copyOnWrite();
        aee aee15 = (aee) aed8.instance;
        aee15.f158449a |= 1;
        aee15.f158452d = "pixel_four_or_higher";
        String c = mo75891c();
        aed8.copyOnWrite();
        aee aee16 = (aee) aed8.instance;
        c.getClass();
        aee16.f158450b = 4;
        aee16.f158451c = c;
        aec.mo56976a((aee) aed8.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo75890b();

    /* renamed from: c */
    public abstract String mo75891c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        String g = mo75894g();
        int b = mo75890b();
        String h = mo75895h();
        String j = mo75898j();
        String i = mo75897i();
        boolean k = mo75899k();
        ((C19567d) ifVar.f226973aO.mo6453a()).mo24822a(1, str, str2, g, Integer.valueOf(b), h, j, i, Boolean.valueOf(k), mo75893f(), mo75891c());
    }

    /* renamed from: f */
    public abstract String mo75893f();

    /* renamed from: g */
    public abstract String mo75894g();

    /* renamed from: h */
    public abstract String mo75895h();

    /* renamed from: i */
    public abstract String mo75897i();

    /* renamed from: j */
    public abstract String mo75898j();

    /* renamed from: k */
    public abstract boolean mo75899k();
}
