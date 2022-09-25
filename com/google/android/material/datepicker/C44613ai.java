package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.ai */
/* compiled from: PG */
final class C44613ai extends BaseAdapter {

    /* renamed from: a */
    static final int f116243a = C44625au.m79086g((Calendar) null).getMaximum(4);

    /* renamed from: h */
    private static final int f116244h = ((C44625au.m79086g((Calendar) null).getMaximum(5) + C44625au.m79086g((Calendar) null).getMaximum(7)) - 1);

    /* renamed from: b */
    final Month f116245b;

    /* renamed from: c */
    final DateSelector f116246c;

    /* renamed from: d */
    public Collection f116247d;

    /* renamed from: e */
    C44631d f116248e;

    /* renamed from: f */
    final CalendarConstraints f116249f;

    /* renamed from: g */
    final DayViewDecorator f116250g;

    public C44613ai(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f116245b = month;
        this.f116246c = dateSelector;
        this.f116249f = calendarConstraints;
        this.f116250g = dayViewDecorator;
        this.f116247d = dateSelector.mo47802d();
    }

    /* renamed from: f */
    private final void m79066f(TextView textView, long j, int i) {
        C44630c cVar;
        if (textView != null) {
            if (this.f116249f.f116190c.mo47798a(j)) {
                textView.setEnabled(true);
                Iterator it = this.f116246c.mo47802d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C44625au.m79080a(j) == C44625au.m79080a(((Long) it.next()).longValue())) {
                            cVar = this.f116248e.f116280b;
                            break;
                        }
                    } else if (C44625au.m79085f().getTimeInMillis() == j) {
                        cVar = this.f116248e.f116281c;
                    } else {
                        cVar = this.f116248e.f116279a;
                    }
                }
            } else {
                textView.setEnabled(false);
                cVar = this.f116248e.f116285g;
            }
            if (this.f116250g == null || i == -1) {
                cVar.mo47866b(textView);
                return;
            }
            textView.getContext();
            this.f116245b.mo47823c(i);
            Month month = this.f116245b;
            int i2 = month.f116200c;
            int i3 = month.f116199b;
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo47846a(int i) {
        return mo47847b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo47847b() {
        Month month = this.f116245b;
        int i = this.f116249f.f116192e;
        int i2 = month.f116198a.get(7);
        if (i <= 0) {
            i = month.f116198a.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + month.f116201d : i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo47848c() {
        return (mo47847b() + this.f116245b.f116202e) - 1;
    }

    /* renamed from: d */
    public final Long getItem(int i) {
        if (i < mo47847b() || i > mo47848c()) {
            return null;
        }
        return Long.valueOf(this.f116245b.mo47823c((i - mo47847b()) + 1));
    }

    /* renamed from: e */
    public final void mo47850e(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m79034d(j).equals(this.f116245b)) {
            Calendar e = C44625au.m79084e(this.f116245b.f116198a);
            e.setTimeInMillis(j);
            int i = e.get(5);
            m79066f((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.mo47811a().mo47846a(i) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    public final int getCount() {
        return f116244h;
    }

    public final long getItemId(int i) {
        return (long) (i / this.f116245b.f116201d);
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            android.content.Context r0 = r9.getContext()
            com.google.android.material.datepicker.d r1 = r6.f116248e
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.d r1 = new com.google.android.material.datepicker.d
            r1.<init>(r0)
            r6.f116248e = r1
        L_0x000f:
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r8 != 0) goto L_0x0027
            android.content.Context r8 = r9.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r0 = 2131626036(0x7f0e0834, float:1.8879297E38)
            android.view.View r8 = r8.inflate(r0, r9, r1)
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r8 = r6.mo47847b()
            int r8 = r7 - r8
            if (r8 < 0) goto L_0x0093
            com.google.android.material.datepicker.Month r9 = r6.f116245b
            int r2 = r9.f116202e
            if (r8 < r2) goto L_0x0036
            goto L_0x0093
        L_0x0036:
            r2 = 1
            int r8 = r8 + r2
            r0.setTag(r9)
            android.content.res.Resources r9 = r0.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            java.util.Locale r9 = r9.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r9 = java.lang.String.format(r9, r4, r3)
            r0.setText(r9)
            com.google.android.material.datepicker.Month r9 = r6.f116245b
            long r3 = r9.mo47823c(r8)
            boolean r9 = com.google.android.material.datepicker.C44636i.m79095b(r3)
            if (r9 == 0) goto L_0x0076
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r9 = com.google.android.material.datepicker.C44625au.m79081b(r5, r9)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r3)
            java.lang.String r9 = r9.format(r5)
            goto L_0x0089
        L_0x0076:
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r9 = com.google.android.material.datepicker.C44625au.m79081b(r5, r9)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r3)
            java.lang.String r9 = r9.format(r5)
        L_0x0089:
            r0.setContentDescription(r9)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x009c
        L_0x0093:
            r8 = 8
            r0.setVisibility(r8)
            r0.setEnabled(r1)
            r8 = -1
        L_0x009c:
            java.lang.Long r7 = r6.getItem(r7)
            if (r7 == 0) goto L_0x00a9
            long r1 = r7.longValue()
            r6.m79066f(r0, r1, r8)
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C44613ai.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
