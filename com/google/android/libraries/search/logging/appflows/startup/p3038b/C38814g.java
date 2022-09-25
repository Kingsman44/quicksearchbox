package com.google.android.libraries.search.logging.appflows.startup.p3038b;

import android.content.Intent;
import java.util.Map;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71204an;

/* renamed from: com.google.android.libraries.search.logging.appflows.startup.b.g */
/* compiled from: PG */
public final class C38814g {

    /* renamed from: a */
    private final C69464a f102430a;

    public C38814g(C69464a aVar) {
        this.f102430a = aVar;
    }

    /* renamed from: a */
    public final C71204an mo41658a(Class cls, Intent intent) {
        C38813f fVar = (C38813f) ((Map) this.f102430a.mo17428b()).get(cls);
        if (fVar == null) {
            return C71204an.OTHER;
        }
        return fVar.mo41657a(intent);
    }
}
