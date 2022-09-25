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
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115444n;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115446p;
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
import com.google.android.material.chip.Chip;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.cf */
/* compiled from: PG */
public final class C115711cf extends C115819o implements SeekBar.OnSeekBarChangeListener, C23169f {

    /* renamed from: e */
    public static final C59071e f320912e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.cf");

    /* renamed from: A */
    public final AtomicBoolean f320913A = new AtomicBoolean(false);

    /* renamed from: B */
    public long f320914B;

    /* renamed from: C */
    public Boolean f320915C;

    /* renamed from: D */
    public boolean f320916D;

    /* renamed from: E */
    public C58485gu f320917E;

    /* renamed from: F */
    C58833ax f320918F = C58836b.f156633a;

    /* renamed from: G */
    public C89319w f320919G = C89319w.f242150i;

    /* renamed from: H */
    public boolean f320920H;

    /* renamed from: I */
    private final C22871g f320921I;

    /* renamed from: J */
    private final C21370a f320922J;

    /* renamed from: K */
    private View f320923K;

    /* renamed from: L */
    private View f320924L;

    /* renamed from: M */
    private RelativeLayout f320925M;

    /* renamed from: N */
    private ImageView f320926N;

    /* renamed from: O */
    private ImageView f320927O;

    /* renamed from: R */
    private ImageView f320928R;

    /* renamed from: S */
    private ImageView f320929S;

    /* renamed from: T */
    private TextView f320930T;

    /* renamed from: U */
    private TextView f320931U;

    /* renamed from: V */
    private C60870cx f320932V;

    /* renamed from: W */
    private final C90323a f320933W;

    /* renamed from: X */
    private final C90324b f320934X;

    /* renamed from: f */
    public final C115444n f320935f;

    /* renamed from: g */
    public final C115446p f320936g;

    /* renamed from: h */
    public final C68214a f320937h;

    /* renamed from: i */
    public double f320938i;

    /* renamed from: j */
    public View f320939j;

    /* renamed from: k */
    public View f320940k;

    /* renamed from: l */
    public SeekBar f320941l;

    /* renamed from: m */
    public ImageView f320942m;

    /* renamed from: n */
    public ImageButton f320943n;

    /* renamed from: o */
    public MediaPlayerPlaybackSpeedSelector f320944o;

    /* renamed from: p */
    public BottomSheetBehavior f320945p;

    /* renamed from: q */
    public boolean f320946q;

    /* renamed from: r */
    public ProgressBar f320947r;

    /* renamed from: s */
    public boolean f320948s;

    /* renamed from: t */
    public boolean f320949t;

    /* renamed from: u */
    public boolean f320950u;

    /* renamed from: v */
    public C64768p f320951v;

    /* renamed from: w */
    public String f320952w;

    /* renamed from: x */
    public C58833ax f320953x;

    /* renamed from: y */
    public FrameLayout f320954y;

    /* renamed from: z */
    public WebView f320955z;

    public C115711cf(C22945j jVar, Context context, C115444n nVar, C115446p pVar, C22871g gVar, C68214a aVar, C21370a aVar2, C58833ax axVar, C90323a aVar3) {
        super(jVar, context, axVar);
        this.f320935f = nVar;
        this.f320936g = new C115759e(pVar, jVar);
        this.f320921I = gVar;
        this.f320937h = aVar;
        this.f320922J = aVar2;
        this.f320953x = C58836b.f156633a;
        this.f320933W = aVar3;
        this.f320934X = new C115702bx(jVar, pVar);
    }

    /* renamed from: s */
    private final long m191830s(SeekBar seekBar) {
        double progress = (double) seekBar.getProgress();
        double max = (double) seekBar.getMax();
        Double.isNaN(progress);
        Double.isNaN(max);
        double d = progress / max;
        double d2 = (double) (this.f320953x.mo56113h() ? ((C115466j) this.f320953x.mo56107c()).f320314i : 0);
        Double.isNaN(d2);
        return (long) Math.max(C59203do.f157270a, d2 * d);
    }

    /* renamed from: t */
    private static String m191831t(long j) {
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
    private final void m191832u(int i, Runnable runnable) {
        this.f321207a.mo2393g().findItem(i).setOnMenuItemClickListener(new C115691bm(runnable));
    }

    /* renamed from: e */
    public final C23168e mo28615e(C23129y yVar) {
        C58976aa aaVar = C58975e.f156826a;
        return yVar.f63477b.equals("speakr_playlist_feature") ? new C23168e(C23135e.f63483a, new C23133c(R.animator.slide_in_up_from_out), (C23134d) null, (C23134d) null) : new C23168e(C23135e.f63483a, C115695bq.f320893a, (C23134d) null, (C23134d) null);
    }

    /* renamed from: g */
    public final long mo102207g() {
        return this.f320922J.mo26871c();
    }

    /* renamed from: h */
    public final void mo102208h() {
        C60870cx cxVar = this.f320932V;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C58976aa aaVar = C58975e.f156826a;
        mo102208h();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        View inflate = LayoutInflater.from(this.f321208b).inflate(R.layout.speakr_feature_media_item_page, (ViewGroup) null);
        mo28295iC(inflate);
        super.mo28299iw();
        FrameLayout frameLayout = (FrameLayout) mo28297il().findViewById(R.id.current_speed_container);
        LayoutInflater.from(this.f321208b).inflate(R.layout.omp_current_speed_chip, frameLayout, true);
        View findViewById = frameLayout.findViewById(R.id.current_speed);
        this.f320924L = findViewById;
        findViewById.setOnClickListener(new C115680bb(this));
        frameLayout.findViewById(R.id.current_speed_chip_container).setOnClickListener(new C115680bb(this));
        mo102212m(((Float) ((C23249a) this.f320935f.mo102008l()).mo28725a()).floatValue());
        this.f320933W.mo84004a(this.f320934X);
        this.f320954y = (FrameLayout) mo28297il().findViewById(R.id.web_page_container);
        this.f320947r = (ProgressBar) inflate.findViewById(R.id.progressBar);
        this.f320923K = inflate.findViewById(R.id.change_playback_speed_sheet);
        this.f320940k = inflate.findViewById(R.id.media_player_container);
        this.f320939j = inflate.findViewById(R.id.speed_selector_mask);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.progress_view);
        this.f320925M = relativeLayout;
        relativeLayout.setAccessibilityDelegate(new C115703by(this));
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.progress_seek_bar);
        this.f320941l = seekBar;
        seekBar.setPadding(0, 0, 0, 0);
        this.f320941l.setOnSeekBarChangeListener(this);
        this.f320930T = (TextView) inflate.findViewById(R.id.played_time);
        this.f320931U = (TextView) inflate.findViewById(R.id.remaining_time);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.rewind);
        this.f320927O = imageView;
        imageView.setOnClickListener(new C89943l(new C115664am(this)));
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.toggle_pause);
        this.f320942m = imageView2;
        imageView2.setOnClickListener(new C89943l(new C115656ae(this)));
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.fast_forward);
        this.f320926N = imageView3;
        imageView3.setOnClickListener(new C89943l(new C115665an(this)));
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.skip_next);
        this.f320928R = imageView4;
        imageView4.setOnClickListener(new C89943l(new C115666ao(this)));
        ImageView imageView5 = (ImageView) inflate.findViewById(R.id.show_playlist);
        this.f320929S = imageView5;
        imageView5.setOnClickListener(new C89943l(new C115667ap(this)));
        mo102216p();
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.share_button);
        this.f320943n = imageButton;
        imageButton.setOnClickListener(new C89943l(new C115668aq(this)));
        MediaPlayerPlaybackSpeedSelector mediaPlayerPlaybackSpeedSelector = (MediaPlayerPlaybackSpeedSelector) inflate.findViewById(R.id.playback_speed_selector);
        this.f320944o = mediaPlayerPlaybackSpeedSelector;
        mediaPlayerPlaybackSpeedSelector.mo102175b(new C115704bz(this));
        ((C23249a) this.f320935f.mo102005i()).mo28726b(new C115669ar(this));
        ((C23249a) this.f320935f.mo102010n()).mo28726b(new C115670as(this));
        ((C23249a) this.f320935f.mo102008l()).mo28726b(new C115671at(this));
        ((C23249a) this.f320935f.mo102007k()).mo28726b(new C115672au(this));
        ((C23249a) this.f320935f.mo101996A()).mo28726b(new C115675ax(this));
        ((C23249a) this.f320935f.mo102002f()).mo28726b(new C115687bi(this));
        ((C23249a) this.f320935f.mo102020x()).mo28726b(new C115696br(this));
        ((C23249a) this.f320935f.mo102003g()).mo28726b(new C115697bs(this));
        ((C23249a) this.f320935f.mo102021y()).mo28726b(new C115698bt(this));
        ((C23249a) this.f320935f.mo102019w()).mo28726b(new C115699bu(this));
        ((C23249a) this.f320935f.mo102012p()).mo28726b(new C115700bv(this));
        ((C23249a) this.f320935f.mo101999c()).mo28726b(new C115701bw(this));
        ((C23249a) this.f320935f.mo101998b()).mo28726b(new C115654ac(this));
        ((C23249a) this.f320935f.mo102006j()).mo28726b(new C115655ad(this));
        ((C23249a) this.f320935f.mo101997B()).mo28726b(new C115657af(this));
        ((C23249a) this.f320935f.mo102017u()).mo28726b(new C115658ag(this));
        ((C23249a) this.f320935f.mo102018v()).mo28726b(new C115659ah(this));
        ((C23249a) this.f320935f.mo102014r()).mo28726b(new C115660ai(this));
        ((C23249a) this.f320935f.mo102004h()).mo28726b(new C115661aj(this));
        ((C23249a) this.f320935f.mo102016t()).mo28726b(new C115662ak(this));
        ((C23249a) this.f320935f.mo102011o()).mo28726b(new C115663al(this));
        m191832u(R.id.speakr_menu_item_page_send_feedback, new C115685bg(this));
        m191832u(R.id.speakr_menu_item_select_voice, new C115686bh(this));
        m191832u(R.id.speakr_menu_item_select_language, new C115688bj(this));
        m191832u(R.id.speakr_menu_item_text_highlighting_toggle, new C115689bk(this));
        BottomSheetBehavior C = BottomSheetBehavior.m78767C(this.f320923K);
        this.f320945p = C;
        C.f115902m = true;
        C.mo47518u(true);
        this.f320945p.mo47516N(0);
        this.f320945p.mo47519v(4);
        this.f320945p.mo47508F(new C115706ca(this));
        inflate.findViewById(R.id.close_speed_setting).setOnClickListener(new C115653ab(this));
        C28295m.m52919e(mo28297il(), new C28292j(94837));
        ImageView imageView6 = this.f320927O;
        C28292j jVar = new C28292j(94842);
        jVar.mo33795i(5);
        jVar.mo33794h(1);
        C28295m.m52919e(imageView6, jVar);
        ImageView imageView7 = this.f320926N;
        C28292j jVar2 = new C28292j(94841);
        jVar2.mo33795i(5);
        jVar2.mo33794h(1);
        C28295m.m52919e(imageView7, jVar2);
        ImageView imageView8 = this.f320942m;
        C28292j jVar3 = new C28292j(94843);
        jVar3.mo33795i(5);
        jVar3.mo33794h(1);
        C28295m.m52919e(imageView8, jVar3);
        SeekBar seekBar2 = this.f320941l;
        C28292j jVar4 = new C28292j(94845);
        jVar4.mo33795i(31);
        jVar4.mo33795i(5);
        jVar4.mo33794h(1);
        C28295m.m52919e(seekBar2, jVar4);
        ImageView imageView9 = this.f320928R;
        C28292j jVar5 = new C28292j(94844);
        jVar5.mo33795i(5);
        jVar5.mo33794h(1);
        C28295m.m52919e(imageView9, jVar5);
        ImageView imageView10 = this.f320929S;
        C28292j jVar6 = new C28292j(95614);
        jVar6.mo33795i(5);
        jVar6.mo33794h(1);
        C28295m.m52919e(imageView10, jVar6);
        ImageButton imageButton2 = this.f320943n;
        C28292j jVar7 = new C28292j(94838);
        jVar7.mo33795i(5);
        jVar7.mo33794h(1);
        C28295m.m52919e(imageButton2, jVar7);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C58976aa aaVar = C58975e.f156826a;
        C89949q.m146521e(C28285c.m52874a(mo28297il(), 96973), false);
        mo102212m(((Float) ((C23249a) this.f320935f.mo102008l()).mo28725a()).floatValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo102209j() {
        this.f320939j.setAlpha(0.54f);
        this.f320939j.animate().alpha(0.0f).setDuration(400).setListener(new C115707cb(this));
        this.f320945p.mo47519v(4);
        C28292j a = C28295m.m52915a(this.f320944o);
        if (a != null) {
            a.mo33794h(2);
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    public final void mo102210k() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f320955z == null) {
            C59104x d = f320912e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
            ((C59052c) ((C59052c) d).mo56372aa(30034)).mo56386p("WebView is null.");
        } else {
            C58485gu guVar = this.f320917E;
            if (guVar == null || guVar.isEmpty()) {
                C59104x d2 = f320912e.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                ((C59052c) ((C59052c) d2).mo56372aa(30032)).mo56386p("Paragraphs metadata not initialized.");
            } else if (!this.f320916D) {
                C59104x d3 = f320912e.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                ((C59052c) ((C59052c) d3).mo56372aa(30033)).mo56386p("Page didn't finish loading yet.");
            } else {
                C58833ax a = C89315s.m145236a(mo28297il().getContext());
                if (!a.mo56113h()) {
                    C59104x b = f320912e.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                    ((C59052c) ((C59052c) b).mo56372aa(30014)).mo56386p("No Script");
                    return;
                }
                C58833ax k = C58833ax.m90834k(new C89315s(this.f320955z, (String) a.mo56107c(), this.f320922J, this.f320919G));
                this.f320918F = k;
                ((C89315s) k.mo56107c()).mo83245d(this.f320917E);
                return;
            }
        }
        C59104x b2 = f320912e.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
        ((C59052c) ((C59052c) b2).mo56372aa(30015)).mo56386p("Not ready for initialization");
    }

    /* renamed from: l */
    public final void mo102211l() {
        if (this.f320955z == null) {
            return;
        }
        if (!C58837ba.m90859h(this.f320952w) || this.f320950u) {
            this.f320913A.set(false);
            this.f320947r.setVisibility(0);
            this.f320955z.setVisibility(8);
            this.f320916D = false;
            if (this.f320950u) {
                this.f320955z.loadDataWithBaseURL("file:///android_asset/", C115793fg.m191934a(this.f320951v), "text/html; charset=utf-8", "utf-8", (String) null);
            } else {
                this.f320955z.loadUrl(this.f320952w);
            }
        }
    }

    /* renamed from: m */
    public final void mo102212m(float f) {
        C58976aa aaVar = C58975e.f156826a;
        Float valueOf = Float.valueOf(f);
        String format = String.format(Locale.getDefault(), this.f321208b.getResources().getString(R.string.omp_speakr_speed_chip), new Object[]{valueOf});
        MediaPlayerPlaybackSpeedSelector mediaPlayerPlaybackSpeedSelector = this.f320944o;
        if (!(mediaPlayerPlaybackSpeedSelector == null || this.f320945p.f115862E == 3)) {
            mediaPlayerPlaybackSpeedSelector.mo102126a(f);
        }
        View view = this.f320924L;
        if (view != null) {
            ((Chip) view).setText(format);
            this.f320924L.setContentDescription(this.f321208b.getResources().getString(R.string.change_speed_button));
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            if (!this.f320946q) {
                this.f320936g.mo101880k(m191830s(seekBar));
            } else {
                mo102217q();
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f320946q = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C89949q.m146521e(C28285c.m52882i(seekBar, 31, (Integer) null), false);
        this.f320946q = false;
        this.f320936g.mo101880k(m191830s(seekBar));
    }

    /* renamed from: q */
    public final void mo102217q() {
        long j;
        if (this.f320953x.mo56113h()) {
            C115466j jVar = (C115466j) this.f320953x.mo56107c();
            if (!jVar.f320312g || this.f320946q) {
                long j2 = 0;
                if (this.f320946q) {
                    j = m191830s(this.f320941l);
                } else if (!jVar.f320310e) {
                    j = jVar.f320313h;
                } else {
                    j = jVar.f320320o > 0 ? ((long) (((float) (this.f320922J.mo26871c() - jVar.f320320o)) * ((Float) ((C23249a) this.f320935f.mo102008l()).mo28725a()).floatValue())) + jVar.f320313h : 0;
                }
                long j3 = jVar.f320314i;
                if (j3 <= 0 || j > j3) {
                    this.f320941l.setEnabled(false);
                    this.f320941l.setProgress(0);
                    return;
                }
                SeekBar seekBar = this.f320941l;
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
                this.f320931U.setText(String.format("-%s", new Object[]{DateUtils.formatElapsedTime(j2)}));
                this.f320930T.setText(DateUtils.formatElapsedTime(j4));
                this.f320925M.setContentDescription("Seek control. " + String.format("%s elapsed. ", new Object[]{m191831t(j4)}) + String.format("%s remaining.", new Object[]{m191831t(j2)}));
                if (jVar.f320310e && !this.f320946q) {
                    this.f320932V = this.f320921I.mo28208h("periodic-updater", (long) Math.round(50.0f / ((Float) ((C23249a) this.f320935f.mo102008l()).mo28725a()).floatValue()), new C115676ay(this));
                    return;
                }
                return;
            }
            SeekBar seekBar2 = this.f320941l;
            seekBar2.setProgress(seekBar2.getMax());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo102218r() {
        this.f320936g.mo101875e();
    }

    @JavascriptInterface
    public void snapToParagraph(int i) {
        this.f320921I.mo28212l("snap-to-paragraph", new C115690bl(this, i));
    }

    @JavascriptInterface
    public void snapToWord(int i, int i2) {
        this.f320921I.mo28212l("snap-to-word", new C115681bc(this, i, i2));
    }

    /* renamed from: p */
    public final void mo102216p() {
        if (!this.f320948s || this.f320949t) {
            this.f320928R.setImageDrawable(this.f321208b.getResources().getDrawable(R.drawable.quantum_ic_skip_next_grey600_36));
            this.f320928R.setVisibility(4);
        } else {
            this.f320928R.setImageDrawable(this.f321208b.getResources().getDrawable(R.drawable.quantum_ic_skip_next_black_36));
            this.f320928R.setVisibility(0);
        }
        if (this.f320948s) {
            this.f320929S.setImageDrawable(this.f321208b.getResources().getDrawable(R.drawable.quantum_ic_playlist_play_black_36));
            this.f320929S.setVisibility(0);
            return;
        }
        this.f320929S.setImageDrawable(this.f321208b.getResources().getDrawable(R.drawable.quantum_ic_playlist_play_grey600_36));
        this.f320929S.setVisibility(4);
    }
}
