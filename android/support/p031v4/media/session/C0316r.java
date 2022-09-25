package android.support.p031v4.media.session;

import android.media.Rating;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.RatingCompat;

/* renamed from: android.support.v4.media.session.r */
/* compiled from: PG */
class C0316r extends C0315q {

    /* renamed from: a */
    protected final MediaController.TransportControls f1043a;

    public C0316r(MediaController.TransportControls transportControls) {
        this.f1043a = transportControls;
    }

    /* renamed from: a */
    public final void mo1016a() {
        this.f1043a.fastForward();
    }

    /* renamed from: b */
    public final void mo1017b() {
        this.f1043a.pause();
    }

    /* renamed from: c */
    public final void mo1018c() {
        this.f1043a.play();
    }

    /* renamed from: d */
    public final void mo1019d(String str, Bundle bundle) {
        this.f1043a.playFromMediaId(str, bundle);
    }

    /* renamed from: e */
    public final void mo1020e(String str, Bundle bundle) {
        this.f1043a.playFromSearch(str, bundle);
    }

    /* renamed from: f */
    public void mo1021f(Uri uri, Bundle bundle) {
        if (uri == null || Uri.EMPTY.equals(uri)) {
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        mo1025j("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
    }

    /* renamed from: g */
    public void mo1022g(Uri uri, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        mo1025j("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
    }

    /* renamed from: h */
    public final void mo1023h() {
        this.f1043a.rewind();
    }

    /* renamed from: i */
    public final void mo1024i(long j) {
        this.f1043a.seekTo(j);
    }

    /* renamed from: k */
    public final void mo1026k(RatingCompat ratingCompat) {
        this.f1043a.setRating((Rating) (ratingCompat != null ? ratingCompat.mo826h() : null));
    }

    /* renamed from: l */
    public final void mo1027l(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
        mo1025j("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    /* renamed from: m */
    public final void mo1028m(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i);
        mo1025j("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    /* renamed from: n */
    public final void mo1029n() {
        this.f1043a.skipToNext();
    }

    /* renamed from: o */
    public final void mo1030o() {
        this.f1043a.skipToPrevious();
    }

    /* renamed from: p */
    public final void mo1031p() {
        this.f1043a.stop();
    }

    /* renamed from: q */
    public final void mo1032q() {
        this.f1043a.skipToQueueItem(0);
    }

    /* renamed from: j */
    public final void mo1025j(String str, Bundle bundle) {
        char c;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1348483723) {
                if (hashCode == 503011406 && str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
                    c = 1;
                    if ((c == 0 || c == 1) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE"))) {
                        throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
                    }
                }
            } else if (str.equals("android.support.v4.media.session.action.FOLLOW")) {
                c = 0;
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
            c = 65535;
            throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
        }
        this.f1043a.sendCustomAction(str, bundle);
    }
}
