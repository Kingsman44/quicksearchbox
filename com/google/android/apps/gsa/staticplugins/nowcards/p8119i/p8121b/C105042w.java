package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91889m;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91891o;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.video.players.C41550ab;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.android.youtube.player.C45508d;
import com.google.android.youtube.player.C45511g;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3560a.C45439a;
import com.google.android.youtube.player.p3561b.C45447af;
import com.google.android.youtube.player.p3561b.C45448ag;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.w */
/* compiled from: PG */
public final class C105042w implements C91889m, C45511g, C45508d {

    /* renamed from: d */
    private static final C59071e f292725d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.i.b.w");

    /* renamed from: a */
    public final C21370a f292726a;

    /* renamed from: b */
    public long f292727b;

    /* renamed from: c */
    public C45448ag f292728c;

    /* renamed from: e */
    private final C91891o f292729e;

    /* renamed from: f */
    private final C86338r f292730f;

    /* renamed from: g */
    private final ViewGroup f292731g;

    /* renamed from: h */
    private final C9215cx f292732h;

    /* renamed from: i */
    private final C91890n f292733i;

    /* renamed from: j */
    private final Optional f292734j;

    /* renamed from: k */
    private final C58881cr f292735k;

    /* renamed from: l */
    private String f292736l;

    /* renamed from: m */
    private final C41550ab f292737m;

    protected C105042w(C91891o oVar, C86338r rVar, C21370a aVar, C58881cr crVar, C41550ab abVar, ViewGroup viewGroup, C9215cx cxVar, C91890n nVar, Optional optional) {
        this.f292729e = oVar;
        this.f292730f = rVar;
        this.f292726a = aVar;
        this.f292735k = crVar;
        this.f292731g = viewGroup;
        this.f292732h = cxVar;
        this.f292733i = nVar;
        this.f292734j = optional;
        this.f292737m = abVar;
        if (oVar != null && cxVar.f31840b == 1 && optional.isPresent()) {
            ((C91881e) optional.get()).mo86418f(1);
            this.f292736l = oVar.mo86450c((C45439a) optional.get());
        }
    }

    /* renamed from: f */
    private final Optional m174257f(String str) {
        C91891o oVar = this.f292729e;
        if (oVar == null) {
            return Optional.empty();
        }
        Optional b = oVar.mo86449b(str);
        if (b.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(new C105041v((YouTubeEmbedSupportFragment) b.get(), this.f292737m));
    }

    /* renamed from: a */
    public final void mo86435a() {
        Optional f = m174257f(this.f292736l);
        if (f.isPresent()) {
            C105041v vVar = (C105041v) f.get();
            if (this.f292734j.isPresent()) {
                ((C91881e) this.f292734j.get()).mo86418f(4);
            }
            vVar.f292723a.mo49570a();
        }
    }

    /* renamed from: b */
    public final void mo86436b() {
        Optional f = m174257f(this.f292736l);
        if (f.isPresent()) {
            ((C105041v) f.get()).f292723a.mo49571b();
        }
    }

    /* renamed from: c */
    public final void mo86437c() {
        Optional f = m174257f(this.f292736l);
        if (!f.isEmpty()) {
            C105041v vVar = (C105041v) f.get();
            vVar.f292723a.mo49582m(this);
            vVar.f292723a.mo49581l(this);
            if (this.f292734j.isPresent()) {
                C91881e eVar = (C91881e) this.f292734j.get();
                vVar.f292723a.mo49582m(eVar);
                vVar.f292723a.mo49581l(eVar);
            }
            if (!((CardRenderingContext) this.f292735k.mo6453a()).mo49322q()) {
                View view = vVar.f292723a.getView();
                if (view == null || view.getParent() == null || view.getParent() == this.f292731g) {
                    this.f292729e.mo86454g(this.f292736l);
                }
                int childCount = this.f292731g.getChildCount();
                while (true) {
                    childCount--;
                    if (childCount < 0) {
                        break;
                    } else if ("youtube_player_view".equals(this.f292731g.getChildAt(childCount).getTag())) {
                        this.f292731g.removeViewAt(childCount);
                    }
                }
            } else {
                View a = this.f292729e.mo86448a(this.f292736l);
                if (a == null || a.getParent() == null || a.getParent() == this.f292731g) {
                    this.f292729e.mo86454g(this.f292736l);
                    if (a != null && ((CardRenderingContext) this.f292735k.mo6453a()).mo49322q()) {
                        this.f292731g.removeView(a);
                    }
                }
            }
            this.f292736l = null;
            this.f292728c = null;
        }
    }

    /* renamed from: d */
    public final void mo86438d() {
        Optional f = m174257f(this.f292736l);
        if (f.isPresent()) {
            ((C105041v) f.get()).f292723a.mo49579j();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86439e() {
        /*
            r6 = this;
            com.google.android.apps.g.d.cx r0 = r6.f292732h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            int r3 = r0.f31840b
            if (r3 != r1) goto L_0x0016
            java.lang.Object r0 = r0.f31841c
            com.google.android.apps.g.d.cw r0 = (com.google.android.apps.p489g.p494d.C9214cw) r0
            int r3 = r0.f31835a
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0016
            java.lang.String r0 = r0.f31836b
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r1 != r3) goto L_0x001e
            r0 = r2
        L_0x001e:
            if (r0 != 0) goto L_0x0035
            com.google.common.f.e r0 = f292725d
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "YoutubeVideoPlayer"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Unable to fetch youtube video id"
            r2 = 22113(0x5661, float:3.0987E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x0035:
            android.view.ViewGroup r1 = r6.f292731g
            r3 = 0
            r1.setVisibility(r3)
            int r1 = android.view.View.generateViewId()
            android.view.ViewGroup r3 = r6.f292731g
            r3.setId(r1)
            com.google.android.apps.gsa.sidekick.shared.o.o r1 = r6.f292729e
            if (r1 == 0) goto L_0x011f
            java.lang.String r1 = r6.f292736l
            if (r1 != 0) goto L_0x004e
            goto L_0x011f
        L_0x004e:
            j$.util.Optional r1 = r6.m174257f(r1)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0059
            return
        L_0x0059:
            java.lang.Object r1 = r1.get()
            com.google.android.apps.gsa.staticplugins.nowcards.i.b.v r1 = (com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105041v) r1
            com.google.common.base.cr r3 = r6.f292735k
            java.lang.Object r3 = r3.mo6453a()
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r3 = (com.google.android.sidekick.shared.remoteapi.CardRenderingContext) r3
            boolean r3 = r3.mo49322q()
            if (r3 == 0) goto L_0x00a8
            com.google.android.apps.gsa.sidekick.shared.o.o r3 = r6.f292729e
            java.lang.String r4 = r6.f292736l
            android.view.View r3 = r3.mo86448a(r4)
            if (r3 != 0) goto L_0x0093
            com.google.android.apps.gsa.sidekick.shared.o.o r3 = r6.f292729e
            java.lang.String r4 = r6.f292736l
            r3.mo86453f(r4)
            com.google.android.apps.gsa.sidekick.shared.o.o r3 = r6.f292729e
            java.lang.String r4 = r6.f292736l
            android.view.View r3 = r3.mo86448a(r4)
            if (r3 == 0) goto L_0x008d
            android.view.ViewGroup r4 = r6.f292731g
            r4.addView(r3)
        L_0x008d:
            com.google.android.apps.gsa.sidekick.shared.o.o r3 = r6.f292729e
            r3.mo86451d()
            goto L_0x00de
        L_0x0093:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x00a2
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r3)
        L_0x00a2:
            android.view.ViewGroup r4 = r6.f292731g
            r4.addView(r3)
            goto L_0x00de
        L_0x00a8:
            com.google.android.apps.gsa.sidekick.shared.o.o r3 = r6.f292729e
            r3.mo86451d()
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r3 = r1.f292723a
            android.view.View r3 = r3.getView()
            if (r3 == 0) goto L_0x00cc
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x00cc
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewGroup r5 = r6.f292731g
            if (r4 == r5) goto L_0x00cc
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeView(r3)
        L_0x00cc:
            if (r3 == 0) goto L_0x00de
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L_0x00de
            java.lang.String r4 = "youtube_player_view"
            r3.setTag(r4)
            android.view.ViewGroup r4 = r6.f292731g
            r4.addView(r3)
        L_0x00de:
            com.google.android.apps.gsa.search.core.preferences.r r3 = r6.f292730f
            java.lang.String r4 = "google_account"
            java.lang.String r2 = r3.getString(r4, r2)
            com.google.android.libraries.search.video.players.ab r3 = r1.f292724b
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r4 = r1.f292723a
            r3.mo44079a(r4, r2)
            j$.util.Optional r2 = r6.f292734j
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L_0x0107
            j$.util.Optional r2 = r6.f292734j
            java.lang.Object r2 = r2.get()
            com.google.android.apps.gsa.sidekick.shared.o.e r2 = (com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e) r2
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r3 = r1.f292723a
            r3.mo49574e(r2)
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r3 = r1.f292723a
            r3.mo49575f(r2)
        L_0x0107:
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r2 = r1.f292723a
            r2.mo49575f(r6)
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r2 = r1.f292723a
            r2.mo49574e(r6)
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r2 = r1.f292723a
            r2.mo49578i(r0)
            com.google.android.youtube.player.YouTubeEmbedSupportFragment r0 = r1.f292723a
            com.google.android.apps.gsa.staticplugins.nowcards.i.b.u r1 = com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105040u.f292722a
            com.google.android.youtube.player.b.e r0 = r0.f118840a
            r0.mo49646k(r1)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105042w.mo86439e():void");
    }

    /* renamed from: m */
    public final void mo44073m(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment, C45448ag agVar) {
        this.f292728c = agVar;
        int i = agVar.f118867b - 1;
        if (i == 0) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (i == 1) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f292727b = this.f292726a.mo26870b();
            this.f292733i.mo86447h(4);
        } else if (i == 3) {
            C59104x d = f292725d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "YoutubeVideoPlayer");
            ((C59052c) ((C59052c) d).mo56372aa(22112)).mo56386p("Unmute event should not be possible.");
            int i2 = C90755l.f253831a;
        } else if (i == 4) {
            C58976aa aaVar3 = C58975e.f156826a;
        }
    }

    /* renamed from: n */
    public final void mo44074n(C45447af afVar) {
        this.f292733i.mo86447h(6);
    }
}
