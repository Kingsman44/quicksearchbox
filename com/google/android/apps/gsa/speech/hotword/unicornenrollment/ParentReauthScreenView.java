package com.google.android.apps.gsa.speech.hotword.unicornenrollment;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* compiled from: PG */
public class ParentReauthScreenView extends FrameLayout {

    /* renamed from: a */
    private final OpaPageLayout f257746a = ((OpaPageLayout) findViewById(R.id.opa_page_layout));

    /* renamed from: b */
    private final ProgressBar f257747b = ((ProgressBar) findViewById(R.id.progress_bar));

    /* renamed from: c */
    private final EditText f257748c = ((EditText) findViewById(R.id.password));

    public ParentReauthScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.hotword_enrollment_parent_reauth_view, this);
    }

    /* renamed from: a */
    public final ImageView mo87057a() {
        return (ImageView) findViewById(R.id.profile).findViewById(R.id.profile_image);
    }

    /* renamed from: b */
    public final void mo87058b() {
        this.f257747b.setVisibility(4);
    }

    /* renamed from: c */
    public final void mo87059c() {
        this.f257748c.setError(getContext().getString(R.string.hotword_enrollment_local_escalation_google_password_incorrect));
    }

    /* renamed from: d */
    public final void mo87060d(C92428g gVar) {
        Spannable spannable;
        ((TextView) findViewById(R.id.profile).findViewById(R.id.profile_email)).setText(gVar.mo87078e());
        this.f257748c.setTypeface(Typeface.DEFAULT);
        this.f257748c.setOnKeyListener(new C92424c(this, gVar));
        TextView textView = (TextView) findViewById(R.id.local_escalation_subtitle);
        ((TextView) findViewById(R.id.local_escalation_title)).setText(getContext().getString(R.string.hotword_enrollment_local_escalation_title, new Object[]{gVar.mo87077d()}));
        if (gVar.mo87084i()) {
            spannable = gVar.mo87075b().mo87038a(C5114a.m13988b(Locale.getDefault(), getContext().getString(R.string.hotword_enrollment_local_escalation_subtitle), "GENDER", gVar.mo87081g(), "PERSON", gVar.mo87080f(), "LINK", getContext().getString(R.string.hotword_enrollment_parent_intro_summary_learn_more_link)));
        } else if (gVar.mo87082h()) {
            spannable = gVar.mo87075b().mo87038a(C5114a.m13988b(Locale.getDefault(), getContext().getString(R.string.hotword_enrollment_local_escalation_subtitle_suw), "GENDER", gVar.mo87081g(), "PERSON", gVar.mo87080f()));
        } else {
            spannable = gVar.mo87075b().mo87038a(C5114a.m13988b(Locale.getDefault(), getContext().getString(R.string.hotword_enrollment_local_escalation_subtitle_oobe), "GENDER", gVar.mo87081g(), "PERSON", gVar.mo87080f()));
        }
        textView.setText(spannable);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        FooterLayout footerLayout = this.f257746a.f228726a;
        footerLayout.mo77362c(2);
        Button a = footerLayout.mo77360a();
        Button b = footerLayout.mo77361b();
        b.setText(R.string.hotword_enrollment_enroll_intro_decline_label_assistant_device);
        b.setOnClickListener(gVar.mo87074a());
        a.setText(R.string.hotword_enrollment_intro_get_started_unicorn);
        a.setOnClickListener(new C92425d(this, gVar));
    }

    /* renamed from: e */
    public final void mo87061e(C92427f fVar) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f257748c.getWindowToken(), 0);
        }
        this.f257747b.setVisibility(0);
        fVar.mo87090a(this.f257748c.getText().toString());
    }
}
