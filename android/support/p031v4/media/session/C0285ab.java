package android.support.p031v4.media.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p031v4.media.MediaMetadataCompat;
import androidx.media.C2417ao;
import java.util.List;

/* renamed from: android.support.v4.media.session.ab */
/* compiled from: PG */
final class C0285ab extends C0304f {

    /* renamed from: a */
    final /* synthetic */ C0286ac f1012a;

    public C0285ab(C0286ac acVar) {
        this.f1012a = acVar;
    }

    /* renamed from: A */
    public final boolean mo921A() {
        throw new AssertionError();
    }

    /* renamed from: B */
    public final void mo922B() {
        throw new AssertionError();
    }

    /* renamed from: C */
    public final void mo923C() {
        throw new AssertionError();
    }

    /* renamed from: D */
    public final void mo924D() {
        throw new AssertionError();
    }

    /* renamed from: E */
    public final void mo925E() {
        throw new AssertionError();
    }

    /* renamed from: F */
    public final void mo926F() {
        throw new AssertionError();
    }

    /* renamed from: G */
    public final void mo927G() {
        throw new AssertionError();
    }

    /* renamed from: H */
    public final void mo928H() {
        throw new AssertionError();
    }

    /* renamed from: I */
    public final void mo929I() {
        throw new AssertionError();
    }

    /* renamed from: J */
    public final void mo930J() {
        throw new AssertionError();
    }

    /* renamed from: K */
    public final void mo931K() {
        throw new AssertionError();
    }

    /* renamed from: L */
    public final void mo932L() {
        throw new AssertionError();
    }

    /* renamed from: M */
    public final void mo933M() {
        throw new AssertionError();
    }

    /* renamed from: N */
    public final void mo934N() {
        throw new AssertionError();
    }

    /* renamed from: O */
    public final void mo935O() {
        throw new AssertionError();
    }

    /* renamed from: P */
    public final void mo936P() {
        throw new AssertionError();
    }

    /* renamed from: Q */
    public final void mo937Q() {
        throw new AssertionError();
    }

    /* renamed from: R */
    public final boolean mo938R() {
        throw new AssertionError();
    }

    /* renamed from: S */
    public final void mo939S() {
        throw new AssertionError();
    }

    /* renamed from: T */
    public final void mo940T() {
        throw new AssertionError();
    }

    /* renamed from: U */
    public final void mo941U() {
        throw new AssertionError();
    }

    /* renamed from: V */
    public final void mo942V() {
        throw new AssertionError();
    }

    /* renamed from: W */
    public final void mo943W() {
        throw new AssertionError();
    }

    /* renamed from: X */
    public final void mo944X() {
        throw new AssertionError();
    }

    /* renamed from: a */
    public final int mo945a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo946b() {
        return this.f1012a.f1021i;
    }

    /* renamed from: c */
    public final int mo947c() {
        return this.f1012a.f1022j;
    }

    /* renamed from: d */
    public final long mo948d() {
        throw new AssertionError();
    }

    /* renamed from: e */
    public final PendingIntent mo949e() {
        throw new AssertionError();
    }

    /* renamed from: f */
    public final Bundle mo950f() {
        throw new AssertionError();
    }

    /* renamed from: g */
    public final Bundle mo951g() {
        return null;
    }

    /* renamed from: h */
    public final MediaMetadataCompat mo952h() {
        throw new AssertionError();
    }

    /* renamed from: i */
    public final ParcelableVolumeInfo mo953i() {
        throw new AssertionError();
    }

    /* renamed from: j */
    public final PlaybackStateCompat mo954j() {
        C0286ac acVar = this.f1012a;
        PlaybackStateCompat playbackStateCompat = acVar.f1018f;
        MediaMetadataCompat mediaMetadataCompat = acVar.f1020h;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.f995b == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.f994a;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        long j2 = playbackStateCompat.f1001h;
        if (j2 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = ((long) (playbackStateCompat.f997d * ((float) (elapsedRealtime - j2)))) + playbackStateCompat.f995b;
        if (mediaMetadataCompat != null && mediaMetadataCompat.f945b.containsKey("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.mo816a("android.media.metadata.DURATION");
        }
        long j4 = (j < 0 || j3 <= j) ? j3 < 0 ? 0 : j3 : j;
        C0298ao aoVar = new C0298ao(playbackStateCompat);
        aoVar.mo984c(playbackStateCompat.f994a, j4, playbackStateCompat.f997d, elapsedRealtime);
        return aoVar.mo982a();
    }

    /* renamed from: k */
    public final CharSequence mo955k() {
        throw new AssertionError();
    }

    /* renamed from: l */
    public final String mo956l() {
        throw new AssertionError();
    }

    /* renamed from: m */
    public final String mo957m() {
        throw new AssertionError();
    }

    /* renamed from: n */
    public final List mo958n() {
        return null;
    }

    /* renamed from: o */
    public final void mo959o() {
        throw new AssertionError();
    }

    /* renamed from: p */
    public final void mo960p() {
        throw new AssertionError();
    }

    /* renamed from: q */
    public final void mo961q() {
        throw new AssertionError();
    }

    /* renamed from: r */
    public final void mo962r() {
        throw new AssertionError();
    }

    /* renamed from: s */
    public final void mo963s() {
        throw new AssertionError();
    }

    /* renamed from: t */
    public final void mo964t() {
        throw new AssertionError();
    }

    /* renamed from: u */
    public final void mo965u(C0302d dVar) {
        if (!this.f1012a.f1016d) {
            this.f1012a.f1017e.register(dVar, new C2417ao("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (this.f1012a.f1015c) {
            }
        }
    }

    /* renamed from: v */
    public final void mo966v() {
        throw new AssertionError();
    }

    /* renamed from: w */
    public final void mo967w() {
        throw new AssertionError();
    }

    /* renamed from: x */
    public final void mo968x(C0302d dVar) {
        this.f1012a.f1017e.unregister(dVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (this.f1012a.f1015c) {
        }
    }

    /* renamed from: y */
    public final boolean mo969y() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo970z() {
        return false;
    }
}
