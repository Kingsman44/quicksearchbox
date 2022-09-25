package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.view.ViewGroup;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.x */
/* compiled from: PG */
public final /* synthetic */ class C30780x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30704ab f83075a;

    public /* synthetic */ C30780x(C30704ab abVar) {
        this.f83075a = abVar;
    }

    public final void run() {
        C30704ab abVar = this.f83075a;
        ViewGroup viewGroup = abVar.f82912e;
        C30778v vVar = abVar.f82911d;
        Objects.requireNonNull(vVar);
        viewGroup.post(new C30781y(vVar));
    }
}
