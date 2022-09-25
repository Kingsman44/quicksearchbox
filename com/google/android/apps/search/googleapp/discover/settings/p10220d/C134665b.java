package com.google.android.apps.search.googleapp.discover.settings.p10220d;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.d.b */
/* compiled from: PG */
final class C134665b extends C0640fb {

    /* renamed from: a */
    private final List f366717a;

    public C134665b(List list) {
        this.f366717a = list;
    }

    public final int getItemCount() {
        return this.f366717a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        ((C134664a) ghVar).f366716a.setText((CharSequence) this.f366717a.get(i));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C134664a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_text_row_item, viewGroup, false));
    }
}
