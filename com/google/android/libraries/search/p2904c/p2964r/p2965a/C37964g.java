package com.google.android.libraries.search.p2904c.p2964r.p2965a;

import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2904c.C37464cm;
import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.c.r.a.g */
/* compiled from: PG */
final class C37964g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f100584a;

    /* renamed from: b */
    final /* synthetic */ C37467cp f100585b;

    /* renamed from: c */
    final /* synthetic */ C37965h f100586c;

    public C37964g(C37965h hVar, C58872ci ciVar, C37467cp cpVar) {
        this.f100586c = hVar;
        this.f100584a = ciVar;
        this.f100585b = cpVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C37965h.f100587a.mo56226d()).mo56382g(th)).mo56372aa(52875)).mo56386p("#audio# Logging Audio Route Status failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58872ci ciVar = this.f100584a;
        ciVar.mo56162g();
        long a = ciVar.mo56158a(TimeUnit.MILLISECONDS);
        ((C19569f) ((C39141kp) this.f100586c.f100588b.mo27525b()).f102852aj.mo6453a()).mo24824b((double) a, C37465cn.m66491a(this.f100585b.f99460a).name());
        ((C58970a) ((C58970a) C37965h.f100587a.mo56226d()).mo56372aa(52876)).mo56388r("#audio# Routing took %d ms", a);
        C39141kp kpVar = (C39141kp) this.f100586c.f100588b.mo27525b();
        String name = C37465cn.m66491a(this.f100585b.f99460a).name();
        C37504dk a2 = C37504dk.m66506a(((C37464cm) obj).f99449b);
        if (a2 == null) {
            a2 = C37504dk.UNKNOWN_ROUTING_STATUS;
        }
        ((C19567d) kpVar.f102853ak.mo6453a()).mo24822a(1, name, a2.name());
    }
}
