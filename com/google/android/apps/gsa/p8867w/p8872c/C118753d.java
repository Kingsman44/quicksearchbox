package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1163s.p1164a.p1167b.C15761a;
import com.google.android.libraries.assistant.auto.tng.p1163s.p1164a.p1167b.C15762b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.c.d */
/* compiled from: PG */
public final /* synthetic */ class C118753d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118754e f331241a;

    /* renamed from: b */
    public final /* synthetic */ String f331242b;

    public /* synthetic */ C118753d(C118754e eVar, String str) {
        this.f331241a = eVar;
        this.f331242b = str;
    }

    public final Object call() {
        C118754e eVar = this.f331241a;
        String str = this.f331242b;
        C15761a aVar = (C15761a) C15762b.f46964d.createBuilder();
        C86338r rVar = (C86338r) eVar.f331243a.mo17428b();
        long j = rVar.getLong("opa_last_udc_consent".concat(String.valueOf(str)), -100);
        boolean z = false;
        boolean z2 = rVar.getBoolean("opa_upgrade_show_value_prop", false);
        if (j != -100 && !z2) {
            z = true;
        }
        boolean z3 = rVar.getBoolean("opa_enabled", true);
        aVar.copyOnWrite();
        C15762b bVar = (C15762b) aVar.instance;
        bVar.f46966a |= 1;
        bVar.f46967b = z;
        aVar.copyOnWrite();
        C15762b bVar2 = (C15762b) aVar.instance;
        bVar2.f46966a |= 2;
        bVar2.f46968c = z3;
        return (C15762b) aVar.build();
    }
}
