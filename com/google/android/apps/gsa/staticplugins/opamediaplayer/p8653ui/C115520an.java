package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115475s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115476t;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115478v;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115633i;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.PlaybackSpeedSelector;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.an */
/* compiled from: PG */
public final class C115520an extends C22939d implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: D */
    public static final /* synthetic */ int f320388D = 0;

    /* renamed from: A */
    public boolean f320389A;

    /* renamed from: B */
    public C52176ia f320390B;

    /* renamed from: C */
    public C115466j f320391C;

    /* renamed from: E */
    private View f320392E;

    /* renamed from: F */
    private ImageView f320393F;

    /* renamed from: G */
    private TextView f320394G;

    /* renamed from: H */
    private TextView f320395H;

    /* renamed from: I */
    private View f320396I;

    /* renamed from: J */
    private View f320397J;

    /* renamed from: K */
    private long f320398K = 0;

    /* renamed from: L */
    private long f320399L = 0;

    /* renamed from: M */
    private C60870cx f320400M;

    /* renamed from: a */
    public final Context f320401a;

    /* renamed from: b */
    public final C115478v f320402b;

    /* renamed from: c */
    public final C22871g f320403c;

    /* renamed from: d */
    public final C115620ah f320404d;

    /* renamed from: e */
    public final C115475s f320405e;

    /* renamed from: f */
    public final C115519am f320406f;

    /* renamed from: g */
    public final C68214a f320407g;

    /* renamed from: h */
    public final C21370a f320408h;

    /* renamed from: i */
    public View f320409i;

    /* renamed from: j */
    public View f320410j;

    /* renamed from: k */
    public ThumbnailView f320411k;

    /* renamed from: l */
    public TextView f320412l;

    /* renamed from: m */
    public SeekBar f320413m;

    /* renamed from: n */
    public ImageView f320414n;

    /* renamed from: o */
    public ImageView f320415o;

    /* renamed from: p */
    public ImageView f320416p;

    /* renamed from: q */
    public ImageView f320417q;

    /* renamed from: r */
    public ImageView f320418r;

    /* renamed from: s */
    public ImageView f320419s;

    /* renamed from: t */
    public TextView f320420t;

    /* renamed from: u */
    public TextView f320421u;

    /* renamed from: v */
    public BottomSheetBehavior f320422v;

    /* renamed from: w */
    public ViewSwitcher f320423w;

    /* renamed from: x */
    public ProgressBar f320424x;

    /* renamed from: y */
    public View f320425y;

    /* renamed from: z */
    public PlaybackSpeedSelector f320426z;

    public C115520an(C22945j jVar, Context context, C115478v vVar, C115475s sVar, C22871g gVar, C115620ah ahVar, C68214a aVar, C21370a aVar2) {
        super(jVar);
        this.f320401a = context;
        this.f320402b = vVar;
        this.f320405e = new C115534ba(sVar, jVar);
        this.f320403c = gVar;
        this.f320404d = ahVar;
        this.f320406f = new C115519am(this);
        this.f320407g = aVar;
        this.f320408h = aVar2;
        this.f320390B = C52176ia.f136911k;
        this.f320391C = C115466j.f320304q;
    }

    /* renamed from: g */
    public static void m191607g(ImageView imageView, boolean z) {
        imageView.setVisibility(true != z ? 4 : 0);
        imageView.setEnabled(z);
    }

    /* renamed from: t */
    private final long m191608t(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        int max = seekBar.getMax();
        double max2 = (double) Math.max(0, this.f320391C.f320314i);
        double d = (double) progress;
        double d2 = (double) max;
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(max2);
        return (long) (max2 * (d / d2));
    }

    /* renamed from: e */
    public final void mo102065e() {
        C60870cx cxVar = this.f320400M;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }

    /* renamed from: h */
    public final void mo102066h() {
        if (this.f320423w.getCurrentView() != this.f320392E) {
            this.f320423w.showPrevious();
        }
        C2043bi.m5551ae(this.f320410j, 0);
    }

    /* renamed from: im */
    public final void mo28298im() {
        mo102065e();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f320401a).inflate(R.layout.omp_feature_playback_panel, (ViewGroup) null);
        mo28295iC(inflate);
        this.f320409i = inflate.findViewById(R.id.bottom_sheet_container);
        this.f320411k = (ThumbnailView) inflate.findViewById(R.id.playback_thumbnail);
        TextView textView = (TextView) inflate.findViewById(R.id.playback_title);
        this.f320412l = textView;
        textView.setSelected(true);
        this.f320420t = (TextView) inflate.findViewById(R.id.playback_time);
        this.f320421u = (TextView) inflate.findViewById(R.id.subtitle);
        this.f320424x = (ProgressBar) inflate.findViewById(R.id.bottom_progress_bar);
        this.f320396I = inflate.findViewById(R.id.playback_panel_top_separator);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.toggle_pause);
        this.f320414n = imageView;
        imageView.setOnClickListener(new C115832u(this));
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.arrow_down);
        this.f320415o = imageView2;
        imageView2.setOnClickListener(new C115510ad(this));
        ViewSwitcher viewSwitcher = (ViewSwitcher) inflate.findViewById(R.id.view_switcher);
        this.f320423w = viewSwitcher;
        viewSwitcher.setOnClickListener((View.OnClickListener) null);
        this.f320392E = inflate.findViewById(R.id.control_panel);
        this.f320410j = this.f320409i.findViewById(R.id.playback_panel_top);
        this.f320413m = (SeekBar) inflate.findViewById(R.id.progress_seek_bar);
        int dimensionPixelSize = this.f320401a.getResources().getDimensionPixelSize(R.dimen.omp_progress_seek_bar_padding);
        this.f320413m.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f320424x.setPadding(0, 0, 0, 0);
        this.f320413m.setOnSeekBarChangeListener(this);
        this.f320394G = (TextView) inflate.findViewById(R.id.played_time);
        this.f320395H = (TextView) inflate.findViewById(R.id.remaining_time);
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.rewind);
        this.f320417q = imageView3;
        imageView3.setOnClickListener(new C115511ae(this));
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.expanded_toggle_pause);
        this.f320393F = imageView4;
        imageView4.setOnClickListener(new C115512af(this));
        ImageView imageView5 = (ImageView) inflate.findViewById(R.id.fast_forward);
        this.f320416p = imageView5;
        imageView5.setOnClickListener(new C115513ag(this));
        ImageView imageView6 = (ImageView) inflate.findViewById(R.id.skip_next);
        this.f320418r = imageView6;
        imageView6.setOnClickListener(new C115514ah(this));
        ImageView imageView7 = (ImageView) inflate.findViewById(R.id.skip_previous);
        this.f320419s = imageView7;
        imageView7.setOnClickListener(new C115549k(this));
        this.f320425y = inflate.findViewById(R.id.speed_setting);
        PlaybackSpeedSelector playbackSpeedSelector = (PlaybackSpeedSelector) inflate.findViewById(R.id.playback_speed_selector);
        this.f320426z = playbackSpeedSelector;
        C115515ai aiVar = new C115515ai(this);
        playbackSpeedSelector.f320790f = aiVar;
        C115633i iVar = playbackSpeedSelector.f320789e;
        if (iVar != null) {
            aiVar.mo102062a(iVar);
        }
        inflate.findViewById(R.id.close_speed_setting).setOnClickListener(new C115550l(this));
        inflate.findViewById(R.id.info_button).setOnClickListener(new C115551m(this));
        ((C115530ax) this.f320402b).f320453a.mo28726b(new C115552n(this));
        ((C115530ax) this.f320402b).f320456d.mo28726b(new C115507aa(this));
        ((C115530ax) this.f320402b).f320457e.mo28726b(new C115508ab(this));
        ((C115530ax) this.f320402b).f320454b.mo28726b(new C115509ac(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        FrameLayout frameLayout = (FrameLayout) mo28297il().findViewById(R.id.current_speed_container);
        LayoutInflater.from(this.f320401a).inflate(R.layout.omp_current_speed_chip, frameLayout, true);
        View findViewById = frameLayout.findViewById(R.id.current_speed);
        this.f320397J = findViewById;
        findViewById.setOnClickListener(new C115607o(this));
        frameLayout.findViewById(R.id.current_speed_chip_container).setOnClickListener(new C115607o(this));
        mo102069l(((Float) ((C115530ax) this.f320402b).f320456d.f63720e).floatValue());
        frameLayout.findViewById(R.id.current_speed).setEnabled(true);
        frameLayout.findViewById(R.id.current_speed_chip_container).setEnabled(true);
    }

    /* renamed from: j */
    public final void mo102067j() {
        BottomSheetBehavior bottomSheetBehavior = this.f320422v;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f115862E == 3) {
            bottomSheetBehavior.mo47519v(4);
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
        mo102067j();
    }

    /* renamed from: k */
    public final void mo102068k() {
        this.f320400M = this.f320403c.mo28208h("periodic-updater", (long) Math.round(1000.0f / ((Float) ((C115530ax) this.f320402b).f320456d.f63720e).floatValue()), new C115548j(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102069l(float r7) {
        /*
            r6 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r3 = 0
            r2[r3] = r7
            java.lang.String r4 = "%.1fx"
            java.lang.String r0 = java.lang.String.format(r0, r4, r2)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.PlaybackSpeedSelector r2 = r6.f320426z
            if (r2 == 0) goto L_0x0064
            android.widget.ViewSwitcher r2 = r6.f320423w
            android.view.View r2 = r2.getCurrentView()
            android.view.View r4 = r6.f320425y
            if (r2 == r4) goto L_0x0046
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.PlaybackSpeedSelector r2 = r6.f320426z
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.i r4 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.i
            r4.<init>(r7)
            com.google.common.b.gu r7 = r2.f320788d
            boolean r7 = r7.contains(r4)
            java.lang.String r5 = "The value must be one of available values."
            com.google.common.base.C58838bb.m90869d(r7, r5)
            r2.f320789e = r4
            android.widget.TextView r7 = r2.f320786b
            java.lang.String r5 = r4.mo102152b()
            r7.setText(r5)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.h r7 = r2.f320785a
            int r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115632h.f320774e
            r7.mo102146b(r4)
        L_0x0046:
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.PlaybackSpeedSelector r7 = r6.f320426z
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.i r7 = r7.f320789e
            if (r7 != 0) goto L_0x004f
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x0057
        L_0x004f:
            java.lang.String r7 = r7.mo102152b()
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
        L_0x0057:
            boolean r2 = r7.mo56113h()
            if (r2 == 0) goto L_0x0064
            java.lang.Object r7 = r7.mo56107c()
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
        L_0x0064:
            android.view.View r7 = r6.f320397J
            if (r7 == 0) goto L_0x0083
            com.google.android.material.chip.Chip r7 = (com.google.android.material.chip.Chip) r7
            r7.setText(r0)
            android.view.View r7 = r6.f320397J
            android.content.Context r2 = r6.f320401a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            r0 = 2132090395(0x7f151e1b, float:1.9821129E38)
            java.lang.String r0 = r2.getString(r0, r1)
            r7.setContentDescription(r0)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.C115520an.mo102069l(float):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo102070m() {
        C115466j jVar = this.f320391C;
        if (jVar.f320308c) {
            this.f320421u.setText(mo28297il().getResources().getString(R.string.omp_playback_panel_error));
            this.f320420t.setText(mo28297il().getResources().getString(R.string.omp_playback_panel_error));
        } else if (jVar.f320309d || !jVar.f320311f) {
            this.f320421u.setText(BuildConfig.FLAVOR);
            long j = this.f320399L;
            if (j == 0) {
                this.f320420t.setText(this.f320401a.getResources().getString(R.string.omp_playback_completed));
            } else {
                double d = (double) j;
                Double.isNaN(d);
                int ceil = (int) Math.ceil(d / 60.0d);
                this.f320420t.setText(this.f320401a.getResources().getQuantityString(R.plurals.omp_minutes_left, ceil, new Object[]{Integer.valueOf(ceil)}));
            }
        } else {
            String string = this.f320401a.getResources().getString(R.string.omp_playback_status_buffering);
            this.f320421u.setText(string);
            this.f320420t.setText(string);
        }
        this.f320394G.setText(DateUtils.formatElapsedTime(this.f320398K));
        TextView textView = this.f320394G;
        Resources resources = this.f320401a.getResources();
        int i = (int) this.f320398K;
        textView.setContentDescription(resources.getQuantityString(R.plurals.omp_played_time, i, new Object[]{Integer.valueOf(i)}));
        this.f320395H.setText("-".concat(String.valueOf(DateUtils.formatElapsedTime(this.f320399L))));
        TextView textView2 = this.f320395H;
        Resources resources2 = this.f320401a.getResources();
        int i2 = (int) this.f320399L;
        textView2.setContentDescription(resources2.getQuantityString(R.plurals.omp_seconds_left, i2, new Object[]{Integer.valueOf(i2)}));
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            if (!this.f320389A) {
                this.f320405e.mo102045e(m191608t(seekBar));
            } else {
                mo102074p(m191608t(seekBar));
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f320389A = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f320389A = false;
        this.f320405e.mo102045e(m191608t(seekBar));
    }

    /* renamed from: p */
    public final void mo102074p(long j) {
        long j2 = j;
        C115466j jVar = this.f320391C;
        long j3 = jVar.f320314i;
        this.f320398K = j2 / 1000;
        this.f320399L = 0;
        if (jVar.f320308c) {
            mo102070m();
        } else if (jVar.f320312g && !this.f320389A) {
            SeekBar seekBar = this.f320413m;
            seekBar.setProgress(seekBar.getMax());
            ProgressBar progressBar = this.f320424x;
            progressBar.setProgress(progressBar.getMax());
            mo102070m();
        } else if (j3 <= 0 || j2 > j3) {
            this.f320413m.setEnabled(false);
            this.f320424x.setEnabled(false);
            this.f320413m.setProgress(0);
            this.f320424x.setProgress(0);
            this.f320420t.setText(DateUtils.formatElapsedTime(this.f320398K));
        } else {
            SeekBar seekBar2 = this.f320413m;
            double max = (double) seekBar2.getMax();
            Double.isNaN(max);
            seekBar2.setSecondaryProgress((int) ((jVar.f320315j / 100.0d) * max));
            ProgressBar progressBar2 = this.f320424x;
            double max2 = (double) progressBar2.getMax();
            Double.isNaN(max2);
            progressBar2.setSecondaryProgress((int) ((this.f320391C.f320315j / 100.0d) * max2));
            SeekBar seekBar3 = this.f320413m;
            float f = ((float) j2) / ((float) j3);
            seekBar3.setProgress((int) (((float) seekBar3.getMax()) * f));
            ProgressBar progressBar3 = this.f320424x;
            progressBar3.setProgress((int) (f * ((float) progressBar3.getMax())));
            double d = (double) (j3 - j2);
            Double.isNaN(d);
            long ceil = (long) Math.ceil(d / 1000.0d);
            this.f320399L = ceil;
            if (ceil == 0 && j2 % 1000 != 0) {
                this.f320398K++;
            }
            mo102070m();
        }
    }

    /* renamed from: q */
    public final void mo102075q() {
        boolean z = this.f320391C.f320309d;
        int i = z ? R.integer.omp_play_toggle_level_paused : R.integer.omp_play_toggle_level_playing;
        int i2 = true != z ? R.string.omp_pause : R.string.omp_play;
        this.f320393F.setImageLevel(this.f320401a.getResources().getInteger(i));
        this.f320393F.setContentDescription(this.f320401a.getResources().getString(i2));
        this.f320414n.setImageLevel(this.f320401a.getResources().getInteger(i));
        this.f320414n.setContentDescription(this.f320401a.getResources().getString(i2));
    }

    /* renamed from: r */
    public final void mo102076r() {
        if (this.f320422v.f115862E == 4) {
            C115519am amVar = this.f320406f;
            amVar.f320385a.setVisibility(8);
            C2043bi.m5551ae(amVar.f320387c.f320474a.f320475a.f320478c, 0);
            mo102066h();
            this.f320424x.setVisibility(0);
            this.f320396I.setVisibility(8);
        } else {
            this.f320406f.mo102064a();
            this.f320424x.setVisibility(4);
            this.f320396I.setVisibility(0);
        }
        mo102070m();
        mo102075q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo102077s() {
        C115534ba baVar = (C115534ba) this.f320405e;
        if (baVar.mo102079a()) {
            C115475s sVar = baVar.f320470a;
            ((C115476t) sVar).f320326a.mo28345s("onAlertDismissed", "PlaybackPanelEventsDispatcher", new Bundle());
        }
    }
}
