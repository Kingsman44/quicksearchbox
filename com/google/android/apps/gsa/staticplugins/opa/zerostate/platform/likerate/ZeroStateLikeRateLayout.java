package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ZeroStateLikeRateLayout extends LinearLayout {

    /* renamed from: a */
    private View f318987a;

    /* renamed from: b */
    private View f318988b;

    /* renamed from: c */
    private Button f318989c;

    /* renamed from: d */
    private Button f318990d;

    /* renamed from: e */
    private TextView f318991e;

    public ZeroStateLikeRateLayout(Context context) {
        super(context);
        m190543a();
    }

    /* renamed from: a */
    private final void m190543a() {
        LayoutInflater.from(getContext()).inflate(R.layout.zero_state_like_rate_layout, this, true);
        View findViewById = findViewById(R.id.question_frame);
        findViewById.getClass();
        this.f318987a = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.question);
        findViewById2.getClass();
        this.f318991e = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.buttons_frame);
        findViewById3.getClass();
        this.f318988b = findViewById3;
        View findViewById4 = findViewById3.findViewById(R.id.button1);
        findViewById4.getClass();
        this.f318989c = (Button) findViewById4;
        View findViewById5 = this.f318988b.findViewById(R.id.button2);
        findViewById5.getClass();
        this.f318990d = (Button) findViewById5;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        this.f318987a.measure(i, i2);
        int measuredWidth = this.f318991e.getMeasuredWidth() - this.f318991e.getPaddingStart();
        int measuredWidth2 = this.f318987a.getMeasuredWidth() - measuredWidth;
        int paddingStart = measuredWidth + this.f318989c.getPaddingStart();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f318988b.getLayoutParams();
        marginLayoutParams.width = paddingStart;
        int i4 = paddingStart / 2;
        this.f318989c.setMaxWidth(i4);
        this.f318990d.setMaxWidth(i4);
        super.onMeasure(i, i2);
        Button button = this.f318989c;
        Layout layout = button.getLayout();
        if (layout != null) {
            i3 = 0;
            for (int i5 = 0; i5 < button.getLineCount(); i5++) {
                int lineWidth = (int) layout.getLineWidth(i5);
                if (lineWidth > i3) {
                    i3 = lineWidth;
                }
            }
        } else {
            i3 = 0;
        }
        if (i3 > 0) {
            int max = Math.max(measuredWidth2 - ((this.f318989c.getMeasuredWidth() - i3) / 2), 0);
            if (C91115n.m148876h(this.f318988b)) {
                marginLayoutParams.rightMargin = max;
            } else {
                marginLayoutParams.leftMargin = max;
            }
        }
    }

    public ZeroStateLikeRateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m190543a();
    }

    public ZeroStateLikeRateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m190543a();
    }
}
