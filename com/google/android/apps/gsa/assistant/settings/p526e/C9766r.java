package com.google.android.apps.gsa.assistant.settings.p526e;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.r */
/* compiled from: PG */
public final class C9766r {

    /* renamed from: a */
    private static final C9765q f33717a;

    /* renamed from: b */
    private final Map f33718b;

    static {
        C9764p pVar = (C9764p) C9765q.f33712d.createBuilder();
        C89849ae aeVar = C89849ae.OPA_SETTINGS_PAGE_UNSPECIFIED;
        pVar.copyOnWrite();
        C9765q qVar = (C9765q) pVar.instance;
        qVar.f33716c = aeVar.f245884YW;
        qVar.f33714a |= 2;
        f33717a = (C9765q) pVar.build();
    }

    public C9766r(Map map) {
        this.f33718b = map;
    }

    /* renamed from: a */
    public final C9765q mo18025a(String str) {
        C69464a aVar = (C69464a) this.f33718b.get(Uri.parse(str).getPath());
        if (aVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            return f33717a;
        }
        C9765q qVar = (C9765q) aVar.mo17428b();
        C58838bb.m90867b(qVar, "Error: LoggingConfig binding returned null for uri = %s", str);
        C58976aa aaVar2 = C58975e.f156826a;
        return qVar;
    }
}
