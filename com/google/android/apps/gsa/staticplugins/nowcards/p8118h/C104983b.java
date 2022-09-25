package com.google.android.apps.gsa.staticplugins.nowcards.p8118h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91942r;
import com.google.android.apps.gsa.sidekick.shared.util.C91980bd;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9146ai;
import com.google.android.apps.p489g.p494d.C9147aj;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C8110vx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.h.b */
/* compiled from: PG */
public final class C104983b extends C104348l {
    public C104983b(Context context, C104350n nVar) {
        super(context, nVar);
    }

    /* renamed from: L */
    private final String m174058L(int i, List list) {
        return i < list.size() ? (String) list.get(i) : this.f290307b.getString(R.string.no_info);
    }

    /* renamed from: M */
    private final void m174059M(StringBuilder sb, int i, List list) {
        String str;
        if (i < list.size()) {
            if (i == 0) {
                str = this.f290307b.getString(R.string.cricket_first_innings);
            } else {
                str = this.f290307b.getString(R.string.cricket_second_innings);
            }
            String L = m174058L(i, list);
            sb.append(str + " " + L + " ");
        }
    }

    /* renamed from: N */
    private final void m174060N(ViewGroup viewGroup, List list, int i, int i2) {
        TextView textView = (TextView) this.f290308c.f256406b.inflate(R.layout.qp_tabular_data_cell, viewGroup, false);
        textView.setTextAlignment(i2);
        textView.setText(m174058L(i, list));
        textView.setImportantForAccessibility(2);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        viewGroup.addView(textView, layoutParams);
    }

    /* renamed from: O */
    private final void m174061O(View view, int i, int i2, C9146ai aiVar) {
        C91985d.m150961h(view, i, Html.fromHtml(aiVar.f31570c));
        if ((aiVar.f31568a & 1) != 0) {
            if (aiVar.f31572e) {
                mo94127u(i2);
            }
            mo94117k(view, i2, aiVar.f31569b);
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(i2);
        imageView.setImageResource(C91980bd.m150950a(C8110vx.CRICKET));
        imageView.setBackground((Drawable) null);
        imageView.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo94018b(LayoutInflater layoutInflater) {
        return layoutInflater.inflate(R.layout.qp_cricket_side_by_side, mo94115i(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final View mo94019c(C9277u uVar, ViewGroup viewGroup) {
        return this.f290308c.f256406b.inflate(R.layout.qp_cricket_side_by_side, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo94020e() {
        View view = this.f290311f;
        C9147aj ajVar = this.f290310e.f32208o;
        if (ajVar == null) {
            ajVar = C9147aj.f31573j;
        }
        C91985d.m150954a(view, R.id.date, ajVar.f31576b);
        Context context = this.f290307b;
        int color = context.getResources().getColor(R.color.qp_text_w1);
        int color2 = context.getResources().getColor(R.color.qp_status_none);
        if ((ajVar.f31575a & 4) != 0) {
            color2 = ajVar.f31578d;
        }
        String str = ajVar.f31577c;
        if (!TextUtils.isEmpty(str)) {
            C91985d.m150961h(view, R.id.highlight_status, C91942r.m150865a(str, context, true, color, color2));
            view.findViewById(R.id.highlight_status).setContentDescription(str.toString());
        }
        C91985d.m150954a(view, R.id.match_metadata, ajVar.f31579e);
        C9146ai aiVar = ajVar.f31580f;
        if (aiVar == null) {
            aiVar = C9146ai.f31566f;
        }
        m174061O(view, R.id.first_team_name, R.id.first_team_icon, aiVar);
        C9146ai aiVar2 = ajVar.f31581g;
        if (aiVar2 == null) {
            aiVar2 = C9146ai.f31566f;
        }
        m174061O(view, R.id.second_team_name, R.id.second_team_icon, aiVar2);
        int max = Math.max(aiVar.f31571d.size(), aiVar2.f31571d.size());
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.innings_container);
        viewGroup.removeAllViews();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < max; i++) {
            TableRow tableRow = new TableRow(this.f290307b);
            m174060N(tableRow, aiVar.f31571d, i, 5);
            m174059M(sb, i, aiVar.f31571d);
            m174060N(tableRow, aiVar2.f31571d, i, 6);
            m174059M(sb2, i, aiVar2.f31571d);
            viewGroup.addView(tableRow);
        }
        view.findViewById(R.id.first_team_name).setContentDescription(this.f290307b.getString(R.string.cricket_score_description, new Object[]{aiVar.f31570c, sb.toString()}));
        view.findViewById(R.id.second_team_name).setContentDescription(this.f290307b.getString(R.string.cricket_score_description, new Object[]{aiVar2.f31570c, sb2.toString()}));
        C91985d.m150954a(view, R.id.toss_info, ajVar.f31582h);
        C91985d.m150954a(view, R.id.result, ajVar.f31583i);
    }
}
