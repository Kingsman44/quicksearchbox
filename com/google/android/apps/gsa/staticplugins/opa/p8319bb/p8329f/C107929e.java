package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8329f;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2998g.p2999a.C38342ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.f.e */
/* compiled from: PG */
public final class C107929e implements C86686h, C87682aj {

    /* renamed from: a */
    public static final C59071e f300292a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.f.e");

    /* renamed from: c */
    public final Context f300293c;

    /* renamed from: d */
    public final C58833ax f300294d;

    /* renamed from: e */
    public final C1800aq f300295e;

    /* renamed from: f */
    public final C85232a f300296f;

    /* renamed from: g */
    public final C87673aa f300297g;

    /* renamed from: h */
    public final C107930f f300298h;

    /* renamed from: i */
    public final C85392b f300299i;

    /* renamed from: j */
    public final C86124t f300300j;

    /* renamed from: k */
    public final ConnectivityManager f300301k;

    /* renamed from: l */
    public final C89859i f300302l;

    /* renamed from: m */
    public final C87594r f300303m;

    /* renamed from: n */
    public final C68214a f300304n;

    /* renamed from: o */
    public final C68214a f300305o;

    /* renamed from: p */
    public final C68214a f300306p;

    /* renamed from: q */
    public boolean f300307q;

    /* renamed from: r */
    private final C22871g f300308r;

    /* renamed from: s */
    private C58833ax f300309s = C58836b.f156633a;

    public C107929e(Context context, C58833ax axVar, C1800aq aqVar, C85232a aVar, C87673aa aaVar, C85392b bVar, C107930f fVar, C22871g gVar, C86124t tVar, ConnectivityManager connectivityManager, C89859i iVar, C87594r rVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f300293c = context;
        this.f300294d = axVar;
        this.f300295e = aqVar;
        this.f300296f = aVar;
        this.f300297g = aaVar;
        this.f300299i = bVar;
        this.f300298h = fVar;
        this.f300308r = gVar;
        this.f300300j = tVar;
        this.f300301k = connectivityManager;
        this.f300302l = iVar;
        this.f300303m = rVar;
        this.f300304n = aVar2;
        this.f300305o = aVar3;
        this.f300306p = aVar4;
    }

    /* renamed from: a */
    public static String m179179a(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38342ab abVar = (C38342ab) it.next();
            if (str.equals(abVar.f101526b)) {
                return abVar.f101527c;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        this.f300308r.mo28212l("onServiceEvent", new C107927c(this, serviceEventData));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        this.f300308r.mo28212l("start", new C107926b(this, j, bbVar));
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo96334m(boolean z) {
        this.f300296f.mo78814i(false);
        if (z) {
            this.f300295e.f5622a.cancel((String) null, C89885b.OKHTTP_UNEXPECTED_END_VALUE);
        }
        this.f300298h.f300310a = null;
        if (this.f300309s.mo56113h()) {
            ((C60870cx) this.f300309s.mo56107c()).cancel(false);
        }
        this.f300309s = C58836b.f156633a;
        this.f300307q = true;
        mo96336o();
        this.f300302l.mo83702b(C89849ae.OPA_ANDROID_WUWA_EXECUTION_CLEANUP);
    }

    /* renamed from: n */
    public final void mo96335n() {
        if (this.f300309s.mo56113h()) {
            ((C60870cx) this.f300309s.mo56107c()).cancel(false);
        }
        this.f300309s = C58833ax.m90834k(this.f300308r.mo28208h("WuwaSessionController#scheduleWuwaCleanUp", (long) ((int) this.f300300j.mo79743a(C90014bt.f247816oc)), new C107924a(this)));
    }

    /* renamed from: o */
    public final void mo96336o() {
        this.f300297g.mo81948t(false);
        this.f300297g.mo81933e();
    }
}
