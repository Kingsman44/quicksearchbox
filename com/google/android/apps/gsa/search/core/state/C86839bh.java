package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.bh */
/* compiled from: PG */
public final class C86839bh implements C87143ik {

    /* renamed from: a */
    private final C86838bg f234550a;

    /* renamed from: b */
    private final C68214a f234551b;

    public C86839bh(C86838bg bgVar, C68214a aVar) {
        this.f234550a = bgVar;
        this.f234551b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234550a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C86883ce) this.f234551b.mo27525b()).f235452J)) {
            C86838bg bgVar = this.f234550a;
            C86883ce ceVar = (C86883ce) this.f234551b.mo27525b();
            if (BitFlags.m148144f(ceVar.f234625b.f253762b, 1)) {
                C58976aa aaVar = C58975e.f156826a;
                Query query = ceVar.f234631h;
                if (!bgVar.mo80532a()) {
                    bgVar.f234549b = bgVar.f234548a.mo79070g();
                }
            }
        }
    }
}
