package com.google.android.libraries.surveys.internal.view;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p097i.C1970e;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.libraries.surveys.internal.view.cp */
/* compiled from: PG */
public final class C43141cp extends C0640fb {

    /* renamed from: a */
    public List f112826a;

    public final int getItemCount() {
        List list = this.f112826a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C43140co coVar = (C43140co) ghVar;
        C1970e eVar = (C1970e) this.f112826a.get(i);
        ((TextView) coVar.f112825a.findViewById(R.id.survey_system_info_item_key)).setText((CharSequence) eVar.f5888a);
        ((TextView) coVar.f112825a.findViewById(R.id.survey_system_info_item_value)).setText((CharSequence) eVar.f5889b);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C43140co(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.survey_system_info_item, viewGroup, false));
    }
}
