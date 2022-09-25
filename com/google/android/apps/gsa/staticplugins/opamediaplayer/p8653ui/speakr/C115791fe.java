package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89315s;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89319w;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115422a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115444n;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115446p;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115612a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.MediaPlayerPlaybackSpeedSelector;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23133c;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23134d;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23135e;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23168e;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23169f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.p3506c.C44581b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p4988b.p4992c.C64768p;
import dagger.C68214a;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fe */
/* compiled from: PG */
public final class C115791fe extends C115819o implements SeekBar.OnSeekBarChangeListener, C23169f {

    /* renamed from: e */
    public static final C59071e f321068e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fe");

    /* renamed from: A */
    public WebView f321069A;

    /* renamed from: B */
    public RelativeLayout f321070B;

    /* renamed from: C */
    public View f321071C;

    /* renamed from: D */
    public ViewGroup f321072D;

    /* renamed from: E */
    public ViewGroup f321073E;

    /* renamed from: F */
    public C115732d f321074F;

    /* renamed from: G */
    public final AtomicBoolean f321075G = new AtomicBoolean(false);

    /* renamed from: H */
    public long f321076H;

    /* renamed from: I */
    public Boolean f321077I;

    /* renamed from: J */
    public boolean f321078J;

    /* renamed from: K */
    public C58485gu f321079K;

    /* renamed from: L */
    C58833ax f321080L = C58836b.f156633a;

    /* renamed from: M */
    public C89319w f321081M = C89319w.f242150i;

    /* renamed from: N */
    public boolean f321082N;

    /* renamed from: O */
    public boolean f321083O;

    /* renamed from: R */
    private final C22871g f321084R;

    /* renamed from: S */
    private final C21370a f321085S;

    /* renamed from: T */
    private View f321086T;

    /* renamed from: U */
    private TextView f321087U;

    /* renamed from: V */
    private ImageView f321088V;

    /* renamed from: W */
    private ImageView f321089W;

    /* renamed from: X */
    private TextView f321090X;

    /* renamed from: Y */
    private TextView f321091Y;

    /* renamed from: Z */
    private C60870cx f321092Z;

    /* renamed from: aa */
    private final C90323a f321093aa;

    /* renamed from: ab */
    private final C90324b f321094ab;

    /* renamed from: f */
    public final C115444n f321095f;

    /* renamed from: g */
    public final C115446p f321096g;

    /* renamed from: h */
    public final C68214a f321097h;

    /* renamed from: i */
    public double f321098i;

    /* renamed from: j */
    public View f321099j;

    /* renamed from: k */
    public View f321100k;

    /* renamed from: l */
    public View f321101l;

    /* renamed from: m */
    public SeekBar f321102m;

    /* renamed from: n */
    public ImageView f321103n;

    /* renamed from: o */
    public ImageButton f321104o;

    /* renamed from: p */
    public View f321105p;

    /* renamed from: q */
    public View f321106q;

    /* renamed from: r */
    public MediaPlayerPlaybackSpeedSelector f321107r;

    /* renamed from: s */
    public BottomSheetBehavior f321108s;

    /* renamed from: t */
    public boolean f321109t;

    /* renamed from: u */
    public ProgressBar f321110u;

    /* renamed from: v */
    public boolean f321111v;

    /* renamed from: w */
    public C64768p f321112w;

    /* renamed from: x */
    public String f321113x;

    /* renamed from: y */
    public C58833ax f321114y;

    /* renamed from: z */
    public FrameLayout f321115z;

    public C115791fe(C22945j jVar, Context context, C115444n nVar, C115446p pVar, C22871g gVar, C68214a aVar, C21370a aVar2, C58833ax axVar, C90323a aVar3) {
        super(jVar, context, axVar);
        this.f321095f = nVar;
        this.f321096g = new C115759e(pVar, jVar);
        this.f321084R = gVar;
        this.f321097h = aVar;
        this.f321085S = aVar2;
        this.f321114y = C58836b.f156633a;
        this.f321093aa = aVar3;
        this.f321094ab = new C115782ew(jVar, pVar);
    }

    /* renamed from: s */
    private final long m191915s(SeekBar seekBar) {
        double progress = (double) seekBar.getProgress();
        double max = (double) seekBar.getMax();
        Double.isNaN(progress);
        Double.isNaN(max);
        double d = progress / max;
        double d2 = (double) (this.f321114y.mo56113h() ? ((C115466j) this.f321114y.mo56107c()).f320314i : 0);
        Double.isNaN(d2);
        return (long) Math.max(C59203do.f157270a, d2 * d);
    }

    /* renamed from: t */
    private static String m191916t(long j) {
        if (j == 0) {
            return "0 seconds";
        }
        long j2 = j / 60;
        long j3 = j % 60;
        String str = BuildConfig.FLAVOR;
        String format = j2 > 0 ? String.format("%s minutes", new Object[]{Long.valueOf(j2)}) : str;
        String str2 = (j2 <= 0 || j3 <= 0) ? str : " and ";
        if (j3 > 0) {
            str = String.format("%s seconds", new Object[]{Long.valueOf(j3)});
        }
        return format + str2 + str;
    }

    /* renamed from: u */
    private final void m191917u(int i, Runnable runnable) {
        this.f321207a.mo2393g().findItem(i).setOnMenuItemClickListener(new C115765ef(runnable));
    }

    /* renamed from: e */
    public final C23168e mo28615e(C23129y yVar) {
        C58976aa aaVar = C58975e.f156826a;
        return yVar.f63477b.equals("speakr_playlist_feature") ? new C23168e(C23135e.f63483a, new C23133c(R.animator.slide_in_up_from_out), (C23134d) null, (C23134d) null) : new C23168e(C23135e.f63483a, C115766eg.f321036a, (C23134d) null, (C23134d) null);
    }

    /* renamed from: g */
    public final long mo102250g() {
        return this.f321085S.mo26871c();
    }

    /* renamed from: h */
    public final void mo102251h() {
        C60870cx cxVar = this.f321092Z;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C58976aa aaVar = C58975e.f156826a;
        mo102251h();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        View inflate = LayoutInflater.from(this.f321208b).inflate(R.layout.speakr_feature_media_item_page_refreshed, (ViewGroup) null);
        mo28295iC(inflate);
        super.mo28299iw();
        TextView textView = (TextView) mo28297il().findViewById(R.id.speed_text);
        this.f321087U = textView;
        textView.setOnClickListener(new C115739dg(this));
        mo102259p(((Float) ((C23249a) this.f321095f.mo102008l()).mo28725a()).floatValue());
        this.f321093aa.mo84004a(this.f321094ab);
        this.f321070B = (RelativeLayout) mo28297il().findViewById(R.id.root_layout);
        this.f321071C = mo28297il().findViewById(R.id.shadow_container);
        this.f321072D = (ViewGroup) mo28297il().findViewById(R.id.progress_controls);
        this.f321073E = (ViewGroup) mo28297il().findViewById(R.id.playback_controls);
        this.f321115z = (FrameLayout) mo28297il().findViewById(R.id.web_page_container);
        this.f321110u = (ProgressBar) inflate.findViewById(R.id.progressBar);
        this.f321086T = inflate.findViewById(R.id.change_playback_speed_sheet);
        this.f321099j = inflate.findViewById(R.id.highlighting_overlay);
        this.f321101l = inflate.findViewById(R.id.media_player_container);
        this.f321100k = inflate.findViewById(R.id.speed_selector_mask);
        this.f321106q = inflate.findViewById(R.id.media_player_coordinator_layout);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.progress_seek_bar);
        this.f321102m = seekBar;
        seekBar.setPadding(0, 0, 0, 0);
        this.f321102m.setOnSeekBarChangeListener(this);
        this.f321090X = (TextView) inflate.findViewById(R.id.played_time);
        this.f321091Y = (TextView) inflate.findViewById(R.id.remaining_time);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.rewind);
        this.f321089W = imageView;
        imageView.setOnClickListener(new C89943l(new C115730cy(this)));
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.toggle_pause);
        this.f321103n = imageView2;
        imageView2.setOnClickListener(new C89943l(new C115743dk(this)));
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.fast_forward);
        this.f321088V = imageView3;
        imageView3.setOnClickListener(new C89943l(new C115754dv(this)));
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.share_button);
        this.f321104o = imageButton;
        imageButton.setOnClickListener(new C89943l(new C115755dw(this)));
        MediaPlayerPlaybackSpeedSelector mediaPlayerPlaybackSpeedSelector = (MediaPlayerPlaybackSpeedSelector) inflate.findViewById(R.id.playback_speed_selector);
        this.f321107r = mediaPlayerPlaybackSpeedSelector;
        mediaPlayerPlaybackSpeedSelector.mo102175b(new C115783ex(this));
        this.f321105p = inflate.findViewById(R.id.assistant_branding);
        ((C23249a) this.f321095f.mo102022z()).mo28726b(new C115756dx(this));
        ((C23249a) this.f321095f.mo102005i()).mo28726b(new C115757dy(this));
        ((C23249a) this.f321095f.mo102010n()).mo28726b(new C115758dz(this));
        ((C23249a) this.f321095f.mo102008l()).mo28726b(new C115760ea(this));
        ((C23249a) this.f321095f.mo102007k()).mo28726b(new C115761eb(this));
        ((C23249a) this.f321095f.mo101996A()).mo28726b(new C115763ed(this));
        ((C23249a) this.f321095f.mo102000d()).mo28726b(new C115731cz(this));
        ((C23249a) this.f321095f.mo102002f()).mo28726b(C115733da.f320999a);
        ((C23249a) this.f321095f.mo102020x()).mo28726b(new C115734db(this));
        ((C23249a) this.f321095f.mo102003g()).mo28726b(C115735dc.f321001a);
        ((C23249a) this.f321095f.mo102021y()).mo28726b(new C115736dd(this));
        ((C23249a) this.f321095f.mo102019w()).mo28726b(new C115737de(this));
        ((C23249a) this.f321095f.mo102012p()).mo28726b(new C115738df(this));
        ((C23249a) this.f321095f.mo101999c()).mo28726b(new C115740dh(this));
        ((C23249a) this.f321095f.mo101998b()).mo28726b(new C115741di(this));
        ((C23249a) this.f321095f.mo102006j()).mo28726b(new C115742dj(this));
        ((C23249a) this.f321095f.mo101997B()).mo28726b(new C115744dl(this));
        ((C23249a) this.f321095f.mo102001e()).mo28726b(new C115745dm(this));
        ((C23249a) this.f321095f.mo102017u()).mo28726b(new C115746dn(this));
        ((C23249a) this.f321095f.mo102018v()).mo28726b(new C115747do(this));
        ((C23249a) this.f321095f.mo102014r()).mo28726b(new C115748dp(this));
        ((C23249a) this.f321095f.mo102004h()).mo28726b(new C115749dq(this));
        ((C23249a) this.f321095f.mo102016t()).mo28726b(new C115751ds(this));
        ((C23249a) this.f321095f.mo102015s()).mo28726b(new C115752dt(this));
        ((C23249a) this.f321095f.mo102011o()).mo28726b(new C115753du(this));
        m191917u(R.id.speakr_menu_item_page_send_feedback, new C115762ec(this));
        m191917u(R.id.speakr_menu_item_select_voice, new C115773en(this));
        m191917u(R.id.speakr_menu_item_select_language, new C115777er(this));
        m191917u(R.id.speakr_menu_item_text_highlighting_toggle, new C115778es(this));
        BottomSheetBehavior C = BottomSheetBehavior.m78767C(this.f321086T);
        this.f321108s = C;
        C.f115902m = true;
        C.mo47518u(true);
        this.f321108s.mo47516N(0);
        this.f321108s.mo47519v(4);
        this.f321108s.mo47508F(new C115784ey(this));
        inflate.findViewById(R.id.close_speed_setting).setOnClickListener(new C115769ej(this));
        C28295m.m52919e(mo28297il(), new C28292j(94837));
        ImageView imageView4 = this.f321089W;
        C28292j jVar = new C28292j(94842);
        jVar.mo33795i(5);
        jVar.mo33794h(1);
        C28295m.m52919e(imageView4, jVar);
        ImageView imageView5 = this.f321088V;
        C28292j jVar2 = new C28292j(94841);
        jVar2.mo33795i(5);
        jVar2.mo33794h(1);
        C28295m.m52919e(imageView5, jVar2);
        ImageView imageView6 = this.f321103n;
        C28292j jVar3 = new C28292j(94843);
        jVar3.mo33795i(5);
        jVar3.mo33794h(1);
        C28295m.m52919e(imageView6, jVar3);
        SeekBar seekBar2 = this.f321102m;
        C28292j jVar4 = new C28292j(94845);
        jVar4.mo33795i(31);
        jVar4.mo33795i(5);
        jVar4.mo33794h(1);
        C28295m.m52919e(seekBar2, jVar4);
        ImageButton imageButton2 = this.f321104o;
        C28292j jVar5 = new C28292j(94838);
        jVar5.mo33795i(5);
        jVar5.mo33794h(1);
        C28295m.m52919e(imageButton2, jVar5);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C58976aa aaVar = C58975e.f156826a;
        C89949q.m146521e(C28285c.m52874a(mo28297il(), 96973), false);
        mo102259p(((Float) ((C23249a) this.f321095f.mo102008l()).mo28725a()).floatValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo102252j() {
        this.f321100k.setAlpha(0.54f);
        this.f321100k.animate().alpha(0.0f).setDuration(400).setListener(new C115785ez(this));
        this.f321108s.mo47519v(4);
        C28292j a = C28295m.m52915a(this.f321107r);
        if (a != null) {
            a.mo33794h(2);
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    public final void mo102253k() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f321069A == null) {
            C59104x d = f321068e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
            ((C59052c) ((C59052c) d).mo56372aa(30083)).mo56386p("WebView is null.");
        } else {
            C58485gu guVar = this.f321079K;
            if (guVar == null || guVar.isEmpty()) {
                C59104x d2 = f321068e.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                ((C59052c) ((C59052c) d2).mo56372aa(30081)).mo56386p("Paragraphs metadata not initialized.");
            } else if (!this.f321078J) {
                C59104x d3 = f321068e.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                ((C59052c) ((C59052c) d3).mo56372aa(30082)).mo56386p("Page didn't finish loading yet.");
            } else {
                C58833ax a = C89315s.m145236a(mo28297il().getContext());
                if (!a.mo56113h()) {
                    C59104x b = f321068e.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                    ((C59052c) ((C59052c) b).mo56372aa(30062)).mo56386p("No Script");
                    return;
                }
                C58833ax k = C58833ax.m90834k(new C89315s(this.f321069A, (String) a.mo56107c(), this.f321085S, this.f321081M));
                this.f321080L = k;
                ((C89315s) k.mo56107c()).mo83245d(this.f321079K);
                return;
            }
        }
        C59104x b2 = f321068e.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
        ((C59052c) ((C59052c) b2).mo56372aa(30063)).mo56386p("Not ready for initialization");
    }

    /* renamed from: l */
    public final void mo102254l() {
        if (this.f321069A == null) {
            return;
        }
        if (!C58837ba.m90859h(this.f321113x) || this.f321111v) {
            this.f321075G.set(false);
            this.f321110u.setVisibility(0);
            this.f321069A.setVisibility(8);
            this.f321078J = false;
            if (this.f321111v) {
                this.f321069A.loadDataWithBaseURL("file:///android_asset/", C115793fg.m191934a(this.f321112w), "text/html; charset=utf-8", "utf-8", (String) null);
            } else {
                this.f321069A.loadUrl(this.f321113x);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo102255m(String str, String str2) {
        byte[] a = C115612a.m191748a(mo28297il().getRootView());
        if (!this.f321210d.booleanValue()) {
            this.f321096g.mo101881l(a);
            return;
        }
        C44581b bVar = new C44581b(mo28297il().getContext(), 0);
        bVar.mo47605x(this.f321208b.getResources().getString(R.string.select_feedback_category));
        bVar.f1347a.f1333n = true;
        bVar.mo47596o((CharSequence[]) Collection.EL.stream(C115422a.f320241a).map(C115779et.f321051a).toArray(C115780eu.f321052a), new C115781ev(this, a, str, str2));
        bVar.create().show();
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            if (!this.f321109t) {
                this.f321096g.mo101880k(m191915s(seekBar));
            } else {
                mo102260q();
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f321109t = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C89949q.m146521e(C28285c.m52882i(seekBar, 31, (Integer) null), false);
        this.f321109t = false;
        this.f321096g.mo101880k(m191915s(seekBar));
    }

    /* renamed from: p */
    public final void mo102259p(float f) {
        C58976aa aaVar = C58975e.f156826a;
        Float valueOf = Float.valueOf(f);
        String format = String.format(Locale.getDefault(), this.f321208b.getResources().getString(R.string.omp_speakr_speed), new Object[]{valueOf});
        MediaPlayerPlaybackSpeedSelector mediaPlayerPlaybackSpeedSelector = this.f321107r;
        if (!(mediaPlayerPlaybackSpeedSelector == null || this.f321108s.f115862E == 3)) {
            mediaPlayerPlaybackSpeedSelector.mo102126a(f);
        }
        TextView textView = this.f321087U;
        if (textView != null) {
            textView.setText(format);
            this.f321087U.setContentDescription(this.f321208b.getResources().getString(R.string.change_speed_button));
        }
    }

    /* renamed from: q */
    public final void mo102260q() {
        long j;
        if (this.f321114y.mo56113h()) {
            C115466j jVar = (C115466j) this.f321114y.mo56107c();
            if (!jVar.f320312g || this.f321109t) {
                long j2 = 0;
                if (this.f321109t) {
                    j = m191915s(this.f321102m);
                } else if (!jVar.f320310e) {
                    j = jVar.f320313h;
                } else {
                    j = jVar.f320320o > 0 ? ((long) (((float) (this.f321085S.mo26871c() - jVar.f320320o)) * ((Float) ((C23249a) this.f321095f.mo102008l()).mo28725a()).floatValue())) + jVar.f320313h : 0;
                }
                long j3 = jVar.f320314i;
                if (j3 <= 0 || j > j3) {
                    this.f321102m.setEnabled(false);
                    this.f321102m.setProgress(0);
                    return;
                }
                SeekBar seekBar = this.f321102m;
                seekBar.setProgress((int) ((((float) j) / ((float) j3)) * ((float) seekBar.getMax())));
                double d = (double) (j3 - j);
                Double.isNaN(d);
                long ceil = (long) Math.ceil(d / 1000.0d);
                long j4 = j / 1000;
                if (ceil != 0) {
                    j2 = ceil;
                } else if (j % 1000 != 0) {
                    j4++;
                }
                this.f321091Y.setText(String.format("-%s", new Object[]{DateUtils.formatElapsedTime(j2)}));
                this.f321090X.setText(DateUtils.formatElapsedTime(j4));
                this.f321102m.setContentDescription("Seek control. " + String.format("%s elapsed. ", new Object[]{m191916t(j4)}) + String.format("%s remaining.", new Object[]{m191916t(j2)}));
                if (jVar.f320310e && !this.f321109t) {
                    this.f321092Z = this.f321084R.mo28208h("periodic-updater", (long) Math.round(50.0f / ((Float) ((C23249a) this.f321095f.mo102008l()).mo28725a()).floatValue()), new C115772em(this));
                    return;
                }
                return;
            }
            SeekBar seekBar2 = this.f321102m;
            seekBar2.setProgress(seekBar2.getMax());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo102261r() {
        this.f321096g.mo101875e();
    }

    @JavascriptInterface
    public void snapToParagraph(int i) {
        this.f321084R.mo28212l("snap-to-paragraph", new C115727cv(this, i));
    }

    @JavascriptInterface
    public void snapToWord(int i, int i2) {
        this.f321084R.mo28212l("snap-to-word", new C115767eh(this, i, i2));
    }

    @JavascriptInterface
    public void wordLongPressed(String str, String str2) {
        this.f321084R.mo28212l("wordLongPressed", new C115764ee(this, str, str2));
    }
}
