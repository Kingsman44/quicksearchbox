package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Context;
import android.os.UserManager;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.am.t.n;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74849ah;
import com.google.android.apps.gsa.nga.engine.p5913am.p5938t.C74956m;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74966o;
import com.google.android.apps.gsa.nga.engine.p5972aw.C75170o;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.ak */
/* compiled from: PG */
public final class C76957ak implements C76591c {

    /* renamed from: a */
    public final C22871g f212464a;

    /* renamed from: b */
    public final C75170o f212465b;

    /* renamed from: c */
    public final C60950i f212466c;

    /* renamed from: d */
    public final C74849ah f212467d;

    /* renamed from: e */
    public final C81515c f212468e;

    /* renamed from: f */
    private final n f212469f;

    /* renamed from: g */
    private final UserManager f212470g;

    public C76957ak(Context context, n nVar, C75170o oVar, C60950i iVar, C22871g gVar, C74849ah ahVar, C81515c cVar) {
        this.f212469f = nVar;
        this.f212465b = oVar;
        this.f212466c = iVar;
        this.f212464a = gVar;
        this.f212467d = ahVar;
        this.f212470g = (UserManager) context.getSystemService(UserManager.class);
        this.f212468e = cVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.TAKE_SCREENSHOT));
        ((C76541a) h).f211766c = 11121;
        h.mo72244c(C58485gu.m89846n("Take_screenshot"));
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        UserManager userManager = this.f212470g;
        if (userManager == null || !userManager.getUserRestrictions().getBoolean("no_content_capture")) {
            C74966o h = nVar.mo71333h();
            C74956m a = this.f212469f.a();
            if (!a.mo71323c()) {
                return C60856cj.m92900i(this.f212469f.c(a, nVar.mo71342q()));
            }
            return this.f212464a.mo28209i(this.f212464a.mo28210j(h.mo71353e(), "[NGA] take screenshot using ScreenContentState", new C76954ah(this)), "[NGA] take screenshot fulfiller using generateResponse", new C76956aj(this, nVar));
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C81442m.m129557s(lVar, t.r(this.f212468e.mo75121a(nVar.mo71342q()).getString(R.string.nga_phone_settings_cant_take_screenshot_restricted, new Object[0])));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
