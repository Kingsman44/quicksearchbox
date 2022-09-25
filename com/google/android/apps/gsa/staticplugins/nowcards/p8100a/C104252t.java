package com.google.android.apps.gsa.staticplugins.nowcards.p8100a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9259en;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.a.t */
/* compiled from: PG */
public final class C104252t extends C104348l {
    public C104252t(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_weather_row, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_weather_row, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        View view = this.f290311f;
        C9278v vVar = this.f290310e;
        C9259en enVar = vVar.f32201h;
        if (enVar == null) {
            enVar = C9259en.f32016i;
        }
        if ((enVar.f32018a & 1) != 0) {
            C91985d.m150960g(view, R.id.card_title, enVar.f32019b);
        }
        if ((enVar.f32018a & 4) != 0) {
            C91985d.m150960g(view, R.id.temperature, enVar.f32021d);
        }
        if ((enVar.f32018a & 8) != 0) {
            C91985d.m150960g(view, R.id.conditions, enVar.f32022e);
        }
        if ((enVar.f32018a & 16) != 0) {
            C91985d.m150960g(view, R.id.high_temp, enVar.f32023f);
        }
        if ((enVar.f32018a & 32) != 0) {
            C91985d.m150960g(view, R.id.low_temp, enVar.f32024g);
        }
        int i = enVar.f32018a;
        if (!((i & 16) == 0 && (i & 32) == 0)) {
            view.findViewById(R.id.high_and_low).setVisibility(0);
        }
        C9259en enVar2 = vVar.f32201h;
        if (enVar2 == null) {
            enVar2 = C9259en.f32016i;
        }
        if (!enVar2.f32020c.isEmpty()) {
            C9259en enVar3 = vVar.f32201h;
            if (enVar3 == null) {
                enVar3 = C9259en.f32016i;
            }
            mo94117k(view, R.id.current_weather_icon, enVar3.f32020c);
            return;
        }
        view.findViewById(R.id.current_weather_icon).setVisibility(4);
    }
}
