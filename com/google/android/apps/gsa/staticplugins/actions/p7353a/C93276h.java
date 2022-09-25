package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.C87401c;
import com.google.android.gms.common.api.C143848t;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.p10749c.C142971a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.h */
/* compiled from: PG */
public final class C93276h {

    /* renamed from: a */
    public static final C59071e f260105a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.a.h");

    /* renamed from: b */
    public final Context f260106b;

    /* renamed from: c */
    public final C143851w f260107c;

    /* renamed from: d */
    public final C87401c f260108d;

    /* renamed from: e */
    public final C86124t f260109e;

    /* renamed from: f */
    public SettableFuture f260110f = new SettableFuture();

    /* renamed from: g */
    public BroadcastReceiver f260111g;

    /* renamed from: h */
    public C93269aq f260112h;

    public C93276h(Context context, C87401c cVar, C86124t tVar) {
        this.f260106b = context;
        C143848t tVar2 = new C143848t(context);
        tVar2.mo119296c(C142971a.f387928a);
        this.f260107c = tVar2.mo119294a();
        this.f260108d = cVar;
        this.f260109e = tVar;
    }

    /* renamed from: a */
    public final void mo87606a() {
        C93269aq aqVar = this.f260112h;
        if (aqVar != null) {
            aqVar.mo87600c();
            this.f260112h = null;
        }
    }

    /* renamed from: b */
    public final void mo87607b() {
        BroadcastReceiver broadcastReceiver = this.f260111g;
        if (broadcastReceiver != null) {
            this.f260106b.unregisterReceiver(broadcastReceiver);
            this.f260111g = null;
        }
        mo87606a();
    }
}
