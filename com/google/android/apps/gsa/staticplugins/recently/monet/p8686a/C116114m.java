package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.m */
/* compiled from: PG */
public final /* synthetic */ class C116114m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116115n f322002a;

    /* renamed from: b */
    public final /* synthetic */ Account f322003b;

    /* renamed from: c */
    public final /* synthetic */ String f322004c;

    /* renamed from: d */
    public final /* synthetic */ C116124w f322005d;

    public /* synthetic */ C116114m(C116115n nVar, Account account, String str, C116124w wVar) {
        this.f322002a = nVar;
        this.f322003b = account;
        this.f322004c = str;
        this.f322005d = wVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116115n nVar = this.f322002a;
        Account account = this.f322003b;
        String str = this.f322004c;
        C116124w wVar = this.f322005d;
        Exception exc = (Exception) obj;
        if (!(exc instanceof CancellationException)) {
            C59104x c = C116115n.f322006a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MyActivityTokenHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(30893)).mo56386p("Failed to get token");
            nVar.mo102515b(account, (String) null, str, wVar);
        }
    }
}
