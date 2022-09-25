package com.google.android.apps.gsa.nga.shared.p6349j;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8066i.C103302e;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.j.f */
/* compiled from: PG */
public final class C81337f implements C81332a {

    /* renamed from: a */
    public static final Duration f222617a = Duration.ofSeconds(10);

    /* renamed from: b */
    public static final Duration f222618b = Duration.ofSeconds(10);

    /* renamed from: c */
    public final C103302e f222619c;

    /* renamed from: d */
    private final C22871g f222620d;

    /* renamed from: e */
    private final C37215b f222621e;

    public C81337f(C103302e eVar, C22871g gVar, C37215b bVar) {
        this.f222619c = eVar;
        this.f222620d = gVar;
        this.f222621e = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo74999a(C18100a aVar) {
        return mo75000b(aVar, Optional.empty(), Optional.empty());
    }

    /* renamed from: b */
    public final C60870cx mo75000b(C18100a aVar, Optional optional, Optional optional2) {
        if (optional.isPresent()) {
            this.f222621e.mo19974a((C37254c) optional.get());
        }
        return C90877ak.m148471e(C2169h.m6027a(new C81334c(this, aVar, optional2)), f222617a.toMillis(), TimeUnit.MILLISECONDS, this.f222620d);
    }

    /* renamed from: c */
    public final C60870cx mo75001c() {
        return C90877ak.m148471e(C2169h.m6027a(new C81333b(this)), f222618b.toMillis(), TimeUnit.MILLISECONDS, this.f222620d);
    }

    /* renamed from: d */
    public final void mo75005d(Optional optional, C62722b bVar) {
        if (optional.isPresent()) {
            this.f222621e.mo19974a(((C37257f) optional.get()).mo40805c(bVar));
        }
    }
}
