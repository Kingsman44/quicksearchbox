package com.google.ads.interactivemedia.p367v3.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p367v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.p367v3.impl.data.C6732ay;
import com.google.ads.interactivemedia.p367v3.impl.data.C6733az;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amg */
/* compiled from: PG */
public class amg implements BaseDisplayContainer {

    /* renamed from: g */
    private static int f20946g;

    /* renamed from: a */
    private ViewGroup f20947a;

    /* renamed from: b */
    private Collection f20948b = arn.m19402i();

    /* renamed from: c */
    private Map f20949c = null;

    /* renamed from: d */
    private final Set f20950d = new HashSet();

    /* renamed from: e */
    private amf f20951e = null;

    /* renamed from: f */
    private boolean f20952f = false;

    public amg(ViewGroup viewGroup) {
        this.f20947a = viewGroup;
    }

    /* renamed from: a */
    public final Map mo14956a() {
        return this.f20949c;
    }

    /* renamed from: b */
    public final Set mo14957b() {
        return new HashSet(this.f20950d);
    }

    /* renamed from: c */
    public final void mo14958c(amf amf) {
        this.f20951e = amf;
    }

    public final void claim() {
        aqd.m19277e(!this.f20952f, "A given DisplayContainer may only be used once");
        this.f20952f = true;
    }

    public final void destroy() {
        ViewGroup viewGroup = this.f20947a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    public final ViewGroup getAdContainer() {
        return this.f20947a;
    }

    public final Collection getCompanionSlots() {
        return this.f20948b;
    }

    public final void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction) {
        if (friendlyObstruction != null && !this.f20950d.contains(friendlyObstruction)) {
            this.f20950d.add(friendlyObstruction);
            amf amf = this.f20951e;
            if (amf != null) {
                ((anr) amf).mo15039g(friendlyObstruction);
            }
        }
    }

    public final void registerVideoControlsOverlay(View view) {
        if (view != null) {
            C6732ay builder = C6733az.builder();
            builder.view(view);
            builder.purpose(FriendlyObstructionPurpose.VIDEO_CONTROLS);
            C6733az build = builder.build();
            if (build != null && !this.f20950d.contains(build)) {
                this.f20950d.add(build);
                amf amf = this.f20951e;
                if (amf != null) {
                    ((anr) amf).mo15039g(build);
                }
            }
        }
    }

    public final void setAdContainer(ViewGroup viewGroup) {
        aqd.m19282j(viewGroup);
        this.f20947a = viewGroup;
    }

    public final void setCompanionSlots(Collection<CompanionAdSlot> collection) {
        if (collection == null) {
            collection = arn.m19402i();
        }
        arq arq = new arq();
        for (CompanionAdSlot companionAdSlot : collection) {
            if (companionAdSlot != null) {
                int i = f20946g;
                f20946g = i + 1;
                StringBuilder sb = new StringBuilder(20);
                sb.append("compSlot_");
                sb.append(i);
                arq.mo15311b(sb.toString(), companionAdSlot);
            }
        }
        this.f20949c = arq.mo15310a();
        this.f20948b = collection;
    }

    public final void unregisterAllFriendlyObstructions() {
        this.f20950d.clear();
        amf amf = this.f20951e;
        if (amf != null) {
            ((anr) amf).mo15040h();
        }
    }

    public final void unregisterAllVideoControlsOverlays() {
        this.f20950d.clear();
        amf amf = this.f20951e;
        if (amf != null) {
            ((anr) amf).mo15040h();
        }
    }
}
