package com.google.android.apps.gsa.staticplugins.p7642cb;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6771z.C85620a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6872d.C86966r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88363yx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88364yy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88365yz;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89036bg;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66554ak;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.cb.d */
/* compiled from: PG */
public final class C97517d extends C86734a implements C85620a {

    /* renamed from: j */
    private static final C59071e f272332j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cb.d");

    /* renamed from: a */
    public final C89037bh f272333a;

    /* renamed from: b */
    public final C22871g f272334b;

    /* renamed from: c */
    public final C68214a f272335c;

    /* renamed from: f */
    public volatile C89062r f272336f;

    /* renamed from: g */
    public C60870cx f272337g;

    /* renamed from: h */
    public int f272338h = 1;

    /* renamed from: i */
    public final C86966r f272339i;

    /* renamed from: k */
    private final C86610af f272340k;

    /* renamed from: l */
    private final Set f272341l = new HashSet();

    /* renamed from: m */
    private final C89036bg f272342m = new C97516c(this);

    public C97517d(C89037bh bhVar, C22871g gVar, C86610af afVar, C86966r rVar, C68214a aVar) {
        super(C118575h.WORKER_CONNECTIVITY, "networkmonitor");
        this.f272333a = bhVar;
        this.f272334b = gVar;
        this.f272339i = rVar;
        this.f272340k = afVar;
        this.f272335c = aVar;
    }

    /* renamed from: a */
    public final void mo79100a(long j) {
        this.f272341l.add(Long.valueOf(j));
        int i = this.f272338h;
        if (i == 1) {
            this.f272333a.mo27382h(this.f272342m);
            this.f272338h = 2;
        } else if (i == 3) {
            C60870cx cxVar = this.f272337g;
            if (cxVar != null) {
                cxVar.cancel(false);
                this.f272337g = null;
            }
            this.f272338h = 2;
        }
    }

    /* renamed from: c */
    public final void mo79101c() {
        if (this.f272340k.mo80227h()) {
            C89062r b = this.f272333a.mo27377b();
            C86775r rVar = this.f272340k.f233977l;
            if (rVar != null) {
                C66554ak a = C89034be.m144791a(b);
                C87684al alVar = new C87684al(C88244um.UPDATE_CURRENT_NETWORK_TYPE);
                C62940bt btVar = C88363yx.f238960a;
                C88364yy yyVar = (C88364yy) C88365yz.f238961c.createBuilder();
                int i = a.f181028z;
                yyVar.copyOnWrite();
                C88365yz yzVar = (C88365yz) yyVar.instance;
                yzVar.f238963a |= 1;
                yzVar.f238964b = i;
                alVar.mo81965b(btVar, (C88365yz) yyVar.build());
                rVar.f234383e.mo80379b(alVar.mo81964a());
            }
        }
    }

    /* renamed from: d */
    public final void mo79102d(long j) {
        if (!this.f272341l.remove(Long.valueOf(j))) {
            ((C59052c) ((C59052c) f272332j.mo56226d()).mo56372aa(21322)).mo56388r("Unregistered network monitoring before registering for it for session %d", j);
            int i = C90755l.f253831a;
        }
        if (this.f272338h == 2 && this.f272341l.isEmpty()) {
            this.f272337g = this.f272334b.mo28208h("ConnectivityWorker", 5000, new C97514a(this));
            this.f272338h = 3;
        }
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f272333a.mo27379e();
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
