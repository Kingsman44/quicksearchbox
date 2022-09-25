package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ae */
/* compiled from: PG */
final class C102461ae extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ int f285941a;

    /* renamed from: b */
    final /* synthetic */ Intent f285942b;

    /* renamed from: c */
    final /* synthetic */ C102462af f285943c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102461ae(C102462af afVar, int i, Intent intent) {
        super("Set result");
        this.f285943c = afVar;
        this.f285941a = i;
        this.f285942b = intent;
    }

    public final void run() {
        C102473aq aqVar = this.f285943c.f285944a;
        int i = this.f285941a;
        Intent intent = this.f285942b;
        C102497w wVar = (C102497w) aqVar;
        if (wVar.mo93315e()) {
            wVar.f286075b.f285949b.f54539k.setResult(i, intent);
        }
    }
}
