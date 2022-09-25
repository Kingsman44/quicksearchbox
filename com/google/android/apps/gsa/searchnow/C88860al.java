package com.google.android.apps.gsa.searchnow;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.overlay.C87662k;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87625ad;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90285a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90293i;
import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89425a;
import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89426b;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.lens.p4707j.C62433bj;

/* renamed from: com.google.android.apps.gsa.searchnow.al */
/* compiled from: PG */
final class C88860al extends C87662k {

    /* renamed from: a */
    final /* synthetic */ C88861am f240570a;

    public C88860al(C88861am amVar) {
        this.f240570a = amVar;
    }

    /* renamed from: b */
    public final void mo76788b() {
    }

    /* renamed from: c */
    public final void mo76789c(boolean z) {
        int i;
        C139921f fVar = this.f240570a.f240572B;
        C24970c cVar = new C24970c();
        cVar.f68114v = false;
        cVar.f68102j = this.f240570a.f240601b.getPackageName();
        cVar.f68093a = true;
        if (z) {
            i = C62433bj.LENS_IN_SEARCH_PLATE_HOMESCREEN.f168594ao;
        } else {
            i = C62433bj.LENS_IN_SEARCH_PLATE.f168594ao;
        }
        cVar.f68105m = i;
        cVar.f68118z = Long.valueOf(this.f240570a.f240597a.mo26872d());
        fVar.mo115338b(cVar.mo30192a());
    }

    /* renamed from: d */
    public final void mo76790d() {
        C87625ad adVar = this.f240570a.f240603d;
        if (adVar != null) {
            adVar.mo81810ar();
        }
        C89949q.m146523g(516);
        C88861am amVar = this.f240570a;
        if (amVar.f240577G.f240627b) {
            Intent intent = new Intent("android.intent.action.MAIN");
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.HOME_SCREEN);
            C136127h.m221196a(intent, l.mo112766a());
            intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
            intent.putExtra("SKIP_EXIT_ANIMATION", true);
            intent.putExtra("EXTRA_FINISH_ACTIVITY_AND_REMOVE_TASK", true);
            this.f240570a.f240604e.mo65089a(intent);
            return;
        }
        this.f240570a.f240601b.startActivity(C89429a.m145443a(amVar.f240601b, amVar.f240603d.f236804aG));
    }

    /* renamed from: e */
    public final void mo76791e() {
    }

    /* renamed from: f */
    public final boolean mo76792f() {
        return false;
    }

    /* renamed from: h */
    public final C89426b mo81857h() {
        C90285a aVar = this.f240570a.f240585O;
        if (aVar != null) {
            return aVar.mo83985b();
        }
        C89425a aVar2 = (C89425a) C89426b.f242410f.createBuilder();
        aVar2.copyOnWrite();
        C89426b bVar = (C89426b) aVar2.instance;
        bVar.f242412a |= 1;
        bVar.f242413b = false;
        return (C89426b) aVar2.build();
    }

    /* renamed from: i */
    public final void mo81858i() {
        this.f240570a.f240619t = true;
    }

    /* renamed from: j */
    public final void mo81859j() {
        this.f240570a.f240620u = true;
    }

    /* renamed from: k */
    public final void mo81860k() {
    }

    /* renamed from: m */
    public final boolean mo81862m(boolean z) {
        int i = 1;
        if (!z && this.f240570a.f240583M == C90208n.INTERESTS_TAB) {
            C139701a aVar = this.f240570a.f240571A;
            aVar.mo115171b();
            aVar.f379694a.mo19974a(C37182a.f97821b);
            aVar.f379697d.mo41723l("CLASSIC");
            aVar.f379695b = true;
        }
        this.f240570a.mo82643c();
        this.f240570a.mo82642b();
        if (z || !this.f240570a.f240577G.f240628c) {
            boolean z2 = false;
            boolean z3 = this.f240570a.f240622w.mo85405j(C90014bt.f247387gG) || this.f240570a.f240622w.mo85405j(C90110fh.f250670bO);
            if (z && z3) {
                z2 = true;
            }
            if (!z || !z2) {
                i = z ? 3 : 2;
            }
            boolean b = this.f240570a.f240616q.mo83202b(i);
            this.f240570a.mo82649j();
            return b;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        C136127h.m221196a(intent, l.mo112766a());
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
        intent.putExtra("SKIP_EXIT_ANIMATION", true);
        this.f240570a.f240604e.mo65089a(intent);
        return true;
    }

    /* renamed from: n */
    public final boolean mo81863n() {
        C88861am amVar = this.f240570a;
        if (C90293i.m146825a(amVar.f240589S)) {
            return false;
        }
        C87625ad adVar = amVar.f240603d;
        if (adVar != null) {
            adVar.mo81820p(true);
        }
        this.f240570a.f240616q.mo83202b(2);
        this.f240570a.mo82649j();
        this.f240570a.mo82642b();
        return true;
    }

    /* renamed from: o */
    public final void mo81864o() {
        this.f240570a.mo82649j();
    }

    /* renamed from: p */
    public final void mo81865p() {
    }

    /* renamed from: l */
    public final void mo81861l(boolean z) {
        C90285a aVar = this.f240570a.f240585O;
        aVar.getClass();
        aVar.mo83987d(z);
    }
}
