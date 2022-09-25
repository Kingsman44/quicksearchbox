package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.da */
/* compiled from: PG */
final class C33349da extends C0640fb {

    /* renamed from: a */
    public final List f89391a;

    /* renamed from: b */
    final /* synthetic */ ReceiptCardListField f89392b;

    public C33349da(ReceiptCardListField receiptCardListField, List list) {
        this.f89392b = receiptCardListField;
        this.f89391a = list;
    }

    public final int getItemCount() {
        return this.f89391a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C33347cz czVar = (C33347cz) ghVar;
        C51119hb hbVar = (C51119hb) this.f89391a.get(i);
        TextView textView = czVar.f89387a;
        TextView textView2 = czVar.f89388b;
        textView.setVisibility(8);
        textView2.setVisibility(8);
        if ((hbVar.f133060a & 1) != 0) {
            textView.setText(hbVar.f133061b);
            textView.setVisibility(0);
        }
        if ((hbVar.f133060a & 2) != 0) {
            textView2.setText(hbVar.f133062c);
            textView2.setVisibility(0);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C33347cz(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fa_receipt_card_list_view_item, viewGroup, false));
    }
}
