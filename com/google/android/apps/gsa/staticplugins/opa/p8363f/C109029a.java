package com.google.android.apps.gsa.staticplugins.opa.p8363f;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.shared.bg;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.f.a */
/* compiled from: PG */
public final class C109029a {

    /* renamed from: a */
    public final bm f303182a;

    /* renamed from: b */
    public final C68214a f303183b;

    /* renamed from: c */
    public final C68214a f303184c;

    /* renamed from: d */
    public final C9325m f303185d;

    /* renamed from: e */
    public final C113787bc f303186e;

    /* renamed from: f */
    private final Context f303187f;

    /* renamed from: g */
    private final bg f303188g;

    /* renamed from: h */
    private final C86124t f303189h;

    public C109029a(Context context, bm bmVar, bg bgVar, C113787bc bcVar, C86124t tVar, C68214a aVar, C68214a aVar2, C9325m mVar) {
        this.f303187f = context;
        this.f303182a = bmVar;
        this.f303188g = bgVar;
        this.f303186e = bcVar;
        this.f303189h = tVar;
        this.f303183b = aVar;
        this.f303184c = aVar2;
        this.f303185d = mVar;
    }

    /* renamed from: a */
    public final boolean mo97396a(Account account) {
        C58976aa aaVar = C58975e.f156826a;
        int g = mo97402g(account);
        return mo97404i(g) || g == 3;
    }

    /* renamed from: b */
    public final boolean mo97397b() {
        return this.f303182a.u();
    }

    /* renamed from: c */
    public final boolean mo97398c() {
        if (((Boolean) this.f303183b.mo27525b()).booleanValue() || !this.f303182a.u() || !this.f303182a.w() || !this.f303185d.mo17534a() || !((C84413ad) this.f303184c.mo27525b()).mo77971h()) {
            return false;
        }
        this.f303186e.mo100632l();
        return true;
    }

    /* renamed from: d */
    public final boolean mo97399d() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f303182a.u();
    }

    /* renamed from: e */
    public final boolean mo97400e() {
        return C90771bo.m148273b(this.f303187f, UserHandleCompat.m148154a());
    }

    /* renamed from: f */
    public final int mo97401f(Account account) {
        int g = mo97402g(account);
        C58976aa aaVar = C58975e.f156826a;
        if (mo97404i(g)) {
            return 1;
        }
        if (mo97403h(g)) {
            return 2;
        }
        if (this.f303189h.mo79746e(C90086ek.f250443dI)) {
            return 1;
        }
        return 3;
    }

    /* renamed from: g */
    public final int mo97402g(Account account) {
        String str = account == null ? null : account.name;
        if (!this.f303182a.u()) {
            C58976aa aaVar = C58975e.f156826a;
            return 1;
        }
        boolean w = this.f303182a.w();
        boolean c = str != null ? this.f303188g.c(str) : false;
        if (str == null) {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        if (c) {
            return true != w ? 4 : 5;
        }
        if (!w) {
            return 2;
        }
        if (((Boolean) this.f303183b.mo27525b()).booleanValue()) {
            return 7;
        }
        if (!this.f303189h.mo79746e(C90014bt.f247319es) || !this.f303186e.mo100628h(str)) {
            return 3;
        }
        return 6;
    }

    /* renamed from: h */
    public final boolean mo97403h(int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f303182a.r();
        return !this.f303182a.r() || i == 1;
    }

    /* renamed from: i */
    public final boolean mo97404i(int i) {
        boolean z;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f303189h.mo79746e(C90053de.f248960a) || i != 3) {
            z = false;
        } else {
            i = 3;
            z = true;
        }
        return i == 5 || z || i == 6 || i == 7;
    }

    /* renamed from: j */
    public final boolean mo97405j() {
        C58976aa aaVar = C58975e.f156826a;
        if (mo97400e()) {
            return false;
        }
        return mo97398c();
    }
}
