package com.google.android.gms.cast;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.gms.cast.ax */
/* compiled from: PG */
public final class C143366ax {
    /* renamed from: a */
    public static final void m232629a(MediaQueueItem mediaQueueItem) {
        if (mediaQueueItem.f388690a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (!Double.isNaN(mediaQueueItem.f388693d) && mediaQueueItem.f388693d < C59203do.f157270a) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(mediaQueueItem.f388694e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (Double.isNaN(mediaQueueItem.f388695f) || mediaQueueItem.f388695f < C59203do.f157270a) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }
}
