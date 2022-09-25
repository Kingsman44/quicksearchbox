package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6995aq.C89256a;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.r */
/* compiled from: PG */
public final class C109941r {

    /* renamed from: a */
    public static final C59071e f306326a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.promo.r");

    /* renamed from: b */
    static final C48980c f306327b = C48980c.TYPE_OPA_MISC;

    /* renamed from: c */
    public final Context f306328c;

    /* renamed from: d */
    public final C1800aq f306329d;

    /* renamed from: e */
    public final C36337r f306330e;

    /* renamed from: f */
    public final C86124t f306331f;

    /* renamed from: g */
    public final C68214a f306332g;

    /* renamed from: h */
    public final C22871g f306333h;

    /* renamed from: i */
    private final C69464a f306334i;

    /* renamed from: j */
    private final C58833ax f306335j;

    /* renamed from: k */
    private final SharedPreferences f306336k;

    /* renamed from: l */
    private final C68214a f306337l;

    public C109941r(Context context, C69464a aVar, C58833ax axVar, C1800aq aqVar, C36337r rVar, SharedPreferences sharedPreferences, C68214a aVar2, C86124t tVar, C68214a aVar3, C22871g gVar) {
        this.f306328c = context;
        this.f306334i = aVar;
        this.f306335j = axVar;
        this.f306329d = aqVar;
        this.f306330e = rVar;
        this.f306336k = sharedPreferences;
        this.f306337l = aVar2;
        this.f306331f = tVar;
        this.f306332g = aVar3;
        this.f306333h = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo98262a() {
        if (mo98263b() && !C90771bo.m148273b(this.f306328c, UserHandleCompat.m148154a()) && this.f306331f.mo79746e(C90037cp.f248457al) && ((long) this.f306336k.getInt("opa_nga_swipe_demo_seen_count", 0)) < this.f306331f.mo79743a(C90053de.f248938E) && ((bm) this.f306334i.mo17428b()).u()) {
            if (!this.f306335j.mo56113h() || !((C74714bo) this.f306335j.mo56107c()).mo71081c()) {
                new C90873ag(((C108013bm) this.f306332g.mo27525b()).mo96369z(), this.f306333h, "onGsaLauncherOverlayCreated", new C109936m(this)).mo85223a(C109937n.f306321a);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo98263b() {
        return ((C89256a) this.f306337l.mo27525b()).mo83216d() == 2;
    }
}
