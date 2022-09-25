package com.google.android.libraries.notifications.p2268e.p2279f.p2280a;

import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29793g;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29824o;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2277e.C29847a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30115i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55526af;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55538ar;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55545ay;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55560bm;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55562bo;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55568d;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55579o;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55586v;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55588x;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55590z;
import com.google.p4160bf.p4167c.p4168a.p4169a.p4170a.p4171a.C55688b;
import com.google.protobuf.C63070h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68943g;

/* renamed from: com.google.android.libraries.notifications.e.f.a.a */
/* compiled from: PG */
final class C29852a {

    /* renamed from: a */
    private final C29847a f80929a;

    /* renamed from: b */
    private final C21370a f80930b;

    /* renamed from: c */
    private final C30115i f80931c;

    /* renamed from: d */
    private final C29835a f80932d;

    public C29852a(C29847a aVar, C29835a aVar2, C30115i iVar, C21370a aVar3) {
        this.f80929a = aVar;
        this.f80932d = aVar2;
        this.f80931c = iVar;
        this.f80930b = aVar3;
    }

    /* renamed from: a */
    public final void mo35178a(C29820k kVar, List list, C30007h hVar, C29839c cVar, boolean z, boolean z2) {
        boolean z3;
        C55586v vVar;
        C55586v vVar2;
        C55586v vVar3;
        C55586v vVar4;
        C55586v vVar5;
        C29820k kVar2 = kVar;
        C29839c cVar2 = cVar;
        long c = this.f80930b.mo26871c();
        if (kVar2 != null) {
            z3 = false;
            try {
                this.f80931c.mo35515a(kVar.mo35009h(), "oauth2:https://www.googleapis.com/auth/notifications").mo35514a();
            } catch (IOException e) {
                C30058b.m55790b("BlockingNotificationReceiver", e, "IOException getting auth token.", new Object[0]);
            } catch (Exception e2) {
                C30058b.m55792d("BlockingNotificationReceiver", e2, "Error getting auth token.", new Object[0]);
            }
        }
        z3 = true;
        cVar2.f80896d = Long.valueOf(this.f80930b.mo26871c() - c);
        if (!z3) {
            C29834a b = this.f80932d.mo35160b(26);
            b.mo35145j(kVar);
            List list2 = list;
            b.mo35147l(list);
            b.mo35151p(cVar2);
            b.mo35136a();
            if (!z2 || !C68943g.f185231a.mo6453a().mo60802a()) {
                return;
            }
        } else {
            List list3 = list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55526af afVar = (C55526af) it.next();
            afVar.getClass();
            C29793g v = C29827r.m55149v();
            v.mo35045d(afVar.f146521c);
            C55562bo boVar = afVar.f146523e;
            if (boVar == null) {
                boVar = C55562bo.f146595e;
            }
            int a = C55538ar.m87703a(boVar.f146597a);
            if (a == 0) {
                a = 1;
            }
            v.mo35049h(a);
            C55562bo boVar2 = afVar.f146523e;
            if (boVar2 == null) {
                boVar2 = C55562bo.f146595e;
            }
            int a2 = C55590z.m87714a(boVar2.f146598b);
            if (a2 == 0) {
                a2 = 1;
            }
            v.mo35048g(a2);
            C55562bo boVar3 = afVar.f146523e;
            if (boVar3 == null) {
                boVar3 = C55562bo.f146595e;
            }
            int a3 = C55588x.m87713a(boVar3.f146599c);
            if (a3 == 0) {
                a3 = 1;
            }
            v.mo35047f(a3);
            C55562bo boVar4 = afVar.f146523e;
            if (boVar4 == null) {
                boVar4 = C55562bo.f146595e;
            }
            int a4 = C55560bm.m87708a(boVar4.f146600d);
            if (a4 == 0) {
                a4 = 1;
            }
            v.mo35051j(a4);
            v.f80763a = Long.valueOf(afVar.f146525g);
            v.f80764b = Long.valueOf(afVar.f146526h);
            if (afVar.f146519a == 12) {
                vVar = (C55586v) afVar.f146520b;
            } else {
                vVar = C55586v.f146658u;
            }
            v.mo35043b(vVar);
            v.mo35046e(afVar.f146524f);
            v.f80766d = Long.valueOf(afVar.f146522d);
            v.f80767e = afVar.f146527i;
            C63070h hVar2 = afVar.f146528j;
            if (hVar2 == null) {
                hVar2 = C63070h.f170215c;
            }
            v.f80768f = hVar2;
            v.f80769g = afVar.f146529k;
            v.f80771i = Long.valueOf(afVar.f146530l);
            int a5 = C55545ay.m87706a(afVar.f146531m);
            if (a5 == 0) {
                a5 = 1;
            }
            v.mo35050i(a5);
            C55688b bVar = afVar.f146532n;
            if (bVar == null) {
                bVar = C55688b.f146919b;
            }
            v.f80773k = bVar;
            if (afVar.f146519a == 12) {
                vVar2 = (C55586v) afVar.f146520b;
            } else {
                vVar2 = C55586v.f146658u;
            }
            if (!vVar2.f146672m.isEmpty()) {
                if (afVar.f146519a == 12) {
                    vVar5 = (C55586v) afVar.f146520b;
                } else {
                    vVar5 = C55586v.f146658u;
                }
                v.mo35044c(vVar5.f146672m);
            }
            if (afVar.f146519a == 12) {
                vVar3 = (C55586v) afVar.f146520b;
            } else {
                vVar3 = C55586v.f146658u;
            }
            C55579o oVar = vVar3.f146667h;
            if (oVar == null) {
                oVar = C55579o.f146634g;
            }
            if (!oVar.f146639d.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                if (afVar.f146519a == 12) {
                    vVar4 = (C55586v) afVar.f146520b;
                } else {
                    vVar4 = C55586v.f146658u;
                }
                C55579o oVar2 = vVar4.f146667h;
                if (oVar2 == null) {
                    oVar2 = C55579o.f146634g;
                }
                for (C55568d l : oVar2.f146639d) {
                    C58833ax l2 = C29824o.m55128l(l);
                    if (l2.mo56113h()) {
                        arrayList2.add((C29824o) l2.mo56107c());
                    }
                }
                v.f80774l = arrayList2;
            }
            arrayList.add(v.mo35042a());
        }
        this.f80929a.mo35172a(kVar, arrayList, hVar, cVar, z);
    }
}
