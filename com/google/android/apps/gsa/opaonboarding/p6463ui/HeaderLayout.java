package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout */
/* compiled from: PG */
public class HeaderLayout extends FrameLayout {

    /* renamed from: a */
    public final TextView f228718a;

    /* renamed from: b */
    public final TextView f228719b;

    /* renamed from: c */
    public final ImageView f228720c;

    /* renamed from: d */
    public final ImageButton f228721d;

    public HeaderLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private final Float m133785c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true) || typedValue.type != 5) {
            return null;
        }
        return Float.valueOf(typedValue.getDimension(getContext().getResources().getDisplayMetrics()));
    }

    /* renamed from: d */
    private final void m133786d(TextView textView, int i) {
        Float c = m133785c(i);
        if (c != null) {
            textView.setTextSize(0, c.floatValue());
        }
    }

    /* renamed from: a */
    public final void mo77364a(int i) {
        if (i == 0) {
            this.f228720c.setVisibility(4);
            i = 0;
        }
        this.f228720c.setImageResource(i);
    }

    /* renamed from: b */
    public final void mo77365b(int i, int i2) {
        mo77364a(i);
        this.f228720c.setContentDescription(getContext().getString(i2));
    }

    public HeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.opa_header, this);
        setId(R.id.opa_header);
        TextView textView = (TextView) findViewById(R.id.opa_error_title);
        this.f228718a = textView;
        m133786d(textView, R.attr.opaHeaderTitleTextSize);
        TextView textView2 = (TextView) findViewById(R.id.opa_error_message);
        this.f228719b = textView2;
        m133786d(textView2, R.attr.opaHeaderMessageTextSize);
        ImageView imageView = (ImageView) findViewById(R.id.opa_error_image);
        this.f228720c = imageView;
        Float c = m133785c(R.attr.opaErrorLogoHeight);
        if (c != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = c.intValue();
            imageView.setLayoutParams(layoutParams);
        }
        this.f228721d = (ImageButton) findViewById(R.id.opa_error_close_button);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C83976aa.f228767a, 0, 0);
        C84018m.m133908c(textView, C84018m.m133906a(obtainStyledAttributes.getResourceId(2, 0), this), TextView.BufferType.NORMAL, this);
        C84018m.m133908c(textView2, C84018m.m133906a(obtainStyledAttributes.getResourceId(1, 0), this), TextView.BufferType.NORMAL, this);
        TypedValue typedValue = new TypedValue();
        mo77364a(obtainStyledAttributes.getResourceId(0, getContext().getTheme().resolveAttribute(R.attr.defaultErrorHeaderIcon, typedValue, true) ? typedValue.resourceId : R.drawable.opa_logo));
        TypedValue typedValue2 = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.opaHeaderImageIconColor, typedValue2, true)) {
            imageView.setColorFilter(C1878d.m5128a(context, typedValue2.resourceId));
        }
    }
}
