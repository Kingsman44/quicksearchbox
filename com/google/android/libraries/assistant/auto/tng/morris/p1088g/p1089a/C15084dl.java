package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.content.Context;
import android.support.p033v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.dl */
/* compiled from: PG */
public final class C15084dl implements C15006ao {

    /* renamed from: a */
    public final Context f45245a;

    /* renamed from: b */
    public final C14986h f45246b;

    /* renamed from: c */
    public final C69464a f45247c;

    /* renamed from: d */
    public final C14132bf f45248d;

    /* renamed from: e */
    public final C86124t f45249e;

    /* renamed from: f */
    public View f45250f;

    /* renamed from: g */
    public SwitchCompat f45251g;

    /* renamed from: h */
    public SwitchCompat f45252h;

    /* renamed from: i */
    public SwitchCompat f45253i;

    /* renamed from: j */
    public ViewGroup f45254j;

    /* renamed from: k */
    public RadioButton f45255k;

    /* renamed from: l */
    public RadioButton f45256l;

    /* renamed from: m */
    public RadioButton f45257m;

    /* renamed from: n */
    public View f45258n;

    /* renamed from: o */
    public TextView f45259o;

    /* renamed from: p */
    public TextView f45260p;

    public C15084dl(Context context, C14986h hVar, C69464a aVar, C14132bf bfVar, C86124t tVar) {
        this.f45245a = context;
        this.f45246b = hVar;
        this.f45247c = aVar;
        this.f45248d = bfVar;
        this.f45249e = tVar;
    }

    /* renamed from: a */
    public final View mo21891a() {
        View view = this.f45250f;
        view.getClass();
        return view;
    }

    /* renamed from: b */
    public final void mo21943b(boolean z) {
        if (z) {
            SwitchCompat switchCompat = this.f45253i;
            switchCompat.getClass();
            switchCompat.setEnabled(true);
            SwitchCompat switchCompat2 = this.f45253i;
            switchCompat2.getClass();
            switchCompat2.setTextAppearance(R.style.DrivingSafeSettingsTextStyle);
        } else if (this.f45249e.mo79746e(C90051dc.f248777L)) {
            SwitchCompat switchCompat3 = this.f45253i;
            switchCompat3.getClass();
            switchCompat3.setEnabled(false);
            SwitchCompat switchCompat4 = this.f45253i;
            switchCompat4.getClass();
            switchCompat4.setTextAppearance(R.style.DrivingSafeSettingsDisabledTextStyle);
        }
    }

    /* renamed from: c */
    public final void mo21944c(boolean z) {
        if (!z) {
            View view = this.f45258n;
            view.getClass();
            view.setVisibility(8);
            ViewGroup viewGroup = this.f45254j;
            viewGroup.getClass();
            viewGroup.setVisibility(8);
        } else if (this.f45249e.mo79746e(C90051dc.f248827ai)) {
            View view2 = this.f45258n;
            view2.getClass();
            view2.setVisibility(0);
            ViewGroup viewGroup2 = this.f45254j;
            viewGroup2.getClass();
            viewGroup2.setVisibility(0);
        }
    }
}
