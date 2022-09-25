package com.google.android.apps.gsa.staticplugins.p7885e;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88148qy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88153rc;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139322d;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139323e;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import p3186j$.time.Instant;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.e.c */
/* compiled from: PG */
public final /* synthetic */ class C100327c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C100329e f280562a;

    /* renamed from: b */
    public final /* synthetic */ C88153rc f280563b;

    /* renamed from: c */
    public final /* synthetic */ Instant f280564c;

    /* renamed from: d */
    public final /* synthetic */ boolean f280565d;

    public /* synthetic */ C100327c(C100329e eVar, C88153rc rcVar, Instant instant, boolean z) {
        this.f280562a = eVar;
        this.f280563b = rcVar;
        this.f280564c = instant;
        this.f280565d = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C100329e eVar = this.f280562a;
        C88153rc rcVar = this.f280563b;
        Instant instant = this.f280564c;
        boolean z = this.f280565d;
        AccountId accountId = (AccountId) obj;
        C139323e eVar2 = (C139323e) C139324f.f378925k.createBuilder();
        if ((rcVar.f238297a & 128) != 0) {
            C88148qy qyVar = rcVar.f238305i;
            if (qyVar == null) {
                qyVar = C88148qy.f238276d;
            }
            Collection.EL.stream(qyVar.f238280c).forEach(new C100328d(eVar2));
            C88148qy qyVar2 = rcVar.f238305i;
            if (qyVar2 == null) {
                qyVar2 = C88148qy.f238276d;
            }
            int i = qyVar2.f238279b;
            eVar2.copyOnWrite();
            C139324f fVar = (C139324f) eVar2.instance;
            fVar.f378927a |= 1;
            fVar.f378929c = i;
        } else {
            C56609a aVar = (C56609a) C56610b.f151140k.createBuilder();
            String str = rcVar.f238299c;
            aVar.copyOnWrite();
            C56610b bVar = (C56610b) aVar.instance;
            str.getClass();
            bVar.f151142a |= 2;
            bVar.f151144c = str;
            String str2 = rcVar.f238298b;
            aVar.copyOnWrite();
            C56610b bVar2 = (C56610b) aVar.instance;
            str2.getClass();
            bVar2.f151142a |= 1;
            bVar2.f151143b = str2;
            String str3 = rcVar.f238300d;
            aVar.copyOnWrite();
            C56610b bVar3 = (C56610b) aVar.instance;
            str3.getClass();
            bVar3.f151142a |= 4;
            bVar3.f151145d = str3;
            eVar2.mo114902a(aVar);
        }
        try {
            Intent a = eVar.f280568b.mo114907a((C139324f) eVar2.build(), accountId);
            if (z) {
                a.addFlags(268435456);
                eVar.f280569c.startActivity(a);
            } else {
                eVar.f280567a.mo65089a(a);
            }
            a.putExtra("com.google.android.apps.gsa.shared.logger.RESULT_CLICK_ID", C100329e.m166304g(rcVar));
            return C60856cj.m92900i(C118826c.f331422a);
        } catch (C139322d unused) {
            return eVar.mo91891f(rcVar, instant);
        }
    }
}
