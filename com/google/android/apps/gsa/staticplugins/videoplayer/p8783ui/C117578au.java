package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0395p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105022c;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105023d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105071h;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105072i;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117547a;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117554h;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8782b.C117556j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.video.players.C41550ab;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.android.youtube.player.C45508d;
import com.google.android.youtube.player.C45509e;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3561b.C45463av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.au */
/* compiled from: PG */
public final class C117578au extends C22939d {

    /* renamed from: A */
    private View f326360A;

    /* renamed from: B */
    private View f326361B;

    /* renamed from: C */
    private final C105071h f326362C;

    /* renamed from: a */
    C117556j f326363a;

    /* renamed from: b */
    public final Context f326364b;

    /* renamed from: c */
    public final C0395p f326365c;

    /* renamed from: d */
    public final C117547a f326366d;

    /* renamed from: e */
    C91881e f326367e;

    /* renamed from: f */
    YouTubeEmbedSupportFragment f326368f;

    /* renamed from: g */
    public ContentResolver f326369g;

    /* renamed from: h */
    ContentObserver f326370h;

    /* renamed from: i */
    boolean f326371i;

    /* renamed from: j */
    C117577at f326372j;

    /* renamed from: k */
    C117576as f326373k;

    /* renamed from: l */
    C45508d f326374l;

    /* renamed from: m */
    C45509e f326375m;

    /* renamed from: n */
    public ViewGroup f326376n;

    /* renamed from: o */
    public ViewGroup f326377o;

    /* renamed from: p */
    public View f326378p;

    /* renamed from: q */
    public int f326379q;

    /* renamed from: r */
    public final C41550ab f326380r;

    /* renamed from: s */
    public C45463av f326381s;

    /* renamed from: t */
    public C105072i f326382t;

    /* renamed from: u */
    public C105072i f326383u;

    /* renamed from: v */
    private final C22871g f326384v;

    /* renamed from: w */
    private final C117554h f326385w;

    /* renamed from: x */
    private final Optional f326386x;

    /* renamed from: y */
    private Application.ActivityLifecycleCallbacks f326387y;

    /* renamed from: z */
    private View f326388z;

    public C117578au(C22945j jVar, C117554h hVar, Context context, C117547a aVar, C58833ax axVar, Optional optional, C22871g gVar, Optional optional2, C41550ab abVar) {
        super(jVar);
        C58838bb.m90883r(axVar.mo56113h());
        C58838bb.m90883r(axVar.mo56107c() instanceof C0395p);
        this.f326385w = hVar;
        this.f326364b = context;
        this.f326366d = aVar;
        this.f326365c = (C0395p) axVar.mo56107c();
        this.f326386x = optional;
        this.f326384v = gVar;
        this.f326362C = (C105071h) optional2.get();
        this.f326380r = abVar;
    }

    /* renamed from: l */
    public static void m195430l(List list, C105072i iVar) {
        if (!list.isEmpty()) {
            iVar.mo94518a(CardRenderingContext.f118455a, list);
        }
    }

    /* renamed from: e */
    public final void mo103384e(int i) {
        C90779c.m148334a(this.f326365c, i);
        if (this.f326371i) {
            this.f326384v.mo28213m("reset screen orientation", 3500, new C117560ac(this));
        }
    }

    /* renamed from: g */
    public final void mo103385g() {
        this.f326361B.setVisibility(8);
        this.f326361B.getLayoutParams().height = 0;
    }

    /* renamed from: h */
    public final void mo103386h() {
        if (this.f326368f != null && this.f326386x.isPresent()) {
            C117547a aVar = this.f326366d;
            Objects.requireNonNull(aVar);
            C117567aj ajVar = new C117567aj(aVar);
            C117556j jVar = this.f326363a;
            C91881e a = ((C105023d) this.f326386x.get()).mo94478a(jVar.f326312c, 0, jVar.f326311b, (String) null, 2, true, Optional.empty(), Optional.m71637of(ajVar));
            this.f326367e = a;
            C105022c cVar = (C105022c) a;
            cVar.f292643c = 3;
            cVar.f292641a = true;
            this.f326368f.mo49575f(a);
            this.f326368f.mo49574e(a);
            C45463av avVar = this.f326381s;
            if (avVar != null) {
                C0395p pVar = this.f326365c;
                Objects.requireNonNull(pVar);
                avVar.mo49607c(a, new C117565ah(pVar));
            }
            a.mo86418f(7);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C91881e eVar = this.f326367e;
        if (!(eVar == null || this.f326368f == null)) {
            eVar.mo86419g(11);
            this.f326368f.mo49582m(eVar);
            this.f326368f.mo49581l(eVar);
            C45463av avVar = this.f326381s;
            if (avVar != null) {
                avVar.mo49611g(eVar);
            }
        }
        this.f326367e = null;
        this.f326369g.unregisterContentObserver(this.f326370h);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f326369g = this.f326365c.getContentResolver();
        OneTapVideoPlayerLayout oneTapVideoPlayerLayout = (OneTapVideoPlayerLayout) LayoutInflater.from(this.f326364b).inflate(R.layout.videoplayer, (ViewGroup) null, false);
        this.f326376n = (ViewGroup) oneTapVideoPlayerLayout.findViewById(R.id.title);
        this.f326377o = (ViewGroup) oneTapVideoPlayerLayout.findViewById(R.id.attribution);
        this.f326361B = oneTapVideoPlayerLayout.findViewById(R.id.video_black_overlay);
        this.f326378p = oneTapVideoPlayerLayout.findViewById(R.id.video_size_frame);
        mo28295iC(oneTapVideoPlayerLayout);
        this.f326360A = oneTapVideoPlayerLayout.findViewById(R.id.video_frame);
        this.f326387y = new C117573ap(this);
        this.f326365c.getApplication().registerActivityLifecycleCallbacks(this.f326387y);
        this.f326365c.getWindow().setSoftInputMode(3);
        oneTapVideoPlayerLayout.f326320a = new C117570am(this);
        C105072i a = this.f326362C.mo94517a(this.f326364b);
        this.f326382t = a;
        this.f326376n.addView(a.f292801a);
        this.f326382t.f292801a.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C105072i a2 = this.f326362C.mo94517a(this.f326364b);
        this.f326383u = a2;
        this.f326377o.addView(a2.f292801a);
        this.f326383u.f292801a.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f326379q = (int) (((float) this.f326364b.getResources().getDisplayMetrics().widthPixels) / 1.7777778f);
        ((C117582d) this.f326385w).f326404c.mo28726b(new C117571an(this));
        ((C117582d) this.f326385w).f326405d.mo28726b(new C117572ao(this));
        ((C117582d) this.f326385w).f326402a.mo28726b(new C117561ad(this));
        ((C117582d) this.f326385w).f326403b.mo28726b(new C117562ae(this));
        View findViewById = oneTapVideoPlayerLayout.findViewById(R.id.close);
        this.f326388z = findViewById;
        findViewById.setOnClickListener(new C117563af(this));
        mo103388k(this.f326365c.getResources().getConfiguration());
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        boolean z = true;
        if (Settings.System.getInt(this.f326369g, "accelerometer_rotation", 0) != 1) {
            z = false;
        }
        this.f326371i = z;
        this.f326370h = new C117574aq(this, new Handler());
        this.f326369g.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this.f326370h);
        if (this.f326367e == null) {
            mo103386h();
        }
    }

    /* renamed from: j */
    public final void mo103387j() {
        this.f326378p.getLayoutParams().height = this.f326379q;
        this.f326361B.setVisibility(0);
        this.f326360A.getLayoutParams().height = 0;
        C91881e eVar = this.f326367e;
        if (eVar != null) {
            eVar.mo86419g(11);
            this.f326367e.mo86413a();
        }
        this.f326368f.mo49576g(false);
        FragmentManager jw = this.f326365c.mo545jw();
        Fragment c = jw.f634a.mo671c("YOUTUBE_PLAYER");
        if (c != null) {
            C0154a aVar = new C0154a(jw);
            aVar.mo516m(c);
            aVar.mo509f();
        }
        this.f326365c.finish();
        this.f326365c.overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: js */
    public final void mo28301js() {
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = this.f326368f;
        if (youTubeEmbedSupportFragment != null) {
            youTubeEmbedSupportFragment.mo49582m(this.f326372j);
            this.f326368f.mo49581l(this.f326374l);
        }
        C45463av avVar = this.f326381s;
        if (avVar != null) {
            avVar.mo49611g(this.f326373k);
        }
        this.f326365c.getApplication().unregisterActivityLifecycleCallbacks(this.f326387y);
    }

    /* renamed from: k */
    public final void mo103388k(Configuration configuration) {
        int i = configuration.orientation;
        int i2 = 1;
        int i3 = 0;
        boolean z = i == 2;
        YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = this.f326368f;
        if (youTubeEmbedSupportFragment != null) {
            youTubeEmbedSupportFragment.mo49576g(z);
        }
        View decorView = this.f326365c.getWindow().getDecorView();
        if (i == 2) {
            i2 = 5894;
        }
        decorView.setSystemUiVisibility(i2);
        int i4 = 8;
        if (i == 2) {
            i3 = 8;
        }
        this.f326388z.setVisibility(i3);
        ViewGroup viewGroup = this.f326376n;
        C117556j jVar = this.f326363a;
        viewGroup.setVisibility((jVar == null || !jVar.f326314e.isEmpty()) ? i3 : 8);
        ViewGroup viewGroup2 = this.f326377o;
        C117556j jVar2 = this.f326363a;
        if (jVar2 == null || !jVar2.f326315f.isEmpty()) {
            i4 = i3;
        }
        viewGroup2.setVisibility(i4);
    }
}
