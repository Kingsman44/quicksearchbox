package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.j */
/* compiled from: PG */
public final class C88687j extends C41641b implements C89204i, C89203h {

    /* renamed from: a */
    public final C21370a f239792a;

    /* renamed from: b */
    public long f239793b;

    /* renamed from: c */
    private long f239794c;

    /* renamed from: d */
    private int f239795d;

    /* renamed from: e */
    private boolean f239796e;

    /* renamed from: f */
    private long f239797f;

    /* renamed from: g */
    private int f239798g;

    /* renamed from: h */
    private int f239799h;

    /* renamed from: i */
    private C89205j f239800i;

    public C88687j(C21370a aVar) {
        this.f239792a = aVar;
        this.f239793b = aVar.mo26871c();
    }

    /* renamed from: j */
    private static int m143503j(long j, long j2) {
        return Math.max((int) (j2 - j), 0);
    }

    /* renamed from: a */
    public final void mo82381a() {
        this.f239797f = this.f239792a.mo26871c();
    }

    /* renamed from: c */
    public final void mo82382c() {
        this.f239794c = this.f239792a.mo26871c();
    }

    /* renamed from: e */
    public final void mo78004e() {
        C89205j jVar = this.f239800i;
        jVar.getClass();
        if (!jVar.mo83177q("SESSION_START_TIME")) {
            C58976aa aaVar = C58975e.f156826a;
            jVar.mo83173m("SESSION_START_TIME", this.f239793b);
            jVar.mo83170j("LOGGED_INSTALL", this.f239796e);
            jVar.mo83171k("INSTALL_TIME", this.f239795d);
            jVar.mo83171k("ATTACH_TIME", this.f239798g);
            jVar.mo83171k("STARTUP_RENDERED_RESPONSE_TIME", this.f239799h);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f239793b = jVar.mo83162b("SESSION_START_TIME");
        this.f239796e = jVar.mo83178r("LOGGED_INSTALL");
        this.f239795d = jVar.mo83161a("INSTALL_TIME");
        this.f239798g = jVar.mo83161a("ATTACH_TIME");
        this.f239799h = jVar.mo83161a("STARTUP_RENDERED_RESPONSE_TIME");
    }

    /* renamed from: f */
    public final void mo44231f(amt amt) {
        int i = this.f239795d;
        if (i != 0) {
            this.f239796e = true;
        } else {
            i = 0;
        }
        int i2 = this.f239798g;
        if (i2 != 0) {
            i += i2;
        }
        if (i != 0) {
            C58976aa aaVar = C58975e.f156826a;
            amt.copyOnWrite();
            apd apd = (apd) amt.instance;
            apd apd2 = apd.f159555aA;
            apd.f159610b |= 4096;
            apd.f159571O = i;
        }
        if (this.f239799h != 0) {
            C58976aa aaVar2 = C58975e.f156826a;
            int i3 = this.f239799h;
            amt.copyOnWrite();
            apd apd3 = (apd) amt.instance;
            apd apd4 = apd.f159555aA;
            apd3.f159610b |= 8192;
            apd3.f159572P = i3;
        }
    }

    /* renamed from: g */
    public final void mo82383g() {
        long j = this.f239797f;
        if (j != 0 && this.f239798g == 0) {
            int j2 = m143503j(j, this.f239792a.mo26871c());
            C58976aa aaVar = C58975e.f156826a;
            this.f239798g = j2;
            C89205j jVar = this.f239800i;
            if (jVar != null) {
                jVar.mo83171k("ATTACH_TIME", j2);
            }
        }
    }

    /* renamed from: h */
    public final void mo82384h() {
        long j = this.f239794c;
        if (j != 0) {
            int j2 = m143503j(j, this.f239792a.mo26871c());
            C58976aa aaVar = C58975e.f156826a;
            this.f239795d = j2;
            C89205j jVar = this.f239800i;
            if (jVar != null) {
                jVar.mo83171k("INSTALL_TIME", j2);
            }
        }
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239800i = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        C58976aa aaVar = C58975e.f156826a;
        long c = this.f239792a.mo26871c();
        this.f239793b = c;
        if (this.f239796e) {
            this.f239795d = 0;
        }
        this.f239798g = 0;
        this.f239799h = 0;
        C89205j jVar = this.f239800i;
        if (jVar != null) {
            jVar.mo83173m("SESSION_START_TIME", c);
            this.f239800i.mo83170j("LOGGED_INSTALL", this.f239796e);
            this.f239800i.mo83171k("INSTALL_TIME", this.f239795d);
            this.f239800i.mo83171k("ATTACH_TIME", this.f239798g);
            this.f239800i.mo83171k("STARTUP_RENDERED_RESPONSE_TIME", this.f239799h);
        }
    }

    /* renamed from: i */
    public final void mo82385i(long j) {
        if (this.f239799h == 0) {
            int j2 = m143503j(j, this.f239792a.mo26871c());
            C58976aa aaVar = C58975e.f156826a;
            this.f239799h = j2;
            C89205j jVar = this.f239800i;
            if (jVar != null) {
                jVar.mo83171k("STARTUP_RENDERED_RESPONSE_TIME", j2);
            }
        }
    }
}
