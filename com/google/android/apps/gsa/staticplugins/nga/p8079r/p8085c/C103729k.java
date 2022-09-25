package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.text.TextUtils;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80141bs;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80142bt;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80469j;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.k */
/* compiled from: PG */
public final /* synthetic */ class C103729k implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103730l f288875a;

    /* renamed from: b */
    public final /* synthetic */ C80136bn f288876b;

    public /* synthetic */ C103729k(C103730l lVar, C80136bn bnVar) {
        this.f288875a = lVar;
        this.f288876b = bnVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C80469j jVar;
        C80142bt btVar;
        C103730l lVar = this.f288875a;
        C80136bn bnVar = this.f288876b;
        if (bnVar.f219917a == 9) {
            jVar = (C80469j) bnVar.f219918b;
        } else {
            jVar = C80469j.f220856b;
        }
        if (jVar.f220858a.isEmpty()) {
            btVar = C80142bt.f219928c;
        } else {
            String D = lVar.f288878b.mo79657D(jVar.f220858a, C103730l.f288877a);
            if (TextUtils.isEmpty(D)) {
                btVar = C80142bt.f219928c;
            } else {
                C80141bs bsVar = (C80141bs) C80142bt.f219928c.createBuilder();
                D.getClass();
                bsVar.copyOnWrite();
                C80142bt btVar2 = (C80142bt) bsVar.instance;
                btVar2.f219930a |= 1;
                btVar2.f219931b = D;
                btVar = (C80142bt) bsVar.build();
            }
        }
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        btVar.getClass();
        ddVar.f220291b = btVar;
        ddVar.f220290a = 7;
        return (C80275dd) buVar.build();
    }
}
