package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107474am;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107475an;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113600m;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class InterpreterMainTextView extends RelativeLayout {

    /* renamed from: a */
    public static final C59071e f314755a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.util.InterpreterMainTextView");

    /* renamed from: b */
    public static final ComponentName f314756b = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.pronunciationlearning.PronunciationLearningActivity");

    /* renamed from: A */
    public int f314757A = 1;

    /* renamed from: c */
    public final Animation f314758c;

    /* renamed from: d */
    public String f314759d;

    /* renamed from: e */
    public String f314760e;

    /* renamed from: f */
    public String f314761f;

    /* renamed from: g */
    public String f314762g;

    /* renamed from: h */
    public String f314763h;

    /* renamed from: i */
    public String f314764i;

    /* renamed from: j */
    public String f314765j;

    /* renamed from: k */
    public String f314766k;

    /* renamed from: l */
    public String f314767l;

    /* renamed from: m */
    public String f314768m;

    /* renamed from: n */
    public String f314769n;

    /* renamed from: o */
    public long f314770o = 0;

    /* renamed from: p */
    public C113668at f314771p;

    /* renamed from: q */
    public boolean f314772q;

    /* renamed from: r */
    public boolean f314773r;

    /* renamed from: s */
    public long f314774s;

    /* renamed from: t */
    public Runnable f314775t;

    /* renamed from: u */
    public C21370a f314776u;

    /* renamed from: v */
    public ValueAnimator f314777v;

    /* renamed from: w */
    public String f314778w;

    /* renamed from: x */
    public C86124t f314779x;

    /* renamed from: y */
    public C113600m f314780y;

    /* renamed from: z */
    public int f314781z = 1;

    public InterpreterMainTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.interpreter_main_text, this, true);
        StreamingTextView n = mo100426n();
        n.setMovementMethod(new ScrollingMovementMethod());
        mo100422j().setMovementMethod(new ScrollingMovementMethod());
        mo100425m().setMovementMethod(new ScrollingMovementMethod());
        n.f241132b = true;
        n.f241131a = C19391a.m36980a(getContext(), R.attr.colorHairline);
        this.f314758c = AnimationUtils.loadAnimation(context, R.anim.interpreter_mode_change_fade_out);
    }

    /* renamed from: C */
    private final String m188184C() {
        int i = this.f314781z;
        if (i == 3) {
            return this.f314764i;
        }
        if (i == 4) {
            return this.f314765j;
        }
        if (!(i == 5 || i == 6)) {
            C59104x c = f314755a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c).mo56372aa(28253)).mo56386p("shouldn't happen");
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: D */
    private final boolean m188185D() {
        C58976aa aaVar = C58975e.f156826a;
        C21370a aVar = this.f314776u;
        return aVar != null && this.f314781z == 2 && this.f314770o > 0 && this.f314774s != 0 && aVar.mo26871c() - this.f314774s < this.f314770o;
    }

    /* renamed from: E */
    private final void m188186E(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i == 3 || i == 5) {
            mo100423k().setText(this.f314759d);
            mo100424l().setText(this.f314760e);
            mo100423k().setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
            mo100424l().setTextColor(C19391a.m36980a(getContext(), R.attr.colorSecondary));
        } else if (i == 4 || i == 6) {
            mo100423k().setText(this.f314760e);
            mo100424l().setText(this.f314759d);
            mo100423k().setTextColor(C19391a.m36980a(getContext(), R.attr.colorSecondary));
            mo100424l().setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
        } else {
            mo100423k().setText(BuildConfig.FLAVOR);
            mo100424l().setText(BuildConfig.FLAVOR);
        }
    }

    /* renamed from: r */
    public static String m188187r(C51910dq dqVar) {
        String str = dqVar.f136166f;
        String str2 = dqVar.f136167g;
        String valueOf = String.valueOf(dqVar.f136168h);
        String valueOf2 = String.valueOf(str.hashCode());
        String valueOf3 = String.valueOf(str2.hashCode());
        return valueOf + ":" + valueOf2 + valueOf3;
    }

    /* renamed from: A */
    public final void mo100411A(String str) {
        if (C113672ax.m188248c(str, this.f314761f)) {
            m188186E(3);
        } else if (C113672ax.m188248c(str, this.f314762g)) {
            m188186E(4);
        } else {
            C59104x c = f314755a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c).mo56372aa(28281)).mo56359L("Unrecognized language: %s, sourceLangCode: %s, targetLangCode: %s", str, this.f314761f, this.f314762g);
        }
    }

    /* renamed from: B */
    public final void mo100412B(int i, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        int i2 = this.f314781z;
        this.f314757A = i2;
        if (i2 != i) {
            this.f314781z = i;
            if (!z) {
                m188186E(i);
                this.f314771p = C113668at.CLEARED;
                mo100430s();
            }
        }
    }

    /* renamed from: a */
    public final float mo100413a(boolean z) {
        if (z) {
            return 0.0f;
        }
        return (float) getResources().getDimensionPixelSize(R.dimen.interpreter_slide_delta_y);
    }

    /* renamed from: b */
    public final Animation mo100414b(boolean z) {
        Animation c = mo100415c(z);
        c.setDuration((long) getResources().getInteger(R.integer.slide_in_duration_millis));
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(c);
        animationSet.addAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.interpreter_fade_in));
        animationSet.setRepeatCount(0);
        return animationSet;
    }

    /* renamed from: c */
    public final Animation mo100415c(boolean z) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, mo100413a(z), 0, 0.0f);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setDuration((long) getResources().getInteger(R.integer.slide_in_duration_millis));
        translateAnimation.setInterpolator(mo100416d());
        return translateAnimation;
    }

    /* renamed from: d */
    public final Interpolator mo100416d() {
        return AnimationUtils.loadInterpolator(getContext(), R.interpolator.cubic_bezier_interpolator);
    }

    /* renamed from: e */
    public final ImageView mo100417e() {
        return (ImageView) findViewById(R.id.output_text_copy_button);
    }

    /* renamed from: f */
    public final ImageView mo100418f() {
        return (ImageView) findViewById(R.id.output_text_tts_button);
    }

    /* renamed from: g */
    public final LinearLayout mo100419g() {
        return (LinearLayout) findViewById(R.id.auto_waiting);
    }

    /* renamed from: h */
    public final RelativeLayout mo100420h() {
        return (RelativeLayout) findViewById(R.id.input_box);
    }

    /* renamed from: i */
    public final RelativeLayout mo100421i() {
        return (RelativeLayout) findViewById(R.id.output_box);
    }

    /* renamed from: j */
    public final TextView mo100422j() {
        return (TextView) findViewById(R.id.input_text_fixed);
    }

    /* renamed from: k */
    public final TextView mo100423k() {
        return (TextView) findViewById(R.id.input_lang_name);
    }

    /* renamed from: l */
    public final TextView mo100424l() {
        return (TextView) findViewById(R.id.output_lang_name);
    }

    /* renamed from: m */
    public final TextView mo100425m() {
        return (TextView) findViewById(R.id.output_text);
    }

    /* renamed from: n */
    public final StreamingTextView mo100426n() {
        return (StreamingTextView) findViewById(R.id.input_text);
    }

    /* renamed from: o */
    public final InterpreterAlternativeTranslationsView mo100427o() {
        return (InterpreterAlternativeTranslationsView) findViewById(R.id.interpreter_alternative_translations);
    }

    /* renamed from: p */
    public final InterpreterListeningBoxesView mo100428p() {
        return (InterpreterListeningBoxesView) findViewById(R.id.interpreter_listening_boxes_view);
    }

    /* renamed from: q */
    public final InterpreterSmartRepliesView mo100429q() {
        return (InterpreterSmartRepliesView) findViewById(R.id.interpreter_smart_replies);
    }

    /* renamed from: s */
    public final void mo100430s() {
        C58976aa aaVar = C58975e.f156826a;
        this.f314774s = 0;
        this.f314775t = null;
        mo100425m().setText(BuildConfig.FLAVOR);
        mo100426n().mo82924c(BuildConfig.FLAVOR);
        mo100420h().setVisibility(8);
        findViewById(R.id.text_box_separator).setVisibility(8);
        mo100421i().setVisibility(8);
        InterpreterAlternativeTranslationsView o = mo100427o();
        o.setVisibility(8);
        o.mo100368a().setVisibility(8);
        o.findViewById(R.id.alternative_translation_scroll_view).setVisibility(8);
        o.mo100368a().setAlpha(1.0f);
        o.findViewById(R.id.alternative_translation_scroll_view).setAlpha(1.0f);
        InterpreterSmartRepliesView q = mo100429q();
        q.setVisibility(8);
        q.setAlpha(1.0f);
        mo100419g().setVisibility(8);
        mo100420h().setAlpha(1.0f);
        mo100421i().setAlpha(1.0f);
        findViewById(R.id.text_box_separator).setAlpha(1.0f);
        mo100419g().setAlpha(1.0f);
        mo100426n().setAlpha(1.0f);
        mo100425m().setAlpha(1.0f);
        mo100426n().setHeight(-2);
        mo100426n().setMaxHeight(Integer.MAX_VALUE);
        this.f314766k = BuildConfig.FLAVOR;
        this.f314767l = null;
        mo100426n().getPaint().setShader((Shader) null);
        mo100425m().getPaint().setShader((Shader) null);
        this.f314773r = false;
    }

    /* renamed from: t */
    public final void mo100431t(TextView textView, int i) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.interpreter_greyed_out_text_region);
        int maxHeight = textView.getMaxHeight();
        if (maxHeight <= 0 || maxHeight == Integer.MAX_VALUE) {
            C59104x c = f314755a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c).mo56372aa(28255)).mo56386p("No max height on TextView");
            return;
        }
        textView.setOnScrollChangeListener(new C113660al(this, textView, i));
        int a = C19391a.m36980a(getContext(), R.attr.colorHairline);
        int scrollY = (textView.getScrollY() + maxHeight) - dimensionPixelSize;
        textView.getPaint().setShader(new LinearGradient(0.0f, (float) scrollY, 0.0f, (float) (scrollY + dimensionPixelSize), i, a, Shader.TileMode.CLAMP));
    }

    /* renamed from: u */
    public final void mo100432u(String str, String str2) {
        if (str.isEmpty()) {
            C59104x c = f314755a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c).mo56372aa(28258)).mo56386p("No text to TTS");
        } else if (str2.isEmpty()) {
            C59104x c2 = f314755a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c2).mo56372aa(28257)).mo56386p("No language set for TTS");
        } else {
            if (this.f314772q) {
                C113613z zVar = this.f314780y.f314531a;
                C107474am amVar = (C107474am) C107475an.f299054e.createBuilder();
                amVar.copyOnWrite();
                C107475an anVar = (C107475an) amVar.instance;
                anVar.f299056a |= 4;
                anVar.f299059d = true;
                zVar.f314576d.mo96219b(C113613z.m188059d((C107475an) amVar.build()));
            }
            if (!this.f314772q) {
                C113600m mVar = this.f314780y;
                C59104x b = C113613z.f314555a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "InterpreterCtrl");
                ((C59052c) ((C59052c) b).mo56372aa(27997)).mo56386p("Requesting TTS");
                mVar.f314531a.mo100339l();
                C113613z.m188060e(mVar.f314531a.f314584l).mo100381j();
                mVar.f314531a.mo100348w(str, str2);
            }
        }
    }

    /* renamed from: v */
    public final void mo100433v() {
        C58976aa aaVar = C58975e.f156826a;
        setVisibility(8);
        mo100435x();
        this.f314773r = false;
    }

    /* renamed from: w */
    public final void mo100434w(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314771p = C113668at.FINAL_TRANSCRIPT;
        mo100430s();
        if (!C58837ba.m90859h(str2)) {
            mo100411A(str2);
        }
        StreamingTextView n = mo100426n();
        n.getPaint().setShader((Shader) null);
        n.setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurface));
        n.mo82924c(str);
        mo100420h().setVisibility(0);
        mo100423k().setVisibility(0);
        mo100428p().mo100409a();
    }

    /* renamed from: x */
    public final void mo100435x() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314781z == 1) {
            C59104x c = f314755a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c).mo56372aa(28268)).mo56386p("User Input Mode is not set");
        } else if (this.f314771p != C113668at.INSTRUCTION) {
            this.f314771p = C113668at.INSTRUCTION;
            m188186E(this.f314781z);
            mo100430s();
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.interpreter_fade_in);
            loadAnimation.setStartOffset((long) getContext().getResources().getInteger(R.integer.fade_out_duration_millis));
            if (this.f314781z == 2) {
                ((TextView) findViewById(R.id.auto_source_waiting)).setText(this.f314764i);
                ((TextView) findViewById(R.id.auto_target_waiting)).setText(this.f314765j);
                mo100419g().startAnimation(loadAnimation);
                mo100419g().setVisibility(0);
                return;
            }
            StreamingTextView n = mo100426n();
            n.getPaint().setShader((Shader) null);
            n.setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant));
            n.mo82924c(m188184C());
            mo100420h().startAnimation(loadAnimation);
            mo100420h().setVisibility(0);
            mo100423k().setAlpha(1.0f);
            mo100423k().setVisibility(0);
            mo100428p().mo100409a();
        }
    }

    /* renamed from: y */
    public final void mo100436y() {
        C58976aa aaVar = C58975e.f156826a;
        mo100422j().setVisibility(8);
        mo100426n().setVisibility(0);
        if (this.f314771p != C113668at.RECORDING) {
            if (m188185D()) {
                this.f314775t = new C113651ac(this);
                return;
            }
            this.f314771p = C113668at.RECORDING;
            m188186E(this.f314781z);
            mo100430s();
            if (this.f314781z == 2) {
                mo100423k().startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.interpreter_fade_out));
                mo100426n().startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.interpreter_fade_out));
                InterpreterListeningBoxesView p = mo100428p();
                if (!p.f314749c) {
                    p.removeAllViews();
                    p.f314749c = true;
                    if (p.f314748b == null) {
                        C59104x c = InterpreterListeningBoxesView.f314747a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "InterpreterLstnBoxVw");
                        ((C59052c) ((C59052c) c).mo56372aa(28240)).mo56386p("No language name box!");
                    } else {
                        Animation loadAnimation = AnimationUtils.loadAnimation(p.getContext(), R.anim.auto_listening_box_fade_in);
                        loadAnimation.setAnimationListener(new C113649aa(p));
                        p.f314748b.startAnimation(loadAnimation);
                        p.f314748b.setVisibility(0);
                        p.setVisibility(0);
                    }
                }
            } else {
                StreamingTextView n = mo100426n();
                n.getPaint().setShader((Shader) null);
                n.setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant));
                n.mo82924c(m188184C());
                mo100423k().setVisibility(0);
            }
            mo100420h().setVisibility(0);
        }
    }

    /* renamed from: z */
    public final void mo100437z(String str, String str2, String str3) {
        mo100422j().setVisibility(8);
        mo100426n().setVisibility(0);
        C58976aa aaVar = C58975e.f156826a;
        if (m188185D()) {
            this.f314775t = new C113661am(this, str, str2, str3);
            return;
        }
        if (!(this.f314771p == C113668at.RECORDING || this.f314771p == C113668at.IN_PROGRESS_TRANSCRIPTION)) {
            C59104x c = f314755a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c).mo56372aa(28273)).mo56389s("setInputTextWithInProgressTranscript called from state: %s", this.f314771p);
            mo100430s();
        }
        this.f314771p = C113668at.IN_PROGRESS_TRANSCRIPTION;
        if (!C58837ba.m90859h(str3)) {
            mo100411A(str3);
        }
        StreamingTextView n = mo100426n();
        n.getPaint().setShader((Shader) null);
        n.setTextColor(C19391a.m36980a(getContext(), R.attr.colorOnSurface));
        n.mo82923b(str, str2);
        mo100420h().setVisibility(0);
        mo100423k().setVisibility(0);
        mo100428p().mo100409a();
    }
}
