package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88138qo;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108214al;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108267ck;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108268cl;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108274cr;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108280cx;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108296dm;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108454jh;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105934ao;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105946b;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114215c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.p640a.C11293b;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.eh */
/* compiled from: PG */
final class C108804eh implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C109040fj f302545a;

    public C108804eh(C109040fj fjVar) {
        this.f302545a = fjVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C109040fj.f303210a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ChatUiController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(22618)).mo56386p("failed to fetch the CardFactory");
        this.f302545a.f303446k.mo83755a(th, 38435798, 29).mo83721a();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C87546b bVar;
        C109040fj fjVar;
        C87546b bVar2 = (C87546b) obj;
        C109040fj fjVar2 = this.f302545a;
        fjVar2.f303236V.f303914i = bVar2;
        ViewGroup g = fjVar2.f303450o.mo95418g();
        C108303dt dtVar = fjVar2.f303231Q;
        if (dtVar != null) {
            if (C109040fj.m181378bx(fjVar2.f303450o)) {
                g = ((C113989h) ((C113988g) fjVar2.f303450o).mo100833bf().mo56107c()).mo100841aX();
            } else {
                g.getClass();
            }
            C109065gb gbVar = fjVar2.f303456u;
            C108237bh bhVar = fjVar2.f303309bP;
            C108214al a = fjVar2.f303322bc.mo96599a(fjVar2.f303450o, new C108806ej(fjVar2));
            g.getClass();
            dtVar.f301283n = g;
            dtVar.f301289t = C108296dm.NOT_CACHED;
            C108268cl clVar = dtVar.f301278i;
            bVar2.getClass();
            gbVar.getClass();
            bhVar.getClass();
            Context context = (Context) clVar.f301202a.mo17428b();
            context.getClass();
            C108429ij ijVar = (C108429ij) clVar.f301203b.mo17428b();
            ijVar.getClass();
            C105946b bVar3 = (C105946b) clVar.f301204c.mo17428b();
            bVar3.getClass();
            C86124t tVar = (C86124t) clVar.f301205d.mo17428b();
            tVar.getClass();
            C68214a a2 = C68219e.m98518a(((C68226l) clVar.f301206e).f184585a);
            a2.getClass();
            C22871g gVar = (C22871g) clVar.f301207f.mo17428b();
            gVar.getClass();
            C91183ao aoVar = (C91183ao) clVar.f301208g.mo17428b();
            aoVar.getClass();
            C114215c cVar = (C114215c) clVar.f301209h.mo17428b();
            cVar.getClass();
            C58833ax axVar = (C58833ax) clVar.f301210i.mo17428b();
            axVar.getClass();
            ((C90476a) clVar.f301211j.mo17428b()).getClass();
            C0167am amVar = (C0167am) ((C68221g) clVar.f301212k).f184583a;
            amVar.getClass();
            C11293b bVar4 = (C11293b) clVar.f301213l.mo17428b();
            bVar4.getClass();
            C108267ck ckVar = r0;
            bVar = bVar2;
            C108267ck ckVar2 = new C108267ck(bVar2, gbVar, bhVar, a, context, ijVar, bVar3, tVar, a2, gVar, aoVar, cVar, axVar, amVar, bVar4);
            C108303dt dtVar2 = dtVar;
            dtVar2.f301292w = ckVar;
            C105952bf bfVar = (C105952bf) dtVar2.f301271b.mo27525b();
            bfVar.f295813i = bfVar.f295809e.mo26870b();
            new C90873ag(bfVar.f295807c.mo28209i(bfVar.mo95190c(), "HistoryStore:Init", new C105934ao(bfVar)), dtVar2.f301272c, "HistoryManager:Init", new C108274cr(dtVar2)).mo85223a(new C108280cx(dtVar2));
            fjVar = fjVar2;
        } else {
            bVar = bVar2;
            fjVar = fjVar2;
        }
        C108454jh jhVar = fjVar.f303273ag;
        jhVar.f301674c = bVar;
        C88138qo qoVar = jhVar.f301673b;
        if (qoVar != null) {
            jhVar.mo96896a(qoVar);
            jhVar.f301673b = null;
        }
    }
}
