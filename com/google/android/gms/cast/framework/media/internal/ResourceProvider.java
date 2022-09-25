package com.google.android.gms.cast.framework.media.internal;

import com.google.android.googlequicksearchbox.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class ResourceProvider {

    /* renamed from: a */
    private static final Map f389138a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("smallIconDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_small_icon));
        hashMap.put("stopLiveStreamDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_stop_live_stream));
        hashMap.put("pauseDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_pause));
        hashMap.put("playDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_play));
        hashMap.put("skipNextDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_skip_next));
        hashMap.put("skipPrevDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_skip_prev));
        hashMap.put("forwardDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_forward));
        hashMap.put("forward10DrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_forward10));
        hashMap.put("forward30DrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_forward30));
        hashMap.put("rewindDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_rewind));
        hashMap.put("rewind10DrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_rewind10));
        hashMap.put("rewind30DrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_rewind30));
        hashMap.put("disconnectDrawableResId", Integer.valueOf(R.drawable.cast_ic_notification_disconnect));
        hashMap.put("notificationImageSizeDimenResId", Integer.valueOf(R.dimen.cast_notification_image_size));
        hashMap.put("castingToDeviceStringResId", Integer.valueOf(R.string.cast_casting_to_device));
        hashMap.put("stopLiveStreamStringResId", Integer.valueOf(R.string.cast_stop_live_stream));
        hashMap.put("pauseStringResId", Integer.valueOf(R.string.cast_pause));
        hashMap.put("playStringResId", Integer.valueOf(R.string.cast_play));
        hashMap.put("skipNextStringResId", Integer.valueOf(R.string.cast_skip_next));
        hashMap.put("skipPrevStringResId", Integer.valueOf(R.string.cast_skip_prev));
        hashMap.put("forwardStringResId", Integer.valueOf(R.string.cast_forward));
        hashMap.put("forward10StringResId", Integer.valueOf(R.string.cast_forward_10));
        hashMap.put("forward30StringResId", Integer.valueOf(R.string.cast_forward_30));
        hashMap.put("rewindStringResId", Integer.valueOf(R.string.cast_rewind));
        hashMap.put("rewind10StringResId", Integer.valueOf(R.string.cast_rewind_10));
        hashMap.put("rewind30StringResId", Integer.valueOf(R.string.cast_rewind_30));
        hashMap.put("disconnectStringResId", Integer.valueOf(R.string.cast_disconnect));
        f389138a = Collections.unmodifiableMap(hashMap);
    }

    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f389138a.get(str);
    }
}
