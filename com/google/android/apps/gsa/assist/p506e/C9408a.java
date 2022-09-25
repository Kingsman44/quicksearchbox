package com.google.android.apps.gsa.assist.p506e;

import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assist.e.a */
/* compiled from: PG */
public final class C9408a {

    /* renamed from: a */
    private static final C59071e f32686a = C59071e.m91332i("com.google.android.apps.gsa.assist.e.a");

    /* renamed from: b */
    private final C9388a f32687b;

    public C9408a(C9388a aVar) {
        this.f32687b = aVar;
    }

    /* renamed from: a */
    public final void mo17660a(boolean z) {
        if (this.f32687b.mo17583e()) {
            this.f32687b.mo17579a(z);
            return;
        }
        C59104x d = f32686a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AssistOptInManager");
        ((C59052c) ((C59052c) d).mo56372aa(185)).mo56386p("Tried to toggle donate screenshot switch while not opted in");
        int i = C90755l.f253831a;
    }

    /* renamed from: b */
    public final void mo17661b(boolean z, C9409b bVar) {
        if (z) {
            this.f32687b.mo17579a(false);
            bVar.mo17662a(false);
            return;
        }
        this.f32687b.mo17580b();
        bVar.mo17662a(true);
    }
}
