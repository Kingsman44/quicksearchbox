package com.google.android.libraries.lens.view.main;

import com.google.android.libraries.lens.view.p2133i.p2134a.C26898c;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26899d;
import com.google.android.libraries.lens.view.p2133i.p2137d.C26919b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4707j.C62586t;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54015bw;

/* renamed from: com.google.android.libraries.lens.view.main.be */
/* compiled from: PG */
public final class C27315be implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C27327bq f74731a;

    public C27315be(C27327bq bqVar) {
        this.f74731a = bqVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C27327bq bqVar = this.f74731a;
        C26898c a = C26919b.m49870a(th);
        if (bqVar.f74765K) {
            ((C59052c) ((C59052c) C27327bq.f74753a.mo56225c()).mo56372aa(49737)).mo56389s("Failed to list cloud copy devices: %s", a.name());
            bqVar.f74809n.mo19974a(C37194a.f98517ba.mo40815i(C62722b.INTERNAL));
            bqVar.f74781aa.mo32271b();
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C54015bw bwVar = (C54015bw) obj;
        C27327bq bqVar = this.f74731a;
        if (bqVar.f74765K) {
            C26899d dVar = bqVar.f74781aa;
            C62586t tVar = bwVar.f141728a;
            if (tVar == null) {
                tVar = C62586t.f168973d;
            }
            dVar.mo32272c(tVar);
            bqVar.f74809n.mo19974a(C37194a.f98517ba.mo40815i(C62722b.OK));
        }
    }
}
