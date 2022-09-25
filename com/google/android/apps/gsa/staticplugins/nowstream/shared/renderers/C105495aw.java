package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83412a;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91940p;
import com.google.android.apps.gsa.sidekick.shared.util.C91960ak;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105394b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105433c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.aw */
/* compiled from: PG */
public final class C105495aw extends C22939d {

    /* renamed from: a */
    public final C105394b f294291a;

    /* renamed from: b */
    public C83412a f294292b;

    /* renamed from: c */
    public C83412a f294293c;

    /* renamed from: d */
    public TextView f294294d;

    /* renamed from: e */
    private final C105433c f294295e;

    /* renamed from: f */
    private final Context f294296f;

    /* renamed from: g */
    private LinearLayout f294297g;

    public C105495aw(C22945j jVar, C105433c cVar, C105394b bVar, Context context, C58881cr crVar) {
        super(jVar);
        this.f294295e = cVar;
        this.f294291a = bVar;
        this.f294296f = new C91940p(context, false, ((Boolean) crVar.mo6453a()).booleanValue()).f256405a;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        LayoutInflater from = LayoutInflater.from(this.f294296f);
        this.f294292b = C83412a.m132796a(this.f294296f, from.inflate(R.layout.qp_simple_card, (ViewGroup) null, false));
        View inflate = from.inflate(R.layout.qp_primary_action, (ViewGroup) null, false);
        C91960ak.m150916b(inflate, R.drawable.ic_playstore);
        inflate.setOnClickListener(new C105491as(this));
        this.f294294d = (TextView) inflate.findViewById(R.id.title);
        C83412a a = C83412a.m132796a(this.f294296f, inflate);
        this.f294293c = a;
        a.mo76751i(4);
        LinearLayout linearLayout = new LinearLayout(this.f294296f);
        this.f294297g = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f294297g.setOrientation(1);
        this.f294297g.addView(this.f294292b);
        this.f294297g.addView(this.f294293c);
        mo28295iC(this.f294297g);
        ((C105576dw) this.f294295e).f294535c.mo28726b(new C105492at(this));
        ((C105576dw) this.f294295e).f294534b.mo28726b(new C105493au(this));
        ((C105576dw) this.f294295e).f294533a.mo28726b(new C105494av(this));
    }
}
