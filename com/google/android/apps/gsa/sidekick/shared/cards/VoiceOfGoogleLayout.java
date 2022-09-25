package com.google.android.apps.gsa.sidekick.shared.cards;

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
public class VoiceOfGoogleLayout extends LinearLayout {

    /* renamed from: a */
    public Button f255644a;

    /* renamed from: b */
    public Button f255645b;

    /* renamed from: c */
    public TextView f255646c;

    /* renamed from: d */
    private View f255647d;

    public VoiceOfGoogleLayout(Context context) {
        super(context);
        m149977a();
    }

    /* renamed from: a */
    private final void m149977a() {
        LayoutInflater.from(getContext()).inflate(R.layout.voice_of_google_layout, this, true);
        View findViewById = findViewById(R.id.prompt);
        findViewById.getClass();
        this.f255646c = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.buttons_frame);
        findViewById2.getClass();
        this.f255647d = findViewById2;
        View findViewById3 = findViewById2.findViewById(R.id.button1);
        findViewById3.getClass();
        this.f255644a = (Button) findViewById3;
        View findViewById4 = this.f255647d.findViewById(R.id.button2);
        findViewById4.getClass();
        this.f255645b = (Button) findViewById4;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = this.f255646c.getMeasuredWidth() - this.f255646c.getPaddingStart();
        int measuredWidth2 = getMeasuredWidth() - measuredWidth;
        int paddingStart = measuredWidth + this.f255644a.getPaddingStart();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f255647d.getLayoutParams();
        marginLayoutParams.width = paddingStart;
        int i4 = paddingStart / 2;
        this.f255644a.setMaxWidth(i4);
        this.f255645b.setMaxWidth(i4);
        Button button = this.f255644a;
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
            int max = Math.max(measuredWidth2 - ((this.f255644a.getMeasuredWidth() - i3) / 2), 0);
            if (C91115n.m148876h(this.f255647d)) {
                marginLayoutParams.rightMargin = max;
            } else {
                marginLayoutParams.leftMargin = max;
            }
        }
        super.onMeasure(i, i2);
    }

    public VoiceOfGoogleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m149977a();
    }

    public VoiceOfGoogleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m149977a();
    }
}
