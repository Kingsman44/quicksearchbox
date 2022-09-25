package com.google.android.apps.gsa.staticplugins.p8163o;

import android.media.audiofx.LoudnessEnhancer;
import android.os.Bundle;
import androidx.media3.common.C2585al;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.C3267o;
import androidx.media3.exoplayer.p137a.C2711b;
import androidx.media3.exoplayer.p137a.C2732c;
import androidx.media3.exoplayer.p137a.C2733d;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3032ao;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88398a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.q */
/* compiled from: PG */
final class C105845q implements C2733d {

    /* renamed from: a */
    final /* synthetic */ C105846r f295275a;

    /* renamed from: b */
    private LoudnessEnhancer f295276b;

    public C105845q(C105846r rVar) {
        this.f295275a = rVar;
    }

    /* renamed from: A */
    private final void m176258A(boolean z) {
        C105846r rVar = this.f295275a;
        C2759ad adVar = rVar.f295314j;
        if (adVar != null && rVar.f295324t != null && adVar.mo5998e() != 1) {
            if (adVar.mo6254V() < adVar.mo6014u().mo6022c()) {
                C2650bl blVar = new C2650bl();
                adVar.mo6014u().mo6024e(adVar.mo6254V(), blVar, 0);
                this.f295275a.f295318n = blVar.f7343h;
            }
            long a = this.f295275a.f295324t.mo816a("android.media.metadata.DURATION");
            long b = C105846r.m176289b(adVar);
            if (b > 0 && b != a) {
                this.f295275a.f295325u.mo1092c("android.media.metadata.DURATION", b);
                C105846r rVar2 = this.f295275a;
                rVar2.f295324t = rVar2.f295325u.mo1090a();
                C105846r rVar3 = this.f295275a;
                rVar3.f295313i.mo875g(rVar3.f295324t);
            }
            this.f295275a.mo95098q(true, z);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6425a(C2711b bVar, int i, long j, long j2) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6426b(C2711b bVar, int i, long j, long j2) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6427c(C2711b bVar, C3032ao aoVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo6428d(C2646bh bhVar, C2732c cVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo6429e(C2711b bVar, C2640bb bbVar) {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo6430f(C2711b bVar, int i) {
    }

    /* renamed from: g */
    public final void mo6431g(C2711b bVar, C2639ba baVar) {
        C59104x c = C105846r.f295277a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(baVar)).mo56372aa(14073)).mo56386p("onPlayerError");
        if (baVar instanceof C3267o) {
            this.f295275a.f295322r = (C3267o) baVar;
        } else {
            this.f295275a.f295322r = new C3267o(3, (Throwable) null, "Unexpected PlaybackException: ".concat(String.valueOf(String.valueOf(baVar))), 1001, (String) null, -1, (C2680x) null, 4, false);
        }
        this.f295275a.mo95087f();
        this.f295275a.mo95090i();
        this.f295275a.mo95098q(true, false);
        C58833ax d = this.f295275a.mo95085d();
        if (d.mo56113h()) {
            C105846r rVar = this.f295275a;
            rVar.f295312h.mo83756b(new C90452a(rVar.f295322r, ((C90455b) d.mo56107c()).mo79844b(), ((C90455b) d.mo56107c()).mo79843a())).mo83721a();
        }
    }

    /* renamed from: h */
    public final void mo6432h(C2711b bVar, boolean z, int i) {
        C2759ad adVar = this.f295275a.f295314j;
        if (adVar != null) {
            if (!adVar.mo6014u().mo6304o() && i == 4 && z) {
                this.f295275a.mo95087f();
                C105846r rVar = this.f295275a;
                C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
                aVar.copyOnWrite();
                C88458h hVar = (C88458h) aVar.instance;
                hVar.f239140c = 2;
                hVar.f239138a = 2 | hVar.f239138a;
                rVar.mo95095o((C88458h) aVar.build());
            }
            m176258A(false);
        }
    }

    /* renamed from: i */
    public final void mo6433i(C2711b bVar, C2645bg bgVar, C2645bg bgVar2, int i) {
        m176258A(true);
        if (i == 0) {
            m176259z();
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo6434j(C2711b bVar, boolean z) {
    }

    /* renamed from: k */
    public final void mo6435k(C2711b bVar, C2657bs bsVar) {
        m176258A(false);
        m176259z();
    }

    /* renamed from: l */
    public final void mo6436l() {
        LoudnessEnhancer loudnessEnhancer = this.f295276b;
        if (loudnessEnhancer != null) {
            loudnessEnhancer.release();
            this.f295276b = null;
        }
    }

    /* renamed from: m */
    public final /* synthetic */ void mo6437m(C2711b bVar) {
    }

    /* renamed from: n */
    public final /* synthetic */ void mo6438n() {
    }

    /* renamed from: o */
    public final /* synthetic */ void mo6439o(C3004h hVar) {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo6440p(C2711b bVar) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo6441q(C2658bt btVar) {
    }

    /* renamed from: r */
    public final /* synthetic */ void mo6442r(C2711b bVar) {
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6443s(C2711b bVar, C3027aj ajVar, C3032ao aoVar, IOException iOException) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6444t(C2711b bVar) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo6445u(C2711b bVar) {
    }

    /* renamed from: v */
    public final void mo6446v(C2711b bVar) {
        m176258A(false);
    }

    /* renamed from: w */
    public final /* synthetic */ void mo6447w(C2711b bVar) {
    }

    /* renamed from: x */
    public final /* synthetic */ void mo6448x(Metadata metadata) {
    }

    /* renamed from: y */
    public final /* synthetic */ void mo6449y(int i, int i2) {
    }

    /* renamed from: z */
    private final void m176259z() {
        Object obj;
        C2590aq aa;
        C2585al alVar;
        C2759ad adVar = this.f295275a.f295314j;
        if (adVar == null || (aa = adVar.mo6256aa()) == null || (alVar = aa.f7155d) == null) {
            obj = null;
        } else {
            obj = alVar.f7138h;
        }
        if (obj != null) {
            Bundle bundle = (Bundle) obj;
            if (!bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.IntroAudioChannel") || !C105846r.f295278b.contains(Integer.valueOf(bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.IntroAudioChannel")))) {
                this.f295275a.mo95103v(1);
            } else {
                this.f295275a.mo95103v(bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.IntroAudioChannel"));
            }
            C2759ad adVar2 = this.f295275a.f295314j;
            if (adVar2 != null) {
                int D = adVar2.mo6459D();
                LoudnessEnhancer loudnessEnhancer = this.f295276b;
                if (loudnessEnhancer != null) {
                    loudnessEnhancer.release();
                    this.f295276b = null;
                }
                int i = 0;
                if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.AudioTrackLoudness")) {
                    float f = bundle.getFloat("com.google.android.apps.gsa.search.core.work.audioplayer.AudioTrackLoudness");
                    if (f < 0.0f) {
                        i = (int) ((-16.0f - f) * 100.0f);
                    }
                }
                if (i != 0) {
                    try {
                        LoudnessEnhancer loudnessEnhancer2 = new LoudnessEnhancer(D);
                        this.f295276b = loudnessEnhancer2;
                        loudnessEnhancer2.setTargetGain(i);
                        this.f295276b.setEnabled(true);
                        C58976aa aaVar = C58975e.f156826a;
                    } catch (RuntimeException e) {
                        C59104x c = C105846r.f295277a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "APWDelegate");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14072)).mo56387q("Unable to set gain value: %d", i);
                        this.f295276b = null;
                    }
                }
            }
        }
    }
}
