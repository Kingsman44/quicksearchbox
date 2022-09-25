package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TableRow;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.TextOrIconTableRow */
/* compiled from: PG */
public class TextOrIconTableRow extends TableRow {

    /* renamed from: a */
    public int f292774a = -1;

    /* renamed from: b */
    public final int f292775b;

    /* renamed from: c */
    public final int f292776c;

    /* renamed from: d */
    public int f292777d;

    /* renamed from: e */
    public int f292778e = -2;

    /* renamed from: f */
    public boolean f292779f;

    public TextOrIconTableRow(Context context) {
        super(context);
        Resources resources = context.getResources();
        this.f292775b = resources.getDimensionPixelSize(R.dimen.text_or_icon_table_row_default_image_width);
        this.f292776c = resources.getDimensionPixelSize(R.dimen.text_or_icon_table_row_default_image_height);
        this.f292777d = resources.getDimensionPixelSize(R.dimen.text_or_icon_table_row_default_column_padding);
    }

    public TextOrIconTableRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C105083t.f292819a);
        Resources resources = context.getResources();
        this.f292774a = obtainStyledAttributes.getResourceId(3, -1);
        this.f292775b = obtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.text_or_icon_table_row_default_image_width));
        this.f292776c = obtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.text_or_icon_table_row_default_image_height));
        this.f292777d = obtainStyledAttributes.getDimensionPixelOffset(0, resources.getDimensionPixelOffset(R.dimen.text_or_icon_table_row_default_column_padding));
        obtainStyledAttributes.recycle();
    }
}
