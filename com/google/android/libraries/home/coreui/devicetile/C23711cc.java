package com.google.android.libraries.home.coreui.devicetile;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.cc */
/* compiled from: PG */
public final class C23711cc implements C23638a {

    /* renamed from: a */
    public C23642d f64855a;

    /* renamed from: b */
    public Control f64856b;

    /* renamed from: c */
    public C71422aw f64857c;

    /* renamed from: d */
    public boolean f64858d;

    /* renamed from: e */
    public int f64859e;

    /* renamed from: f */
    private Drawable f64860f;

    /* renamed from: g */
    private C23656ab f64861g;

    /* renamed from: a */
    public final void mo28964a(Control control, int i) {
        C69664n.m101061g(control, "control");
        this.f64856b = control;
        this.f64859e = i;
        C23656ab abVar = this.f64861g;
        C23656ab abVar2 = null;
        if (abVar == null) {
            C69664n.m101065k("cvh");
            abVar = null;
        }
        CharSequence charSequence = control.f64890h;
        Set set = C23656ab.f64704a;
        int i2 = 0;
        abVar.mo29003c(charSequence, false);
        this.f64855a = control.f64889g;
        C23656ab abVar3 = this.f64861g;
        if (abVar3 == null) {
            C69664n.m101065k("cvh");
            abVar3 = null;
        }
        Drawable background = ((C23674at) abVar3).f64761l.getBackground();
        C69664n.m101059e(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        Drawable findDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(R.id.clip_layer);
        C69664n.m101060f(findDrawableByLayerId, "ld.findDrawableByLayerId(R.id.clip_layer)");
        this.f64860f = findDrawableByLayerId;
        if (findDrawableByLayerId == null) {
            C69664n.m101065k("clipLayer");
            findDrawableByLayerId = null;
        }
        if (true == mo29059c()) {
            i2 = 10000;
        }
        findDrawableByLayerId.setLevel(i2);
        C23656ab abVar4 = this.f64861g;
        if (abVar4 == null) {
            C69664n.m101065k("cvh");
        } else {
            abVar2 = abVar4;
        }
        abVar2.mo29006f(mo29059c(), i);
    }

    /* renamed from: b */
    public final void mo28965b(C23656ab abVar) {
        this.f64861g = abVar;
        C23674at atVar = (C23674at) abVar;
        this.f64857c = C71423ax.m104197b(atVar.f64755f);
        atVar.f64761l.setOnClickListener(new C23710cb(abVar, this));
    }

    /* renamed from: c */
    public final boolean mo29059c() {
        return this.f64859e > 0 || this.f64858d;
    }
}
