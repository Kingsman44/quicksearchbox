package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.C43027d;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.p3325d.C43037a;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.p4522b.C58495hd;
import com.google.p4281bu.p4282a.C56493ad;
import com.google.p4281bu.p4282a.C56503an;
import com.google.p4281bu.p4282a.C56510au;
import com.google.p4281bu.p4282a.C56513ax;
import com.google.p4281bu.p4282a.C56515az;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56526bj;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56544ca;
import com.google.p4281bu.p4282a.C56545cb;
import com.google.p4281bu.p4282a.C56546cc;
import com.google.p4281bu.p4282a.C56568cy;
import com.google.p4281bu.p4282a.C56571da;
import com.google.p4281bu.p4282a.C56573dc;
import com.google.p4281bu.p4282a.C56585k;
import com.google.p4281bu.p4282a.C56587m;
import com.google.p4281bu.p4282a.C56589o;
import com.google.p4281bu.p4282a.C56590p;
import java.util.Iterator;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68353ab;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68368aq;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68385j;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68400y;

/* renamed from: com.google.android.libraries.surveys.internal.view.cd */
/* compiled from: PG */
public final class C43129cd {

    /* renamed from: a */
    public static C58495hd f112791a;

    /* renamed from: b */
    public C56532bp f112792b;

    /* renamed from: c */
    public SurveyViewPager f112793c;

    /* renamed from: d */
    public Answer f112794d;

    /* renamed from: e */
    public C43037a f112795e;

    /* renamed from: f */
    public Bundle f112796f = new Bundle();

    /* renamed from: g */
    public MaterialCardView f112797g;

    /* renamed from: h */
    public LinearLayout f112798h;

    /* renamed from: i */
    public boolean f112799i;

    /* renamed from: j */
    public boolean f112800j;

    /* renamed from: k */
    public int f112801k;

    /* renamed from: l */
    public final Handler f112802l = new Handler();

    /* renamed from: m */
    public final Runnable f112803m = new C43124bz(this);

    /* renamed from: n */
    public Integer f112804n;

    /* renamed from: o */
    public boolean f112805o;

    /* renamed from: p */
    public C43027d f112806p;

    /* renamed from: q */
    public final Activity f112807q;

    /* renamed from: r */
    public final FragmentManager f112808r;

    public C43129cd(Activity activity, FragmentManager fragmentManager) {
        this.f112807q = activity;
        this.f112808r = fragmentManager;
    }

    /* renamed from: l */
    public static void m76092l(Activity activity) {
        Intent intent = new Intent(activity, C43129cd.class);
        intent.setClassName(activity, "com.google.android.libraries.surveys.internal.view.SurveyActivity");
        intent.putExtra("IsDismissing", true);
        activity.startActivity(intent);
    }

    /* renamed from: m */
    private final void m76093m() {
        if (this.f112793c.mo46116C() || !C43109bk.m76069a(mo46187a(), this.f112792b, this.f112794d)) {
            m76096p();
        } else {
            m76095o(this.f112793c.mo9122a() + 1);
        }
    }

    /* renamed from: n */
    private final void m76094n(ViewGroup viewGroup, boolean z) {
        boolean z2;
        viewGroup.setEnabled(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                m76094n((ViewGroup) childAt, z);
            } else {
                if (childAt.getId() != R.id.survey_next) {
                    z2 = z;
                } else if (z) {
                    this.f112807q.findViewById(R.id.survey_next).setEnabled(this.f112800j);
                } else {
                    z2 = false;
                }
                childAt.setEnabled(z2);
            }
        }
    }

    /* renamed from: o */
    private final void m76095o(int i) {
        if (C43054c.m75959b(C68400y.m98798d(C43054c.f112610b))) {
            mo46193g(C43066o.m75997r(this.f112792b));
        }
        mo46191e();
        mo46196j(5);
        SurveyViewPager surveyViewPager = this.f112793c;
        surveyViewPager.mo9148m(i, true);
        surveyViewPager.mo46117y().mo46121d();
        mo46195i();
        mo46194h();
        this.f112793c.mo46117y().getView().sendAccessibilityEvent(32);
        int i2 = C43066o.f112626a;
    }

    /* renamed from: p */
    private final void m76096p() {
        int i = C43066o.f112626a;
        mo46196j(5);
        this.f112799i = true;
        mo46192f(false);
        this.f112807q.setResult(-1, new Intent());
        if (!C43054c.m75960c(C68353ab.m98708c(C43054c.f112610b))) {
            this.f112793c.mo46114A();
        } else if (this.f112806p == C43027d.CARD) {
            this.f112793c.mo46114A();
        } else {
            this.f112797g.setVisibility(8);
            View findViewById = this.f112807q.getWindow().findViewById(16908290);
            C56493ad adVar = this.f112792b.f150966b;
            if (adVar == null) {
                adVar = C56493ad.f150888f;
            }
            Snackbar.m79661q((Context) null, findViewById, adVar.f150890a, -1).mo48343h();
            mo46188b();
        }
    }

    /* renamed from: a */
    public final int mo46187a() {
        SurveyViewPager surveyViewPager = this.f112793c;
        if (surveyViewPager == null) {
            return 0;
        }
        int a = surveyViewPager.mo9122a();
        if (C43054c.m75958a()) {
            return a + this.f112801k;
        }
        return this.f112805o ? a + 1 : a;
    }

    /* renamed from: b */
    public final void mo46188b() {
        this.f112807q.setResult(-1, new Intent());
        this.f112802l.postDelayed(this.f112803m, 2400);
    }

    /* renamed from: c */
    public final void mo46189c() {
        int a;
        C56568cy cyVar;
        C56568cy cyVar2;
        C56590p pVar;
        C56515az azVar;
        int a2;
        C56510au auVar;
        int a3;
        SurveyViewPager surveyViewPager = this.f112793c;
        if (surveyViewPager != null && surveyViewPager.mo46115B()) {
            C56526bj bjVar = this.f112792b.f150965a;
            if (bjVar == null) {
                bjVar = C56526bj.f150952c;
            }
            if (!bjVar.f150954a) {
                mo46196j(3);
            }
        }
        C43066o.m75991l(this.f112798h);
        mo46197k();
        int i = 1;
        if (!C43054c.m75959b(C68400y.m98798d(C43054c.f112610b))) {
            C56546cc ccVar = (C56546cc) this.f112792b.f150969e.get(mo46187a());
            if (C43066o.m75997r(this.f112792b) && (a3 = C56545cb.m88209a(ccVar.f150999g)) != 0 && a3 == 5) {
                mo46193g(true);
            }
        }
        C56517ba z = this.f112793c.mo46118z();
        if (z != null) {
            this.f112794d.f112629a = z;
        }
        if (C43054c.m75958a()) {
            SurveyViewPager surveyViewPager2 = this.f112793c;
            if (surveyViewPager2 == null) {
                m76093m();
                return;
            }
            C56546cc ccVar2 = surveyViewPager2.mo46117y().f112647a;
            C56544ca caVar = ccVar2.f151001i;
            if (caVar == null) {
                caVar = C56544ca.f150987c;
            }
            if (caVar.f150990b != null) {
                C56544ca caVar2 = ccVar2.f151001i;
                if (caVar2 == null) {
                    caVar2 = C56544ca.f150987c;
                }
                C56590p pVar2 = caVar2.f150990b;
                if (pVar2 == null) {
                    pVar2 = C56590p.f151086c;
                }
                int a4 = C56589o.m88216a(pVar2.f151088a);
                if (a4 != 0 && a4 == 5) {
                    m76096p();
                    return;
                }
            }
            int i2 = 0;
            if (C43054c.m75960c(C68385j.m98771d(C43054c.f112610b)) && (a2 = C56545cb.m88209a(ccVar2.f150999g)) != 0 && a2 == 5) {
                C56517ba z2 = this.f112793c.mo46118z();
                if (z2.f150936a == 4) {
                    auVar = (C56510au) z2.f150937b;
                } else {
                    auVar = C56510au.f150919b;
                }
                C56513ax axVar = auVar.f150921a;
                if (axVar == null) {
                    axVar = C56513ax.f150922d;
                }
                int a5 = new C43093av(f112791a, this.f112792b.f150969e.size()).mo46157a(axVar.f150925b, ccVar2);
                if (a5 == -1) {
                    m76093m();
                } else if (a5 != this.f112792b.f150969e.size()) {
                    C43136ck ckVar = (C43136ck) this.f112793c.mo9126b();
                    if (ckVar != null) {
                        i2 = ckVar.mo46200p(a5);
                    }
                    m76095o(i2);
                } else {
                    m76096p();
                }
            } else if (!C43054c.m75960c(C68385j.m98770c(C43054c.f112610b)) || (a = C56545cb.m88209a(ccVar2.f150999g)) == 0 || a != 3) {
                m76093m();
            } else {
                C56585k kVar = C56585k.f151076f;
                if (ccVar2.f150993a == 4) {
                    cyVar = (C56568cy) ccVar2.f150994b;
                } else {
                    cyVar = C56568cy.f151042c;
                }
                C56587m mVar = cyVar.f151044a;
                if (mVar == null) {
                    mVar = C56587m.f151083b;
                }
                Iterator it = mVar.f151085a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C56585k kVar2 = (C56585k) it.next();
                    int i3 = kVar2.f151079b;
                    C56517ba z3 = this.f112793c.mo46118z();
                    if (z3.f150936a == 2) {
                        azVar = (C56515az) z3.f150937b;
                    } else {
                        azVar = C56515az.f150927b;
                    }
                    C56513ax axVar2 = azVar.f150929a;
                    if (axVar2 == null) {
                        axVar2 = C56513ax.f150922d;
                    }
                    if (i3 == axVar2.f150925b) {
                        kVar = kVar2;
                        break;
                    }
                }
                if (ccVar2.f150993a == 4) {
                    cyVar2 = (C56568cy) ccVar2.f150994b;
                } else {
                    cyVar2 = C56568cy.f151042c;
                }
                if (cyVar2.f151044a == null || (pVar = kVar.f151082e) == null) {
                    m76093m();
                    return;
                }
                int a6 = C56589o.m88216a(pVar.f151088a);
                if (a6 != 0) {
                    i = a6;
                }
                int i4 = i - 2;
                if (i4 == 2) {
                    C56590p pVar3 = kVar.f151082e;
                    if (pVar3 == null) {
                        pVar3 = C56590p.f151086c;
                    }
                    String str = pVar3.f151089b;
                    C43136ck ckVar2 = (C43136ck) this.f112793c.mo9126b();
                    if (ckVar2 != null && f112791a.containsKey(str)) {
                        i2 = ckVar2.mo46200p(((Integer) f112791a.get(str)).intValue());
                    }
                    m76095o(i2);
                } else if (i4 != 3) {
                    m76093m();
                } else {
                    m76096p();
                }
            }
        } else {
            m76093m();
        }
    }

    /* renamed from: d */
    public final void mo46190d(boolean z) {
        this.f112798h.setDescendantFocusability(true != z ? C89885b.HTTP_VALUE : 393216);
        this.f112798h.setAlpha(true != z ? 1.0f : 0.4f);
        if (z) {
            this.f112800j = this.f112807q.findViewById(R.id.survey_next).isEnabled();
        }
        m76094n(this.f112798h, !z);
    }

    /* renamed from: f */
    public final void mo46192f(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.f112807q.findViewById(R.id.survey_next);
        if (!(materialButton == null || materialButton.isEnabled() == z)) {
            materialButton.setEnabled(z);
        }
        if (C43054c.m75960c(C68368aq.m98739c(C43054c.f112610b))) {
            this.f112800j = z;
        }
    }

    /* renamed from: g */
    public final void mo46193g(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.f112807q.findViewById(R.id.survey_next);
        int i = true != z ? 8 : 0;
        if (materialButton != null) {
            materialButton.setVisibility(i);
        }
    }

    /* renamed from: h */
    public final void mo46194h() {
        MaterialButton materialButton = (MaterialButton) this.f112807q.findViewById(R.id.survey_next);
        if (materialButton != null && this.f112793c.mo46116C()) {
            materialButton.setText(R.string.survey_submit);
        }
    }

    /* renamed from: i */
    public final void mo46195i() {
        C56571da daVar;
        SurveyViewPager surveyViewPager = this.f112793c;
        if (surveyViewPager != null) {
            if (C43054c.m75960c(C68353ab.m98708c(C43054c.f112610b))) {
                C43136ck ckVar = (C43136ck) surveyViewPager.mo9126b();
                if (ckVar == null) {
                    Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
                } else {
                    if (((C43131cf) ckVar.f112817c.get(surveyViewPager.mo9122a())).f112810b == 5) {
                        return;
                    }
                }
            } else if (surveyViewPager.mo9122a() == surveyViewPager.mo9126b().mo9175k() - 1) {
                return;
            }
        }
        C56546cc ccVar = (C56546cc) this.f112792b.f150969e.get(mo46187a());
        String str = ccVar.f150997e.isEmpty() ? ccVar.f150996d : ccVar.f150997e;
        int size = ccVar.f150998f.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        for (int i = 0; i < size; i++) {
            C56573dc dcVar = (C56573dc) ccVar.f150998f.get(i);
            int i2 = dcVar.f151053a;
            if (i2 == 2) {
                if (i2 == 2) {
                    daVar = (C56571da) dcVar.f151054b;
                } else {
                    daVar = C56571da.f151048b;
                }
                int i3 = daVar.f151050a;
                String string = this.f112796f.getString(String.valueOf(i3));
                if (string != null) {
                    strArr[i] = dcVar.f151055c;
                    strArr2[i] = string;
                } else {
                    Log.e("SurveyActivityImpl", "No single-select question with ordinal " + i3 + " was found.");
                }
            }
        }
        String obj = TextUtils.replace(str, strArr, strArr2).toString();
        SurveyViewPager surveyViewPager2 = this.f112793c;
        C43071a y = surveyViewPager2.mo46117y();
        if (y != null) {
            y.mo46123f(obj);
        } else {
            surveyViewPager2.post(new C43133ch(surveyViewPager2, obj));
        }
    }

    /* renamed from: j */
    public final void mo46196j(int i) {
        Answer answer = this.f112794d;
        answer.f112635g = i;
        this.f112795e.mo46060a(answer, C43066o.m75995p(this.f112792b));
    }

    /* renamed from: k */
    public final void mo46197k() {
        this.f112807q.findViewById(R.id.survey_controls_divider).setVisibility(8);
        this.f112807q.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    /* renamed from: e */
    public final void mo46191e() {
        C56515az azVar;
        C56517ba baVar = this.f112794d.f112629a;
        int a = C56503an.m88206a(baVar.f150936a);
        if (a == 0) {
            throw null;
        } else if (a == 1) {
            Bundle bundle = this.f112796f;
            String valueOf = String.valueOf(baVar.f150938c);
            C56517ba baVar2 = this.f112794d.f112629a;
            if (baVar2.f150936a == 2) {
                azVar = (C56515az) baVar2.f150937b;
            } else {
                azVar = C56515az.f150927b;
            }
            C56513ax axVar = azVar.f150929a;
            if (axVar == null) {
                axVar = C56513ax.f150922d;
            }
            bundle.putString(valueOf, axVar.f150926c);
        }
    }
}
