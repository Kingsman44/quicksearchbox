package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.aa */
/* compiled from: PG */
final class C102457aa extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ String f285935a;

    /* renamed from: b */
    final /* synthetic */ C102462af f285936b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102457aa(C102462af afVar, String str) {
        super("User navigation");
        this.f285936b = afVar;
        this.f285935a = str;
    }

    public final void run() {
        C102473aq aqVar = this.f285936b.f285944a;
        String str = this.f285935a;
        C102497w wVar = (C102497w) aqVar;
        if (wVar.mo93315e()) {
            wVar.f286075b.mo93271b(str, Query.f252741b);
        }
    }
}
