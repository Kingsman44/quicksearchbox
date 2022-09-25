package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p033v7.widget.C0628eq;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.google.android.material.datepicker.v */
/* compiled from: PG */
public final class C44649v extends C44618an {

    /* renamed from: a */
    public DateSelector f116318a;

    /* renamed from: b */
    public CalendarConstraints f116319b;

    /* renamed from: c */
    public Month f116320c;

    /* renamed from: d */
    public C44631d f116321d;

    /* renamed from: e */
    public RecyclerView f116322e;

    /* renamed from: f */
    public RecyclerView f116323f;

    /* renamed from: g */
    public View f116324g;

    /* renamed from: h */
    public int f116325h;

    /* renamed from: j */
    private int f116326j;

    /* renamed from: k */
    private DayViewDecorator f116327k;

    /* renamed from: l */
    private View f116328l;

    /* renamed from: m */
    private View f116329m;

    /* renamed from: n */
    private View f116330n;

    /* renamed from: a */
    static int m79097a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    /* renamed from: f */
    private final void m79098f(int i) {
        this.f116323f.post(new C44639l(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final LinearLayoutManager mo47881b() {
        return (LinearLayoutManager) this.f116323f.mLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo47882c(Month month) {
        C44616al alVar = (C44616al) this.f116323f.mAdapter;
        int a = alVar.mo47857a(month);
        int a2 = a - alVar.mo47857a(this.f116320c);
        int abs = Math.abs(a2);
        this.f116320c = month;
        if (abs <= 3) {
            m79098f(a);
        } else if (a2 > 0) {
            this.f116323f.scrollToPosition(a - 3);
            m79098f(a);
        } else {
            this.f116323f.scrollToPosition(a + 3);
            m79098f(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo47883d(int i) {
        this.f116325h = i;
        if (i == 2) {
            RecyclerView recyclerView = this.f116322e;
            recyclerView.mLayout.scrollToPosition(((C44628ax) recyclerView.mAdapter).mo47865a(this.f116320c.f116200c));
            this.f116330n.setVisibility(0);
            this.f116324g.setVisibility(8);
            this.f116328l.setVisibility(8);
            this.f116329m.setVisibility(8);
            return;
        }
        this.f116330n.setVisibility(8);
        this.f116324g.setVisibility(0);
        this.f116328l.setVisibility(0);
        this.f116329m.setVisibility(0);
        mo47882c(this.f116320c);
    }

    /* renamed from: e */
    public final void mo47859e(C44617am amVar) {
        this.f116260i.add(amVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f116326j = bundle.getInt("THEME_RES_ID_KEY");
        this.f116318a = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f116319b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f116327k = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f116320c = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f116326j);
        this.f116321d = new C44631d(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f116319b.f116188a;
        boolean e = C44608ad.m79056e(contextThemeWrapper, 16843277);
        View inflate = cloneInContext.inflate(true != e ? R.layout.mtrl_calendar_horizontal : R.layout.mtrl_calendar_vertical, viewGroup, false);
        Resources resources = requireContext().getResources();
        inflate.setMinimumHeight(resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height) + (C44613ai.f116243a * resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + ((C44613ai.f116243a - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        C2043bi.m5526T(gridView, new C44640m());
        int i = this.f116319b.f116192e;
        gridView.setAdapter(i > 0 ? new C44638k(i) : new C44638k());
        gridView.setNumColumns(month.f116201d);
        gridView.setEnabled(false);
        this.f116323f = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f116323f.setLayoutManager(new C44641n(this, getContext(), e ? 1 : 0, e));
        this.f116323f.setTag("MONTHS_VIEW_GROUP_TAG");
        C44616al alVar = new C44616al(contextThemeWrapper, this.f116318a, this.f116319b, this.f116327k, new C44642o(this));
        this.f116323f.setAdapter(alVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f116322e = recyclerView;
        if (recyclerView != null) {
            recyclerView.mHasFixedSize = true;
            recyclerView.setLayoutManager(new GridLayoutManager(contextThemeWrapper, integer, 1));
            this.f116322e.setAdapter(new C44628ax(this));
            this.f116322e.addItemDecoration$ar$ds(new C44643p(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C2043bi.m5526T(materialButton, new C44644q(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f116328l = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f116329m = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f116330n = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f116324g = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            mo47883d(1);
            materialButton.setText(this.f116320c.mo47828h());
            this.f116323f.addOnScrollListener(new C44645r(this, alVar, materialButton));
            materialButton.setOnClickListener(new C44646s(this));
            this.f116329m.setOnClickListener(new C44647t(this, alVar));
            this.f116328l.setOnClickListener(new C44648u(this, alVar));
        }
        if (!C44608ad.m79056e(contextThemeWrapper, 16843277)) {
            new C0628eq().mo3197g(this.f116323f);
        }
        this.f116323f.scrollToPosition(alVar.mo47857a(this.f116320c));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f116326j);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f116318a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f116319b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f116327k);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f116320c);
    }
}
