package com.google.p4181bi.p4183b;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: com.google.bi.b.j */
/* compiled from: PG */
public final class C55827j implements C61373ao {

    /* renamed from: a */
    public static final C31164au f147306a = C31164au.m58092b("peoplestack.PeopleStackAutocompleteService.");

    /* renamed from: b */
    public static final C61372an f147307b = new C55818a();

    /* renamed from: c */
    public static final C61372an f147308c = new C55819b();

    /* renamed from: d */
    public static final C61372an f147309d = new C55820c();

    /* renamed from: e */
    public static final C61372an f147310e = new C55821d();

    /* renamed from: f */
    public static final C61372an f147311f = new C55822e();

    /* renamed from: g */
    public static final C61372an f147312g = new C55823f();

    /* renamed from: h */
    public static final C61372an f147313h = new C55824g();

    /* renamed from: i */
    public static final C61372an f147314i = new C55825h();

    /* renamed from: j */
    public static final C61372an f147315j = new C55826i();

    /* renamed from: k */
    public static final C55827j f147316k = new C55827j();

    /* renamed from: n */
    private static final C31164au f147317n = C31164au.m58092b("peoplestack.PeopleStackAutocompleteService/");

    /* renamed from: o */
    private static final C31164au f147318o = C31164au.m58092b("peoplestack-pa.googleapis.com");

    /* renamed from: l */
    public final C58485gu f147319l;

    /* renamed from: m */
    public final C58528ij f147320m;

    /* renamed from: p */
    private final C58495hd f147321p;

    static {
        C31164au.m58092b("peoplestack.PeopleStackAutocompleteService");
    }

    private C55827j() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-peoplestack-pa.sandbox.googleapis.com");
        e.mo55395g("staging-peoplestack-pa.sandbox.googleapis.com");
        e.mo55395g("peoplestack-pa.googleapis.com");
        this.f147319l = e.mo55394f();
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c("https://www.googleapis.com/auth/peopleapi.readonly");
        this.f147320m = ihVar.mo55486f();
        C61372an anVar = f147307b;
        C61372an anVar2 = f147308c;
        C61372an anVar3 = f147309d;
        C61372an anVar4 = f147310e;
        C61372an anVar5 = f147311f;
        C61372an anVar6 = f147312g;
        C61372an anVar7 = f147313h;
        C61372an anVar8 = f147314i;
        C61372an anVar9 = f147315j;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, anVar7, anVar8, anVar9);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("Autocomplete", anVar);
        gzVar.mo55429h("Warmup", anVar2);
        gzVar.mo55429h("Lookup", anVar3);
        gzVar.mo55429h("SmartAddress", anVar4);
        gzVar.mo55429h("MutateConnectionLabel", anVar5);
        gzVar.mo55429h("CreateGroup", anVar6);
        gzVar.mo55429h("ReadGroups", anVar7);
        gzVar.mo55429h("UpdateGroup", anVar8);
        gzVar.mo55429h("DeleteGroups", anVar9);
        this.f147321p = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f147318o;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f147317n.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f147321p.containsKey(substring)) {
            return (C61372an) this.f147321p.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
