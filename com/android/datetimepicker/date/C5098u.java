package com.android.datetimepicker.date;

import android.content.Context;
import android.text.format.Time;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.android.datetimepicker.C5104e;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* renamed from: com.android.datetimepicker.date.u */
/* compiled from: PG */
public abstract class C5098u extends BaseAdapter implements C5071aa {

    /* renamed from: a */
    protected final C5086i f16267a;

    /* renamed from: b */
    public C5097t f16268b = new C5097t(System.currentTimeMillis());

    /* renamed from: c */
    private final Context f16269c;

    public C5098u(Context context, C5086i iVar) {
        this.f16269c = context;
        this.f16267a = iVar;
        this.f16268b = iVar.mo10082a();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public abstract C5072ab mo10072a(Context context);

    /* renamed from: b */
    public final void mo10054b(C5097t tVar) {
        ((C5081d) this.f16267a).f16226s.mo10050a();
        C5086i iVar = this.f16267a;
        int i = tVar.f16263a;
        int i2 = tVar.f16264b;
        int i3 = tVar.f16265c;
        C5081d dVar = (C5081d) iVar;
        dVar.f16209b.set(1, i);
        dVar.f16209b.set(2, i2);
        dVar.f16209b.set(5, i3);
        dVar.mo10085d();
        dVar.mo10084c(dVar.f16208a.getDialog().getContext(), true);
        this.f16268b = tVar;
        notifyDataSetChanged();
    }

    public final int getCount() {
        C5081d dVar = (C5081d) this.f16267a;
        return ((dVar.f16223p - dVar.f16222o) + 1) * 12;
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C5072ab abVar;
        HashMap hashMap;
        int i2 = 0;
        if (view != null) {
            abVar = (C5072ab) view;
            hashMap = (HashMap) abVar.getTag();
        } else {
            abVar = mo10072a(this.f16269c);
            abVar.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            abVar.setClickable(true);
            abVar.f16157E = this;
            abVar.f16162J = false;
            hashMap = null;
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        hashMap.clear();
        int i3 = i % 12;
        int i4 = (i / 12) + ((C5081d) this.f16267a).f16222o;
        C5097t tVar = this.f16268b;
        int i5 = (tVar.f16263a == i4 && tVar.f16264b == i3) ? tVar.f16265c : -1;
        abVar.f16156D = 6;
        abVar.requestLayout();
        hashMap.put("selected_day", Integer.valueOf(i5));
        hashMap.put("year", Integer.valueOf(i4));
        hashMap.put("month", Integer.valueOf(i3));
        hashMap.put("week_start", Integer.valueOf(((C5081d) this.f16267a).f16221n));
        if (hashMap.containsKey("month") || hashMap.containsKey("year")) {
            abVar.setTag(hashMap);
            if (hashMap.containsKey("height")) {
                int intValue = ((Integer) hashMap.get("height")).intValue();
                abVar.f16188s = intValue;
                if (intValue < 10) {
                    abVar.f16188s = 10;
                }
            }
            if (hashMap.containsKey("selected_day")) {
                abVar.f16190u = ((Integer) hashMap.get("selected_day")).intValue();
            }
            abVar.f16195z = hashMap.containsKey("show_wk_num") && ((Integer) hashMap.get("show_wk_num")).intValue() != 0;
            abVar.f16184o = ((Integer) hashMap.get("month")).intValue();
            abVar.f16185p = ((Integer) hashMap.get("year")).intValue();
            Time time = new Time(C5072ab.m13935i());
            time.setToNow();
            abVar.f16189t = false;
            abVar.f16191v = -1;
            abVar.f16153A.set(2, abVar.f16184o);
            abVar.f16153A.set(1, abVar.f16185p);
            abVar.f16153A.set(5, 1);
            abVar.f16163K = abVar.f16153A.get(7);
            if (hashMap.containsKey("week_start")) {
                abVar.f16192w = ((Integer) hashMap.get("week_start")).intValue();
            } else {
                abVar.f16192w = abVar.f16153A.getFirstDayOfWeek();
            }
            abVar.f16194y = C5104e.m13981b(abVar.f16184o, abVar.f16185p);
            int i6 = 0;
            while (i6 < abVar.f16194y) {
                i6++;
                if (abVar.f16185p == time.year && abVar.f16184o == time.month && i6 == time.monthDay) {
                    abVar.f16189t = true;
                    abVar.f16191v = i6;
                }
            }
            int a = abVar.mo10055a() + abVar.f16194y;
            int i7 = abVar.f16193x;
            int i8 = a / i7;
            if (a % i7 > 0) {
                i2 = 1;
            }
            abVar.f16156D = i8 + i2;
            abVar.f16155C.invalidateRoot();
            abVar.invalidate();
            return abVar;
        }
        throw new InvalidParameterException("You must specify month and year for this view");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
