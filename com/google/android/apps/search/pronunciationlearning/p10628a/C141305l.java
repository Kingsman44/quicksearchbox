package com.google.android.apps.search.pronunciationlearning.p10628a;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.audiofx.LoudnessEnhancer;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.C37345aj;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37482d;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.C37761d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.pronunciationlearning.a.l */
/* compiled from: PG */
public final class C141305l {

    /* renamed from: a */
    public static final C37346ak f383614a;

    /* renamed from: b */
    public final Executor f383615b;

    /* renamed from: c */
    public final C141306m f383616c;

    /* renamed from: d */
    public final Map f383617d = new HashMap();

    /* renamed from: e */
    public int f383618e = 0;

    /* renamed from: f */
    public C37325aa f383619f;

    /* renamed from: g */
    public final MediaPlayer f383620g;

    /* renamed from: h */
    public final C37482d f383621h;

    /* renamed from: i */
    private final C60870cx f383622i;

    static {
        C37345aj ajVar = (C37345aj) C37346ak.f99197g.createBuilder();
        ajVar.copyOnWrite();
        C37346ak akVar = (C37346ak) ajVar.instance;
        akVar.f99199a |= 1;
        akVar.f99200b = 4;
        ajVar.copyOnWrite();
        C37346ak akVar2 = (C37346ak) ajVar.instance;
        akVar2.f99199a |= 2;
        akVar2.f99201c = 5;
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37761d dVar = C37761d.f100194a;
        aVar.copyOnWrite();
        C37773c cVar = (C37773c) aVar.instance;
        dVar.getClass();
        cVar.f100246b = dVar;
        cVar.f100245a = 16;
        ajVar.copyOnWrite();
        C37346ak akVar3 = (C37346ak) ajVar.instance;
        C37773c cVar2 = (C37773c) aVar.build();
        cVar2.getClass();
        akVar3.f99203e = cVar2;
        akVar3.f99199a |= 8;
        f383614a = (C37346ak) ajVar.build();
    }

    public C141305l(C37482d dVar, C60887da daVar, C60887da daVar2, C141306m mVar) {
        this.f383621h = dVar;
        this.f383615b = new C60904dr(daVar);
        this.f383616c = mVar;
        this.f383620g = new MediaPlayer();
        this.f383622i = C60856cj.m92905n(C47810es.m84965e(new C141302i(this)), daVar2);
    }

    /* renamed from: a */
    public final C60870cx mo116332a(int i) {
        C141298e eVar = new C141298e(this, i);
        return C60856cj.m92903l(C47810es.m84977q(eVar), this.f383615b);
    }

    /* renamed from: b */
    public final C60870cx mo116333b(C60870cx cxVar, int i, int i2) {
        int i3 = this.f383618e;
        this.f383618e = i3 + 1;
        C60870cx a = mo116332a(i3);
        C141295b bVar = new C141295b(this);
        C47633f i4 = C47633f.m84733g(C60922j.m93045h(a, C47810es.m84966f(bVar), this.f383615b)).mo51516i(C141300g.f383606a, this.f383615b).mo51516i(new C141301h(this, cxVar, i, i2), this.f383615b);
        C141303j jVar = new C141303j(this);
        C60856cj.m92911t(i4, C47810es.m84974n(jVar), this.f383615b);
        this.f383617d.put(Integer.valueOf(this.f383618e), i4);
        return i4;
    }

    /* renamed from: c */
    public final C60870cx mo116334c(byte[] bArr) {
        int length = bArr.length;
        C141307n nVar = (C141307n) this.f383616c;
        nVar.f383625c = new AudioTrack(C141307n.f383623a, C141307n.f383624b, length, 0, 0);
        nVar.f383625c.write(bArr, 0, length);
        nVar.f383625c.setNotificationMarkerPosition(length >> 1);
        LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(nVar.f383625c.getAudioSessionId());
        loudnessEnhancer.setTargetGain(SimpleSnackbar.LENGTH_SHORT);
        loudnessEnhancer.setEnabled(true);
        C60870cx a = C2169h.m6027a(new C141296c(this));
        AudioTrack audioTrack = ((C141307n) this.f383616c).f383625c;
        if (audioTrack != null) {
            audioTrack.play();
        }
        return a;
    }

    /* renamed from: d */
    public final void mo116335d() {
        C60870cx cxVar = this.f383622i;
        MediaPlayer mediaPlayer = this.f383620g;
        Objects.requireNonNull(mediaPlayer);
        cxVar.mo4106b(new C141299f(mediaPlayer), this.f383615b);
    }
}
