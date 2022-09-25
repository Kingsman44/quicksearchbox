package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80492a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80502e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80503f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80504g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80506i;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83612aa;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83632au;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83633av;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83643be;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83644bf;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83645bg;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83648bj;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83653e;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83654f;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83657i;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83659k;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83660l;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83663o;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83664p;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83667s;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83670v;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83674z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6983ah.C89145b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C103000c;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106221b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.c.j */
/* compiled from: PG */
public final class C107759j {

    /* renamed from: a */
    public final AtomicBoolean f299830a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C22871g f299831b;

    /* renamed from: c */
    public final C68214a f299832c;

    /* renamed from: d */
    private final C68214a f299833d;

    /* renamed from: e */
    private final C68214a f299834e;

    /* renamed from: f */
    private final C58833ax f299835f;

    /* renamed from: g */
    private final C58833ax f299836g;

    public C107759j(C68214a aVar, C68214a aVar2, C58833ax axVar, C58833ax axVar2, C22871g gVar, C89145b bVar, C68214a aVar3) {
        this.f299833d = aVar;
        this.f299834e = aVar2;
        this.f299835f = axVar;
        this.f299836g = axVar2;
        this.f299831b = gVar;
        this.f299832c = aVar3;
        bVar.mo83136j(new C107750a(this));
    }

    /* renamed from: a */
    public static C58833ax m178903a(Query query) {
        long j;
        if (!query.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA")) {
            return C58836b.f156633a;
        }
        if (query.mo84364bx("android.opa.extra.ORIGINAL_REQUEST_ID_INITIATED_BY_NGA")) {
            j = query.mo84476f("android.opa.extra.ORIGINAL_REQUEST_ID_INITIATED_BY_NGA");
        } else {
            j = query.f252749G;
        }
        return C58833ax.m90834k(C39191a.m68623b(j));
    }

    /* renamed from: b */
    public final void mo96266b(Query query, C58833ax axVar) {
        if (axVar.mo56113h()) {
            mo96270f(query, (C52091ex) axVar.mo56107c());
        }
        mo96277m(2);
    }

    /* renamed from: d */
    public final void mo96268d(C51805du duVar, C80502e eVar) {
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        C83632au auVar = (C83632au) C83633av.f227991c.createBuilder();
        C80504g gVar = (C80504g) C80506i.f221000c.createBuilder();
        C80492a aVar = (C80492a) C80503f.f220995d.createBuilder();
        aVar.copyOnWrite();
        C80503f fVar = (C80503f) aVar.instance;
        duVar.getClass();
        fVar.f220998b = duVar;
        fVar.f220997a |= 1;
        aVar.copyOnWrite();
        C80503f fVar2 = (C80503f) aVar.instance;
        eVar.getClass();
        fVar2.f220999c = eVar;
        fVar2.f220997a |= 2;
        gVar.copyOnWrite();
        C80506i iVar = (C80506i) gVar.instance;
        C80503f fVar3 = (C80503f) aVar.build();
        fVar3.getClass();
        iVar.f221003b = fVar3;
        iVar.f221002a = 1;
        auVar.copyOnWrite();
        C83633av avVar = (C83633av) auVar.instance;
        C80506i iVar2 = (C80506i) gVar.build();
        iVar2.getClass();
        avVar.f227994b = iVar2;
        avVar.f227993a |= 1;
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        C83633av avVar2 = (C83633av) auVar.build();
        avVar2.getClass();
        yVar.f228084c = avVar2;
        yVar.f228083b = 16;
        mo96274j(wVar);
    }

    /* renamed from: e */
    public final void mo96269e() {
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        C83657i iVar = (C83657i) C83660l.f228044c.createBuilder();
        C83659k kVar = C83659k.EXPLICIT;
        iVar.copyOnWrite();
        C83660l lVar = (C83660l) iVar.instance;
        lVar.f228047b = kVar.f228043d;
        lVar.f228046a |= 1;
        C83660l lVar2 = (C83660l) iVar.build();
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        lVar2.getClass();
        yVar.f228084c = lVar2;
        yVar.f228083b = 8;
        mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
    }

    /* renamed from: f */
    public final void mo96270f(Query query, C52091ex exVar) {
        C58485gu c = ((C86124t) this.f299833d.mo27525b()).mo79745c(C90014bt.f247820og);
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        for (C52232kc kcVar : exVar.f136712a) {
            if ((1 & kcVar.f137064a) != 0 && c.contains(kcVar.f137065b)) {
                ewVar.mo53792e(kcVar);
            }
        }
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        C83643be beVar = (C83643be) C83644bf.f228009c.createBuilder();
        C52091ex exVar2 = (C52091ex) ewVar.build();
        beVar.copyOnWrite();
        C83644bf bfVar = (C83644bf) beVar.instance;
        exVar2.getClass();
        bfVar.f228012b = exVar2;
        bfVar.f228011a |= 1;
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        C83644bf bfVar2 = (C83644bf) beVar.build();
        bfVar2.getClass();
        yVar.f228084c = bfVar2;
        yVar.f228083b = 1;
        C58833ax a = m178903a(query);
        if (a.mo56113h()) {
            String str = (String) a.mo56107c();
            wVar.copyOnWrite();
            C83673y yVar2 = (C83673y) wVar.instance;
            str.getClass();
            yVar2.f228082a |= 1;
            yVar2.f228085d = str;
        }
        mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
    }

    /* renamed from: g */
    public final void mo96271g(long j, Bitmap bitmap) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("opa_ui_screenshot", bitmap);
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        C83674z zVar = (C83674z) C83612aa.f227947c.createBuilder();
        zVar.copyOnWrite();
        C83612aa aaVar = (C83612aa) zVar.instance;
        aaVar.f227949a |= 1;
        aaVar.f227950b = j;
        C83612aa aaVar2 = (C83612aa) zVar.build();
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        aaVar2.getClass();
        yVar.f228084c = aaVar2;
        yVar.f228083b = 13;
        mo96275k((C83673y) wVar.build(), bundle);
    }

    /* renamed from: h */
    public final void mo96272h(C83614ac acVar) {
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        acVar.getClass();
        yVar.f228084c = acVar;
        yVar.f228083b = 5;
        mo96274j(wVar);
    }

    /* renamed from: i */
    public final void mo96273i(String str, e eVar, String str2) {
        C83667s sVar = (C83667s) C83670v.f228073f.createBuilder();
        sVar.copyOnWrite();
        C83670v vVar = (C83670v) sVar.instance;
        vVar.f228076b = 1;
        vVar.f228075a = 1 | vVar.f228075a;
        sVar.copyOnWrite();
        C83670v vVar2 = (C83670v) sVar.instance;
        str.getClass();
        vVar2.f228075a |= 2;
        vVar2.f228077c = str;
        sVar.copyOnWrite();
        C83670v vVar3 = (C83670v) sVar.instance;
        vVar3.f228079e = eVar.ca;
        vVar3.f228075a |= 8;
        if (str2 != null) {
            sVar.copyOnWrite();
            C83670v vVar4 = (C83670v) sVar.instance;
            vVar4.f228075a |= 4;
            vVar4.f228078d = str2;
        }
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        C83670v vVar5 = (C83670v) sVar.build();
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        vVar5.getClass();
        yVar.f228084c = vVar5;
        yVar.f228083b = 14;
        mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
    }

    /* renamed from: j */
    public final boolean mo96274j(C83671w wVar) {
        return mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
    }

    /* renamed from: k */
    public final boolean mo96275k(C83673y yVar, Bundle bundle) {
        if (!((C86124t) this.f299833d.mo27525b()).mo79746e(C90014bt.f247449hP) || !((C74714bo) ((C68214a) ((C58847bk) this.f299836g).f156646a).mo27525b()).mo71081c()) {
            return false;
        }
        ((C103000c) ((C68214a) ((C58847bk) this.f299835f).f156646a).mo27525b()).f287579a.mo93763v(yVar, bundle);
        return true;
    }

    /* renamed from: l */
    public final void mo96276l(Query query, Query query2, int i) {
        C83663o oVar = (C83663o) C83664p.f228049o.createBuilder();
        C58833ax a = m178903a(query);
        if (a.mo56113h()) {
            String str = (String) a.mo56107c();
            oVar.copyOnWrite();
            C83664p pVar = (C83664p) oVar.instance;
            str.getClass();
            pVar.f228051a |= 16;
            pVar.f228056f = str;
        }
        C58833ax a2 = m178903a(query2);
        if (a2.mo56113h()) {
            String str2 = (String) a2.mo56107c();
            oVar.copyOnWrite();
            C83664p pVar2 = (C83664p) oVar.instance;
            str2.getClass();
            pVar2.f228051a |= 8;
            pVar2.f228055e = str2;
        }
        oVar.copyOnWrite();
        C83664p pVar3 = (C83664p) oVar.instance;
        pVar3.f228052b = i - 1;
        pVar3.f228051a |= 1;
        long j = query.f252780s;
        oVar.copyOnWrite();
        C83664p pVar4 = (C83664p) oVar.instance;
        pVar4.f228051a |= 2;
        pVar4.f228053c = j;
        long j2 = query2.f252780s;
        oVar.copyOnWrite();
        C83664p pVar5 = (C83664p) oVar.instance;
        pVar5.f228051a |= 4;
        pVar5.f228054d = j2;
        boolean cR = query2.mo84385cR();
        oVar.copyOnWrite();
        C83664p pVar6 = (C83664p) oVar.instance;
        pVar6.f228051a |= 32;
        pVar6.f228057g = cR;
        boolean cd = query2.mo84397cd();
        oVar.copyOnWrite();
        C83664p pVar7 = (C83664p) oVar.instance;
        pVar7.f228051a |= 64;
        pVar7.f228058h = cd;
        boolean bw = query2.mo84363bw("android.opa.extra.QUERY_INITIATED_BY_NGA");
        oVar.copyOnWrite();
        C83664p pVar8 = (C83664p) oVar.instance;
        pVar8.f228051a |= 128;
        pVar8.f228059i = bw;
        boolean cj = query2.mo84403cj();
        oVar.copyOnWrite();
        C83664p pVar9 = (C83664p) oVar.instance;
        pVar9.f228051a |= 256;
        pVar9.f228060j = cj;
        boolean cY = query2.mo84392cY();
        oVar.copyOnWrite();
        C83664p pVar10 = (C83664p) oVar.instance;
        pVar10.f228051a |= 512;
        pVar10.f228061k = cY;
        boolean dA = query2.mo84420dA();
        oVar.copyOnWrite();
        C83664p pVar11 = (C83664p) oVar.instance;
        pVar11.f228051a |= 1024;
        pVar11.f228062l = dA;
        boolean cB = query2.mo84369cB();
        oVar.copyOnWrite();
        C83664p pVar12 = (C83664p) oVar.instance;
        pVar12.f228051a |= 2048;
        pVar12.f228063m = cB;
        boolean bw2 = query2.mo84363bw("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA");
        oVar.copyOnWrite();
        C83664p pVar13 = (C83664p) oVar.instance;
        pVar13.f228051a |= 4096;
        pVar13.f228064n = bw2;
        C83664p pVar14 = (C83664p) oVar.build();
        ((C106221b) this.f299834e.mo27525b()).mo95447e(pVar14);
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        pVar14.getClass();
        yVar.f228084c = pVar14;
        yVar.f228083b = 17;
        mo96274j(wVar);
    }

    /* renamed from: m */
    public final void mo96277m(int i) {
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        C83645bg bgVar = (C83645bg) C83648bj.f228014c.createBuilder();
        bgVar.copyOnWrite();
        C83648bj bjVar = (C83648bj) bgVar.instance;
        bjVar.f228017b = i - 1;
        boolean z = true;
        bjVar.f228016a |= 1;
        wVar.copyOnWrite();
        C83673y yVar = (C83673y) wVar.instance;
        C83648bj bjVar2 = (C83648bj) bgVar.build();
        bjVar2.getClass();
        yVar.f228084c = bjVar2;
        yVar.f228083b = 4;
        mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
        AtomicBoolean atomicBoolean = this.f299830a;
        if (i != 2) {
            z = false;
        }
        atomicBoolean.set(z);
    }

    /* renamed from: c */
    public final void mo96267c(Query query) {
        C58833ax axVar;
        if (query == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = m178903a(query);
        }
        ((C106221b) this.f299834e.mo27525b()).mo95446d(Optional.ofNullable(axVar.mo56111f()));
        C83653e eVar = (C83653e) C83654f.f228032c.createBuilder();
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            eVar.copyOnWrite();
            C83654f fVar = (C83654f) eVar.instance;
            str.getClass();
            fVar.f228034a |= 1;
            fVar.f228035b = str;
        }
        C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
        if (axVar.mo56113h()) {
            String str2 = (String) axVar.mo56107c();
            wVar.copyOnWrite();
            C83673y yVar = (C83673y) wVar.instance;
            str2.getClass();
            yVar.f228082a |= 1;
            yVar.f228085d = str2;
        }
        wVar.copyOnWrite();
        C83673y yVar2 = (C83673y) wVar.instance;
        C83654f fVar2 = (C83654f) eVar.build();
        fVar2.getClass();
        yVar2.f228084c = fVar2;
        yVar2.f228083b = 9;
        mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
    }
}
