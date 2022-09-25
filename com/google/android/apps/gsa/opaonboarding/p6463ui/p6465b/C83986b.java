package com.google.android.apps.gsa.opaonboarding.p6463ui.p6465b;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.b.b */
/* compiled from: PG */
public final class C83986b extends C83985a {

    /* renamed from: a */
    public final Switch f228785a;

    public C83986b(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.consent_element_content_switch, (FrameLayout) findViewById(R.id.consent_element_main_content), true);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.useMaterialThemeColors, typedValue, true);
        if (typedValue.data != 0) {
            this.f228785a = new Switch(new ContextThemeWrapper(context, 2132148869));
        } else {
            this.f228785a = new Switch(getContext());
        }
        mo77423b(this.f228785a);
    }

    /* renamed from: d */
    public final void mo77425d(String str, C58833ax axVar) {
        ((TextView) findViewById(R.id.switch_content_message)).setText(Html.fromHtml(str));
        if (axVar.mo56113h()) {
            TextView textView = (TextView) findViewById(R.id.switch_content_additional_text);
            textView.setVisibility(0);
            textView.setText(Html.fromHtml((String) axVar.mo56107c()));
            findViewById(R.id.switch_content_additional_text_separator).setVisibility(0);
        }
    }
}
