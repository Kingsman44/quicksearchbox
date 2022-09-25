package android.support.p031v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p031v4.media.C0331z;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.RatingCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C1826m;
import androidx.versionedparcelable.C4267f;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: android.support.v4.media.session.y */
/* compiled from: PG */
final class C0323y extends MediaSession.Callback {

    /* renamed from: a */
    final /* synthetic */ C0324z f1048a;

    public C0323y(C0324z zVar) {
        this.f1048a = zVar;
    }

    /* renamed from: a */
    private final C0286ac m975a() {
        C0286ac acVar;
        synchronized (this.f1048a.f1049a) {
            acVar = (C0286ac) this.f1048a.f1051c.get();
        }
        if (acVar == null || this.f1048a != acVar.mo917a()) {
            return null;
        }
        return acVar;
    }

    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        int i;
        IBinder iBinder;
        C0286ac a = m975a();
        if (a != null) {
            MediaSessionCompat.m652b(bundle);
            try {
                if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                    Bundle bundle2 = new Bundle();
                    MediaSessionCompat.Token token = a.f1014b;
                    C0306h extraBinder = token.getExtraBinder();
                    if (extraBinder == null) {
                        iBinder = null;
                    } else {
                        iBinder = extraBinder.asBinder();
                    }
                    C1826m.m5005b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinder);
                    C4267f session2Token = token.getSession2Token();
                    if (session2Token == null) {
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", (Parcelable) null);
                    } else {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(session2Token));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    this.f1048a.mo1085kp(str);
                } else if (a.f1019g != null && (i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1)) >= 0 && i < a.f1019g.size()) {
                    MediaSessionCompat.QueueItem queueItem = (MediaSessionCompat.QueueItem) a.f1019g.get(i);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
            }
            a.mo919c();
        }
    }

    public final void onCustomAction(String str, Bundle bundle) {
        C0286ac a = m975a();
        if (a != null) {
            MediaSessionCompat.m652b(bundle);
            try {
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    MediaSessionCompat.m652b(bundle2);
                    this.f1048a.mo1070ka((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    this.f1048a.mo1071kb();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    MediaSessionCompat.m652b(bundle3);
                    this.f1048a.mo1072kc(string, bundle3);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    MediaSessionCompat.m652b(bundle4);
                    this.f1048a.mo1073kd(string2, bundle4);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    MediaSessionCompat.m652b(bundle5);
                    this.f1048a.mo1074ke((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    this.f1048a.mo1078ki(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    this.f1048a.mo1079kj(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    MediaSessionCompat.m652b(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    this.f1048a.mo1077kh(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                } else {
                    this.f1048a.mo1064jU(str, bundle);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
            }
            a.mo919c();
        }
    }

    public final void onFastForward() {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1065jV();
            a.mo919c();
        }
    }

    public final boolean onMediaButtonEvent(Intent intent) {
        C0286ac a = m975a();
        if (a == null) {
            return false;
        }
        boolean ko = this.f1048a.mo1084ko(intent);
        a.mo919c();
        if (ko || super.onMediaButtonEvent(intent)) {
            return true;
        }
        return false;
    }

    public final void onPause() {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1066jW();
            a.mo919c();
        }
    }

    public final void onPlay() {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1067jX();
            a.mo919c();
        }
    }

    public final void onPlayFromMediaId(String str, Bundle bundle) {
        C0286ac a = m975a();
        if (a != null) {
            MediaSessionCompat.m652b(bundle);
            this.f1048a.mo1068jY(str, bundle);
            a.mo919c();
        }
    }

    public final void onPlayFromSearch(String str, Bundle bundle) {
        C0286ac a = m975a();
        if (a != null) {
            MediaSessionCompat.m652b(bundle);
            this.f1048a.mo1069jZ(str, bundle);
            a.mo919c();
        }
    }

    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        C0286ac a = m975a();
        if (a != null) {
            MediaSessionCompat.m652b(bundle);
            this.f1048a.mo1070ka(uri, bundle);
            a.mo919c();
        }
    }

    public final void onPrepare() {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1071kb();
            a.mo919c();
        }
    }

    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        C0286ac a = m975a();
        if (a != null) {
            MediaSessionCompat.m652b(bundle);
            this.f1048a.mo1072kc(str, bundle);
            a.mo919c();
        }
    }

    public final void onPrepareFromSearch(String str, Bundle bundle) {
        C0286ac a = m975a();
        if (a != null) {
            MediaSessionCompat.m652b(bundle);
            this.f1048a.mo1073kd(str, bundle);
            a.mo919c();
        }
    }

    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        C0286ac a = m975a();
        if (a != null) {
            MediaSessionCompat.m652b(bundle);
            this.f1048a.mo1074ke(uri, bundle);
            a.mo919c();
        }
    }

    public final void onRewind() {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1075kf();
            a.mo919c();
        }
    }

    public final void onSeekTo(long j) {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1076kg(j);
            a.mo919c();
        }
    }

    public final void onSetPlaybackSpeed(float f) {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1077kh(f);
            a.mo919c();
        }
    }

    public final void onSetRating(Rating rating) {
        RatingCompat ratingCompat;
        C0286ac a = m975a();
        if (a != null) {
            if (rating != null) {
                int c = C0331z.m1022c(rating);
                if (C0331z.m1029j(rating)) {
                    switch (c) {
                        case 1:
                            ratingCompat = RatingCompat.m607c(C0331z.m1028i(rating));
                            break;
                        case 2:
                            ratingCompat = RatingCompat.m610f(C0331z.m1030k(rating));
                            break;
                        case 3:
                        case 4:
                        case 5:
                            ratingCompat = RatingCompat.m609e(c, C0331z.m1021b(rating));
                            break;
                        case 6:
                            ratingCompat = RatingCompat.m608d(C0331z.m1020a(rating));
                            break;
                    }
                } else {
                    ratingCompat = RatingCompat.m611g(c);
                }
                ratingCompat.f949b = rating;
            }
            a.mo919c();
        }
    }

    public final void onSkipToNext() {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1080kk();
            a.mo919c();
        }
    }

    public final void onSkipToPrevious() {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1081kl();
            a.mo919c();
        }
    }

    public final void onSkipToQueueItem(long j) {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1082km(j);
            a.mo919c();
        }
    }

    public final void onStop() {
        C0286ac a = m975a();
        if (a != null) {
            this.f1048a.mo1083kn();
            a.mo919c();
        }
    }
}
