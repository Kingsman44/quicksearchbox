package com.google.android.apps.gsa.staticplugins.searchboxroot.p8722b;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.b.a */
/* compiled from: PG */
public final class C116841a extends C41641b implements C89204i, C89203h {

    /* renamed from: a */
    public final C21370a f324288a;

    /* renamed from: b */
    public C89205j f324289b;

    /* renamed from: c */
    public long f324290c;

    /* renamed from: d */
    public long f324291d;

    /* renamed from: e */
    public long f324292e;

    /* renamed from: f */
    public int f324293f;

    /* renamed from: g */
    public int f324294g;

    public C116841a(C21370a aVar) {
        this.f324288a = aVar;
    }

    /* renamed from: a */
    public static int m194145a(long j, long j2) {
        return Math.max((int) (j2 - j), 0);
    }

    /* renamed from: e */
    public final void mo78004e() {
        C89205j jVar;
        C89205j jVar2;
        int i = this.f324293f;
        if (!(i == 0 || (jVar2 = this.f324289b) == null)) {
            jVar2.mo83171k("CONSTRUCT_TIME", i);
            this.f324293f = 0;
        }
        int i2 = this.f324294g;
        if (i2 != 0 && (jVar = this.f324289b) != null) {
            jVar.mo83171k("SETUP_TIME", i2);
            this.f324294g = 0;
        }
    }

    /* renamed from: f */
    public final void mo44231f(amt amt) {
        int i = ((apd) amt.instance).f159571O;
        C89205j jVar = this.f324289b;
        if (jVar != null) {
            i += jVar.mo83161a("CONSTRUCT_TIME") + this.f324289b.mo83161a("SETUP_TIME") + this.f324289b.mo83161a("START_TIME");
        }
        C58976aa aaVar = C58975e.f156826a;
        amt.copyOnWrite();
        apd apd = (apd) amt.instance;
        apd.f159610b |= 4096;
        apd.f159571O = i;
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f324289b = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        C58976aa aaVar = C58975e.f156826a;
        C89205j jVar = this.f324289b;
        if (jVar != null) {
            jVar.mo83171k("CONSTRUCT_TIME", 0);
            this.f324289b.mo83171k("SETUP_TIME", 0);
            this.f324289b.mo83171k("START_TIME", 0);
        }
    }
}
