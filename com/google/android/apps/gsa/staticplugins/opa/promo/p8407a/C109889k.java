package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import android.text.TextUtils;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p4008y.p4013d.C53655g;
import com.google.assistant.p4008y.p4013d.C53657i;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.k */
/* compiled from: PG */
public final class C109889k {

    /* renamed from: a */
    public static final C59071e f306186a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.promo.a.k");

    /* renamed from: b */
    public final C118561t f306187b;

    /* renamed from: c */
    public final C68214a f306188c;

    /* renamed from: d */
    public final C68214a f306189d;

    /* renamed from: e */
    public final C22871g f306190e;

    /* renamed from: f */
    private final C21370a f306191f;

    /* renamed from: g */
    private final C1800aq f306192g;

    public C109889k(C118561t tVar, C68214a aVar, C68214a aVar2, C22871g gVar, C21370a aVar3, C1800aq aqVar) {
        this.f306187b = tVar;
        this.f306188c = aVar;
        this.f306189d = aVar2;
        this.f306190e = gVar;
        this.f306191f = aVar3;
        this.f306192g = aqVar;
    }

    /* renamed from: d */
    private static final void m183026d(String str, int i) {
        C60321oe l = C28285c.m52885l(str, i);
        if (l != null) {
            C89949q.m146521e(l, false);
        }
    }

    /* renamed from: a */
    public final void mo98221a() {
        this.f306192g.f5622a.cancel("op", C89885b.OKHTTP_VERSION_NOT_3_VALUE);
    }

    /* renamed from: b */
    public final void mo98222b(C53658j jVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            int a = C53657i.m86881a(jVar.f140835f);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 3) {
                m183026d(str, 22);
            } else if (i == 4 || i == 6) {
                m183026d(str, 5);
            }
        }
    }

    /* renamed from: c */
    public final void mo98223c(C53658j jVar) {
        C53655g gVar = (C53655g) jVar.toBuilder();
        C63042fg i = C62953e.m95484i(this.f306191f.mo26870b());
        gVar.copyOnWrite();
        C53658j jVar2 = (C53658j) gVar.instance;
        i.getClass();
        jVar2.f140836g = i;
        jVar2.f140830a |= 4;
        new C90873ag(((C108013bm) this.f306189d.mo27525b()).mo96353D((C53658j) gVar.build()), this.f306190e, "updateClientState", C109884f.f306181a).mo85223a(new C109885g(jVar));
    }
}
