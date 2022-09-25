package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p375ai.p378b.C8142xb;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.i */
/* compiled from: PG */
public final class C105464i {

    /* renamed from: a */
    public final Context f294101a;

    /* renamed from: b */
    public final View f294102b;

    /* renamed from: c */
    public final C105463h f294103c;

    /* renamed from: d */
    public final C105462g f294104d;

    /* renamed from: e */
    public final int f294105e;

    /* renamed from: f */
    public boolean f294106f = false;

    /* renamed from: g */
    public boolean f294107g;

    /* renamed from: h */
    public boolean f294108h;

    /* renamed from: i */
    public String f294109i;

    /* renamed from: j */
    public final C91825b f294110j;

    /* renamed from: k */
    private final TextView f294111k;

    /* renamed from: l */
    private final View f294112l;

    /* renamed from: m */
    private final View.OnClickListener f294113m;

    /* renamed from: n */
    private final C8142xb f294114n;

    /* renamed from: o */
    private final int f294115o;

    /* renamed from: p */
    private boolean f294116p;

    public C105464i(Context context, C91825b bVar, C22945j jVar, View.OnClickListener onClickListener, C8142xb xbVar) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f294110j = bVar;
        this.f294113m = onClickListener;
        View inflate = from.inflate(R.layout.new_content_button_monet, (ViewGroup) null);
        this.f294102b = inflate;
        inflate.setVisibility(8);
        this.f294105e = inflate.getPaddingBottom();
        this.f294111k = (TextView) inflate.findViewById(R.id.action_button);
        View findViewById = inflate.findViewById(R.id.bubble_snackbar_click_target);
        this.f294112l = findViewById;
        this.f294101a = context;
        this.f294114n = xbVar;
        this.f294104d = new C105462g(this);
        this.f294103c = new C105463h();
        jVar.mo28312m(new C105461f(this));
        findViewById.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = findViewById.getMeasuredHeight() + context.getResources().getDimensionPixelOffset(R.dimen.bubble_snackbar_padding);
        this.f294115o = measuredHeight;
        findViewById.setTranslationY((float) measuredHeight);
    }

    /* renamed from: a */
    public final void mo94792a() {
        if (this.f294112l.getVisibility() != 8 && this.f294116p) {
            this.f294112l.animate().cancel();
            this.f294112l.animate().translationY((float) this.f294115o).setDuration(250).withEndAction(new C105460e(this));
            this.f294116p = false;
        }
    }

    /* renamed from: b */
    public final void mo94793b() {
        String str;
        if (!this.f294116p && this.f294106f && (str = this.f294109i) != null) {
            this.f294111k.setText(str);
            this.f294111k.setVisibility(0);
            this.f294102b.setVisibility(0);
            this.f294112l.setOnClickListener(this.f294113m);
            this.f294112l.setVisibility(0);
            if (this.f294108h && this.f294107g) {
                C8142xb xbVar = this.f294114n;
                if (xbVar == C8142xb.ACETONE_OVERLAY_MOMO) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 1241;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                } else if (xbVar == C8142xb.SEARCH_NOW_MONET) {
                    C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar2.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar2.instance;
                    ufVar2.f164093a |= 2;
                    ufVar2.f164258m = 1336;
                    C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
                this.f294108h = false;
            }
            this.f294112l.animate().cancel();
            this.f294112l.animate().translationY(0.0f).setDuration(250).withEndAction((Runnable) null).start();
            this.f294116p = true;
        }
    }
}
