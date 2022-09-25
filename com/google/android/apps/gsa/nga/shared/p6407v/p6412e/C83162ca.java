package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82912fa;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82915fd;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ca */
/* compiled from: PG */
public final /* synthetic */ class C83162ca implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82912fa f226773a;

    public /* synthetic */ C83162ca(C82912fa faVar) {
        this.f226773a = faVar;
    }

    public final void accept(Object obj) {
        C82912fa faVar = this.f226773a;
        String str = (String) obj;
        faVar.copyOnWrite();
        C82915fd fdVar = (C82915fd) faVar.instance;
        C82915fd fdVar2 = C82915fd.f226204f;
        str.getClass();
        fdVar.f226206a |= 2;
        fdVar.f226208c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
