package com.google.android.apps.gsa.sidekick.shared.snackbar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class Snackbar extends LinearLayout {

    /* renamed from: a */
    public TextView f256330a;

    /* renamed from: b */
    public TextView f256331b;

    /* renamed from: c */
    public boolean f256332c;

    /* renamed from: d */
    private final int f256333d;

    /* renamed from: e */
    private final int f256334e;

    /* renamed from: f */
    private LinearLayout f256335f;

    public Snackbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private final void m150798b(int i) {
        setOrientation(i);
        this.f256335f.setOrientation(i);
    }

    /* renamed from: a */
    public final void mo86576a(String str, View.OnClickListener onClickListener) {
        if (!TextUtils.isEmpty(str)) {
            this.f256331b.setText(str);
            this.f256332c = false;
            this.f256331b.setVisibility(0);
        } else {
            this.f256331b.setVisibility(8);
        }
        this.f256331b.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f256330a = (TextView) findViewById(R.id.message);
        this.f256331b = (TextView) findViewById(R.id.action_button);
        this.f256335f = (LinearLayout) findViewById(R.id.snackbar_frame_layout);
        findViewById(R.id.snackbar).setOnClickListener(C91916a.f256336a);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f256330a != null) {
            if (this.f256333d > 0 && getMeasuredWidth() > (i3 = this.f256333d)) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
            if (this.f256330a.getLineCount() < 2 && !this.f256332c) {
                m150798b(0);
            } else if (this.f256330a.getLineCount() == 2 && !this.f256332c) {
                m150798b(0);
                C91115n.m148874f(this.f256330a, 0, this.f256334e);
                C91115n.m148874f(this.f256330a, 1, this.f256334e);
                C91115n.m148874f(this.f256330a, 3, 0);
                TextView textView = this.f256331b;
                textView.setPadding(textView.getPaddingLeft(), this.f256334e, this.f256331b.getPaddingRight(), this.f256334e);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f256331b.getLayoutParams();
                layoutParams.gravity = 16;
                this.f256331b.setLayoutParams(layoutParams);
                super.onMeasure(i, i2);
            } else if (this.f256330a.getLineCount() > 2 || this.f256332c) {
                C91115n.m148874f(this.f256330a, 0, this.f256334e);
                C91115n.m148874f(this.f256330a, 1, this.f256334e);
                C91115n.m148874f(this.f256331b, 0, 0);
                this.f256330a.setMaxLines(2);
                m150798b(1);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f256330a.getLayoutParams();
                layoutParams2.weight = 0.0f;
                layoutParams2.width = -1;
                this.f256330a.setLayoutParams(layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f256331b.getLayoutParams();
                layoutParams3.gravity = 5;
                this.f256331b.setLayoutParams(layoutParams3);
                this.f256332c = true;
                super.onMeasure(i, i2);
            }
        }
    }

    public Snackbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f256333d = getContext().getResources().getDimensionPixelOffset(R.dimen.snackbar_max_width);
        this.f256334e = getResources().getDimensionPixelSize(R.dimen.snackbar_top_bottom_two_line_padding);
    }
}
