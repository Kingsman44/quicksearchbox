package org.chromium.components.media_router.caf;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.C143404al;
import com.google.android.gms.cast.framework.C143430f;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.C143467a;
import com.google.android.gms.cast.framework.media.C143541y;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.common.base.C58833ax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class CastOptionsProvider implements C143404al {
    public List getAdditionalSessionProviders(Context context) {
        return null;
    }

    public CastOptions getCastOptions(Context context) {
        ArrayList arrayList = new ArrayList();
        LaunchOptions launchOptions = new LaunchOptions();
        ArrayList arrayList2 = new ArrayList();
        new NotificationOptions(NotificationOptions.f389043a, NotificationOptions.f389044b, 10000, (String) null, C143541y.m233104a("smallIconDrawableResId"), C143541y.m233104a("stopLiveStreamDrawableResId"), C143541y.m233104a("pauseDrawableResId"), C143541y.m233104a("playDrawableResId"), C143541y.m233104a("skipNextDrawableResId"), C143541y.m233104a("skipPrevDrawableResId"), C143541y.m233104a("forwardDrawableResId"), C143541y.m233104a("forward10DrawableResId"), C143541y.m233104a("forward30DrawableResId"), C143541y.m233104a("rewindDrawableResId"), C143541y.m233104a("rewind10DrawableResId"), C143541y.m233104a("rewind30DrawableResId"), C143541y.m233104a("disconnectDrawableResId"), C143541y.m233104a("notificationImageSizeDimenResId"), C143541y.m233104a("castingToDeviceStringResId"), C143541y.m233104a("stopLiveStreamStringResId"), C143541y.m233104a("pauseStringResId"), C143541y.m233104a("playStringResId"), C143541y.m233104a("skipNextStringResId"), C143541y.m233104a("skipPrevStringResId"), C143541y.m233104a("forwardStringResId"), C143541y.m233104a("forward10StringResId"), C143541y.m233104a("forward30StringResId"), C143541y.m233104a("rewindStringResId"), C143541y.m233104a("rewind10StringResId"), C143541y.m233104a("rewind30StringResId"), C143541y.m233104a("disconnectStringResId"), (IBinder) null, false, false);
        return C143430f.m232802a("3DFCDBD1", arrayList, false, launchOptions, C58833ax.m90833j(C143467a.m232924a((NotificationOptions) null, false)), arrayList2);
    }
}
