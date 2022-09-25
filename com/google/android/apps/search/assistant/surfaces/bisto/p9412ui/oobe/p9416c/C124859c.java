package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c;

import com.google.android.libraries.web.contrib.errorpage.p3373a.C43508a;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43513c;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.temporal.Temporal;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.c */
/* compiled from: PG */
public final class C124859c {

    /* renamed from: a */
    public static final C59071e f344480a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.c");

    /* renamed from: b */
    public static final Duration f344481b = Duration.ofSeconds(8);

    /* renamed from: c */
    public final AccountId f344482c;

    /* renamed from: d */
    public final C124865h f344483d;

    /* renamed from: e */
    public final C124858b f344484e;

    /* renamed from: f */
    public final C46801dp f344485f;

    /* renamed from: g */
    public final C43377v f344486g;

    /* renamed from: h */
    public final C60950i f344487h;

    /* renamed from: i */
    public final AtomicReference f344488i = new AtomicReference();

    /* renamed from: j */
    public final C46792di f344489j = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59104x c = C124859c.f344480a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoWebXFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36400)).mo56386p("WebStateCallbackError");
            C124859c.this.mo106684a(C124867j.WEBX_REQUEST_ERROR);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C124867j jVar;
            C43369n a = C43369n.m76519a(((C43376u) obj).f113330c);
            if (a == null) {
                a = C43369n.UNSPECIFIED;
            }
            if (!C43369n.SUCCESS.equals(a)) {
                C124859c cVar = C124859c.this;
                if (!C43369n.FAILED.equals(a)) {
                    C124859c cVar2 = C124859c.this;
                    if (C124859c.f344481b.compareTo(Duration.between((Temporal) cVar2.f344488i.get(), cVar2.f344487h.mo57444a())) >= 0) {
                        jVar = C124867j.WEBX_LOADING;
                        cVar.mo106684a(jVar);
                    }
                }
                jVar = C124867j.WEBX_REQUEST_ERROR;
                cVar.mo106684a(jVar);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: k */
    private final C43513c f344490k;

    public C124859c(AccountId accountId, C124865h hVar, C124858b bVar, C46801dp dpVar, C43377v vVar, C43513c cVar, C60950i iVar) {
        this.f344482c = accountId;
        this.f344483d = hVar;
        this.f344484e = bVar;
        this.f344485f = dpVar;
        this.f344486g = vVar;
        this.f344490k = cVar;
        this.f344487h = iVar;
    }

    /* renamed from: a */
    public final void mo106684a(C124867j jVar) {
        C43513c cVar = this.f344490k;
        C43508a aVar = (C43508a) C43512b.f113627a.createBuilder();
        aVar.mo58885m(C124868k.f344510a, jVar);
        cVar.mo46578a((C43512b) aVar.build());
    }
}
