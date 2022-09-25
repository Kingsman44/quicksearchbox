package com.google.android.libraries.gsa.conversation.p1850d;

import android.util.Pair;
import android.webkit.ValueCallback;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.conversation.d.a */
/* compiled from: PG */
public final /* synthetic */ class C22551a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C22559i f62160a;

    /* renamed from: b */
    public final /* synthetic */ long f62161b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f62162c;

    public /* synthetic */ C22551a(C22559i iVar, long j, SettableFuture settableFuture) {
        this.f62160a = iVar;
        this.f62161b = j;
        this.f62162c = settableFuture;
    }

    public final void onReceiveValue(Object obj) {
        C22559i iVar = this.f62160a;
        long j = this.f62161b;
        SettableFuture settableFuture = this.f62162c;
        String str = (String) obj;
        iVar.f62190k.mo27583b(iVar.f62186g.mo26870b() - j);
        C58976aa aaVar = C58975e.f156826a;
        settableFuture.mo57356n(Pair.create(str.substring(1, str.length() - 1), iVar.f62188i));
    }
}
