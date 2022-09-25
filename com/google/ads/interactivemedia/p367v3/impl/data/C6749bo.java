package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p367v3.internal.aps;

@aps(mo15153a = C6721an.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bo */
/* compiled from: PG */
public abstract class C6749bo {
    private static final String DEFAULT_TIME_UNIT = "ms";

    public static C6749bo create(VideoProgressUpdate videoProgressUpdate) {
        return new C6721an(videoProgressUpdate.getCurrentTimeMs(), videoProgressUpdate.getDurationMs(), DEFAULT_TIME_UNIT);
    }

    public abstract long currentTime();

    public abstract long duration();

    public abstract String timeUnit();
}
