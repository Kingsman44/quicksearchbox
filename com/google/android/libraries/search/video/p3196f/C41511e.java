package com.google.android.libraries.search.video.p3196f;

import android.content.Context;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C6007z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.logging.p2185ve.synthetic.C28470n;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.apps.tiktok.media.C47449e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57147d;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.video.f.e */
/* compiled from: PG */
public final class C41511e {

    /* renamed from: l */
    private static final Uri f108436l = Uri.parse("https://www.gstatic.com/discover/images/play_button_48_48.png");

    /* renamed from: a */
    final ViewGroup f108437a;

    /* renamed from: b */
    View f108438b;

    /* renamed from: c */
    ImageView f108439c;

    /* renamed from: d */
    View f108440d;

    /* renamed from: e */
    ImageView f108441e;

    /* renamed from: f */
    TextView f108442f;

    /* renamed from: g */
    TextView f108443g;

    /* renamed from: h */
    public final Fragment f108444h;

    /* renamed from: i */
    public final Context f108445i;

    /* renamed from: j */
    public final C41510d f108446j;

    /* renamed from: k */
    public C41592w f108447k;

    /* renamed from: m */
    private final C47449e f108448m;

    /* renamed from: n */
    private boolean f108449n;

    /* renamed from: o */
    private boolean f108450o;

    /* renamed from: p */
    private Duration f108451p = Duration.ZERO;

    /* renamed from: q */
    private Duration f108452q = Duration.ZERO;

    /* renamed from: r */
    private CountDownTimer f108453r;

    public C41511e(Fragment fragment, C47449e eVar, ViewGroup viewGroup, C41510d dVar) {
        this.f108444h = fragment;
        this.f108448m = eVar;
        this.f108445i = viewGroup.getContext();
        this.f108437a = viewGroup;
        this.f108446j = dVar;
    }

    /* renamed from: a */
    public final void mo44035a(C57143b bVar, C41592w wVar) {
        this.f108447k = wVar;
        this.f108449n = bVar.f152533d;
        this.f108450o = bVar.f152537h;
        this.f108438b = this.f108437a.findViewById(R.id.ad_video_replay_overlay);
        this.f108439c = (ImageView) this.f108437a.findViewById(R.id.ad_video_replay_background);
        this.f108440d = this.f108437a.findViewById(R.id.play_button_container);
        this.f108441e = (ImageView) this.f108437a.findViewById(R.id.play_button);
        this.f108442f = (TextView) this.f108437a.findViewById(R.id.replay_cta_button);
        this.f108443g = (TextView) this.f108437a.findViewById(R.id.replay_count_down);
        if (this.f108449n && this.f108438b != null) {
            this.f108451p = Duration.ofMillis(bVar.f152536g);
            this.f108452q = Duration.ofMillis(bVar.f152539j);
            if (this.f108439c != null) {
                C47449e eVar = this.f108448m;
                C6007z h = eVar.mo51286a().mo11870h(Uri.parse(bVar.f152534e));
                ImageView imageView = this.f108439c;
                imageView.getClass();
                h.mo12454r(imageView);
                if (this.f108450o || this.f108452q.isZero()) {
                    ImageView imageView2 = this.f108439c;
                    imageView2.getClass();
                    imageView2.setColorFilter(0);
                    if (this.f108446j != null && !this.f108437a.hasOnClickListeners()) {
                        this.f108437a.setOnClickListener(new C41507a(this));
                    }
                    TextView textView = this.f108442f;
                    textView.getClass();
                    textView.setVisibility(8);
                    if (this.f108450o) {
                        View view = this.f108440d;
                        view.getClass();
                        view.setVisibility(0);
                    }
                    C47449e eVar2 = this.f108448m;
                    C6007z h2 = eVar2.mo51286a().mo11870h(f108436l);
                    ImageView imageView3 = this.f108441e;
                    imageView3.getClass();
                    h2.mo12454r(imageView3);
                } else if (this.f108442f == null || bVar.f152535f.size() <= 0) {
                    TextView textView2 = this.f108442f;
                    textView2.getClass();
                    textView2.setVisibility(8);
                } else {
                    TextView textView3 = this.f108442f;
                    textView3.getClass();
                    textView3.setText(((C57147d) bVar.f152535f.get(0)).f152562a);
                    TextView textView4 = this.f108442f;
                    textView4.getClass();
                    textView4.setOnClickListener(new C41508b(this, bVar));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo44036b() {
        LayoutInflater.from(this.f108445i).inflate(R.layout.ad_video_end_overlay, this.f108437a);
        this.f108437a.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo44037c() {
        CountDownTimer countDownTimer = this.f108453r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: d */
    public final void mo44038d(int i) {
        C41592w wVar;
        C41592w wVar2;
        C41510d dVar;
        C41517k kVar;
        C28439i iVar;
        C41517k kVar2;
        C28439i iVar2;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 2 || i2 == 3) {
            if (this.f108449n && this.f108438b != null) {
                this.f108437a.setVisibility(8);
            }
        } else if (i2 == 4 && this.f108449n && this.f108438b != null && (wVar = this.f108447k) != null && wVar.mo44082e().getSeconds() >= this.f108451p.getSeconds() && this.f108438b != null && this.f108443g != null) {
            CountDownTimer countDownTimer = this.f108453r;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f108437a.setVisibility(0);
            if (this.f108450o) {
                C41510d dVar2 = this.f108446j;
                if (dVar2 != null && (iVar2 = kVar2.f108491x) != null) {
                    C28439i iVar3 = (kVar2 = (C41517k) dVar2).f108462B;
                    if (iVar3 == null) {
                        C28463g gVar = kVar2.f108473f;
                        C28313c a = kVar2.f108472e.mo33805a(C28427h.m53115a(158188));
                        gVar.mo33919c(iVar2);
                        kVar2.f108462B = C28470n.m53226a(iVar2, a);
                        kVar2.f108473f.mo33922f();
                        return;
                    }
                    iVar3.mo33892i(1);
                    kVar2.f108473f.mo33922f();
                    return;
                }
                return;
            }
            if (!(this.f108452q.isZero() || (dVar = this.f108446j) == null || (iVar = kVar.f108491x) == null)) {
                C28463g gVar2 = (kVar = (C41517k) dVar).f108473f;
                C28313c a2 = kVar.f108472e.mo33805a(C28427h.m53115a(143615));
                gVar2.mo33919c(iVar);
                kVar.f108461A = C28470n.m53226a(iVar, a2);
            }
            if (this.f108450o || !this.f108452q.isZero() || (wVar2 = this.f108447k) == null) {
                this.f108453r = new C41509c(this, this.f108452q.toMillis()).start();
            } else {
                wVar2.mo44087j();
            }
        }
    }
}
