package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80459g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80462j;
import com.google.android.apps.gsa.nga.shared.p6359o.C81443a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.k */
/* compiled from: PG */
public final class C103093k implements C81443a {

    /* renamed from: a */
    public static final C58974d f287734a = C58974d.m91136j();

    /* renamed from: b */
    public final C21370a f287735b;

    /* renamed from: c */
    public final C118561t f287736c;

    /* renamed from: d */
    public final C22871g f287737d;

    /* renamed from: e */
    public final i f287738e;

    /* renamed from: f */
    public final C86124t f287739f;

    /* renamed from: g */
    private final C22871g f287740g;

    /* renamed from: h */
    private final C32160b f287741h;

    /* renamed from: i */
    private final SharedPreferences f287742i;

    public C103093k(C21370a aVar, C118561t tVar, C22871g gVar, C22871g gVar2, C32160b bVar, i iVar, C86124t tVar2, SharedPreferences sharedPreferences) {
        this.f287735b = aVar;
        this.f287736c = tVar;
        this.f287740g = gVar;
        this.f287737d = gVar2;
        this.f287741h = bVar;
        this.f287738e = iVar;
        this.f287739f = tVar2;
        this.f287742i = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo75082a(C58528ij ijVar) {
        Optional optional;
        if (this.f287739f.mo79746e(C90126fx.f251377hf) && this.f287739f.mo79746e(C90126fx.f251340gv) && this.f287742i.getLong("opa_eligibility_change_timestamp", 0) != 0) {
            long a = this.f287739f.mo79743a(C90126fx.f251396hy);
            long b = this.f287735b.mo26870b();
            if (b - this.f287742i.getLong("opa_eligibility_change_timestamp", b) >= TimeUnit.HOURS.toMillis(a)) {
                C58485gu d = C89988b.m146551d(this.f287739f.mo79758x(C90126fx.f251790pu));
                Optional empty = Optional.empty();
                C103046a aVar = new C103046a();
                aVar.f287665a = BuildConfig.FLAVOR;
                aVar.mo93586c(empty);
                C103092j a2 = aVar.mo93584a();
                C58800sl lA = ijVar.iterator();
                double d2 = C59203do.f157270a;
                while (lA.hasNext()) {
                    C80459g gVar = (C80459g) lA.next();
                    C80462j jVar = gVar.f220828c;
                    if (jVar == null) {
                        jVar = C80462j.f220829e;
                    }
                    if (jVar.f220833c > d2) {
                        C80462j jVar2 = gVar.f220828c;
                        if (jVar2 == null) {
                            jVar2 = C80462j.f220829e;
                        }
                        if (!jVar2.f220832b.isEmpty() && d.contains(gVar.f220827b)) {
                            C80462j jVar3 = gVar.f220828c;
                            if (jVar3 == null) {
                                jVar3 = C80462j.f220829e;
                            }
                            d2 = jVar3.f220833c;
                            C103091i a3 = a2.mo93598a();
                            C80462j jVar4 = gVar.f220828c;
                            if (jVar4 == null) {
                                jVar4 = C80462j.f220829e;
                            }
                            a3.mo93585b(jVar4.f220832b);
                            if ((gVar.f220826a & 1) != 0) {
                                a3.mo93586c(Optional.m71637of(gVar.f220827b));
                            }
                            a2 = a3.mo93584a();
                        }
                    }
                }
                if (!a2.mo93600c().isEmpty()) {
                    a2.mo93600c();
                    optional = Optional.m71637of(a2);
                } else {
                    optional = Optional.empty();
                }
                if (optional.isEmpty()) {
                    ((C58970a) ((C58970a) f287734a.mo56226d()).mo56372aa(21420)).mo56386p("[NGA Pie] No App to recommend found.");
                } else {
                    new C90873ag(this.f287741h.mo37974b(), this.f287740g, "[NGA] accountManager.getPrimaryAccountName call finished", new C103088f(this, optional)).mo85223a(C103089g.f287731a);
                }
            }
        }
    }
}
