package com.google.android.libraries.home.coreui.devicetile;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23643e;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23644f;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23649k;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23651m;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bq */
/* compiled from: PG */
public final class C23698bq implements C23638a {

    /* renamed from: a */
    public C23656ab f64816a;

    /* renamed from: b */
    private Drawable f64817b;

    /* renamed from: c */
    private C23638a f64818c;

    /* renamed from: d */
    private boolean f64819d;

    static {
        ViewConfiguration.getLongPressTimeout();
    }

    /* renamed from: a */
    public final void mo28964a(Control control, int i) {
        C69664n.m101061g(control, "control");
        C23656ab abVar = this.f64816a;
        C23656ab abVar2 = null;
        if (abVar == null) {
            C69664n.m101065k("cvh");
            abVar = null;
        }
        CharSequence charSequence = control.f64890h;
        Set set = C23656ab.f64704a;
        int i2 = 0;
        abVar.mo29003c(charSequence, false);
        C23656ab abVar3 = this.f64816a;
        if (abVar3 == null) {
            C69664n.m101065k("cvh");
            abVar3 = null;
        }
        Drawable background = ((C23674at) abVar3).f64761l.getBackground();
        C69664n.m101059e(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        Drawable findDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(R.id.clip_layer);
        C69664n.m101060f(findDrawableByLayerId, "layerDrawable.findDrawab…yLayerId(R.id.clip_layer)");
        this.f64817b = findDrawableByLayerId;
        C23642d dVar = control.f64889g;
        C69664n.m101059e(dVar, "null cannot be cast to non-null type com.google.android.libraries.home.coreui.devicetile.templates.TemperatureControlTemplate");
        C23651m mVar = (C23651m) dVar;
        C23649k kVar = mVar.f64688c;
        C23649k kVar2 = mVar.f64689d;
        C23642d dVar2 = mVar.f64687b;
        if (!C69664n.m101066l(dVar2, C23644f.f64662a) && !C69664n.m101066l(dVar2, C23643e.f64661a)) {
            C23656ab abVar4 = this.f64816a;
            if (abVar4 == null) {
                C69664n.m101065k("cvh");
                abVar4 = null;
            }
            C23638a aVar = this.f64818c;
            C23656ab abVar5 = this.f64816a;
            if (abVar5 == null) {
                C69664n.m101065k("cvh");
                abVar5 = null;
            }
            C23638a a = ((C23674at) abVar5).f64757h.mo29027a((C23638a) null, control.f64888f, dVar2, control.f64885c);
            ((C23674at) abVar4).mo29026k(aVar, a, kVar2.f64685o);
            this.f64818c = a;
        } else {
            this.f64819d = (kVar2 == C23649k.UNKNOWN || kVar2 == C23649k.OFF || kVar2 == C23649k.IDLE) ? false : true;
            Drawable drawable = this.f64817b;
            if (drawable == null) {
                C69664n.m101065k("clipLayer");
                drawable = null;
            }
            if (true == this.f64819d) {
                i2 = 10000;
            }
            drawable.setLevel(i2);
            C23656ab abVar6 = this.f64816a;
            if (abVar6 == null) {
                C69664n.m101065k("cvh");
                abVar6 = null;
            }
            ((C23674at) abVar6).f64761l.setOnClickListener(new C23697bp(this, mVar, control));
        }
        C23656ab abVar7 = this.f64816a;
        if (abVar7 == null) {
            C69664n.m101065k("cvh");
        } else {
            abVar2 = abVar7;
        }
        abVar2.mo29006f(this.f64819d, kVar2.f64685o);
    }

    /* renamed from: b */
    public final void mo28965b(C23656ab abVar) {
        this.f64816a = abVar;
        TextView textView = (TextView) ((C23674at) abVar).f64761l.findViewById(R.id.set_point);
    }
}
