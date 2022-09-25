package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.p4281bu.p4282a.C56504ao;
import com.google.p4281bu.p4282a.C56505ap;
import com.google.p4281bu.p4282a.C56506aq;
import com.google.p4281bu.p4282a.C56511av;
import com.google.p4281bu.p4282a.C56512aw;
import com.google.p4281bu.p4282a.C56513ax;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56528bl;
import com.google.p4281bu.p4282a.C56546cc;
import com.google.p4281bu.p4282a.C56583i;
import com.google.p4281bu.p4282a.C56585k;
import com.google.p4281bu.p4282a.C56587m;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.surveys.internal.view.e */
/* compiled from: PG */
public final class C43147e extends C43111bm {

    /* renamed from: d */
    public QuestionMetrics f112833d;

    /* renamed from: e */
    public C43154l f112834e;

    /* renamed from: j */
    private boolean[] f112835j;

    /* renamed from: k */
    private ViewGroup f112836k;

    /* renamed from: c */
    public final C56517ba mo46120c() {
        C56528bl blVar;
        C56504ao aoVar = (C56504ao) C56517ba.f150934d.createBuilder();
        if (this.f112833d.mo46091c()) {
            C56505ap apVar = (C56505ap) C56506aq.f150913b.createBuilder();
            C56546cc ccVar = this.f112647a;
            if (ccVar.f150993a == 5) {
                blVar = (C56528bl) ccVar.f150994b;
            } else {
                blVar = C56528bl.f150956b;
            }
            C56587m mVar = blVar.f150958a;
            if (mVar == null) {
                mVar = C56587m.f151083b;
            }
            C62971cq cqVar = mVar.f151085a;
            int i = 0;
            while (true) {
                boolean[] zArr = this.f112834e.f112852b;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    String str = ((C56585k) cqVar.get(i)).f151080c;
                    int a = C56583i.m88215a(((C56585k) cqVar.get(i)).f151078a);
                    int i2 = 4;
                    if (a != 0 && a == 4 && !TextUtils.isEmpty(this.f112834e.f112851a)) {
                        str = this.f112834e.f112851a;
                    }
                    C56512aw awVar = (C56512aw) C56513ax.f150922d.createBuilder();
                    int i3 = ((C56585k) cqVar.get(i)).f151079b;
                    awVar.copyOnWrite();
                    ((C56513ax) awVar.instance).f150925b = i3;
                    awVar.copyOnWrite();
                    str.getClass();
                    ((C56513ax) awVar.instance).f150926c = str;
                    int a2 = C56583i.m88215a(((C56585k) cqVar.get(i)).f151078a);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i4 = a2 - 2;
                    if (i4 == 1) {
                        i2 = 3;
                    } else if (i4 != 2) {
                        i2 = i4 != 3 ? 2 : 5;
                    }
                    awVar.copyOnWrite();
                    ((C56513ax) awVar.instance).f150924a = C56511av.m88208a(i2);
                    apVar.mo54427a((C56513ax) awVar.build());
                    this.f112833d.mo46089a();
                }
                int i5 = this.f112647a.f150995c;
                aoVar.copyOnWrite();
                ((C56517ba) aoVar.instance).f150938c = i5;
                C56506aq aqVar = (C56506aq) apVar.build();
                aoVar.copyOnWrite();
                C56517ba baVar = (C56517ba) aoVar.instance;
                aqVar.getClass();
                baVar.f150937b = aqVar;
                baVar.f150936a = 3;
                i++;
            }
        }
        return (C56517ba) aoVar.build();
    }

    /* renamed from: d */
    public final void mo46121d() {
        if (this.f112836k != null) {
            int i = 0;
            while (i < this.f112836k.getChildCount()) {
                View childAt = this.f112836k.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150).setStartDelay((long) (i * 80));
            }
        }
    }

    /* renamed from: e */
    public final void mo46122e() {
        super.mo46122e();
        this.f112833d.mo46090b();
        mo46119b().mo46107d(mo46205i(), this);
    }

    /* renamed from: g */
    public final View mo46172g() {
        C56528bl blVar;
        this.f112836k = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        C43156n nVar = new C43156n(getContext());
        nVar.f112855c = new C43146d(this);
        C56546cc ccVar = this.f112647a;
        if (ccVar.f150993a == 5) {
            blVar = (C56528bl) ccVar.f150994b;
        } else {
            blVar = C56528bl.f150956b;
        }
        nVar.mo46215a(blVar, this.f112835j);
        this.f112836k.addView(nVar);
        return this.f112836k;
    }

    /* renamed from: h */
    public final String mo46173h() {
        return this.f112647a.f150997e.isEmpty() ? this.f112647a.f150996d : this.f112647a.f150997e;
    }

    /* renamed from: i */
    public final boolean mo46205i() {
        C43154l lVar = this.f112834e;
        if (lVar == null) {
            return false;
        }
        return lVar.mo46214a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo46119b().mo46107d(mo46205i(), this);
    }

    public final void onCreate(Bundle bundle) {
        C56528bl blVar;
        C56528bl blVar2;
        C56528bl blVar3;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f112833d = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
            this.f112835j = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.f112833d == null) {
            this.f112833d = new QuestionMetrics();
        }
        boolean[] zArr = this.f112835j;
        if (zArr == null) {
            C56546cc ccVar = this.f112647a;
            if (ccVar.f150993a == 5) {
                blVar3 = (C56528bl) ccVar.f150994b;
            } else {
                blVar3 = C56528bl.f150956b;
            }
            C56587m mVar = blVar3.f150958a;
            if (mVar == null) {
                mVar = C56587m.f151083b;
            }
            this.f112835j = new boolean[mVar.f151085a.size()];
            return;
        }
        int length = zArr.length;
        C56546cc ccVar2 = this.f112647a;
        if (ccVar2.f150993a == 5) {
            blVar = (C56528bl) ccVar2.f150994b;
        } else {
            blVar = C56528bl.f150956b;
        }
        C56587m mVar2 = blVar.f150958a;
        if (mVar2 == null) {
            mVar2 = C56587m.f151083b;
        }
        if (length != mVar2.f151085a.size()) {
            int length2 = this.f112835j.length;
            Log.e("SurveyMultiSelectFrag", "Saved instance state responses had incorrect length: " + length2);
            C56546cc ccVar3 = this.f112647a;
            if (ccVar3.f150993a == 5) {
                blVar2 = (C56528bl) ccVar3.f150994b;
            } else {
                blVar2 = C56528bl.f150956b;
            }
            C56587m mVar3 = blVar2.f150958a;
            if (mVar3 == null) {
                mVar3 = C56587m.f151083b;
            }
            this.f112835j = new boolean[mVar3.f151085a.size()];
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("QuestionMetrics", this.f112833d);
        bundle.putBooleanArray("ResponsesAsArray", this.f112835j);
    }
}
