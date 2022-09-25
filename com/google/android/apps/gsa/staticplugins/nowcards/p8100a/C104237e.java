package com.google.android.apps.gsa.staticplugins.nowcards.p8100a;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91942r;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9198cg;
import com.google.android.apps.p489g.p494d.C9199ch;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.a.e */
/* compiled from: PG */
public final class C104237e extends C104348l {

    /* renamed from: y */
    private static final C58495hd f289917y;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C9198cg.NEUTRAL, Integer.valueOf(R.color.qp_status_none));
        gzVar.mo55429h(C9198cg.WARNING, Integer.valueOf(R.color.qp_status_yellow));
        gzVar.mo55429h(C9198cg.CRITICAL, Integer.valueOf(R.color.qp_status_red));
        gzVar.mo55429h(C9198cg.GOOD, Integer.valueOf(R.color.qp_status_green));
        f289917y = gzVar.mo55427f(false);
    }

    public C104237e(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_personal_item_row, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_personal_item_row, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        View view = this.f290311f;
        C9199ch chVar = this.f290310e.f32205l;
        if (chVar == null) {
            chVar = C9199ch.f31764g;
        }
        if ((chVar.f31766a & 1) != 0) {
            C91985d.m150961h(view, R.id.title, Html.fromHtml(chVar.f31767b));
        }
        if (chVar.f31768c.size() > 0) {
            ArrayList d = C58597ky.m90213d(chVar.f31768c.size());
            d.add(C91985d.m150955b(Html.fromHtml((String) chVar.f31768c.get(0)), this.f290307b.getResources().getColor(R.color.qp_text_b2)));
            if ((chVar.f31766a & 4) != 0) {
                Context context = this.f290307b;
                Resources resources = context.getResources();
                C58495hd hdVar = f289917y;
                C9198cg a = C9198cg.m23686a(chVar.f31769d);
                if (a == null) {
                    a = C9198cg.NEUTRAL;
                }
                d.set(0, TextUtils.concat(new CharSequence[]{(CharSequence) d.get(0), "  ", C91942r.m150865a(chVar.f31770e, context, false, resources.getColor(((Integer) hdVar.get(a)).intValue()), 0)}));
            }
            for (String fromHtml : chVar.f31768c) {
                d.add(Html.fromHtml(fromHtml));
            }
            C91985d.m150960g(view, R.id.subtitle, C91985d.m150958e(d));
        }
        View findViewById = view.findViewById(R.id.quick_action_container);
        if ((chVar.f31766a & 8) != 0) {
            C9141ad adVar = chVar.f31771f;
            if (adVar == null) {
                adVar = C9141ad.f31521K;
            }
            if (findViewById == null) {
                findViewById = ((ViewStub) view.findViewById(R.id.quick_action_stub)).inflate();
            }
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.icon);
            C9164b bVar = adVar.f31539e;
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
}
