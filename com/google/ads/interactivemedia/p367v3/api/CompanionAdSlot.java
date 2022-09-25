package com.google.ads.interactivemedia.p367v3.api;

import android.view.ViewGroup;

/* renamed from: com.google.ads.interactivemedia.v3.api.CompanionAdSlot */
/* compiled from: PG */
public interface CompanionAdSlot {

    /* renamed from: com.google.ads.interactivemedia.v3.api.CompanionAdSlot$ClickListener */
    /* compiled from: PG */
    public interface ClickListener {
        void onCompanionAdClick();
    }

    void addClickListener(ClickListener clickListener);

    ViewGroup getContainer();

    int getHeight();

    int getWidth();

    boolean isFilled();

    void removeClickListener(ClickListener clickListener);

    void setContainer(ViewGroup viewGroup);

    void setSize(int i, int i2);
}
