package com.google.android.apps.gsa.staticplugins.p7553br;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6580bc.C84816a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88391zy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88392zz;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaa;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.br.a */
/* compiled from: PG */
public final class C96695a extends C86734a implements C84816a {

    /* renamed from: a */
    private final C68214a f270520a;

    /* renamed from: b */
    private final C68214a f270521b;

    /* renamed from: c */
    private final C68214a f270522c;

    public C96695a(C68214a aVar, C68214a aVar2, C68214a aVar3) {
        super(C118575h.WORKER_LEGACY_UI, "legacyui");
        this.f270520a = aVar;
        this.f270521b = aVar2;
        this.f270522c = aVar3;
    }

    /* renamed from: a */
    public final void mo78509a() {
        C86610af afVar = (C86610af) this.f270521b.mo27525b();
        if (afVar.mo80227h()) {
            afVar.mo80228i(new C87684al(C88244um.FOCUS_QUERY_AND_SHOW_KEYBOARD).mo81964a());
        }
    }

    /* renamed from: b */
    public final void mo78510b(boolean z, long j, Query query) {
        if (((C86610af) this.f270521b.mo27525b()).mo80227h()) {
            long j2 = 0;
            if (j > 0 || !z) {
                long b = ((C21370a) this.f270520a.mo27525b()).mo26870b() - j;
                boolean z2 = b > 0;
                if (b > 0) {
                    j2 = b;
                }
                C89062r b2 = ((C89037bh) this.f270522c.mo27525b()).mo27377b();
                C88392zz zzVar = (C88392zz) aaa.f237052e.createBuilder();
                zzVar.copyOnWrite();
                aaa aaa = (aaa) zzVar.instance;
                aaa.f237054a = 1 | aaa.f237054a;
                aaa.f237055b = z & z2;
                zzVar.copyOnWrite();
                aaa aaa2 = (aaa) zzVar.instance;
                aaa2.f237054a |= 2;
                aaa2.f237056c = j2;
                boolean a = b2.mo83040a();
                zzVar.copyOnWrite();
                aaa aaa3 = (aaa) zzVar.instance;
                aaa3.f237054a |= 4;
                aaa3.f237057d = a;
                C87684al alVar = new C87684al(C88244um.UPDATE_TIMESTAMP_UI);
                alVar.mo81965b(C88391zy.f239008a, (aaa) zzVar.build());
                alVar.mo81966c(query);
                ((C86610af) this.f270521b.mo27525b()).mo80228i(alVar.mo81964a());
            }
        }
    }

    /* renamed from: c */
    public final void mo78511c() {
        C86610af afVar = (C86610af) this.f270521b.mo27525b();
        if (afVar.mo80227h()) {
            afVar.mo80228i(new C87684al(C88244um.UNFOCUS_QUERY_AND_HIDE_KEYBOARD).mo81964a());
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
