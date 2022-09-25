package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import com.google.ads.interactivemedia.p367v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aof */
/* compiled from: PG */
final class aof implements C6959gl {

    /* renamed from: a */
    final /* synthetic */ aoh f21099a;

    public aof(aoh aoh) {
        this.f21099a = aoh;
    }

    /* renamed from: R */
    private final void m19125R(AdMediaInfo adMediaInfo) {
        if (adMediaInfo != null && !this.f21099a.f21107g.contains(adMediaInfo)) {
            for (VideoAdPlayer.VideoAdPlayerCallback onEnded : this.f21099a.f21106f) {
                onEnded.onEnded(adMediaInfo);
            }
            this.f21099a.f21107g.add(adMediaInfo);
        }
    }

    /* renamed from: A */
    public final void mo15075A(int i) {
        AdMediaInfo h = this.f21099a.m19180j();
        if (h != null) {
            if (i == 2) {
                for (VideoAdPlayer.VideoAdPlayerCallback onBuffering : this.f21099a.f21106f) {
                    onBuffering.onBuffering(h);
                }
            } else if (i == 3) {
                for (VideoAdPlayer.VideoAdPlayerCallback onLoaded : this.f21099a.f21106f) {
                    onLoaded.onLoaded(h);
                }
            } else if (i == 4) {
                m19125R(h);
            }
        }
    }

    /* renamed from: B */
    public final void mo15076B(int i) {
        if (i == 0) {
            if (this.f21099a.f21113m == null) {
                Log.d("IMASDK", "Position discontinuity occurred when there is no active media source.");
                return;
            }
            int m = this.f21099a.f21101a.mo15565m();
            for (int i2 = 0; i2 < m; i2++) {
                m19125R(this.f21099a.m19183m(i2));
            }
            AdMediaInfo c = this.f21099a.m19183m(m);
            if (c != null) {
                for (VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback : this.f21099a.f21106f) {
                    videoAdPlayerCallback.onLoaded(c);
                    videoAdPlayerCallback.onPlay(c);
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo15077C() {
    }

    /* renamed from: D */
    public final void mo15078D() {
    }

    /* renamed from: E */
    public final void mo15079E() {
    }

    /* renamed from: F */
    public final void mo15080F() {
    }

    /* renamed from: G */
    public final void mo15081G() {
    }

    /* renamed from: H */
    public final void mo15082H() {
    }

    /* renamed from: I */
    public final void mo15083I() {
    }

    /* renamed from: J */
    public final void mo15084J() {
    }

    /* renamed from: K */
    public final void mo15085K() {
    }

    /* renamed from: L */
    public final void mo15086L() {
    }

    /* renamed from: M */
    public final void mo15087M() {
    }

    /* renamed from: N */
    public final void mo15088N() {
    }

    /* renamed from: O */
    public final void mo15089O() {
    }

    /* renamed from: P */
    public final void mo15090P() {
    }

    /* renamed from: Q */
    public final void mo15091Q() {
    }

    /* renamed from: a */
    public final void mo15092a(C6958gk gkVar, C6826bn bnVar) {
        AdMediaInfo c = this.f21099a.m19183m(gkVar.f22192c);
        this.f21099a.f21107g.add(c);
        for (VideoAdPlayer.VideoAdPlayerCallback onError : this.f21099a.f21106f) {
            onError.onError(c);
        }
        String valueOf = String.valueOf(bnVar);
        String.valueOf(valueOf).length();
        Log.e("IMASDK", "Player Error:".concat(String.valueOf(valueOf)));
    }

    /* renamed from: b */
    public final void mo15093b() {
    }

    /* renamed from: c */
    public final void mo15094c() {
    }

    /* renamed from: d */
    public final void mo15095d() {
    }

    /* renamed from: e */
    public final void mo15096e() {
    }

    /* renamed from: f */
    public final void mo15097f() {
    }

    /* renamed from: g */
    public final void mo15098g() {
    }

    /* renamed from: h */
    public final void mo15099h() {
    }

    /* renamed from: i */
    public final void mo15100i() {
    }

    /* renamed from: j */
    public final void mo15101j() {
    }

    /* renamed from: k */
    public final void mo15102k() {
    }

    /* renamed from: l */
    public final void mo15103l() {
    }

    /* renamed from: m */
    public final void mo15104m() {
    }

    /* renamed from: n */
    public final void mo15105n() {
    }

    /* renamed from: o */
    public final void mo15106o() {
    }

    /* renamed from: p */
    public final void mo15107p() {
    }

    /* renamed from: q */
    public final void mo15108q() {
    }

    /* renamed from: r */
    public final void mo15109r() {
    }

    /* renamed from: s */
    public final void mo15110s() {
    }

    /* renamed from: t */
    public final void mo15111t() {
    }

    /* renamed from: u */
    public final void mo15112u() {
    }

    /* renamed from: v */
    public final void mo15113v() {
    }

    /* renamed from: w */
    public final void mo15114w() {
    }

    /* renamed from: x */
    public final void mo15115x() {
    }

    /* renamed from: y */
    public final void mo15116y() {
    }

    /* renamed from: z */
    public final void mo15117z() {
    }
}
