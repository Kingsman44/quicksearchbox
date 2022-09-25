package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import androidx.work.C4634o;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1226e.C16055b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1226e.C16060g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.C15814a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15933d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15935e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15939a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1260c.C16301a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.v */
/* compiled from: PG */
public final /* synthetic */ class C16438v implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48344a;

    public /* synthetic */ C16438v(C16416ag agVar) {
        this.f48344a = agVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C16416ag agVar = this.f48344a;
        if (!agVar.f48300o.compareAndSet(false, true)) {
            return C60866ct.f164955a;
        }
        C58976aa aaVar = C58975e.f156826a;
        C46578l lVar = agVar.f48297l;
        Duration ofHours = Duration.ofHours(((Long) agVar.f48302q.mo17428b()).longValue());
        C46582p j = C46586t.m83063j(C16055b.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("SUGGESTIONS_DATASTORE_CLEANUP_WORKER", C4634o.KEEP));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(ofHours.toHours(), TimeUnit.HOURS)));
        C46459k.m82829b(lVar.mo50546b(j.mo50561a()), "Failed to enqueue DatastoreCleanupWorker", new Object[0]);
        C46578l lVar2 = agVar.f48297l;
        Duration ofHours2 = Duration.ofHours(((Long) agVar.f48301p.mo17428b()).longValue());
        C46582p j2 = C46586t.m83063j(C16060g.class);
        C46570d dVar2 = (C46570d) j2;
        dVar2.f121757f = C58833ax.m90834k(new C46574h("SUGGESTIONS_DATASTORE_SYNC_WORKER", C4634o.KEEP));
        dVar2.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(ofHours2.toHours(), TimeUnit.HOURS)));
        C46459k.m82829b(lVar2.mo50546b(j2.mo50561a()), "Failed to enqueue DatastoreSyncWorker", new Object[0]);
        ((C15939a) agVar.f48293h.mo27525b()).mo22619a((C15933d) agVar.f48294i.mo27525b());
        ((C15939a) agVar.f48293h.mo27525b()).mo22619a(agVar.f48295j);
        ((C16301a) agVar.f48289d.mo27525b()).mo22877a((C15935e) agVar.f48294i.mo27525b());
        return ((C15814a) agVar.f48296k.mo27525b()).mo22574b();
    }
}
