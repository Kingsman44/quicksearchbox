package com.google.android.libraries.search.integrations.glide;

import android.content.Context;
import com.bumptech.glide.C5557f;
import com.bumptech.glide.C5635k;
import com.bumptech.glide.load.p293a.p295b.C5694j;
import com.bumptech.glide.load.p293a.p295b.C5697m;
import com.bumptech.glide.load.p293a.p295b.C5699o;
import com.bumptech.glide.load.p299c.p300a.C5876y;
import com.bumptech.glide.p285d.C5544a;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p291h.C5630q;

/* compiled from: PG */
public class GlideModule$1 extends C5544a {

    /* renamed from: a */
    final /* synthetic */ long f101890a;

    /* renamed from: b */
    final /* synthetic */ boolean f101891b;

    /* renamed from: c */
    final /* synthetic */ boolean f101892c;

    /* renamed from: d */
    final /* synthetic */ double f101893d;

    public GlideModule$1(long j, boolean z, boolean z2, double d) {
        this.f101890a = j;
        this.f101891b = z;
        this.f101892c = z2;
        this.f101893d = d;
    }

    /* renamed from: c */
    public final void mo11836c(Context context, C5635k kVar) {
        long j = this.f101890a;
        if (j != 0) {
            kVar.f16990n = new C5694j(context, "image_manager_disk_cache", j);
        }
        boolean z = true;
        if (this.f101891b) {
            kVar.f16985i = new C5557f((C5593j) new C5593j().mo11966S(C5876y.f17480d, true));
        }
        if (this.f101892c) {
            C5697m mVar = new C5697m(context);
            float f = (float) this.f101893d;
            if (f < 0.0f || f > 1.0f) {
                z = false;
            }
            C5630q.m14604a(z, "Size multiplier must be between 0 and 1");
            mVar.f17168d = f;
            kVar.f16984h = new C5699o(mVar);
        }
    }
}
