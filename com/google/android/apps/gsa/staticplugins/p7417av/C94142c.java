package com.google.android.apps.gsa.staticplugins.p7417av;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gcoreclient.p1776l.p1777a.C21575b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.av.c */
/* compiled from: PG */
public final class C94142c {

    /* renamed from: a */
    public static final C59071e f263008a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.av.c");

    /* renamed from: b */
    public final Context f263009b;

    /* renamed from: c */
    public final C86124t f263010c;

    /* renamed from: d */
    public final C21575b f263011d;

    /* renamed from: e */
    private final C22871g f263012e;

    /* renamed from: f */
    private volatile C60870cx f263013f;

    public C94142c(Context context, C86124t tVar, C21575b bVar, C22871g gVar) {
        this.f263009b = context;
        this.f263010c = tVar;
        this.f263011d = bVar;
        this.f263012e = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo88347a() {
        if (this.f263013f == null) {
            this.f263013f = this.f263012e.mo28207g("Firebase initializer", new C94139a(this));
        }
        return this.f263013f;
    }
}
