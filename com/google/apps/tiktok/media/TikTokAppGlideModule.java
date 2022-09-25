package com.google.apps.tiktok.media;

import android.content.Context;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C5635k;
import com.bumptech.glide.C6003v;
import com.bumptech.glide.p285d.C5544a;
import com.bumptech.glide.p285d.C5545b;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import java.util.Set;

/* compiled from: PG */
public final class TikTokAppGlideModule extends C5544a {

    /* renamed from: com.google.apps.tiktok.media.TikTokAppGlideModule$a */
    /* compiled from: PG */
    public interface C47442a {
        /* renamed from: dB */
        C58833ax mo51271dB();

        /* renamed from: eF */
        Set mo51272eF();
    }

    /* renamed from: c */
    public final void mo11836c(Context context, C5635k kVar) {
        C58833ax dB = ((C47442a) C47266f.m84076a(context, C47442a.class)).mo51271dB();
        if (dB.mo56113h()) {
            ((C5544a) dB.mo56107c()).mo11836c(context, kVar);
        }
    }

    /* renamed from: d */
    public final void mo11837d(Context context, C5543d dVar, C6003v vVar) {
        C58833ax dB = ((C47442a) C47266f.m84076a(context, C47442a.class)).mo51271dB();
        if (dB.mo56113h()) {
            ((C5544a) dB.mo56107c()).mo11837d(context, dVar, vVar);
        }
        for (C5545b d : ((C47442a) C47266f.m84076a(context, C47442a.class)).mo51272eF()) {
            d.mo11837d(context, dVar, vVar);
        }
    }
}
