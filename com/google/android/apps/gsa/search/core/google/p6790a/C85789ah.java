package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.p496a.p497a.C9300a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.ah */
/* compiled from: PG */
public final class C85789ah {

    /* renamed from: a */
    public static final C59071e f231944a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a.ah");

    /* renamed from: b */
    public final C22871g f231945b;

    /* renamed from: c */
    public final C85803av f231946c;

    /* renamed from: d */
    public final C58833ax f231947d;

    /* renamed from: e */
    public final C58833ax f231948e;

    /* renamed from: f */
    public final C9300a f231949f;

    /* renamed from: g */
    public final C86124t f231950g;

    /* renamed from: h */
    private final C85799ar f231951h;

    public C85789ah(C22871g gVar, C85803av avVar, C85799ar arVar, C58833ax axVar, C58833ax axVar2, C9300a aVar, C86124t tVar) {
        this.f231945b = gVar;
        this.f231946c = avVar;
        this.f231951h = arVar;
        this.f231947d = axVar;
        this.f231948e = axVar2;
        this.f231949f = aVar;
        this.f231950g = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo79442a(Query query) {
        C60870cx a = this.f231951h.mo79445a(query);
        return query.mo84412cs() ? this.f231945b.mo28209i(a, "Set paired phones", new C85787af(this)) : a;
    }

    /* renamed from: b */
    public final C60870cx mo79443b(Query query) {
        return this.f231945b.mo28209i(mo79442a(query), "Build device properties", C85785ad.f231940a);
    }
}
