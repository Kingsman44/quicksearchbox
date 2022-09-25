package com.google.android.apps.gsa.sidekick.main.p7213i;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.sidekick.shared.C91729f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7893nw;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.main.i.c */
/* compiled from: PG */
public final class C91442c {

    /* renamed from: a */
    public static final C59071e f255061a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.i.c");

    /* renamed from: b */
    public final Set f255062b = new HashSet();

    /* renamed from: c */
    public final C91443d f255063c;

    /* renamed from: d */
    private final Set f255064d = new HashSet();

    /* renamed from: e */
    private final C22871g f255065e;

    /* renamed from: f */
    private final C91189au f255066f;

    /* renamed from: g */
    private final C91729f f255067g;

    public C91442c(C22871g gVar, C91189au auVar, C91729f fVar, C91443d dVar) {
        this.f255065e = gVar;
        this.f255066f = auVar;
        this.f255067g = fVar;
        this.f255063c = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85799a(C7893nw nwVar) {
        if ((nwVar.f27733a & 512) != 0) {
            this.f255064d.add(Uri.parse(nwVar.f27743k));
        }
    }

    /* renamed from: b */
    public final void mo85800b() {
        for (Uri u : this.f255064d) {
            this.f255066f.mo85431u(u);
        }
        for (C7799kj a : this.f255062b) {
            this.f255065e.mo28211k(this.f255067g.mo85815a(C7642eo.SECOND_SCREEN_PRELOAD_CARDS, a, false, false), "Cache InterestResponse", new C91441b(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo85801c() {
        return !this.f255064d.isEmpty() || !this.f255062b.isEmpty();
    }
}
