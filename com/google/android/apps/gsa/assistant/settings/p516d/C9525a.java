package com.google.android.apps.gsa.assistant.settings.p516d;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.n.c;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73892d;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.staticplugins.p7815dk.C99639m;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C50138lz;
import com.google.assistant.p3861at.C50140ma;
import com.google.assistant.p3861at.C50141mb;
import com.google.assistant.p3861at.C50142mc;
import com.google.assistant.p3861at.C50143md;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66595bu;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.assistant.settings.d.a */
/* compiled from: PG */
public final class C9525a {

    /* renamed from: a */
    public final l f33027a;

    /* renamed from: b */
    private final h f33028b;

    public C9525a(Context context, h hVar, l lVar) {
        C49875cf cfVar;
        this.f33028b = hVar;
        this.f33027a = lVar;
        if (C90685b.m148054b(context, (C90021c) null)) {
            cfVar = C49875cf.ANDROID_TABLET;
        } else {
            cfVar = C49875cf.NEXUS;
        }
        lVar.f(cfVar);
    }

    /* renamed from: j */
    private static C50144me m24151j() {
        C50143md mdVar = (C50143md) C50144me.f130361d.createBuilder();
        C50138lz lzVar = (C50138lz) C50140ma.f130352d.createBuilder();
        lzVar.copyOnWrite();
        C50140ma maVar = (C50140ma) lzVar.instance;
        maVar.f130354a |= 1;
        maVar.f130355b = true;
        lzVar.copyOnWrite();
        C50140ma maVar2 = (C50140ma) lzVar.instance;
        maVar2.f130354a |= 2;
        maVar2.f130356c = true;
        mdVar.copyOnWrite();
        C50144me meVar = (C50144me) mdVar.instance;
        C50140ma maVar3 = (C50140ma) lzVar.build();
        maVar3.getClass();
        meVar.f130365c = maVar3;
        meVar.f130363a |= 2;
        C50141mb mbVar = (C50141mb) C50142mc.f130357c.createBuilder();
        mbVar.copyOnWrite();
        C50142mc mcVar = (C50142mc) mbVar.instance;
        mcVar.f130359a |= 1;
        mcVar.f130360b = true;
        mdVar.copyOnWrite();
        C50144me meVar2 = (C50144me) mdVar.instance;
        C50142mc mcVar2 = (C50142mc) mbVar.build();
        mcVar2.getClass();
        meVar2.f130364b = mcVar2;
        meVar2.f130363a |= 1;
        return (C50144me) mdVar.build();
    }

    /* renamed from: a */
    public final void mo17836a(String str) {
        this.f33027a.g(str);
    }

    /* renamed from: b */
    public final C99639m mo17837b(C73892d dVar) {
        C58976aa aaVar = C58975e.f156826a;
        c a = dVar.mo65369a();
        a.e((acv) ((acu) dVar.mo65371c().toBuilder()).build());
        if (!dVar.mo65372d().mo56113h()) {
            a.b(C58833ax.m90833j(this.f33028b.a()));
        }
        l lVar = this.f33027a;
        a.f(C58833ax.m90833j(getClass().getSimpleName()));
        return lVar.h(a.a());
    }

    @Deprecated
    /* renamed from: c */
    public final C99639m mo17838c(acu acu, k kVar) {
        return mo17839d(this.f33028b.a(), acu, kVar, (k) null, (String) null);
    }

    @Deprecated
    /* renamed from: d */
    public final C99639m mo17839d(Account account, acu acu, k kVar, k kVar2, String str) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f33027a.i(account, (acv) acu.build(), m24151j(), kVar, kVar2, str, getClass().getSimpleName());
    }

    /* renamed from: e */
    public final C60870cx mo17840e(acu acu, TimeUnit timeUnit) {
        return mo17841f((acv) acu.build(), timeUnit);
    }

    /* renamed from: f */
    public final C60870cx mo17841f(acv acv, TimeUnit timeUnit) {
        return this.f33027a.j(this.f33028b.a(), acv, m24151j(), 5, timeUnit, getClass().getSimpleName());
    }

    /* renamed from: g */
    public final C99639m mo17842g(acx acx, k kVar) {
        return mo17843h(this.f33028b.a(), acx, kVar);
    }

    /* renamed from: h */
    public final C99639m mo17843h(Account account, acx acx, k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f33027a.m(account, (C66595bu) null, acx, kVar, getClass().getSimpleName());
    }

    /* renamed from: i */
    public final void mo17844i(acx acx, k kVar) {
        mo17843h(this.f33028b.a(), acx, kVar);
    }
}
