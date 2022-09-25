package com.google.android.gms.cast.framework;

import android.os.IBinder;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.C143467a;
import com.google.android.gms.cast.framework.media.C143541y;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.common.base.C58833ax;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.f */
/* compiled from: PG */
public final class C143430f {
    /* renamed from: a */
    public static final CastOptions m232802a(String str, List list, boolean z, LaunchOptions launchOptions, C58833ax axVar, List list2) {
        CastMediaOptions castMediaOptions;
        if (axVar != null) {
            castMediaOptions = (CastMediaOptions) axVar.mo56111f();
        } else {
            castMediaOptions = C143467a.m232924a(new NotificationOptions(NotificationOptions.f389043a, NotificationOptions.f389044b, 10000, (String) null, C143541y.m233104a("smallIconDrawableResId"), C143541y.m233104a("stopLiveStreamDrawableResId"), C143541y.m233104a("pauseDrawableResId"), C143541y.m233104a("playDrawableResId"), C143541y.m233104a("skipNextDrawableResId"), C143541y.m233104a("skipPrevDrawableResId"), C143541y.m233104a("forwardDrawableResId"), C143541y.m233104a("forward10DrawableResId"), C143541y.m233104a("forward30DrawableResId"), C143541y.m233104a("rewindDrawableResId"), C143541y.m233104a("rewind10DrawableResId"), C143541y.m233104a("rewind30DrawableResId"), C143541y.m233104a("disconnectDrawableResId"), C143541y.m233104a("notificationImageSizeDimenResId"), C143541y.m233104a("castingToDeviceStringResId"), C143541y.m233104a("stopLiveStreamStringResId"), C143541y.m233104a("pauseStringResId"), C143541y.m233104a("playStringResId"), C143541y.m233104a("skipNextStringResId"), C143541y.m233104a("skipPrevStringResId"), C143541y.m233104a("forwardStringResId"), C143541y.m233104a("forward10StringResId"), C143541y.m233104a("forward30StringResId"), C143541y.m233104a("rewindStringResId"), C143541y.m233104a("rewind10StringResId"), C143541y.m233104a("rewind30StringResId"), C143541y.m233104a("disconnectStringResId"), (IBinder) null, false, false), true);
        }
        return new CastOptions(str, list, z, launchOptions, false, castMediaOptions, false, 0.05000000074505806d, false, false, false, list2, true, 0);
    }
}
