package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.VideoView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.z */
/* compiled from: PG */
public final class C84031z extends FrameLayout {

    /* renamed from: a */
    public final TextView f228878a;

    /* renamed from: b */
    public final TextView f228879b;

    /* renamed from: c */
    public final Switch f228880c;

    /* renamed from: d */
    public final ImageView f228881d;

    /* renamed from: e */
    public final Switch f228882e;

    /* renamed from: f */
    public final TextView f228883f;

    /* renamed from: g */
    public final ImageView f228884g;

    /* renamed from: h */
    public final TextView f228885h;

    /* renamed from: i */
    public final TextView f228886i;

    /* renamed from: j */
    public final VideoView f228887j;

    /* renamed from: k */
    public final LottieAnimationView f228888k;

    /* renamed from: l */
    public final View f228889l;

    /* renamed from: m */
    final ImageView f228890m;

    /* renamed from: n */
    final FrameLayout f228891n;

    /* renamed from: o */
    public final RelativeLayout f228892o;

    /* renamed from: p */
    public final WebView f228893p;

    /* renamed from: q */
    public final RecyclerView f228894q;

    /* renamed from: r */
    public final TextView f228895r;

    /* renamed from: s */
    View f228896s;

    /* renamed from: t */
    int f228897t = 1;

    /* renamed from: u */
    private final TextView f228898u;

    public C84031z(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(getContext(), R.layout.error_template_content, this);
        setId(R.id.opa_content_container);
        this.f228878a = (TextView) findViewById(R.id.opa_error_message_second_paragraph);
        this.f228879b = (TextView) findViewById(R.id.opa_error_annotation);
        this.f228880c = (Switch) findViewById(R.id.opa_error_switch_container).findViewById(R.id.opa_error_switch);
        this.f228898u = (TextView) findViewById(R.id.opa_error_switch_container).findViewById(R.id.opa_error_switch_text);
        this.f228881d = (ImageView) findViewById(R.id.opa_error_switch_container).findViewById(R.id.opa_error_switch_icon);
        this.f228882e = (Switch) findViewById(R.id.opa_error_sub_switch_container).findViewById(R.id.opa_error_switch);
        this.f228883f = (TextView) findViewById(R.id.opa_error_sub_switch_container).findViewById(R.id.opa_error_switch_text);
        this.f228884g = (ImageView) findViewById(R.id.opa_error_sub_switch_container).findViewById(R.id.opa_error_switch_icon);
        this.f228885h = (TextView) findViewById(R.id.opa_error_learn_more);
        this.f228890m = (ImageView) findViewById(R.id.opa_error_illustration);
        this.f228893p = (WebView) findViewById(R.id.opa_error_webview);
        this.f228891n = (FrameLayout) findViewById(R.id.opa_error_video_container);
        this.f228887j = (VideoView) findViewById(R.id.opa_error_video);
        this.f228889l = findViewById(R.id.opa_error_video_progress_overlay);
        this.f228892o = (RelativeLayout) findViewById(R.id.opa_error_animation_container);
        this.f228888k = (LottieAnimationView) findViewById(R.id.opa_error_animation_view);
        this.f228894q = (RecyclerView) findViewById(R.id.opa_error_recycler_view);
        this.f228886i = (TextView) findViewById(R.id.opa_error_additional_information);
        this.f228895r = (TextView) findViewById(R.id.opa_error_email_supplementary_text);
    }

    /* renamed from: a */
    public final void mo77491a(Drawable drawable, CharSequence charSequence) {
        this.f228890m.setImageDrawable(drawable);
        this.f228890m.setContentDescription(charSequence);
        mo77494d(2, drawable != null);
    }

    /* renamed from: b */
    public final void mo77492b(int i) {
        String string = i == 0 ? null : getResources().getString(i);
        C84018m.m133910e(this.f228885h, string);
        if (string != null) {
            String string2 = getResources().getString(R.string.common_learn_more);
            this.f228885h.setContentDescription(string2);
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(new URLSpan(string), 0, string2.length(), 17);
            this.f228885h.setText(spannableString);
            this.f228885h.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: c */
    public final void mo77493c(int i) {
        C84018m.m133908c(this.f228898u, C84018m.m133906a(i, this), TextView.BufferType.NORMAL, this);
        C84018m.m133911f(findViewById(R.id.opa_error_switch_container), i != 0);
    }

    /* renamed from: d */
    public final void mo77494d(int i, boolean z) {
        View view;
        if (z) {
            C84018m.m133911f(this.f228896s, false);
            int i2 = i - 1;
            if (i2 == 1) {
                view = this.f228890m;
            } else if (i2 == 2) {
                view = this.f228892o;
            } else if (i2 == 3) {
                view = this.f228891n;
            } else if (i2 == 4) {
                view = this.f228893p;
            } else if (i2 != 5) {
                this.f228896s = this.f228895r;
                C84018m.m133911f(this.f228896s, true);
                this.f228897t = i;
            } else {
                view = this.f228894q;
            }
            this.f228896s = view;
            C84018m.m133911f(this.f228896s, true);
            this.f228897t = i;
        } else if (this.f228897t == i) {
            C84018m.m133911f(this.f228896s, false);
            this.f228896s = null;
            this.f228897t = 1;
        }
    }
}
