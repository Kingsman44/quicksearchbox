package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6085f;

import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.h.bf;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.annotators.ak;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.f.l */
/* compiled from: PG */
public final class C76889l implements C76591c {

    /* renamed from: a */
    public static final C58528ij f212327a = new C58759qy(C80080z.WEBREF);

    /* renamed from: b */
    public final bf f212328b;

    /* renamed from: c */
    public final ak f212329c;

    /* renamed from: d */
    public final C22871g f212330d;

    /* renamed from: e */
    private final C76878a f212331e;

    public C76889l(C76878a aVar, bf bfVar, ak akVar, C22871g gVar) {
        this.f212331e = aVar;
        this.f212328b = bfVar;
        this.f212329c = akVar;
        this.f212330d = gVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SEARCH_PERSONAL_PHOTOS));
        h.mo72277g("Search_photos", C90126fx.f251374hc);
        h.mo72277g("Search_photos_of_contact", C90126fx.f251376he);
        h.mo72244c(C58485gu.m89847o("Search_photos", "Search_photos_of_contact"));
        ((C76541a) h).f211766c = 10401;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        String str = (String) bgVar.mo72265g(C76564ah.f211801a, "query").orElse(BuildConfig.FLAVOR);
        C58485gu d = bgVar.mo72262d("face_label");
        if (!bgVar.f211838b.mo73901d("Search_photos_of_contact")) {
            return C60856cj.m92900i(mo72341c(str, nVar));
        }
        C58485gu b = bgVar.mo72260b("person", "PersonalContact", "person");
        return this.f212330d.mo28209i(this.f212330d.mo28209i(C80905at.m128762f(b, new C76884g(this, nVar)), "[NGA] post convertContactIdsToFaceLabelsQuery mapping", new C76885h(str)), "[NGA] post rewrite", new C76886i(this, nVar, d, str));
    }

    /* renamed from: c */
    public final C80401n mo72341c(String str, C74965n nVar) {
        Optional optional;
        if (this.f212331e.f212309c.getLaunchIntentForPackage("com.google.android.apps.photos") != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.google.android.apps.photos");
                intent.setData(C76878a.f212307a);
                optional = Optional.m71637of(intent);
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage("com.google.android.apps.photos");
                intent2.setData(Uri.withAppendedPath(C76878a.f212308b, Uri.encode(trim)));
                intent2.addFlags(536870912);
                optional = Optional.m71637of(intent2);
            }
        } else {
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            return C80401n.f220656k;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(59297);
        C81442m.m129557s(lVar, t.u((Intent) optional.get(), 1, nVar.mo71336k(), false, false));
        return (C80401n) lVar.build();
    }
}
