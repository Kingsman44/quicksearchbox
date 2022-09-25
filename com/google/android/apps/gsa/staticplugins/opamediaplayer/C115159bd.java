package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.os.Bundle;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4535g.C59203do;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.bd */
/* compiled from: PG */
final class C115159bd implements C84275o {

    /* renamed from: a */
    private final C58833ax f319605a;

    /* renamed from: b */
    private final C58833ax f319606b;

    public C115159bd(C115493i iVar) {
        C58833ax a = iVar.mo102055a();
        if (!iVar.f320352c.mo56113h()) {
            iVar.f320352c = C58833ax.m90833j(iVar.f320350a.mo1036d());
        }
        C58833ax axVar = iVar.f320352c;
        this.f319605a = a;
        this.f319606b = axVar;
    }

    /* renamed from: x */
    private final boolean m190883x() {
        C58833ax l = mo77806l();
        if (!l.mo56113h()) {
            return false;
        }
        return C115485b.m191568b((String) l.mo56107c()).mo56113h();
    }

    /* renamed from: y */
    private static boolean m190884y(PlaybackStateCompat playbackStateCompat, String str) {
        List list = playbackStateCompat.f1002i;
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(((PlaybackStateCompat.CustomAction) list.get(i)).f1006a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final double mo77795a() {
        if (m190883x() && this.f319605a.mo56113h() && this.f319606b.mo56113h()) {
            long d = mo77798d();
            long j = ((PlaybackStateCompat) this.f319605a.mo56107c()).f996c;
            if (!(d == 0 || j == 0 || j > d)) {
                double d2 = (double) j;
                Double.isNaN(d2);
                double d3 = (double) d;
                Double.isNaN(d3);
                return (d2 * 100.0d) / d3;
            }
        }
        return C59203do.f157270a;
    }

    /* renamed from: b */
    public final int mo77796b() {
        if (m190883x() && this.f319606b.mo56113h()) {
            return (int) ((MediaMetadataCompat) this.f319606b.mo56107c()).mo816a("android.media.metadata.TRACK_NUMBER");
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo77797c() {
        if (this.f319605a.mo56113h()) {
            return ((PlaybackStateCompat) this.f319605a.mo56107c()).f994a;
        }
        return 0;
    }

    /* renamed from: d */
    public final long mo77798d() {
        if (m190883x() && this.f319606b.mo56113h()) {
            return ((MediaMetadataCompat) this.f319606b.mo56107c()).mo816a("android.media.metadata.DURATION");
        }
        return 0;
    }

    /* renamed from: e */
    public final long mo77799e() {
        if (m190883x() && this.f319605a.mo56113h()) {
            return ((PlaybackStateCompat) this.f319605a.mo56107c()).f1001h;
        }
        return 0;
    }

    /* renamed from: f */
    public final long mo77800f() {
        if (!m190883x() || !this.f319606b.mo56113h()) {
            return 0;
        }
        return ((MediaMetadataCompat) this.f319606b.mo56107c()).mo816a("assistant.api.params.MediaParams.MediaSession.SessionId");
    }

    /* renamed from: g */
    public final long mo77801g() {
        if (m190883x() && this.f319605a.mo56113h()) {
            return ((PlaybackStateCompat) this.f319605a.mo56107c()).f995b;
        }
        return 0;
    }

    /* renamed from: h */
    public final long mo77802h() {
        Bundle bundle;
        if (m190883x() && this.f319605a.mo56113h() && (bundle = ((PlaybackStateCompat) this.f319605a.mo56107c()).f1004k) != null && bundle.containsKey("PlaybackState.POSITION_FROM_WINDOW_START")) {
            return bundle.getLong("PlaybackState.POSITION_FROM_WINDOW_START");
        }
        return 0;
    }

    /* renamed from: i */
    public final C58833ax mo77803i() {
        if (!mo77810p()) {
            return C58836b.f156633a;
        }
        return this.f319605a.mo56106b(C115158bc.f319604a);
    }

    /* renamed from: j */
    public final C58833ax mo77804j() {
        if (!m190883x()) {
            return C58836b.f156633a;
        }
        if (!this.f319605a.mo56113h()) {
            return C58836b.f156633a;
        }
        Bundle bundle = ((PlaybackStateCompat) this.f319605a.mo56107c()).f1004k;
        if (bundle == null) {
            return C58836b.f156633a;
        }
        int i = bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.ExoPlaybackErrorCode");
        if (i == 0) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Integer.valueOf(i));
    }

    /* renamed from: k */
    public final C58833ax mo77805k() {
        if (!m190883x()) {
            return C58836b.f156633a;
        }
        if (!this.f319605a.mo56113h()) {
            return C58836b.f156633a;
        }
        Bundle bundle = ((PlaybackStateCompat) this.f319605a.mo56107c()).f1004k;
        if (bundle == null) {
            return C58836b.f156633a;
        }
        int i = bundle.getInt("PlaybackState.ERROR_CAUSE");
        if (i == 0) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Integer.valueOf(i));
    }

    /* renamed from: l */
    public final C58833ax mo77806l() {
        return this.f319606b.mo56113h() ? C58833ax.m90833j(((MediaMetadataCompat) this.f319606b.mo56107c()).mo821f("android.media.metadata.MEDIA_ID")) : C58836b.f156633a;
    }

    /* renamed from: m */
    public final C58833ax mo77807m() {
        if (!m190883x()) {
            return C58836b.f156633a;
        }
        if (!this.f319605a.mo56113h()) {
            return C58836b.f156633a;
        }
        Bundle bundle = ((PlaybackStateCompat) this.f319605a.mo56107c()).f1004k;
        if (bundle == null || !bundle.containsKey("PlaybackState.WINDOW_CHANGED")) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(Integer.valueOf(bundle.getInt("PlaybackState.WINDOW_CHANGED")));
    }

    /* renamed from: n */
    public final C58833ax mo77808n() {
        if (!m190883x()) {
            return C58836b.f156633a;
        }
        if (!this.f319605a.mo56113h()) {
            return C58836b.f156633a;
        }
        float f = ((PlaybackStateCompat) this.f319605a.mo56107c()).f997d;
        return f > 0.0f ? C58833ax.m90834k(Float.valueOf(f)) : C58836b.f156633a;
    }

    /* renamed from: o */
    public final C58833ax mo77809o() {
        throw null;
    }

    /* renamed from: p */
    public final boolean mo77810p() {
        if (m190883x() && this.f319605a.mo56113h() && ((PlaybackStateCompat) this.f319605a.mo56107c()).f994a == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo77811q() {
        Bundle bundle;
        if (m190883x() && this.f319605a.mo56113h() && (bundle = ((PlaybackStateCompat) this.f319605a.mo56107c()).f1004k) != null && bundle.getByte("PlaybackState.ENDED") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean mo77812r() {
        if (m190883x() && this.f319605a.mo56113h() && ((PlaybackStateCompat) this.f319605a.mo56107c()).f994a == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo77813s() {
        int i;
        if (!m190883x() || !this.f319605a.mo56113h() || (i = ((PlaybackStateCompat) this.f319605a.mo56107c()).f994a) == 2 || i == 1 || i == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo77814t() {
        if (m190883x() && this.f319605a.mo56113h() && ((PlaybackStateCompat) this.f319605a.mo56107c()).f994a == 3) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C58833ax axVar;
        StringBuilder sb = new StringBuilder("CurrentMediaItemIndex: ");
        sb.append(mo77796b());
        sb.append(", IsBuffering: ");
        sb.append(mo77812r());
        sb.append(", IsPaused: ");
        sb.append(mo77813s());
        sb.append(", IsPlaying: ");
        sb.append(mo77814t());
        sb.append(", HasReachedEnd: ");
        sb.append(mo77811q());
        sb.append(", HasError: ");
        sb.append(mo77810p());
        sb.append(", DurationMillis: ");
        sb.append(mo77798d());
        sb.append(", MillisPlayed: ");
        sb.append(mo77801g());
        sb.append(", BufferedPercentage: ");
        sb.append(mo77795a());
        sb.append(", SupportsSeek: ");
        sb.append(mo77815u());
        sb.append(", SupportsSkipNext: ");
        sb.append(mo77816v());
        sb.append(", SupportsSkipPrevious: ");
        sb.append(mo77817w());
        sb.append(", MediaId: ");
        sb.append((String) mo77806l().mo56111f());
        sb.append(", Title: ");
        if (!m190883x()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = this.f319606b.mo56113h() ? C58833ax.m90833j(((MediaMetadataCompat) this.f319606b.mo56107c()).mo821f("android.media.metadata.TITLE")) : C58836b.f156633a;
        }
        sb.append((String) axVar.mo56111f());
        sb.append(", LastPositionUpdateTime: ");
        sb.append(mo77799e());
        sb.append(", PlaybackSpeed: ");
        sb.append(mo77808n().mo56109e(Float.valueOf(0.0f)));
        sb.append(", State: ");
        sb.append(mo77797c());
        sb.append(", MediaSessionId: ");
        sb.append(mo77800f());
        sb.append(", NewWindowIndex: ");
        sb.append(mo77807m());
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo77815u() {
        if (!m190883x() || !this.f319605a.mo56113h()) {
            return false;
        }
        long j = ((PlaybackStateCompat) this.f319605a.mo56107c()).f998e;
        if (j == 0 || (j & 256) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo77816v() {
        if (m190883x() && this.f319605a.mo56113h()) {
            return m190884y((PlaybackStateCompat) this.f319605a.mo56107c(), "com.google.android.apps.gsa.search.core.work.audioplayer.SkipNext");
        }
        return false;
    }

    /* renamed from: w */
    public final boolean mo77817w() {
        if (m190883x() && this.f319605a.mo56113h()) {
            return m190884y((PlaybackStateCompat) this.f319605a.mo56107c(), "com.google.android.apps.gsa.search.core.work.audioplayer.SkipPrevious");
        }
        return false;
    }
}
