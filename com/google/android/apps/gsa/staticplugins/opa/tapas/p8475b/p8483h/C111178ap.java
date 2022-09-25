package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143848t;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.queries.p10873a.C145926j;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.ap */
/* compiled from: PG */
public final class C111178ap implements C143849u, C143850v {

    /* renamed from: a */
    public static final C59071e f309468a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.ap");

    /* renamed from: b */
    public static final TimeUnit f309469b = TimeUnit.MILLISECONDS;

    /* renamed from: c */
    public final C143851w f309470c;

    /* renamed from: d */
    public final C145926j f309471d;

    /* renamed from: e */
    private final Lock f309472e = new ReentrantLock();

    /* renamed from: f */
    private final List f309473f = new ArrayList();

    public C111178ap(Context context) {
        C143848t tVar = new C143848t(context);
        tVar.mo119296c(C145891g.f394440m);
        tVar.mo119299f("<<default account>>");
        C143851w a = tVar.mo119294a();
        C145926j jVar = C145891g.f394442o;
        this.f309470c = a;
        this.f309471d = jVar;
    }

    /* renamed from: d */
    public final void mo26993d(ConnectionResult connectionResult) {
        this.f309472e.lock();
        try {
            Collection.EL.stream(this.f309473f).forEach(C111177ao.f309467a);
            this.f309473f.clear();
        } finally {
            this.f309472e.unlock();
        }
    }

    /* renamed from: kq */
    public final void mo26991kq(Bundle bundle) {
        this.f309472e.lock();
        try {
            Collection.EL.stream(this.f309473f).forEach(C111176an.f309466a);
            this.f309473f.clear();
        } finally {
            this.f309472e.unlock();
        }
    }

    /* renamed from: kr */
    public final void mo26992kr(int i) {
    }
}
