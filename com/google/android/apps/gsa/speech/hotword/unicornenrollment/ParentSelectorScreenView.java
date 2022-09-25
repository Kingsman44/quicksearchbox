package com.google.android.apps.gsa.speech.hotword.unicornenrollment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.assistant.p3861at.C50375ut;

/* compiled from: PG */
public class ParentSelectorScreenView extends FrameLayout {

    /* renamed from: a */
    private final OpaPageLayout f257749a = ((OpaPageLayout) findViewById(R.id.opa_page_layout));

    /* renamed from: b */
    private final ViewGroup f257750b;

    /* renamed from: c */
    private final MaterialProgressBar f257751c;

    public ParentSelectorScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.hotword_enrollment_parent_selector_view, this);
        ((HeaderLayout) findViewById(R.id.opa_header)).mo77364a(0);
        MaterialProgressBar materialProgressBar = (MaterialProgressBar) findViewById(R.id.progress_bar);
        this.f257751c = materialProgressBar;
        materialProgressBar.mo34165h();
        this.f257750b = (ViewGroup) findViewById(R.id.content);
    }

    /* renamed from: a */
    public final ImageView mo87062a(C50375ut utVar, View.OnClickListener onClickListener) {
        this.f257751c.setVisibility(8);
        View inflate = inflate(getContext(), R.layout.hotword_enrollment_parent_profile_2_line_with_image, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.primary_text)).setText(utVar.f131130b);
        ((TextView) inflate.findViewById(R.id.secondary_text)).setText(utVar.f131131c);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.profile_image);
        inflate.setOnClickListener(onClickListener);
        this.f257750b.addView(inflate);
        return imageView;
    }

    /* renamed from: b */
    public final void mo87063b(boolean z, View.OnClickListener onClickListener, String str, boolean z2, boolean z3) {
        TextView textView = (TextView) findViewById(R.id.subtitle_text_view);
        TextView textView2 = (TextView) findViewById(R.id.small_text_view);
        if (!z) {
            textView.setText(getContext().getText(R.string.hotword_enrollment_parent_selector_subtitle));
            textView2.setText(getContext().getString(R.string.hotword_enrollment_parent_selector_smalltext, new Object[]{str}));
        } else if (!z2 || z3) {
            textView.setText(getContext().getText(R.string.hotword_enrollment_parent_selector_subtitle));
            textView2.setText(getContext().getString(R.string.hotword_enrollment_parent_selector_smalltext, new Object[]{str}));
        } else {
            textView.setText(getContext().getText(R.string.hotword_enrollment_parent_selector_subtitle_oobe));
            textView2.setText(getContext().getString(R.string.hotword_enrollment_parent_selector_smalltext_oobe, new Object[]{str}));
        }
        FooterLayout footerLayout = this.f257749a.f228726a;
        footerLayout.mo77362c(4);
        Button b = footerLayout.mo77361b();
        b.setText(R.string.hotword_enrollment_enroll_intro_decline_label_assistant_device);
        b.setOnClickListener(onClickListener);
    }
}
