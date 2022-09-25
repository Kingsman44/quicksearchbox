package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60099ks;
import com.google.common.p4552o.C60102kv;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.k */
/* compiled from: PG */
public final /* synthetic */ class C96339k implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C96431q f269552a;

    /* renamed from: b */
    public final /* synthetic */ String f269553b;

    public /* synthetic */ C96339k(C96431q qVar, String str) {
        this.f269552a = qVar;
        this.f269553b = str;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C96431q qVar = this.f269552a;
        String str = this.f269553b;
        C59104x b = C96431q.f269762b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AccLinkFrag");
        ((C59052c) ((C59052c) b).mo56372aa(16932)).mo56387q("Link result %d", i);
        if (str != null) {
            C95299e eVar = (C95299e) qVar.f269603D.mo27525b();
            boolean z = i == -1;
            C60099ks ksVar = (C60099ks) C60102kv.f162504e.createBuilder();
            ksVar.copyOnWrite();
            C60102kv kvVar = (C60102kv) ksVar.instance;
            kvVar.f162506a |= 2;
            kvVar.f162508c = z;
            ksVar.copyOnWrite();
            C60102kv kvVar2 = (C60102kv) ksVar.instance;
            kvVar2.f162507b = 1;
            kvVar2.f162506a |= 1;
            ksVar.copyOnWrite();
            C60102kv kvVar3 = (C60102kv) ksVar.instance;
            kvVar3.f162506a |= 8;
            kvVar3.f162509d = str;
            eVar.f266647b.mo57065a(ksVar);
        }
        if (i == -1) {
            for (C96430p b2 : qVar.f269768h) {
                b2.mo90118b();
            }
            qVar.mo77318iT().mo77312a();
        }
        return true;
    }
}
