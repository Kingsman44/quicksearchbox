package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80101ap;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21379b;
import com.google.android.libraries.social.populous.p3289c.C42208a;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.android.libraries.social.populous.p3289c.p3290a.C42210b;
import com.google.android.libraries.social.populous.p3289c.p3291b.C42212a;
import com.google.android.libraries.social.populous.p3289c.p3292c.C42215b;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42235c;
import com.google.android.libraries.social.populous.p3289c.p3293d.p3294a.C42223b;
import com.google.android.libraries.social.populous.p3289c.p3293d.p3294a.C42225d;
import com.google.android.libraries.social.populous.p3289c.p3293d.p3294a.C42229h;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61370al;
import com.google.frameworks.client.data.android.C61512j;
import com.google.frameworks.client.data.android.p4632a.C61345f;
import com.google.frameworks.client.data.android.p4632a.C61353n;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68227m;
import dagger.p5294a.C68228n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.ba */
/* compiled from: PG */
public final class C103679ba implements C103651a {

    /* renamed from: a */
    public static final C58974d f288778a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f288779b;

    /* renamed from: c */
    public final ExecutorService f288780c;

    /* renamed from: d */
    public C42211b f288781d = null;

    /* renamed from: e */
    private final AccountManager f288782e;

    /* renamed from: f */
    private final C22871g f288783f;

    /* renamed from: g */
    private final C22871g f288784g;

    public C103679ba(AccountManager accountManager, Context context, C90851k kVar, C22871g gVar, C22871g gVar2) {
        this.f288782e = accountManager;
        this.f288779b = context;
        this.f288783f = gVar;
        this.f288784g = gVar2;
        this.f288780c = kVar.mo85208a("[NGA] PopulousCloudContactResolver.autocomplete");
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80101ap apVar;
        C60870cx cxVar;
        if (bnVar.f219917a == 6) {
            apVar = (C80101ap) bnVar.f219918b;
        } else {
            apVar = C80101ap.f219806c;
        }
        String str = apVar.f219809b;
        C22871g gVar = this.f288783f;
        Account[] accounts = this.f288782e.getAccounts();
        if (accounts.length == 0) {
            cxVar = C60856cj.m92899h(new ExecutionException(new Exception("No account found.")));
        } else {
            if (this.f288781d == null) {
                C69464a aVar = C42208a.f110530a;
                Context context = this.f288779b;
                context.getClass();
                C68220f a = C68221g.m98521a(context);
                C69464a a2 = C68228n.m98538a(C21379b.f59773a);
                this.f288781d = new C42211b(new C42210b(context), new C42212a(context), new C42229h((C61512j) C68219e.m98519c(new C61370al(new C42225d(a, a2, C68219e.m98519c(new C61345f(C68219e.m98519c(new C61353n(a, a2)), a2, C42208a.f110530a)), new C42223b(new C42235c(a))), C68227m.f184586a)).mo17428b()), C42215b.m74175a(context), (C21370a) a2.mo17428b(), C58836b.f156633a);
            }
            cxVar = this.f288783f.mo28201a("[NGA] Construct Populous Autocomplete", new C103672au(this, accounts));
        }
        return C90877ak.m148471e(gVar.mo28210j(cxVar, "[NGA] Call Populous Autocomplete", new C103674aw(this, str)), 1500, TimeUnit.MILLISECONDS, this.f288784g);
    }
}
