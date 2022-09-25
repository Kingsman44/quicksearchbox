package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.Html;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument;
import com.google.android.apps.gsa.search.shared.actions.util.C87481c;
import com.google.android.apps.gsa.shared.util.C90769bm;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ar */
/* compiled from: PG */
public final class C93540ar extends C93555bf {

    /* renamed from: a */
    public final C93652i f261185a;

    /* renamed from: w */
    private final AdapterView.OnItemClickListener f261186w = new C93539aq(this);

    /* renamed from: x */
    private final C87481c f261187x;

    public C93540ar(Context context, boolean z) {
        super(context, (AttributeSet) null, 0, z);
        this.f261185a = new C93652i(context, new ArrayList());
        this.f261187x = new C87481c(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo87734a() {
        mo87968v(this.f261185a, this.f261186w);
    }

    /* renamed from: b */
    public final void mo87951b(Calendar calendar) {
        ((DateArgument) this.f261447m).mo81294b(calendar.get(5), calendar.get(2) + 1, calendar.get(1));
    }

    /* renamed from: f */
    public final void mo87732f() {
        super.mo87732f();
        DateArgument dateArgument = (DateArgument) this.f261447m;
        this.f261185a.mo88083e();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (dateArgument.mo81263C()) {
            long timeInMillis2 = ((DateArgument) this.f261447m).mo81293a().getTimeInMillis();
            this.f261185a.mo88082d(C87481c.m141993d(this.f261187x.mo81468a(timeInMillis)));
            if (C90769bm.m148270b(timeInMillis2, System.currentTimeMillis()) && C87481c.m141992c(timeInMillis)) {
                mo87970x(this.f261187x.f236309d.f254416a);
                this.f261185a.f261383d = 0;
            } else if (C90769bm.m148271c(timeInMillis2, System.currentTimeMillis())) {
                mo87970x(this.f261187x.f236310e.f254416a);
                if (C87481c.m141992c(timeInMillis)) {
                    this.f261185a.f261383d = 1;
                } else {
                    this.f261185a.f261383d = 0;
                }
            } else {
                String formatDateTime = DateUtils.formatDateTime(getContext(), timeInMillis2, 2578);
                if (dateArgument.mo81275j() != 0) {
                    mo87970x(Html.fromHtml(getResources().getString(R.string.date_in_the_past, new Object[]{formatDateTime})));
                } else {
                    mo87970x(formatDateTime);
                }
                this.f261185a.f261383d = -1;
            }
        } else {
            this.f261185a.mo88082d(C87481c.m141993d(this.f261187x.mo81468a(timeInMillis)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo87952k() {
        return true;
    }
}
