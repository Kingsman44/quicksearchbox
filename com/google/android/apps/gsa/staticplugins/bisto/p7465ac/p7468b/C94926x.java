package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94934b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94935c;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94947h;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94961v;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7473g.C94964a;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a.C95054q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.assistant.p3739a.p3740a.C48065az;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.x */
/* compiled from: PG */
public final class C94926x {

    /* renamed from: a */
    public static final C59071e f265536a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.b.x");

    /* renamed from: b */
    public final C89656k f265537b;

    /* renamed from: c */
    public final C95054q f265538c;

    /* renamed from: d */
    public final C68214a f265539d;

    /* renamed from: e */
    public final C68214a f265540e;

    /* renamed from: f */
    public final Optional f265541f;

    /* renamed from: g */
    public final C94947h f265542g;

    /* renamed from: h */
    public final C94961v f265543h;

    /* renamed from: i */
    public volatile boolean f265544i;

    /* renamed from: j */
    public volatile C124548d f265545j;

    /* renamed from: k */
    private final C94934b f265546k;

    public C94926x(C68214a aVar, C68214a aVar2, Optional optional, C89656k kVar, C95054q qVar, C94947h hVar, C94961v vVar, C94934b bVar) {
        this.f265539d = aVar;
        this.f265540e = aVar2;
        this.f265541f = optional;
        this.f265537b = kVar;
        this.f265538c = qVar;
        this.f265542g = hVar;
        this.f265543h = vVar;
        this.f265546k = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo88835a() {
        this.f265546k.mo88657c(C94936d.AUDIO_INPUT);
    }

    /* renamed from: b */
    public final void mo88836b() {
        if (this.f265544i) {
            ((C94964a) this.f265539d.mo27525b()).mo88873h();
        } else {
            this.f265543h.mo88867f();
        }
    }

    /* renamed from: c */
    public final void mo88837c() {
        C59104x b = f265536a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(17619)).mo56386p("Assistant not enabled");
        mo88838d(C94935c.m156742a(C48098ce.ASSISTANT_NOT_ENABLED, (String) null));
    }

    /* renamed from: d */
    public final synchronized void mo88838d(C48065az azVar) {
        this.f265546k.mo88663s(C94936d.CONTROL_OUTPUT, azVar.toByteArray());
    }
}
