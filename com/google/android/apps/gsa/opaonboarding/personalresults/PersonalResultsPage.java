package com.google.android.apps.gsa.opaonboarding.personalresults;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LinkUtil;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* compiled from: PG */
public class PersonalResultsPage extends FrameLayout {

    /* renamed from: a */
    public final HeaderLayout f228689a;

    /* renamed from: b */
    public final TextView f228690b;

    /* renamed from: c */
    public final FooterLayout f228691c;

    /* renamed from: d */
    public final TextView f228692d;

    /* renamed from: e */
    private final OpaPageLayout f228693e;

    public PersonalResultsPage(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final View mo77352a() {
        return this.f228693e.findViewById(R.id.personal_results_animation_container);
    }

    /* renamed from: b */
    public final LottieAnimationView mo77353b() {
        return (LottieAnimationView) this.f228693e.findViewById(R.id.personal_results_animation);
    }

    /* renamed from: c */
    public final void mo77354c(int i) {
        String string = getResources().getString(R.string.personal_results_learn_more_link);
        if (i == 2) {
            string = getResources().getString(R.string.personal_results_learn_more_link_unicorn);
        }
        this.f228692d.setContentDescription(getResources().getString(R.string.personal_results_learn_more_talkback_text));
        Uri build = Uri.parse(string).buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).build();
        this.f228692d.setText(LinkUtil.m133791a((Spannable) Html.fromHtml(getResources().getString(R.string.personal_results_learn_more_text, new Object[]{build}), 0)));
        this.f228692d.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public PersonalResultsPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.personal_results_page, this);
        OpaPageLayout opaPageLayout = (OpaPageLayout) findViewById(R.id.opa_page_layout);
        this.f228693e = opaPageLayout;
        this.f228689a = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        FooterLayout footerLayout = opaPageLayout.f228726a;
        this.f228691c = footerLayout;
        footerLayout.mo77362c(2);
        footerLayout.mo77363d(true);
        footerLayout.mo77360a().setText(R.string.personal_results_action_button);
        footerLayout.mo77361b().setText(R.string.personal_results_cancel_button);
        this.f228690b = (TextView) opaPageLayout.findViewById(R.id.personal_results_message);
        this.f228692d = (TextView) opaPageLayout.findViewById(R.id.opa_error_learn_more);
    }
}
