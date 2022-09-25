package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29651hv;
import com.google.android.libraries.mdi.download.C29652hw;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.e */
/* compiled from: PG */
final class C102809e implements C60845bz {

    /* renamed from: a */
    public final String f287068a;

    /* renamed from: b */
    final /* synthetic */ C102810f f287069b;

    /* renamed from: c */
    private final String f287070c;

    /* renamed from: d */
    private final C29409fd f287071d;

    public C102809e(C102810f fVar, String str, String str2, C29409fd fdVar) {
        this.f287069b = fVar;
        this.f287068a = str;
        this.f287070c = str2;
        this.f287071d = fdVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C102810f.f287072a.mo56225c()).mo56382g(th)).mo56372aa(21167)).mo56354G("Failed to add hotword file group for '%s' from location: %s", this.f287068a, this.f287070c);
        this.f287069b.mo93462a(C118569b.HOTWORD_MODEL_MDD_ADD_FAILED);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C29690f fVar = (C29690f) obj;
        if (fVar == null) {
            ((C58970a) ((C58970a) C102810f.f287072a.mo56224b()).mo56372aa(21170)).mo56354G("Updated file group for locale '%s' from location: %s. Download pending.", this.f287068a, this.f287070c);
            this.f287069b.mo93462a(C118569b.HOTWORD_MODEL_MDD_ADD_PENDING);
            return;
        }
        String str = ((C28595b) fVar.f80416g.get(0)).f77799c;
        if (C92513g.m152178g((C42813k) this.f287069b.f287077e.mo27525b(), Uri.parse(str)) == null) {
            ((C58970a) ((C58970a) C102810f.f287072a.mo56226d()).mo56372aa(21169)).mo56359L("Updated file group for locale '%s' from location: %s. Group is considered downloaded but file is missing: %s", this.f287068a, this.f287070c, str);
            this.f287069b.mo93462a(C118569b.HOTWORD_MODEL_MDD_ADD_LOST);
            if (((C86124t) this.f287069b.f287074b.mo27525b()).mo79746e(C90082eg.f250022cf)) {
                C29409fd fdVar = this.f287071d;
                C29651hv e = C29652hw.m54673e();
                e.mo34790b(this.f287068a);
                C60870cx k = fdVar.mo34722k(e.mo34789a());
                C102808d dVar = new C102808d(this);
                C60856cj.m92911t(k, C47810es.m84974n(dVar), this.f287069b.f287076d);
                return;
            }
            return;
        }
        ((C58970a) ((C58970a) C102810f.f287072a.mo56224b()).mo56372aa(21168)).mo56354G("Updated file group for locale '%s' from location: %s. Download already finished.", this.f287068a, this.f287070c);
        this.f287069b.mo93462a(C118569b.HOTWORD_MODEL_MDD_ADD_ALREADY_DOWNLOADED);
    }
}
