package com.google.android.apps.search.googleapp.compliance;

import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;

/* renamed from: com.google.android.apps.search.googleapp.compliance.ah */
/* compiled from: PG */
final class C133583ah {
    /* renamed from: a */
    public static void m216796a(C47400m mVar, C133576aa aaVar) {
        mVar.f123128b.findViewById(R.id.googleapp_cookie_consent_agree).setTag(R.id.tiktok_event_internal_trace, "Accept");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_cookie_consent_agree), new C133577ab(aaVar));
        mVar.f123128b.findViewById(R.id.googleapp_cookie_consent_reject).setTag(R.id.tiktok_event_internal_trace, "Reject");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_cookie_consent_reject), new C133578ac(aaVar));
        mVar.f123128b.findViewById(R.id.googleapp_cookie_consent_customize).setTag(R.id.tiktok_event_internal_trace, "Customize");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_cookie_consent_customize), new C133579ad(aaVar));
        mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_cookies).setTag(R.id.tiktok_event_internal_trace, "Cookies legal");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_cookies), new C133580ae(aaVar));
        mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_privacy_policy).setTag(R.id.tiktok_event_internal_trace, "Privacy legal");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_privacy_policy), new C133581af(aaVar));
        mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_tos).setTag(R.id.tiktok_event_internal_trace, "Terms of service");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_tos), new C133582ag(aaVar));
    }
}
