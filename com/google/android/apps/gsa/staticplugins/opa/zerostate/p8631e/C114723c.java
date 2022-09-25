package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e;

import android.content.Context;
import com.google.android.apps.gsa.contacts.cn;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.e.c */
/* compiled from: PG */
public final class C114723c {

    /* renamed from: a */
    public static final C59071e f318327a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.e.c");

    /* renamed from: b */
    public final Context f318328b;

    /* renamed from: c */
    public final long f318329c;

    /* renamed from: d */
    public final C86124t f318330d;

    /* renamed from: e */
    public final C91077d f318331e;

    /* renamed from: f */
    public final C22871g f318332f;

    /* renamed from: g */
    public final cn f318333g;

    /* renamed from: h */
    public final C68214a f318334h;

    /* renamed from: i */
    public boolean f318335i = false;

    /* renamed from: j */
    public SettableFuture f318336j = new SettableFuture();

    /* renamed from: k */
    private final C22871g f318337k;

    public C114723c(Context context, C21370a aVar, C86124t tVar, C91077d dVar, C22871g gVar, C22871g gVar2, cn cnVar, C68214a aVar2) {
        this.f318328b = context;
        this.f318329c = aVar.mo26870b();
        this.f318330d = tVar;
        this.f318331e = dVar;
        this.f318337k = gVar;
        this.f318332f = gVar2;
        this.f318333g = cnVar;
        this.f318334h = aVar2;
    }

    /* renamed from: a */
    public final void mo101541a() {
        this.f318337k.mo28207g("Fetch calls from content provider.", new C114722b(this));
    }
}
