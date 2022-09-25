package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.n */
/* compiled from: PG */
public final class C78075n implements C78072k {

    /* renamed from: a */
    public final Set f215059a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final C22871g f215060b;

    public C78075n(C22871g gVar) {
        this.f215060b = gVar;
    }

    /* renamed from: a */
    public final void mo73047a() {
        for (C78072k kVar : this.f215059a) {
            C22871g gVar = this.f215060b;
            Objects.requireNonNull(kVar);
            gVar.mo28212l("[NGA] onCardInteraction", new C78074m(kVar));
        }
    }

    /* renamed from: b */
    public final void mo73048b() {
        for (C78072k kVar : this.f215059a) {
            C22871g gVar = this.f215060b;
            Objects.requireNonNull(kVar);
            gVar.mo28212l("[NGA] onMicClick", new C78073l(kVar));
        }
    }
}
