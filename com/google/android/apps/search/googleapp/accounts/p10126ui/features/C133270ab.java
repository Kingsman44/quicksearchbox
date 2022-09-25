package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import androidx.core.content.C1877c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.features.C30606g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30630m;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30465f;
import com.google.android.libraries.search.p3025k.p3026a.C38524a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.ab */
/* compiled from: PG */
public final class C133270ab implements C68220f {
    /* renamed from: a */
    public static C30631n m216298a(Fragment fragment, AccountId accountId, C47770dh dhVar, C38524a aVar, AtomicReference atomicReference, C30465f fVar, boolean z) {
        C30630m k = C30631n.m57247k();
        k.mo36303d(fragment.getResources().getString(R.string.googleapp_accountmenu_chrome_incognito));
        Drawable a = C1877c.m5125a(fragment.requireContext(), R.drawable.quantum_ic_incognito_black_24);
        a.getClass();
        C30606g gVar = (C30606g) k;
        gVar.f82676a = a;
        gVar.f82677b = new C47591co(dhVar, "Google App Account Menu New Chrome Incognito Tab clicked", new C133330r(atomicReference, accountId, fragment, z, aVar));
        gVar.f82678c = fVar;
        C30631n a2 = k.mo36300a();
        C68225k.m98532d(a2);
        return a2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
