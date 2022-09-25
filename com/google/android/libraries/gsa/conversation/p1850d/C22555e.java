package com.google.android.libraries.gsa.conversation.p1850d;

import android.webkit.ValueCallback;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.conversation.d.e */
/* compiled from: PG */
public final /* synthetic */ class C22555e implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C22559i f62174a;

    /* renamed from: b */
    public final /* synthetic */ long f62175b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f62176c;

    public /* synthetic */ C22555e(C22559i iVar, long j, SettableFuture settableFuture) {
        this.f62174a = iVar;
        this.f62175b = j;
        this.f62176c = settableFuture;
    }

    public final void onReceiveValue(Object obj) {
        C22559i iVar = this.f62174a;
        long j = this.f62175b;
        SettableFuture settableFuture = this.f62176c;
        String str = (String) obj;
        iVar.f62189j.mo27583b(iVar.f62186g.mo26870b() - j);
        iVar.f62185f.set(!iVar.f62188i.mo56113h());
        settableFuture.mo57356n(iVar.f62188i);
    }
}
