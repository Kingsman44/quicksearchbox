package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import androidx.core.content.C1877c;
import com.google.android.apps.search.googleapp.accounts.p10126ui.myaccount.C133356k;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30606g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30630m;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30484y;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.ar */
/* compiled from: PG */
public final class C133286ar implements C68220f {
    /* renamed from: a */
    public static C30631n m216330a(Fragment fragment, C30306o oVar, C133356k kVar, C47770dh dhVar, C133255c cVar) {
        C30630m k = C30631n.m57247k();
        k.mo36303d(fragment.getResources().getString(R.string.googleapp_accountmenu_search_history));
        Drawable a = C1877c.m5125a(fragment.requireContext(), R.drawable.quantum_gm_ic_history_black_24);
        a.getClass();
        C30606g gVar = (C30606g) k;
        gVar.f82676a = a;
        gVar.f82677b = new C47591co(dhVar, "Google App Account Menu Search History clicked", new C133258a(cVar, kVar));
        C30484y yVar = new C30484y(oVar);
        yVar.f82337c = C133338z.m216406a(fragment);
        yVar.mo36105d();
        gVar.f82678c = yVar;
        k.mo36304e(139626);
        C30631n a2 = k.mo36300a();
        C68225k.m98532d(a2);
        return a2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
