package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6519al.p6582bd.C84821a;
import com.google.android.apps.gsa.search.core.p6519al.p6582bd.p6583a.C84823b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.grammar.pumpkin.C66528t;
import dagger.C68214a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.g */
/* compiled from: PG */
public final class C98537g extends C66528t {

    /* renamed from: a */
    private static final C59071e f275144a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.g");

    /* renamed from: b */
    private final C68214a f275145b;

    /* renamed from: c */
    private final C84823b f275146c;

    /* renamed from: d */
    private final C118831d f275147d;

    public C98537g(C84823b bVar, C118827a aVar, C68214a aVar2) {
        this.f275146c = bVar;
        this.f275147d = aVar.mo77944g(C118569b.PUMPKIN_USER_VALIDATOR_GET_POSTERIOR_LATENCY, C118575h.PUMPKIN_VALIDATOR_LOCAL_INTENT);
        this.f275145b = aVar2;
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (!((C86124t) this.f275145b.mo27525b()).mo79746e(C90139r.f251857e)) {
            return 0.0f;
        }
        C89949q.m146523g(1203);
        this.f275147d.mo104019a();
        C60870cx a = this.f275146c.mo78512a(str, Locale.getDefault().toLanguageTag());
        try {
            C90476a aVar = C91018d.f254254a;
            C84821a aVar2 = (C84821a) a.get();
            ((C86124t) this.f275145b.mo27525b()).mo79747m(C90139r.f251866n);
            throw null;
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            C59104x c = f275144a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LocalIntentValidator");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30787)).mo56386p("error loading plugin");
            return 0.0f;
        }
    }
}
