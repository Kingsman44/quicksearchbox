package com.google.p3723ar.core;

import java.util.Collection;

/* renamed from: com.google.ar.core.Trackable */
/* compiled from: PG */
public interface Trackable {
    Anchor createAnchor(Pose pose);

    Collection getAnchors();

    TrackingState getTrackingState();
}
