package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C95647aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95651ae f267702a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f267703b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f267704c;

    /* renamed from: d */
    public final /* synthetic */ AtomicBoolean f267705d;

    /* renamed from: e */
    public final /* synthetic */ List f267706e;

    public /* synthetic */ C95647aa(C95651ae aeVar, AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicBoolean atomicBoolean2, List list) {
        this.f267702a = aeVar;
        this.f267703b = atomicBoolean;
        this.f267704c = atomicReference;
        this.f267705d = atomicBoolean2;
        this.f267706e = list;
    }

    public final void run() {
        C95651ae aeVar = this.f267702a;
        AtomicBoolean atomicBoolean = this.f267703b;
        AtomicReference atomicReference = this.f267704c;
        AtomicBoolean atomicBoolean2 = this.f267705d;
        List list = this.f267706e;
        atomicBoolean.set(true);
        if (aeVar.f267720k.get()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C60870cx cxVar = (C60870cx) atomicReference.get();
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        if (atomicBoolean2.get()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        list.size();
        aeVar.mo89621e(list);
    }
}
