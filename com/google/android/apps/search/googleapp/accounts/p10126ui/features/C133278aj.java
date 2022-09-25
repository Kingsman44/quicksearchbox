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
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30463d;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30484y;
import com.google.android.libraries.onegoogle.common.C30931r;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.aj */
/* compiled from: PG */
public final class C133278aj implements C68220f {
    /* renamed from: a */
    public static C30631n m216314a(Fragment fragment, C30306o oVar, C30484y yVar, C47770dh dhVar, C139272a aVar, C133255c cVar) {
        C30630m k = C30631n.m57247k();
        k.mo36303d(fragment.getResources().getString(R.string.googleapp_accountmenu_personal_info_removal));
        Drawable a = C1877c.m5125a(fragment.requireContext(), R.drawable.quantum_gm_ic_contact_page_black_24);
        a.getClass();
        C30606g gVar = (C30606g) k;
        gVar.f82676a = a;
        gVar.f82677b = new C47591co(dhVar, "Personal Info Removal clicked", new C133300g(cVar, oVar, aVar, fragment));
        gVar.f82678c = yVar;
        k.mo36304e(147906);
        k.mo36302c(R.id.googleapp_account_menu_personal_info_removal_id);
        C30631n a2 = k.mo36300a();
        C30931r.m57728a(a2.mo36323e(), C58833ax.m90834k(C30463d.m56757a(fragment.getResources().getString(R.string.googleapp_account_menu_beta_label))));
        C68225k.m98532d(a2);
        return a2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
