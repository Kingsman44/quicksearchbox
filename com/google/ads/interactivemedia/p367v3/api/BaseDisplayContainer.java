package com.google.ads.interactivemedia.p367v3.api;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.api.BaseDisplayContainer */
/* compiled from: PG */
public interface BaseDisplayContainer {
    void claim();

    @Deprecated
    void destroy();

    ViewGroup getAdContainer();

    Collection getCompanionSlots();

    void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction);

    @Deprecated
    void registerVideoControlsOverlay(View view);

    @Deprecated
    void setAdContainer(ViewGroup viewGroup);

    void setCompanionSlots(Collection collection);

    void unregisterAllFriendlyObstructions();

    @Deprecated
    void unregisterAllVideoControlsOverlays();
}
