package com.google.android.libraries.home.p1958f.p1959a;

import androidx.lifecycle.C2332ag;
import com.google.android.apps.gsa.assistant.settings.features.p5777z.p5780c.C73556f;
import com.google.android.apps.gsa.assistant.settings.features.z.c.d;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.assistant.p3861at.C50134lv;
import com.google.assistant.p3861at.C50135lw;
import com.google.assistant.p3861at.C50137ly;
import com.google.assistant.p3861at.C50138lz;
import com.google.assistant.p3861at.C50140ma;
import com.google.assistant.p3861at.C50143md;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.C50189nw;
import com.google.assistant.p3861at.C50190nx;
import com.google.assistant.p3861at.C50191ny;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.home.settings.accountlinking.ProviderListViewModel$startRefresh$1", mo61344c = "ProviderListViewModel.kt", mo61345d = "invokeSuspend", mo61346e = {64})
/* renamed from: com.google.android.libraries.home.f.a.ai */
/* compiled from: PG */
final class C23783ai extends C69572j implements C69630p {

    /* renamed from: a */
    int f65174a;

    /* renamed from: b */
    final /* synthetic */ C23784aj f65175b;

    /* renamed from: c */
    final /* synthetic */ C73556f f65176c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23783ai(C73556f fVar, C23784aj ajVar, C69577g gVar) {
        super(2, gVar);
        this.f65176c = fVar;
        this.f65175b = ajVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C23783ai) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f65174a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                this.f65175b.f65178b.mo5706i(new C69702k(C69714l.m101133a(e)));
                return C69788q.f186170a;
            }
        } else {
            C69714l.m101134b(obj);
            C50134lv lvVar = (C50134lv) C50135lw.f130333e.createBuilder();
            C69664n.m101060f(lvVar, "newBuilder()");
            C69664n.m101061g(lvVar, "builder");
            C50143md mdVar = (C50143md) C50144me.f130361d.createBuilder();
            C69664n.m101060f(mdVar, "newBuilder()");
            C69664n.m101061g(mdVar, "builder");
            C50138lz lzVar = (C50138lz) C50140ma.f130352d.createBuilder();
            C69664n.m101060f(lzVar, "newBuilder()");
            C69664n.m101061g(lzVar, "builder");
            lzVar.copyOnWrite();
            C50140ma maVar = (C50140ma) lzVar.instance;
            maVar.f130354a |= 1;
            maVar.f130355b = true;
            lzVar.copyOnWrite();
            C50140ma maVar2 = (C50140ma) lzVar.instance;
            maVar2.f130354a |= 2;
            maVar2.f130356c = true;
            C62942bv build = lzVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C50140ma maVar3 = (C50140ma) build;
            C69664n.m101061g(maVar3, "value");
            mdVar.copyOnWrite();
            C50144me meVar = (C50144me) mdVar.instance;
            maVar3.getClass();
            meVar.f130365c = maVar3;
            meVar.f130363a |= 2;
            C62942bv build2 = mdVar.build();
            C69664n.m101060f(build2, "_builder.build()");
            C50144me meVar2 = (C50144me) build2;
            C69664n.m101061g(meVar2, "value");
            lvVar.copyOnWrite();
            C50135lw lwVar = (C50135lw) lvVar.instance;
            meVar2.getClass();
            lwVar.f130338d = meVar2;
            lwVar.f130335a |= 4;
            acu acu = (acu) acv.f128920X.createBuilder();
            C69664n.m101060f(acu, "newBuilder()");
            C69664n.m101061g(acu, "builder");
            C50190nx nxVar = (C50190nx) C50191ny.f130478e.createBuilder();
            C69664n.m101060f(nxVar, "newBuilder()");
            C69664n.m101061g(nxVar, "builder");
            nxVar.copyOnWrite();
            C50191ny nyVar = (C50191ny) nxVar.instance;
            nyVar.f130480a |= 1;
            nyVar.f130481b = true;
            nxVar.copyOnWrite();
            C50191ny nyVar2 = (C50191ny) nxVar.instance;
            nyVar2.f130480a |= 2;
            nyVar2.f130482c = true;
            C62942bv build3 = nxVar.build();
            C69664n.m101060f(build3, "_builder.build()");
            C50191ny nyVar3 = (C50191ny) build3;
            C69664n.m101061g(nyVar3, "value");
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            nyVar3.getClass();
            acv.f128951g = nyVar3;
            acv.f128945a |= 64;
            C62942bv build4 = acu.build();
            C69664n.m101060f(build4, "_builder.build()");
            acv acv2 = (acv) build4;
            C69664n.m101061g(acv2, "value");
            lvVar.copyOnWrite();
            C50135lw lwVar2 = (C50135lw) lvVar.instance;
            acv2.getClass();
            lwVar2.f130337c = acv2;
            lwVar2.f130335a |= 2;
            C62942bv build5 = lvVar.build();
            C69664n.m101060f(build5, "_builder.build()");
            C50135lw lwVar3 = (C50135lw) build5;
            C73556f fVar = this.f65176c;
            l lVar = fVar.f194571c;
            p pVar = new p();
            pVar.b = C58833ax.m90833j(fVar.f194570b.a());
            C50144me meVar3 = lwVar3.f130338d;
            if (meVar3 == null) {
                meVar3 = C50144me.f130361d;
            }
            pVar.d = C58833ax.m90834k(meVar3);
            acv acv3 = lwVar3.f130337c;
            if (acv3 == null) {
                acv3 = acv.f128920X;
            }
            pVar.e(acv3);
            pVar.e = C58833ax.m90833j(fVar.getClass().getSimpleName());
            C60870cx g = C60922j.m93044g(lVar.a(pVar, 10, C73556f.f194569a), d.a, C60826bg.f164896a);
            this.f65174a = 1;
            obj = C71663i.m104690c(g, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C50137ly lyVar = (C50137ly) obj;
        C2332ag agVar = this.f65175b.f65178b;
        act act = lyVar.f130342b;
        if (act == null) {
            act = act.f128872P;
        }
        C50189nw nwVar = act.f128898e;
        if (nwVar == null) {
            nwVar = C50189nw.f130472e;
        }
        agVar.mo5706i(new C69702k(nwVar.f130474a));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C23783ai(this.f65176c, this.f65175b, gVar);
    }
}
