package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2814a;

import android.content.Context;
import android.support.p033v7.widget.AppCompatImageView;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.a.b */
/* compiled from: PG */
public final class C36686b extends LinearLayout {

    /* renamed from: a */
    public boolean f95573a = false;

    /* renamed from: b */
    public final ImageView f95574b;

    public C36686b(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(context).inflate(R.layout.assistant_consent_ui_expandable, this);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.f95574b = appCompatImageView;
        appCompatImageView.setImageResource(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorOnboardingOnSurfaceVariant, typedValue, true);
        appCompatImageView.setColorFilter(C1878d.m5128a(context, typedValue.resourceId));
        ((ViewGroup) findViewById(R.id.consent_ui_control)).addView(appCompatImageView);
        setOnClickListener(new C36685a(this));
    }

    /* renamed from: c */
    private static void m65281c(TextView textView, List list) {
        textView.setText(Html.fromHtml(TextUtils.join("<p>", list)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    public final void mo40328a(List list, List list2) {
        m65281c((TextView) findViewById(R.id.consent_ui_description), list);
        TextView textView = (TextView) findViewById(R.id.consent_ui_additional_description);
        textView.setLinkTextColor(textView.getCurrentTextColor());
        m65281c(textView, list2);
        textView.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo40329b(String str) {
        ((TextView) findViewById(R.id.consent_ui_title)).setText(Html.fromHtml(str));
    }
}
