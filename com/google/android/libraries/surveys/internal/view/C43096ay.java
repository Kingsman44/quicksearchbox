package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p096h.C1951d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43056e;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.p4281bu.p4282a.C56504ao;
import com.google.p4281bu.p4282a.C56509at;
import com.google.p4281bu.p4282a.C56510au;
import com.google.p4281bu.p4282a.C56511av;
import com.google.p4281bu.p4282a.C56512aw;
import com.google.p4281bu.p4282a.C56513ax;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56546cc;
import com.google.p4281bu.p4282a.C56551ch;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68400y;

/* renamed from: com.google.android.libraries.surveys.internal.view.ay */
/* compiled from: PG */
public final class C43096ay extends C43071a {

    /* renamed from: d */
    public String f112712d;

    /* renamed from: e */
    public int f112713e;

    /* renamed from: f */
    public QuestionMetrics f112714f;

    /* renamed from: g */
    private TextView f112715g;

    /* renamed from: c */
    public final C56517ba mo46120c() {
        C56504ao aoVar = (C56504ao) C56517ba.f150934d.createBuilder();
        if (this.f112714f.mo46091c() && this.f112712d != null) {
            C56512aw awVar = (C56512aw) C56513ax.f150922d.createBuilder();
            int i = this.f112713e;
            awVar.copyOnWrite();
            ((C56513ax) awVar.instance).f150925b = i;
            awVar.copyOnWrite();
            ((C56513ax) awVar.instance).f150924a = C56511av.m88208a(3);
            String str = this.f112712d;
            awVar.copyOnWrite();
            str.getClass();
            ((C56513ax) awVar.instance).f150926c = str;
            C56513ax axVar = (C56513ax) awVar.build();
            C56509at atVar = (C56509at) C56510au.f150919b.createBuilder();
            atVar.copyOnWrite();
            axVar.getClass();
            ((C56510au) atVar.instance).f150921a = axVar;
            C56510au auVar = (C56510au) atVar.build();
            int i2 = this.f112647a.f150995c;
            aoVar.copyOnWrite();
            ((C56517ba) aoVar.instance).f150938c = i2;
            aoVar.copyOnWrite();
            C56517ba baVar = (C56517ba) aoVar.instance;
            auVar.getClass();
            baVar.f150937b = auVar;
            baVar.f150936a = 4;
            int i3 = C43066o.f112626a;
        }
        return (C56517ba) aoVar.build();
    }

    /* renamed from: e */
    public final void mo46122e() {
        TextView textView;
        this.f112714f.mo46090b();
        if (mo46119b() != null) {
            mo46119b().mo46106c();
        }
        mo46119b().mo46107d(mo46159g(), this);
        if (C43066o.m75994o(getContext()) && (textView = this.f112715g) != null) {
            textView.requestFocus();
            this.f112715g.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: f */
    public final void mo46123f(String str) {
        if (!C43054c.m75959b(C68400y.m98798d(C43054c.f112610b)) || !(getContext() == null || this.f112715g == null)) {
            Spanned a = C1951d.m5280a(str, 0);
            this.f112715g.setText(a);
            this.f112715g.setContentDescription(a.toString());
        }
    }

    /* renamed from: g */
    public final boolean mo46159g() {
        return this.f112712d != null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f112712d = bundle.getString("SelectedResponse", (String) null);
            this.f112714f = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.f112714f == null) {
            this.f112714f = new QuestionMetrics();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C56551ch chVar;
        String str;
        View inflate = layoutInflater.inflate(R.layout.survey_question_rating_fragment, viewGroup, false);
        Bundle arguments = getArguments();
        CharSequence charSequence = null;
        C43056e.m75962b((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), arguments.containsKey("DisplayLogoResId") ? Integer.valueOf(arguments.getInt("DisplayLogoResId", 0)) : null);
        if (bundle != null) {
            charSequence = bundle.getCharSequence("QuestionTextFromHtml");
        }
        if (charSequence == null) {
            if (this.f112647a.f150997e.isEmpty()) {
                str = this.f112647a.f150996d;
            } else {
                str = this.f112647a.f150997e;
            }
            charSequence = C1951d.m5280a(str, 0);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.survey_question_text);
        this.f112715g = textView;
        textView.setText(charSequence);
        this.f112715g.setContentDescription(charSequence.toString());
        C43108bj bjVar = new C43108bj(getContext());
        C56546cc ccVar = this.f112647a;
        if (ccVar.f150993a == 6) {
            chVar = (C56551ch) ccVar.f150994b;
        } else {
            chVar = C56551ch.f151006g;
        }
        bjVar.mo46169c(chVar);
        bjVar.f112747a = new C43095ax(this);
        ((ViewGroup) inflate.findViewById(R.id.survey_rating_container)).addView(bjVar);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("SelectedResponse", this.f112712d);
        bundle.putParcelable("QuestionMetrics", this.f112714f);
        TextView textView = this.f112715g;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }
}
