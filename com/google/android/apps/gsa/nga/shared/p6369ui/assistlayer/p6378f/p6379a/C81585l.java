package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6378f.p6379a;

import android.support.p033v7.widget.AppCompatTextView;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58758qx;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.l */
/* compiled from: PG */
public final /* synthetic */ class C81585l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81596w f223166a;

    /* renamed from: b */
    public final /* synthetic */ C81594u f223167b;

    /* renamed from: c */
    public final /* synthetic */ C81594u f223168c;

    /* renamed from: d */
    public final /* synthetic */ C81594u f223169d;

    public /* synthetic */ C81585l(C81596w wVar, C81594u uVar, C81594u uVar2, C81594u uVar3) {
        this.f223166a = wVar;
        this.f223167b = uVar;
        this.f223168c = uVar2;
        this.f223169d = uVar3;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81596w wVar = this.f223166a;
        C81594u uVar = this.f223167b;
        C81594u uVar2 = this.f223168c;
        C81594u uVar3 = this.f223169d;
        C80734di diVar = (C80734di) obj;
        int e = diVar.mo74542e();
        HashSet<C81594u> g = C58758qx.m90649g(3);
        Collections.addAll(g, new C81594u[]{uVar, uVar2, uVar3});
        int i = e - 1;
        if (e != 0) {
            if (i == 3) {
                View view = ((C81574a) uVar2).f223146a;
                wVar.mo75201j(diVar.mo74542e());
                TextView textView = (TextView) view.findViewById(R.id.nga_assist_privacy_chip_text);
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(Html.fromHtml(diVar.mo74541d()));
                for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                    valueOf.setSpan(C81595v.f223184a, valueOf.getSpanStart(uRLSpan), valueOf.getSpanEnd(uRLSpan), valueOf.getSpanFlags(uRLSpan));
                    valueOf.removeSpan(uRLSpan);
                }
                textView.setText(valueOf);
                if (!C80831aj.f221751c.equals(diVar.mo74538a())) {
                    textView.setOnClickListener(new C81575b(wVar, textView, diVar));
                } else {
                    textView.setOnClickListener((View.OnClickListener) null);
                }
                C81596w.m129730g(diVar, uVar2);
                g.remove(uVar2);
            } else if (i != 5) {
                View view2 = ((C81574a) uVar).f223146a;
                wVar.mo75201j(diVar.mo74542e());
                TextView textView2 = (TextView) view2.findViewById(R.id.nga_assist_hero_chip_text);
                if (!diVar.mo74541d().isEmpty()) {
                    textView2.setText(Html.fromHtml(diVar.mo74541d()));
                }
                if (!C80831aj.f221751c.equals(diVar.mo74538a())) {
                    textView2.setOnClickListener(new C81588o(wVar, textView2, diVar));
                } else {
                    textView2.setOnClickListener((View.OnClickListener) null);
                }
                C81596w.m129730g(diVar, uVar);
                g.remove(uVar);
            } else {
                View view3 = ((C81574a) uVar3).f223146a;
                String b = diVar.mo74539b();
                String c = diVar.mo74540c();
                String d = diVar.mo74541d();
                ImageView imageView = (ImageView) view3.findViewById(R.id.nga_assist_nest_promo_imageview);
                TextView textView3 = (TextView) view3.findViewById(R.id.nga_assist_nest_promo_title);
                TextView textView4 = (TextView) view3.findViewById(R.id.nga_assist_nest_promo_sub_text);
                if (wVar.f223194i.isPresent() && !TextUtils.isEmpty(b)) {
                    C80905at.m128763g(((C91189au) wVar.f223194i.get()).mo85421i(b, imageView), C81582i.f223160a);
                }
                wVar.mo75201j(diVar.mo74542e());
                textView3.setText(d);
                textView4.setText(c);
                if (wVar.f223198m.mo85405j(C90037cp.f248532cG)) {
                    View findViewById = view3.findViewById(R.id.nga_assist_nest_promo_legal);
                    String h = wVar.f223198m.mo85403h(C90037cp.f248520bv);
                    AppCompatTextView appCompatTextView = (AppCompatTextView) view3.findViewById(R.id.nga_assist_nest_promo_legal_text);
                    findViewById.setVisibility(0);
                    SpannableString spannableString = new SpannableString(Html.fromHtml(wVar.f223197l.mo75121a(Locale.US).getString(R.string.nga_assist_nest_promo_disclaimer_text, new Object[0]), 0));
                    spannableString.setSpan(new C81593t(wVar, h, diVar), 60, 78, 18);
                    appCompatTextView.setText(spannableString);
                    appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                if (!C80831aj.f221751c.equals(diVar.mo74538a())) {
                    view3.setOnClickListener(new C81583j(wVar, view3, diVar));
                } else {
                    view3.setOnClickListener((View.OnClickListener) null);
                }
                C81596w.m129730g(diVar, uVar3);
                g.remove(uVar3);
            }
            for (C81594u uVar4 : g) {
                uVar4.mo75186c();
                uVar4.mo75185b().mo124460b(0.0f, C81596w.f223186b);
                uVar4.mo75184a().setEnabled(false);
            }
            return;
        }
        throw null;
    }
}
