package com.google.android.libraries.onegoogle.accountmanagement.p2350b;

import android.content.Context;
import com.google.android.libraries.onegoogle.common.C30921h;
import com.google.android.libraries.onegoogle.common.C30922i;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.b.k */
/* compiled from: PG */
public final /* synthetic */ class C30266k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30271p f81834a;

    /* renamed from: b */
    public final /* synthetic */ C30922i f81835b;

    /* renamed from: c */
    public final /* synthetic */ Context f81836c;

    public /* synthetic */ C30266k(C30271p pVar, C30922i iVar, Context context) {
        this.f81834a = pVar;
        this.f81835b = iVar;
        this.f81836c = context;
    }

    public final void run() {
        C30271p pVar = this.f81834a;
        C30922i iVar = this.f81835b;
        Context context = this.f81836c;
        if (pVar.f81846b.mo56113h()) {
            C30921h.m57712a(iVar, new C30264i(pVar, context));
        }
    }
}
