package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58974d;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.bb */
/* compiled from: PG */
public final class C27153bb {

    /* renamed from: A */
    CheckBox f74189A;

    /* renamed from: B */
    private final InputMethodManager f74190B;

    /* renamed from: a */
    public final Context f74191a;

    /* renamed from: b */
    public final C25225bd f74192b;

    /* renamed from: c */
    public final C28310af f74193c;

    /* renamed from: d */
    public final C28443m f74194d;

    /* renamed from: e */
    public final C28306ab f74195e;

    /* renamed from: f */
    public final C47770dh f74196f;

    /* renamed from: g */
    public final InputFilter[] f74197g = {new InputFilter.LengthFilter(2)};

    /* renamed from: h */
    public final InputFilter[] f74198h = {new InputFilter.LengthFilter(3)};

    /* renamed from: i */
    public final InputFilter[] f74199i = {new C27152ba()};

    /* renamed from: j */
    public final InputFilter[] f74200j = {new InputFilter.LengthFilter(13)};

    /* renamed from: k */
    public View f74201k;

    /* renamed from: l */
    public TextView f74202l;

    /* renamed from: m */
    public TextView f74203m;

    /* renamed from: n */
    public TextView f74204n;

    /* renamed from: o */
    public EditText f74205o;

    /* renamed from: p */
    public EditText f74206p;

    /* renamed from: q */
    public EditText f74207q;

    /* renamed from: r */
    public TextView f74208r;

    /* renamed from: s */
    public TextView f74209s;

    /* renamed from: t */
    public TextView f74210t;

    /* renamed from: u */
    public TextView f74211u;

    /* renamed from: v */
    public TextView f74212v;

    /* renamed from: w */
    public double f74213w;

    /* renamed from: x */
    public double f74214x;

    /* renamed from: y */
    public double f74215y;

    /* renamed from: z */
    public int f74216z;

    static {
        C58974d.m91135i("InfoPanelTipCalculatorRenderer");
    }

    public C27153bb(Context context, C25225bd bdVar, C28310af afVar, C28443m mVar, C28306ab abVar, C47770dh dhVar) {
        this.f74191a = context;
        this.f74190B = (InputMethodManager) context.getSystemService("input_method");
        this.f74192b = bdVar;
        this.f74193c = afVar;
        this.f74194d = mVar;
        this.f74195e = abVar;
        this.f74196f = dhVar;
    }

    /* renamed from: h */
    private static double m50355h(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* renamed from: i */
    private final void m50356i(TextView textView, double d) {
        if (this.f74216z > 1) {
            String string = this.f74191a.getString(R.string.lens_tc_amount, new Object[]{Double.valueOf(d)});
            int i = this.f74216z;
            textView.setText(string + "/" + i);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo32590a(EditText editText) {
        editText.clearFocus();
        this.f74190B.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    /* renamed from: b */
    public final void mo32591b(TextView textView, double d) {
        textView.setText(this.f74191a.getString(R.string.lens_tc_amount, new Object[]{Double.valueOf(d)}));
    }

    /* renamed from: c */
    public final void mo32592c(TextView textView, int i) {
        textView.setText(this.f74191a.getString(R.string.lens_tc_percentage_str, new Object[]{Integer.toString(i)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo32593d(double d) {
        if (this.f74189A.isChecked()) {
            this.f74214x = d;
        } else {
            this.f74213w = d;
        }
        mo32595f();
    }

    /* renamed from: e */
    public final void mo32594e() {
        if (this.f74189A.isChecked()) {
            this.f74202l.setText(R.string.lens_tc_bill_total);
            mo32591b(this.f74206p, this.f74214x);
            return;
        }
        this.f74202l.setText(R.string.lens_tc_subtotal_name);
        mo32591b(this.f74206p, this.f74213w);
    }

    /* renamed from: f */
    public final void mo32595f() {
        double d;
        if (this.f74189A.isChecked()) {
            d = m50355h(this.f74215y * this.f74214x);
        } else {
            d = m50355h(this.f74215y * this.f74213w);
        }
        m50356i(this.f74209s, d);
        double d2 = (double) this.f74216z;
        Double.isNaN(d2);
        mo32591b(this.f74203m, m50355h(d / d2));
        double h = m50355h(d + this.f74214x);
        m50356i(this.f74210t, h);
        double d3 = (double) this.f74216z;
        Double.isNaN(d3);
        mo32591b(this.f74204n, m50355h(h / d3));
        int i = this.f74216z;
        if ((i > 1 || h < 1.0E10d) && (i <= 1 || h < 100000.0d)) {
            this.f74211u.setVisibility(0);
            this.f74212v.setVisibility(8);
            return;
        }
        this.f74211u.setVisibility(8);
        this.f74212v.setVisibility(0);
    }

    /* renamed from: g */
    public final boolean mo32596g(int i, EditText editText) {
        if (i != 6) {
            return false;
        }
        mo32590a(editText);
        return true;
    }
}
