package com.google.android.apps.search.googleapp.accounts.p10126ui;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount.C133353h;
import com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount.C133354i;
import com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount.C133355j;
import com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount.C133356k;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30295d;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30304m;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30307p;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30309r;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30473n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30474o;
import com.google.android.libraries.onegoogle.p2380c.C30834a;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.p3616e.p3623f.C46354b;
import com.google.apps.tiktok.account.p3616e.p3623f.C46355c;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.contrib.p3706g.C47667b;
import com.google.apps.tiktok.tracing.contrib.p3706g.C47675j;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.ae */
/* compiled from: PG */
public final class C133175ae implements C68220f {
    /* renamed from: a */
    public static C30305n m216159a(Fragment fragment, C30306o oVar, C46355c cVar, C30518b bVar, C47449e eVar, C133356k kVar, ExecutorService executorService, C28421h hVar) {
        C30304m f = C30305n.m56405f(fragment.requireContext(), C46108a.class);
        if (cVar != null) {
            C30309r rVar = (C30309r) f;
            rVar.f81942d = cVar;
            if (oVar != null) {
                rVar.f81941c = oVar;
                C30473n h = C30474o.m56824h();
                h.mo36087d(false);
                f.mo35844r(h.mo36084a());
                rVar.f81947i = C46354b.m82635a(eVar, fragment, cVar);
                rVar.f81945g = new C30834a(cVar, fragment.requireContext());
                f.mo35842p(executorService);
                f.mo35849w(hVar);
                f.mo35845s(bVar);
                C30295d dVar = new C30295d(kVar.f363372c);
                C30307p pVar = new C30307p();
                C47675j jVar = kVar.f363374e;
                pVar.f81935a = new C47667b(jVar, "Google App Account Menu My Account clicked", new C133353h(kVar, dVar));
                pVar.f81936b = new C47667b(jVar, "Google App Account Menu Use Another Account clicked", new C133354i());
                pVar.f81937c = new C47667b(jVar, "Google App Account Menu Manage Accounts clicked", new C133355j());
                f.mo35843q(pVar.mo35816a());
                C30305n d = f.mo35830d();
                C68225k.m98532d(d);
                return d;
            }
            throw new NullPointerException("Null accountsModel");
        }
        throw new NullPointerException("Null accountConverter");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
