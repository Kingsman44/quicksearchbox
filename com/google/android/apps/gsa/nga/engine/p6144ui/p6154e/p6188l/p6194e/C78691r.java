package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80886aa;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80918n;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.r */
/* compiled from: PG */
public final /* synthetic */ class C78691r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78667aa f216621a;

    public /* synthetic */ C78691r(C78667aa aaVar) {
        this.f216621a = aaVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C78688o oVar = this.f216621a.f216573f;
        C78670ad a = ((C78698y) ((C78699z) obj).mo73577b().get()).mo73562a();
        if (!oVar.f216616d.mo85405j(C90040cs.f248634A)) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        if (!a.f216581c || oVar.f216616d.mo85405j(C90040cs.f248654U)) {
            C81515c cVar = oVar.f216614b;
            Locale a2 = C78671ae.m126392a(a);
            cxVar = oVar.f216613a.mo28201a("[NGA] provideLensTactileChipImpl", new C78682i(cVar.mo75121a(a2).getString(true != oVar.f216616d.mo85405j(C90040cs.f248655V) ? R.string.tactile_evergreen_chip_lens_label : R.string.tactile_chip_search_this_screen_label, new Object[0])));
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C58485gu o = C58485gu.m89847o(cxVar, oVar.f216613a.mo28201a("[NGA] provideKeyboardTactileChip", new C78684k(oVar, a)));
        Executor executor = oVar.f216615c;
        return C47633f.m84733g(new C80886aa(new C80918n(o, executor), C58485gu.m89845m(), executor).mo74702b(C78685l.f216610a).mo74703c(3).mo74704d(C78686m.f216611a).mo74705f(C58370cn.f155946a)).mo51515h(new C78687n(oVar), oVar.f216615c);
    }
}
