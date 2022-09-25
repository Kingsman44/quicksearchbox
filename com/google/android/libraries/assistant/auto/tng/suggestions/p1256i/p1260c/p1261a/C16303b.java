package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1260c.p1261a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15935e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15944b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1260c.C16301a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.c.a.b */
/* compiled from: PG */
public final class C16303b implements C16301a {

    /* renamed from: a */
    public final C15973f f47983a;

    /* renamed from: b */
    public final C60888db f47984b;

    /* renamed from: c */
    public final C15944b f47985c;

    /* renamed from: d */
    public final AtomicReference f47986d = new AtomicReference();

    /* renamed from: e */
    private final C69464a f47987e;

    /* renamed from: f */
    private final C69464a f47988f;

    /* renamed from: g */
    private final C69464a f47989g;

    public C16303b(C60888db dbVar, C15944b bVar, C15973f fVar, C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f47983a = fVar;
        this.f47984b = dbVar;
        this.f47985c = bVar;
        this.f47987e = aVar;
        this.f47988f = aVar2;
        this.f47989g = aVar3;
    }

    /* renamed from: a */
    public final void mo22877a(C15935e eVar) {
        if (!((Boolean) this.f47987e.mo17428b()).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        AtomicReference atomicReference = this.f47986d;
        while (!atomicReference.compareAndSet((Object) null, eVar)) {
            if (atomicReference.get() != null) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f47986d.set(eVar);
                return;
            }
        }
        C46459k.m82829b(this.f47984b.mo29164d(C47810es.m84977q(new C16302a(this)), mo22879b().toMillis(), TimeUnit.MILLISECONDS), "Failed to schedule.", new Object[0]);
    }

    /* renamed from: b */
    public final Duration mo22879b() {
        if (mo22880c()) {
            return Duration.ofMillis(((Long) this.f47989g.mo17428b()).longValue());
        }
        return Duration.ofMillis(((Long) this.f47988f.mo17428b()).longValue());
    }

    /* renamed from: c */
    public final boolean mo22880c() {
        C58485gu h = this.f47983a.mo22633h();
        int size = h.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((C16091aq) h.get(i)).mo22733g().equals(C16090ap.MORRIS_DRIVING_SCREEN)) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
