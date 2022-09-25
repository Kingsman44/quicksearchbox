package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115437g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.r */
/* compiled from: PG */
public final class C115822r extends C0640fb {

    /* renamed from: a */
    public C58485gu f321213a = C58485gu.m89845m();

    /* renamed from: b */
    public String f321214b = BuildConfig.FLAVOR;

    /* renamed from: c */
    private final Context f321215c;

    /* renamed from: d */
    private final C115820p f321216d;

    public C115822r(Context context, C115820p pVar) {
        this.f321215c = context;
        this.f321216d = pVar;
    }

    public final int getItemCount() {
        return this.f321213a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        String str;
        C115821q qVar = (C115821q) ghVar;
        String str2 = ((C115437g) this.f321213a.get(i)).f320279c;
        TextView textView = qVar.f321211a;
        if (!str2.isEmpty()) {
            str = str2;
        } else {
            str = this.f321215c.getString(R.string.omp_speakr_original_language);
        }
        textView.setText(str);
        boolean equals = ((C115437g) this.f321213a.get(i)).f320278b.equals(this.f321214b);
        ((ImageView) qVar.itemView.findViewById(R.id.selected_icon)).setVisibility(true != equals ? 4 : 0);
        qVar.f321211a.setContentDescription(String.valueOf(str2).concat(true != equals ? BuildConfig.FLAVOR : " selected"));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f321215c).inflate(R.layout.speakr_language_selection_item, viewGroup, false);
        C115821q qVar = new C115821q(inflate, this.f321216d);
        inflate.setOnClickListener(qVar);
        return qVar;
    }
}
