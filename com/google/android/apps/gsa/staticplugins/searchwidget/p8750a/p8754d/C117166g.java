package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117089a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.g */
/* compiled from: PG */
public final class C117166g extends C22939d {

    /* renamed from: a */
    public final Context f325249a;

    /* renamed from: b */
    public TextView f325250b;

    /* renamed from: c */
    private final C117089a f325251c;

    /* renamed from: d */
    private RelativeLayout f325252d;

    public C117166g(C22945j jVar, C117089a aVar, Context context) {
        super(jVar);
        this.f325249a = context;
        this.f325251c = aVar;
    }

    /* renamed from: e */
    private final void m194735e(View view, String str) {
        view.setOnClickListener(new C117163d(this, str));
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f325249a).inflate(R.layout.action_bar, (ViewGroup) null, false);
        this.f325252d = relativeLayout;
        mo28295iC(relativeLayout);
        this.f325250b = (TextView) this.f325252d.findViewById(R.id.action_bar_text);
        ((C117127ba) this.f325251c).f325157b.mo28726b(new C117099a(this));
        ((C117127ba) this.f325251c).f325156a.mo28726b(new C117126b(this));
        m194735e(this.f325252d.findViewById(R.id.done_button), "DONE");
        m194735e(this.f325252d.findViewById(R.id.back_arrow), "BACK");
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return new C117153c(this);
    }
}
