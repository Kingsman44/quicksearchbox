package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.gsa.conversation.g.ay */
/* compiled from: PG */
public final /* synthetic */ class C22638ay implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C22654bn f62360a;

    /* renamed from: b */
    public final /* synthetic */ C22618ae f62361b;

    /* renamed from: c */
    public final /* synthetic */ C57981b f62362c;

    public /* synthetic */ C22638ay(C22654bn bnVar, C22618ae aeVar, C57981b bVar) {
        this.f62360a = bnVar;
        this.f62361b = aeVar;
        this.f62362c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C22654bn bnVar = this.f62360a;
        C22618ae aeVar = this.f62361b;
        C57981b bVar = this.f62362c;
        SettableFuture settableFuture = new SettableFuture();
        bVar.mo20440jJ(new C22652bl(bnVar, aeVar, settableFuture, new C22620ag(aeVar), bnVar.f62415m));
        bnVar.f62415m = C58836b.f156633a;
        return settableFuture;
    }
}
