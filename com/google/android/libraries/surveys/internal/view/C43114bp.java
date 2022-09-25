package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.p4281bu.p4282a.C56504ao;
import com.google.p4281bu.p4282a.C56511av;
import com.google.p4281bu.p4282a.C56512aw;
import com.google.p4281bu.p4282a.C56513ax;
import com.google.p4281bu.p4282a.C56514ay;
import com.google.p4281bu.p4282a.C56515az;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56546cc;
import com.google.p4281bu.p4282a.C56568cy;

/* renamed from: com.google.android.libraries.surveys.internal.view.bp */
/* compiled from: PG */
public final class C43114bp extends C43111bm {

    /* renamed from: d */
    public String f112758d;

    /* renamed from: e */
    public int f112759e = -1;

    /* renamed from: j */
    public int f112760j;

    /* renamed from: k */
    private LinearLayout f112761k;

    /* renamed from: l */
    private QuestionMetrics f112762l;

    /* renamed from: c */
    public final C56517ba mo46120c() {
        C56504ao aoVar = (C56504ao) C56517ba.f150934d.createBuilder();
        if (this.f112762l.mo46091c() && this.f112758d != null) {
            this.f112762l.mo46089a();
            C56512aw awVar = (C56512aw) C56513ax.f150922d.createBuilder();
            int i = this.f112759e;
            awVar.copyOnWrite();
            ((C56513ax) awVar.instance).f150925b = i;
            int i2 = this.f112760j;
            awVar.copyOnWrite();
            ((C56513ax) awVar.instance).f150924a = C56511av.m88208a(i2);
            String str = this.f112758d;
            awVar.copyOnWrite();
            str.getClass();
            ((C56513ax) awVar.instance).f150926c = str;
            C56513ax axVar = (C56513ax) awVar.build();
            C56514ay ayVar = (C56514ay) C56515az.f150927b.createBuilder();
            ayVar.copyOnWrite();
            axVar.getClass();
            ((C56515az) ayVar.instance).f150929a = axVar;
            C56515az azVar = (C56515az) ayVar.build();
            aoVar.copyOnWrite();
            C56517ba baVar = (C56517ba) aoVar.instance;
            azVar.getClass();
            baVar.f150937b = azVar;
            baVar.f150936a = 2;
            int i3 = this.f112647a.f150995c;
            aoVar.copyOnWrite();
            ((C56517ba) aoVar.instance).f150938c = i3;
        }
        return (C56517ba) aoVar.build();
    }

    /* renamed from: d */
    public final void mo46121d() {
        if (this.f112761k != null) {
            int i = 0;
            while (i < this.f112761k.getChildCount()) {
                View childAt = this.f112761k.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150).setStartDelay((long) (i * 80));
            }
        }
    }

    /* renamed from: e */
    public final void mo46122e() {
        EditText editText;
        super.mo46122e();
        this.f112762l.mo46090b();
        C43130ce b = mo46119b();
        LinearLayout linearLayout = this.f112761k;
        boolean z = false;
        if (!(linearLayout == null || (editText = (EditText) linearLayout.findViewById(R.id.survey_other_option)) == null || !editText.hasFocus())) {
            z = true;
        }
        b.mo46107d(z, this);
    }

    /* renamed from: g */
    public final View mo46172g() {
        C56568cy cyVar;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null);
        this.f112761k = (LinearLayout) inflate.findViewById(R.id.survey_answers_container);
        C43122bx bxVar = new C43122bx(getContext());
        bxVar.f112783a = new C43113bo(this);
        C56546cc ccVar = this.f112647a;
        if (ccVar.f150993a == 4) {
            cyVar = (C56568cy) ccVar.f150994b;
        } else {
            cyVar = C56568cy.f151042c;
        }
        bxVar.mo46182a(cyVar);
        this.f112761k.addView(bxVar);
        if (!mo46119b().mo46112y()) {
            inflate.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), getResources().getDimensionPixelSize(R.dimen.survey_bottom_padding));
        }
        return inflate;
    }

    /* renamed from: h */
    public final String mo46173h() {
        return this.f112647a.f150997e.isEmpty() ? this.f112647a.f150996d : this.f112647a.f150997e;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f112758d = bundle.getString("SelectedResponse", (String) null);
            this.f112762l = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.f112762l == null) {
            this.f112762l = new QuestionMetrics();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("SelectedResponse", this.f112758d);
        bundle.putParcelable("QuestionMetrics", this.f112762l);
    }
}
