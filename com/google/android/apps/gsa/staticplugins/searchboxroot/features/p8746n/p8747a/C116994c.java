package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import com.google.android.apps.gsa.search.core.p6805i.C86123s;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b.C88579k;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89201f;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21461i;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21466n;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.c */
/* compiled from: PG */
public final class C116994c implements C89201f {

    /* renamed from: a */
    public static final C59071e f324786a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.c");

    /* renamed from: b */
    public final Object f324787b;

    /* renamed from: c */
    public final C86124t f324788c;

    /* renamed from: d */
    public C88579k f324789d;

    /* renamed from: e */
    public C88579k f324790e;

    /* renamed from: f */
    public Long f324791f;

    /* renamed from: g */
    public Long f324792g;

    /* renamed from: h */
    public final C21466n f324793h;

    /* renamed from: i */
    private final C86123s f324794i;

    public C116994c(C86124t tVar, C68214a aVar, C21466n nVar) {
        Object obj = new Object();
        this.f324787b = obj;
        C116993b bVar = new C116993b(this);
        this.f324794i = bVar;
        this.f324788c = tVar;
        this.f324793h = nVar;
        tVar.mo79738i(bVar);
        C21461i iVar = (C21461i) aVar.mo27525b();
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C21461i.m40576a("*", "*"), 64L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.googlequicksearchbox", "applications_uri"), 192L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.gms", "apps"), 192L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.gms", "internal.3p:MobileApplication"), 192L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.googlequicksearchbox", "contacts_contact_id"), 128L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.gms", "contacts_contact_id"), 128L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.googlequicksearchbox", "internal.3p:Person"), 128L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.apps.docs", "internal.3p:DigitalDocument"), 10L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.apps.docs", "internal.3p:PresentationDigitalDocument"), 10L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.apps.docs", "internal.3p:SpreadsheetDigitalDocument"), 10L);
        gzVar.mo55429h(C21461i.m40576a("com.google.android.apps.docs", "internal.3p:TextDigitalDocument"), 10L);
        this.f324789d = new C88579k(aVar, gzVar.mo55427f(false));
        this.f324790e = new C88579k(aVar, tVar, C90120fr.f250771K);
        synchronized (obj) {
            this.f324791f = Long.valueOf(tVar.mo79743a(C90085ej.f250239q));
            this.f324792g = Long.valueOf(tVar.mo79743a(C90085ej.f250238p));
        }
    }

    /* renamed from: a */
    public final void mo82249a() {
        this.f324788c.mo79740k(this.f324794i);
        this.f324790e.mo82249a();
        this.f324789d.mo82249a();
    }
}
