package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;

/* renamed from: com.google.android.gms.cast.framework.media.j */
/* compiled from: PG */
public final class C143523j {
    public C143523j() {
        new C143507i();
    }

    @Deprecated
    /* renamed from: a */
    public static final WebImage m233073a(MediaMetadata mediaMetadata) {
        if (!mediaMetadata.mo118418e()) {
            return null;
        }
        return (WebImage) mediaMetadata.f388672b.get(0);
    }
}
