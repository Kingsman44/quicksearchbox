package com.google.android.apps.search.soundsearch;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.soundsearch.p10653b.C141642d;
import com.google.android.apps.search.soundsearch.p10655d.C141653c;
import com.google.android.apps.search.soundsearch.p10657f.p10658a.p10659a.C141665a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2477a.C32151a;
import com.google.android.libraries.search.p2871b.p2872a.p2883k.C37203a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4522b.C58485gu;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.soundsearch.g */
/* compiled from: PG */
public final class C141668g implements C45987ay {

    /* renamed from: a */
    public final SoundSearchActivity f384514a;

    /* renamed from: b */
    private final C28310af f384515b;

    /* renamed from: c */
    private final C28306ab f384516c;

    /* renamed from: d */
    private final boolean f384517d;

    /* renamed from: com.google.android.apps.search.soundsearch.g$a */
    /* compiled from: PG */
    public interface C141669a {
        /* renamed from: nQ */
        C141665a mo116641nQ();
    }

    public C141668g(SoundSearchActivity soundSearchActivity, C45989b bVar, C28310af afVar, C28306ab abVar, boolean z) {
        this.f384514a = soundSearchActivity;
        this.f384515b = afVar;
        this.f384516c = abVar;
        C32151a.m59929e(soundSearchActivity, this, bVar, C58485gu.m89845m());
        this.f384517d = z;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C37258g gVar;
        if (!this.f384517d) {
            AccountId accountId = awVar.f120815a.f120816a;
            int a = C141642d.m229858a(this.f384514a.getIntent().getIntExtra("extra_entry_point", 0));
            C141665a nQ = ((C141669a) C47245e.m84045a(this.f384514a, C141669a.class, accountId)).mo116641nQ();
            int i = a - 1;
            if (a != 0) {
                if (i == 1) {
                    gVar = C37203a.f98723b;
                } else if (i == 2) {
                    gVar = C37203a.f98724c;
                } else if (i != 3) {
                    gVar = C37203a.f98722a;
                } else {
                    gVar = C37203a.f98725d;
                }
                if (!nQ.f384511b && gVar != C37203a.f98722a) {
                    nQ.f384510a.mo19974a(gVar);
                    nQ.f384511b = true;
                }
                C141650d dVar = new C141650d();
                C68324h.m98669f(dVar);
                C47247a.m84047b(dVar, accountId);
                C0154a aVar = new C0154a(this.f384514a.f727a.f739a.f744e);
                aVar.mo689v(R.id.soundsearch_fragment_container, dVar, "MainFragment");
                aVar.mo509f();
                return;
            }
            throw null;
        }
        C141653c cVar = new C141653c();
        C68324h.m98669f(cVar);
        C0154a aVar2 = new C0154a(this.f384514a.f727a.f739a.f744e);
        aVar2.mo689v(R.id.soundsearch_fragment_container, cVar, "DebugFragment");
        aVar2.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f384514a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28423g a = C45954d.m82060a(axVar.f120816a);
        C28306ab abVar = this.f384516c;
        SoundSearchActivity soundSearchActivity = this.f384514a;
        C28313c a2 = this.f384515b.mo33805a(C28427h.m53115a(129443));
        a2.mo33861i(C28439i.f77216b);
        a2.mo33859g(C28375ak.m53061c(129444));
        a2.mo33859g(a);
        int i = C28485y.f77298f;
        abVar.mo33801b(soundSearchActivity.mo1322k().mo1177e(16908290), a2);
    }
}
