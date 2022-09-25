package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import androidx.core.content.C1877c;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.apps.search.googleapp.p10140c.p10141a.C133490a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.features.C30606g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30630m;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30484y;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.av */
/* compiled from: PG */
public final class C133290av implements C68220f {
    /* renamed from: a */
    public static C30631n m216338a(Fragment fragment, C133490a aVar, C30484y yVar, C47770dh dhVar, C133255c cVar) {
        C30630m k = C30631n.m57247k();
        k.mo36303d(fragment.getResources().getString(R.string.googleapp_accountmenu_your_contributions));
        Drawable a = C1877c.m5125a(fragment.requireContext(), R.drawable.quantum_ic_rate_review_white_24);
        a.getClass();
        C30606g gVar = (C30606g) k;
        gVar.f82676a = a;
        gVar.f82677b = new C47591co(dhVar, "Google App Account Menu Your Contributions clicked", new C133333u(cVar, fragment, aVar));
        gVar.f82678c = yVar;
        k.mo36304e(139629);
        C30631n a2 = k.mo36300a();
        C68225k.m98532d(a2);
        return a2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
