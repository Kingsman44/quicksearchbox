package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.e.h */
/* compiled from: PG */
public final class C114728h {

    /* renamed from: a */
    public static final C59071e f318361a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.e.h");

    /* renamed from: b */
    public final Context f318362b;

    /* renamed from: c */
    public final C86124t f318363c;

    /* renamed from: d */
    public final C91077d f318364d;

    /* renamed from: e */
    public final C22871g f318365e;

    /* renamed from: f */
    public SettableFuture f318366f = new SettableFuture();

    /* renamed from: g */
    public boolean f318367g = false;

    /* renamed from: h */
    private final C22871g f318368h;

    public C114728h(Context context, C86124t tVar, C91077d dVar, C22871g gVar, C22871g gVar2) {
        this.f318362b = context;
        this.f318363c = tVar;
        this.f318364d = dVar;
        this.f318368h = gVar;
        this.f318365e = gVar2;
    }

    /* renamed from: a */
    public final void mo101546a() {
        this.f318368h.mo28207g("Fetch unread SMS from content provider.", new C114727g(this));
    }
}
