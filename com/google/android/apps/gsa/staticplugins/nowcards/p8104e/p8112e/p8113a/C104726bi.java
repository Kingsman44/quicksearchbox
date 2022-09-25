package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7664fj;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.bi */
/* compiled from: PG */
final class C104726bi extends BaseAdapter {

    /* renamed from: a */
    private final List f291703a;

    /* renamed from: b */
    private final LayoutInflater f291704b;

    public C104726bi(LayoutInflater layoutInflater, List list) {
        this.f291703a = list;
        this.f291704b = layoutInflater;
    }

    /* renamed from: a */
    public final C7664fj getItem(int i) {
        return (C7664fj) this.f291703a.get(i);
    }

    public final int getCount() {
        return this.f291703a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C7664fj a = getItem(i);
        if (view == null) {
            view = this.f291704b.inflate(R.layout.bottomsheet_survey_option, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.option_text_view)).setText(a.f26604b);
        return view;
    }
}
