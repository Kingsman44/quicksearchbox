package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113294bs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113375dp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.dx */
/* compiled from: PG */
final class C112825dx extends C0310l {

    /* renamed from: d */
    public C113427g f312707d;

    /* renamed from: e */
    public boolean f312708e;

    /* renamed from: f */
    final /* synthetic */ C112826dy f312709f;

    /* renamed from: g */
    public int f312710g = 1;

    /* renamed from: h */
    private final C113415ez f312711h;

    /* renamed from: i */
    private final boolean f312712i;

    /* renamed from: j */
    private final C0320v f312713j;

    /* renamed from: k */
    private final C113375dp f312714k;

    /* renamed from: l */
    private MediaMetadataCompat f312715l;

    public C112825dx(C112826dy dyVar, C113415ez ezVar, C0320v vVar, C113375dp dpVar, C113427g gVar) {
        this.f312709f = dyVar;
        C58838bb.m90868c(ezVar.mo100226z().isPresent());
        this.f312711h = ezVar;
        this.f312712i = ((C113294bs) ezVar.mo100226z().get()).mo99972c();
        this.f312713j = vVar;
        this.f312714k = dpVar;
        this.f312707d = gVar;
    }

    /* renamed from: p */
    private final void m186736p() {
        this.f312709f.f312719d.remove(this.f312711h);
        this.f312713j.mo1041i(this);
    }

    /* renamed from: d */
    public final void mo1005d(MediaMetadataCompat mediaMetadataCompat) {
        C113375dp dpVar;
        C58976aa aaVar = C58975e.f156826a;
        MediaMetadataCompat mediaMetadataCompat2 = this.f312715l;
        if (mediaMetadataCompat != null && mediaMetadataCompat.mo819d().f932a != null) {
            if (mediaMetadataCompat2 == null || !Objects.equals(mediaMetadataCompat.mo819d().f932a, mediaMetadataCompat2.mo819d().f932a)) {
                this.f312715l = mediaMetadataCompat;
                if (this.f312710g == 2) {
                    if (this.f312708e) {
                        this.f312713j.mo1037e().mo1017b();
                    } else {
                        this.f312710g = 3;
                        C58838bb.m90884s(this.f312711h.mo100226z().isPresent(), "Media suggestions should always have MediaSuggestionParams");
                        CharSequence charSequence = ((C113294bs) this.f312711h.mo100226z().get()).mo99970a().f933b;
                        CharSequence charSequence2 = this.f312713j.mo1036d() != null ? this.f312713j.mo1036d().mo819d().f933b : null;
                        if (charSequence == null) {
                            C59104x c = C112826dy.f312716a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "MediaSgstRndrer");
                            ((C59052c) ((C59052c) c).mo56372aa(27806)).mo56386p("#onSuggestionLoaded() Suggestion title should never be null!");
                        } else if (!(charSequence2 == null || charSequence.toString().contentEquals(charSequence2) || (dpVar = this.f312714k) == null)) {
                            dpVar.mo99376jD(this.f312709f.f312717b.getString(R.string.media_different_song_played_toast_text), 1);
                        }
                    }
                    this.f312707d.mo100230a(this.f312711h);
                    return;
                }
                mo99745o();
            }
        }
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f312713j.f1044a.mo869l() && this.f312710g != 2) {
            int i = playbackStateCompat.f994a;
            if (i == 1) {
                mo99745o();
            } else if (i == 2) {
                this.f312710g = 4;
            } else if (i == 3) {
                this.f312710g = 3;
            }
            this.f312707d.mo100230a(this.f312711h);
        }
    }

    /* renamed from: i */
    public final void mo1010i() {
        C58976aa aaVar = C58975e.f156826a;
        m186736p();
        this.f312707d.mo100230a(this.f312711h);
    }

    /* renamed from: k */
    public final void mo1012k() {
        C58976aa aaVar = C58975e.f156826a;
        mo1006e(this.f312713j.mo1038f());
    }

    /* renamed from: o */
    public final void mo99745o() {
        if (!this.f312712i) {
            m186736p();
        }
        this.f312707d.mo100230a(this.f312711h);
    }
}
