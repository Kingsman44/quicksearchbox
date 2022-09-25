package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.imageviewer.reviewstars.ReviewStarsView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ProductMetadataView */
/* compiled from: PG */
public class ProductMetadataView extends LinearLayout {

    /* renamed from: a */
    public LinearLayout f285480a;

    /* renamed from: b */
    public LinearLayout f285481b;

    /* renamed from: c */
    public ReviewStarsView f285482c;

    /* renamed from: d */
    public TextView f285483d;

    /* renamed from: e */
    public TextView f285484e;

    /* renamed from: f */
    public TextView f285485f;

    /* renamed from: g */
    public TextView f285486g;

    /* renamed from: h */
    public final List f285487h = new ArrayList();

    /* renamed from: i */
    public final List f285488i = new ArrayList();

    /* renamed from: j */
    public final NumberFormat f285489j = NumberFormat.getCurrencyInstance();

    public ProductMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private static final void m169589b(LinearLayout linearLayout) {
        if (linearLayout.getChildCount() == 2) {
            linearLayout.removeViewAt(1);
        }
    }

    /* renamed from: a */
    public final void mo93093a() {
        if (this.f285481b.getChildCount() > 0) {
            LinearLayout linearLayout = this.f285481b;
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            m169589b(this.f285481b);
            return;
        }
        LinearLayout linearLayout2 = this.f285480a;
        linearLayout2.removeViewAt(linearLayout2.getChildCount() - 1);
        m169589b(this.f285480a);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f285480a = (LinearLayout) findViewById(R.id.product_details_top_row);
        this.f285481b = (LinearLayout) findViewById(R.id.product_details_bottom_row);
        this.f285482c = (ReviewStarsView) findViewById(R.id.product_review_stars);
        this.f285484e = (TextView) findViewById(R.id.product_description);
        this.f285485f = (TextView) findViewById(R.id.product_review_count);
        this.f285486g = (TextView) findViewById(R.id.product_rating_value);
        this.f285487h.add((LetterSpacingTextView) findViewById(R.id.product_details_label_1));
        this.f285487h.add((LetterSpacingTextView) findViewById(R.id.product_details_label_2));
        this.f285487h.add((LetterSpacingTextView) findViewById(R.id.product_details_label_3));
        this.f285488i.add((TextView) findViewById(R.id.product_details_value_1));
        this.f285488i.add((TextView) findViewById(R.id.product_details_value_2));
        this.f285488i.add((TextView) findViewById(R.id.product_details_value_3));
        ((LetterSpacingTextView) findViewById(R.id.product_rating_label)).mo93091a();
        for (LetterSpacingTextView a : this.f285487h) {
            a.mo93091a();
        }
    }
}
