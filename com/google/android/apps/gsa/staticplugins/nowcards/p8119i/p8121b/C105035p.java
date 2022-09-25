package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91887k;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91888l;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91889m;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.video.thirdparty.C41607i;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.android.youtube.player.p3561b.C45448ag;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7718hj;
import dagger.C68214a;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.p */
/* compiled from: PG */
public final class C105035p implements C91887k {

    /* renamed from: c */
    private static final C59071e f292684c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.i.b.p");

    /* renamed from: a */
    public final Optional f292685a;

    /* renamed from: b */
    public final C91890n f292686b;

    /* renamed from: d */
    private final Context f292687d;

    /* renamed from: e */
    private final C22871g f292688e;

    /* renamed from: f */
    private final C105024e f292689f;

    /* renamed from: g */
    private final C58881cr f292690g;

    /* renamed from: h */
    private final ViewGroup f292691h;

    /* renamed from: i */
    private final C9215cx f292692i;

    /* renamed from: j */
    private C91889m f292693j;

    /* renamed from: k */
    private boolean f292694k;

    /* renamed from: l */
    private C60870cx f292695l;

    /* renamed from: m */
    private C60870cx f292696m;

    /* renamed from: n */
    private boolean f292697n;

    /* renamed from: i */
    private final void m174238i() {
        C60870cx cxVar = this.f292695l;
        if (cxVar != null && !cxVar.isCancelled() && !this.f292695l.isDone()) {
            this.f292695l.cancel(true);
            this.f292695l = null;
        }
    }

    /* renamed from: j */
    private final void m174239j() {
        C60870cx cxVar = this.f292696m;
        if (cxVar != null && !cxVar.isCancelled() && !this.f292696m.isDone()) {
            this.f292696m.cancel(true);
            this.f292696m = null;
        }
    }

    /* renamed from: k */
    private final boolean m174240k() {
        C9215cx cxVar = this.f292692i;
        return cxVar != null && cxVar.f31840b == 1 && (cxVar.f31839a & 8) == 0;
    }

    /* renamed from: a */
    public final void mo86428a() {
        boolean z;
        ViewGroup viewGroup = this.f292691h;
        if (!this.f292694k && !this.f292686b.mo86444e() && this.f292693j != null) {
            mo86429b();
            if (m174240k() || this.f292686b.mo86446g() != 4) {
                this.f292686b.mo86447h(3);
            }
            CardRenderingContext cardRenderingContext = (CardRenderingContext) this.f292690g.mo6453a();
            synchronized (cardRenderingContext.f118456b) {
                z = cardRenderingContext.f118457c.getBoolean("PREVENT_INLINE_VIDEO_LOAD_TIMEOUT_FLAG");
            }
            if (!z) {
                this.f292695l = this.f292688e.mo28208h("Cancel load indicator after a few seconds", 15000, new C105032m(this));
            }
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                if (((CardRenderingContext) this.f292690g.mo6453a()).mo49306a() > 0) {
                    this.f292696m = this.f292688e.mo28208h("Introduce wait time to increase latency in video autoplay", (long) ((CardRenderingContext) this.f292690g.mo6453a()).mo49306a(), new C105033n(this));
                } else {
                    mo94481g();
                }
                this.f292694k = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo86429b() {
        if (!this.f292697n || (((CardRenderingContext) this.f292690g.mo6453a()).mo49322q() && m174240k())) {
            C91889m mVar = this.f292693j;
            if (mVar != null) {
                mVar.mo86439e();
            }
            this.f292697n = true;
        }
    }

    /* renamed from: c */
    public final void mo86430c() {
        if (this.f292694k) {
            this.f292694k = false;
            mo94482h();
            m174238i();
            m174239j();
            if (this.f292686b.mo86446g() == 3) {
                this.f292686b.mo86447h(2);
            }
            if (this.f292685a.isPresent()) {
                ((C91881e) this.f292685a.get()).mo86419g(6);
            }
        }
    }

    /* renamed from: d */
    public final void mo86431d() {
        C91889m mVar;
        m174238i();
        m174239j();
        this.f292686b.mo86447h(2);
        if ((!m174240k() || !((CardRenderingContext) this.f292690g.mo6453a()).mo49322q()) && (mVar = this.f292693j) != null) {
            mVar.mo86436b();
        }
        C91889m mVar2 = this.f292693j;
        if (mVar2 != null) {
            mVar2.mo86437c();
            this.f292693j = null;
        }
        this.f292694k = false;
        this.f292697n = false;
    }

    /* renamed from: e */
    public final void mo86432e() {
        mo86430c();
        this.f292686b.mo86447h(2);
    }

    /* renamed from: f */
    public final boolean mo86433f(C9215cx cxVar, long j, C7718hj hjVar) {
        View view;
        long j2;
        Duration duration;
        if (this.f292686b.mo86444e()) {
            return false;
        }
        if (this.f292691h.findViewById(R.id.video_black_overlay_for_transition) != null) {
            view = this.f292691h.findViewById(R.id.video_black_overlay_for_transition);
            view.bringToFront();
        } else {
            view = null;
        }
        View view2 = view;
        if (this.f292685a.isPresent()) {
            ((C91881e) this.f292685a.get()).mo86419g(9);
        }
        int i = cxVar.f31840b;
        long j3 = 0;
        if (i == 1) {
            C91889m mVar = this.f292693j;
            if (mVar instanceof C105042w) {
                C105042w wVar = (C105042w) mVar;
                long b = wVar.f292726a.mo26870b();
                C45448ag agVar = wVar.f292728c;
                if (agVar != null) {
                    if (agVar.f118867b != 2) {
                        j3 = Math.max(agVar.f118866a, 0);
                    } else {
                        long j4 = wVar.f292727b;
                        if (j4 > 0) {
                            j3 = agVar.f118866a + (b - j4);
                        }
                    }
                }
            }
            this.f292689f.mo94479a(cxVar, j, j3, view2, hjVar);
        } else if (i == 2) {
            C91889m mVar2 = this.f292693j;
            if (mVar2 instanceof C105026g) {
                C41607i iVar = ((C105026g) mVar2).f292633c;
                if (iVar == null) {
                    duration = Duration.ZERO;
                } else {
                    duration = iVar.mo44176z();
                }
                j2 = duration.toMillis();
            } else {
                j2 = 0;
            }
            this.f292689f.mo94479a(cxVar, j, j2, view2, hjVar);
        } else {
            if (i != 12) {
                ((C59052c) ((C59052c) f292684c.mo56226d()).mo56372aa(22104)).mo56386p("No video");
                int i2 = C90755l.f253831a;
            }
            C9215cx cxVar2 = this.f292692i;
            if (!(cxVar2 == null || (cxVar2.f31839a & 64) == 0)) {
                String str = cxVar2.f31848j;
                if (this.f292685a.isPresent()) {
                    ((C91881e) this.f292685a.get()).mo86419g(12);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                Context context = this.f292687d;
                if (context != null) {
                    context.startActivity(intent);
                    mo94482h();
                }
            }
        }
        C91889m mVar3 = this.f292693j;
        if (mVar3 != null) {
            mVar3.mo86438d();
        }
        if (((CardRenderingContext) this.f292690g.mo6453a()).mo49321p()) {
            mo86431d();
        } else {
            this.f292688e.mo28213m("Remove video after transition is over", 400, new C105034o(this));
        }
        return true;
    }

    /* renamed from: g */
    public final void mo94481g() {
        C91889m mVar = this.f292693j;
        if (mVar != null) {
            mVar.mo86435a();
        }
    }

    /* renamed from: h */
    public final void mo94482h() {
        C91889m mVar = this.f292693j;
        if (mVar != null) {
            mVar.mo86436b();
        }
    }

    public C105035p(Context context, C22871g gVar, C105024e eVar, C58881cr crVar, C68214a aVar, C68214a aVar2, C68214a aVar3, ViewGroup viewGroup, C9215cx cxVar, C91890n nVar, Optional optional) {
        C91888l lVar;
        this.f292687d = context;
        this.f292688e = gVar;
        this.f292689f = eVar;
        this.f292690g = crVar;
        this.f292692i = cxVar;
        this.f292686b = nVar;
        this.f292691h = viewGroup;
        this.f292685a = optional;
        if ((cxVar.f31839a & 8) != 0) {
            lVar = (C91888l) aVar3.mo27525b();
        } else {
            int i = cxVar.f31840b;
            if (i == 1) {
                lVar = (C91888l) aVar.mo27525b();
            } else if (i == 2) {
                lVar = (C91888l) aVar2.mo27525b();
            } else {
                lVar = i == 12 ? (C91888l) aVar3.mo27525b() : null;
            }
        }
        if (lVar != null) {
            this.f292693j = lVar.mo86434a(viewGroup, cxVar, nVar, optional);
        }
    }
}
