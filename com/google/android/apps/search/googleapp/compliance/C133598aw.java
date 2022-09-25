package com.google.android.apps.search.googleapp.compliance;

import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;

/* renamed from: com.google.android.apps.search.googleapp.compliance.aw */
/* compiled from: PG */
final class C133598aw {
    /* renamed from: a */
    public static void m216820a(C47400m mVar, C133593ar arVar) {
        mVar.f123128b.findViewById(R.id.googleapp_cookie_customization_confirm).setTag(R.id.tiktok_event_internal_trace, "confirm");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_cookie_customization_confirm), new C133594as(arVar));
        mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_cookies).setTag(R.id.tiktok_event_internal_trace, "Cookies legal");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_cookies), new C133595at(arVar));
        mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_privacy_policy).setTag(R.id.tiktok_event_internal_trace, "Privacy legal");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_privacy_policy), new C133596au(arVar));
        mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_tos).setTag(R.id.tiktok_event_internal_trace, "Terms of service");
        mVar.mo51254d(mVar.f123128b.findViewById(R.id.googleapp_compliance_footer_tos), new C133597av(arVar));
    }
}
