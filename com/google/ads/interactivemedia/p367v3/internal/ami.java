package com.google.ads.interactivemedia.p367v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.p367v3.api.CompanionAdSlot;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ami */
/* compiled from: PG */
public final class ami implements CompanionAdSlot {

    /* renamed from: a */
    private int f20967a;

    /* renamed from: b */
    private int f20968b;

    /* renamed from: c */
    private ViewGroup f20969c;

    /* renamed from: d */
    private String f20970d;

    /* renamed from: e */
    private final List f20971e = new ArrayList(1);

    /* renamed from: a */
    public final void mo14967a(String str) {
        this.f20970d = str;
    }

    public final void addClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.f20971e.add(clickListener);
    }

    /* renamed from: b */
    public final List mo14968b() {
        return this.f20971e;
    }

    public final ViewGroup getContainer() {
        return this.f20969c;
    }

    public final int getHeight() {
        return this.f20968b;
    }

    public final int getWidth() {
        return this.f20967a;
    }

    public final boolean isFilled() {
        return this.f20969c.findViewWithTag(this.f20970d) != null;
    }

    public final void removeClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.f20971e.remove(clickListener);
    }

    public final void setContainer(ViewGroup viewGroup) {
        this.f20969c = viewGroup;
    }

    public final void setSize(int i, int i2) {
        this.f20967a = i;
        this.f20968b = i2;
    }
}
