package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.common.base.C58837ba;
import com.google.p4281bu.p4282a.C56504ao;
import com.google.p4281bu.p4282a.C56507ar;
import com.google.p4281bu.p4282a.C56508as;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56530bn;
import com.google.p4281bu.p4282a.C56546cc;

/* renamed from: com.google.android.libraries.surveys.internal.view.s */
/* compiled from: PG */
public final class C43161s extends C43111bm {

    /* renamed from: d */
    public String f112857d;

    /* renamed from: e */
    private QuestionMetrics f112858e;

    /* renamed from: c */
    public final C56517ba mo46120c() {
        C56504ao aoVar = (C56504ao) C56517ba.f150934d.createBuilder();
        if (this.f112858e.mo46091c()) {
            this.f112858e.mo46089a();
            String g = C58837ba.m90858g(this.f112857d);
            C56507ar arVar = (C56507ar) C56508as.f150916b.createBuilder();
            arVar.copyOnWrite();
            ((C56508as) arVar.instance).f150918a = g;
            C56508as asVar = (C56508as) arVar.build();
            int i = this.f112647a.f150995c;
            aoVar.copyOnWrite();
            ((C56517ba) aoVar.instance).f150938c = i;
            aoVar.copyOnWrite();
            C56517ba baVar = (C56517ba) aoVar.instance;
            asVar.getClass();
            baVar.f150937b = asVar;
            baVar.f150936a = 5;
        }
        return (C56517ba) aoVar.build();
    }

    /* renamed from: e */
    public final void mo46122e() {
        super.mo46122e();
        this.f112858e.mo46090b();
        mo46119b().mo46107d(true, this);
    }

    /* renamed from: g */
    public final View mo46172g() {
        C56530bn bnVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        C43164v vVar = new C43164v(getContext());
        C56546cc ccVar = this.f112647a;
        if (ccVar.f150993a == 7) {
            bnVar = (C56530bn) ccVar.f150994b;
        } else {
            bnVar = C56530bn.f150959c;
        }
        vVar.mo46219a(bnVar);
        vVar.f112860a = new C43160r(this);
        linearLayout.addView(vVar);
        return linearLayout;
    }

    /* renamed from: h */
    public final String mo46173h() {
        return this.f112647a.f150997e.isEmpty() ? this.f112647a.f150996d : this.f112647a.f150997e;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo46119b().mo46107d(true, this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f112858e = new QuestionMetrics();
        } else {
            this.f112858e = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("QuestionMetrics", this.f112858e);
    }
}
