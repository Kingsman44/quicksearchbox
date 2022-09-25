package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83311if;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aed;
import com.google.common.p4552o.aee;
import com.google.common.p4552o.aef;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.mt */
/* compiled from: PG */
public abstract class C82642mt implements C82548jg {
    /* renamed from: a */
    public final aef mo75580a() {
        aec aec = (aec) aef.f158453e.createBuilder();
        aec.copyOnWrite();
        aef aef = (aef) aec.instance;
        aef.f158455a |= 1;
        aef.f158456b = "NGA_POP_FULFILLMENT_STATS";
        aed aed = (aed) aee.f158447e.createBuilder();
        aed.copyOnWrite();
        aee aee = (aee) aed.instance;
        aee.f158449a |= 1;
        aee.f158452d = "missing_context_retries";
        int b = mo76096b();
        aed.copyOnWrite();
        aee aee2 = (aee) aed.instance;
        aee2.f158450b = 2;
        aee2.f158451c = Long.valueOf((long) b);
        aec.mo56976a((aee) aed.build());
        aed aed2 = (aed) aee.f158447e.createBuilder();
        aed2.copyOnWrite();
        aee aee3 = (aee) aed2.instance;
        aee3.f158449a |= 1;
        aee3.f158452d = "is_pop_enabled";
        aed2.copyOnWrite();
        aee aee4 = (aee) aed2.instance;
        aee4.f158450b = 3;
        aee4.f158451c = Boolean.valueOf(mo76105k());
        aec.mo56976a((aee) aed2.build());
        aed aed3 = (aed) aee.f158447e.createBuilder();
        aed3.copyOnWrite();
        aee aee5 = (aee) aed3.instance;
        aee5.f158449a |= 1;
        aee5.f158452d = "is_grpc_enabled";
        boolean j = mo76104j();
        aed3.copyOnWrite();
        aee aee6 = (aee) aed3.instance;
        aee6.f158450b = 3;
        aee6.f158451c = Boolean.valueOf(j);
        aec.mo56976a((aee) aed3.build());
        aed aed4 = (aed) aee.f158447e.createBuilder();
        aed4.copyOnWrite();
        aee aee7 = (aee) aed4.instance;
        aee7.f158449a |= 1;
        aee7.f158452d = "locale";
        String h = mo76101h();
        aed4.copyOnWrite();
        aee aee8 = (aee) aed4.instance;
        h.getClass();
        aee8.f158450b = 4;
        aee8.f158451c = h;
        aec.mo56976a((aee) aed4.build());
        aed aed5 = (aed) aee.f158447e.createBuilder();
        aed5.copyOnWrite();
        aee aee9 = (aee) aed5.instance;
        aee9.f158449a |= 1;
        aee9.f158452d = "pop_group";
        int c = mo76097c();
        aed5.copyOnWrite();
        aee aee10 = (aee) aed5.instance;
        aee10.f158450b = 2;
        aee10.f158451c = Long.valueOf((long) c);
        aec.mo56976a((aee) aed5.build());
        aed aed6 = (aed) aee.f158447e.createBuilder();
        aed6.copyOnWrite();
        aee aee11 = (aee) aed6.instance;
        aee11.f158449a |= 1;
        aee11.f158452d = "context_failures";
        String g = mo76100g();
        aed6.copyOnWrite();
        aee aee12 = (aee) aed6.instance;
        g.getClass();
        aee12.f158450b = 4;
        aee12.f158451c = g;
        aec.mo56976a((aee) aed6.build());
        aed aed7 = (aed) aee.f158447e.createBuilder();
        aed7.copyOnWrite();
        aee aee13 = (aee) aed7.instance;
        aee13.f158449a |= 1;
        aee13.f158452d = "status";
        int f = mo76099f();
        aed7.copyOnWrite();
        aee aee14 = (aee) aed7.instance;
        aee14.f158450b = 2;
        aee14.f158451c = Long.valueOf((long) f);
        aec.mo56976a((aee) aed7.build());
        aed aed8 = (aed) aee.f158447e.createBuilder();
        aed8.copyOnWrite();
        aee aee15 = (aee) aed8.instance;
        aee15.f158449a |= 1;
        aee15.f158452d = "webref_group";
        String i = mo76103i();
        aed8.copyOnWrite();
        aee aee16 = (aee) aed8.instance;
        i.getClass();
        aee16.f158450b = 4;
        aee16.f158451c = i;
        aec.mo56976a((aee) aed8.build());
        return (aef) aec.build();
    }

    /* renamed from: b */
    public abstract int mo76096b();

    /* renamed from: c */
    public abstract int mo76097c();

    /* renamed from: d */
    public abstract String mo75583d();

    /* renamed from: e */
    public final void mo75584e(String str, String str2, C83311if ifVar) {
        int b = mo76096b();
        boolean j = mo76104j();
        String h = mo76101h();
        int c = mo76097c();
        String g = mo76100g();
        int f = mo76099f();
        ((C19567d) ifVar.f227115q.mo6453a()).mo24822a(1, str, str2, Integer.valueOf(b), Boolean.valueOf(mo76105k()), Boolean.valueOf(j), h, Integer.valueOf(c), g, Integer.valueOf(f), mo76103i());
    }

    /* renamed from: f */
    public abstract int mo76099f();

    /* renamed from: g */
    public abstract String mo76100g();

    /* renamed from: h */
    public abstract String mo76101h();

    /* renamed from: i */
    public abstract String mo76103i();

    /* renamed from: j */
    public abstract boolean mo76104j();

    /* renamed from: k */
    public abstract boolean mo76105k();
}
