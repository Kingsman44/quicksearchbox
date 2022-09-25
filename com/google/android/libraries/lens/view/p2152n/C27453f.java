package com.google.android.libraries.lens.view.p2152n;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.n.f */
/* compiled from: PG */
public final /* synthetic */ class C27453f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27456i f75104a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f75105b;

    public /* synthetic */ C27453f(C27456i iVar, C58833ax axVar) {
        this.f75104a = iVar;
        this.f75105b = axVar;
    }

    public final void run() {
        C27456i iVar = this.f75104a;
        iVar.mo32989d("tapped_frames_timestamp.txt", Long.toString(iVar.mo32987a(((Long) this.f75105b.mo56107c()).longValue())));
    }
}
