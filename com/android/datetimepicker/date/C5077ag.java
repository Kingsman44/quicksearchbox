package com.android.datetimepicker.date;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.android.datetimepicker.date.ag */
/* compiled from: PG */
final class C5077ag extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ C5078ah f16199a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5077ag(C5078ah ahVar, Context context, List list) {
        super(context, R.layout.year_label_text_view, list);
        this.f16199a = ahVar;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) super.getView(i, view, viewGroup);
        textViewWithCircularIndicator.requestLayout();
        boolean z = this.f16199a.f16200a.mo10082a().f16263a == C5078ah.m13948b(textViewWithCircularIndicator);
        textViewWithCircularIndicator.f16148b = z;
        if (z) {
            this.f16199a.f16201b = textViewWithCircularIndicator;
        }
        return textViewWithCircularIndicator;
    }
}
