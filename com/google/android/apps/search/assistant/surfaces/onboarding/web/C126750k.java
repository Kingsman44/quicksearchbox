package com.google.android.apps.search.assistant.surfaces.onboarding.web;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.web.k */
/* compiled from: PG */
class C126750k implements C46792di {

    /* renamed from: a */
    final /* synthetic */ ViewFlipper f349053a;

    /* renamed from: b */
    final /* synthetic */ LinearLayout f349054b;

    /* renamed from: c */
    final /* synthetic */ C126752m f349055c;

    public C126750k(C126752m mVar, ViewFlipper viewFlipper, LinearLayout linearLayout) {
        this.f349055c = mVar;
        this.f349053a = viewFlipper;
        this.f349054b = linearLayout;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C126752m.f349058a.mo56225c()).mo56382g(th)).mo56372aa(37131)).mo56386p("Web loading failed.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C43369n nVar = C43369n.UNSPECIFIED;
        C43369n a = C43369n.m76519a(((C43376u) obj).f113330c);
        if (a == null) {
            a = C43369n.UNSPECIFIED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 4) {
            this.f349053a.setDisplayedChild(1);
            this.f349054b.setVisibility(0);
            C126752m mVar = this.f349055c;
            Bundle extras = mVar.f349063f.getActivity().getIntent().getExtras();
            if (extras != null) {
                String string = extras.getString("intent_extra_impression_count_key_name");
                if (string == null) {
                    ((C59052c) ((C59052c) C126752m.f349058a.mo56226d()).mo56372aa(37136)).mo56386p("Impression Count Key not set.");
                    return;
                }
                C60870cx b = mVar.f349059b.mo40294b(string);
                C126751l lVar = new C126751l(mVar, string);
                C60856cj.m92911t(b, C47810es.m84974n(lVar), mVar.f349066i);
            }
        } else if (ordinal == 5) {
            this.f349055c.f349063f.getActivity().finish();
            this.f349055c.f349063f.getActivity().overridePendingTransition(0, 0);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
