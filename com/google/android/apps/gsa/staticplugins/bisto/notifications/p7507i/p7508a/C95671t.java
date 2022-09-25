package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.t */
/* compiled from: PG */
public final /* synthetic */ class C95671t implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C95651ae f267818a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f267819b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f267820c;

    /* renamed from: d */
    public final /* synthetic */ List f267821d;

    public /* synthetic */ C95671t(C95651ae aeVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, List list) {
        this.f267818a = aeVar;
        this.f267819b = atomicBoolean;
        this.f267820c = atomicBoolean2;
        this.f267821d = list;
    }

    public final void run() {
        C95651ae aeVar = this.f267818a;
        AtomicBoolean atomicBoolean = this.f267819b;
        AtomicBoolean atomicBoolean2 = this.f267820c;
        List list = this.f267821d;
        atomicBoolean.set(true);
        if (aeVar.f267720k.get()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (atomicBoolean2.get()) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            list.size();
            aeVar.mo89621e(list);
        }
    }
}
