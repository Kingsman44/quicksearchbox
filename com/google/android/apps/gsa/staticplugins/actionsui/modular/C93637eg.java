package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ListPopupWindow;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.AbsoluteTimeArgument;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55296nc;
import com.google.p4152bb.p4153a.C55401r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.eg */
/* compiled from: PG */
public final class C93637eg extends C93641ek {

    /* renamed from: a */
    public final C93652i f261389a = new C93652i(getContext(), new ArrayList());

    /* renamed from: g */
    private final AdapterView.OnItemClickListener f261390g = new C93636ef(this);

    public C93637eg(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo88095a() {
        AbsoluteTimeArgument absoluteTimeArgument = (AbsoluteTimeArgument) this.f261447m;
        if (!absoluteTimeArgument.mo81256i()) {
            return;
        }
        if (!absoluteTimeArgument.mo81254g()) {
            mo88096b();
            return;
        }
        C93652i iVar = this.f261389a;
        AdapterView.OnItemClickListener onItemClickListener = this.f261390g;
        this.f261399d = new ListPopupWindow(getContext());
        iVar.f261382c = new C93638eh(this, onItemClickListener);
        this.f261399d.setAdapter(iVar);
        this.f261399d.setOnItemClickListener(new C93639ei(this, onItemClickListener));
        this.f261399d.setAnchorView(this.f261397b.getVisibility() != 8 ? this.f261397b : this);
        this.f261399d.setWidth(-2);
        this.f261399d.setHeight(-2);
        this.f261399d.setModal(true);
        this.f261399d.show();
    }

    /* renamed from: b */
    public final void mo88096b() {
        this.f261451q.mo87961i(this.f261447m, "vtimepicker_tag");
    }

    /* renamed from: c */
    public final boolean mo88097c() {
        AbsoluteTimeArgument absoluteTimeArgument = (AbsoluteTimeArgument) this.f261447m;
        return absoluteTimeArgument.mo81254g() && absoluteTimeArgument.mo81256i();
    }

    /* renamed from: f */
    public final void mo87732f() {
        String str;
        super.mo87732f();
        AbsoluteTimeArgument absoluteTimeArgument = (AbsoluteTimeArgument) this.f261447m;
        this.f261389a.mo88083e();
        if (absoluteTimeArgument.mo81263C() && absoluteTimeArgument.mo81275j() == 0) {
            C55401r rVar = absoluteTimeArgument.mo81251d().f145666b;
            if (rVar == null) {
                rVar = C55401r.f145976e;
            }
            Calendar instance = Calendar.getInstance();
            instance.set(13, rVar.f145981d);
            instance.set(12, rVar.f145980c);
            instance.set(11, rVar.f145979b);
            String format = new SimpleDateFormat("a", Locale.US).format(new Date(instance.getTimeInMillis()));
            String format2 = new SimpleDateFormat("h:mm", Locale.US).format(new Date(instance.getTimeInMillis()));
            this.f261397b.setVisibility(0);
            this.f261397b.setText(format2);
            this.f261398c.setVisibility(0);
            this.f261398c.setText(format);
        }
        if (absoluteTimeArgument.mo81254g()) {
            for (C55296nc ncVar : absoluteTimeArgument.mo81252e()) {
                C93652i iVar = this.f261389a;
                if ((ncVar.f145665a & 4) != 0) {
                    str = ncVar.f145668d;
                } else {
                    C55401r rVar2 = ncVar.f145666b;
                    if (rVar2 == null) {
                        rVar2 = C55401r.f145976e;
                    }
                    str = DateUtils.formatDateTime(getContext(), ((AbsoluteTimeArgument) this.f261447m).mo81249b(rVar2), 2561);
                }
                iVar.mo88081c(new C91109h(str, ncVar, false));
            }
            this.f261389a.mo88081c(new C91109h(mo88127l().getStringArray(R.array.edit_reminder_time)[5], (Object) null, true));
            AbsoluteTimeArgument absoluteTimeArgument2 = (AbsoluteTimeArgument) this.f261447m;
            if (!absoluteTimeArgument2.mo81254g()) {
                this.f261389a.f261383d = -1;
            } else {
                int indexOf = absoluteTimeArgument2.mo81252e().indexOf(absoluteTimeArgument2.mo81251d());
                if (indexOf != -1) {
                    this.f261389a.f261383d = indexOf;
                } else {
                    this.f261389a.f261383d = -1;
                }
            }
        }
        mo87731e(absoluteTimeArgument.mo81256i());
    }

    /* renamed from: m */
    public final CharSequence mo88098m() {
        return mo88127l().getString(R.string.valyrian_absolute_time_placeholder);
    }
}
