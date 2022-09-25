package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.p098j.C2069cc;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33563d;
import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.al */
/* compiled from: PG */
final class C121915al implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C121916am f338302a;

    /* renamed from: b */
    final /* synthetic */ Fragment f338303b;

    /* renamed from: c */
    final /* synthetic */ C33563d f338304c;

    /* renamed from: d */
    final /* synthetic */ C34037b f338305d;

    public C121915al(C121916am amVar, Fragment fragment, C33563d dVar, C34037b bVar) {
        this.f338302a = amVar;
        this.f338303b = fragment;
        this.f338304c = dVar;
        this.f338305d = bVar;
    }

    public final void run() {
        C121928ay ayVar = this.f338302a.f338312g;
        if (ayVar == null) {
            C59052c cVar = (C59052c) C121916am.f338306a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
            cVar.mo56379ah(new C59094n(36053));
            cVar.mo56386p("showFragment: showing new window");
            C121916am amVar = this.f338302a;
            Fragment fragment = this.f338303b;
            C33563d dVar = this.f338304c;
            C34037b bVar = this.f338305d;
            long incrementAndGet = amVar.f338311f.f338380a.incrementAndGet();
            C121909af e = amVar.mo105444e(incrementAndGet, bVar);
            C121928ay ayVar2 = new C121928ay(incrementAndGet, fragment, dVar, e, (Context) amVar.f338314i.f199133a.a.g.mo17428b());
            Window window = ayVar2.getWindow();
            C69664n.m101058d(window);
            IBinder iBinder = amVar.f338307b;
            C69664n.m101061g(window, "window");
            C69664n.m101061g(iBinder, "token");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.token = iBinder;
            layoutParams.type = 2031;
            window.setAttributes(layoutParams);
            window.clearFlags(134217728);
            window.setNavigationBarColor(0);
            window.setNavigationBarContrastEnforced(false);
            window.clearFlags(67108864);
            window.setStatusBarColor(0);
            window.getDecorView().setBackgroundColor(0);
            C2069cc.m5650a(window, false);
            C69664n.m101061g(window, "window");
            AccountId accountId = amVar.f338308c;
            C28306ab abVar = amVar.f338310e;
            View h = C121916am.m201383h(window);
            C28313c a = amVar.f338309d.mo33805a(C28427h.m53115a(152716));
            a.mo33861i(C28439i.f77216b);
            a.mo33859g(C28375ak.m53061c(152717));
            a.mo33859g(C45954d.m82060a(accountId));
            abVar.mo33801b(h, a);
            ayVar2.show();
            ayVar2.setOnCancelListener(new C121910ag(amVar));
            ayVar2.setOnDismissListener(new C121911ah(amVar));
            amVar.f338312g = ayVar2;
            amVar.f338313h = e;
            return;
        }
        C59052c cVar2 = (C59052c) C121916am.f338306a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
        cVar2.mo56379ah(new C59094n(36052));
        cVar2.mo56386p("showFragment: reusing existing window");
        C121916am amVar2 = this.f338302a;
        Fragment fragment2 = this.f338303b;
        C34037b bVar2 = this.f338305d;
        amVar2.mo105446g("replacingFragment");
        C121909af e2 = amVar2.mo105444e(ayVar.f338336b, bVar2);
        Window window2 = ayVar.getWindow();
        C69664n.m101058d(window2);
        C28306ab.m52931g(C121916am.m201383h(window2));
        C59052c cVar3 = (C59052c) C121928ay.f338335a.mo56224b();
        cVar3.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Window");
        Fragment a2 = ayVar.mo105451a();
        String c = a2 != null ? C33914a.m62568c(a2) : null;
        String c2 = C33914a.m62568c(fragment2);
        cVar3.mo56379ah(new C59094n(36076));
        cVar3.mo56354G("replaceFragment old: %s, new: %s", c, c2);
        C121955p pVar = ayVar.f338338d;
        if (pVar == null) {
            C69664n.m101065k("fragmentHost");
            pVar = null;
        }
        pVar.mo51126e();
        C121955p pVar2 = ayVar.f338338d;
        if (pVar2 == null) {
            C69664n.m101065k("fragmentHost");
            pVar2 = null;
        }
        pVar2.mo22016h();
        C121955p pVar3 = ayVar.f338338d;
        if (pVar3 == null) {
            C69664n.m101065k("fragmentHost");
            pVar3 = null;
        }
        pVar3.mo51129jQ();
        ayVar.f338337c = e2;
        ayVar.f338338d = ayVar.mo105452b();
        C121955p pVar4 = ayVar.f338338d;
        if (pVar4 == null) {
            C69664n.m101065k("fragmentHost");
            pVar4 = null;
        }
        pVar4.mo19987jP((Bundle) null);
        C121955p pVar5 = ayVar.f338338d;
        if (pVar5 == null) {
            C69664n.m101065k("fragmentHost");
            pVar5 = null;
        }
        pVar5.mo51128g();
        C121955p pVar6 = ayVar.f338338d;
        if (pVar6 == null) {
            C69664n.m101065k("fragmentHost");
            pVar6 = null;
        }
        pVar6.mo51127f();
        C121955p pVar7 = ayVar.f338338d;
        if (pVar7 == null) {
            C69664n.m101065k("fragmentHost");
            pVar7 = null;
        }
        C0154a aVar = new C0154a(pVar7.mo51122q());
        aVar.mo689v(16908290, fragment2, (String) null);
        aVar.mo509f();
        amVar2.f338313h = e2;
    }
}
