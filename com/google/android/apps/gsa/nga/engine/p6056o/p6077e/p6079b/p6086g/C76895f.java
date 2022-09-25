package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6086g;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.g.f */
/* compiled from: PG */
public final class C76895f implements C76591c {

    /* renamed from: a */
    public static final C58974d f212342a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f212343b;

    /* renamed from: c */
    public final C83216f f212344c;

    /* renamed from: d */
    public final C81515c f212345d;

    /* renamed from: e */
    public final C74820be f212346e;

    /* renamed from: f */
    private final C22871g f212347f;

    public C76895f(Context context, C22871g gVar, C81515c cVar, C74820be beVar, C83251g gVar2) {
        this.f212343b = context;
        this.f212347f = gVar;
        this.f212345d = cVar;
        this.f212346e = beVar;
        this.f212344c = gVar2.mo76652a(C82831ca.CREATE_RECORDING);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.CREATE_RECORDING));
        h.mo72277g("Voice_recording_action", C90126fx.f251430if);
        h.mo72244c(C58485gu.m89846n("Voice_recording_action"));
        ((C76541a) h).f211766c = 19003;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        return this.f212347f.mo28201a("[NGA] build recorder voice command response", new C76893d(this, bgVar, nVar));
    }
}
