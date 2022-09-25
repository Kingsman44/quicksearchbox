package com.google.android.apps.gsa.staticplugins.nowcards.p8118h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91942r;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9235dq;
import com.google.android.apps.p489g.p494d.C9236dr;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.h.i */
/* compiled from: PG */
public final class C104990i extends C104348l {

    /* renamed from: y */
    private static final C59071e f292490y = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.h.i");

    public C104990i(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* renamed from: L */
    private final void m174083L(View view, int i, int i2, int i3, C9235dq dqVar, int i4) {
        m174084M(view, i, dqVar.f31918c);
        C91985d.m150961h(view, i2, Html.fromHtml(dqVar.f31919d));
        if ((dqVar.f31916a & 1) != 0) {
            if (dqVar.f31921f) {
                mo94127u(i3);
            }
            mo94117k(view, i3, dqVar.f31917b);
        } else if (i4 != 0) {
            ImageView imageView = (ImageView) view.findViewById(i3);
            imageView.setImageResource(i4);
            imageView.setBackground((Drawable) null);
            imageView.setVisibility(0);
        }
    }

    /* renamed from: M */
    private static final void m174084M(View view, int i, String str) {
        if (view.findViewById(i) != null) {
            C91985d.m150954a(view, i, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        return mo94019c(a, mo94115i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        C9277u uVar2 = C9277u.UNKNOWN;
        int ordinal = uVar.ordinal();
        int i = R.layout.qp_sport_versus_side_by_side;
        switch (ordinal) {
            case 8:
                break;
            case 9:
            case 11:
                break;
            case 10:
                i = R.layout.qp_sport_versus_stacked_row;
                break;
            default:
                C59104x c = f292490y.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SportVersusModulePresen");
                ((C59052c) ((C59052c) c).mo56372aa(22086)).mo56389s("Bad sport type for sport versus module: %s", uVar);
                break;
        }
        i = R.layout.qp_sport_versus_stacked;
        return this.f290308c.f256406b.inflate(i, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        View view = this.f290311f;
        C9236dr drVar = this.f290310e.f32203j;
        if (drVar == null) {
            drVar = C9236dr.f31922l;
        }
        C9236dr drVar2 = drVar;
        C9277u a = C9277u.m23705a(this.f290310e.f32196c);
        if (a == null) {
            a = C9277u.UNKNOWN;
        }
        C9277u uVar = a;
        m174084M(view, R.id.status, drVar2.f31925b);
        if (!drVar2.f31926c.isEmpty()) {
            if (uVar == C9277u.SPORT_VERSUS_STACKED_ROW) {
                TextView a2 = C91985d.m150954a(view, R.id.highlight_status, drVar2.f31926c);
                if (!(a2 == null || (drVar2.f31924a & 4) == 0)) {
                    a2.setTextColor(drVar2.f31927d);
                }
            } else {
                TextView textView = (TextView) view.findViewById(R.id.highlight_status);
                textView.setVisibility(0);
                Context context = this.f290307b;
                int color = context.getResources().getColor(R.color.qp_text_w1);
                int color2 = context.getResources().getColor(R.color.qp_status_none);
                if ((drVar2.f31924a & 4) != 0) {
                    color2 = drVar2.f31927d;
                }
                textView.setText(C91942r.m150865a(drVar2.f31926c, context, true, color, color2));
            }
        }
        int i = (drVar2.f31924a & 512) != 0 ? drVar2.f31934k : 0;
        C9235dq dqVar = drVar2.f31928e;
        if (dqVar == null) {
            dqVar = C9235dq.f31914g;
        }
        C9235dq dqVar2 = dqVar;
        m174083L(view, R.id.first_entity_light_name, R.id.first_entity_name, R.id.first_entity_icon, dqVar2, i);
        C9235dq dqVar3 = drVar2.f31929f;
        if (dqVar3 == null) {
            dqVar3 = C9235dq.f31914g;
        }
        C9235dq dqVar4 = dqVar3;
        m174083L(view, R.id.second_entity_light_name, R.id.second_entity_name, R.id.second_entity_icon, dqVar4, i);
        String str = dqVar2.f31920e;
        String str2 = dqVar4.f31920e;
        if (uVar != C9277u.SPORT_VERSUS_SIDE_BY_SIDE && uVar != C9277u.SPORT_VERSUS_SIDE_BY_SIDE_ROW) {
            C91985d.m150954a(view, R.id.first_entity_score, str);
            C91985d.m150954a(view, R.id.second_entity_score, str2);
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C91985d.m150961h(view, R.id.score, Html.fromHtml(this.f290307b.getString(R.string.versus)));
        } else {
            C91985d.m150961h(view, R.id.score, Html.fromHtml(this.f290307b.getString(R.string.sports_team_vs_scores_only, new Object[]{str, str2})));
        }
        m174084M(view, R.id.score_subtitle, drVar2.f31930g);
        int i2 = drVar2.f31924a;
        if ((i2 & 256) != 0 && (i2 & 128) != 0) {
            View findViewById = view.findViewById(R.id.video_thumbnail);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                mo94117k(view, R.id.thumbnail, drVar2.f31932i);
                C9141ad adVar = drVar2.f31933j;
                if (adVar == null) {
                    adVar = C9141ad.f31521K;
                }
                mo94103B(findViewById, adVar);
            }
        } else if ((i2 & 64) != 0) {
            m174084M(view, R.id.broadcast_station, drVar2.f31931h);
        }
    }
}
