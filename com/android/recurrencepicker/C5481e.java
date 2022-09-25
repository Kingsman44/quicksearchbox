package com.android.recurrencepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: com.android.recurrencepicker.e */
/* compiled from: PG */
final class C5481e extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ RecurrencePickerBaseDialog f16616a;

    /* renamed from: b */
    private final LayoutInflater f16617b;

    /* renamed from: c */
    private final int f16618c = R.layout.recurrencepicker_freq_item;

    /* renamed from: d */
    private final int f16619d = R.layout.recurrencepicker_end_text;

    /* renamed from: e */
    private final ArrayList f16620e;

    /* renamed from: f */
    private final String f16621f;

    /* renamed from: g */
    private boolean f16622g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5481e(RecurrencePickerBaseDialog recurrencePickerBaseDialog, Context context, ArrayList arrayList) {
        super(context, R.layout.recurrencepicker_freq_item, arrayList);
        this.f16616a = recurrencePickerBaseDialog;
        this.f16617b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f16620e = arrayList;
        String string = context.getResources().getString(R.string.recurrence_end_date);
        this.f16621f = string;
        if (string.indexOf("%s") <= 0) {
            this.f16622g = true;
        } else if (context.getResources().getQuantityString(R.plurals.recurrence_end_count, 1).indexOf("%d") <= 0) {
            this.f16622g = true;
        }
        if (this.f16622g) {
            recurrencePickerBaseDialog.f16581e.setLayoutParams(new TableLayout.LayoutParams(0, -2, 1.0f));
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f16617b.inflate(this.f16618c, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.spinner_item)).setText((CharSequence) this.f16620e.get(i));
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f16617b.inflate(this.f16619d, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.spinner_item);
        if (i == 0) {
            textView.setText((CharSequence) this.f16620e.get(0));
            return view;
        } else if (i == 1) {
            int indexOf = this.f16621f.indexOf("%s");
            if (indexOf == -1) {
                return view;
            }
            if (this.f16622g || indexOf == 0) {
                textView.setText(this.f16616a.f16585i);
                return view;
            }
            textView.setText(this.f16621f.substring(0, indexOf).trim());
            return view;
        } else if (i != 2) {
            return null;
        } else {
            RecurrencePickerBaseDialog recurrencePickerBaseDialog = this.f16616a;
            String quantityString = recurrencePickerBaseDialog.f16577a.getQuantityString(R.plurals.recurrence_end_count, recurrencePickerBaseDialog.f16578b.f16606f);
            int indexOf2 = quantityString.indexOf("%d");
            if (indexOf2 == -1) {
                return view;
            }
            if (this.f16622g || indexOf2 == 0) {
                textView.setText(this.f16616a.f16586j);
                this.f16616a.f16583g.setVisibility(8);
                this.f16616a.f16584h = true;
                return view;
            }
            this.f16616a.f16583g.setText(quantityString.substring(indexOf2 + 2, quantityString.length()).trim());
            RecurrencePickerBaseDialog recurrencePickerBaseDialog2 = this.f16616a;
            if (recurrencePickerBaseDialog2.f16578b.f16604d == 2) {
                recurrencePickerBaseDialog2.f16583g.setVisibility(0);
            }
            int i2 = indexOf2 - 1;
            if (quantityString.charAt(i2) == ' ') {
                indexOf2 = i2;
            }
            textView.setText(quantityString.substring(0, indexOf2).trim());
            return view;
        }
    }
}
