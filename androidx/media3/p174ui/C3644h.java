package androidx.media3.p174ui;

import android.view.View;
import android.widget.TextView;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2643be;
import androidx.media3.common.C2644bf;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2672p;
import androidx.media3.common.C2682z;
import androidx.media3.common.Metadata;
import androidx.media3.common.p135a.C2568d;
import androidx.media3.common.p136b.C2612ak;
import java.util.List;

/* renamed from: androidx.media3.ui.h */
/* compiled from: PG */
final class C3644h implements View.OnClickListener, C2644bf, C3659w {

    /* renamed from: a */
    final /* synthetic */ LegacyPlayerControlView f11708a;

    public C3644h(LegacyPlayerControlView legacyPlayerControlView) {
        this.f11708a = legacyPlayerControlView;
    }

    /* renamed from: A */
    public final /* synthetic */ void mo6220A(boolean z) {
    }

    /* renamed from: B */
    public final /* synthetic */ void mo6221B(int i, int i2) {
    }

    /* renamed from: C */
    public final /* synthetic */ void mo6222C(C2651bm bmVar, int i) {
    }

    /* renamed from: D */
    public final /* synthetic */ void mo6223D(C2657bs bsVar) {
    }

    /* renamed from: E */
    public final /* synthetic */ void mo6224E(C2658bt btVar) {
    }

    /* renamed from: F */
    public final /* synthetic */ void mo6225F(float f) {
    }

    /* renamed from: G */
    public final void mo7684G(long j) {
        LegacyPlayerControlView legacyPlayerControlView = this.f11708a;
        TextView textView = legacyPlayerControlView.f11657j;
        if (textView != null) {
            textView.setText(C2612ak.m6935R(legacyPlayerControlView.f11658k, legacyPlayerControlView.f11659l, j));
        }
    }

    /* renamed from: H */
    public final void mo7685H(long j) {
        LegacyPlayerControlView legacyPlayerControlView = this.f11708a;
        legacyPlayerControlView.f11661n = true;
        TextView textView = legacyPlayerControlView.f11657j;
        if (textView != null) {
            textView.setText(C2612ak.m6935R(legacyPlayerControlView.f11658k, legacyPlayerControlView.f11659l, j));
        }
    }

    /* renamed from: I */
    public final void mo7686I(long j, boolean z) {
        C2646bh bhVar;
        LegacyPlayerControlView legacyPlayerControlView = this.f11708a;
        legacyPlayerControlView.f11661n = false;
        if (!z && (bhVar = legacyPlayerControlView.f11660m) != null) {
            bhVar.mo6014u();
            bhVar.mo5996c();
            ((C2682z) bhVar).mo6263ah(j);
            legacyPlayerControlView.mo7671g();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6226a(C2664h hVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6227b(C2642bd bdVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6228c(C2568d dVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6229d(List list) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6230e(C2672p pVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6231f(int i, boolean z) {
    }

    /* renamed from: g */
    public final void mo6232g(C2646bh bhVar, C2643be beVar) {
        if (beVar.f7318a.mo6353b(4, 5)) {
            this.f11708a.mo7670f();
        }
        if (beVar.f7318a.mo6353b(4, 5, 7)) {
            this.f11708a.mo7671g();
        }
        if (beVar.f7318a.f7443a.get(8)) {
            this.f11708a.mo7672h();
        }
        if (beVar.f7318a.f7443a.get(9)) {
            this.f11708a.mo7673i();
        }
        if (beVar.f7318a.mo6353b(8, 9, 11, 0, 13)) {
            this.f11708a.mo7669e();
        }
        if (beVar.f7318a.mo6353b(11, 0)) {
            this.f11708a.mo7674j();
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo6233h(boolean z) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo6234i(boolean z) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo6235j(boolean z) {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo6236k(C2590aq aqVar, int i) {
    }

    /* renamed from: l */
    public final /* synthetic */ void mo6237l(C2593at atVar) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo6238m(Metadata metadata) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo6239n(boolean z, int i) {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo6240o(C2640bb bbVar) {
    }

    public final void onClick(View view) {
        int i;
        LegacyPlayerControlView legacyPlayerControlView = this.f11708a;
        C2646bh bhVar = legacyPlayerControlView.f11660m;
        if (bhVar != null) {
            if (legacyPlayerControlView.f11650c == view) {
                bhVar.mo6265aj();
            } else if (legacyPlayerControlView.f11649b == view) {
                bhVar.mo6267al();
            } else if (legacyPlayerControlView.f11653f == view) {
                if (bhVar.mo5998e() != 4) {
                    bhVar.mo6262ag();
                }
            } else if (legacyPlayerControlView.f11654g == view) {
                bhVar.mo6261af();
            } else if (legacyPlayerControlView.f11651d == view) {
                LegacyPlayerControlView.m10504l(bhVar);
            } else if (legacyPlayerControlView.f11652e == view) {
                ((C2682z) bhVar).mo5974B(false);
            } else if (legacyPlayerControlView.f11655h == view) {
                int g = bhVar.mo6000g();
                int i2 = this.f11708a.f11662o;
                int i3 = 1;
                while (true) {
                    if (i3 > 2) {
                        break;
                    }
                    i = (g + i3) % 3;
                    if (i == 0) {
                        break;
                    }
                    if (i != 1) {
                        if (i == 2 && (i2 & 2) != 0) {
                            break;
                        }
                    } else if ((i2 & 1) != 0) {
                        break;
                    }
                    i3++;
                }
                g = i;
                bhVar.mo5977E(g);
            } else if (legacyPlayerControlView.f11656i == view) {
                bhVar.mo5978F(!bhVar.mo5988P());
            }
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void mo6241p(int i) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo6242q(int i) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo6243r(C2639ba baVar) {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6244s(C2639ba baVar) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6245t(boolean z, int i) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6246u(int i) {
    }

    /* renamed from: v */
    public final /* synthetic */ void mo6247v(C2645bg bgVar, C2645bg bgVar2, int i) {
    }

    /* renamed from: w */
    public final /* synthetic */ void mo6248w() {
    }

    /* renamed from: x */
    public final /* synthetic */ void mo6249x(int i) {
    }

    /* renamed from: y */
    public final /* synthetic */ void mo6250y() {
    }

    /* renamed from: z */
    public final /* synthetic */ void mo6251z(boolean z) {
    }
}
