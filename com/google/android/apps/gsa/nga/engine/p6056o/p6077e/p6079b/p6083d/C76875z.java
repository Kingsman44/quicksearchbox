package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.h.bf;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.l.c.r;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a.C76899c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a.C76917u;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.z */
/* compiled from: PG */
public final class C76875z extends C76899c {

    /* renamed from: a */
    public final bf f212303a;

    /* renamed from: d */
    private final C22871g f212304d;

    public C76875z(bf bfVar, r rVar, C22871g gVar, C22871g gVar2) {
        super(rVar, gVar);
        this.f212303a = bfVar;
        this.f212304d = gVar2;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.FORWARD_TO_THE_EMAIL));
        h.mo72277g("forward_mail_to", C90126fx.f251232et);
        h.mo72244c(C58485gu.m89846n(C76917u.m123539a("forward_mail_to")));
        ((C76541a) h).f211766c = 10213;
        return h.mo72276f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C60870cx mo72338k(C76590bg bgVar) {
        String[] strArr = {"content"};
        C22871g gVar = this.f212304d;
        C58485gu b = bgVar.mo72260b("recipient", "PersonalContact", "contact");
        C22871g gVar2 = this.f212304d;
        C58485gu guVar = df.e(b).b;
        bf bfVar = this.f212303a;
        Objects.requireNonNull(bfVar);
        return gVar.mo28209i(gVar2.mo28210j(C80905at.m128759c(guVar, new C76873x(bfVar)), "[NGA] transform emails", new C76874y(this)), "[NGA] transform email", new C76872w((String) bgVar.mo72265g(C76564ah.f211801a, strArr).orElse(BuildConfig.FLAVOR)));
    }
}
