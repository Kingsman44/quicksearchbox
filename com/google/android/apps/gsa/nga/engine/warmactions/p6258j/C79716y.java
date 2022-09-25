package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6254f.C79564a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6254f.C79565b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.y */
/* compiled from: PG */
public final /* synthetic */ class C79716y implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C79645aa f218615a;

    /* renamed from: b */
    public final /* synthetic */ C79690bs f218616b;

    public /* synthetic */ C79716y(C79645aa aaVar, C79690bs bsVar) {
        this.f218615a = aaVar;
        this.f218616b = bsVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        C79645aa aaVar = this.f218615a;
        C79690bs bsVar = this.f218616b;
        bsVar.mo74199g();
        bsVar.mo74198f();
        String f = bsVar.mo74198f();
        C58800sl lA = C79645aa.f218463b.keySet().iterator();
        while (true) {
            if (!lA.hasNext()) {
                z = false;
                break;
            }
            String str = (String) lA.next();
            if (f.startsWith(str)) {
                ((C79565b) aaVar.f218464c.mo27525b()).mo74062a((C79564a) Objects.requireNonNull((C79564a) C79645aa.f218463b.get(str)));
                z = true;
                break;
            }
        }
        if (!z) {
            ((C58970a) ((C58970a) C79645aa.f218462a.mo56225c()).mo56372aa(5734)).mo56389s("#MWW Unsupported media command: %s.", f);
        }
        if (!aaVar.f218465d.mo85405j(C90126fx.f251455jD)) {
            ((C79565b) aaVar.f218464c.mo27525b()).mo74063b();
        }
        return Boolean.valueOf(z);
    }
}
