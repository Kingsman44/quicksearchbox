package com.google.android.apps.search.podcasts.widgets.valueselector;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.search.podcasts.widgets.valueselector.b */
/* compiled from: PG */
final class C141284b extends C0640fb {

    /* renamed from: a */
    final /* synthetic */ HorizontalValueSelector f383583a;

    public C141284b(HorizontalValueSelector horizontalValueSelector) {
        this.f383583a = horizontalValueSelector;
    }

    public final int getItemCount() {
        C58485gu guVar = this.f383583a.f383574b;
        if (guVar == null) {
            return 0;
        }
        return ((C58724pq) guVar).f156474d + 2;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C141289g gVar = (C141289g) ghVar;
        if (i == 0 || i == getItemCount() - 1) {
            gVar.itemView.setVisibility(4);
            gVar.itemView.getLayoutParams().width = this.f383583a.f383576d;
            return;
        }
        gVar.itemView.getLayoutParams().width = this.f383583a.f383577e;
        gVar.itemView.setVisibility(0);
        TextView textView = (TextView) gVar.itemView.findViewById(R.id.podcasts_horizontal_value_selector_scroll_item_text);
        int i2 = i - 1;
        if (i2 % 5 == 0) {
            textView.setText(((C141288f) this.f383583a.f383574b.get(i2)).mo115956b());
        } else {
            textView.setText(BuildConfig.FLAVOR);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C141289g(LayoutInflater.from(this.f383583a.getContext()).inflate(R.layout.podcasts_horizontal_value_selector_scroll_item, viewGroup, false));
    }
}
