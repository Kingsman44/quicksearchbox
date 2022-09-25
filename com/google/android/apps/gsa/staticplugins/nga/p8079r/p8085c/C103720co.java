package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80273db;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80274dc;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60470rb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.co */
/* compiled from: PG */
public final /* synthetic */ class C103720co implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C103720co f288858a = new C103720co();

    private /* synthetic */ C103720co() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C86053n nVar = (C86053n) obj;
        if (nVar == null) {
            return C80275dd.f220288c;
        }
        C80273db dbVar = (C80273db) C80274dc.f220282e.createBuilder();
        C60470rb rbVar = nVar.f232633b;
        if (rbVar != null) {
            dbVar.copyOnWrite();
            C80274dc dcVar = (C80274dc) dbVar.instance;
            dcVar.f220286c = rbVar.f163657h;
            dcVar.f220284a |= 2;
        }
        String str = nVar.f232632a;
        if (str != null) {
            dbVar.copyOnWrite();
            C80274dc dcVar2 = (C80274dc) dbVar.instance;
            dcVar2.f220284a |= 1;
            dcVar2.f220285b = str;
        }
        if (nVar.f232634c != null) {
            dbVar.copyOnWrite();
            C80274dc dcVar3 = (C80274dc) dbVar.instance;
            dcVar3.f220284a |= 4;
            dcVar3.f220287d = true;
        } else {
            dbVar.copyOnWrite();
            C80274dc dcVar4 = (C80274dc) dbVar.instance;
            dcVar4.f220284a |= 4;
            dcVar4.f220287d = false;
            if (C60470rb.USER_RECOVERABLE_ERROR.equals(rbVar)) {
                ((C59052c) ((C59052c) C103721cp.f288859a.mo56226d()).mo56372aa(21655)).mo56386p("Token details has USER_RECOVERABLE_ERROR status code but no recovery intent.");
            }
        }
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80274dc dcVar5 = (C80274dc) dbVar.build();
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        dcVar5.getClass();
        ddVar.f220291b = dcVar5;
        ddVar.f220290a = 19;
        return (C80275dd) buVar.build();
    }
}
