package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.recently.entry.C116077a;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116163af;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1875j.C22845p;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.o */
/* compiled from: PG */
public final class C116149o extends C116136b {

    /* renamed from: c */
    private int f322073c;

    /* renamed from: d */
    private int f322074d;

    public C116149o(Context context, C116163af afVar) {
        super(context, afVar);
    }

    /* renamed from: c */
    public final int mo102410c() {
        return R.layout.recently_normal_entry;
    }

    /* renamed from: e */
    public final void mo102412e(int i, int i2) {
        this.f322073c = i;
        this.f322074d = i2;
    }

    /* renamed from: f */
    public final void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        super.mo102413f(view, bVar, rVar, fVar);
        Timeline timeline = bVar.f321699a.f321706d;
        int i = rVar.f322281b;
        C22845p pVar = timeline.f322178a[i].f322177h[fVar.f322256e];
        if (!(view.getBackground() instanceof C116077a)) {
            mo102523g(view, this.f322073c, this.f322074d);
        }
        C116077a aVar = (C116077a) view.getBackground();
        aVar.f321869a = null;
        aVar.invalidateSelf();
        TextView textView = (TextView) view.findViewById(R.id.page_title);
        if ((pVar.f62892a & 8) != 0) {
            textView.setText(this.f322052a.getString(R.string.screenshot_srp_pending_desc, new Object[]{pVar.f62896e}));
        } else {
            textView.setText(this.f322052a.getString(R.string.screenshot_srp_voice_pending_desc));
        }
        textView.setVisibility(0);
    }
}
