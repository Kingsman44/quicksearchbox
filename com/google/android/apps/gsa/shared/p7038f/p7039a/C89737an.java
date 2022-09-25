package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130333h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3825an.p3830c.p3831a.C49293bl;
import com.google.assistant.p3825an.p3830c.p3831a.C49326cr;
import com.google.assistant.p3825an.p3830c.p3831a.C49332i;
import com.google.assistant.p3825an.p3830c.p3831a.C49333j;
import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.f.a.an */
/* compiled from: PG */
public final class C89737an {

    /* renamed from: a */
    public final C22871g f242912a;

    /* renamed from: b */
    public final C22871g f242913b;

    /* renamed from: c */
    public final C89741ar f242914c;

    /* renamed from: d */
    public final C89730ag f242915d;

    /* renamed from: e */
    private final C90021c f242916e;

    /* renamed from: f */
    private final Optional f242917f;

    public C89737an(C22871g gVar, C22871g gVar2, C89741ar arVar, C89730ag agVar, C90021c cVar, Optional optional) {
        this.f242912a = gVar;
        this.f242913b = gVar2;
        this.f242914c = arVar;
        this.f242915d = agVar;
        this.f242916e = cVar;
        this.f242917f = optional;
    }

    /* renamed from: a */
    public final C60870cx mo83617a(C49333j jVar) {
        C49293bl blVar;
        C60870cx cxVar;
        int i = jVar.f127507b;
        int a = C49332i.m85413a(i);
        int i2 = a - 1;
        String str = null;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                blVar = (C49293bl) jVar.f127508c;
            } else {
                blVar = C49293bl.f127401b;
            }
            Optional ofNullable = Optional.ofNullable((jVar.f127506a & 4) != 0 ? jVar.f127509d : null);
            if ((jVar.f127506a & 8) != 0) {
                str = jVar.f127510e;
            }
            Optional ofNullable2 = Optional.ofNullable(str);
            C22871g gVar = this.f242913b;
            if (!this.f242916e.mo79746e(C90019by.f248086t)) {
                cxVar = C60856cj.m92900i(blVar);
            } else if (this.f242917f.isEmpty()) {
                cxVar = C60856cj.m92900i(C49293bl.f127401b);
            } else {
                cxVar = this.f242913b.mo28209i(((C130333h) this.f242917f.get()).mo109665a(), "Use AppPreferenceData to filter Packages", new C89733aj(blVar));
            }
            return gVar.mo28210j(cxVar, "AppActionsIcing: Fetch IcingResults using filtered multiPackageQuerySpec.", new C89736am(this, ofNullable, ofNullable2));
        } else if (i2 == 1) {
            if (i == 2) {
                C49326cr crVar = (C49326cr) jVar.f127508c;
            } else {
                C49326cr crVar2 = C49326cr.f127482a;
            }
            return C60856cj.m92899h(new C89739ap("AppActionsIcing: SinglePackageQuerySpec is not supported yet."));
        } else if (i2 != 2) {
            return C60856cj.m92900i(C49337n.f127527b);
        } else {
            return C60856cj.m92899h(new C89739ap("AppActionsIcing: Unsupported querySpec"));
        }
    }
}
