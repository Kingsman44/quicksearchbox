package com.google.android.apps.search.googleapp.search.settings.p10427d;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.search.settings.p10424a.C137563c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import java.util.List;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.d.f */
/* compiled from: PG */
public final class C137603f extends C0640fb {

    /* renamed from: a */
    public final C137563c f374286a;

    /* renamed from: b */
    public final List f374287b;

    /* renamed from: c */
    private final C47770dh f374288c;

    public C137603f(C137563c cVar, C47770dh dhVar, List list) {
        this.f374286a = cVar;
        this.f374288c = dhVar;
        this.f374287b = list;
    }

    public final int getItemCount() {
        return this.f374287b.size();
    }

    public final int getItemViewType(int i) {
        return ((C137599b) this.f374287b.get(i)).f374275a.ordinal();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C69664n.m101061g(ghVar, "viewHolder");
        C137599b bVar = (C137599b) this.f374287b.get(ghVar.getBindingAdapterPosition());
        if (ghVar instanceof C137601d) {
            C137601d dVar = (C137601d) ghVar;
            dVar.f374283c.setVisibility(true != bVar.f374279e ? 4 : 0);
            dVar.f374281a.setText(bVar.f374276b);
            dVar.f374282b.setText(Locale.forLanguageTag(bVar.f374277c).getDisplayName());
        } else if (ghVar instanceof C137600c) {
            ((C137600c) ghVar).f374280a.setText(bVar.f374276b);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == C137598a.LANGUAGE.ordinal()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_search_language_preferences, viewGroup, false);
            C69664n.m101060f(inflate, "from(parent.context)\n   …=*/ false\n              )");
            C137601d dVar = new C137601d(inflate);
            dVar.itemView.setOnClickListener(new C47591co(this.f374288c, "Search language changed", new C137602e(this, dVar)));
            return dVar;
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_search_language_preference_section_header, viewGroup, false);
        C69664n.m101060f(inflate2, "from(parent.context)\n   …ot=*/ false\n            )");
        return new C137600c(inflate2);
    }
}
