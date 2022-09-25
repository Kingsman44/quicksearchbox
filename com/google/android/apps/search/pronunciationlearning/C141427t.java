package com.google.android.apps.search.pronunciationlearning;

import android.databinding.C0118a;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.C141441b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a.C141431b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a.C141432c;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b.C141443b;
import com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10641b.C141444c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.pronunciationlearning.t */
/* compiled from: PG */
final class C141427t implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C141428u f383887a;

    public C141427t(C141428u uVar) {
        this.f383887a = uVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        Fragment c;
        C141441b bVar;
        if (this.f383887a.f383889b.getIntent().getBooleanExtra("EXTRA_HALF_SHEET", false)) {
            String stringExtra = this.f383887a.f383889b.getIntent().getStringExtra("EXTRA_LOCALE");
            if (stringExtra == null) {
                AccountId accountId = awVar.f120815a.f120816a;
                C69664n.m101061g(accountId, "accountId");
                bVar = new C141441b();
                C68324h.m98669f(bVar);
                C47247a.m84047b(bVar, accountId);
            } else {
                AccountId accountId2 = awVar.f120815a.f120816a;
                Locale forLanguageTag = Locale.forLanguageTag(stringExtra);
                C69664n.m101061g(accountId2, "accountId");
                C69664n.m101061g(forLanguageTag, "locale");
                C141441b bVar2 = new C141441b();
                C68324h.m98669f(bVar2);
                C47247a.m84047b(bVar2, accountId2);
                C47232a.m84026b(bVar2, forLanguageTag);
                bVar = bVar2;
            }
            C0154a aVar = new C0154a(this.f383887a.f383889b.f727a.f739a.f744e);
            aVar.mo689v(R.id.pronunciationlearning_main_fragment_container, bVar, "MainFragment");
            aVar.mo509f();
            FragmentManager childFragmentManager = bVar.mo17754z().f383966e.getChildFragmentManager();
            Fragment c2 = childFragmentManager.f634a.mo671c("com.google.android.apps.search.pronunciationlearning.ui.halfsheet.SPEAKING_PRACTICE_TAG");
            C141443b bVar3 = c2 instanceof C141443b ? (C141443b) c2 : null;
            if (bVar3 != null) {
                C141444c a = bVar3.mo17754z();
                a.f383934l = true;
                View requireView = a.f383929g.requireView();
                C69664n.m101060f(requireView, "fragment.requireView()");
                a.mo116444d(requireView);
                a.mo116445e(5);
                String str = a.f383929g.getResources().getString(R.string.pronunciationlearning_expected_text_title) + ", " + a.f383925c;
                String str2 = a.f383924b.f384127e;
                C69664n.m101060f(str2, "uiStringProvider.locale");
                Locale locale = Locale.ENGLISH;
                C69664n.m101060f(locale, "ENGLISH");
                String lowerCase = str2.toLowerCase(locale);
                C69664n.m101060f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!C69764m.m101234m(lowerCase, "en")) {
                    str = a.f383925c;
                }
                a.f383927e.mo50428h(C46438d.m82810b(a.f383926d.mo116408a(str)).f121541a, (Object) null, a.f383940r);
            }
            Fragment c3 = childFragmentManager.f634a.mo671c("com.google.android.apps.search.pronunciationlearning.ui.halfsheet.FILL_IN_BLANK_TAG");
            C141431b bVar4 = c3 instanceof C141431b ? (C141431b) c3 : null;
            if (bVar4 != null) {
                C141432c a2 = bVar4.mo17754z();
                C59052c cVar = (C59052c) C141432c.f383895a.mo56224b();
                cVar.mo56379ah(new C59094n(41703));
                cVar.mo56386p("startFillInBlank");
                a2.f383901g = true;
                View requireView2 = a2.f383896b.requireView();
                C69664n.m101060f(requireView2, "fragment.requireView()");
                a2.mo116431c(requireView2);
                String string = a2.f383896b.getString(R.string.pronunciationlearning_fillinblank_instruction_text);
                C69664n.m101060f(string, "fragment.getString(R.str…inblank_instruction_text)");
                a2.f383898d.mo50428h(C46438d.m82810b(a2.f383897c.mo116408a(string + ", " + a2.mo116429a())).f121541a, (Object) null, a2.f383902h);
                return;
            }
            return;
        }
        AccountId accountId3 = awVar.f120815a.f120816a;
        C141381d dVar = new C141381d();
        C68324h.m98669f(dVar);
        C47247a.m84047b(dVar, accountId3);
        C0154a aVar2 = new C0154a(this.f383887a.f383889b.f727a.f739a.f744e);
        aVar2.mo689v(R.id.pronunciationlearning_main_fragment_container, dVar, "MainFragment");
        aVar2.mo509f();
        C141411f a3 = dVar.mo17754z();
        if (!C58837ba.m90859h(a3.f383850e) && (c = a3.f383846a.getChildFragmentManager().f634a.mo671c("PronunciationPracticingFragment")) != null) {
            ((C141524z) c).mo17754z().mo116340e();
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C0118a.m116x(C141428u.f383888a.mo56225c(), "onAccountError", 41665, th, C38505d.f101864b, 203825277);
        this.f383887a.f383889b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
