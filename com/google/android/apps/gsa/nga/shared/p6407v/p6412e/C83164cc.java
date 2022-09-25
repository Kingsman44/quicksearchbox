package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82912fa;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82915fd;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.cc */
/* compiled from: PG */
public final /* synthetic */ class C83164cc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82912fa f226775a;

    public /* synthetic */ C83164cc(C82912fa faVar) {
        this.f226775a = faVar;
    }

    public final void accept(Object obj) {
        C82912fa faVar = this.f226775a;
        C83614ac acVar = (C83614ac) obj;
        faVar.copyOnWrite();
        C82915fd fdVar = (C82915fd) faVar.instance;
        C82915fd fdVar2 = C82915fd.f226204f;
        acVar.getClass();
        fdVar.f226209d = acVar;
        fdVar.f226206a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
