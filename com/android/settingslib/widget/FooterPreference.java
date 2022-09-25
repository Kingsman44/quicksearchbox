package com.android.settingslib.widget;

import android.content.Context;
import android.support.p033v7.widget.C0678gm;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.settings.C117308ae;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class FooterPreference extends Preference {

    /* renamed from: a */
    public View.OnClickListener f16639a;

    /* renamed from: b */
    public CharSequence f16640b;

    /* renamed from: c */
    private CharSequence f16641c;

    /* renamed from: d */
    private FooterLearnMoreSpan f16642d;

    /* compiled from: PG */
    class FooterLearnMoreSpan extends URLSpan {

        /* renamed from: a */
        private final View.OnClickListener f16643a;

        public FooterLearnMoreSpan(View.OnClickListener onClickListener) {
            super(BuildConfig.FLAVOR);
            this.f16643a = onClickListener;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.f16643a;
            if (onClickListener != null) {
                ((C117308ae) onClickListener).f325644a.mo103251o();
            }
        }
    }

    public FooterPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: L */
    public final void mo8345L(int i) {
        mo8346M(i);
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        TextView textView = (TextView) axVar.itemView.findViewById(16908310);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            textView.setContentDescription((CharSequence) null);
        }
        TextView textView2 = (TextView) axVar.itemView.findViewById(R.id.settingslib_learn_more);
        if (textView2 == null || this.f16639a == null) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        if (TextUtils.isEmpty(this.f16641c)) {
            this.f16641c = textView2.getText();
        } else {
            textView2.setText(this.f16641c);
        }
        SpannableString spannableString = new SpannableString(this.f16641c);
        FooterLearnMoreSpan footerLearnMoreSpan = this.f16642d;
        if (footerLearnMoreSpan != null) {
            spannableString.removeSpan(footerLearnMoreSpan);
        }
        FooterLearnMoreSpan footerLearnMoreSpan2 = new FooterLearnMoreSpan(this.f16639a);
        this.f16642d = footerLearnMoreSpan2;
        spannableString.setSpan(footerLearnMoreSpan2, 0, spannableString.length(), 0);
        textView2.setText(spannableString);
        if (!TextUtils.isEmpty(this.f16640b)) {
            textView2.setContentDescription(this.f16640b);
        }
    }

    /* renamed from: m */
    public final CharSequence mo8328m() {
        return this.f12745q;
    }

    /* renamed from: n */
    public final void mo8329n(CharSequence charSequence) {
        mo8347N(charSequence);
    }

    public FooterPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.footerPreferenceStyle);
        int i;
        this.f12718D = R.layout.preference_footer;
        if (this.f12747s == null && (i = this.f12746r) != 0) {
            this.f12747s = C0678gm.m2375e().mo3100c(this.f12738j, i);
        }
        if (this.f12747s == null) {
            mo8340G(R.drawable.settingslib_ic_info_outline_24);
        }
        mo8344K(2147483646);
        if (TextUtils.isEmpty(this.f12748t)) {
            mo8343J("footer_preference");
        }
        mo8360aa();
    }
}
