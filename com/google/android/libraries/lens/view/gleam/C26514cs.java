package com.google.android.libraries.lens.view.gleam;

import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.gleam.cs */
/* compiled from: PG */
public final /* synthetic */ class C26514cs implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26526dd f72255a;

    public /* synthetic */ C26514cs(C26526dd ddVar) {
        this.f72255a = ddVar;
    }

    public final void run() {
        C26526dd ddVar = this.f72255a;
        ddVar.mo31771g();
        C58485gu f = ddVar.f72296f.mo30772f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            ((C26504ci) f.get(i)).f72220n = false;
        }
        ddVar.f72296f.f69788d = C58836b.f156633a;
    }
}
