package com.google.android.apps.gsa.staticplugins.feedback;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134279k;
import com.google.android.libraries.search.p2476a.p2479c.C32204e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.s */
/* compiled from: PG */
final class C101250s {

    /* renamed from: b */
    private static final C59071e f282575b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.feedback.s");

    /* renamed from: a */
    public final Context f282576a;

    /* renamed from: c */
    private final C32204e f282577c;

    /* renamed from: d */
    private final Executor f282578d;

    /* renamed from: com.google.android.apps.gsa.staticplugins.feedback.s$a */
    /* compiled from: PG */
    public interface C101251a {
        /* renamed from: bU */
        C134279k mo92195bU();
    }

    public C101250s(C32204e eVar, C90851k kVar, Context context) {
        this.f282577c = eVar;
        this.f282578d = kVar.mo85210c("DiscoverDebugDataF");
        this.f282576a = context;
    }

    /* renamed from: a */
    public final String mo92194a(Account account) {
        try {
            return (String) C90877ak.m148473g(C47633f.m84733g(this.f282577c.mo37990a(account.name)).mo51515h(new C101248q(this), this.f282578d).mo51516i(C101249r.f282574a, this.f282578d), 1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C59104x d = f282575b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DiscoverDebugDataF");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(19933)).mo56386p("Fetching Discover debug data failed.");
            return "Fetching Discover debug data failed: ".concat(String.valueOf(e.getMessage()));
        }
    }
}
