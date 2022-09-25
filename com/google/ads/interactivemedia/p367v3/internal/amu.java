package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.CompanionAdSlot;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amu */
/* compiled from: PG */
final class amu implements agp {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ agj mo14740a(Object obj) {
        CompanionAdSlot companionAdSlot = (CompanionAdSlot) obj;
        int width = companionAdSlot.getWidth();
        int height = companionAdSlot.getHeight();
        StringBuilder sb = new StringBuilder(23);
        sb.append(width);
        sb.append("x");
        sb.append(height);
        return new ago(sb.toString());
    }
}
