package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import androidx.core.content.C1877c;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30606g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30630m;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30465f;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.an */
/* compiled from: PG */
public final class C133282an implements C68220f {
    /* renamed from: a */
    public static C30631n m216322a(Fragment fragment, C139272a aVar, C30306o oVar, C30465f fVar, C47770dh dhVar, C133255c cVar) {
        C30630m k = C30631n.m57247k();
        k.mo36303d(fragment.getResources().getString(R.string.googleapp_accountmenu_search_console_insights));
        Drawable a = C1877c.m5125a(fragment.requireContext(), R.drawable.quantum_gm_ic_trending_up_gm_grey_24);
        a.getClass();
        C30606g gVar = (C30606g) k;
        gVar.f82676a = a;
        gVar.f82677b = new C47591co(dhVar, "Google App Account Menu Search Console Insight clicked", new C133298e(cVar, oVar, aVar, fragment));
        gVar.f82678c = fVar;
        k.mo36302c(R.id.googleapp_account_menu_search_console_insights_id);
        k.mo36304e(139631);
        C30631n a2 = k.mo36300a();
        C68225k.m98532d(a2);
        return a2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
