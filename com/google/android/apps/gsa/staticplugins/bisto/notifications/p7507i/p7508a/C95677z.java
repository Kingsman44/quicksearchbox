package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.z */
/* compiled from: PG */
public final /* synthetic */ class C95677z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95651ae f267835a;

    /* renamed from: b */
    public final /* synthetic */ List f267836b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f267837c;

    /* renamed from: d */
    public final /* synthetic */ AtomicBoolean f267838d;

    /* renamed from: e */
    public final /* synthetic */ AtomicBoolean f267839e;

    /* renamed from: f */
    public final /* synthetic */ C94637a f267840f;

    public /* synthetic */ C95677z(C95651ae aeVar, List list, AtomicReference atomicReference, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C94637a aVar) {
        this.f267835a = aeVar;
        this.f267836b = list;
        this.f267837c = atomicReference;
        this.f267838d = atomicBoolean;
        this.f267839e = atomicBoolean2;
        this.f267840f = aVar;
    }

    public final void run() {
        C95651ae aeVar = this.f267835a;
        List<C90421b> list = this.f267836b;
        AtomicReference atomicReference = this.f267837c;
        AtomicBoolean atomicBoolean = this.f267838d;
        AtomicBoolean atomicBoolean2 = this.f267839e;
        C94637a aVar = this.f267840f;
        if (!aeVar.f267715f.mo89615c() || aeVar.f267715f.mo89617e()) {
            C58976aa aaVar = C58975e.f156826a;
            aeVar.mo89582b(4, list);
            return;
        }
        for (C90421b bVar : list) {
            aeVar.f267721l.add(bVar.f252589j);
        }
        atomicReference.set(aeVar.f267711b.mo28208h("timeout", C95651ae.f267709a, new C95671t(aeVar, atomicBoolean, atomicBoolean2, list)));
        aeVar.f267714e.mo89626b().mo89639A(aVar);
    }
}
