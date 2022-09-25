package com.google.android.apps.gsa.speech.audio.p7268e;

import android.os.Vibrator;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.p8031m.C102688f;
import com.google.android.apps.gsa.staticplugins.p8031m.C102689g;
import com.google.android.apps.gsa.staticplugins.p8031m.C102690h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60761r;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.speech.audio.e.i */
/* compiled from: PG */
public final class C92194i {

    /* renamed from: a */
    public static final C59071e f257030a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.e.i");

    /* renamed from: b */
    public final C118843f f257031b;

    /* renamed from: c */
    public final C22871g f257032c;

    /* renamed from: d */
    public final ReentrantReadWriteLock f257033d = new ReentrantReadWriteLock();

    /* renamed from: e */
    public final List f257034e;

    /* renamed from: f */
    public final C92186a f257035f;

    /* renamed from: g */
    public final C90021c f257036g;

    /* renamed from: h */
    public final Vibrator f257037h;

    /* renamed from: i */
    private final C22871g f257038i;

    /* renamed from: j */
    private final C90743b f257039j;

    /* renamed from: k */
    private final AtomicInteger f257040k = new AtomicInteger();

    static {
        new AtomicInteger();
    }

    public C92194i(C92186a aVar, C118843f fVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C90021c cVar, Vibrator vibrator, C90743b bVar) {
        gVar.mo28201a("Get native sample rate", C92190e.f257023a);
        this.f257031b = fVar;
        this.f257032c = gVar2;
        this.f257038i = gVar3;
        this.f257034e = new ArrayList();
        this.f257035f = aVar;
        this.f257036g = cVar;
        this.f257037h = vibrator;
        this.f257039j = bVar;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, com.google.common.util.concurrent.cx] */
    /* renamed from: a */
    public final C60870cx mo86845a(int i, String str, boolean z, long j) {
        C92188c cVar = new C92188c(this, this.f257038i.mo28201a("AudioTrackSoundManager load audio track", new C92187b(this, i)), str, z);
        if (j <= 0) {
            return cVar.mo86844a();
        }
        C22871g gVar = this.f257038i;
        Objects.requireNonNull(cVar);
        return gVar.mo28203c("AudioTrackSoundManager wait to play", j, new C92189d(cVar));
    }

    /* renamed from: b */
    public final C60870cx mo86846b() {
        return this.f257032c.mo28201a("AudioTrackSoundManager vibrate", new C92192g(this));
    }

    /* renamed from: c */
    public final void mo86847c(boolean z) {
        mo86852h(R.raw.failure, "<beep>Failure</beep>", false, z);
    }

    /* renamed from: d */
    public final void mo86848d() {
        mo86852h(R.raw.failure_projected, "<beep>Failure</beep>", false, false);
    }

    /* renamed from: e */
    public final void mo86849e(boolean z) {
        mo86852h(R.raw.no_input, "<beep>No-Input</beep>", false, z);
    }

    /* renamed from: f */
    public final void mo86850f(boolean z) {
        mo86852h(R.raw.success, "<beep>Success</beep>", false, z);
    }

    /* renamed from: g */
    public final void mo86851g() {
        mo86852h(R.raw.success_projected, "<beep>Success</beep>", false, false);
    }

    /* renamed from: h */
    public final void mo86852h(int i, String str, boolean z, boolean z2) {
        C58485gu guVar;
        if (!z2 || this.f257031b.mo71759t() || this.f257031b.mo71742c() == 2 || this.f257039j.f253818a.isEnabled()) {
            mo86845a(i, str, z, 0);
        } else if (this.f257037h.hasVibrator()) {
            if (i == R.raw.success) {
                guVar = this.f257036g.mo79750p(C90082eg.f249945bH);
            } else if (i == R.raw.no_input) {
                guVar = this.f257036g.mo79750p(C90082eg.f249947bJ);
            } else {
                guVar = i == R.raw.failure ? this.f257036g.mo79750p(C90082eg.f249944bG) : null;
            }
            if (guVar != null && guVar.size() > 1) {
                this.f257037h.vibrate(C60761r.m92761g(guVar), -1);
            }
        }
    }

    /* renamed from: i */
    public final void mo86853i() {
        mo86852h(R.raw.open_projected, "<beep>Open</beep>", true, false);
    }

    /* renamed from: j */
    public final void mo86854j(int i) {
        int andAdd = this.f257040k.getAndAdd(i);
        int i2 = i + andAdd;
        boolean z = false;
        boolean z2 = andAdd > 0;
        if (i2 > 0) {
            z = true;
        }
        if (z != z2) {
            this.f257033d.readLock().lock();
            try {
                for (C102690h hVar : this.f257034e) {
                    if (i2 > 0) {
                        hVar.f286620a.f286622b.mo80432f();
                        hVar.f286620a.f286624f.mo28212l("audio tracks pending", new C102689g(hVar));
                    } else {
                        hVar.f286620a.f286624f.mo28212l("audio tracks finished", new C102688f(hVar));
                    }
                }
            } finally {
                this.f257033d.readLock().unlock();
            }
        }
    }
}
