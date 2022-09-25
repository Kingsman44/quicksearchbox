package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.p375ai.p378b.C7880nj;
import com.google.p375ai.p378b.C7891nu;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.search.core.ax */
/* compiled from: PG */
final class C85639ax extends C90888av {

    /* renamed from: a */
    final /* synthetic */ Account f231472a;

    /* renamed from: b */
    final /* synthetic */ C85637av f231473b;

    /* renamed from: c */
    final /* synthetic */ C7880nj f231474c;

    /* renamed from: d */
    final /* synthetic */ C7891nu f231475d;

    /* renamed from: e */
    final /* synthetic */ int f231476e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85639ax(Account account, C85637av avVar, int i, C7880nj njVar, C7891nu nuVar) {
        super("BaseOptInActivity", "report optin action to server", 2, 12);
        this.f231472a = account;
        this.f231473b = avVar;
        this.f231476e = i;
        this.f231474c = njVar;
        this.f231475d = nuVar;
    }

    public final void run() {
        this.f231473b.mo79117c(this.f231472a, 2, this.f231476e, this.f231474c, this.f231475d, Collections.emptyList(), Collections.emptyList(), false);
    }
}
