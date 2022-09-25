package com.google.android.libraries.home.coreui.devicetile;

import android.content.res.Resources;
import android.support.p033v7.app.C0391l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.C23736k;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bl */
/* compiled from: PG */
public final class C23693bl implements C23638a {

    /* renamed from: a */
    public C23656ab f64807a;

    /* renamed from: c */
    public static final void m44177c(C23656ab abVar) {
        C23674at atVar = (C23674at) abVar;
        C0391l lVar = (C0391l) atVar.f64759j.mo5672a();
        Resources resources = atVar.f64764o.getResources();
        lVar.setTitle(resources.getString(R.string.controls_error_removed_title));
        lVar.mo1301g(resources.getString(R.string.controls_error_removed_message, new Object[]{atVar.f64766q.getText()}));
        lVar.setNegativeButton(R.string.controls_dialog_button_cancel, C23692bk.f64806a);
        lVar.create().show();
    }

    /* renamed from: a */
    public final void mo28964a(Control control, int i) {
        int i2;
        C69664n.m101061g(control, "control");
        C23736k kVar = control.f64888f;
        C23736k kVar2 = C23736k.UNKNOWN;
        int ordinal = kVar.ordinal();
        C23656ab abVar = null;
        if (ordinal == 2) {
            C23656ab abVar2 = this.f64807a;
            if (abVar2 == null) {
                C69664n.m101065k("cvh");
                abVar2 = null;
            }
            ((C23674at) abVar2).f64761l.setOnClickListener(new C23689bh(this));
            C23656ab abVar3 = this.f64807a;
            if (abVar3 == null) {
                C69664n.m101065k("cvh");
                abVar3 = null;
            }
            ((C23674at) abVar3).f64761l.setOnLongClickListener(new C23690bi(this));
            i2 = R.string.controls_error_removed;
        } else if (ordinal == 3) {
            i2 = R.string.controls_error_generic;
        } else if (ordinal != 4) {
            C23656ab abVar4 = this.f64807a;
            if (abVar4 == null) {
                C69664n.m101065k("cvh");
                abVar4 = null;
            }
            ((C23674at) abVar4).f64775z = true;
            C23656ab abVar5 = this.f64807a;
            if (abVar5 == null) {
                C69664n.m101065k("cvh");
                abVar5 = null;
            }
            ((C23674at) abVar5).f64761l.setOnClickListener(new C23691bj(this, control));
            i2 = R.string.loading;
        } else {
            i2 = R.string.controls_error_timeout;
        }
        C23656ab abVar6 = this.f64807a;
        if (abVar6 == null) {
            C69664n.m101065k("cvh");
            abVar6 = null;
        }
        C23656ab abVar7 = this.f64807a;
        if (abVar7 == null) {
            C69664n.m101065k("cvh");
            abVar7 = null;
        }
        String string = ((C23674at) abVar7).f64764o.getString(i2);
        C69664n.m101060f(string, "cvh.context.getString(msg)");
        abVar6.mo29003c(string, false);
        C23656ab abVar8 = this.f64807a;
        if (abVar8 == null) {
            C69664n.m101065k("cvh");
        } else {
            abVar = abVar8;
        }
        abVar.mo29006f(false, i);
    }

    /* renamed from: b */
    public final void mo28965b(C23656ab abVar) {
        this.f64807a = abVar;
    }
}
