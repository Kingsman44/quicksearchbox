package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.textview.ExpandableSection;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C49842b;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bp */
/* compiled from: PG */
public final class C108584bp extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302055b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bp");

    /* renamed from: c */
    public C108556ar f302056c;

    /* renamed from: d */
    public C83893b f302057d;

    /* renamed from: e */
    public cb f302058e;

    /* renamed from: f */
    public C22871g f302059f;

    /* renamed from: g */
    public C91189au f302060g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        C49842b bVar = null;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.linking_consent, (ViewGroup) null);
        C58833ax a = this.f302057d.mo77278a();
        if (a.mo56113h()) {
            cxVar = this.f302058e.c((Account) a.mo56107c(), new int[]{0, 1});
        } else {
            cxVar = C60856cj.m92900i(false);
        }
        new C90873ag(cxVar, this.f302059f, "update-buttons", new C108580bl(legacyOpaStandardPage)).mo85223a(C108581bm.f302052a);
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44610));
        C108741i iVar = this.f302056c.f302004l;
        iVar.getClass();
        String string = getString(R.string.consent_explanation, new Object[]{C58837ba.m90858g(iVar.mo97105h())});
        HeaderLayout headerLayout = legacyOpaStandardPage.f228723b;
        C84018m.m133908c(headerLayout.f228719b, string, TextView.BufferType.NORMAL, headerLayout);
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C108582bn(this)));
        legacyOpaStandardPage.f228725d.mo77361b().setOnClickListener(new C89943l(new C108583bo(this)));
        FrameLayout frameLayout = (FrameLayout) legacyOpaStandardPage.findViewById(R.id.opa_error_content_container);
        ScrollView scrollView = (ScrollView) layoutInflater.inflate(R.layout.linking_consent_content, (ViewGroup) null);
        byte[] byteArray = ((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getByteArray("about-me");
        if (byteArray != null) {
            try {
                bVar = (C49842b) C62942bv.parseFrom((C62942bv) C49842b.f129519l, byteArray, C62921ba.m95368a());
            } catch (C62974ct e) {
                throw new IllegalArgumentException("Could not deserialize AboutMeSettingsUi", e);
            }
        }
        if (bVar != null) {
            if (!bVar.f129528h.isEmpty()) {
                ((WebImageView) scrollView.findViewById(R.id.avatar)).mo76737h(Uri.parse(bVar.f129528h), this.f302060g);
            }
            ((TextView) scrollView.findViewById(R.id.account_name)).setText(bVar.f129527g);
        }
        Account account = (Account) this.f302057d.mo77278a().mo56107c();
        account.getClass();
        ((TextView) scrollView.findViewById(R.id.email_address)).setText(account.name);
        ScrollView scrollView2 = scrollView;
        ((ExpandableSection) scrollView.findViewById(R.id.partner_section)).mo97153a(R.string.consent_partners_disclosures_title, R.string.consent_partners_disclosures_body_collapsed, R.string.consent_partners_disclosures_body_expanded, C58485gu.m89846n(getString(R.string.learn_more)), C58485gu.m89846n("https://support.google.com/assistant/?p=google_partners"), scrollView2);
        ((ExpandableSection) scrollView.findViewById(R.id.services_section)).mo97153a(R.string.consent_services_disclosures_title, R.string.consent_services_disclosures_body_collapsed, R.string.consent_services_disclosures_body_expanded, C58485gu.m89847o(getString(R.string.consent_my_activity), getString(R.string.learn_more)), C58485gu.m89847o("https://myactivity.google.com", "https://support.google.com/assistant/?p=reset_id"), scrollView2);
        frameLayout.addView(scrollView);
        TextView textView = (TextView) scrollView.findViewById(R.id.term_and_policy);
        Spannable spannable = (Spannable) Html.fromHtml(getResources().getString(R.string.tos_and_privacy_link, new Object[]{getResources().getString(R.string.tos_url, new Object[]{Locale.getDefault().getLanguage()}), getResources().getString(R.string.policy_url, new Object[]{Locale.getDefault().getLanguage()})}));
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new DeviceLinkConsentFragment$1(), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
        }
        textView.setText(spannable);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return legacyOpaStandardPage;
    }
}
