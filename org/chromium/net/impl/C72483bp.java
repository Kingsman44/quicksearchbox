package org.chromium.net.impl;

import java.net.URI;

/* renamed from: org.chromium.net.impl.bp */
/* compiled from: PG */
final class C72483bp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f192855a;

    /* renamed from: b */
    final /* synthetic */ C72499ce f192856b;

    public C72483bp(C72499ce ceVar, String str) {
        this.f192856b = ceVar;
        this.f192855a = str;
    }

    public final void run() {
        C72499ce ceVar = this.f192856b;
        ceVar.f192907p = URI.create(ceVar.f192904m).resolve(this.f192855a).toString();
        C72499ce ceVar2 = this.f192856b;
        ceVar2.f192897f.add(ceVar2.f192907p);
        this.f192856b.mo64252m(2, 3, new C72482bo(this));
    }
}
