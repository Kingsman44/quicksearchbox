package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7529aq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.d */
/* compiled from: PG */
final class C104771d extends BaseAdapter {

    /* renamed from: a */
    private final List f291838a;

    /* renamed from: b */
    private final LayoutInflater f291839b;

    public C104771d(Context context, List list) {
        this.f291838a = list;
        this.f291839b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final C7529aq getItem(int i) {
        return (C7529aq) this.f291838a.get(i);
    }

    public final int getCount() {
        return this.f291838a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C7529aq a = getItem(i);
        if (view == null) {
            view = this.f291839b.inflate(R.layout.bottomsheet_survey_option, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.option_text_view)).setText(a.f26064a);
        return view;
    }
}
