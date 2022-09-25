package com.android.datetimepicker.date;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.datetimepicker.C5068c;
import com.android.datetimepicker.C5104e;
import com.google.android.googlequicksearchbox.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.android.datetimepicker.date.d */
/* compiled from: PG */
public final class C5081d implements View.OnClickListener, C5086i {

    /* renamed from: x */
    private static final SimpleDateFormat f16206x = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* renamed from: y */
    private static final SimpleDateFormat f16207y = new SimpleDateFormat("dd", Locale.getDefault());

    /* renamed from: a */
    public final C5080c f16208a;

    /* renamed from: b */
    public final Calendar f16209b;

    /* renamed from: c */
    public final HashSet f16210c = new HashSet();

    /* renamed from: d */
    public AccessibleDateAnimator f16211d;

    /* renamed from: e */
    public TextView f16212e;

    /* renamed from: f */
    public LinearLayout f16213f;

    /* renamed from: g */
    public TextView f16214g;

    /* renamed from: h */
    public TextView f16215h;

    /* renamed from: i */
    public TextView f16216i;

    /* renamed from: j */
    public C5095r f16217j;

    /* renamed from: k */
    public C5078ah f16218k;

    /* renamed from: l */
    public Button f16219l;

    /* renamed from: m */
    public int f16220m = -1;

    /* renamed from: n */
    public int f16221n;

    /* renamed from: o */
    public int f16222o;

    /* renamed from: p */
    public int f16223p;

    /* renamed from: q */
    public Calendar f16224q;

    /* renamed from: r */
    public Calendar f16225r;

    /* renamed from: s */
    public C5068c f16226s;

    /* renamed from: t */
    public String f16227t;

    /* renamed from: u */
    public String f16228u;

    /* renamed from: v */
    public String f16229v;

    /* renamed from: w */
    public String f16230w;

    /* renamed from: z */
    private boolean f16231z;

    public C5081d(C5080c cVar) {
        Calendar instance = Calendar.getInstance();
        this.f16209b = instance;
        this.f16221n = instance.getFirstDayOfWeek();
        this.f16222o = 1900;
        this.f16223p = 2100;
        this.f16231z = true;
        this.f16208a = cVar;
    }

    /* renamed from: a */
    public final C5097t mo10082a() {
        return new C5097t(this.f16209b);
    }

    /* renamed from: b */
    public final void mo10083b(Context context, int i) {
        long timeInMillis = this.f16209b.getTimeInMillis();
        if (i == 0) {
            ObjectAnimator d = C5104e.m13983d(this.f16213f, 0.9f, 1.05f);
            if (this.f16231z) {
                d.setStartDelay(500);
                this.f16231z = false;
            }
            this.f16217j.mo10075a();
            if (this.f16220m != i) {
                this.f16213f.setSelected(true);
                this.f16216i.setSelected(false);
                this.f16211d.setDisplayedChild(0);
                this.f16220m = i;
            }
            d.start();
            String formatDateTime = DateUtils.formatDateTime(context, timeInMillis, 16);
            AccessibleDateAnimator accessibleDateAnimator = this.f16211d;
            String str = this.f16227t;
            accessibleDateAnimator.setContentDescription(str + ": " + formatDateTime);
            C5104e.m13984e(this.f16211d, this.f16228u);
        } else if (i == 1) {
            ObjectAnimator d2 = C5104e.m13983d(this.f16216i, 0.85f, 1.1f);
            if (this.f16231z) {
                d2.setStartDelay(500);
                this.f16231z = false;
            }
            this.f16218k.mo10075a();
            if (this.f16220m != i) {
                this.f16213f.setSelected(false);
                this.f16216i.setSelected(true);
                this.f16211d.setDisplayedChild(1);
                this.f16220m = i;
            }
            d2.start();
            String format = f16206x.format(Long.valueOf(timeInMillis));
            AccessibleDateAnimator accessibleDateAnimator2 = this.f16211d;
            String str2 = this.f16229v;
            String valueOf = String.valueOf(format);
            accessibleDateAnimator2.setContentDescription(str2 + ": " + valueOf);
            C5104e.m13984e(this.f16211d, this.f16230w);
        }
    }

    /* renamed from: c */
    public final void mo10084c(Context context, boolean z) {
        TextView textView = this.f16212e;
        if (textView != null) {
            textView.setText(this.f16209b.getDisplayName(7, 2, Locale.getDefault()).toUpperCase(Locale.getDefault()));
        }
        this.f16214g.setText(this.f16209b.getDisplayName(2, 1, Locale.getDefault()).toUpperCase(Locale.getDefault()));
        this.f16215h.setText(f16207y.format(this.f16209b.getTime()));
        this.f16216i.setText(f16206x.format(this.f16209b.getTime()));
        long timeInMillis = this.f16209b.getTimeInMillis();
        this.f16211d.f16146a = timeInMillis;
        this.f16213f.setContentDescription(DateUtils.formatDateTime(context, timeInMillis, 24));
        if (z) {
            C5104e.m13984e(this.f16211d, DateUtils.formatDateTime(context, timeInMillis, 20));
        }
    }

    /* renamed from: d */
    public final void mo10085d() {
        Iterator it = this.f16210c.iterator();
        while (it.hasNext()) {
            ((C5087j) it.next()).mo10075a();
        }
    }

    public final void onClick(View view) {
        this.f16226s.mo10050a();
        if (view.getId() == R.id.date_picker_year) {
            mo10083b(view.getContext(), 1);
        } else if (view.getId() == R.id.date_picker_month_and_day) {
            mo10083b(view.getContext(), 0);
        }
    }
}
