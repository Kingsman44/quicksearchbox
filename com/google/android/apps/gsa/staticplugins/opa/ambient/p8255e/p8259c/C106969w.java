package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.w */
/* compiled from: PG */
public final /* synthetic */ class C106969w implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106969w f297959a = new C106969w();

    private /* synthetic */ C106969w() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        MediaController mediaController = (MediaController) obj;
        boolean z = false;
        if (mediaController.getPlaybackState() != null) {
            PlaybackState playbackState = mediaController.getPlaybackState();
            playbackState.getClass();
            if (playbackState.getState() == 3 && mediaController.getPlaybackInfo() != null) {
                MediaController.PlaybackInfo playbackInfo = mediaController.getPlaybackInfo();
                playbackInfo.getClass();
                if (playbackInfo.getPlaybackType() == 1) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
