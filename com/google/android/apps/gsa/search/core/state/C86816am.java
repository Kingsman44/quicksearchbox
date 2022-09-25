package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.am */
/* compiled from: PG */
public final class C86816am implements C87143ik {

    /* renamed from: a */
    private final C86815al f234496a;

    /* renamed from: b */
    private final C68214a f234497b;

    public C86816am(C86815al alVar, C68214a aVar) {
        this.f234496a = alVar;
        this.f234497b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234496a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C86792g) this.f234497b.mo27525b()).mo80627am())) {
            C86815al alVar = this.f234496a;
            C86792g gVar = (C86792g) this.f234497b.mo27525b();
            long a = gVar.mo80447f().mo81991a();
            boolean z = true;
            if (true == alVar.mo80524b()) {
                a = 0;
            }
            if (a != alVar.f234493a) {
                alVar.f234493a = a;
                alVar.f234494b = false;
            } else {
                z = false;
            }
            if (alVar.f234494b && gVar.mo80445c() != 0) {
                alVar.f234494b = false;
            } else if (!z) {
                return;
            }
            this.f234496a.mo80591ar();
        }
    }
}
