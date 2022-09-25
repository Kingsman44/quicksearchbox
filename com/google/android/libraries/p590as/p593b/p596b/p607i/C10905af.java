package com.google.android.libraries.p590as.p593b.p596b.p607i;

import android.content.Context;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p590as.p593b.p596b.C10846ba;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.android.libraries.p590as.p593b.p596b.C10948j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.as.b.b.i.af */
/* compiled from: PG */
public final class C10905af implements C28746bx {

    /* renamed from: a */
    public static final C58974d f35995a = C58974d.m91134h("ZipLPPopulator");

    /* renamed from: b */
    public final C10846ba f35996b;

    /* renamed from: c */
    public final C58485gu f35997c;

    /* renamed from: d */
    public final C10948j f35998d;

    /* renamed from: e */
    public final C60887da f35999e;

    /* renamed from: f */
    private final C68214a f36000f;

    /* renamed from: g */
    private final Context f36001g;

    public C10905af(C68214a aVar, C10846ba baVar, C58485gu guVar, C10948j jVar, Context context, C60887da daVar) {
        this.f36000f = aVar;
        this.f35996b = baVar;
        this.f35997c = guVar;
        this.f35998d = jVar;
        this.f36001g = context;
        this.f35999e = daVar;
    }

    /* renamed from: c */
    public static String m25922c(C10882h hVar) {
        return C10934m.m25955c(hVar.mo19289g().toLanguageTag(), hVar.mo19282a());
    }

    /* renamed from: a */
    public final C60870cx mo19335a(C29409fd fdVar) {
        ((C58970a) ((C58970a) f35995a.mo56224b()).mo56372aa(54034)).mo56386p("#addNewFileGroups");
        return C47633f.m84733g(((C10932k) this.f36000f.mo27525b()).mo19342a()).mo51516i(new C10946y(this), this.f35999e).mo51516i(new C10947z(this, fdVar), this.f35999e);
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C58974d dVar = f35995a;
        C58970a aVar = (C58970a) dVar.mo56224b();
        aVar.mo56380ai(C58979ad.MEDIUM);
        ((C58970a) aVar.mo56372aa(54036)).mo56386p("#scheduleLanguagePackDeletion");
        if (C20674d.m38855d(this.f36001g)) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(54037)).mo56386p("Skipping ZipfileLanguagePack #refreshFileGroups because of direct boot mode.");
            return C60866ct.f164955a;
        }
        C60870cx a = mo19335a(fdVar);
        C10900aa aaVar = new C10900aa(this, fdVar);
        C60856cj.m92911t(a, C47810es.m84974n(aaVar), this.f35999e);
        return a;
    }

    /* renamed from: d */
    public final void mo19337d(C29409fd fdVar) {
        C47633f i = C47633f.m84733g(((C10932k) this.f36000f.mo27525b()).mo19343b(fdVar)).mo51516i(new C10942u(this), this.f35999e).mo51516i(new C10943v(fdVar), this.f35999e);
        C10904ae aeVar = new C10904ae();
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(aeVar), this.f35999e);
    }
}
