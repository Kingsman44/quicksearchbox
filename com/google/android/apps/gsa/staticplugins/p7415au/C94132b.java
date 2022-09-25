package com.google.android.apps.gsa.staticplugins.p7415au;

import android.os.Bundle;
import com.google.android.libraries.gcoreclient.p1778m.p1779a.C21579a;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.au.b */
/* compiled from: PG */
final class C94132b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f262978a;

    /* renamed from: b */
    final /* synthetic */ int f262979b;

    /* renamed from: c */
    final /* synthetic */ Map f262980c;

    /* renamed from: d */
    final /* synthetic */ C94134d f262981d;

    public C94132b(C94134d dVar, String str, int i, Map map) {
        this.f262981d = dVar;
        this.f262978a = str;
        this.f262979b = i;
        this.f262980c = map;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C94134d.f262989a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FirebaseAnalytics");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(19960)).mo56386p("Error initializing Firebase");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C94134d dVar = this.f262981d;
        String str = this.f262978a;
        int i = this.f262979b;
        Map map = this.f262980c;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (!dVar.f262991c.contains(str)) {
            for (int i2 = 0; i2 < i; i2++) {
                ((C21579a) dVar.f262990b.mo27525b()).mo27018a(str, bundle);
            }
            return;
        }
        bundle.putInt("value", i);
        ((C21579a) dVar.f262990b.mo27525b()).mo27018a(str, bundle);
    }
}
