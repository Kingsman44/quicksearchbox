package com.google.android.apps.gsa.search.core.p6820r.p6832d;

import com.google.android.apps.gsa.search.core.p6820r.C86482i;
import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.r.d.b */
/* compiled from: PG */
public abstract class C86413b implements C86569o {

    /* renamed from: a */
    private final C22871g f233557a;

    protected C86413b(C22871g gVar) {
        this.f233557a = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C86497j mo80171e(Query query);

    /* renamed from: g */
    public final C86497j mo79838g(C60870cx cxVar) {
        C22871g gVar = this.f233557a;
        return C86482i.m139306a(gVar.mo28209i(cxVar, "[" + mo79837b() + "] fetch", new C86412a(this)));
    }
}
