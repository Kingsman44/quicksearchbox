package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.y */
/* compiled from: PG */
public final class C107374y {

    /* renamed from: a */
    public static final C59071e f298843a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.service.y");

    /* renamed from: b */
    public C58833ax f298844b;

    /* renamed from: c */
    public C58833ax f298845c;

    /* renamed from: d */
    public final List f298846d = new ArrayList();

    /* renamed from: e */
    public final C107375z f298847e;

    /* renamed from: f */
    private final Context f298848f;

    /* renamed from: g */
    private final C91142g f298849g;

    public C107374y(Context context, C107375z zVar, C91142g gVar) {
        C58836b bVar = C58836b.f156633a;
        this.f298844b = bVar;
        this.f298845c = bVar;
        this.f298848f = context;
        this.f298847e = zVar;
        this.f298849g = gVar;
    }

    /* renamed from: c */
    private final void m178275c(C58833ax axVar) {
        C58833ax axVar2 = this.f298844b;
        if (!axVar2.equals(axVar)) {
            this.f298844b = axVar;
            if (axVar.mo56113h()) {
                C107372w wVar = (C107372w) this.f298844b.mo56107c();
                if (!wVar.f298837i) {
                    wVar.f298837i = true;
                    C90730an.m148190c(axVar2, C107368s.f298823a);
                    C107367r rVar = wVar.f298833e;
                    C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
                    alVar.copyOnWrite();
                    C17883am amVar = (C17883am) alVar.instance;
                    amVar.f51245b = 4;
                    amVar.f51246c = true;
                    String str = wVar.f298831c;
                    alVar.copyOnWrite();
                    C17883am amVar2 = (C17883am) alVar.instance;
                    str.getClass();
                    amVar2.f51244a |= 1;
                    amVar2.f51247d = str;
                    rVar.mo95987b((C17883am) alVar.build());
                    C107367r rVar2 = wVar.f298833e;
                    C17882al alVar2 = (C17882al) C17883am.f51242f.createBuilder();
                    C17914p pVar = (C17914p) C17881ak.f51231h.createBuilder();
                    C17873ac acVar = wVar.f298839k;
                    pVar.copyOnWrite();
                    C17881ak akVar = (C17881ak) pVar.instance;
                    C17880aj ajVar = (C17880aj) acVar.build();
                    ajVar.getClass();
                    akVar.f51235c = ajVar;
                    akVar.f51233a |= 2;
                    alVar2.copyOnWrite();
                    C17883am amVar3 = (C17883am) alVar2.instance;
                    C17881ak akVar2 = (C17881ak) pVar.build();
                    akVar2.getClass();
                    amVar3.f51246c = akVar2;
                    amVar3.f51245b = 3;
                    String str2 = wVar.f298831c;
                    alVar2.copyOnWrite();
                    C17883am amVar4 = (C17883am) alVar2.instance;
                    str2.getClass();
                    amVar4.f51244a = 1 | amVar4.f51244a;
                    amVar4.f51247d = str2;
                    rVar2.mo95987b((C17883am) alVar2.build());
                }
            } else if (this.f298849g.mo85405j(C90014bt.f247040E) && axVar2.mo56113h()) {
                ((C107372w) axVar2.mo56107c()).mo95990a();
            }
        }
    }

    /* renamed from: a */
    public final void mo95993a(C107372w wVar) {
        synchronized (this.f298846d) {
            if (this.f298846d.remove(wVar)) {
                mo95994b();
            }
        }
    }

    /* renamed from: b */
    public final void mo95994b() {
        if (this.f298846d.isEmpty()) {
            m178275c(C58836b.f156633a);
            return;
        }
        C58485gu d = C89988b.m146551d(this.f298849g.mo85403h(C90014bt.f247847w));
        r2 = null;
        for (C107372w wVar : this.f298846d) {
            if (!d.contains(Integer.toString(C91042a.m148717a(wVar.f298831c)))) {
                String str = wVar.f298831c;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f298848f.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    ((C59052c) ((C59052c) f298843a.mo56226d()).mo56372aa(23787)).mo56386p("No running process");
                } else {
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (next.importance == 100 && next.pkgList != null && Arrays.asList(next.pkgList).contains(str)) {
                            m178275c(C58833ax.m90834k(wVar));
                            return;
                        }
                    }
                    continue;
                }
            }
        }
        m178275c(C58833ax.m90833j(wVar));
    }
}
