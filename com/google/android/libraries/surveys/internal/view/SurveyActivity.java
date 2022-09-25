package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0395p;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.C43027d;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.p3325d.C43037a;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.p4281bu.p4282a.C56526bj;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56565cv;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68368aq;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68397v;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68400y;

/* compiled from: PG */
public class SurveyActivity extends C0395p implements C43130ce {

    /* renamed from: j */
    private C43129cd f112646j;

    /* renamed from: a */
    public final void mo46104a() {
        this.f112646j.mo46189c();
    }

    /* renamed from: b */
    public final void mo46105b(boolean z) {
        this.f112646j.mo46192f(z);
    }

    /* renamed from: c */
    public final void mo46106c() {
        this.f112646j.mo46193g(false);
    }

    /* renamed from: d */
    public final void mo46107d(boolean z, Fragment fragment) {
        C43129cd cdVar = this.f112646j;
        if (!cdVar.f112799i && C43136ck.m76111o(fragment) == cdVar.f112793c.mo9122a()) {
            cdVar.mo46192f(z);
        }
    }

    public final void onBackPressed() {
        C43129cd cdVar = this.f112646j;
        cdVar.mo46196j(6);
        if (cdVar.f112799i) {
            cdVar.f112807q.setResult(-1, new Intent().putExtra("EXTRA_BACK_BUTTON_PRESSED", true));
        }
        cdVar.f112807q.finish();
        this.f2707h.mo3340c();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C56565cv cvVar;
        C56532bp bpVar;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        C43129cd cdVar = new C43129cd(this, mo545jw());
        this.f112646j = cdVar;
        if (C43054c.f112610b == null) {
            cdVar.f112807q.finish();
            return;
        }
        Intent intent = cdVar.f112807q.getIntent();
        if (intent.getBooleanExtra("IsDismissing", false)) {
            cdVar.f112807q.finish();
            return;
        }
        cdVar.f112807q.setTitle(BuildConfig.FLAVOR);
        String stringExtra = intent.getStringExtra("TriggerId");
        String str = null;
        cdVar.f112792b = null;
        if (C43054c.m75959b(C68397v.m98790c(C43054c.f112610b))) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("SurveyPayload");
            if (byteArrayExtra != null) {
                cdVar.f112792b = (C56532bp) C43066o.m75983d(C56532bp.f150963g, byteArrayExtra);
            }
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("SurveySession");
            cvVar = byteArrayExtra2 != null ? (C56565cv) C43066o.m75983d(C56565cv.f151038c, byteArrayExtra2) : null;
        } else {
            cdVar.f112792b = (C56532bp) C43066o.m75983d(C56532bp.f150963g, intent.getByteArrayExtra("SurveyPayload"));
            cvVar = (C56565cv) C43066o.m75983d(C56565cv.f151038c, intent.getByteArrayExtra("SurveySession"));
        }
        if (bundle2 != null) {
            cdVar.f112794d = (Answer) bundle2.getParcelable("Answer");
            cdVar.f112799i = bundle2.getBoolean("IsSubmitting");
            cdVar.f112796f = bundle2.getBundle("SingleSelectOrdinalAnswerMappings");
            if (cdVar.f112796f == null) {
                cdVar.f112796f = new Bundle();
            }
        } else {
            cdVar.f112794d = (Answer) intent.getParcelableExtra("Answer");
            cdVar.f112799i = intent.getBooleanExtra("IsSubmitting", false);
        }
        cdVar.f112805o = intent.getBooleanExtra("IgnoreFirstQuestion", false);
        cdVar.f112804n = intent.hasExtra("LogoResId") ? Integer.valueOf(intent.getIntExtra("LogoResId", 0)) : null;
        if (stringExtra == null || (bpVar = cdVar.f112792b) == null || bpVar.f150969e.size() == 0 || cdVar.f112794d == null || cvVar == null) {
            Log.e("SurveyActivityImpl", "Required EXTRAS not found in the intent, bailing out.");
            cdVar.f112807q.finish();
            return;
        }
        C56526bj bjVar = cdVar.f112792b.f150965a;
        if (bjVar == null) {
            bjVar = C56526bj.f150952c;
        }
        boolean z = bjVar.f150954a || cdVar.f112805o;
        if (bundle2 != null || !z) {
            C43132cg.f112811a.mo46056b();
        }
        int i = C43066o.f112626a;
        Activity activity = cdVar.f112807q;
        cdVar.f112795e = new C43037a(activity, stringExtra, cvVar);
        activity.setContentView(R.layout.survey_container);
        cdVar.f112798h = (LinearLayout) cdVar.f112807q.findViewById(R.id.survey_container);
        cdVar.f112797g = (MaterialCardView) cdVar.f112807q.findViewById(R.id.survey_overall_container);
        cdVar.f112807q.findViewById(R.id.survey_main_scroll_view).setFocusable(false);
        if (!TextUtils.isEmpty(cdVar.f112794d.f112630b)) {
            str = cdVar.f112794d.f112630b;
        }
        ImageButton imageButton = (ImageButton) cdVar.f112807q.findViewById(R.id.survey_close_button);
        imageButton.setImageDrawable(C43066o.m75998s(cdVar.f112807q));
        imageButton.setOnClickListener(new C43128cc(cdVar, str));
        cdVar.f112801k = intent.getIntExtra("StartingQuestionIndex", 1);
        boolean r = C43066o.m75997r(cdVar.f112792b);
        cdVar.f112807q.getLayoutInflater().inflate(R.layout.survey_controls, cdVar.f112798h);
        if (C43054c.m75959b(C68400y.m98798d(C43054c.f112610b))) {
            cdVar.mo46193g(r);
        } else if (!r) {
            cdVar.mo46193g(false);
        }
        if (z) {
            cdVar.mo46197k();
        } else {
            C43127cb cbVar = new C43127cb(cdVar, str);
            Activity activity2 = cdVar.f112807q;
            C43066o.m75990k(activity2, (TextView) activity2.findViewById(R.id.survey_controls_legal_text), str, cbVar);
        }
        cdVar.f112806p = (C43027d) intent.getSerializableExtra("SurveyCompletionStyle");
        C43027d dVar = cdVar.f112806p;
        FragmentManager fragmentManager = cdVar.f112808r;
        C56532bp bpVar2 = cdVar.f112792b;
        Integer num = cdVar.f112804n;
        boolean z2 = cdVar.f112805o;
        C43136ck ckVar = new C43136ck(fragmentManager, bpVar2, num, z2, C43109bk.m76070b(z2, bpVar2, cdVar.f112794d), dVar, cdVar.f112801k);
        cdVar.f112793c = (SurveyViewPager) cdVar.f112807q.findViewById(R.id.survey_viewpager);
        cdVar.f112793c.mo9146k(ckVar);
        cdVar.f112793c.setImportantForAccessibility(2);
        if (bundle2 != null) {
            cdVar.f112793c.mo9147l(bundle2.getInt("CurrentQuestionIndexForViewPager"));
        }
        if (r) {
            cdVar.mo46194h();
        }
        cdVar.f112798h.setVisibility(0);
        cdVar.f112798h.forceLayout();
        if (cdVar.f112805o) {
            cdVar.mo46191e();
            cdVar.mo46195i();
            cdVar.mo46196j(5);
        }
        if (r) {
            ((MaterialButton) cdVar.f112807q.findViewById(R.id.survey_next)).setOnClickListener(new C43126ca(cdVar, str));
        }
        Window window = cdVar.f112807q.getWindow();
        window.addFlags(2);
        window.clearFlags(32);
        window.addFlags(C89885b.HTTP_VALUE);
        window.setDimAmount(0.4f);
        cdVar.f112807q.findViewById(R.id.survey_close_button).setVisibility(0);
        SurveyViewPager surveyViewPager = cdVar.f112793c;
        if (surveyViewPager != null && surveyViewPager.mo46115B()) {
            C56526bj bjVar2 = cdVar.f112792b.f150965a;
            if (bjVar2 == null) {
                bjVar2 = C56526bj.f150952c;
            }
            if (!bjVar2.f150954a) {
                cdVar.mo46196j(2);
            }
        }
        if (C43054c.m75960c(C68368aq.m98739c(C43054c.f112610b)) && intent.hasExtra("IsPausing")) {
            MaterialButton materialButton = (MaterialButton) cdVar.f112807q.findViewById(R.id.survey_next);
            if (materialButton != null) {
                cdVar.f112800j = materialButton.isEnabled();
            }
            cdVar.mo46190d(intent.getBooleanExtra("IsPausing", false));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        C43129cd cdVar = this.f112646j;
        if (C43054c.f112610b != null) {
            if (cdVar.f112807q.isFinishing()) {
                C43132cg.f112811a.mo46055a();
            }
            cdVar.f112802l.removeCallbacks(cdVar.f112803m);
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C43129cd cdVar = this.f112646j;
        if (intent.getBooleanExtra("IsDismissing", false)) {
            cdVar.f112807q.finish();
        }
        if (C43054c.m75960c(C68368aq.m98739c(C43054c.f112610b)) && intent.hasExtra("IsPausing")) {
            cdVar.mo46190d(intent.getBooleanExtra("IsPausing", false));
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C43129cd cdVar = this.f112646j;
        if (C43054c.m75959b(C68400y.m98798d(C43054c.f112610b))) {
            SurveyViewPager surveyViewPager = cdVar.f112793c;
            bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.mo9122a() : 0);
        } else {
            bundle.putInt("CurrentQuestionIndexForViewPager", cdVar.mo46187a());
        }
        bundle.putBoolean("IsSubmitting", cdVar.f112799i);
        bundle.putParcelable("Answer", cdVar.f112794d);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", cdVar.f112796f);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C43129cd cdVar = this.f112646j;
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            cdVar.f112797g.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && cdVar.f112799i) {
                int i = C43066o.f112626a;
                cdVar.f112807q.finish();
                return true;
            }
        }
        return cdVar.f112807q.onTouchEvent(motionEvent);
    }

    /* renamed from: v */
    public final Activity mo46109v() {
        return this;
    }

    /* renamed from: w */
    public final void mo46110w() {
        this.f112646j.mo46188b();
    }

    /* renamed from: x */
    public final void mo46111x() {
        ImageButton imageButton = (ImageButton) this.f112646j.f112807q.findViewById(R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    /* renamed from: y */
    public final boolean mo46112y() {
        return C43066o.m75997r(this.f112646j.f112792b);
    }
}
