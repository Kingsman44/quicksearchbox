package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138130l;
import com.google.android.apps.search.googleapp.search.suggest.C138131m;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.C138542t;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138043aa;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.r */
/* compiled from: PG */
public final /* synthetic */ class C138000r implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C138001s f375425a;

    /* renamed from: b */
    public final /* synthetic */ Map f375426b;

    /* renamed from: c */
    public final /* synthetic */ long f375427c;

    /* renamed from: d */
    public final /* synthetic */ C138133o f375428d;

    public /* synthetic */ C138000r(C138001s sVar, Map map, long j, C138133o oVar) {
        this.f375425a = sVar;
        this.f375426b = map;
        this.f375427c = j;
        this.f375428d = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        int i;
        C138001s sVar = this.f375425a;
        Map map = this.f375426b;
        long j = this.f375427c;
        C138133o oVar = this.f375428d;
        C47558bi a = C47831fm.m85006a("mergeSuggestions");
        try {
            ArrayList<C138678v> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            Map.EL.forEach(map, new C137990h(arrayList2, arrayList));
            C138043aa aaVar = sVar.f375441m;
            if (aaVar.f375609a) {
                long c = aaVar.f375610b.mo26871c();
                if (aaVar.f375611c.mo114123a(c) && (i = (int) (c - j)) >= 0) {
                    aaVar.f375612d.mo114098b(i);
                }
            }
            C138130l lVar = (C138130l) C138131m.f375814f.createBuilder();
            String str = oVar.f375825b;
            lVar.copyOnWrite();
            C138131m mVar = (C138131m) lVar.instance;
            str.getClass();
            mVar.f375816a |= 1;
            mVar.f375817b = str;
            lVar.copyOnWrite();
            C138131m mVar2 = (C138131m) lVar.instance;
            oVar.getClass();
            mVar2.f375820e = oVar;
            mVar2.f375816a |= 4;
            ArrayList arrayList3 = new ArrayList();
            C138134p pVar = (C138134p) C138542t.f376811i.createBuilder();
            if (sVar.f375439k) {
                pVar.copyOnWrite();
                C138542t tVar = (C138542t) pVar.instance;
                C62971cq cqVar = tVar.f376816d;
                if (!cqVar.mo58948c()) {
                    tVar.f376816d = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) arrayList2, (List) tVar.f376816d);
            }
            long j2 = 0;
            for (C138678v vVar : arrayList) {
                arrayList3.addAll(vVar.f377199c);
                C138542t tVar2 = vVar.f377200d;
                j2 |= (tVar2 == null ? C138542t.f376811i : tVar2).f376817e;
                if (tVar2 == null) {
                    tVar2 = C138542t.f376811i;
                }
                pVar.mergeFrom(tVar2);
            }
            if (j2 != 0) {
                pVar.copyOnWrite();
                C138542t tVar3 = (C138542t) pVar.instance;
                tVar3.f376813a |= 4;
                tVar3.f376817e = j2;
            }
            Collections.sort(arrayList3, sVar.f375442n.mo114044a(oVar));
            C47633f h = C47633f.m84733g(C60856cj.m92900i(arrayList3)).mo51516i(new C137967c(sVar, oVar, pVar), sVar.f375431c).mo51516i(new C137974d(sVar, oVar, pVar), sVar.f375431c).mo51515h(new C137980e(sVar, oVar), sVar.f375431c).mo51515h(new C137988f(sVar, lVar, pVar, oVar), sVar.f375431c);
            a.close();
            return h;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
