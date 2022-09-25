package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.widget.ImageView;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.j */
/* compiled from: PG */
public final /* synthetic */ class C109236j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109243q f304173a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f304174b;

    /* renamed from: c */
    public final /* synthetic */ C50637am f304175c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f304176d;

    public /* synthetic */ C109236j(C109243q qVar, C58833ax axVar, C50637am amVar, ImageView imageView) {
        this.f304173a = qVar;
        this.f304174b = axVar;
        this.f304175c = amVar;
        this.f304176d = imageView;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109243q qVar = this.f304173a;
        C58833ax axVar = this.f304174b;
        C50637am amVar = this.f304175c;
        ImageView imageView = this.f304176d;
        C58833ax axVar2 = (C58833ax) obj;
        if (!axVar2.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            qVar.f304194d.mo28211k(((C108013bm) qVar.f304198h.mo27525b()).mo96350A(), "#updatesCenter Get Updates Center first access data.", new C109240n(qVar, imageView));
            return;
        }
        ((C108013bm) qVar.f304198h.mo27525b()).mo96359J();
        if (!axVar.mo56113h()) {
            C58976aa aaVar2 = C58975e.f156826a;
            axVar = axVar2;
        } else {
            C50638an anVar = (C50638an) axVar.mo56107c();
            if (qVar.f304193c.mo26870b() - anVar.f131731d < TimeUnit.MINUTES.toMillis(qVar.f304192b.mo79743a(C90014bt.f247354fa))) {
                C58976aa aaVar3 = C58975e.f156826a;
                long j = anVar.f131731d;
                amVar.mergeFrom((C50638an) axVar.mo56107c());
                qVar.mo97702g(imageView, qVar.mo97700a(false));
                amVar.copyOnWrite();
                C50638an anVar2 = (C50638an) amVar.instance;
                anVar2.f131728a |= 1;
                anVar2.f131733f = false;
                return;
            }
        }
        if (((C50638an) axVar2.mo56107c()).f131732e > ((C50638an) axVar.mo56107c()).f131732e) {
            C58976aa aaVar4 = C58975e.f156826a;
        } else {
            axVar2 = axVar;
        }
        amVar.mergeFrom((C50638an) axVar2.mo56107c());
        ((C108013bm) qVar.f304198h.mo27525b()).mo96360K((C50638an) axVar2.mo56107c());
        qVar.mo97701e(amVar, (C50638an) axVar2.mo56107c(), imageView);
    }
}
