package com.google.android.apps.gsa.staticplugins.p8778v.p8780b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6813n.C86182a;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.v.b.c */
/* compiled from: PG */
public final /* synthetic */ class C117533c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117535e f326243a;

    /* renamed from: b */
    public final /* synthetic */ long f326244b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f326245c;

    public /* synthetic */ C117533c(C117535e eVar, long j, Runnable runnable) {
        this.f326243a = eVar;
        this.f326244b = j;
        this.f326245c = runnable;
    }

    public final void run() {
        C117535e eVar = this.f326243a;
        long j = this.f326244b;
        Runnable runnable = this.f326245c;
        try {
            for (C86182a a : eVar.f326247a) {
                a.mo79819a(j);
            }
        } finally {
            ((C117534d) runnable).f326246a.mo57356n(C118826c.f331422a);
        }
    }
}
