package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.p2803u.p2819c.C36767a;
import com.google.android.libraries.search.assistant.p2803u.p2819c.C36768b;
import com.google.android.libraries.search.assistant.p2803u.p2819c.C36769c;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ae */
/* compiled from: PG */
class C126691ae implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C36769c f348906a;

    /* renamed from: b */
    final /* synthetic */ C126692af f348907b;

    public C126691ae(C126692af afVar, C36769c cVar) {
        this.f348907b = afVar;
        this.f348906a = cVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C126692af.f348908a.mo56225c()).mo56382g(th)).mo56372aa(37116)).mo56386p("Error in loading");
        C0167am activity = this.f348907b.f348910c.getActivity();
        if (activity != null) {
            activity.setResult(1);
            activity.finish();
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18078b(Object obj) {
        String str;
        Boolean bool = (Boolean) obj;
        ((C59052c) ((C59052c) C126692af.f348908a.mo56224b()).mo56372aa(37117)).mo56386p("loading complete");
        C0167am activity = this.f348907b.f348910c.getActivity();
        if (activity == null) {
            return;
        }
        if (!bool.booleanValue()) {
            activity.setResult(1);
            activity.finish();
            return;
        }
        C36767a aVar = (C36767a) this.f348906a;
        if (aVar.f95821e != 7 || (str = aVar.f95818b) == null) {
            StringBuilder sb = new StringBuilder();
            if ((1 & aVar.f95821e) == 0) {
                sb.append(" isUnicornAccount");
            }
            if (aVar.f95818b == null) {
                sb.append(" accountGivenName");
            }
            if ((aVar.f95821e & 2) == 0) {
                sb.append(" accountStandardGender");
            }
            if ((aVar.f95821e & 4) == 0) {
                sb.append(" biometricsDisabledByAdmin");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C36768b bVar = new C36768b(aVar.f95817a, str, aVar.f95819c, aVar.f95820d);
        if (!bVar.f95822a || !C45250g.m80607c(activity.getIntent())) {
            Intent intent = activity.getIntent();
            intent.putExtra("intent_extra_tng_suw_enabled_from_agsa_c", intent.getBooleanExtra("intent_extra_tng_suw_enabled_from_agsa_c", false));
            intent.putExtra("intent_extra_biometrics_disabled", bVar.f95825d);
            if (bVar.f95822a) {
                if (!TextUtils.isEmpty(bVar.f95823b)) {
                    intent.putExtra("intent_extra_given_name", bVar.f95823b);
                }
                intent.putExtra("intent_extra_use_unicorn_flow", bVar.f95822a);
                intent.putExtra("intent_extra_standard_gender", bVar.f95824c);
            }
            Intent a = C126728o.m207276a(intent);
            if (a != null) {
                a.setFlags(33554432);
                C47709i.m84861a(this.f348907b.f348910c, a);
            }
            activity.finish();
            return;
        }
        activity.setResult(1);
        activity.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
