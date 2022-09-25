package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.content.Context;
import android.support.p033v7.widget.Toolbar;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90049da;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115471o;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115474r;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel.C115581c;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel.MediaPlayerCarousel;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115617ae;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.MediaPlayerPlaybackSpeedSelector;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23133c;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23134d;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23135e;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23168e;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23169f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28291i;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.as */
/* compiled from: PG */
public final class C115572as extends C22939d implements SeekBar.OnSeekBarChangeListener, C23169f {

    /* renamed from: a */
    public static final C59071e f320554a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.as");

    /* renamed from: A */
    private final C115620ah f320555A;

    /* renamed from: B */
    private final C86124t f320556B;

    /* renamed from: C */
    private ImageView f320557C;

    /* renamed from: D */
    private ImageView f320558D;

    /* renamed from: E */
    private ImageView f320559E;

    /* renamed from: F */
    private ImageView f320560F;

    /* renamed from: G */
    private TextView f320561G;

    /* renamed from: H */
    private C60870cx f320562H;

    /* renamed from: b */
    public final Context f320563b;

    /* renamed from: c */
    public final C115474r f320564c;

    /* renamed from: d */
    public final C115471o f320565d;

    /* renamed from: e */
    public final C68214a f320566e;

    /* renamed from: f */
    public final C21370a f320567f;

    /* renamed from: g */
    public final C115142a f320568g;

    /* renamed from: h */
    public View f320569h;

    /* renamed from: i */
    public View f320570i;

    /* renamed from: j */
    public View f320571j;

    /* renamed from: k */
    public View f320572k;

    /* renamed from: l */
    public SeekBar f320573l;

    /* renamed from: m */
    public ImageView f320574m;

    /* renamed from: n */
    public TextView f320575n;

    /* renamed from: o */
    public TextView f320576o;

    /* renamed from: p */
    public TextView f320577p;

    /* renamed from: q */
    public Toolbar f320578q;

    /* renamed from: r */
    public MediaPlayerPlaybackSpeedSelector f320579r;

    /* renamed from: s */
    public BottomSheetBehavior f320580s;

    /* renamed from: t */
    public C115581c f320581t;

    /* renamed from: u */
    public MediaPlayerCarousel f320582u;

    /* renamed from: v */
    public boolean f320583v;

    /* renamed from: w */
    public C52176ia f320584w = C52176ia.f136911k;

    /* renamed from: x */
    public C58833ax f320585x = C58836b.f156633a;

    /* renamed from: y */
    public final C58833ax f320586y;

    /* renamed from: z */
    private final C22871g f320587z;

    public C115572as(C22945j jVar, Context context, C115474r rVar, C115471o oVar, C115142a aVar, C22871g gVar, C115620ah ahVar, C68214a aVar2, C21370a aVar3, C86124t tVar, C58833ax axVar) {
        super(jVar);
        this.f320563b = context;
        this.f320564c = rVar;
        this.f320565d = new C115617ae(oVar, jVar);
        this.f320587z = gVar;
        this.f320555A = ahVar;
        this.f320566e = aVar2;
        this.f320567f = aVar3;
        this.f320556B = tVar;
        this.f320586y = axVar;
        this.f320568g = aVar;
    }

    /* renamed from: l */
    public static final void m191689l(View view) {
        C115142a.m190823g(2, view);
        C28292j a = C28295m.m52915a(view);
        if (a != null) {
            a.mo33794h(1);
        }
    }

    /* renamed from: m */
    public static final void m191690m(View view) {
        C115142a.m190823g(3, view);
        C28292j a = C28295m.m52915a(view);
        if (a != null) {
            a.mo33794h(2);
        }
    }

    /* renamed from: p */
    private final long m191691p(SeekBar seekBar) {
        double progress = (double) seekBar.getProgress();
        double max = (double) seekBar.getMax();
        Double.isNaN(progress);
        Double.isNaN(max);
        double d = progress / max;
        double d2 = (double) (this.f320585x.mo56113h() ? ((C115466j) this.f320585x.mo56107c()).f320314i : 0);
        Double.isNaN(d2);
        return (long) Math.max(C59203do.f157270a, d2 * d);
    }

    /* renamed from: e */
    public final C23168e mo28615e(C23129y yVar) {
        return yVar.f63477b.equals("media_player_playlist") ? new C23168e(C23135e.f63483a, new C23133c(R.animator.slide_in_up_from_out), (C23134d) null, (C23134d) null) : new C23168e(C23135e.f63483a, C115600t.f320690a, (C23134d) null, (C23134d) null);
    }

    /* renamed from: g */
    public final void mo102100g() {
        C60870cx cxVar = this.f320562H;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }

    /* renamed from: h */
    public final void mo102101h(float f) {
        MediaPlayerPlaybackSpeedSelector mediaPlayerPlaybackSpeedSelector = this.f320579r;
        if (mediaPlayerPlaybackSpeedSelector != null && this.f320580s.f115862E != 3) {
            mediaPlayerPlaybackSpeedSelector.mo102126a(f);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        mo102100g();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f320563b).inflate(R.layout.news_feature_media_player, (ViewGroup) null);
        mo28295iC(inflate);
        this.f320569h = inflate.findViewById(R.id.change_playback_speed_sheet);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.f320578q = toolbar;
        toolbar.mo2417r(R.drawable.quantum_ic_arrow_back_grey600_24);
        this.f320578q.mo2416q(this.f320563b.getResources().getString(R.string.omp_news_media_player_back_button_description));
        this.f320578q.mo2404n(R.menu.media_player_toolbar_menu);
        this.f320572k = inflate.findViewById(R.id.media_player_container);
        this.f320570i = inflate.findViewById(R.id.speed_selector_mask);
        this.f320571j = inflate.findViewById(R.id.close_speed_setting);
        this.f320578q.mo2419t(new C115563aj(this));
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.progress_seek_bar);
        this.f320573l = seekBar;
        seekBar.setPadding(0, 0, 0, 0);
        this.f320573l.setOnSeekBarChangeListener(this);
        this.f320561G = (TextView) inflate.findViewById(R.id.played_time);
        this.f320577p = (TextView) inflate.findViewById(R.id.total_duration);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.rewind);
        this.f320558D = imageView;
        imageView.setOnClickListener(new C115564ak(this));
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.toggle_pause);
        this.f320574m = imageView2;
        imageView2.setOnClickListener(new C115565al(this));
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.fast_forward);
        this.f320557C = imageView3;
        imageView3.setOnClickListener(new C115566am(this));
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.skip_next);
        this.f320560F = imageView4;
        imageView4.setOnClickListener(new C115567an(this));
        ImageView imageView5 = (ImageView) inflate.findViewById(R.id.show_playlist);
        this.f320559E = imageView5;
        imageView5.setOnClickListener(new C115568ao(this));
        this.f320575n = (TextView) inflate.findViewById(R.id.subtitle);
        this.f320576o = (TextView) inflate.findViewById(R.id.title);
        MediaPlayerPlaybackSpeedSelector mediaPlayerPlaybackSpeedSelector = (MediaPlayerPlaybackSpeedSelector) inflate.findViewById(R.id.playback_speed_selector);
        this.f320579r = mediaPlayerPlaybackSpeedSelector;
        mediaPlayerPlaybackSpeedSelector.mo102175b(new C115569ap(this));
        ((C23249a) this.f320564c.mo101871b()).mo28726b(new C115556ac(this));
        ((C23249a) this.f320564c.mo101874e()).mo28726b(new C115557ad(this));
        ((C23249a) this.f320564c.mo101873d()).mo28726b(new C115558ae(this));
        ((C23249a) this.f320564c.mo101872c()).mo28726b(new C115559af(this));
        this.f320578q.mo2393g().findItem(R.id.send_feedback).setOnMenuItemClickListener(new C115606z(this));
        this.f320578q.mo2393g().findItem(R.id.media_player_playback_speed).setOnMenuItemClickListener(new C115554aa(this));
        MenuItem findItem = this.f320578q.mo2393g().findItem(R.id.media_player_settings);
        if (this.f320586y.mo56113h()) {
            findItem.setOnMenuItemClickListener(new C115555ab(this, true != this.f320556B.mo79746e(C90049da.f248763e) ? "news" : "profile_news"));
            findItem.setVisible(true);
        }
        C28295m.m52919e(mo28297il(), new C28292j(70824));
        C28295m.m52919e(this.f320582u, new C28292j(72328));
        View view = this.f320569h;
        C28292j jVar = new C28292j(72824);
        jVar.mo33794h(2);
        C28295m.m52919e(view, jVar);
        View view2 = this.f320571j;
        C28292j jVar2 = new C28292j(72826);
        jVar2.mo33794h(2);
        jVar2.mo33795i(5);
        C28295m.m52919e(view2, jVar2);
        MediaPlayerPlaybackSpeedSelector mediaPlayerPlaybackSpeedSelector2 = this.f320579r;
        C28292j jVar3 = new C28292j(72825);
        jVar3.mo33794h(2);
        jVar3.mo33795i(31);
        C28295m.m52919e(mediaPlayerPlaybackSpeedSelector2, jVar3);
        ImageView imageView6 = this.f320558D;
        C28292j jVar4 = new C28292j(70827);
        jVar4.mo33795i(5);
        jVar4.mo33794h(1);
        C28295m.m52919e(imageView6, jVar4);
        ImageView imageView7 = this.f320557C;
        C28292j jVar5 = new C28292j(70825);
        jVar5.mo33795i(5);
        jVar5.mo33794h(1);
        C28295m.m52919e(imageView7, jVar5);
        ImageView imageView8 = this.f320560F;
        C28292j jVar6 = new C28292j(70829);
        jVar6.mo33795i(5);
        jVar6.mo33794h(1);
        C28295m.m52919e(imageView8, jVar6);
        ImageView imageView9 = this.f320574m;
        C28292j jVar7 = new C28292j(70826);
        jVar7.mo33795i(5);
        jVar7.mo33794h(1);
        C28295m.m52919e(imageView9, jVar7);
        ImageView imageView10 = this.f320559E;
        C28292j jVar8 = new C28292j(70828);
        jVar8.mo33795i(5);
        jVar8.mo33794h(1);
        C28295m.m52919e(imageView10, jVar8);
        SeekBar seekBar2 = this.f320573l;
        C28292j jVar9 = new C28292j(70830);
        jVar9.mo33795i(5);
        jVar9.mo33795i(31);
        jVar9.mo33794h(1);
        C28295m.m52919e(seekBar2, jVar9);
        Context context = this.f320563b;
        this.f320582u = (MediaPlayerCarousel) inflate.findViewById(R.id.media_item_carousel);
        C115581c cVar = new C115581c(context, this.f320587z, new C115560ag(this), this.f320555A);
        this.f320581t = cVar;
        this.f320582u.setAdapter(cVar);
        MediaPlayerCarousel mediaPlayerCarousel = this.f320582u;
        C115142a aVar = this.f320568g;
        C115581c cVar2 = this.f320581t;
        mediaPlayerCarousel.f320613d = aVar;
        mediaPlayerCarousel.f320610a = new C28291i(mediaPlayerCarousel, aVar);
        C28291i iVar = mediaPlayerCarousel.f320610a;
        iVar.f76970d = cVar2;
        iVar.mo33786b();
        this.f320582u.f320618i = new C115570aq(this);
        BottomSheetBehavior C = BottomSheetBehavior.m78767C(this.f320569h);
        this.f320580s = C;
        C.f115902m = true;
        C.mo47518u(true);
        this.f320580s.mo47516N(0);
        this.f320580s.mo47519v(4);
        this.f320580s.mo47508F(new C115571ar(this));
        View findViewById = inflate.findViewById(R.id.close_speed_setting);
        findViewById.setOnClickListener(new C115605y(this, findViewById));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        mo102101h(((Float) ((C23249a) this.f320564c.mo101873d()).mo28725a()).floatValue());
        C28293k b = C28295m.m52916b(mo28297il());
        C28293k kVar = this.f320581t.f320635a;
        if (kVar != null) {
            C28257a aVar = (C28257a) b;
            aVar.f76909b.add(kVar);
            List list = aVar.f76909b;
            C58480gp e = C58485gu.m89837e();
            e.mo55395g(C28293k.m52908e(C28295m.m52915a(this.f320579r), new C28293k[0]));
            e.mo55395g(C28293k.m52908e(C28295m.m52915a(this.f320571j), new C28293k[0]));
            list.add(C28293k.m52907d(C28295m.m52915a(this.f320569h), e.mo55394f()));
            C89949q.m146521e(C28285c.m52875b(b, 71714), false);
        }
    }

    /* renamed from: j */
    public final void mo102102j() {
        long j;
        if (this.f320585x.mo56113h()) {
            C115466j jVar = (C115466j) this.f320585x.mo56107c();
            if (!jVar.f320312g || this.f320583v) {
                if (this.f320583v) {
                    j = m191691p(this.f320573l);
                } else if (!jVar.f320310e) {
                    j = jVar.f320313h;
                } else {
                    j = jVar.f320320o > 0 ? ((long) (((float) (this.f320567f.mo26871c() - jVar.f320320o)) * ((Float) ((C23249a) this.f320564c.mo101873d()).mo28725a()).floatValue())) + jVar.f320313h : 0;
                }
                long j2 = jVar.f320314i;
                if (j2 <= 0 || j > j2) {
                    this.f320573l.setEnabled(false);
                    this.f320573l.setProgress(0);
                    return;
                }
                SeekBar seekBar = this.f320573l;
                seekBar.setProgress((int) ((((float) j) / ((float) j2)) * ((float) seekBar.getMax())));
                long j3 = j / 1000;
                double d = (double) (j2 - j);
                Double.isNaN(d);
                if (((long) Math.ceil(d / 1000.0d)) == 0 && j % 1000 != 0) {
                    j3++;
                }
                this.f320561G.setText(DateUtils.formatElapsedTime(j3));
                int i = (int) j3;
                this.f320561G.setContentDescription(this.f320563b.getResources().getQuantityString(R.plurals.omp_played_time, i, new Object[]{Integer.valueOf(i)}));
                if (jVar.f320310e && !this.f320583v) {
                    this.f320562H = this.f320587z.mo28208h("periodic-updater", (long) Math.round(50.0f / ((Float) ((C23249a) this.f320564c.mo101873d()).mo28725a()).floatValue()), new C115603w(this));
                    return;
                }
                return;
            }
            SeekBar seekBar2 = this.f320573l;
            seekBar2.setProgress(seekBar2.getMax());
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo102103k() {
        this.f320565d.mo101875e();
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            if (!this.f320583v) {
                this.f320565d.mo101880k(m191691p(seekBar));
            } else {
                mo102102j();
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f320583v = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C115142a.m190822f(this.f320573l, this.f320585x);
        this.f320583v = false;
        this.f320565d.mo101880k(m191691p(seekBar));
    }
}
