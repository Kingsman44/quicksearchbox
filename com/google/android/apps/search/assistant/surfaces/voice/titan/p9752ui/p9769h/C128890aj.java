package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128833h;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128835j;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128837l;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128838m;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9763f.p9766b.C128863b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9774k.p9777b.C128938b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9779m.p9782b.C128954c;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl.C128972h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.aj */
/* compiled from: PG */
final class C128890aj implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128893am f354220a;

    public C128890aj(C128893am amVar) {
        this.f354220a = amVar;
    }

    /* renamed from: c */
    private final void m210364c(Fragment fragment, String str) {
        C0154a aVar = new C0154a(this.f354220a.f354225c.getChildFragmentManager());
        aVar.mo691x(R.anim.assistant_fade_in, R.anim.assistant_fade_out, 0, 0);
        aVar.mo689v(R.id.assistant_voice_plate_content_container, fragment, str);
        aVar.mo509f();
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        Class cls = (Class) obj;
        C69664n.m101061g(cls, "data");
        if (C69664n.m101066l(cls, C128838m.class)) {
            AccountId accountId = this.f354220a.f354224b;
            C128954c cVar = new C128954c();
            C68324h.m98669f(cVar);
            C47247a.m84047b(cVar, accountId);
            m210364c(cVar, "TRANSCRIPTION_TAG");
        } else if (C69664n.m101066l(cls, C128833h.class)) {
            AccountId accountId2 = this.f354220a.f354224b;
            C69664n.m101061g(accountId2, "accountId");
            C69664n.m101061g(accountId2, "accountId");
            C128863b bVar = new C128863b();
            C68324h.m98669f(bVar);
            C47247a.m84047b(bVar, accountId2);
            m210364c(bVar, "GREETING_TAG");
        } else if (C69664n.m101066l(cls, C128835j.class)) {
            AccountId accountId3 = this.f354220a.f354224b;
            C69664n.m101061g(accountId3, "accountId");
            C69664n.m101061g(accountId3, "accountId");
            C128938b bVar2 = new C128938b();
            C68324h.m98669f(bVar2);
            C47247a.m84047b(bVar2, accountId3);
            m210364c(bVar2, "ONBOARDING_TAG");
        } else if (!C69664n.m101066l(cls, C128837l.class)) {
            Fragment b = this.f354220a.f354225c.getChildFragmentManager().f634a.mo670b(R.id.assistant_voice_plate_content_container);
            if (b != null) {
                C0154a aVar = new C0154a(this.f354220a.f354225c.getChildFragmentManager());
                aVar.mo691x(0, R.anim.assistant_fade_out, 0, 0);
                aVar.mo516m(b);
                aVar.mo509f();
            }
        } else {
            AccountId accountId4 = this.f354220a.f354224b;
            C69664n.m101061g(accountId4, "accountId");
            C69664n.m101061g(accountId4, "accountId");
            C128972h hVar = new C128972h();
            C68324h.m98669f(hVar);
            C47247a.m84047b(hVar, accountId4);
            m210364c(hVar, "SUGGESTIONS_TAG");
        }
    }
}
