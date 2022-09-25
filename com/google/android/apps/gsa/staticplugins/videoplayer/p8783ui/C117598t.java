package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105022c;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105023d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105071h;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105072i;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117547a;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117550d;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117552f;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.video.thirdparty.C41606h;
import com.google.android.libraries.search.video.thirdparty.C41607i;
import com.google.android.libraries.search.video.thirdparty.C41613o;
import com.google.android.libraries.search.video.thirdparty.C41617s;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54782b;
import dagger.C68214a;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.t */
/* compiled from: PG */
public final class C117598t extends C22939d implements C41606h {

    /* renamed from: A */
    private ViewGroup f326422A;

    /* renamed from: B */
    private WebImageView f326423B;

    /* renamed from: C */
    private final C105071h f326424C;

    /* renamed from: a */
    public final C22871g f326425a;

    /* renamed from: b */
    public final Context f326426b;

    /* renamed from: c */
    public final C68214a f326427c;

    /* renamed from: d */
    public C41607i f326428d;

    /* renamed from: e */
    public C41617s f326429e;

    /* renamed from: f */
    public final Activity f326430f;

    /* renamed from: g */
    C91881e f326431g;

    /* renamed from: h */
    public ContentResolver f326432h;

    /* renamed from: i */
    ContentObserver f326433i;

    /* renamed from: j */
    boolean f326434j;

    /* renamed from: k */
    public C60870cx f326435k;

    /* renamed from: l */
    public ViewGroup f326436l;

    /* renamed from: m */
    public C105072i f326437m;

    /* renamed from: n */
    public C105072i f326438n;

    /* renamed from: o */
    public C105072i f326439o;

    /* renamed from: p */
    public final C41613o f326440p;

    /* renamed from: q */
    private final C117550d f326441q;

    /* renamed from: r */
    private final C117547a f326442r;

    /* renamed from: s */
    private final Optional f326443s;

    /* renamed from: t */
    private final C90323a f326444t;

    /* renamed from: u */
    private final C90324b f326445u = new C117597s(this);

    /* renamed from: v */
    private final C91189au f326446v;

    /* renamed from: w */
    private View f326447w;

    /* renamed from: x */
    private View f326448x;

    /* renamed from: y */
    private View f326449y;

    /* renamed from: z */
    private ViewGroup f326450z;

    public C117598t(C22945j jVar, C117550d dVar, Context context, C68214a aVar, C41613o oVar, Optional optional, C117547a aVar2, C58833ax axVar, Optional optional2, C22871g gVar, C90323a aVar3, C91189au auVar) {
        super(jVar);
        this.f326441q = dVar;
        this.f326426b = context;
        this.f326427c = aVar;
        this.f326440p = oVar;
        this.f326424C = (C105071h) optional.get();
        this.f326442r = aVar2;
        this.f326430f = (Activity) axVar.mo56107c();
        this.f326443s = optional2;
        this.f326425a = gVar;
        this.f326444t = aVar3;
        this.f326446v = auVar;
    }

    /* renamed from: r */
    public static void m195460r(List list, C105072i iVar) {
        if (!list.isEmpty()) {
            iVar.mo94518a(CardRenderingContext.f118455a, list);
        }
    }

    /* renamed from: e */
    public final void mo103395e() {
        C60870cx cxVar = this.f326435k;
        if (cxVar != null && !cxVar.isDone() && !this.f326435k.isCancelled()) {
            this.f326435k.cancel(true);
            this.f326435k = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo103396h(int i) {
        C90779c.m148334a(this.f326430f, i);
        if (this.f326434j) {
            this.f326425a.mo28213m("reset screen orientation", 3500, new C117588j(this));
        }
    }

    /* renamed from: hW */
    public final void mo44142hW() {
    }

    /* renamed from: i */
    public final void mo44143i(int i) {
        C41607i iVar = this.f326428d;
        if (iVar != null) {
            iVar.mo44173G();
        }
        this.f326448x.setVisibility(0);
    }

    /* renamed from: im */
    public final void mo28298im() {
        C91881e eVar = this.f326431g;
        if (eVar != null) {
            eVar.mo86419g(11);
        }
        this.f326431g = null;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f326432h = this.f326430f.getContentResolver();
        OneTapVideoPlayerLayout oneTapVideoPlayerLayout = (OneTapVideoPlayerLayout) LayoutInflater.from(this.f326426b).inflate(R.layout.thirdpartyplayer, (ViewGroup) null, false);
        mo28295iC(oneTapVideoPlayerLayout);
        oneTapVideoPlayerLayout.f326320a = new C117590l(this);
        this.f326436l = (ViewGroup) oneTapVideoPlayerLayout.findViewById(R.id.video_container);
        this.f326447w = oneTapVideoPlayerLayout.findViewById(R.id.video_black_overlay);
        this.f326448x = oneTapVideoPlayerLayout.findViewById(R.id.third_party_error_overlay);
        this.f326423B = (WebImageView) oneTapVideoPlayerLayout.findViewById(R.id.static_thumbnail);
        this.f326450z = (ViewGroup) oneTapVideoPlayerLayout.findViewById(R.id.title);
        C105072i a = this.f326424C.mo94517a(this.f326426b);
        this.f326437m = a;
        this.f326450z.addView(a.f292801a);
        this.f326437m.f292801a.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f326422A = (ViewGroup) oneTapVideoPlayerLayout.findViewById(R.id.attribution);
        C105072i a2 = this.f326424C.mo94517a(this.f326426b);
        this.f326438n = a2;
        this.f326422A.addView(a2.f292801a);
        this.f326438n.f292801a.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C105072i a3 = this.f326424C.mo94517a(this.f326426b);
        this.f326439o = a3;
        ((ViewGroup) oneTapVideoPlayerLayout.findViewById(R.id.error_message_text)).addView(a3.f292801a);
        this.f326439o.f292801a.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ((C117580b) this.f326441q).f326395a.mo28726b(new C117591m(this));
        ((C117580b) this.f326441q).f326397c.mo28726b(new C117592n(this));
        this.f326450z.setOnClickListener(new C117593o(this));
        this.f326422A.setOnClickListener(new C117594p(this));
        this.f326448x.setOnClickListener(new C117595q(this));
        ((C117580b) this.f326441q).f326398d.mo28726b(new C117584f(this));
        View findViewById = oneTapVideoPlayerLayout.findViewById(R.id.close);
        this.f326449y = findViewById;
        findViewById.setOnClickListener(new C117585g(this));
        mo103400q(this.f326430f.getResources().getConfiguration());
        this.f326444t.mo84004a(this.f326445u);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        boolean z = true;
        if (Settings.System.getInt(this.f326432h, "accelerometer_rotation", 0) != 1) {
            z = false;
        }
        this.f326434j = z;
        this.f326433i = new C117596r(this, new Handler());
        this.f326432h.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this.f326433i);
        if (this.f326431g == null) {
            mo103398m((C117552f) ((C117580b) this.f326441q).f326397c.f63720e);
        }
    }

    /* renamed from: j */
    public final void mo44144j(int i) {
    }

    /* renamed from: js */
    public final void mo28301js() {
        mo103395e();
        C41607i iVar = this.f326428d;
        if (iVar != null) {
            iVar.mo44173G();
        }
        this.f326444t.mo84005b(this.f326445u);
    }

    /* renamed from: k */
    public final void mo44145k(int i, C41607i iVar) {
        if (i != 2) {
            mo103395e();
            if (i == 8) {
                C9212cu cuVar = ((C117552f) ((C117580b) this.f326441q).f326397c.f63720e).f326299d;
                if (cuVar == null) {
                    cuVar = C9212cu.f31820l;
                }
                if ((cuVar.f31822a & 16) != 0) {
                    this.f326423B.mo76738i(cuVar.f31828g, this.f326446v);
                    this.f326423B.setVisibility(0);
                    return;
                }
                return;
            }
        }
        this.f326423B.setVisibility(8);
    }

    /* renamed from: l */
    public final void mo103397l() {
        String str = (String) ((C117580b) this.f326441q).f326396b.f63720e;
        if (str != null && !str.isEmpty()) {
            C91881e eVar = this.f326431g;
            if (eVar != null) {
                eVar.mo86419g(12);
            }
            C41607i iVar = this.f326428d;
            if (iVar != null) {
                iVar.mo44170D();
            }
            this.f326442r.mo103367f(str);
        }
    }

    /* renamed from: m */
    public final void mo103398m(C117552f fVar) {
        if (this.f326428d != null && (fVar.f326296a & 4) != 0) {
            C9212cu cuVar = fVar.f326299d;
            if (cuVar == null) {
                cuVar = C9212cu.f31820l;
            }
            C117547a aVar = this.f326442r;
            Objects.requireNonNull(aVar);
            C117583e eVar = new C117583e(aVar);
            C105023d dVar = (C105023d) this.f326443s.get();
            long j = fVar.f326297b;
            int a = C54782b.m87527a(cuVar.f31829h);
            C91881e a2 = dVar.mo94478a(j, a == 0 ? 1 : a, (String) null, fVar.f326304i, 3, true, Optional.empty(), Optional.m71637of(eVar));
            C41607i iVar = this.f326428d;
            Objects.requireNonNull(iVar);
            ((C105022c) a2).f292642b = Optional.m71637of(new C117587i(iVar));
            this.f326431g = a2;
            this.f326428d.mo44168B(a2);
        }
    }

    /* renamed from: p */
    public final void mo103399p() {
        mo103395e();
        C91881e eVar = this.f326431g;
        if (eVar != null) {
            eVar.mo86419g(11);
            this.f326431g.mo86413a();
        }
        C41607i iVar = this.f326428d;
        if (iVar != null) {
            iVar.mo44173G();
        }
        this.f326430f.finish();
        this.f326430f.overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: q */
    public final void mo103400q(Configuration configuration) {
        int i = configuration.orientation;
        int i2 = 0;
        boolean z = i == 2;
        this.f326430f.getWindow().getDecorView().setSystemUiVisibility(i == 2 ? 5894 : 1);
        C117552f fVar = (C117552f) ((C117580b) this.f326441q).f326397c.f63720e;
        int i3 = 8;
        if ((fVar.f326296a & 8) != 0) {
            float f = fVar.f326300e;
            this.f326447w.getLayoutParams().height = (int) (((float) this.f326426b.getResources().getDisplayMetrics().widthPixels) / f);
            if (z) {
                this.f326436l.getLayoutParams().height = -1;
            } else {
                this.f326436l.getLayoutParams().height = (int) (((float) this.f326426b.getResources().getDisplayMetrics().widthPixels) / f);
            }
        }
        if (true == z) {
            i2 = 8;
        }
        this.f326449y.setVisibility(i2);
        this.f326450z.setVisibility(true != ((C117552f) ((C117580b) this.f326441q).f326397c.f63720e).f326301f.isEmpty() ? i2 : 8);
        ViewGroup viewGroup = this.f326422A;
        if (true != ((C117552f) ((C117580b) this.f326441q).f326397c.f63720e).f326302g.isEmpty()) {
            i3 = i2;
        }
        viewGroup.setVisibility(i3);
        C41617s sVar = this.f326429e;
        if (sVar != null) {
            sVar.mo44186f(z);
        }
    }
}
