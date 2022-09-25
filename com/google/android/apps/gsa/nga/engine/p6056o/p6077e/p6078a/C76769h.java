package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6078a;

import com.google.android.apps.gsa.nga.engine.c.b;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.appactions.p11035a.C147840h;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.a.h */
/* compiled from: PG */
final class C76769h implements C76591c {

    /* renamed from: a */
    private final C76766e f212145a;

    /* renamed from: b */
    private final b f212146b;

    public C76769h(C76766e eVar, b bVar) {
        this.f212145a = eVar;
        this.f212146b = bVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.OPEN_APP_FEATURE));
        h.mo72277g("Open_app_feature", C90126fx.f251030bC);
        h.mo72244c(C58485gu.m89846n("Open_app_feature"));
        ((C76541a) h).f211766c = 25001;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        Optional optional;
        if (!bgVar.f211838b.mo73901d("Open_app_feature")) {
            return C81442m.f222851a;
        }
        C76766e eVar = this.f212145a;
        Optional c = eVar.mo72329c(bgVar, "app", nVar, eVar.mo72330d("actions.intent.OPEN_APP_FEATURE"));
        if (c.isEmpty()) {
            return C81442m.f222851a;
        }
        String str = (String) c.get();
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "app_feature");
        if (g.isEmpty()) {
            return C81442m.f222851a;
        }
        c.get();
        g.get();
        String str2 = (String) g.get();
        C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
        fyVar.copyOnWrite();
        C63063ga gaVar = (C63063ga) fyVar.instance;
        str2.getClass();
        gaVar.f170181a = 3;
        gaVar.f170182b = str2;
        C58495hd n = C58495hd.m89900n("feature", (C63063ga) fyVar.build());
        Optional a = this.f212146b.a(str, "actions.intent.OPEN_APP_FEATURE", n, (String) this.f212145a.mo72327a(str, nVar).orElse(null));
        if (a.isEmpty()) {
            optional = Optional.empty();
        } else {
            C147840h hVar = (C147840h) a.get();
            if (hVar.mo124509d() != 3) {
                optional = Optional.empty();
            } else if (!hVar.mo124507b()) {
                optional = Optional.empty();
            } else {
                optional = this.f212145a.mo72331e(nVar, hVar.mo124506a(), str, hVar.mo124508c());
            }
        }
        if (optional.isEmpty()) {
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C81442m.m129557s(lVar, (C51809dy) optional.get());
        lVar.mo74319k(104947);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
