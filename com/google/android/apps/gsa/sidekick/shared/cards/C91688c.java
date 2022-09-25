package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7148ui.C90633ai;
import com.google.android.apps.gsa.sidekick.shared.overlay.NowStreamConfig;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91727k;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.sidekick.shared.p7240i.C91743a;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91901c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.c */
/* compiled from: PG */
public final class C91688c extends C91674ac {

    /* renamed from: A */
    public C91901c f255709A;

    /* renamed from: B */
    private boolean f255710B;

    /* renamed from: C */
    private boolean f255711C;

    /* renamed from: D */
    private C91728l f255712D;

    /* renamed from: E */
    private C91727k f255713E;

    /* renamed from: F */
    private boolean f255714F;

    /* renamed from: G */
    private boolean f255715G;

    /* renamed from: H */
    private boolean f255716H;

    /* renamed from: a */
    public C58833ax f255717a;

    /* renamed from: b */
    public C58881cr f255718b;

    /* renamed from: c */
    public C58881cr f255719c;

    /* renamed from: d */
    public C91643a f255720d;

    /* renamed from: e */
    public C91743a f255721e;

    /* renamed from: f */
    public C58833ax f255722f;

    /* renamed from: g */
    public C91647a f255723g;

    /* renamed from: h */
    public C58833ax f255724h;

    /* renamed from: i */
    public NowStreamConfig f255725i;

    /* renamed from: j */
    public C58833ax f255726j;

    /* renamed from: k */
    public C58833ax f255727k;

    /* renamed from: l */
    public C58833ax f255728l;

    /* renamed from: m */
    public C58833ax f255729m;

    /* renamed from: n */
    public C58833ax f255730n;

    /* renamed from: o */
    public C58833ax f255731o;

    /* renamed from: p */
    public C58833ax f255732p;

    /* renamed from: q */
    public C91713a f255733q;

    /* renamed from: r */
    public C58833ax f255734r;

    /* renamed from: s */
    public C90633ai f255735s;

    /* renamed from: t */
    public C58833ax f255736t;

    /* renamed from: u */
    public C58833ax f255737u;

    /* renamed from: v */
    public C58833ax f255738v;

    /* renamed from: w */
    public C58833ax f255739w;

    /* renamed from: x */
    public C58833ax f255740x;

    /* renamed from: y */
    public Context f255741y;

    /* renamed from: z */
    public short f255742z;

    public C91688c() {
        C58836b bVar = C58836b.f156633a;
        this.f255717a = bVar;
        this.f255722f = bVar;
        this.f255724h = bVar;
        this.f255726j = bVar;
        this.f255727k = bVar;
        this.f255728l = bVar;
        this.f255729m = bVar;
        this.f255730n = bVar;
        this.f255731o = bVar;
        this.f255732p = bVar;
        this.f255734r = bVar;
        this.f255736t = bVar;
        this.f255737u = bVar;
        this.f255738v = bVar;
        this.f255739w = bVar;
        this.f255740x = bVar;
    }

    /* renamed from: a */
    public final C91675ad mo86107a() {
        C58881cr crVar;
        C58881cr crVar2;
        C91901c cVar;
        C91643a aVar;
        C91743a aVar2;
        C91647a aVar3;
        NowStreamConfig nowStreamConfig;
        C91713a aVar4;
        C90633ai aiVar;
        C91728l lVar;
        C91727k kVar;
        Context context;
        if (this.f255742z != 511 || (crVar = this.f255718b) == null || (crVar2 = this.f255719c) == null || (cVar = this.f255709A) == null || (aVar = this.f255720d) == null || (aVar2 = this.f255721e) == null || (aVar3 = this.f255723g) == null || (nowStreamConfig = this.f255725i) == null || (aVar4 = this.f255733q) == null || (aiVar = this.f255735s) == null || (lVar = this.f255712D) == null || (kVar = this.f255713E) == null || (context = this.f255741y) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f255718b == null) {
                sb.append(" cardRenderingContext");
            }
            if (this.f255719c == null) {
                sb.append(" pietSharedStates");
            }
            if (this.f255709A == null) {
                sb.append(" viewContainer");
            }
            if (this.f255720d == null) {
                sb.append(" actionIntentUtil");
            }
            if (this.f255721e == null) {
                sb.append(" feedbackSender");
            }
            if ((this.f255742z & 1) == 0) {
                sb.append(" interestPicker");
            }
            if (this.f255723g == null) {
                sb.append(" actionLogger");
            }
            if ((this.f255742z & 2) == 0) {
                sb.append(" isOnSecondScreen");
            }
            if ((this.f255742z & 4) == 0) {
                sb.append(" monetEnabled");
            }
            if (this.f255725i == null) {
                sb.append(" nowStreamConfig");
            }
            if ((this.f255742z & 8) == 0) {
                sb.append(" isBackgroundDark");
            }
            if ((this.f255742z & 16) == 0) {
                sb.append(" singleColumnTabletLayout");
            }
            if (this.f255733q == null) {
                sb.append(" cardRefresher");
            }
            if (this.f255735s == null) {
                sb.append(" scrollViewControl");
            }
            if (this.f255712D == null) {
                sb.append(" nowRemoteClient");
            }
            if (this.f255713E == null) {
                sb.append(" nowRemoteActionHandlerClient");
            }
            if (this.f255741y == null) {
                sb.append(" context");
            }
            if ((this.f255742z & 32) == 0) {
                sb.append(" pietUseLegacyRoundedCornerImpl");
            }
            if ((this.f255742z & 64) == 0) {
                sb.append(" pietUseLogData");
            }
            if ((this.f255742z & 128) == 0) {
                sb.append(" pietUseOutlineRoundedCornerImpl");
            }
            if ((this.f255742z & 256) == 0) {
                sb.append(" enableRecyclingFixes");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C91689d(this.f255717a, crVar, crVar2, cVar, aVar, aVar2, this.f255722f, aVar3, this.f255724h, this.f255710B, nowStreamConfig, this.f255711C, this.f255726j, this.f255727k, this.f255728l, this.f255729m, this.f255730n, this.f255731o, this.f255732p, aVar4, this.f255734r, aiVar, lVar, this.f255736t, kVar, this.f255737u, this.f255738v, this.f255739w, this.f255740x, context, this.f255714F, this.f255715G, this.f255716H);
    }

    /* renamed from: b */
    public final void mo86108b(C91647a aVar) {
        if (aVar != null) {
            this.f255723g = aVar;
            return;
        }
        throw new NullPointerException("Null actionLogger");
    }

    /* renamed from: c */
    public final void mo86109c(boolean z) {
        this.f255716H = z;
        this.f255742z = (short) (this.f255742z | 256);
    }

    /* renamed from: d */
    public final void mo86110d(boolean z) {
        this.f255711C = z;
        this.f255742z = (short) (this.f255742z | 8);
    }

    /* renamed from: e */
    public final void mo86111e(boolean z) {
        this.f255710B = z;
        this.f255742z = (short) (this.f255742z | 4);
    }

    /* renamed from: f */
    public final void mo86112f(C91727k kVar) {
        if (kVar != null) {
            this.f255713E = kVar;
            return;
        }
        throw new NullPointerException("Null nowRemoteActionHandlerClient");
    }

    /* renamed from: g */
    public final void mo86113g(C91728l lVar) {
        if (lVar != null) {
            this.f255712D = lVar;
            return;
        }
        throw new NullPointerException("Null nowRemoteClient");
    }

    /* renamed from: h */
    public final void mo86114h(NowStreamConfig nowStreamConfig) {
        if (nowStreamConfig != null) {
            this.f255725i = nowStreamConfig;
            return;
        }
        throw new NullPointerException("Null nowStreamConfig");
    }

    /* renamed from: i */
    public final void mo86115i(boolean z) {
        this.f255714F = z;
        this.f255742z = (short) (this.f255742z | 64);
    }

    /* renamed from: j */
    public final void mo86116j(boolean z) {
        this.f255715G = z;
        this.f255742z = (short) (this.f255742z | 128);
    }
}
