package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p096h.C1951d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.C43027d;
import com.google.android.libraries.surveys.C43029f;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.libraries.surveys.internal.p3325d.C43037a;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43056e;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.p4522b.C58495hd;
import com.google.p4281bu.p4282a.C56493ad;
import com.google.p4281bu.p4282a.C56504ao;
import com.google.p4281bu.p4282a.C56511av;
import com.google.p4281bu.p4282a.C56512aw;
import com.google.p4281bu.p4282a.C56513ax;
import com.google.p4281bu.p4282a.C56514ay;
import com.google.p4281bu.p4282a.C56515az;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56526bj;
import com.google.p4281bu.p4282a.C56528bl;
import com.google.p4281bu.p4282a.C56530bn;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56544ca;
import com.google.p4281bu.p4282a.C56545cb;
import com.google.p4281bu.p4282a.C56546cc;
import com.google.p4281bu.p4282a.C56551ch;
import com.google.p4281bu.p4282a.C56565cv;
import com.google.p4281bu.p4282a.C56568cy;
import com.google.p4281bu.p4282a.C56585k;
import com.google.p4281bu.p4282a.C56587m;
import com.google.p4281bu.p4282a.C56589o;
import com.google.p4281bu.p4282a.C56590p;
import java.util.HashMap;
import java.util.Iterator;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68353ab;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68365an;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68368aq;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68385j;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68388m;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68397v;

/* renamed from: com.google.android.libraries.surveys.internal.view.at */
/* compiled from: PG */
public final class C43091at {

    /* renamed from: a */
    public static C58495hd f112684a;

    /* renamed from: b */
    public final C43090as f112685b;

    /* renamed from: c */
    public Answer f112686c;

    /* renamed from: d */
    public Context f112687d;

    /* renamed from: e */
    public Activity f112688e;

    /* renamed from: f */
    public C43154l f112689f;

    /* renamed from: g */
    public C56532bp f112690g;

    /* renamed from: h */
    public QuestionMetrics f112691h;

    /* renamed from: i */
    public C56565cv f112692i;

    /* renamed from: j */
    public C43121bw f112693j;

    /* renamed from: k */
    public C43098b f112694k;

    /* renamed from: l */
    public boolean f112695l;

    /* renamed from: m */
    public String f112696m;

    /* renamed from: n */
    public String f112697n;

    /* renamed from: o */
    public int f112698o = 0;

    /* renamed from: p */
    private View f112699p;

    /* renamed from: q */
    private ViewGroup f112700q;

    /* renamed from: r */
    private boolean f112701r = false;

    /* renamed from: s */
    private boolean f112702s;

    /* renamed from: t */
    private int f112703t;

    /* renamed from: u */
    private Integer f112704u;

    /* renamed from: v */
    private C43027d f112705v;

    /* renamed from: w */
    private String f112706w;

    public C43091at(C43090as asVar) {
        this.f112685b = asVar;
    }

    /* renamed from: l */
    public static Bundle m76039l(String str, C56532bp bpVar, C56565cv cvVar, Answer answer, Integer num, C43027d dVar, C43029f fVar) {
        Bundle bundle = new Bundle();
        bundle.putString("TriggerId", str);
        HashMap hashMap = new HashMap();
        for (C56546cc ccVar : bpVar.f150969e) {
            C56544ca caVar = ccVar.f151001i;
            if (caVar != null && !hashMap.containsKey(caVar.f150989a)) {
                C56544ca caVar2 = ccVar.f151001i;
                if (caVar2 == null) {
                    caVar2 = C56544ca.f150987c;
                }
                hashMap.put(caVar2.f150989a, Integer.valueOf(ccVar.f150995c - 1));
            }
        }
        f112684a = C58495hd.m89898l(hashMap);
        bundle.putByteArray("SurveyPayload", bpVar.toByteArray());
        bundle.putByteArray("SurveySession", cvVar.toByteArray());
        bundle.putParcelable("Answer", answer);
        bundle.putBoolean("BottomSheet", false);
        if (num != null) {
            bundle.putInt("logoResId", num.intValue());
        }
        bundle.putSerializable("SurveyCompletionCode", dVar);
        bundle.putSerializable("SurveyPromptCode", fVar);
        bundle.putString("SurveyActivityClassName", "com.google.android.libraries.surveys.internal.view.SurveyActivity");
        return bundle;
    }

    /* renamed from: m */
    private final void m76040m(View.OnClickListener onClickListener, String str) {
        ((MaterialButton) this.f112700q.findViewById(R.id.survey_next)).setOnClickListener(new C43072aa(this, onClickListener, str));
    }

    /* renamed from: n */
    private final void m76041n() {
        ((LayoutInflater) this.f112687d.getSystemService("layout_inflater")).inflate(R.layout.survey_controls, this.f112700q);
        if (!C43066o.m75997r(this.f112690g)) {
            this.f112700q.findViewById(R.id.survey_next).setVisibility(8);
        } else {
            mo46150e(false);
            MaterialButton materialButton = (MaterialButton) this.f112700q.findViewById(R.id.survey_next);
            if (materialButton != null && this.f112690g.f150969e.size() == 1) {
                materialButton.setText(R.string.survey_submit);
            }
            C43056e.m75963c(this.f112700q.findViewById(R.id.survey_controls_container), this.f112700q.findViewById(R.id.survey_next), R.dimen.survey_button_accessibility_padding, 0);
        }
        this.f112700q.findViewById(R.id.survey_controls_divider).setVisibility(8);
        this.f112700q.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    /* renamed from: o */
    private static final void m76042o(View view, String str) {
        TextView textView = (TextView) view.findViewById(R.id.survey_prompt_title_text);
        Spanned a = C1951d.m5280a(str, 0);
        textView.setText(a);
        textView.announceForAccessibility(a.toString());
    }

    /* renamed from: a */
    public final void mo46146a(C56546cc ccVar) {
        if (C43054c.m75958a()) {
            C56544ca caVar = ccVar.f151001i;
            if (caVar == null) {
                caVar = C56544ca.f150987c;
            }
            if (caVar.f150990b != null) {
                C56544ca caVar2 = ccVar.f151001i;
                if (caVar2 == null) {
                    caVar2 = C56544ca.f150987c;
                }
                C56590p pVar = caVar2.f150990b;
                if (pVar == null) {
                    pVar = C56590p.f151086c;
                }
                int a = C56589o.m88216a(pVar.f151088a);
                if (a == 0) {
                    a = 1;
                }
                if (a - 2 != 3) {
                    this.f112698o = 1;
                } else {
                    this.f112698o = this.f112690g.f150969e.size();
                }
            } else {
                this.f112698o = 1;
            }
        } else {
            this.f112698o = 1;
        }
    }

    /* renamed from: b */
    public final void mo46147b() {
        this.f112691h.mo46089a();
        if (C43054c.m75960c(C68353ab.m98708c(C43054c.f112610b)) && this.f112705v == C43027d.TOAST && (this.f112690g.f150969e.size() == 1 || C43109bk.m76070b(this.f112695l, this.f112690g, this.f112686c) || this.f112698o == this.f112690g.f150969e.size())) {
            View view = this.f112699p;
            C56493ad adVar = this.f112690g.f150966b;
            if (adVar == null) {
                adVar = C56493ad.f150888f;
            }
            Snackbar.m79661q((Context) null, view, adVar.f150890a, -1).mo48343h();
            this.f112685b.dismissAllowingStateLoss();
            return;
        }
        mo46152g();
    }

    /* renamed from: c */
    public final void mo46148c() {
        Activity activity;
        if (C43054c.f112610b != null && !this.f112701r) {
            if (!C43054c.m75959b(C68365an.f184709a.mo6453a().mo60358b(C43054c.f112610b)) || (activity = this.f112685b.getActivity()) == null || !activity.isChangingConfigurations()) {
                C43132cg.f112811a.mo46055a();
            }
        }
    }

    /* renamed from: d */
    public final void mo46149d(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f112687d.getSystemService("accessibility");
        View findViewById = view.findViewById(R.id.survey_prompt_title_text);
        if (C43054c.m75959b(C68388m.f184736a.mo6453a().mo60377a(C43054c.f112610b)) && accessibilityManager.isTouchExplorationEnabled() && findViewById != null && !findViewById.isAccessibilityFocused()) {
            findViewById.performAccessibilityAction(64, (Bundle) null);
        }
    }

    /* renamed from: e */
    public final void mo46150e(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.f112700q.findViewById(R.id.survey_next);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
    }

    /* renamed from: f */
    public final void mo46151f(C56546cc ccVar) {
        C56568cy cyVar;
        C43121bw bwVar = this.f112693j;
        C56504ao aoVar = (C56504ao) C56517ba.f150934d.createBuilder();
        if (this.f112691h.mo46091c() && bwVar.f112778a != null) {
            C56512aw awVar = (C56512aw) C56513ax.f150922d.createBuilder();
            int i = bwVar.f112779b;
            awVar.copyOnWrite();
            ((C56513ax) awVar.instance).f150925b = i;
            int i2 = bwVar.f112780c;
            awVar.copyOnWrite();
            ((C56513ax) awVar.instance).f150924a = C56511av.m88208a(i2);
            String str = bwVar.f112778a;
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
            int i3 = ccVar.f150995c;
            aoVar.copyOnWrite();
            ((C56517ba) aoVar.instance).f150938c = i3;
        }
        C56517ba baVar2 = (C56517ba) aoVar.build();
        if (baVar2 != null) {
            this.f112686c.f112629a = baVar2;
        }
        mo46146a(ccVar);
        C43121bw bwVar2 = this.f112693j;
        if (!C43054c.m75960c(C68385j.m98770c(C43054c.f112610b))) {
            this.f112698o = 1;
        } else {
            C56585k kVar = C56585k.f151076f;
            if (ccVar.f150993a == 4) {
                cyVar = (C56568cy) ccVar.f150994b;
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
                if (kVar2.f151079b == bwVar2.f112779b) {
                    kVar = kVar2;
                    break;
                }
            }
            C56590p pVar = kVar.f151082e;
            if (pVar != null) {
                int a = C56589o.m88216a(pVar.f151088a);
                if (a == 0) {
                    a = 1;
                }
                int i4 = a - 2;
                if (i4 == 2) {
                    C56590p pVar2 = kVar.f151082e;
                    if (pVar2 == null) {
                        pVar2 = C56590p.f151086c;
                    }
                    String str2 = pVar2.f151089b;
                    this.f112698o = f112684a.containsKey(str2) ? ((Integer) f112684a.get(str2)).intValue() : 0;
                } else if (i4 != 3) {
                    this.f112698o = 1;
                } else {
                    this.f112698o = this.f112690g.f150969e.size();
                }
            }
        }
        mo46147b();
    }

    /* renamed from: g */
    public final void mo46152g() {
        Activity activity = this.f112685b.getActivity();
        String str = this.f112696m;
        C56532bp bpVar = this.f112690g;
        C56565cv cvVar = this.f112692i;
        Answer answer = this.f112686c;
        Integer valueOf = Integer.valueOf(this.f112703t);
        boolean z = this.f112702s;
        boolean z2 = this.f112695l;
        Integer num = this.f112704u;
        C43027d dVar = this.f112705v;
        String str2 = this.f112706w;
        int i = this.f112698o;
        HashMap hashMap = new HashMap();
        Iterator it = bpVar.f150969e.iterator();
        while (it.hasNext()) {
            C56546cc ccVar = (C56546cc) it.next();
            Iterator it2 = it;
            C56544ca caVar = ccVar.f151001i;
            if (caVar != null && !hashMap.containsKey(caVar.f150989a)) {
                C56544ca caVar2 = ccVar.f151001i;
                if (caVar2 == null) {
                    caVar2 = C56544ca.f150987c;
                }
                hashMap.put(caVar2.f150989a, Integer.valueOf(ccVar.f150995c - 1));
            }
            it = it2;
        }
        C43129cd.f112791a = C58495hd.m89898l(hashMap);
        Intent intent = new Intent(activity, C43129cd.class);
        intent.setClassName(activity, str2);
        intent.putExtra("TriggerId", str);
        intent.putExtra("SurveyPayload", bpVar.toByteArray());
        intent.putExtra("SurveySession", cvVar.toByteArray());
        intent.putExtra("Answer", answer);
        intent.putExtra("IsFullWidth", z);
        intent.putExtra("IgnoreFirstQuestion", z2);
        if (num != null) {
            intent.putExtra("LogoResId", num);
        }
        intent.putExtra("IsSubmitting", false);
        intent.putExtra("SurveyCompletionStyle", dVar);
        intent.putExtra("StartingQuestionIndex", i);
        int i2 = C43066o.f112626a;
        activity.startActivityForResult(intent, valueOf.intValue());
        this.f112701r = true;
        Context context = this.f112687d;
        String str3 = this.f112696m;
        C56565cv cvVar2 = this.f112692i;
        boolean p = C43066o.m75995p(this.f112690g);
        Answer answer2 = this.f112686c;
        answer2.f112635g = 3;
        new C43037a(context, str3, cvVar2).mo46060a(answer2, p);
        this.f112685b.dismissAllowingStateLoss();
    }

    /* renamed from: h */
    public final void mo46153h(Context context, String str, C56565cv cvVar, boolean z) {
        Answer answer = this.f112686c;
        answer.f112635g = 4;
        new C43037a(context, str, cvVar).mo46060a(answer, z);
    }

    /* renamed from: i */
    public final void mo46154i(Context context, String str, C56565cv cvVar, boolean z) {
        Answer answer = this.f112686c;
        answer.f112635g = 6;
        new C43037a(context, str, cvVar).mo46060a(answer, z);
    }

    /* renamed from: j */
    public final void mo46155j() {
        if (C43054c.f112610b == null) {
            this.f112685b.dismissAllowingStateLoss();
        }
    }

    /* renamed from: k */
    public final View mo46156k(ViewGroup viewGroup) {
        C56568cy cyVar;
        C56528bl blVar;
        C56551ch chVar;
        C56530bn bnVar;
        C56532bp bpVar;
        this.f112688e = this.f112685b.getActivity();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f112688e, R.style.SurveyTheme);
        this.f112687d = contextThemeWrapper;
        LayoutInflater layoutInflater = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        Bundle arguments = this.f112685b.getArguments();
        this.f112696m = arguments.getString("TriggerId");
        this.f112703t = arguments.getInt("RequestCode", -1);
        this.f112686c = (Answer) arguments.getParcelable("Answer");
        this.f112702s = arguments.getBoolean("BottomSheet");
        this.f112706w = arguments.getString("SurveyActivityClassName");
        this.f112704u = arguments.containsKey("logoResId") ? Integer.valueOf(arguments.getInt("logoResId", 0)) : null;
        this.f112705v = (C43027d) arguments.getSerializable("SurveyCompletionCode");
        C43029f fVar = (C43029f) arguments.getSerializable("SurveyPromptCode");
        if (C43054c.m75959b(C68397v.m98790c(C43054c.f112610b))) {
            this.f112690g = null;
            byte[] byteArray = arguments.getByteArray("SurveyPayload");
            if (byteArray != null) {
                this.f112690g = (C56532bp) C43066o.m75983d(C56532bp.f150963g, byteArray);
            }
            this.f112692i = null;
            byte[] byteArray2 = arguments.getByteArray("SurveySession");
            if (byteArray2 != null) {
                this.f112692i = (C56565cv) C43066o.m75983d(C56565cv.f151038c, byteArray2);
            }
            if (this.f112696m == null || (bpVar = this.f112690g) == null || bpVar.f150969e.size() == 0 || this.f112686c == null || this.f112692i == null) {
                Log.e("SurveyPromptDialogDel", "Required EXTRAS not found in the intent, bailing out.");
                return null;
            }
        } else {
            this.f112690g = (C56532bp) C43066o.m75983d(C56532bp.f150963g, arguments.getByteArray("SurveyPayload"));
            this.f112692i = (C56565cv) C43066o.m75983d(C56565cv.f151038c, arguments.getByteArray("SurveySession"));
        }
        if (this.f112685b.getShowsDialog()) {
            this.f112685b.getDialog().requestWindowFeature(1);
        }
        Context context = this.f112687d;
        String str = this.f112696m;
        C56565cv cvVar = this.f112692i;
        boolean p = C43066o.m75995p(this.f112690g);
        Answer answer = this.f112686c;
        answer.f112635g = 2;
        new C43037a(context, str, cvVar).mo46060a(answer, p);
        C43132cg.f112811a.mo46056b();
        this.f112699p = layoutInflater.inflate(R.layout.survey_prompt_banner, viewGroup, false);
        C43054c.m75960c(C68368aq.m98739c(C43054c.f112610b));
        this.f112700q = (ViewGroup) this.f112699p.findViewById(R.id.survey_prompt_banner_container);
        C43056e.m75962b((ImageView) this.f112699p.findViewById(R.id.survey_prompt_banner_logo), this.f112704u);
        Answer answer2 = this.f112686c;
        String str2 = (answer2 == null || TextUtils.isEmpty(answer2.f112630b)) ? null : this.f112686c.f112630b;
        if (!C43054c.m75960c(C68353ab.m98708c(C43054c.f112610b)) || fVar != C43029f.FIRST_CARD_MODAL) {
            C56526bj bjVar = this.f112690g.f150965a;
            if (bjVar == null) {
                bjVar = C56526bj.f150952c;
            }
            if (bjVar.f150954a) {
                this.f112695l = false;
                View view = this.f112699p;
                C56526bj bjVar2 = this.f112690g.f150965a;
                if (bjVar2 == null) {
                    bjVar2 = C56526bj.f150952c;
                }
                m76042o(view, bjVar2.f150955b);
                C43098b bVar = new C43098b(this.f112687d);
                this.f112694k = bVar;
                bVar.f112718a.setOnClickListener(new C43083al(this));
                this.f112694k.f112719b.setOnClickListener(new C43084am(this));
                this.f112700q.addView(this.f112694k);
                ImageButton imageButton = (ImageButton) this.f112699p.findViewById(R.id.survey_close_button);
                imageButton.setImageDrawable(C43066o.m75998s(this.f112687d));
                imageButton.setOnClickListener(new C43085an(this, str2));
            } else {
                this.f112695l = true;
                C56546cc ccVar = (C56546cc) this.f112690g.f150969e.get(0);
                m76042o(this.f112699p, ccVar.f150997e.isEmpty() ? ccVar.f150996d : ccVar.f150997e);
                int a = C56545cb.m88209a(ccVar.f150999g);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 2;
                if (i == 1) {
                    QuestionMetrics questionMetrics = new QuestionMetrics();
                    this.f112691h = questionMetrics;
                    questionMetrics.mo46090b();
                    C56546cc ccVar2 = (C56546cc) this.f112690g.f150969e.get(0);
                    C43122bx bxVar = new C43122bx(this.f112687d);
                    bxVar.f112783a = new C43078ag(this, ccVar2);
                    if (ccVar2.f150993a == 4) {
                        cyVar = (C56568cy) ccVar2.f150994b;
                    } else {
                        cyVar = C56568cy.f151042c;
                    }
                    bxVar.mo46182a(cyVar);
                    this.f112700q.addView(bxVar);
                    m76041n();
                    m76040m(new C43079ah(this, ccVar2), str2);
                    ImageButton imageButton2 = (ImageButton) this.f112699p.findViewById(R.id.survey_close_button);
                    imageButton2.setImageDrawable(C43066o.m75998s(this.f112687d));
                    imageButton2.setOnClickListener(new C43080ai(this, bxVar, str2));
                } else if (i == 2) {
                    QuestionMetrics questionMetrics2 = new QuestionMetrics();
                    this.f112691h = questionMetrics2;
                    questionMetrics2.mo46090b();
                    C56546cc ccVar3 = (C56546cc) this.f112690g.f150969e.get(0);
                    C43156n nVar = new C43156n(this.f112687d);
                    nVar.f112855c = new C43086ao(this);
                    if (ccVar3.f150993a == 5) {
                        blVar = (C56528bl) ccVar3.f150994b;
                    } else {
                        blVar = C56528bl.f150956b;
                    }
                    nVar.mo46215a(blVar, (boolean[]) null);
                    this.f112700q.addView(nVar);
                    m76041n();
                    m76040m(new C43087ap(this, ccVar3), str2);
                    ImageButton imageButton3 = (ImageButton) this.f112699p.findViewById(R.id.survey_close_button);
                    imageButton3.setImageDrawable(C43066o.m75998s(this.f112687d));
                    imageButton3.setOnClickListener(new C43088aq(this, nVar, str2));
                } else if (i == 3) {
                    QuestionMetrics questionMetrics3 = new QuestionMetrics();
                    this.f112691h = questionMetrics3;
                    questionMetrics3.mo46090b();
                    C56546cc ccVar4 = (C56546cc) this.f112690g.f150969e.get(0);
                    C43108bj bjVar3 = new C43108bj(this.f112687d);
                    if (ccVar4.f150993a == 6) {
                        chVar = (C56551ch) ccVar4.f150994b;
                    } else {
                        chVar = C56551ch.f151006g;
                    }
                    bjVar3.mo46169c(chVar);
                    bjVar3.f112747a = new C43081aj(this, ccVar4);
                    this.f112700q.addView(bjVar3);
                    m76041n();
                    this.f112700q.findViewById(R.id.survey_next).setVisibility(8);
                    ImageButton imageButton4 = (ImageButton) this.f112699p.findViewById(R.id.survey_close_button);
                    imageButton4.setImageDrawable(C43066o.m75998s(this.f112687d));
                    imageButton4.setOnClickListener(new C43082ak(this, bjVar3, str2));
                } else if (i != 4) {
                    Log.e("SurveyPromptDialogDel", "Error, unknown question type encountered.");
                } else {
                    QuestionMetrics questionMetrics4 = new QuestionMetrics();
                    this.f112691h = questionMetrics4;
                    questionMetrics4.mo46090b();
                    C56546cc ccVar5 = (C56546cc) this.f112690g.f150969e.get(0);
                    C43164v vVar = new C43164v(this.f112687d);
                    if (ccVar5.f150993a == 7) {
                        bnVar = (C56530bn) ccVar5.f150994b;
                    } else {
                        bnVar = C56530bn.f150959c;
                    }
                    vVar.mo46219a(bnVar);
                    vVar.f112860a = new C43075ad(this);
                    this.f112700q.addView(vVar);
                    m76041n();
                    mo46150e(true);
                    m76040m(new C43076ae(this, ccVar5), str2);
                    ImageButton imageButton5 = (ImageButton) this.f112699p.findViewById(R.id.survey_close_button);
                    imageButton5.setImageDrawable(C43066o.m75998s(this.f112687d));
                    imageButton5.setOnClickListener(new C43077af(this, str2));
                }
            }
            C43066o.m75990k(this.f112685b.getActivity(), (TextView) this.f112699p.findViewById(R.id.survey_legal_text), str2, new C43089ar(this, str2));
            this.f112699p.setOnKeyListener(new C43073ab(this));
            this.f112699p.setOnTouchListener(C43074ac.f112654a);
            return this.f112699p;
        }
        mo46152g();
        return this.f112699p;
    }
}
