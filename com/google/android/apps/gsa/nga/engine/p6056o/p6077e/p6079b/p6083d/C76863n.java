package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.am.h.bf;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.n */
/* compiled from: PG */
public final class C76863n implements C76591c {

    /* renamed from: a */
    public static final C58974d f212282a = C58974d.m91136j();

    /* renamed from: b */
    public final bf f212283b;

    /* renamed from: c */
    public final C22871g f212284c;

    /* renamed from: d */
    public final C91142g f212285d;

    /* renamed from: e */
    private final C76832ab f212286e;

    public C76863n(bf bfVar, C22871g gVar, C76832ab abVar, C91142g gVar2) {
        this.f212283b = bfVar;
        this.f212284c = gVar;
        this.f212286e = abVar;
        this.f212285d = gVar2;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.COMPOSE_EMAIL));
        h.mo72277g("Send_email", C90126fx.f251228ep);
        h.mo72244c(C58485gu.m89846n("Send_email"));
        ((C76541a) h).f211766c = 10202;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C58485gu d = bgVar.mo72262d("recipient");
        if (d.size() == 1) {
            if (!this.f212285d.mo85405j(C90126fx.f251229eq)) {
                return C81442m.f222851a;
            }
            return mo72339c((String) d.get(0), nVar);
        } else if (d.size() > 1) {
            return C81442m.f222851a;
        } else {
            C22871g gVar = this.f212284c;
            C58485gu guVar = df.e(bgVar.mo72260b("recipient", "PersonalContact", "contact")).b;
            bf bfVar = this.f212283b;
            Objects.requireNonNull(bfVar);
            return gVar.mo28210j(C80905at.m128759c(guVar, new C76861l(bfVar)), "[NGA] transform emails", new C76859j(this, nVar));
        }
    }

    /* renamed from: c */
    public final C60870cx mo72339c(String str, C74965n nVar) {
        Intent addFlags = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:".concat(String.valueOf(str)))).setPackage("com.google.android.gm").addFlags(32768);
        if (this.f212285d.mo85405j(C90126fx.f251227eo)) {
            addFlags.putExtra("focus_in_body", true);
        }
        return this.f212284c.mo28209i(this.f212286e.mo72336a(addFlags), "[NGA] ComposeEmailFulfiller.composeToAddress", new C76862m(nVar));
    }
}
