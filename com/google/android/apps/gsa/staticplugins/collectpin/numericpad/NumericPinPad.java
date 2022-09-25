package com.google.android.apps.gsa.staticplugins.collectpin.numericpad;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.collectpin.C98493g;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class NumericPinPad extends GridLayout {

    /* renamed from: a */
    TextView[] f275037a;

    /* renamed from: b */
    ImageView f275038b;

    /* renamed from: c */
    View.OnClickListener f275039c;

    /* renamed from: d */
    View.OnClickListener f275040d;

    /* renamed from: e */
    View.OnLongClickListener f275041e;

    /* renamed from: f */
    public C98493g f275042f;

    public NumericPinPad(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumericPinPad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = inflate(context, R.layout.numericpinpad, this);
        TextView[] textViewArr = new TextView[10];
        this.f275037a = textViewArr;
        textViewArr[0] = (TextView) inflate.findViewById(R.id.t9_key_0);
        this.f275037a[1] = (TextView) inflate.findViewById(R.id.t9_key_1);
        this.f275037a[2] = (TextView) inflate.findViewById(R.id.t9_key_2);
        this.f275037a[3] = (TextView) inflate.findViewById(R.id.t9_key_3);
        this.f275037a[4] = (TextView) inflate.findViewById(R.id.t9_key_4);
        this.f275037a[5] = (TextView) inflate.findViewById(R.id.t9_key_5);
        this.f275037a[6] = (TextView) inflate.findViewById(R.id.t9_key_6);
        this.f275037a[7] = (TextView) inflate.findViewById(R.id.t9_key_7);
        this.f275037a[8] = (TextView) inflate.findViewById(R.id.t9_key_8);
        this.f275037a[9] = (TextView) inflate.findViewById(R.id.t9_key_9);
        this.f275038b = (ImageView) inflate.findViewById(R.id.t9_key_backspace);
        TextView[] textViewArr2 = this.f275037a;
        textViewArr2.getClass();
        TextView[] textViewArr3 = textViewArr2;
        TextView textView = textViewArr3[0];
        textView.getClass();
        textView.setTag(R.id.t9_key_0, 0);
        TextView textView2 = textViewArr3[1];
        textView2.getClass();
        textView2.setTag(R.id.t9_key_1, 1);
        TextView textView3 = textViewArr3[2];
        textView3.getClass();
        textView3.setTag(R.id.t9_key_2, 2);
        TextView textView4 = textViewArr3[3];
        textView4.getClass();
        textView4.setTag(R.id.t9_key_3, 3);
        TextView textView5 = textViewArr3[4];
        textView5.getClass();
        textView5.setTag(R.id.t9_key_4, 4);
        TextView textView6 = textViewArr3[5];
        textView6.getClass();
        textView6.setTag(R.id.t9_key_5, 5);
        TextView textView7 = textViewArr3[6];
        textView7.getClass();
        textView7.setTag(R.id.t9_key_6, 6);
        TextView textView8 = textViewArr3[7];
        textView8.getClass();
        textView8.setTag(R.id.t9_key_7, 7);
        TextView textView9 = textViewArr3[8];
        textView9.getClass();
        textView9.setTag(R.id.t9_key_8, 8);
        TextView textView10 = textViewArr3[9];
        textView10.getClass();
        textView10.setTag(R.id.t9_key_9, 9);
        this.f275039c = new C98496a(this);
        TextView[] textViewArr4 = this.f275037a;
        textViewArr4.getClass();
        TextView[] textViewArr5 = textViewArr4;
        for (int i = 0; i < 10; i++) {
            textViewArr5[i].setOnClickListener(this.f275039c);
        }
        this.f275040d = new C98497b(this);
        this.f275041e = new C98498c(this);
        ImageView imageView = this.f275038b;
        imageView.getClass();
        imageView.setOnClickListener(this.f275040d);
        ImageView imageView2 = this.f275038b;
        imageView2.getClass();
        imageView2.setOnLongClickListener(this.f275041e);
        int min = Math.min(Math.max((int) (((float) Resources.getSystem().getDisplayMetrics().heightPixels) * 0.08f), context.getResources().getDimensionPixelSize(R.dimen.numericpinpad_digit_min_size)), context.getResources().getDimensionPixelSize(R.dimen.numericpinpad_digit_max_size));
        int min2 = Math.min(Math.max((int) (Resources.getSystem().getDisplayMetrics().scaledDensity * 16.0f), 20), 28);
        TextView[] textViewArr6 = this.f275037a;
        textViewArr6.getClass();
        TextView[] textViewArr7 = textViewArr6;
        for (int i2 = 0; i2 < 10; i2++) {
            TextView textView11 = textViewArr7[i2];
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView11.getLayoutParams();
            marginLayoutParams.height = min;
            textView11.setLayoutParams(marginLayoutParams);
            textView11.setTextSize(2, (float) min2);
        }
    }
}
