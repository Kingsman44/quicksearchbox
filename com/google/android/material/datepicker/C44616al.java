package com.google.android.material.datepicker;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.datepicker.al */
/* compiled from: PG */
final class C44616al extends C0640fb {

    /* renamed from: a */
    public final C44642o f116255a;

    /* renamed from: b */
    private final CalendarConstraints f116256b;

    /* renamed from: c */
    private final DateSelector f116257c;

    /* renamed from: d */
    private final DayViewDecorator f116258d;

    /* renamed from: e */
    private final int f116259e;

    public C44616al(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, C44642o oVar) {
        Month month = calendarConstraints.f116188a;
        Month month2 = calendarConstraints.f116189b;
        Month month3 = calendarConstraints.f116191d;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (month3.compareTo(month2) <= 0) {
            this.f116259e = (C44613ai.f116243a * C44649v.m79097a(context)) + (C44608ad.m79056e(context, 16843277) ? C44649v.m79097a(context) : 0);
            this.f116256b = calendarConstraints;
            this.f116257c = dateSelector;
            this.f116258d = dayViewDecorator;
            this.f116255a = oVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47857a(Month month) {
        return this.f116256b.f116188a.mo47822b(month);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Month mo47858b(int i) {
        return this.f116256b.f116188a.mo47827g(i);
    }

    public final int getItemCount() {
        return this.f116256b.f116194g;
    }

    public final long getItemId(int i) {
        return this.f116256b.f116188a.mo47827g(i).f116198a.getTimeInMillis();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C44615ak akVar = (C44615ak) ghVar;
        Month g = this.f116256b.f116188a.mo47827g(i);
        akVar.f116253a.setText(g.mo47828h());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) akVar.f116254b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.mo47811a() == null || !g.equals(materialCalendarGridView.mo47811a().f116245b)) {
            C44613ai aiVar = new C44613ai(g, this.f116257c, this.f116256b, this.f116258d);
            materialCalendarGridView.setNumColumns(g.f116201d);
            materialCalendarGridView.setAdapter((ListAdapter) aiVar);
        } else {
            materialCalendarGridView.invalidate();
            C44613ai a = materialCalendarGridView.mo47811a();
            for (Long longValue : a.f116247d) {
                a.mo47850e(materialCalendarGridView, longValue.longValue());
            }
            DateSelector dateSelector = a.f116246c;
            if (dateSelector != null) {
                for (Long longValue2 : dateSelector.mo47802d()) {
                    a.mo47850e(materialCalendarGridView, longValue2.longValue());
                }
                a.f116247d = a.f116246c.mo47802d();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C44614aj(this, materialCalendarGridView));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C44608ad.m79056e(viewGroup.getContext(), 16843277)) {
            return new C44615ak(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0654fp(-1, this.f116259e));
        return new C44615ak(linearLayout, true);
    }
}
