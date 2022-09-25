package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.j */
/* compiled from: PG */
final class C102665j extends C0640fb {

    /* renamed from: a */
    public final List f286568a;

    /* renamed from: b */
    public final C102667l f286569b;

    public C102665j(List list, C102667l lVar) {
        this.f286568a = list;
        this.f286569b = lVar;
    }

    public final int getItemCount() {
        return this.f286568a.size();
    }

    public final int getItemViewType(int i) {
        return ((C102666k) this.f286568a.get(i)).f286572c - 1;
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        C102666k kVar = (C102666k) this.f286568a.get(ghVar.getBindingAdapterPosition());
        int i2 = kVar.f286572c;
        if (i2 == 2) {
            ((C102664i) ghVar).f286567a.setText(R.string.discover_feed_language_preference_suggested_header);
        } else if (i2 == 3) {
            ((C102664i) ghVar).f286567a.setText(R.string.discover_feed_language_preference_all_header);
        } else {
            String str = kVar.f286570a;
            C8506p pVar = kVar.f286571b;
            if (str != null && pVar != null) {
                C102663h hVar = (C102663h) ghVar;
                hVar.f286564a.setText(pVar.f29513a);
                hVar.f286565b.setText(Locale.forLanguageTag(str).getDisplayName());
                String str2 = this.f286569b.f286581i;
                if (str2 != null && !str2.isEmpty()) {
                    hVar.mo93369a(str.equals(this.f286569b.f286581i));
                }
            }
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new C102664i(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.discover_feed_language_preference_section_header, viewGroup, false));
        }
        C102663h hVar = new C102663h(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.discover_feed_language_preference, viewGroup, false));
        hVar.itemView.setOnClickListener(new C102662g(this, hVar));
        return hVar;
    }
}
