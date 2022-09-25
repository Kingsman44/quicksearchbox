package com.google.android.apps.gsa.staticplugins.p7613bw;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaController;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.p4152bb.p4153a.C55160ib;
import com.google.p4152bb.p4153a.C55167ii;

/* renamed from: com.google.android.apps.gsa.staticplugins.bw.d */
/* compiled from: PG */
public final /* synthetic */ class C97307d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97308e f271743a;

    /* renamed from: b */
    public final /* synthetic */ C55160ib f271744b;

    /* renamed from: c */
    public final /* synthetic */ Intent f271745c;

    public /* synthetic */ C97307d(C97308e eVar, C55160ib ibVar, Intent intent) {
        this.f271743a = eVar;
        this.f271744b = ibVar;
        this.f271745c = intent;
    }

    public final void run() {
        C97308e eVar = this.f271743a;
        C55160ib ibVar = this.f271744b;
        Intent intent = this.f271745c;
        Rating rating = null;
        MediaController a = eVar.f271746a.f271751g.mo81722a((String) null, false, true);
        if (a == null) {
            ((C59052c) ((C59052c) C97309f.f271747a.mo56225c()).mo56372aa(20975)).mo56386p("Failed to perform command because got a null media controller.");
        } else if (a.getPlaybackState() == null) {
            ((C59052c) ((C59052c) C97309f.f271747a.mo56225c()).mo56372aa(20974)).mo56386p("Failed to perform command because got a null playback state.");
        } else {
            int ordinal = ibVar.ordinal();
            if (ordinal == 13) {
                int ratingType = a.getRatingType();
                if (ratingType != 0) {
                    int a2 = C55167ii.m87615a(intent.getIntExtra("MediaControlWorker.EXTRA_MEDIA_CONTROL_RATING_TYPE", -1));
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i = a2 - 1;
                    if (i == 1) {
                        rating = Rating.newUnratedRating(ratingType);
                    } else if (i != 2) {
                        if (i != 3) {
                            ((C59052c) ((C59052c) C97309f.f271747a.mo56226d()).mo56372aa(20966)).mo56386p("Unknown rating type (UNKNOWN_TYPE).");
                        } else if (ratingType == 2) {
                            rating = Rating.newThumbRating(false);
                        } else if (ratingType == 1) {
                            rating = Rating.newHeartRating(false);
                        } else {
                            ((C59052c) ((C59052c) C97309f.f271747a.mo56226d()).mo56372aa(20965)).mo56387q("Rating style %d does not support NEGATIVE rating type.", ratingType);
                        }
                    } else if (ratingType == 2) {
                        rating = Rating.newThumbRating(true);
                    } else if (ratingType == 1) {
                        rating = Rating.newHeartRating(true);
                    } else {
                        ((C59052c) ((C59052c) C97309f.f271747a.mo56226d()).mo56372aa(20964)).mo56387q("Rating style %d does not support POSITIVE rating type.", ratingType);
                    }
                    if (rating != null) {
                        a.getTransportControls().setRating(rating);
                    }
                }
            } else if (ordinal != 14) {
                switch (ordinal) {
                    case 1:
                        a.getTransportControls().skipToNext();
                        return;
                    case 2:
                        a.getTransportControls().seekTo(0);
                        a.getTransportControls().skipToPrevious();
                        return;
                    case 3:
                        a.getTransportControls().pause();
                        return;
                    case 4:
                        a.getTransportControls().play();
                        return;
                    case 5:
                        a.getTransportControls().rewind();
                        return;
                    case 6:
                        a.getTransportControls().pause();
                        a.getTransportControls().stop();
                        return;
                    case 7:
                        a.getTransportControls().fastForward();
                        return;
                    default:
                        return;
                }
            } else {
                int intExtra = intent.getIntExtra("MediaControlWorker.EXTRA_MEDIA_CONTROL_SEEK_DESTINATION", -1);
                if (intExtra >= 0) {
                    a.getTransportControls().seekTo((long) intExtra);
                }
            }
        }
    }
}
