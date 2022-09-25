package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.shared;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6465b.C83985a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.shared.c */
/* compiled from: PG */
public final class C109859c extends C83985a {

    /* renamed from: c */
    private static final C59071e f306105c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.shared.c");

    /* renamed from: a */
    public boolean f306106a = false;

    /* renamed from: b */
    public final ImageView f306107b;

    public C109859c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.consent_element_content_expandable, (FrameLayout) findViewById(R.id.consent_element_main_content), true);
        ImageView imageView = new ImageView(getContext());
        this.f306107b = imageView;
        imageView.setImageResource(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.control_image_dimen);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.useMaterialThemeColors, typedValue, true);
        if (typedValue.data != 0) {
            try {
                imageView.setImageTintList(ColorStateList.valueOf(C19391a.m36980a(context, R.attr.colorOnBackground)));
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f306105c.mo56225c()).mo56382g(e)).mo56372aa(25301)).mo56386p("Not able to find color from AssistantColor");
            }
        }
        mo77423b(this.f306107b);
        setOnClickListener(new C109858b(this));
    }

    /* renamed from: d */
    public final void mo98210d(List list, List list2) {
        TextView textView = (TextView) findViewById(R.id.consent_content_description);
        textView.setText(Html.fromHtml(TextUtils.join("<p>", list)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = (TextView) findViewById(R.id.consent_content_additional_text);
        textView2.setText(Html.fromHtml(TextUtils.join("<p>", list2)));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setVisibility(8);
    }
}
