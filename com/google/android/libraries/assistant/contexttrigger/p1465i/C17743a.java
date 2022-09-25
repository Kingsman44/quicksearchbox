package com.google.android.libraries.assistant.contexttrigger.p1465i;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.i.a */
/* compiled from: PG */
public final /* synthetic */ class C17743a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C17743a f50966a = new C17743a();

    private /* synthetic */ C17743a() {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        PlaybackState playbackState = ((MediaController) obj).getPlaybackState();
        return playbackState != null && !C17746d.f50969a.contains(Integer.valueOf(playbackState.getState()));
    }
}
