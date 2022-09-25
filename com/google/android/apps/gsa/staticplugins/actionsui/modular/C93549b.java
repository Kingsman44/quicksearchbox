package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.Html;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.TextView;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.b */
/* compiled from: PG */
public final class C93549b extends C93555bf {

    /* renamed from: a */
    public final C93652i f261204a = new C93652i(getContext(), new ArrayList());

    /* renamed from: w */
    private final AdapterView.OnItemClickListener f261205w = new C93508a(this);

    /* renamed from: x */
    private final C91109h f261206x = new C91109h(getContext().getResources().getStringArray(R.array.edit_reminder_time)[5], (Object) null, true);

    public C93549b(Context context, boolean z) {
        super(context, (AttributeSet) null, 0, z);
    }

    /* renamed from: E */
    private final String m154276E(C55296nc ncVar) {
        if ((ncVar.f145665a & 4) != 0) {
            return ncVar.f145668d;
        }
        C55401r rVar = ncVar.f145666b;
        if (rVar == null) {
            rVar = C55401r.f145976e;
        }
        return m154277F(rVar);
    }

    /* renamed from: F */
    private final String m154277F(C55401r rVar) {
        return DateUtils.formatDateTime(getContext(), ((AbsoluteTimeArgument) this.f261447m).mo81249b(rVar), 2561);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87734a() {
        AbsoluteTimeArgument absoluteTimeArgument = (AbsoluteTimeArgument) this.f261447m;
        if (!absoluteTimeArgument.mo81256i()) {
            return;
        }
        if (!absoluteTimeArgument.mo81254g()) {
            mo87962b();
        } else {
            mo87968v(this.f261204a, this.f261205w);
        }
    }

    /* renamed from: b */
    public final void mo87962b() {
        this.f261451q.mo87961i(this.f261447m, "timepicker_tag");
    }

    /* renamed from: f */
    public final void mo87732f() {
        int j;
        TextView textView;
        super.mo87732f();
        AbsoluteTimeArgument absoluteTimeArgument = (AbsoluteTimeArgument) this.f261447m;
        this.f261204a.mo88083e();
        if (absoluteTimeArgument.mo81254g()) {
            for (C55296nc ncVar : absoluteTimeArgument.mo81252e()) {
                this.f261204a.mo88081c(new C91109h(m154276E(ncVar), ncVar, false));
            }
            this.f261204a.mo88081c(this.f261206x);
            if (absoluteTimeArgument.mo81263C()) {
                C55296nc d = absoluteTimeArgument.mo81251d();
                if (!absoluteTimeArgument.mo81262B() && (j = absoluteTimeArgument.mo81275j()) != 0) {
                    if (j == 1) {
                        mo87970x(Html.fromHtml(getResources().getString(R.string.date_in_the_past, new Object[]{m154276E(absoluteTimeArgument.mo81251d())})));
                    } else if (j == 5) {
                        mo87970x(Html.fromHtml(getResources().getString(R.string.time_too_soon, new Object[]{m154276E(absoluteTimeArgument.mo81251d())})));
                    }
                } else if ((d.f145665a & 4) != 0) {
                    mo87970x(d.f145668d);
                } else {
                    C55401r rVar = d.f145666b;
                    if (rVar == null) {
                        rVar = C55401r.f145976e;
                    }
                    mo87970x(m154277F(rVar));
                }
                AbsoluteTimeArgument absoluteTimeArgument2 = (AbsoluteTimeArgument) this.f261447m;
                if (!absoluteTimeArgument2.mo81254g()) {
                    this.f261204a.f261383d = -1;
                } else {
                    int indexOf = absoluteTimeArgument2.mo81252e().indexOf(absoluteTimeArgument2.mo81251d());
                    if (indexOf != -1) {
                        this.f261204a.f261383d = indexOf;
                    } else {
                        this.f261204a.f261383d = -1;
                    }
                }
            }
        } else if (absoluteTimeArgument.mo81263C()) {
            int j2 = absoluteTimeArgument.mo81275j();
            if (j2 != 0) {
                if (j2 == 1) {
                    mo87970x(Html.fromHtml(getResources().getString(R.string.date_in_the_past, new Object[]{m154276E(absoluteTimeArgument.mo81251d())})));
                } else if (j2 == 5) {
                    mo87970x(Html.fromHtml(getResources().getString(R.string.time_too_soon, new Object[]{m154276E(absoluteTimeArgument.mo81251d())})));
                }
            } else if (!this.f261449o || !absoluteTimeArgument.mo81255h()) {
                mo87970x(m154276E(absoluteTimeArgument.mo81251d()));
            } else {
                C55401r rVar2 = absoluteTimeArgument.mo81251d().f145666b;
                if (rVar2 == null) {
                    rVar2 = C55401r.f145976e;
                }
                Calendar instance = Calendar.getInstance();
                instance.set(13, rVar2.f145981d);
                instance.set(12, rVar2.f145980c);
                instance.set(11, rVar2.f145979b);
                String format = new SimpleDateFormat("a", Locale.US).format(new Date(instance.getTimeInMillis()));
                String format2 = new SimpleDateFormat("h:mm", Locale.US).format(new Date(instance.getTimeInMillis()));
                if (!(this.f261221e == null || (textView = this.f261220d) == null)) {
                    textView.setVisibility(0);
                    this.f261220d.setText(format2);
                    this.f261221e.setVisibility(0);
                    this.f261221e.setText(format);
                    this.f261218b.setVisibility(8);
                    this.f261219c.setVisibility(8);
                }
            }
        }
        mo87731e(absoluteTimeArgument.mo81256i());
    }

    /* renamed from: k */
    public final boolean mo87952k() {
        AbsoluteTimeArgument absoluteTimeArgument = (AbsoluteTimeArgument) this.f261447m;
        return absoluteTimeArgument.mo81254g() && absoluteTimeArgument.mo81256i();
    }
}
