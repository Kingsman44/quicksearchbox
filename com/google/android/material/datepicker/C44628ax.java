package com.google.android.material.datepicker;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.ax */
/* compiled from: PG */
final class C44628ax extends C0640fb {

    /* renamed from: a */
    public final C44649v f116269a;

    public C44628ax(C44649v vVar) {
        this.f116269a = vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47865a(int i) {
        return i - this.f116269a.f116319b.f116188a.f116200c;
    }

    public final int getItemCount() {
        return this.f116269a.f116319b.f116193f;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C44627aw awVar = (C44627aw) ghVar;
        int i2 = this.f116269a.f116319b.f116188a.f116200c + i;
        String string = awVar.f116268a.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        TextView textView = awVar.f116268a;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", new Object[]{valueOf}));
        awVar.f116268a.setContentDescription(String.format(string, new Object[]{valueOf}));
        C44631d dVar = this.f116269a.f116321d;
        Calendar f = C44625au.m79085f();
        C44630c cVar = f.get(1) == i2 ? dVar.f116284f : dVar.f116282d;
        for (Long longValue : this.f116269a.f116318a.mo47802d()) {
            f.setTimeInMillis(longValue.longValue());
            if (f.get(1) == i2) {
                cVar = dVar.f116283e;
            }
        }
        cVar.mo47866b(awVar.f116268a);
        awVar.f116268a.setOnClickListener(new C44626av(this, i2));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44627aw((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
