package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.p367v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p367v3.impl.data.CompanionData;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amt */
/* compiled from: PG */
public final class amt extends ImageView implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CompanionData f20992a;

    /* renamed from: b */
    private final float f20993b = getResources().getDisplayMetrics().density;

    /* renamed from: c */
    private final ane f20994c;

    /* renamed from: d */
    private final String f20995d;

    /* renamed from: e */
    private final List f20996e;

    /* renamed from: f */
    private final ams f20997f;

    public amt(Context context, ane ane, CompanionData companionData, String str, List list) {
        super(context);
        ams ams;
        this.f20994c = ane;
        this.f20992a = companionData;
        this.f20995d = str;
        this.f20996e = list;
        String size = companionData.size();
        if (size == null) {
            ams = null;
        } else {
            String[] split = size.split("x", -1);
            if (split.length != 2) {
                ams = new ams(0, 0);
            } else {
                ams = new ams(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            }
        }
        this.f20997f = ams;
        setOnClickListener(this);
    }

    /* renamed from: c */
    static /* synthetic */ void m19009c(amt amt) {
        ane ane = amt.f20994c;
        String companionId = amt.f20992a.companionId();
        String str = amt.f20995d;
        if (!aqd.m19274b(companionId) && !aqd.m19274b(str)) {
            HashMap g = asn.m19520g(1);
            g.put("companionId", companionId);
            ane.mo15008n(new amx(amv.displayContainer, amw.companionView, str, g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bitmap mo14979a(String str) {
        Bitmap decodeStream = BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        return (this.f20997f.f20990a == decodeStream.getWidth() && this.f20997f.f20991b == decodeStream.getHeight() && !asr.m19541a((double) this.f20993b)) ? Bitmap.createScaledBitmap(decodeStream, (int) (this.f20993b * ((float) decodeStream.getWidth())), (int) (this.f20993b * ((float) decodeStream.getHeight())), true) : decodeStream;
    }

    public final void onClick(View view) {
        for (CompanionAdSlot.ClickListener onCompanionAdClick : this.f20996e) {
            onCompanionAdClick.onCompanionAdClick();
        }
        this.f20994c.mo15009o(this.f20992a.clickThroughUrl());
    }
}
