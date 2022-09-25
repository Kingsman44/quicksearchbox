package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.help.HelpAndFeedbackStarter;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d.C133255c;
import com.google.android.apps.search.googleapp.p10338l.C136418l;
import com.google.android.libraries.web.contrib.p3388h.C43609a;
import com.google.android.libraries.web.contrib.p3388h.C43610b;
import com.google.android.libraries.web.contrib.p3388h.C43612d;
import com.google.android.libraries.web.contrib.p3388h.C43626r;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.l */
/* compiled from: PG */
public final /* synthetic */ class C133324l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C133255c f363300a;

    /* renamed from: b */
    public final /* synthetic */ HelpAndFeedbackStarter f363301b;

    public /* synthetic */ C133324l(C133255c cVar, HelpAndFeedbackStarter helpAndFeedbackStarter) {
        this.f363300a = cVar;
        this.f363301b = helpAndFeedbackStarter;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        C133255c cVar = this.f363300a;
        HelpAndFeedbackStarter helpAndFeedbackStarter = this.f363301b;
        cVar.mo111050a(149506);
        C0167am activity = helpAndFeedbackStarter.f363250d.getActivity();
        if (activity == null || !activity.getIntent().hasExtra("AGSA_CLASSIC_INTENT_EXTRA")) {
            C46439e eVar = helpAndFeedbackStarter.f363251e;
            C136418l lVar = helpAndFeedbackStarter.f363249c;
            Fragment fragment = helpAndFeedbackStarter.f363250d;
            if (fragment.getView() == null) {
                cxVar = C60856cj.m92899h(new IllegalStateException("Cannot screenshot if the view of the fragment is null."));
            } else {
                C43626r rVar = lVar.f371384a;
                View view2 = fragment.getView();
                view2.getClass();
                C60870cx b = rVar.mo46653b(view2.getRootView());
                C43612d dVar = lVar.f371385b;
                C60870cx b2 = dVar.f113835b.mo19399b(C47810es.m84978r(new C43609a(dVar)));
                cxVar = C47638k.m84753d(b, b2).mo51521b(new C43610b(dVar, b, b2), dVar.f113835b);
            }
            C46438d b3 = C46438d.m82810b(cxVar);
            eVar.mo50428h(b3.f121541a, (Object) null, helpAndFeedbackStarter.f363252f);
            return;
        }
        Fragment fragment2 = helpAndFeedbackStarter.f363250d;
        fragment2.startActivity(HelpAndFeedbackStarter.m216354a(fragment2, helpAndFeedbackStarter.f363248b, Optional.empty()));
    }
}
