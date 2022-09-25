package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.o */
/* compiled from: PG */
final class C95540o implements C94637a {

    /* renamed from: a */
    final /* synthetic */ C94647k f267372a;

    /* renamed from: b */
    final /* synthetic */ C94637a f267373b;

    /* renamed from: c */
    final /* synthetic */ boolean f267374c;

    /* renamed from: d */
    final /* synthetic */ int f267375d;

    /* renamed from: e */
    final /* synthetic */ C95541p f267376e;

    public C95540o(C95541p pVar, C94647k kVar, C94637a aVar, boolean z, int i) {
        this.f267376e = pVar;
        this.f267372a = kVar;
        this.f267373b = aVar;
        this.f267374c = z;
        this.f267375d = i;
    }

    /* renamed from: a */
    public final void mo88580a(boolean z) {
        C95541p pVar = this.f267376e;
        C94647k kVar = this.f267372a;
        C94637a aVar = this.f267373b;
        boolean z2 = false;
        if (this.f267374c && z) {
            z2 = true;
        }
        pVar.mo89435F(kVar, aVar, z2, this.f267375d + 1);
    }
}
