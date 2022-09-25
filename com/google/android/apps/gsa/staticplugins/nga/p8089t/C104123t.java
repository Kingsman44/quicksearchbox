package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.accounts.Account;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122191l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29651hv;
import com.google.android.libraries.mdi.download.C29652hw;
import com.google.android.libraries.mdi.download.C29678r;
import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.assistant.p3793ae.p3794a.C48773e;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.t */
/* compiled from: PG */
public final class C104123t implements C28746bx {

    /* renamed from: a */
    public static final C58974d f289645a = C58974d.m91136j();

    /* renamed from: b */
    public static final C58528ij f289646b = C58528ij.m90011K(C80627v.TCLIB, C80627v.DICTATION_FORMATTING);

    /* renamed from: c */
    public final C68214a f289647c;

    /* renamed from: d */
    public final C22871g f289648d;

    /* renamed from: e */
    public final C122191l f289649e;

    /* renamed from: f */
    public final C80617l f289650f;

    /* renamed from: g */
    public final C104040fe f289651g;

    /* renamed from: h */
    private final C103799g f289652h;

    /* renamed from: i */
    private final C86054o f289653i;

    /* renamed from: j */
    private final C86124t f289654j;

    /* renamed from: k */
    private final C103951bx f289655k;

    /* renamed from: l */
    private final C104079gq f289656l;

    /* renamed from: m */
    private final AtomicInteger f289657m = new AtomicInteger(0);

    public C104123t(C68214a aVar, C22871g gVar, C122191l lVar, C103951bx bxVar, C80617l lVar2, C103799g gVar2, C104079gq gqVar, C86054o oVar, C86124t tVar, C104040fe feVar) {
        this.f289647c = aVar;
        this.f289648d = gVar;
        this.f289649e = lVar;
        this.f289655k = bxVar;
        this.f289650f = lVar2;
        this.f289652h = gVar2;
        this.f289653i = oVar;
        this.f289656l = gqVar;
        this.f289654j = tVar;
        this.f289651g = feVar;
    }

    /* renamed from: a */
    public static C58495hd m172077a(C80627v vVar, C48770b bVar) {
        C58490gz gzVar = new C58490gz(4);
        if (!vVar.equals(C80627v.SKIP_COMPONENT_LIST)) {
            C48773e eVar = bVar.f126197b;
            if (eVar == null) {
                eVar = C48773e.f126198g;
            }
            C28708an anVar = eVar.f126205f;
            if (anVar == null) {
                anVar = C28708an.f77994l;
            }
            C62971cq<C28706al> cqVar = anVar.f78003h;
            if (vVar.equals(C80627v.DICTATION_FORMATTING)) {
                for (C28706al alVar : cqVar) {
                    String str = alVar.f77979b;
                    gzVar.mo55429h(str, str);
                }
                return gzVar.mo55427f(false);
            }
            for (C28706al alVar2 : cqVar) {
                String str2 = alVar2.f77979b;
                gzVar.mo55429h(str2, str2.replace("nga_", "apa_").replace("_nga", "_apa"));
            }
            return gzVar.mo55427f(false);
        }
        gzVar.mo55429h("nga_blacklist_hashes", "hashes");
        gzVar.mo55429h("nga_blacklist_rules", "rules");
        return gzVar.mo55427f(false);
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        if (!this.f289656l.mo93938a()) {
            return C60866ct.f164955a;
        }
        Optional ofNullable = Optional.ofNullable(this.f289653i.mo79668a());
        C58528ij a = this.f289655k.mo93894a();
        Locale b = this.f289652h.mo93859b();
        if (!this.f289650f.mo74371f()) {
            ((C58970a) ((C58970a) f289645a.mo56226d()).mo56372aa(21684)).mo56386p("Not migrating any groups because APA Data Download is not enabled.");
            return C60866ct.f164955a;
        } else if (!this.f289654j.mo79746e(C90126fx.f251342gx)) {
            ((C58970a) ((C58970a) f289645a.mo56224b()).mo56372aa(21683)).mo56386p("NGA to APA group migration is disabled.");
            return C60866ct.f164955a;
        } else if (((long) this.f289657m.get()) >= 5) {
            ((C58970a) ((C58970a) f289645a.mo56224b()).mo56372aa(21682)).mo56386p("Max migration attempts reached, skipping until NGA restarts.");
            return C60866ct.f164955a;
        } else {
            ((C58970a) ((C58970a) f289645a.mo56224b()).mo56372aa(21681)).mo56352E("Migrating NGA groups to APA groups for groups: %s. Attempt %d", Collection.EL.stream(a).map(C104115l.f289631a).collect(Collectors.joining(", ")), this.f289657m.incrementAndGet());
            return mo93944d((C60870cx[]) Collection.EL.stream(a).map(new C104116m(this, ofNullable, b)).toArray(C104117n.f289635a));
        }
    }

    /* renamed from: c */
    public final C60870cx mo93943c(Optional optional, C28708an anVar) {
        C58833ax j = C58833ax.m90833j((Account) optional.orElse(null));
        C29409fd fdVar = (C29409fd) this.f289647c.mo27525b();
        String str = anVar.f77997b;
        C22871g gVar = this.f289648d;
        C29651hv e = C29652hw.m54673e();
        e.mo34790b(str);
        e.mo34791c(true);
        ((C29678r) e).f80364b = j;
        return gVar.mo28210j(fdVar.mo34722k(e.mo34789a()), "[NGA] addFileGroupAndVerify", new C103954c(this, str, fdVar, anVar, j));
    }

    /* renamed from: d */
    public final C60870cx mo93944d(C60870cx... cxVarArr) {
        return this.f289648d.mo28210j(C60856cj.m92897f(cxVarArr), "[NGA] JoinVoidFutures", C104122s.f289644a);
    }
}
