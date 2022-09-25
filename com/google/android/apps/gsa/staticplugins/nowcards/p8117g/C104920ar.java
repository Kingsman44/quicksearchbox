package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9182br;
import com.google.android.apps.p489g.p494d.C9218d;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.ar */
/* compiled from: PG */
public final class C104920ar extends C104348l {
    public C104920ar(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_multi_option_action, mo94115i(), false);
    }

    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_multi_option_action, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        int i;
        LinearLayout linearLayout = (LinearLayout) this.f290311f;
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        if (a == C9277u.MULTI_OPTION_ACTION) {
            linearLayout.setOrientation(0);
            linearLayout.setShowDividers(0);
            linearLayout.setGravity(8388613);
        }
        C9182br brVar = this.f290310e.f32200g;
        if (brVar == null) {
            brVar = C9182br.f31705e;
        }
        for (C9218d dVar : brVar.f31708b) {
            View inflate = this.f290308c.f256406b.inflate(R.layout.multi_option_action_item, linearLayout, false);
            if (!dVar.f31867b.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(R.id.title);
                textView.setText(dVar.f31867b);
                textView.setVisibility(0);
                if ((dVar.f31866a & 4) != 0 && dVar.f31869d) {
                    if ((brVar.f31707a & 1) != 0) {
                        i = brVar.f31709c;
                    } else {
                        i = this.f290307b.getResources().getColor(R.color.qp_blue);
                    }
                    textView.setTextColor(i);
                } else if ((brVar.f31707a & 2) != 0) {
                    textView.setTextColor(brVar.f31710d);
                }
                if (a == C9277u.MULTI_OPTION_ACTION) {
                    textView.setAllCaps(true);
                    textView.setTypeface(textView.getTypeface(), 1);
                }
            }
            if (a == C9277u.MULTI_OPTION_ACTION) {
                int dimensionPixelSize = this.f290307b.getResources().getDimensionPixelSize(R.dimen.multi_option_action_item_spacing);
                int dimensionPixelSize2 = this.f290307b.getResources().getDimensionPixelSize(R.dimen.multi_option_action_item_padding_side);
                int max = Math.max(dimensionPixelSize - (dimensionPixelSize2 + dimensionPixelSize2), 0);
                C91115n.m148874f(inflate, 2, dimensionPixelSize2);
                C91115n.m148874f(inflate, 3, dimensionPixelSize2);
                C91115n.m148873e((ViewGroup.MarginLayoutParams) inflate.getLayoutParams(), max, 0, 0, 0);
            }
            if ((dVar.f31866a & 2) != 0) {
                C9141ad adVar = dVar.f31868c;
                if (adVar == null) {
                    adVar = C9141ad.f31521K;
                }
                mo94103B(inflate, adVar);
                inflate.setBackgroundResource(R.drawable.qp_clickable_module_background);
                C9141ad adVar2 = dVar.f31868c;
                if (((adVar2 == null ? C9141ad.f31521K : adVar2).f31535a & 4) != 0) {
                    if (adVar2 == null) {
                        adVar2 = C9141ad.f31521K;
                    }
                    C9164b bVar = adVar2.f31539e;
                    if (bVar == null) {
                        bVar = C9164b.f31642o;
                    }
                    mo94116j(inflate, bVar, R.id.icon_stub, R.id.icon_background, false);
                }
            }
            linearLayout.addView(inflate, a == C9277u.MULTI_OPTION_ACTION ? 0 : -1);
        }
        ((ViewGroup.MarginLayoutParams) linearLayout.getChildAt(0).getLayoutParams()).setMargins(0, 0, 0, 0);
    }

    /* renamed from: q */
    public final void mo94036q() {
        super.mo94036q();
        LinearLayout linearLayout = (LinearLayout) this.f290311f;
        linearLayout.setOrientation(1);
        linearLayout.setShowDividers(2);
        linearLayout.setGravity(8388611);
        linearLayout.removeAllViews();
    }
}
