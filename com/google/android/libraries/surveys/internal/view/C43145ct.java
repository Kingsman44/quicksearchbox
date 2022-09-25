package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p096h.C1951d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43056e;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.p4281bu.p4282a.C56517ba;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68391p;

/* renamed from: com.google.android.libraries.surveys.internal.view.ct */
/* compiled from: PG */
public final class C43145ct extends C43071a {

    /* renamed from: d */
    private LinearLayout f112831d;

    /* renamed from: c */
    public final C56517ba mo46120c() {
        return null;
    }

    /* renamed from: d */
    public final void mo46121d() {
        if (this.f112831d != null) {
            int i = 0;
            while (i < this.f112831d.getChildCount()) {
                View childAt = this.f112831d.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150).setStartDelay((long) (i * 80));
            }
        }
    }

    /* renamed from: e */
    public final void mo46122e() {
        mo46119b().mo46106c();
        mo46119b().mo46107d(true, this);
        if (TextUtils.isEmpty(C43066o.m75987h(this.f112648b.f150892c)) && mo46119b() != null) {
            if (C43054c.m75959b(C68391p.f184739a.mo6453a().mo60379a(C43054c.f112610b))) {
                mo46119b().mo46111x();
            }
            mo46119b().mo46110w();
        }
    }

    /* renamed from: f */
    public final void mo46123f(String str) {
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f112831d = (LinearLayout) layoutInflater.inflate(R.layout.survey_thank_you_fragment, viewGroup, false);
        Bundle arguments = getArguments();
        C43056e.m75962b((ImageView) this.f112831d.findViewById(R.id.survey_prompt_banner_logo), Integer.valueOf(arguments.getInt("DisplayLogoResId", 0)));
        TextView textView = (TextView) this.f112831d.findViewById(R.id.survey_question_text);
        Spanned a = C1951d.m5280a(this.f112648b.f150890a, 0);
        textView.setText(a);
        textView.setContentDescription(a.toString());
        textView.announceForAccessibility(textView.getContentDescription());
        String h = C43066o.m75987h(this.f112648b.f150892c);
        if (!TextUtils.isEmpty(h)) {
            String str = this.f112648b.f150891b;
            if (TextUtils.isEmpty(str)) {
                str = getResources().getString(R.string.survey_thank_you_followup_message);
            }
            TextView textView2 = (TextView) this.f112831d.findViewById(R.id.survey_follow_up_url);
            textView2.setContentDescription(str);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new C43144cs(this, h), 0, str.length(), 0);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(spannableString);
            if (C43066o.m75994o(getContext())) {
                textView2.setClickable(false);
                textView2.setLongClickable(false);
            }
            textView2.setOnTouchListener(C43143cr.f112828a);
            textView2.setVisibility(0);
        }
        return this.f112831d;
    }
}
