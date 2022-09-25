package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9226dh;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.bg */
/* compiled from: PG */
public final class C104936bg extends C104348l {
    public C104936bg(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_secondary_action, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_secondary_action, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        View view = this.f290311f;
        C9226dh dhVar = this.f290310e.f32199f;
        if (dhVar == null) {
            dhVar = C9226dh.f31894d;
        }
        if ((dhVar.f31896a & 1) != 0) {
            C91985d.m150961h(view, R.id.title, Html.fromHtml(dhVar.f31897b));
        }
        if ((dhVar.f31896a & 2) != 0) {
            C91985d.m150961h(view, R.id.subtitle, Html.fromHtml(dhVar.f31898c));
        }
        View findViewById = view.findViewById(R.id.quick_action_container);
        C9278v vVar = this.f290310e;
        if ((vVar.f32192a & 268435456) != 0) {
            C9141ad adVar = vVar.f32171E;
            if (adVar == null) {
                adVar = C9141ad.f31521K;
            }
            if (findViewById == null) {
                findViewById = ((ViewStub) view.findViewById(R.id.quick_action_stub)).inflate();
            }
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.icon);
            C9141ad adVar2 = this.f290310e.f32171E;
            if (adVar2 == null) {
                adVar2 = C9141ad.f31521K;
            }
            C9164b bVar = adVar2.f31539e;
            if (bVar == null) {
                bVar = C9164b.f31642o;
            }
            imageView.setImageResource(bVar.f31645b);
            if ((adVar.f31535a & 4096) != 0) {
                findViewById.setContentDescription(adVar.f31549o);
            }
            mo94103B(findViewById, adVar);
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: q */
    public final void mo94036q() {
        View view = this.f290311f;
        C91985d.m150957d(view, R.id.title);
        C91985d.m150957d(view, R.id.subtitle);
        View findViewById = view.findViewById(R.id.quick_action_container);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }
}
